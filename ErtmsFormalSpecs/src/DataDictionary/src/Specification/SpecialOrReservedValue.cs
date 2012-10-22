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
    public class SpecialOrReservedValue : Generated.special_or_reserved_value
    {
        /// <summary>
        /// The SpecialOrReservedValue content
        /// </summary>
        public string GetText(int depth)
        {
            string tab = "";
            for (int i = 0; i < depth; i++)
            {
                tab += "    ";
            }
            string retVal = tab + "SpecialOrReservedValue: \n";
            if (getMask() != null)
            {
                Mask mask = getMask() as Mask;
                retVal += mask.GetText(depth + 1);
            }
            if (getMatch() != null)
            {
                Match match = getMatch() as Match;
                retVal += match.GetText(depth + 1);
            }
            if (getMatch_range() != null)
            {
                MatchRange matchRange = getMatch_range() as MatchRange;
                retVal += matchRange.GetText(depth + 1);
            }
            if (getMeaning() != null)
            {
                Meaning meaning = getMeaning() as Meaning;
                retVal += meaning.GetText(depth + 1);
            }
            if (getValue() != null)
            {
                Value value = getValue() as Value;
                retVal += value.GetText(depth + 1);
            }
            return retVal;
        }
    }
}
