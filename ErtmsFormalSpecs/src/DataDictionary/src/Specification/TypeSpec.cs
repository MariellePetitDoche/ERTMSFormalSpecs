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
    public class TypeSpec : Generated.TypeSpec
    {
        /// <summary>
        /// The TypeSpec content
        /// </summary>
        public string Text
        {
            get
            {
                string retVal = "";
                if (getId() != null)
                {
                    retVal += "Id: " + getId() + "\n";
                }
                if (getShort_description() != null)
                {
                    retVal += "Short description: " + getShort_description() + "\n";
                }
                if (getDescription() != null)
                {
                    retVal += "Description:\n" + getDescription() + "\n";
                }
                retVal += "Length: " + getLength() + " bits\n";
                if (getMinimum_value() != null)
                {
                    retVal += "Minimum value: " + getMinimum_value() + "\n";
                }
                if (getMaximum_value() != null)
                {
                    retVal += "Maximum value: " + getMaximum_value() + "\n";
                }
                if (getResolution_formula() != null)
                {
                    retVal += "Resolution formula: " + getResolution_formula() + "\n";
                }
                if (getBl() != null)
                {
                    retVal += "Baseline: " + getBl() + "\n";
                }
                if (getChar_value() != null)
                {
                    retVal += "Char value: " + getChar_value() + "\n";
                }
                if (getValues() != null)
                {
                    Values values = getValues() as Values;
                    retVal += values.GetText(0);
                }
                return retVal;
            }
        }
    }
}
