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

namespace DataDictionary.Specification
{
    public class MatchRange : Generated.match_range
    {
        /// <summary>
        /// The MatchRange content
        /// </summary>
        public string GetText(int depth)
        {
            string tab = "";
            for (int i = 0; i < depth; i++)
            {
                tab += "    ";
            }
            string retVal = tab + "MatchRange: minimum: " + getMinimum() + ", maximum: " + getMaximum() + "\n";
            return retVal;
        }
    }
}
