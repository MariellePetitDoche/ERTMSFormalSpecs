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
    public class Message : Generated.Message
    {

        /// <summary>
        /// The message content
        /// </summary>
        public string Text
        {
            get
            {
                string retVal = "";

                retVal = getDescription() + "\n";
                int msgDepth = 1;
                for (int i = 0; i < allMsgVariables().Count; i++)
                {
                    MsgVariable msgVariable = getMsgVariables(i) as MsgVariable;
                    retVal += msgVariable.GetText(msgDepth);
                }

                return retVal;
            }
        }

    }
}
