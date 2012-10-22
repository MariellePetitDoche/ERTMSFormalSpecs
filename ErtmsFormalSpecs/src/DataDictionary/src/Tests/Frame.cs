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
using System.Collections.Generic;

namespace DataDictionary.Tests
{
    public class Frame : Generated.Frame
    {
        /// <summary>
        /// The frame sub sequences
        /// </summary>
        public System.Collections.ArrayList SubSequences
        {
            get
            {
                if (allSubSequences() == null)
                {
                    setAllSubSequences(new System.Collections.ArrayList());
                }
                return allSubSequences();
            }
        }

        /// <summary>
        /// Executes the test cases for this test sequence
        /// </summary>
        /// <param name="runner">The runner used to execute the tests</param>
        /// <returns>the number of failed sub sequences</returns>
        public int ExecuteAllTests()
        {
            int retVal = 0;

            foreach (DataDictionary.Tests.SubSequence subSequence in SubSequences)
            {
                EFSSystem.Runner = new Runner.Runner(subSequence);
                int testCasesFailed = subSequence.ExecuteAllTestCases(EFSSystem.Runner);
                if (testCasesFailed > 0)
                {
                    retVal += 1;
                }
            }

            return retVal;
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return Dictionary.Tests; }
        }

        /// <summary>
        /// ¨Provides the test cases for this test frame
        /// </summary>
        /// <param name="testCases"></param>
        public void FillTestCases(List<TestCase> testCases)
        {
            foreach (SubSequence subSequence in SubSequences)
            {
                subSequence.FillTestCases(testCases);
            }
        }

        /// <summary>
        /// Provides the list of sub sequences for this frame
        /// </summary>
        /// <param name="retVal"></param>
        public void FillSubSequences(List<SubSequence> retVal)
        {
            foreach (SubSequence subSequence in SubSequences)
            {
                retVal.Add(subSequence);
            }
        }

        /// <summary>
        /// Provides the sub sequence whose name corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public SubSequence findSubSequence(string name)
        {
            return (SubSequence)Utils.INamableUtils.findByName(name, SubSequences);
        }

        /// <summary>
        /// Translates the frame according to the translation dictionary provided
        /// </summary>
        /// <param name="translationDictionary"></param>
        public void Translate(Translations.TranslationDictionary translationDictionary)
        {
            foreach (SubSequence subSequence in SubSequences)
            {
                subSequence.Translate(translationDictionary);
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                SubSequence item = element as SubSequence;
                if (item != null)
                {
                    appendSubSequences(item);
                }
            }
        }

    }
}
