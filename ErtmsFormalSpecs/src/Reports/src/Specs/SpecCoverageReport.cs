// ------------------------------------------------------------------------------
// -- Copyright ERTMS Solutions
// -- Licensed under the EUPL V.1.1
// -- http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
// --
// -- This file is part of ERTMSFormalSpec software and documentation
// --
// --  ERTMSFormalSpec is free software: you can redistribute it and/or modify
// --  it under the terms of the EUPL General Public License, v.1.1
// --
// -- ERTMSFormalSpec is distributed in the hope that it will be useful,
// -- but WITHOUT ANY WARRANTY; without even the implied warranty of
// -- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
// --
// ------------------------------------------------------------------------------
using System;
using System.Collections.Generic;
using DataDictionary;
using DataDictionary.Rules;
using DataDictionary.Variables;

using MigraDoc.DocumentObjectModel;
using MigraDoc.DocumentObjectModel.Tables;

namespace Report.Specs
{
    public class SpecCoverageReport : ReportTools
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="document"></param>
        public SpecCoverageReport(Document document)
            : base(document)
        {
        }

        /// <summary>
        /// Creates an article with informations about all the paragraphs of the specification
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        public void CreateSpecificationArticle(SpecCoverageReportConfig aReportConfig)
        {
            AddSubParagraph("Specification coverage");
            GenerateStatistics(aReportConfig.Dictionary, true, false, true, true);

            if (aReportConfig.ShowFullSpecification)
            {
                AddSubParagraph("Coverage detail");
                CreateSpecificationTable(aReportConfig.Dictionary);
                CloseSubParagraph();
            }
            CloseSubParagraph();
        }

        /// <summary>
        /// Creates an article with informations about the covered requirements
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        public void CreateCoveredRequirementsArticle(SpecCoverageReportConfig aReportConfig)
        {
            AddSubParagraph("Covered requirements");
            GenerateStatistics(aReportConfig.Dictionary, true, false, true, false);

            HashSet<DataDictionary.Specification.Paragraph> coveredParagraphs = CoveredRequirements(aReportConfig.Dictionary, true);
            if (coveredParagraphs.Count > 0) /* If we have some covered paragraphs, we create a section with informations about it */
            {
                AddSubParagraph("Coverage detail");
                CreateImplementedParagraphsTable(coveredParagraphs, aReportConfig.Dictionary);
                CloseSubParagraph();
            }
            CloseSubParagraph();
        }


        /// <summary>
        /// Creates an article with informations about the non covered requirements
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        public void CreateNonCoveredRequirementsArticle(SpecCoverageReportConfig aReportConfig)
        {
            AddSubParagraph("Non covered requirements");
            GenerateStatistics(aReportConfig.Dictionary, false, true, true, false);

            HashSet<DataDictionary.Specification.Paragraph> nonCoveredParagraphs = CoveredRequirements(aReportConfig.Dictionary, false);
            if (nonCoveredParagraphs.Count > 0) /* If we have some non covered paragraphs, we create a section containing the list of these paragraphs */
            {
                foreach (DataDictionary.Specification.Paragraph paragraph in nonCoveredParagraphs)
                {
                    AddSubParagraph("Requirement " + paragraph.FullId);
                    AddTable(new string[] { "Requirement " + paragraph.FullId }, new int[] { 100 });
                    AddRow(paragraph.Text);
                    CloseSubParagraph();
                }
            }
            CloseSubParagraph();
        }

