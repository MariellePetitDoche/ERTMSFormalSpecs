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


namespace GUI.Shortcuts
{
    public class ShortcutFolderTreeNode : DataTreeNode<DataDictionary.Shortcuts.ShortcutFolder>
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
        public ShortcutFolderTreeNode(DataDictionary.Shortcuts.ShortcutFolder item)
            : base(item, null, true)
        {

            foreach (DataDictionary.Shortcuts.ShortcutFolder folder in item.Folders)
            {
                Nodes.Add(new ShortcutFolderTreeNode(folder));
            }

            foreach (DataDictionary.Shortcuts.Shortcut shortcut in item.Shortcuts)
            {
                Nodes.Add(new ShortcutTreeNode(shortcut));
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="name"></param>
        public ShortcutFolderTreeNode(string name, DataDictionary.Shortcuts.ShortcutFolder item)
            : base(item, name)
        {
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
        /// Creates a new folderTreeNode
        /// </summary>
        /// <param name="folder"></param>
        /// <returns></returns>
        public ShortcutFolderTreeNode createFolder(DataDictionary.Shortcuts.ShortcutFolder folder)
        {
            ShortcutFolderTreeNode retVal;

            Item.appendFolders(folder);
            retVal = new ShortcutFolderTreeNode(folder);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        public void AddFolderHandler(object sender, EventArgs args)
        {
            DataDictionary.Shortcuts.ShortcutFolder folder = (DataDictionary.Shortcuts.ShortcutFolder)DataDictionary.Generated.acceptor.getFactory().createShortcutFolder();
            folder.Name = "<Folder" + (Item.Folders.Count + 1) + ">";
            AddFolder(folder);
        }

        /// <summary>
        /// Adds a sub folder in the corresponding folder
        /// </summary>
        /// <param name="nameSpace"></param>
        public ShortcutFolderTreeNode AddFolder(DataDictionary.Shortcuts.ShortcutFolder folder)
        {
            Item.appendFolders(folder);
            ShortcutFolderTreeNode retVal = new ShortcutFolderTreeNode(folder);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        /// <summary>
        /// Creates a new shortcut based on a namable element
        /// </summary>
        /// <param name="step"></param>
        private void createShortcut(DataDictionary.Namable namable)
        {
            DataDictionary.Shortcuts.Shortcut shortcut = (DataDictionary.Shortcuts.Shortcut)DataDictionary.Generated.acceptor.getFactory().createShortcut();

            createShortcut(shortcut);
        }

        /// <summary>
        /// Creates a new shortcut
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public ShortcutTreeNode createShortcut(DataDictionary.Shortcuts.Shortcut shortcut)
        {
            ShortcutTreeNode retVal;

            Item.appendShortcuts(shortcut);
            retVal = new ShortcutTreeNode(shortcut);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add folder", new EventHandler(AddFolderHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Rename", new EventHandler(LabelEditHandler)));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        /// <summary>
        /// Sorts the sub nodes of this node
        /// </summary>
        public override void SortSubNodes()
        {
            List<BaseTreeNode> folders = new List<BaseTreeNode>();
            List<BaseTreeNode> shortcuts = new List<BaseTreeNode>();

            foreach (BaseTreeNode node in Nodes)
            {
                if (node is ShortcutFolderTreeNode)
                {
                    folders.Add(node);
                }
                else if (node is ShortcutTreeNode)
                {
                    shortcuts.Add(node);
                }
            }
            folders.Sort();
            shortcuts.Sort();

            Nodes.Clear();

            foreach (BaseTreeNode node in folders)
            {
                Nodes.Add(node);
            }
            foreach (BaseTreeNode node in shortcuts)
            {
                Nodes.Add(node);
            }
        }

        /// <summary>
        /// Handles drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            if (SourceNode is ShortcutTreeNode)
            {
                ShortcutTreeNode shortcut = SourceNode as ShortcutTreeNode;

                if (shortcut.Item.Dictionary == Item.Dictionary)
                {
                    DataDictionary.Shortcuts.Shortcut otherShortcut = (DataDictionary.Shortcuts.Shortcut)DataDictionary.Generated.acceptor.getFactory().createShortcut();
                    shortcut.Item.copyTo(otherShortcut);
                    createShortcut(otherShortcut);

                    shortcut.Delete();
                }
            }
            else if (SourceNode is ShortcutFolderTreeNode)
            {
                ShortcutFolderTreeNode folder = SourceNode as ShortcutFolderTreeNode;

                if (folder.Item.Dictionary == Item.Dictionary)
                {
                    DataDictionary.Shortcuts.ShortcutFolder otherFolder = (DataDictionary.Shortcuts.ShortcutFolder)DataDictionary.Generated.acceptor.getFactory().createShortcutFolder();
                    folder.Item.copyTo(otherFolder);
                    createFolder(otherFolder);

                    folder.Delete();
                }
            }
            else if (SourceNode is DataDictionaryView.RuleTreeNode)
            {
                DataDictionaryView.RuleTreeNode rule = SourceNode as DataDictionaryView.RuleTreeNode;

                if (rule.Item.Dictionary == Item.Dictionary)
                {
                    DataDictionary.Shortcuts.Shortcut shortcut = (DataDictionary.Shortcuts.Shortcut)DataDictionary.Generated.acceptor.getFactory().createShortcut();
                    shortcut.CopyFrom(rule.Item);
                    createShortcut(shortcut);
                }
            }
            else if (SourceNode is DataDictionaryView.FunctionTreeNode)
            {
                DataDictionaryView.FunctionTreeNode function = SourceNode as DataDictionaryView.FunctionTreeNode;

                if (function.Item.Dictionary == Item.Dictionary)
                {
                    DataDictionary.Shortcuts.Shortcut shortcut = (DataDictionary.Shortcuts.Shortcut)DataDictionary.Generated.acceptor.getFactory().createShortcut();
                    shortcut.CopyFrom(function.Item);
                    createShortcut(shortcut);
                }
            }
            else if (SourceNode is DataDictionaryView.ProcedureTreeNode)
            {
                DataDictionaryView.ProcedureTreeNode procedure = SourceNode as DataDictionaryView.ProcedureTreeNode;

                if (procedure.Item.Dictionary == Item.Dictionary)
                {
                    DataDictionary.Shortcuts.Shortcut shortcut = (DataDictionary.Shortcuts.Shortcut)DataDictionary.Generated.acceptor.getFactory().createShortcut();
                    shortcut.CopyFrom(procedure.Item);
                    createShortcut(shortcut);
                }
            }
            else if (SourceNode is DataDictionaryView.VariableTreeNode)
            {
                DataDictionaryView.VariableTreeNode variable = SourceNode as DataDictionaryView.VariableTreeNode;

                if (variable.Item.Dictionary == Item.Dictionary)
                {
                    DataDictionary.Shortcuts.Shortcut shortcut = (DataDictionary.Shortcuts.Shortcut)DataDictionary.Generated.acceptor.getFactory().createShortcut();
                    shortcut.CopyFrom(variable.Item);
                    createShortcut(shortcut);
                }
            }
        }
    }
}
