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

namespace GUI.Shortcuts
{
    public class ShortcutTreeNode : DataTreeNode<DataDictionary.Shortcuts.Shortcut>
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
        public ShortcutTreeNode(DataDictionary.Shortcuts.Shortcut item)
            : base(item)
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

        public override void SelectionChanged()
        {
            base.SelectionChanged();

            RefreshNode();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Rename", new EventHandler(LabelEditHandler)));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        public override void DoubleClickHandler()
        {
            base.DoubleClickHandler();

            DataDictionary.Namable element = (DataDictionary.Namable)Item.EFSSystem.findByFullName(Item.ShortcutName);

            if (element != null)
            {
                MainWindow mainWindow = BaseForm.MDIWindow;

                if (mainWindow.DataDictionaryWindow != null)
                {
                    if (mainWindow.DataDictionaryWindow.TreeView.Select(element) != null)
                    {
                        mainWindow.DataDictionaryWindow.Focus();
                    }
                }
                if (mainWindow.SpecificationWindow != null)
                {
                    if (mainWindow.SpecificationWindow.TreeView.Select(element) != null)
                    {
                        mainWindow.SpecificationWindow.Focus();
                    }
                }
                if (mainWindow.TestWindow != null)
                {
                    if (mainWindow.TestWindow.TreeView.Select(element) != null)
                    {
                        mainWindow.TestWindow.Focus();
                    }
                }
            }
        }
    }
}