        /// <summary>
        /// Creates an article with informations about the implemented model elements
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        public void CreateReqRelatedArticle(SpecCoverageReportConfig aReportConfig)
        {
            AddSubParagraph("Model coverage");

            HashSet<ReqRelated> implementedReqRelated = aReportConfig.Dictionary.ImplementedReqRelated;
            HashSet<ReqRelated> implementedRules = new HashSet<ReqRelated>();
            HashSet<ReqRelated> implementedTypes = new HashSet<ReqRelated>();
            HashSet<ReqRelated> implementedVariables = new HashSet<ReqRelated>();

            ICollection<DataDictionary.Specification.Paragraph> applicableParagraphs = aReportConfig.Dictionary.Specifications.ApplicableParagraphs;
            HashSet<DataDictionary.Specification.Paragraph> modeledParagraphs = new HashSet<DataDictionary.Specification.Paragraph>();
            foreach (ReqRelated reqRelated in implementedReqRelated)
            {
                if (reqRelated is Rule)
                {
                    implementedRules.Add(reqRelated);
                }
                else if (reqRelated is DataDictionary.Types.Type)
                {
                    implementedTypes.Add(reqRelated);
                }
                else if (reqRelated is Variable)
                {
                    implementedVariables.Add(reqRelated);
                }
                modeledParagraphs.UnionWith(reqRelated.ModeledParagraphs);
            }
            double modeledPercentage = ((double)modeledParagraphs.Count / (double)applicableParagraphs.Count) * 100;

            AddTable(new string[] { "Statistics" }, new int[] { 70, 70 });
            AddRow("Number of implemented model elements", implementedReqRelated.Count.ToString());
            AddRow("Number of modeled paragraphs", String.Format("{0} of {1} ({2:0.##}%)", modeledParagraphs.Count, applicableParagraphs.Count, modeledPercentage));

            if (implementedRules.Count > 0)
            {
                /* This section will contain the list of implemented rules and possibly
                 * the list of paragraphs modeled by each rule */
                AddSubParagraph("Implemented rules");
                CreateReqRelatedTable("Implemented rules", implementedRules, aReportConfig.ShowAssociatedParagraphs);
                CloseSubParagraph();
            }
            if (implementedTypes.Count > 0)
            {
                /* This section will contain the list of implemented types and possibly
                 * the list of paragraphs modeled by each type */
                AddSubParagraph("Implemented types");
                CreateReqRelatedTable("Implemented types", implementedTypes, aReportConfig.ShowAssociatedParagraphs);
                CloseSubParagraph();
            }
            if (implementedVariables.Count > 0)
            {
                /* This section will contain the list of implemented variables and possibly
                 * the list of paragraphs modeled by each variable */
                AddSubParagraph("Implemented variables");
                CreateReqRelatedTable("Implemented variables", implementedVariables, aReportConfig.ShowAssociatedParagraphs);
                CloseSubParagraph();
            }
            CloseSubParagraph();
        }


        /// <summary>
        /// Generates a table with specification coverage statistics
        /// </summary>
        /// <param name="aDictionary">The model</param>
        /// <param name="coveredParagraphs">Number and percentage of covered paragraphs</param>
        /// <param name="nonCoveredParagraphs">Number and percentage of non covered paragraphs</param>
        /// <param name="applicableParagraphs">Number of applicable paragraphs</param>
        /// <param name="allParagraphs">Total number of paragraphs</param>
        /// <returns></returns>
        private void GenerateStatistics(Dictionary aDictionary, bool coveredParagraphs, bool nonCoveredParagraphs, bool applicableParagraphs, bool allParagraphs)
        {
            AddTable(new string[] { "Statistics" }, new int[] { 70, 70 });
            if (allParagraphs)
            {
                AddRow("Total number of paragraphs", aDictionary.Specifications.AllParagraphs.Count.ToString());
            }
            if (applicableParagraphs)
            {
                AddRow("Number of applicable paragraphs", aDictionary.Specifications.ApplicableParagraphs.Count.ToString());
            }

            double applicableParagraphsCount = aDictionary.Specifications.ApplicableParagraphs.Count;
            double coveredParagraphsCount = CoveredRequirements(aDictionary, true).Count;
            double coveredPercentage = (coveredParagraphsCount / applicableParagraphsCount) * 100;
            double nonCoveredParagraphsCount = applicableParagraphsCount - coveredParagraphsCount;
            double nonCoveredPercentage = 100 - coveredPercentage;

            if (coveredParagraphs)
            {
                AddRow("Number of covered requirements", String.Format("{0} ({1:0.##}%)", coveredParagraphsCount, coveredPercentage));
            }
            if (nonCoveredParagraphs)
            {
                AddRow("Number of non covered requirements", String.Format("{0} ({1:0.##}%)", nonCoveredParagraphsCount, nonCoveredPercentage));
            }
        }


        /// <summary>
        /// Provides the set of covered requirements by the model
        /// </summary>
        /// <param name="aDictionary">The model</param>
        /// <param name="covered">Indicates if we need compute covered or non covered requirements</param>
        /// <returns></returns>
        public static HashSet<DataDictionary.Specification.Paragraph> CoveredRequirements(Dictionary aDictionary, bool covered)
        {
            HashSet<DataDictionary.Specification.Paragraph> retVal = new HashSet<DataDictionary.Specification.Paragraph>();

            ICollection<DataDictionary.Specification.Paragraph> applicableParagraphs = aDictionary.Specifications.ApplicableParagraphs;
            Dictionary<DataDictionary.Specification.Paragraph, List<ReqRef>> paragraphsReqRefDictionary = aDictionary.ParagraphsReqRefs;
            foreach (DataDictionary.Specification.Paragraph paragraph in applicableParagraphs)
            {
                bool implemented = paragraph.getImplementationStatus() == DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aImplemented;
                if (implemented)
                {
                    if (paragraphsReqRefDictionary.ContainsKey(paragraph))
                    {
                        List<ReqRef> implementations = paragraphsReqRefDictionary[paragraph];
                        for (int i = 0; i < implementations.Count; i++)
                        {
                            // the implementation may be also a ReqRef
                            if (implementations[i].Enclosing is ReqRelated)
                            {
                                ReqRelated reqRelated = implementations[i].Enclosing as ReqRelated;
                                // Do not consider tests
                                if (Utils.EnclosingFinder<DataDictionary.Tests.Frame>.find(reqRelated) == null)
                                {
                                    implemented = implemented && reqRelated.ImplementationCompleted;
                                }
                            }
                        }
                    }
                }
                if (implemented == covered)
                {
                    retVal.Add(paragraph);
                }
            }
            return retVal;
        }


