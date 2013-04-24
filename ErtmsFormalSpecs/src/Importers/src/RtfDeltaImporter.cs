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
namespace Importer
{
    using System.Collections.Generic;
    using Net.Sgoliver.NRtfTree.Core;

    /// <summary>
    /// This class is used to import a delta in the specifications based on a delta operation 
    /// performed in Word and saved in Rtf file format. 
    /// It detects the paragraphs that have been modified and updates the specification 
    /// according to the changes, that is
    ///   - save the current paragraph text, to ease the revision
    ///   - update the paragraph text with the new paragraph version 
    ///   - sets the paragraph as needing a manual review 
    ///   - invalidates the models to take this change into consideration
    /// </summary>
    public class RtfDeltaImporter
    {
        /// <summary>
        /// Stores data about the paragraphs found in the RTF document
        ///   - the paragraph ID
        ///   - the paragraph Text
        ///   - if there are changes in that paragraph
        /// </summary>
        private class Paragraph
        {
            /// <summary>
            /// The paragraph Id
            /// </summary>
            public string Id { get; set; }

            /// <summary>
            /// The paragraph text
            /// </summary>
            public string Text { get; set; }

            /// <summary>
            /// The text before the change
            /// </summary>
            public string OriginalText { get; set; }

            /// <summary>
            /// The state of the paragraph
            ///  - NoChange : there are no changes between this paragraph and the original one
            ///  - Changed : the paragraph text has changed
            ///  - Inserted : the paragraph was not present in the original
            ///  - Deleted : the paragraph is no more present in the document
            /// </summary>
            public enum ParagraphState { NoChange, Changed, Inserted, Deleted };
            public ParagraphState State { get; set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="id"></param>
            public Paragraph(string id)
            {
                Id = id.Trim();
                Text = "";
                State = ParagraphState.NoChange;
            }
        }

        /// <summary>
        /// A document, consisting of a set of paragraphs
        /// </summary>
        private class Document
        {
            /// <summary>
            /// Stores the paragraphs found in the document
            /// </summary>
            public Dictionary<string, Paragraph> Paragraphs = new Dictionary<string, Paragraph>();

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="filePath"></param>
            public Document(string filePath)
            {
                Parser parser = new Parser(filePath, this);
            }

            /// <summary>
            /// Adds a paragraph in the document
            /// </summary>
            /// <param name="paragraph"></param>
            public void AddParagraph(Paragraph paragraph)
            {
                Paragraphs.Add(paragraph.Id, paragraph);
            }

            /// <summary>
            /// Updates the state of the paragraphs located in source according to the original content, located in original
            /// </summary>
            /// <param name="source">The source paragraphs, to be updated</param>
            /// <param name="original">The original file content</param>
            public void UpdateState(Document original)
            {
                // Find paragraphs that have been inserted and those that have been modified
                foreach (Paragraph p in Paragraphs.Values)
                {
                    Paragraph originalParagraph = original.FindParagraph(p.Id);
                    if (originalParagraph != null)
                    {
                        if (originalParagraph.Text.Equals(p.Text))
                        {
                            p.State = Paragraph.ParagraphState.NoChange;
                        }
                        else
                        {
                            p.State = Paragraph.ParagraphState.Changed;
                        }
                    }
                    else
                    {
                        // Original paragraph could not be found => This is a new paragraph
                        p.State = Paragraph.ParagraphState.Inserted;
                    }
                }

                // Find paragraphs that have been deleted
                foreach (Paragraph p in original.Paragraphs.Values)
                {
                    Paragraph newParagraph = FindParagraph(p.Id);
                    if (newParagraph == null)
                    {
                        p.State = Paragraph.ParagraphState.Deleted;
                        Paragraphs.Add(p.Id, p);
                    }
                }
            }

            /// <summary>
            /// Finds a paragraph whose Id corresponds to the Id provided
            /// </summary>
            /// <param name="id"></param>
            /// <returns></returns>
            private Paragraph FindParagraph(string id)
            {
                Paragraph retVal = null;

                Paragraphs.TryGetValue(id, out retVal);

                return retVal;
            }

