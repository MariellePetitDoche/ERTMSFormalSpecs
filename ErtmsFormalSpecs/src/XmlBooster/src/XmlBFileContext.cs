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
using System.Text;

namespace XmlBooster
{
    public class XmlBFileContext : XmlBContext
    {

        private int ptr;
        private int offset;
        private const int PAGE_SIZE = XmlBPage.SIZE;
        private System.IO.Stream input;
        private string theFileName;
        private XmlBPage[] page;

        override public void reset()
        {
            ptr = 0;
            if (theFileName != null && theFileName.Length > 0)
                readFile(theFileName);
            ptr = 0;
            offset = 0;
            base.reset();
        }

        override public string slice(int pos, int len)
        {
            int truePos;
            int pageNr;
            int pageOfs;
            int remains;
            StringBuilder buff;

            truePos = pos - offset;
            pageOfs = truePos % PAGE_SIZE;
            pageNr = truePos / PAGE_SIZE;
            if (pageOfs + len <= PAGE_SIZE)
                return page[pageNr].slice(pageOfs, len);
            buff = new StringBuilder();
            buff.Length = (0);
            while (len > 0)
            {
                remains = PAGE_SIZE - pageOfs;
                if (remains > len)
                    remains = len;
                buff.Append(page[pageNr].slice(pageOfs, remains));
                pageNr++;
                pageOfs = 0;
                len -= remains;
            }
            return buff.ToString();
        }

        override public bool readFile(string fname)
        {
            try
            {
                close();
                input = new FileStream(fname, FileMode.Open);
                if (page == null)
                    page = new XmlBPage[3];
                for (int i = 0; i < page.Length; i++)
                {
                    if (page[i] == null)
                        page[i] = new XmlBPage();
                    page[i].read(input);
                    if (page[i].isLast())
                        close();
                }
                theFileName = fname;
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }

        override public char charAt(int pos)
        {
            int truePos;
            int pageNr;
            char res;

            truePos = pos - offset;
            pageNr = truePos / PAGE_SIZE;
            //System.out.println ("char at:" + pos + ":" + truePos + ":" +
            //                     pageNr);
            res = page[pageNr].charAt(truePos % PAGE_SIZE);
            // System.out.println ("result is: " + res);
            return res;
        }

        override public char current()
        {
            return charAt(ptr);
        }

        override public void advanceUnSafe()
        {
            ptr++;
        }

        override public void moveBack(int step)
        {
            ptr -= step;
        }

        override public void close()
        {
            try
            {
                if (input != null)
                    input.Close();
            }
            catch (Exception)
            {
            }
            input = null;
        }

        override public void checkEof()
        //   throws XmlBException
        {
            int truePos;
            int pageNr;
            XmlBPage r;

            truePos = ptr - offset;
            pageNr = truePos / PAGE_SIZE;
            //      System.out.println ("pageNr: " + pageNr);
            if ((pageNr == page.Length - 1) &&
                 !page[pageNr].isLast())
            {
                // System.out.println ("Reading new page, when on " + pageNr + ":" +
                //                    offset);
                r = page[0];
                for (int i = 0; i < page.Length - 1; i++)
                    page[i] = page[i + 1];
                r.read(input);
                if (r.isLast())
                    close();
                page[page.Length - 1] = r;
                offset += PAGE_SIZE;
            }
            base.checkEof();
        }

        override public void skipTill(char ch)
        //   throws XmlBException
        {
            while (current() != ch)
                advance();
            checkEof();
        }

        override public bool lookAhead2(char ch1, char ch2)
        {
            if (charAt(ptr) == ch1)
                if (charAt(ptr + 1) == ch2)
                {
                    ptr += 2;
                    return true;
                }
            return false;
        }

        override public bool lookAhead3(char ch1, char ch2, char ch3)
        {
            if (charAt(ptr) == ch1)
                if (charAt(ptr + 1) == ch2)
                    if (charAt(ptr + 2) == ch3)
                    {
                        ptr += 3;
                        return true;
                    }
            return false;
        }

        override public bool lookAheadString(string str)
        {
            // int len = str.length();
            // string a = new string(theBuff, ptr, len);
            //
            // // System.out.println(a + ":" + str);
            // if (str.compareTo(a)==0)
            //   {
            //     ptr += len;
            //     return true;
            //   }
            // return false;
            int saved = ptr;
            for (int i = 0; i < str.Length; i++)
            {
                if (charAt(ptr) != str[i])
                {

                    ptr = saved;
                    return false;
                }
                ptr++;
            }
            return true;
        }

        override public void setPtr(int nptr)
        {
            ptr = nptr;
        }

        override public int getPtr()
        {
            return ptr;
        }

        override public bool posOk(int pos)
        {
            int truePos;
            int pageNr;

            truePos = pos - offset;
            pageNr = truePos / PAGE_SIZE;
            if (pageNr < page.Length)
            {
                if (page[pageNr] != null)
                {
                    return page[pageNr].posOk(truePos % PAGE_SIZE);
                }
            }
            return false;
        }

    }
}