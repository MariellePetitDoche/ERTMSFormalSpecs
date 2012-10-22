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
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace GUI.TranslationRules
{
    public class TranslationDictionaryTreeNode : DataTreeNode<DataDictionary.Tests.Translations.TranslationDictionary>
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
        public TranslationDictionaryTreeNode(DataDictionary.Tests.Translations.TranslationDictionary item)
            : base("Dictionary", item)
        {
            foreach (DataDictionary.Tests.Translations.Folder folder in item.Folders)
            {
                Nodes.Add(new FolderTreeNode(folder));
            }
            foreach (DataDictionary.Tests.Translations.Translation translation in item.Translations)
            {
                Nodes.Add(new TranslationTreeNode(translation));
            }
            ImageIndex = 1;
            SelectedImageIndex = 1;
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
        /// Creates a new folder
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public FolderTreeNode createFolder(DataDictionary.Tests.Translations.Folder folder)
        {
            FolderTreeNode retVal = new FolderTreeNode(folder);

            Item.appendFolders(folder);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        public void AddFolderHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.Translations.Folder folder = (DataDictionary.Tests.Translations.Folder)DataDictionary.Generated.acceptor.getFactory().createFolder();
            folder.Name = "<Folder " + (Item.Folders.Count + 1) + ">";
            createFolder(folder);
        }

        /// <summary>
        /// Creates a new translation
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public TranslationTreeNode createTranslation(DataDictionary.Tests.Translations.Translation translation)
        {
            TranslationTreeNode retVal;

            Item.appendTranslations(translation);
            retVal = new TranslationTreeNode(translation);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        public void AddTranslationHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.Translations.Translation translation = (DataDictionary.Tests.Translations.Translation)DataDictionary.Generated.acceptor.getFactory().createTranslation();
            translation.Name = "<Translation " + (Item.Translations.Count + 1) + ">";
            createTranslation(translation);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add folder", new EventHandler(AddFolderHandler)));
            retVal.Add(new MenuItem("Add translation", new EventHandler(AddTranslationHandler)));

            return retVal;
        }

        /// <summary>
        /// Sorts the sub nodes of this node
        /// </summary>
        public override void SortSubNodes()
        {
            List<BaseTreeNode> folders = new List<BaseTreeNode>();
            List<BaseTreeNode> translations = new List<BaseTreeNode>();

            foreach (BaseTreeNode node in Nodes)
            {
                if (node is FolderTreeNode)
                {
                    folders.Add(node);
                }
                else if (node is TranslationTreeNode)
                {
                    translations.Add(node);
                }
            }
            folders.Sort();
            translations.Sort();

            Nodes.Clear();

            foreach (BaseTreeNode node in folders)
            {
                Nodes.Add(node);
            }
            foreach (BaseTreeNode node in translations)
            {
                Nodes.Add(node);
            }
        }

        /// <summary>
        /// Creates a new translation based on a step
        /// </summary>
        /// <param name="step"></param>
        private void createTranslation(DataDictionary.Tests.Step step)
        {
            DataDictionary.Tests.Translations.Translation translation = (DataDictionary.Tests.Translations.Translation)DataDictionary.Generated.acceptor.getFactory().createTranslation();
            DataDictionary.Tests.Translations.SourceText sourceText = (DataDictionary.Tests.Translations.SourceText)DataDictionary.Generated.acceptor.getFactory().createSourceText();

            sourceText.setName(step.getDescription());
            translation.appendSourceTexts(sourceText);
            createTranslation(translation);
        }

        /// <summary>
        /// Accepts a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);
            if (SourceNode is TestRunnerView.StepTreeNode)
            {
                TestRunnerView.StepTreeNode step = SourceNode as TestRunnerView.StepTreeNode;

                createTranslation(step.Item);
            }
            else if (SourceNode is TranslationTreeNode)
            {
                TranslationTreeNode translation = SourceNode as TranslationTreeNode;

                DataDictionary.Tests.Translations.Translation otherTranslation = (DataDictionary.Tests.Translations.Translation)DataDictionary.Generated.acceptor.getFactory().createTranslation();
                translation.Item.copyTo(otherTranslation);
                createTranslation(otherTranslation);

                translation.Delete();
            }
        }
    }
}
