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

namespace Utils
{
    public class ElementLog : IComparable<ElementLog>
    {
        public enum LevelEnum { Info, Warning, Error };

        /// <summary>
        /// The element log level
        /// </summary>
        private LevelEnum level = LevelEnum.Error;
        public LevelEnum Level
        {
            get { return level; }
            private set { level = value; }
        }

        /// <summary>
        /// The log message
        /// </summary>
        private string log;
        public string Log
        {
            get { return log; }
            set { log = value; }
        }

        /// <summary>
        /// Indicates if this log concerns a failed expectation (in that case, this is not a model error)
        /// </summary>
        private bool failedExpectation;
        public bool FailedExpectation
        {
            get { return failedExpectation; }
            set { failedExpectation = value; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="message"></param>
        public ElementLog(LevelEnum level, string message)
        {
            Level = level;
            Log = message;
            FailedExpectation = false;
        }

        /// <summary>
        /// Comparator
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public int CompareTo(ElementLog other)
        {
            int retVal = Level.CompareTo(other.Level);

            if (retVal == 0)
            {
                retVal = Log.CompareTo(other.Log);
            }

            return retVal;
        }
    }
}
