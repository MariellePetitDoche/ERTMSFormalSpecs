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
namespace XmlBooster
{
    public class XmlBCharClassD : XmlBCharClass
    {
        public override bool validate(string thestring)
        {
            int i = 0;
            while ((i < thestring.Length) &&
            (thestring[i] >= '0') &&
            (thestring[i] <= '9'))
                i++;
            if ((i < 1) || (i == thestring.Length))
                return false;
            if (thestring[i] == ',') return true;
            return false;
        }
    }

}