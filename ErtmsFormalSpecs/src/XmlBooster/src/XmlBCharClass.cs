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

    public class XmlBCharClass
    {
        bool[] table = null;
        public XmlBCharClass()
        {
            table = new bool[256];
            for (int i = 0; i < 256; i++) table[i] = false;
        }
        public void init(string initstring)
        {
            for (int j = 0; j < initstring.Length; j++) init(initstring[j]);
        }
        public void init(char initChar)
        {
            table[initChar] = true;
        }
        public bool accept(char ch)
        {
            return table[ch];
        }
        virtual public bool validate(string thestring)
        {
            for (int i = 0; i < thestring.Length; i++)
            {
                if (!accept(thestring[i]))
                {
                    return false;
                }
            }
            return true;
        }
    }
}