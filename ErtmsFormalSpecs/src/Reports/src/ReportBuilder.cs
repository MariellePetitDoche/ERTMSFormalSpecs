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
using System.Collections.Generic;
using DataDictionary.Tests;
using MigraDoc.DocumentObjectModel;
using MigraDoc.Rendering;
using PdfSharp.Pdf;
using Report.Model;
using Report.Specs;
using Report.Tests;

namespace Report
{
    public class ReportBuilder
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);
        /// <summary>
        /// The system for which this report is built
        /// </summary>
        public DataDictionary.EFSSystem EFSSystem { get; private set; }
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        public ReportBuilder(DataDictionary.EFSSystem efsSystem)
        {
            EFSSystem = efsSystem;
        }

        /// <summary>
        /// Creates a report on tests coverage, according to user's choices
        /// specified in the report config
        /// </summary>
        /// <param name="efsSystem">The system for which the report is created</param>
        /// <param name="aReportConfig">Report config containing user's choices</param>
        /// <returns></returns>
        public bool BuildTestsReport(TestsCoverageReportConfig aReportConfig)
        {
            Document document = new Document();
            document.Info.Title = "EFS Test report";
            document.Info.Author = "ERTMS Solutions";
            document.Info.Subject = "Test report";

            TestsCoverageReport report = new TestsCoverageReport(document);
            report.CreateRequirementCoverageArticle(aReportConfig);
            HashSet<DataDictionary.Rules.RuleCondition> activatedRules = new HashSet<DataDictionary.Rules.RuleCondition>();
            if (aReportConfig.Dictionary != null) /* We generate a full report */
            {
                foreach (Frame frame in aReportConfig.Dictionary.Tests)
                {
                    report.CreateFrameArticle(frame, aReportConfig, activatedRules);
                }
            }
            else if (aReportConfig.Frame != null) /* We generate a report for a selected frame */
            {
                aReportConfig.Dictionary = aReportConfig.Frame.Dictionary;
                report.CreateFrameArticle(aReportConfig.Frame, aReportConfig, activatedRules);
            }
            else if (aReportConfig.SubSequence != null) /* We generate a report of a selected sub sequence */
            {
                aReportConfig.Dictionary = aReportConfig.SubSequence.Dictionary;
                report.CreateSubSequenceSection(aReportConfig.SubSequence, aReportConfig, activatedRules, true);
            }
            else if (aReportConfig.TestCase != null) /* We generate a report for a selected test case */
            {
                EFSSystem.Runner = new DataDictionary.Tests.Runner.Runner(aReportConfig.TestCase.SubSequence);
                aReportConfig.Dictionary = aReportConfig.TestCase.Dictionary;
                report.CreateTestCaseSection(EFSSystem.Runner, aReportConfig.TestCase, aReportConfig, activatedRules, true);
            }

            return GenerateOutputFile(document, aReportConfig);
        }

        /// <summary>
        /// Creates a report on specs coverage, according to user's choices
        /// specified in the report config
        /// </summary>
        /// <param name="aReportConfig">Report config containing user's choices</param>
        /// <returns></returns>
        public bool BuildSpecsReport(SpecCoverageReportConfig aReportConfig)
        {
            Document document = new Document();
            document.Info.Title = "EFS Specification report";
            document.Info.Author = "ERTMS Solutions";
            document.Info.Subject = "Specification report";

            SpecCoverageReport report = new SpecCoverageReport(document);
            if (aReportConfig.AddSpecification)
            {
                report.CreateSpecificationArticle(aReportConfig);
            }
            if (aReportConfig.AddCoveredParagraphs)
            {
                report.CreateCoveredRequirementsArticle(aReportConfig);
            }
            if (aReportConfig.AddNonCoveredParagraphs)
            {
                report.CreateNonCoveredRequirementsArticle(aReportConfig);
            }
            if (aReportConfig.AddReqRelated)
            {
                report.CreateReqRelatedArticle(aReportConfig);
            }

            return GenerateOutputFile(document, aReportConfig);
        }


        /// <summary>
        /// Creates a report on specs issues, according to user's choices
        /// specified in the report config
        /// </summary>
        /// <param name="aReportConfig">Report config containing user's choices</param>
        /// <returns></returns>
        public bool BuildSpecIssuesReport(SpecIssuesReportConfig aReportConfig)
        {
            Document document = new Document();
            document.Info.Title = "EFS Specification issues report";
            document.Info.Author = "ERTMS Solutions";
            document.Info.Subject = "Specification issues report";

            SpecIssuesReport report = new SpecIssuesReport(document);
            if (aReportConfig.AddSpecIssues)
            {
                report.CreateSpecIssuesArticle(aReportConfig);
            }
            if (aReportConfig.AddDesignChoices)
            {
                report.CreateDesignChoicesArticle(aReportConfig);
            }

            return GenerateOutputFile(document, aReportConfig);
        }

        /// <summary>
        /// Creates a report on the model, according to user's choices
        /// specified in the report config
        /// </summary>
        /// <param name="aReportConfig">Report config containing user's choices</param>
        /// <returns></returns>
        public bool BuildModelReport(ModelReportConfig aReportConfig)
        {
            Document document = new Document();
            document.Info.Title = "EFS Model report";
            document.Info.Author = "ERTMS Solutions";
            document.Info.Subject = "Model report";

            ModelReport report = new ModelReport(document);
            foreach (DataDictionary.Types.NameSpace nameSpace in aReportConfig.Dictionary.NameSpaces)
            {
                CreateNamespaceSection(report, nameSpace, aReportConfig);
            }

            return GenerateOutputFile(document, aReportConfig);
        }

        public void CreateNamespaceSection(ModelReport report, DataDictionary.Types.NameSpace aNameSpace, ModelReportConfig aReportConfig)
        {
            if (!aNameSpace.FullName.StartsWith("Messages"))
            {
                report.AddSubParagraph("Namespace " + aNameSpace.FullName);

                if (aReportConfig.AddRanges)
                {
                    report.CreateRangesSection(aNameSpace, aReportConfig.AddRangesDetails);
                }
                if (aReportConfig.AddEnumerations)
                {
                    report.CreateEnumerationsSection(aNameSpace, aReportConfig.AddEnumerationsDetails);
                }
                if (aReportConfig.AddStructures)
                {
                    report.CreateStructuresSection(aNameSpace, aReportConfig.AddStructuresDetails);
                }
                if (aReportConfig.AddCollections)
                {
                    report.CreateCollectionsSection(aNameSpace, aReportConfig.AddCollectionsDetails);
                }
                if (aReportConfig.AddFunctions)
                {
                    report.CreateFunctionsSection(aNameSpace, aReportConfig.AddFunctionsDetails);
                }
                if (aReportConfig.AddProcedures)
                {
                    report.CreateProceduresSection(aNameSpace, aReportConfig.AddProceduresDetails);
                }
                if (aReportConfig.AddVariables)
                {
                    report.CreateVariablesSection(aNameSpace, aReportConfig.AddVariablesDetails);
                }
                if (aReportConfig.AddRules)
                {
                    report.CreateRulesSection(aNameSpace, aReportConfig.AddRulesDetails);
                }
                report.CloseSubParagraph();

                foreach (DataDictionary.Types.NameSpace nameSpace in aNameSpace.SubNameSpaces)
                {
                    CreateNamespaceSection(report, nameSpace, aReportConfig);
                }
            }
        }

        /// <summary>
        /// Produces the .pdf corresponding to the book, according to user's choices
        /// specified in the report config
        /// </summary>
        /// <param name="aBook">The book to be created</param>
        /// <param name="aReportConfig">The report config with user's choices</param>
        /// <returns></returns>
        private bool GenerateOutputFile(Document document, ReportConfig aReportConfig)
        {
            PdfDocumentRenderer pdfRenderer = new PdfDocumentRenderer(false, PdfFontEmbedding.Always);
            pdfRenderer.Document = document;
            pdfRenderer.RenderDocument();
            pdfRenderer.PdfDocument.Save(aReportConfig.FileName);
            return true;
        }
    }
}
