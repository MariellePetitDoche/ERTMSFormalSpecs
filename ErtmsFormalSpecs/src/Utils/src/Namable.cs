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

namespace Utils
{
    /// <summary>
    /// Something that has a name
    /// </summary>
    public interface INamable
    {
        string Name
        {
            get;
            set;
        }

        string FullName
        {
            get;
        }
    }

    /// <summary>
    /// Utilities for INamables
    /// </summary>
    public static class INamableUtils
    {
        /// <summary>
        /// Provides the element which matches the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public static INamable findByName(string name, System.Collections.IEnumerable elements)
        {
            INamable retVal = null;

            foreach (INamable namable in elements)
            {
                if (namable.Name != null)
                {
                    if (namable.Name.CompareTo(name) == 0)
                    {
                        retVal = namable;
                        break;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the element which matches the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public static INamable findByName(string name, IEnumerable<INamable> elements)
        {
            INamable retVal = null;

            foreach (INamable namable in elements)
            {
                if (namable.Name.CompareTo(name) == 0)
                {
                    retVal = namable;
                    break;
                }
            }

            return retVal;
        }

        public static string[] toNameArray(HashSet<INamable> set)
        {
            string[] retVal = new string[set.Count];

            int i = 0;
            foreach (INamable namable in set)
            {
                retVal[i] = namable.Name;
                i = i + 1;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the element which matches the fullname provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public static INamable findByFullName(string name, System.Collections.IEnumerable elements)
        {
            INamable retVal = null;

            foreach (INamable namable in elements)
            {
                if (namable.FullName.CompareTo(name) == 0)
                {
                    retVal = namable;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the element which matches the fullname provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public static INamable findByFullName(string name, IEnumerable<INamable> elements)
        {
            INamable retVal = null;

            foreach (INamable namable in elements)
            {
                if (namable.FullName.CompareTo(name) == 0)
                {
                    retVal = namable;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the enclosing INamable, if exists
        /// </summary>
        /// <param name="current"></param>
        /// <returns></returns>
        public static INamable getEnclosing(INamable current)
        {
            // Gets the enclosing element in the tree
            IEnclosed enclosed = current as IEnclosed;
            if (enclosed != null)
            {
                current = enclosed.Enclosing as INamable;
            }
            return current;
        }

    }
}
