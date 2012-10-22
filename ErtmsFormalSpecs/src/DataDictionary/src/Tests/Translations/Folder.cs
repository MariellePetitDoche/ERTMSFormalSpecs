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


namespace DataDictionary.Tests.Translations
{
    public class Folder : Generated.Folder
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public Folder()
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
        /// Provides the translations for this dictionary
        /// </summary>
        public System.Collections.ArrayList Translations
        {
            get
            {
                if (allTranslations() == null)
                {
                    setAllTranslations(new System.Collections.ArrayList());
                }
                return allTranslations();
            }
            set
            {
                setAllTranslations(value);
            }
        }

        /// <summary>
        /// Provides the number of translations of the current folder and its sub-folders
        /// </summary>
        public int TranslationsCount
        {
            get
            {
                int retVal = allTranslations().Count;
                foreach (Folder folder in Folders)
                {
                    retVal += folder.TranslationsCount;
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
                Tests.Translations.TranslationDictionary dictionary = Enclosing as Tests.Translations.TranslationDictionary;
                if (dictionary != null)
                {
                    retVal = dictionary.Folders;
                }
                else
                {
                    Tests.Translations.Folder folder = Enclosing as Tests.Translations.Folder;
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
            Folder folder = element as Folder;
            if (folder != null)
            {
                appendFolders(folder);
            }
            else
            {
                Translation translation = element as Translation;
                if (translation != null)
                {
                    appendTranslations(translation);
                }
            }
        }
    }
}
