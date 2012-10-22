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

namespace Report.Specs
{
    public class SpecIssuesReportConfig : ReportConfig
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="dictionary"></param>
        public SpecIssuesReportConfig(DataDictionary.Dictionary dictionary)
            : base(dictionary)
        {
            createFileName("SpecificationIssuesReport");
            AddSpecIssues = false;
            AddDesignChoices = false;
        }

        public bool AddSpecIssues { set; get; }
        public bool AddDesignChoices { set; get; }
    }
}

