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
    public class Values : Generated.Values
    {
        /// <summary>
        /// The Values content
        /// </summary>
        public string GetText(int depth)
        {
            string tab = "";
            for (int i = 0; i < depth; i++)
            {
                tab += "    ";
            }
            string retVal = tab += "Values:\n";
            if (getResolution_formula_1() != null)
            {
                ResolutionFormula resForm = getResolution_formula_1() as ResolutionFormula;
                retVal += resForm.GetText(depth + 1);
            }
            if (getSpecial_or_reserved_value() != null)
            {
                SpecialOrReservedValue value = getSpecial_or_reserved_value() as SpecialOrReservedValue;
                retVal += value.GetText(depth + 1);
            }
            if (getSpecial_or_reserved_values() != null)
            {
                SpecialOrReservedValues values = getSpecial_or_reserved_values() as SpecialOrReservedValues;
                retVal += values.GetText(depth + 1);
            }
            return retVal;
        }
    }
}
