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
using System.ComponentModel;
using System.Windows.Forms;

namespace GUI.SpecificationView
{
    public class SpecificationTreeNode : DataTreeNode<DataDictionary.Specification.Specification>
    {
        /// <summary>
        /// The value editor
        /// </summary>
        private class ItemEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            /// <summary>
            /// The specification version
            /// </summary>
            [Category("Description")]
            public string Version
            {
                get { return Item.Version; }
                set
                {
                    Item.Version = value;
                    RefreshNode();
                }
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public SpecificationTreeNode(DataDictionary.Specification.Specification item)
            : base(item, null, true)
        {
            foreach (DataDictionary.Specification.Chapter chapter in item.Chapters)
            {
                Nodes.Add(new ChapterTreeNode(chapter));
            }
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }


        /// <summary>
        /// Adds a new chapter to this specification
        /// </summary>
        /// <param name="chapter"></param>
        public void AddChapter(DataDictionary.Specification.Chapter chapter)
        {
            Item.appendChapters(chapter);
            Nodes.Add(new ChapterTreeNode(chapter));
            RefreshNode();
        }

        public void AddChapterHandler(object sender, EventArgs args)
        {
            DataDictionary.Specification.Chapter chapter = (DataDictionary.Specification.Chapter)DataDictionary.Generated.acceptor.getFactory().createChapter();
            chapter.setId("" + (Item.countChapters() + 1));
            AddChapter(chapter);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add chapter", new EventHandler(AddChapterHandler)));

            return retVal;
        }

        /// <summary>
        /// Update counts according to the selected chapter
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();

            List<DataDictionary.Specification.Paragraph> paragraphs = new List<DataDictionary.Specification.Paragraph>();
            foreach (DataDictionary.Specification.Chapter chapter in Item.Chapters)
            {
                foreach (DataDictionary.Specification.Paragraph paragraph in chapter.Paragraphs)
                {
                    paragraphs.AddRange(paragraph.getSubParagraphs());
                }
            }
            (BaseForm as Window).toolStripStatusLabel.Text = ParagraphTreeNode.CreateStatMessage(paragraphs);
        }
    }
}
