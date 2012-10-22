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
using DataDictionary.Rules;
using DataDictionary.Tests;
using DataDictionary.Tests.Runner.Events;
using MigraDoc.DocumentObjectModel;

namespace Report.Tests
{
    public class TestsCoverageReport : ReportTools
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="document"></param>
        public TestsCoverageReport(Document document)
            : base(document)
        {
        }

        /// <summary>
        /// Creates an article with informations about all the paragraphs of the specification
        /// </summary>
        /// <param name="aReportConfig">The report config containing user's choices</param>
        /// <returns></returns>
        public void CreateRequirementCoverageArticle(TestsCoverageReportConfig aReportConfig)
        {
            AddSubParagraph("Test coverage");

            /* This section will contain the statistics on the modeled paragraphs in the dictionary:
             * - their number and percentage */
            GenerateStatistics(aReportConfig.Dictionary, true, false, true, true);
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
        private void GenerateStatistics(DataDictionary.Dictionary aDictionary, bool coveredParagraphs, bool nonCoveredParagraphs, bool applicableParagraphs, bool allParagraphs)
        {
            AddSubParagraph("Statistics");
            AddTable(new string[] { "", "Value" }, new int[] { 70, 70 });

            if (allParagraphs)
            {
                AddRow("Total number of paragraphs", aDictionary.Specifications.AllParagraphs.Count.ToString());
            }


            if (applicableParagraphs)
            {
                AddRow("Number of applicable paragraphs", aDictionary.Specifications.ApplicableParagraphs.Count.ToString());
            }

            double applicableParagraphsCount = aDictionary.Specifications.ApplicableParagraphs.Count;
            double coveredParagraphsCount = CoveredRequirements(aDictionary).Count;
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
            CloseSubParagraph();
        }


        /// <summary>
        /// Creates a table for the current element (a frame, a sub sequence or a test case)
        /// </summary>
        /// <param name="title">Title of the table</param>
        /// <param name="activatedRules">Set of activated rules by the current element</param>
        /// <param name="implementedRules">Set of implemented rules in the dictionary</param>
        /// <param name="addActivatedRules">Indicates if we have to display the set of activated rules</param>
        /// <param name="addNonCoveredRules">Indicates if we have to display the set of non covered rules</param>
        /// <returns></returns>
        private void CreateTable(String title, HashSet<RuleCondition> activatedRules, HashSet<Rule> implementedRules, bool addActivatedRules, bool addNonCoveredRules)
        {
            AddSubParagraph(title);
            AddTable(new string[] { "", "Statistics" }, new int[] { 40, 100 });

            double implementedPercentage = (double)((double)activatedRules.Count / (double)implementedRules.Count) * 100;

            AddRow("Number of activated rules", String.Format("{0} ({1:0.##}%)", activatedRules.Count.ToString(), implementedPercentage));

            if (addActivatedRules && activatedRules.Count > 0)
            {
                AddRow("Activated rules", null);
                foreach (RuleCondition ruleCondition in activatedRules)
                {
                    AppendToRow(null, ruleCondition.FullName);
                }
            }

            if (addNonCoveredRules)
            {
                HashSet<RuleCondition> nonCoveredRules = new HashSet<RuleCondition>();
                foreach (Rule rule in implementedRules)
                {
                    foreach (RuleCondition ruleCondition in rule.RuleConditions)
                    {
                        if (!activatedRules.Contains(ruleCondition))
                        {
                            nonCoveredRules.Add(ruleCondition);
                        }
                    }
                }

                AddRow("Non covered rules", null);
                foreach (RuleCondition ruleCondition in nonCoveredRules)
                {
                    AppendToRow(null, ruleCondition.FullName);
                }
            }
            CloseSubParagraph();
        }

        /// <summary>
        /// Creates an article for a given frame
        /// </summary>
        /// <param name="aFrame">Frame to be displayed</param>
        /// <param name="aReportConfig">The report configuration containing display details</param>
        /// <param name="activatedRules">The list that will contain the rules activated by this frame</param>
        /// <returns></returns>
        public void CreateFrameArticle(Frame aFrame, TestsCoverageReportConfig aReportConfig, HashSet<RuleCondition> activatedRules)
        {
            AddSubParagraph("Frame " + aFrame.Name);

            foreach (SubSequence subSequence in aFrame.SubSequences)
            {
                // SIDE EFFECT : 
                // each test case will calculate the list of rules it activate
                // and add them to activatedRules list
                CreateSubSequenceSection(subSequence, aReportConfig, activatedRules, aReportConfig.AddSubSequences);
            }

            // now we  can create the table with the current sub sequence statistics
            AddSubParagraph("Statistics");
            CreateTable(aFrame.Name,
                        activatedRules,
                        aReportConfig.Dictionary.ImplementedRules,
                        aReportConfig.AddActivatedRulesInFrames,
                        aReportConfig.AddNonCoveredRulesInFrames);
            CloseSubParagraph();
            CloseSubParagraph();
        }


        /// <summary>
        /// Creates a section for a given sub sequence
        /// </summary>
        /// <param name="aFrame">Frame to be displayed</param>
        /// <param name="aReportConfig">The report configuration containing display details</param>
        /// <param name="activatedRules">The list that will contain the rules activated by this sub sequence</param>
        /// <returns></returns>
        public void CreateSubSequenceSection(SubSequence aSubSequence, TestsCoverageReportConfig aReportConfig, HashSet<RuleCondition> activatedRules, bool createPdf)
        {
            AddSubParagraph("Sub sequence " + aSubSequence.Name);

            HashSet<RuleCondition> rules = new HashSet<RuleCondition>();
            aSubSequence.EFSSystem.Runner = new DataDictionary.Tests.Runner.Runner(aSubSequence);
            foreach (TestCase testCase in aSubSequence.TestCases)
            {
                // each test case will calculate the list of rules it activate
                // and add them to activatedRules list
                CreateTestCaseSection(aSubSequence.EFSSystem.Runner, testCase, aReportConfig, rules, createPdf && aReportConfig.AddTestCases);
            }

            // now we  can create the table with the current sub sequence statistics
            CreateTable(aSubSequence.Name,
                        rules,
                        aReportConfig.Dictionary.ImplementedRules,
                        aReportConfig.AddActivatedRulesInSubSequences,
                        aReportConfig.AddNonCoveredRulesInSubSequences);

            activatedRules.UnionWith(rules);
            CloseSubParagraph();
        }


        /// <summary>
        /// Creates a section for a given test case
        /// </summary>
        /// <param name="runner">The runner to be used to execute the tests</param>
        /// <param name="aFrame">Frame to be displayed</param>
        /// <param name="aReportConfig">The report configuration containing display details</param>
        /// <param name="activatedRuleConditions">The list that will contain the rules activated by this test case</param>
        /// <returns></returns>
        public void CreateTestCaseSection(DataDictionary.Tests.Runner.Runner runner, TestCase aTestCase, TestsCoverageReportConfig aReportConfig, HashSet<RuleCondition> activatedRuleConditions, bool createPdf)
        {
            AddSubParagraph("Test case " + aTestCase.Name);

            if (aTestCase.Requirements.Count > 0)
            {
                AddParagraph("This test case verifies the following requirements");
                foreach (DataDictionary.ReqRef reqRef in aTestCase.Requirements)
                {
                    string text = "Requirement " + reqRef.Name;
                    if (!Utils.Utils.isEmpty(reqRef.Comment))
                    {
                        text = text + " : " + reqRef.Comment;
                    }
                    AddListItem(text);
                }
            }

            runner.RunUntilStep(null);
            activatedRuleConditions.UnionWith(runner.EventTimeLine.GetActivatedRules());

            string title = "Test case " + aTestCase.Name;
            CreateTable(title,
                        runner.EventTimeLine.GetActivatedRules(),
                        aReportConfig.Dictionary.ImplementedRules,
                        aReportConfig.AddActivatedRulesInTestCases,
                        aReportConfig.AddNonCoveredRulesInTestCases);

            if (createPdf && aReportConfig.AddSteps)
            {
                foreach (Step step in aTestCase.Steps)
                {
                    AddSubParagraph(String.Format("Step {0}", step.Name));

                    DataDictionary.Tests.SubStep firstSubStep = step.SubSteps[0] as DataDictionary.Tests.SubStep;
                    DataDictionary.Tests.SubStep lastSubStep = step.SubSteps[step.SubSteps.Count - 1] as DataDictionary.Tests.SubStep;
                    int start = runner.EventTimeLine.GetSubStepActivationTime(firstSubStep);
                    int end = runner.EventTimeLine.GetNextSubStepActivationTime(lastSubStep);
                    List<RuleCondition> activatedRules = runner.EventTimeLine.GetActivatedRulesInRange(start, end);

                    CreateStepTable(runner, step, aTestCase.Dictionary.ImplementedRules.Count, activatedRules, aReportConfig);
                    if (aReportConfig.AddLog)
                    {
                        List<DataDictionary.Tests.Runner.Events.ModelEvent> events = runner.EventTimeLine.GetEventsInRange((uint)start, (uint)end);
                        foreach (ModelEvent ev in events)
                        {
                            AddCode(ev.ToString());
                        }
                    }
                    CloseSubParagraph();
                }
            }
            CloseSubParagraph();
        }

        /// <summary>
        /// Creates a table for a given step of a test
        /// </summary>
        /// <param name="aStep">The step to be displayed</param>
        /// <param name="totalNumberOfRules">The total number of implemented rules in the dictionary</param>
        /// <param name="aReportConfig">The report config</param>
        /// <returns></returns>
        private void CreateStepTable(DataDictionary.Tests.Runner.Runner runner, Step aStep, int totalNumberOfRules, List<RuleCondition> activatedRules, TestsCoverageReportConfig aReportConfig)
        {
            AddParagraph(aStep.Name);

            AddTable(new string[] { "", "Statistics" }, new int[] { 40, 100 });

            double implementedPercentage = (double)((double)activatedRules.Count / (double)totalNumberOfRules) * 100;
            AddRow("Number of activated rules", String.Format("{0} ({1:0.##}%)", activatedRules.Count.ToString(), implementedPercentage));

            if (aReportConfig.AddActivatedRulesInSteps && activatedRules.Count > 0)
            {
                AddRow("Activated rules", null);
                foreach (RuleCondition ruleCondition in activatedRules)
                {
                    AppendToRow(null, ruleCondition.Name);
                }
            }
        }

        /// <summary>
        /// Provides the set of covered requirements by the tests
        /// </summary>
        /// <param name="aDictionary">The model</param>
        /// <returns></returns>
        public static HashSet<DataDictionary.Specification.Paragraph> CoveredRequirements(DataDictionary.Dictionary aDictionary)
        {
            HashSet<DataDictionary.Specification.Paragraph> retVal = new HashSet<DataDictionary.Specification.Paragraph>();
            ICollection<DataDictionary.Specification.Paragraph> applicableParagraphs = aDictionary.Specifications.ApplicableParagraphs;
            Dictionary<DataDictionary.Specification.Paragraph, List<DataDictionary.ReqRef>> paragraphsReqRefDictionary = aDictionary.ParagraphsReqRefs;

            foreach (DataDictionary.Specification.Paragraph paragraph in applicableParagraphs)
            {
                bool implemented = paragraph.getImplementationStatus() == DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aImplemented;
                bool tested = false;
                if (implemented)
                {
                    if (paragraphsReqRefDictionary.ContainsKey(paragraph))
                    {
                        List<DataDictionary.ReqRef> implementations = paragraphsReqRefDictionary[paragraph];
                        for (int i = 0; i < implementations.Count; i++)
                        {
                            DataDictionary.ReqRelated reqRelated = implementations[i].Enclosing as DataDictionary.ReqRelated;
                            if (reqRelated is TestCase && reqRelated.ImplementationCompleted == true)
                            {
                                tested = true;
                            }
                        }
                    }
                }

                if (implemented && tested)
                {
                    retVal.Add(paragraph);
                }
            }

            return retVal;
        }

    }
}
