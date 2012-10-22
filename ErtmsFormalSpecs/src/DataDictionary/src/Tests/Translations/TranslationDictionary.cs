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

namespace DataDictionary.Tests.Translations
{
    public class TranslationDictionary : Generated.TranslationDictionary, Utils.IFinder
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public TranslationDictionary()
            : base()
        {
            Utils.FinderRepository.INSTANCE.Register(this);
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
        /// Provides the number of translations of the TranslationDictionary and all its folders
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
        /// Strips the text from useless characters
        /// </summary>
        /// <param name="text"></param>
        /// <returns></returns>
        public static string StripText(string text)
        {
            char[] source = text.ToCharArray();
            char[] retVal = new char[source.Length];

            int i = 0;
            int j = 0;
            while (i < source.Length)
            {
                if (Char.IsLetterOrDigit(source[i]))
                {
                    retVal[j] = source[i];
                    j += 1;
                }

                i += 1;
            }

            return new string(retVal, 0, j);
        }

        /// <summary>
        /// The cache
        /// </summary>
        private Dictionary<string, Translation> theCache = null;
        public Dictionary<string, Translation> TheCache
        {
            get
            {
                if (theCache == null)
                {
                    theCache = new Dictionary<string, Translation>();
                    foreach (Folder folder in Folders)
                    {
                        StoreTranslationsInFolder(folder);
                    }
                    foreach (Translation translation in Translations)
                    {
                        storeTranslationInCache(translation);
                    }
                }

                return theCache;
            }
            private set { theCache = value; }
        }

        private void StoreTranslationsInFolder(Folder folder)
        {
            foreach (Folder subFolder in folder.Folders)
            {
                StoreTranslationsInFolder(subFolder);
            }
            foreach (Translation translation in folder.Translations)
            {
                storeTranslationInCache(translation);
            }
        }

        private void storeTranslationInCache(Translation translation)
        {
            foreach (SourceText sourceText in translation.SourceTexts)
            {
                string textDescription = StripText(sourceText.Name);
                theCache[textDescription] = translation;
            }
        }

        /// <summary>
        /// Provides the translation which matches the description provided
        /// </summary>
        /// <param name="description"></param>
        /// <returns></returns>
        public Translation findTranslation(string description)
        {
            Translation retVal = null;

            if (description != null)
            {
                string text = StripText(description);
                if (TheCache.ContainsKey(text))
                {
                    retVal = TheCache[text];
                }
            }

            return retVal;
        }

        /// <summary>
        /// Clears the cache
        /// </summary>
        public void ClearCache()
        {
            TheCache = null;
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
