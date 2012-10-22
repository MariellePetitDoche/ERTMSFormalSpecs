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
using System.Collections.Generic;

namespace DataDictionary.Tests
{
    public class SubSequence : Generated.SubSequence, IComparable<SubSequence>
    {
        /// <summary>
        /// The comparer
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public int CompareTo(SubSequence other)
        {
            return Utils.Comparer.StringComparer.Compare(Name, other.Name);
        }

        public override string ExpressionText
        {
            get
            {
                string retVal = "";

                retVal += "D_LRBG = " + getD_LRBG() + "\n";
                retVal += "Level = " + getLevel() + "\n";
                retVal += "Mode = " + getMode() + "\n";
                retVal += "NID_LRBG = " + getNID_LRBG() + "\n";
                retVal += "Q_DIRLRBG = " + getQ_DIRLRBG() + "\n";
                retVal += "Q_DIRTRAIN = " + getQ_DIRTRAIN() + "\n";
                retVal += "Q_DLRBG = " + getQ_DLRBG() + "\n";
                retVal += "RBC_ID = " + getRBC_ID() + "\n";
                retVal += "RBCPhone = " + getRBCPhone() + "\n";

                return retVal;
            }
        }

        public System.Collections.ArrayList TestCases
        {
            get
            {
                if (allTestCases() == null)
                {
                    setAllTestCases(new System.Collections.ArrayList());
                }
                return allTestCases();
            }
        }

        /// <summary>
        /// The enclosing frame
        /// </summary>
        public Frame Frame
        {
            get { return Enclosing as Frame; }
        }

        /// <summary>
        /// Executes the test cases for this test sequence
        /// </summary>
        /// <param name="runner">The runner used to execute the test case</param>
        /// <returns>the number of failed test cases</returns>
        public int ExecuteAllTestCases(Tests.Runner.Runner runner)
        {
            int retVal = 0;

            foreach (DataDictionary.Tests.TestCase testCase in TestCases)
            {
                int currentFailed = runner.FailedExpectations().Count;
                runner.RunUntilStep(null);
                if (runner.FailedExpectations().Count > currentFailed)
                {
                    retVal = retVal + 1;
                }
            }

            return retVal;
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return Frame.SubSequences; }
        }

        /// <summary>
        /// Provides the test cases for this sub sequence
        /// </summary>
        /// <param name="testCases"></param>
        public void FillTestCases(List<TestCase> testCases)
        {
            foreach (TestCase testCase in TestCases)
            {
                testCases.Add(testCase);
            }
        }

        /// <summary>
        /// Translates the sub sequence, according to the tanslation dictionary provided
        /// </summary>
        /// <param name="translationDictionary"></param>
        public void Translate(Translations.TranslationDictionary translationDictionary)
        {
            foreach (TestCase testCase in TestCases)
            {
                testCase.Translate(translationDictionary);
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                TestCase item = element as TestCase;
                if (item != null)
                {
                    appendTestCases(item);
                }
            }
        }

    }
}
