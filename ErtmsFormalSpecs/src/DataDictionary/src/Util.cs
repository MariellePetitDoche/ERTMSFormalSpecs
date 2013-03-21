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
using System.IO;
using XmlBooster;

namespace DataDictionary
{
    public class Util
    {
        /// <summary>
        /// The Logger
        /// </summary>
        protected static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// Updates the dictionary contents
        /// </summary>
        private class Updater : Generated.Visitor
        {
        }

        /// <summary>
        /// Holds information about opened files in the system
        /// </summary>
        private class FileData
        {
            /// <summary>
            /// The name of the corresponding file
            /// </summary>
            public String FileName { get; private set; }

            /// <summary>
            /// The stream used to lock the file
            /// </summary>
            public FileStream Stream { get; private set; }

            /// <summary>
            /// The length of the lock section
            /// </summary>
            private long LockLength { get; set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="fileName"></param>
            public FileData(String fileName)
            {
                FileName = fileName;
                Lock();
            }

            /// <summary>
            /// Locks the corresponding file
            /// </summary>
            public void Lock()
            {
                if (Stream == null)
                {
                    Stream = new FileStream(FileName, FileMode.OpenOrCreate, FileAccess.ReadWrite);
                    LockLength = Stream.Length;
                    Stream.Lock(0, LockLength);
                }
            }

            /// <summary>
            /// Unlocks the corresponding file
            /// </summary>
            public void Unlock()
            {
                if (Stream != null)
                {
                    Stream.Unlock(0, LockLength);
                    Stream.Close();
                    Stream = null;
                }
            }
        }

        /// <summary>
        /// Lock all opened files
        /// </summary>
        private static List<FileData> openedFiles = new List<FileData>();

        /// <summary>
        /// Locks a single file
        /// </summary>
        /// <param name="filePath"></param>
        private static void LockFile(String filePath)
        {
            FileData data = new FileData(filePath);
            openedFiles.Add(data);
        }

        /// <summary>
        /// Unlocks all files locked by the system
        /// </summary>
        public static void UnlockAllFiles()
        {
            foreach (FileData data in openedFiles)
            {
                data.Unlock();
            }
        }

        /// <summary>
        /// Locks all files loaded in the system
        /// </summary>
        public static void LockAllFiles()
        {
            foreach (FileData data in openedFiles)
            {
                data.Lock();
            }
        }

        /// <summary>
        /// Loads a dictionary according to the corresponding specifications
        /// </summary>
        /// <param name="filePath">The path of the file which holds the dictionary data</param>
        /// <param name="efsSystem">The system for which this dictionary is loaded</param>
        /// <returns></returns>
        public static Dictionary load(String filePath, EFSSystem efsSystem)
        {
            Dictionary retVal = null;

            DataDictionary.Generated.acceptor.setFactory(new DataDictionary.ObjectFactory());
            XmlBFileContext ctxt = new XmlBFileContext();
            ctxt.readFile(filePath);
            try
            {
                retVal = (Dictionary)Generated.acceptor.accept(ctxt);
                retVal.FilePath = filePath;
                efsSystem.AddDictionary(retVal);

                Updater updater = new Updater();
                updater.visit(retVal);
                retVal.Specifications.ManageTypeSpecs();

                LockFile(filePath);
            }
            catch (XmlBooster.XmlBException excp)
            {
                Log.Error(ctxt.errorMessage());
            }

            return retVal;
        }

        /// <summary>
        /// Loads a specification
        /// </summary>
        /// <param name="fileName">The name of the file which holds the dictionary data</param>
        /// <param name="dictionary">The dictionary for which the specification is loaded</param>
        /// <returns></returns>
        public static Specification.Specification loadSpecification(String fileName, Dictionary dictionary)
        {
            Specification.Specification retVal = null;

            DataDictionary.Generated.acceptor.setFactory(new DataDictionary.ObjectFactory());
            XmlBFileContext ctxt = new XmlBFileContext();
            ctxt.readFile(fileName);
            try
            {
                retVal = (Specification.Specification)Generated.acceptor.accept(ctxt);
                dictionary.Specifications = retVal;
                retVal.setFather(dictionary);

                Updater updater = new Updater();
                updater.visit(retVal);

                LockFile(fileName);
            }
            catch (XmlBooster.XmlBException excp)
            {
                Log.Error(ctxt.errorMessage());
            }

            return retVal;
        }

        public static Tests.Translations.TranslationDictionary loadTranslationDictionary(string fileName, DataDictionary.Dictionary dictionary)
        {
            Tests.Translations.TranslationDictionary retVal = null;

            XmlBFileContext ctxt = new XmlBFileContext();
            ctxt.readFile(fileName);
            try
            {
                retVal = Generated.acceptor.accept(ctxt) as Tests.Translations.TranslationDictionary;
                if (retVal != null)
                {
                    retVal.setFather(dictionary);
                }

                LockFile(fileName);
            }
            catch (XmlBooster.XmlBException excp)
            {
                Log.Error(ctxt.errorMessage());
            }

            return retVal;
        }
    }
}
