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
    public class ShortcutFolder : Generated.ShortcutFolder
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public ShortcutFolder()
            : base()
        {
        }

        /// <summary>
        /// Provides the folders
        /// </summary>
        public System.Collections.ArrayList Folders
        {
            get
            {
                if (allFolders() == null)
                {
                    setAllFolders(new System.Collections.ArrayList());
                }
                return allFolders();
            }
            set
            {
                setAllFolders(value);
            }
        }

        /// <summary>
        /// Provides the shortcuts contained in this folder
        /// </summary>
        public System.Collections.ArrayList Shortcuts
        {
            get
            {
                if (allShortcuts() == null)
                {
                    setAllShortcuts(new System.Collections.ArrayList());
                }
                return allShortcuts();
            }
            set
            {
                setAllShortcuts(value);
            }
        }

        /// <summary>
        /// Provides the number of shortcuts of the currenf folder and all its sub-folders
        /// </summary>
        public int ShortcutsCount
        {
            get
            {
                int retVal = allShortcuts().Count;
                foreach (ShortcutFolder folder in Folders)
                {
                    retVal += folder.ShortcutsCount;
                }
                return retVal;
            }
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
                    retVal = dictionary.Folders;
                }
                else
                {
                    ShortcutFolder folder = Enclosing as ShortcutFolder;
                    if (folder != null)
                    {
                        retVal = folder.Folders;
                    }
                }
                return retVal;
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            ShortcutFolder folder = element as ShortcutFolder;
            if (folder != null)
            {
                appendFolders(folder);
            }
            else
            {
                Shortcut shortcut = element as Shortcut;
                if (shortcut != null)
                {
                    appendShortcuts(shortcut);
                }
            }
        }
    }
}
