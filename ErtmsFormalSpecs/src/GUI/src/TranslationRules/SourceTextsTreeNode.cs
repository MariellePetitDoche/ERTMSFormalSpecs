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
using System.Windows.Forms;

namespace GUI.TranslationRules
{
    public class SourceTextsTreeNode : DataTreeNode<DataDictionary.Tests.Translations.Translation>
    {
        private class ItemEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public SourceTextsTreeNode(DataDictionary.Tests.Translations.Translation item)
            : base(item, "Source texts", true)
        {
            foreach (DataDictionary.Tests.Translations.SourceText sourceText in item.SourceTexts)
            {
                Nodes.Add(new SourceTextTreeNode(sourceText));
            }
            SortSubNodes();
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
        /// Creates a new source text
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public SourceTextTreeNode createSourceText(DataDictionary.Tests.Translations.SourceText sourceText)
        {
            SourceTextTreeNode retVal;

            Item.appendSourceTexts(sourceText);
            retVal = new SourceTextTreeNode(sourceText);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.Translations.SourceText sourceText = (DataDictionary.Tests.Translations.SourceText)DataDictionary.Generated.acceptor.getFactory().createSourceText();
            sourceText.Name = "<SourceText " + (Item.SourceTexts.Count + 1) + ">";
            createSourceText(sourceText);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add", new EventHandler(AddHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