            /// <summary>
            /// Provides the paragraph that have been added in this release
            /// </summary>
            public List<Paragraph> NewParagraphs
            {
                get
                {
                    return findMatching(IsInserted);
                }
            }

            /// <summary>
            /// Provides the paragraph that have been added in this release
            /// </summary>
            public List<Paragraph> RemovedParagraphs
            {
                get
                {
                    return findMatching(IsDeleted);
                }
            }

            /// <summary>
            /// Provides the paragraph that have been added in this release
            /// </summary>
            public List<Paragraph> ChangedParagraphs
            {
                get
                {
                    return findMatching(IsChanged);
                }
            }

            /// <summary>
            /// Predicates on paragraphs
            /// </summary>
            /// <param name="p"></param>
            /// <returns></returns>
            private delegate bool ParagraphCondition(Paragraph p);

            /// <summary>
            /// Paragraph has been inserted
            /// </summary>
            /// <param name="p"></param>
            /// <returns></returns>
            private bool IsInserted(Paragraph p)
            {
                return p.State == Paragraph.ParagraphState.Inserted;
            }

            /// <summary>
            /// Paragraph has been deleted
            /// </summary>
            /// <param name="p"></param>
            /// <returns></returns>
            private bool IsDeleted(Paragraph p)
            {
                return p.State == Paragraph.ParagraphState.Deleted;
            }

            /// <summary>
            /// Paragraph contents has changed
            /// </summary>
            /// <param name="p"></param>
            /// <returns></returns>
            private bool IsChanged(Paragraph p)
            {
                return p.State == Paragraph.ParagraphState.Changed;
            }

