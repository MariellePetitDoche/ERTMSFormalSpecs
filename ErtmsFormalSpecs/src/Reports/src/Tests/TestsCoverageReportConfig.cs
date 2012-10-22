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
using DataDictionary.Tests;

namespace Report.Tests
{
    public class TestsCoverageReportConfig : ReportConfig
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="dictionary"></param>
        public TestsCoverageReportConfig(DataDictionary.Dictionary dictionary)
            : base(dictionary)
        {
            createFileName("DynamicTestCoverageReport");

            AddFrames = false;
            AddActivatedRulesInFrames = false;
            AddNonCoveredRulesInFrames = false;

            AddSubSequences = false;
            AddActivatedRulesInSubSequences = false;
            AddNonCoveredRulesInSubSequences = false;

            AddTestCases = false;
            AddActivatedRulesInTestCases = false;
            AddNonCoveredRulesInTestCases = false;

            AddSteps = false;
            AddActivatedRulesInSteps = false;
            AddNonCoveredRulesInSteps = false;

            AddLog = false;
        }

        public bool AddFrames { set; get; }
        public bool AddActivatedRulesInFrames { set; get; }
        public bool AddNonCoveredRulesInFrames { set; get; }
        public Frame Frame { set; get; } /* if Frame is defined, we execute all its sub sequences */

        public bool AddSubSequences { set; get; }
        public bool AddActivatedRulesInSubSequences { set; get; }
        public bool AddNonCoveredRulesInSubSequences { set; get; }
        public SubSequence SubSequence { set; get; } /* if SubSequence is defined, we execute all its test cases */

        public bool AddTestCases { set; get; }
        public bool AddActivatedRulesInTestCases { set; get; }
        public bool AddNonCoveredRulesInTestCases { set; get; }
        public TestCase TestCase { set; get; } /* if TestCase is defined, we execute all its steps */

        public bool AddSteps { set; get; }
        public bool AddActivatedRulesInSteps { set; get; }
        public bool AddNonCoveredRulesInSteps { set; get; }

        public bool AddLog { set; get; }
    }

}

