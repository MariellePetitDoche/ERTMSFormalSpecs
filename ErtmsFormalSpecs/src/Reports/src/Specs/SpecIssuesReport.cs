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
using DataDictionary;
using MigraDoc.DocumentObjectModel;

namespace Report.Specs
{
    public class SpecIssuesReport : ReportTools
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="document"></param>
        public SpecIssuesReport(Document document)
            : base(document)
        {
        }

        /// <summary>
        /// Creates an article with informations about all the paragraphs of the specification
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        public void CreateSpecIssuesArticle(SpecIssuesReportConfig aReportConfig)
        {
            AddSubParagraph("Specification issues report");
            AddParagraph("This report describes the specification " + aReportConfig.Dictionary.Specifications.SpecIssues.Count + " issues encountered during modeling. ");
            GenerateSpecIssues(aReportConfig.Dictionary);
            CloseSubParagraph();
        }

        /// <summary>
        /// Creates an article with informations about all the paragraphs of the specification
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        public void CreateDesignChoicesArticle(SpecIssuesReportConfig aReportConfig)
        {
            AddSubParagraph("Design choices report");
            AddParagraph("This report describes the " + aReportConfig.Dictionary.Specifications.SpecIssues.Count + " design choices made during modeling. ");
            GenerateDesignChoices(aReportConfig.Dictionary);
            CloseSubParagraph();
        }

        /// <summary>
        /// Creates a table for specification issues
        /// </summary>
        /// <param name="aDictionary">The model</param>
        /// <returns></returns>
        private void GenerateSpecIssues(Dictionary aDictionary)
        {
            AddSubParagraph("Specification issues");
            foreach (DataDictionary.Specification.Paragraph paragraph in aDictionary.Specifications.SpecIssues)
            {
                AddSubParagraph("Issue on " + paragraph.FullId);
                AddTable(new string[] { "Issue on " + paragraph.FullId }, new int[] { 30, 100 });
                AddRow("Description", paragraph.Text);
                AddRow("Comment", paragraph.Comment);
                CloseSubParagraph();
            }
            CloseSubParagraph();
        }

        /// <summary>
        /// Creates a table for design choices
        /// </summary>
        /// <param name="aDictionary">The model</param>
        /// <returns></returns>
        private void GenerateDesignChoices(Dictionary aDictionary)
        {
            AddSubParagraph("Design choices");
            foreach (DataDictionary.Specification.Paragraph paragraph in aDictionary.Specifications.DesignChoices)
            {
                AddSubParagraph("Design choice " + paragraph.FullId);
                AddTable(new string[] { "Design choice " + paragraph.FullId }, new int[] { 30, 100 });
                AddRow(paragraph.Text);
                CloseSubParagraph();
            }
            CloseSubParagraph();
        }
    }
}
