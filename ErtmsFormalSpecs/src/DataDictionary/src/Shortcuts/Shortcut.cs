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

namespace DataDictionary.Shortcuts
{
    public class Shortcut : Generated.Shortcut
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public Shortcut()
            : base()
        {
        }

        /// <summary>
        /// Provides the full name for the shortcut
        /// </summary>
        public string ShortcutName
        {
            get { return getShortcutName(); }
            set { setShortcutName(value); }
        }

        /// <summary>
        /// The enclosing shortcut dictionary
        /// </summary>
        public ShortcutDictionary ShortcutDictionary
        {
            get { return Enclosing as ShortcutDictionary; }
        }

        /// <summary>
        /// Provides the enclosing collection
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                System.Collections.ArrayList retVal = null;
                ShortcutDictionary dictionary = Enclosing as ShortcutDictionary;
                if (dictionary != null)
                {
                    retVal = dictionary.Shortcuts;
                }
                else
                {
                    ShortcutFolder folder = Enclosing as ShortcutFolder;
                    if (folder != null)
                    {
                        retVal = folder.Shortcuts;
                    }
                }
                return retVal;
            }
        }

        /// <summary>
        /// Copies information from an element
        /// </summary>
        /// <param name="aNamable">Element to be copied</param>
        public void CopyFrom(Namable aNamable)
        {
            Name = aNamable.Name;
            ShortcutName = aNamable.FullName;
        }
    }
}
