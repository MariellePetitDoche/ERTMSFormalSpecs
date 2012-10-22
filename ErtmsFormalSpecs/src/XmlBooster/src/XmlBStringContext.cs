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
using System.IO;

namespace XmlBooster
{
    public class XmlBStringContext : XmlBContext
    {
        private int ptr;
        private int buffLength;
        private char[] theBuff;

        public XmlBStringContext()
        {
        }

        public XmlBStringContext(string a)
        {
            setBuff(a);
        }

        public char[] getBuff()
        {
            return theBuff;
        }

        public string toString()
        {
            return slice(0, buffLength);
        }

        public override void reset()
        {
            setPtr(0);
        }

        public override void close()
        {
        }

        public override string slice(int pos, int len)
        {
            return new String(theBuff, pos, len);
        }

        public void setBuff(char[] b)
        {
            buffLength = b.Length;
            theBuff = new char[buffLength + 256];
            for (int i = 0; i < buffLength; i++)
                theBuff[i] = b[i];
            for (int i = 0; i < 256; i++)
                theBuff[buffLength + i] = (char)i;
            reset();
        }

        public void setBuff(string a)
        {
            setBuff(a.ToCharArray());
        }

        public void setBuff(byte[] b)
        {
            char[] a = new char[b.Length];

            for (int i = 0; i < b.Length; i++)
            {
                a[i] = (char)b[i];
            }
            setBuff(a);
        }

        public override bool posOk(int pos)
        {
            return pos < buffLength;
        }

        public override bool readFile(string fname)
        {
            FileStream f;
            byte[] aBuff;

            f = null;
            try
            {
                f = new FileStream(fname, FileMode.Open);
                aBuff = new byte[f.Length];
                f.Read(aBuff, 0, (int)f.Length);
                setBuff(aBuff);
                f.Close();
                return true;
            }
            catch (Exception)
            {
                theBuff = null;
                if (f != null)
                {
                    try
                    {
                        f.Close();
                    }
                    catch (Exception)
                    {
                        ;
                    }
                }
                return false;
            }
        }

        public override char charAt(int pos)
        {
            return theBuff[pos];
        }

        public override char current()
        {
            return theBuff[ptr];
        }

        public override void advanceUnSafe()
        {
            ptr++;
        }

        public override void moveBack(int step)
        {
            ptr -= step;
        }

        public override void skipTill(char ch)
        //   throws XmlBException
        {
            while (theBuff[ptr] != ch)
                ptr++;
            checkEof();
        }

        public override bool lookAhead2(char ch1, char ch2)
        {
            if (theBuff[ptr] == ch1)
                if (theBuff[ptr + 1] == ch2)
                {
                    ptr += 2;
                    return true;
                }
            return false;
        }

        public override bool lookAhead3(char ch1, char ch2, char ch3)
        {
            int locptr = ptr;
            if (theBuff[locptr] == ch1)
                if (theBuff[locptr + 1] == ch2)
                    if (theBuff[locptr + 2] == ch3)
                    {
                        ptr += 3;
                        return true;
                    }
            return false;
        }

        public override bool lookAheadString(string str)
        {
            int saved = ptr;
            int locptr = ptr;
            for (int i = 0; i < str.Length; i++)
            {
                if (theBuff[locptr] != str[i])
                {
                    return false;
                }
                locptr++;
            }
            ptr = locptr;
            return true;
        }

        public override void setPtr(int nptr)
        {
            ptr = nptr;
        }

        public override int getPtr()
        {
            return ptr;
        }

    }
}
