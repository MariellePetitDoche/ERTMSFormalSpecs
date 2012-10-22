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
    class XmlBPage
    {
        public const int SIZE = 1024 * 16;
        private byte[] theBuff;
        private int usedBytes;
        private bool theIsLast;

        public XmlBPage()
        {
            theBuff = new byte[SIZE];
        }
        //---------------------------------------
        public void read(Stream ins)
        {
            if (ins == null)
            {
                usedBytes = 0;
                theIsLast = true;
                return;
            }
            try
            {
                usedBytes = ins.Read(theBuff, 0, theBuff.Length);
                theIsLast = (usedBytes < SIZE);
            }
            catch (Exception e)
            {
                System.Console.WriteLine(e.StackTrace);
                System.Console.WriteLine("Unexpected exception");
                throw e; // exit(1);
            }
        }
        //---------------------------------------
        public string slice(int pos, int len)
        {
            System.Text.Decoder dec = System.Text.Encoding.Default.GetDecoder();
            char[] text = new char[len];
            dec.GetChars(theBuff, pos, len, text, 0);
            return new string(text);
        }
        //---------------------------------------
        public bool isLast()
        {
            return theIsLast;
        }
        //---------------------------------------
        public char charAt(int index)
        {
            return (char)theBuff[index];
        }
        //---------------------------------------
        public bool posOk(int pos)
        {
            return pos < usedBytes;
        }
    }
}