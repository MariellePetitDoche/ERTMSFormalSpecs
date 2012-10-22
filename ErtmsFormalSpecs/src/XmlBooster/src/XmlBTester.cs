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
    /// <remarks>Used by XMLBooster-generated class
    /// to test the performance and the memory
    /// occupation for the generated parser.</remarks>
    public class XmlBTester
    {
        public XmlBTester()
        {
        }

        private void performTest(XmlBBaseAcceptor acceptor,
            String fname,
            int count,
            int inMem)
        {
            XmlBStringContext ctxt = new XmlBStringContext();
            String b;

            long start = 0; //System.currentTimeMillis();

            if (!ctxt.readFile(fname))
            {
                System.Console.WriteLine("Could not open file : " +
                           fname);
                return;
            }
            IXmlBBase[] el = new IXmlBBase[inMem];
            try
            {
                int ptr = 0;
                for (int i = 0; i < count; i++)
                {
                    if (i % 1000 == 0)
                        System.Console.WriteLine("" + (i) + "/" + count);
                    el[ptr] = acceptor.genericAccept(ctxt);
                    ctxt.setPtr(0);
                    ptr++;
                    if (ptr >= el.Length)
                        ptr = 0;
                }
                long stop = 0;//System.currentTimeMillis();
                System.Console.WriteLine("Done parsing.    Total time: " +
                           (stop - start) + " millisecs   Time/instance: " +
                           (stop - start) / count);
                // System.Console.WriteLine (el[0].toString());
                start = 0;//System.currentTimeMillis();
                for (int i = 0; i < count; i++)
                {
                    if (i % 1000 == 0)
                        System.Console.WriteLine("" + (i) + "/" + count);
                    b = el[0].ToString();
                }
                stop = 0;//System.currentTimeMillis();
                System.Console.WriteLine("Done unparsing.  Total time: " +
                           (stop - start) + " millisecs   Time/instance: " +
                           (stop - start) / count);
            }
            catch (Exception)
            {
                ctxt.dumpError();
            }
        }

        public const int DEFAULT_COUNT = 10000;

        public void performTest(XmlBBaseAcceptor acceptor,
            string[] args)
        {
            int count = DEFAULT_COUNT;
            int inMem = 1;

            if (args == null || args.Length == 0)
            {
                System.Console.WriteLine("No file name specified");
                return;
            }
            if (args.Length > 1)
                if (args.Length > 2)
                    inMem = System.Convert.ToInt32(args[2]);
            performTest(acceptor, args[0], count, inMem);

        }

    }
}