        /// <summary>
        /// Creates a table resuming all requirements of the specification
        /// </summary>
        /// <param name="aDictionary">The model</param>
        /// <returns></returns>
        private void CreateSpecificationTable(Dictionary aDictionary)
        {
            AddTable(new string[] { "Model information" }, new int[] { 40, 40, 30, 30 });
            AddTableHeader("Requirement", "Target", "Type", "Implementation status");
            foreach (DataDictionary.Specification.Paragraph paragraph in aDictionary.Specifications.AllParagraphs)
            {
                AddRow(paragraph.FullId, paragraph.getScope_AsString(), paragraph.getType_AsString(), paragraph.getImplementationStatus_AsString());
            }
        }


        /// <summary>
        /// Creates a table for a given set of paragraphs
        /// </summary>
        /// <param name="title">Title of the table</param>
        /// <param name="paragraphs">The paragraphs to display</param>
        /// <param name="showAssociatedImplementations">Indicates if we need to show the model elements implementing the paragraphs</param>
        /// <returns></returns>
        private void CreateImplementedParagraphsTable(HashSet<DataDictionary.Specification.Paragraph> paragraphs, Dictionary dictionary)
        {
            Dictionary<DataDictionary.Specification.Paragraph, List<ReqRef>> paragraphsReqRefDictionary = dictionary.ParagraphsReqRefs;
            foreach (DataDictionary.Specification.Paragraph paragraph in paragraphs)
            {
                Cell previousCell = null;

                if (paragraphsReqRefDictionary.ContainsKey(paragraph))
                {
                    AddSubParagraph("Requirement " + paragraph.FullId);
                    AddTable(new string[] { "Requirement " + paragraph.FullId }, new int[] { 40, 60, 40 });
                    AddRow(paragraph.Text);

                    foreach (ReqRef reqRef in paragraph.Implementations)
                    {
                        string fullName = null;
                        string comment = null;

                        ReqRelated reqRelated = reqRef.Enclosing as ReqRelated;
                        if (reqRelated != null)
                        {
                            fullName = reqRelated.FullName;
                            comment = reqRelated.Comment;
                        }
                        else
                        {
                            DataDictionary.Specification.Paragraph par = reqRef.Enclosing as DataDictionary.Specification.Paragraph;
                            if (par != null)
                            {
                                fullName = paragraph.FullName;
                                comment = paragraph.Comment;
                            }
                        }

                        if (fullName != null && comment != null)
                        {
                            if (previousCell == null)
                            {
                                AddRow("Associated implementation", fullName, comment);
                                previousCell = lastRow.Cells[0];
                            }
                            else
                            {
                                AddRow("", fullName, comment);
                                previousCell.MergeDown += 1;
                            }
                        }
                    }
                    CloseSubParagraph();
                }
            }
        }

        /// <summary>
        /// Creates a table with implemented req related in the dictionary
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        private void CreateReqRelatedTable(string title, HashSet<ReqRelated> elements, bool showAssociatedParagraphs)
        {
            foreach (ReqRelated reqRelated in elements)
            {
                AddSubParagraph(reqRelated.FullName);
                AddTable(new string[] { reqRelated.FullName }, new int[] { 40, 100 });
                if (showAssociatedParagraphs)
                {
                    Row firstRow = null;
                    foreach (DataDictionary.Specification.Paragraph paragraph in reqRelated.ModeledParagraphs)
                    {
                        if (firstRow == null)
                        {
                            AddRow("Associated paragraphs", paragraph.Name);
                            firstRow = lastRow;
                        }
                        else
                        {
                            AppendToRow(null, paragraph.Name);
                        }
                    }
                }
                CloseSubParagraph();
            }
        }
    }
}
