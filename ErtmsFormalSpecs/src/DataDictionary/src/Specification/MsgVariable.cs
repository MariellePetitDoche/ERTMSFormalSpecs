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
    public class MsgVariable : Generated.MsgVariable
    {

        /// <summary>
        /// The message variable content
        /// </summary>
        public string GetText(int depth)
        {
            string retVal = "";

            string tab = "";
            for (int i = 0; i < depth; i++)
            {
                tab += "    ";
            }

            retVal += tab + getName() + "  [" + getLength() + "]";
            if (getComment().Length != 0)
            {
                retVal += "  (" + getComment() + ")";
            }
            retVal += "\n";

            for (int i = 0; i < allMsgVariables().Count; i++)
            {
                MsgVariable msgVariable = getMsgVariables(i) as MsgVariable;
                retVal += tab + msgVariable.GetText(depth + 1);
            }

            return retVal;
        }
    }
}
