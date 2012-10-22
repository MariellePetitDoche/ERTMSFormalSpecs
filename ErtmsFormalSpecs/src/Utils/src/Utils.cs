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

namespace Utils
{
    public class Utils
    {
        /// <summary>
        /// Indicates whether the data provided is empty
        /// </summary>
        /// <param name="data"></param>
        /// <returns></returns>
        public static bool isEmpty(string data)
        {
            return data == null || data.Equals("");
        }

        private static char[] END_LINE = { '\r', '\n' };

        /// <summary>
        /// Converts a string into a list of string, splitted by eol
        /// </summary>
        /// <param name="data"></param>
        /// <returns></returns>
        public static string[] toStrings(string data)
        {
            if (data != null)
            {
                return data.Split(END_LINE, StringSplitOptions.RemoveEmptyEntries);
            }

            return new string[0];
        }

        /// <summary>
        /// Converts a list of strings into its corresponding array
        /// </summary>
        /// <param name="data"></param>
        /// <returns></returns>
        public static string[] toArray(List<string> data)
        {
            string[] retVal = new string[data.Count];

            data.CopyTo(retVal);

            return retVal;
        }

        /// <summary>
        /// Generates the list of strings associated to a given element log list
        /// </summary>
        /// <param name="list"></param>
        /// <returns></returns>
        public static string[] toStrings(List<ElementLog> list)
        {
            string[] retVal = new string[list.Count];

            int i = 0;
            foreach (ElementLog log in list)
            {
                retVal[i] = log.Log;
                i = i + 1;
            }

            return retVal;
        }

        /// <summary>
        /// Concats the 'name' to the existing scope, separated by '.'
        /// </summary>
        /// <param name="scope"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        public static string concat(string scope, string name)
        {
            string retVal = name;
            if (!isEmpty(scope))
            {
                retVal = scope + "." + retVal;
            }
            return retVal;
        }
    }
}
