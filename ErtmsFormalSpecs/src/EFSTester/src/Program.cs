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
using System;

using DataDictionary;

namespace EFSTester
{
    class Program
    {
        /// <summary>
        /// Perform all functional tests defined in the .EFS file provided
        /// </summary>
        /// <param name="args"></param>
        /// <returns>the error code of the program</returns>
        static int Main(string[] args)
        {
            try
            {
                int retVal = 0;

                Console.Out.WriteLine("EFS Tester");

                // Load the dictionaries provided as parameters
                EFSSystem efsSystem = EFSSystem.INSTANCE;
                foreach (string arg in args)
                {
                    Console.Out.WriteLine("Loading dictionary " + arg);
                    Dictionary dictionary = Util.load(arg, efsSystem);
                    if (dictionary == null)
                    {
                        Console.Out.WriteLine("Cannot load dictionary " + arg);
                        return -1;
                    }
                }

                // Perform functional test for each loaded dictionary
                foreach (Dictionary dictionary in efsSystem.Dictionaries)
                {
                    Console.Out.WriteLine("Processing tests from dictionary " + dictionary.Name);
                    foreach (DataDictionary.Tests.Frame frame in dictionary.Tests)
                    {
                        Console.Out.WriteLine("Executing frame " + frame.FullName);
                        foreach (DataDictionary.Tests.SubSequence subSequence in frame.SubSequences)
                        {
                            Console.Out.WriteLine("Executing sub sequence " + subSequence.FullName);
                            DataDictionary.Tests.Runner.Runner runner = new DataDictionary.Tests.Runner.Runner(subSequence);
                            runner.RunUntilStep(null);

                            bool failed = false;
                            foreach (DataDictionary.Tests.Runner.Events.Expect expect in runner.FailedExpectations())
                            {
                                Console.Out.WriteLine(" failed : " + expect.Message);
                                DataDictionary.Tests.TestCase testCase = Utils.EnclosingFinder<DataDictionary.Tests.TestCase>.find(expect.Expectation);
                                if (testCase.ImplementationCompleted)
                                {
                                    Console.Out.WriteLine(" !Unexpected failed expectation: " + expect.Message);
                                    failed = true;
                                }
                                else
                                {
                                    Console.Out.WriteLine(" .Expected failed expectation: " + expect.Message);
                                }

                            }
                            if (failed)
                            {
                                Console.Out.WriteLine("  -> Failed");
                                retVal = -1;
                            }
                            else
                            {
                                Console.Out.WriteLine("  -> Success");
                            }
                        }
                    }
                }
            }
            finally
            {
                DataDictionary.Util.UnlockAllFiles();
            }

            return retVal;
        }
    }
}
