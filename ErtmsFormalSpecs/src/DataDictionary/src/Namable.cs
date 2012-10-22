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

namespace DataDictionary
{
    /// <summary>
    /// Something that has a name
    /// </summary>
    public abstract class Namable : Generated.Namable, Utils.INamable, IComparable<Namable>, IComparable
    {
        /// <summary>
        /// The name separator
        /// </summary>
        public static string Separator = ".";

        /// <summary>
        /// The name
        /// </summary>
        public override string Name
        {
            get { return getName(); }
            set { setName(value); }
        }

        /// <summary>
        /// Provides the full name path to this element in the model structure
        /// </summary>
        public override string FullName
        {
            get
            {
                string retVal;

                Namable enclosing = Utils.EnclosingFinder<Namable>.find(this);
                if (enclosing != null)
                {
                    retVal = enclosing.FullName + "." + Name;
                }
                else
                {
                    retVal = Name;
                }

                return retVal;
            }
        }

        /// <summary>
        /// The comparer
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public int CompareTo(Namable other)
        {
            return Utils.Comparer.StringComparer.Compare(Name, other.Name);
        }

        /// <summary>
        /// The comparer
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public int CompareTo(object other)
        {
            Namable namable = other as Namable;
            if (namable != null)
            {
                return Utils.Comparer.StringComparer.Compare(Name, namable.Name);
            }

            return 0;
        }
    }
}
