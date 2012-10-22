// ------------------------------------------------------------------------------
// -- Copyright RainCode
// -- All rights reserved
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

namespace XmlBooster
{
    public class XmlBRecoveryException : Exception
    {
        private String theMsg;

        public XmlBRecoveryException(String msg)
        {
            theMsg = msg;
        }

        public String getMsg()
        {
            return theMsg;
        }
    }
}