            /// <summary>
            /// Find all paragraphs which match the predicate condition
            /// </summary>
            /// <param name="condition"></param>
            /// <returns></returns>
            private List<Paragraph> findMatching(ParagraphCondition condition)
            {
                List<Paragraph> retVal = new List<Paragraph>();

                foreach (Paragraph p in Paragraphs.Values)
                {
                    if (condition(p))
                    {
                        retVal.Add(p);
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// A simple RTF parser, which shall extract only the relevant data
        /// </summary>
        private class Parser : SarParser
        {
            /// <summary>
            /// Stores the paragraphs found in the document
            /// </summary>
            public Document Doc;

            /// <summary>
            /// Constructor.
            /// </summary>
            /// <param name="filePath"></param>
            public Parser(string filePath, Document document)
            {
                Doc = document;
                RtfReader reader = new RtfReader(this);
                reader.LoadRtfFile(filePath);
                reader.Parse();
            }

            public override void StartRtfDocument()
            {
            }
            public override void EndRtfDocument()
            {
            }
            public override void StartRtfGroup()
            {
            }

            /// <summary>
            /// At the end of an Rtf group, reset all modes
            /// </summary>
            public override void EndRtfGroup()
            {
                ParagraphNumberMode = ParagraphNumberEnum.None;
                IgnoreTextMode = IgnoreTextEnum.DoNotIgnore;
            }

            public override void RtfControl(string key, bool hasParameter, int parameter)
            {
            }

            /// <summary>
            /// Indicates whether the prefix corresponds to a paragraph number
            /// </summary>
            private enum ParagraphNumberEnum { None, ListText, PnText };
            private ParagraphNumberEnum ParagraphNumberMode = ParagraphNumberEnum.None;

            /// <summary>
            /// Indicates whether the text should be taken into consideration
            /// </summary>
            private enum IgnoreTextEnum { IgnoreText, DoNotIgnore };
            private IgnoreTextEnum IgnoreTextMode = IgnoreTextEnum.DoNotIgnore;

            public override void RtfKeyword(string key, bool hasParameter, int parameter)
            {
                // Try to recognise a paragraph number \listtext\... 
                if (key.Equals("listtext")) ParagraphNumberMode = ParagraphNumberEnum.ListText;
                // Try to recognise a list number \pntext
                else if (key.Equals("pntext")) ParagraphNumberMode = ParagraphNumberEnum.PnText;
                // When an outline level is encountered, this starts a new paragraph
                else if (key.Equals("outlinelevel")) CurrentParagraph = null;

                // \bkmkstart and \bkmkend seems to be related to bookmarks. Ignore the corresponding text
                if (key.Equals("bkmkstart")) IgnoreTextMode = IgnoreTextEnum.IgnoreText;
                else if (key.Equals("bkmkend")) IgnoreTextMode = IgnoreTextEnum.IgnoreText;

                // Do the paragraph modifications
                if (key.Equals("par")) addTextToCurrentParagraph("\n");
                else if (key.Equals("line")) addTextToCurrentParagraph("\n");
                else if (key.Equals("cell")) addTextToCurrentParagraph(" ");
            }


            /// <summary>
            /// The paragraph currently processed
            /// </summary>
            private Paragraph CurrentParagraph = null;
            private string EnclosingParagraphId = null;
            public override void RtfText(string text)
            {
                bool isNumberedParagraph = true;
                if (ParagraphNumberMode == ParagraphNumberEnum.ListText)
                {
                    isNumberedParagraph = text.IndexOf(".") > 0;
                    if (isNumberedParagraph)
                    {
                        CurrentParagraph = new Paragraph(text);
                        Doc.AddParagraph(CurrentParagraph);
                        EnclosingParagraphId = null;
                    }
                }

                if (!isNumberedParagraph)
                {
                    if (ParagraphNumberMode == ParagraphNumberEnum.PnText)
                    {
                        // This paragraph is a continuation of the preceding one. 
                        if (CurrentParagraph != null)
                        {
                            if (EnclosingParagraphId == null)
                            {
                                EnclosingParagraphId = CurrentParagraph.Id;
                            }

                            string id = EnclosingParagraphId + "." + text;
                            CurrentParagraph = new Paragraph(id);
                            Doc.AddParagraph(CurrentParagraph);
                        }
                    }
                    else
                    {
                        addTextToCurrentParagraph(text);
                    }
                }
            }

            /// <summary>
            /// Adds some text to the current paragraph
            /// </summary>
            /// <param name="text"></param>
            private void addTextToCurrentParagraph(string text)
            {
                if (CurrentParagraph != null)
                {
                    if (IgnoreTextMode == IgnoreTextEnum.DoNotIgnore)
                    {
                        CurrentParagraph.Text += text;
                    }
                }
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="originalFilePath">The path of the original file</param>
        /// <param name="newFilePath">The path of the new file</param>
        public RtfDeltaImporter(string originalFilePath, string newFilePath, DataDictionary.Specification.Specification specifications)
        {
            Document originalDoc = new Document(originalFilePath);
            Document newDoc = new Document(newFilePath);

            newDoc.UpdateState(originalDoc);

            PerformDelta(newDoc, specifications);
        }

        /// <summary>
        /// Performs the delta on the specification provided
        /// </summary>
        /// <param name="delta"></param>
        /// <param name="specifications"></param>
        private void PerformDelta(Document delta, DataDictionary.Specification.Specification specifications)
        {
            foreach (Paragraph p in delta.ChangedParagraphs)
            {
                DataDictionary.Specification.Paragraph par = specifications.FindParagraph(p.Id);

                if (par != null)
                {
                    par.Text = p.Text;
                    par.AddInfo("Paragraph has been changed");
                }
                else
                {
                    specifications.AddError("Cannot find paragraph " + p.Id + " for modification");
                }
            }

            foreach (Paragraph p in delta.NewParagraphs)
            {
                DataDictionary.Specification.Paragraph par = specifications.FindParagraph(p.Id);

                if (par != null)
                {
                    specifications.AddError("Paragraph " + p.Id + " already exists, whereas it has been detected as a new paragraph in the release");
                }
                else
                {
                    specifications.AddInfo("New paragraph detected " + p.Id);
                }
            }

            foreach (Paragraph p in delta.RemovedParagraphs)
            {
                DataDictionary.Specification.Paragraph par = specifications.FindParagraph(p.Id);

                if (par != null)
                {
                    par.Text = "<Removed in current release>";
                    par.AddInfo("Paragraph has been removed");
                }
                else
                {
                    specifications.AddError("Cannot find paragraph " + p.Id + " for removal");
                }
            }
        }
    }
}
