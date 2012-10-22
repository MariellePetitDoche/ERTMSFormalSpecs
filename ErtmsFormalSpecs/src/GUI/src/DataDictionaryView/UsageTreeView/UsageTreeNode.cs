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
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace GUI.DataDictionaryView.UsageTreeView
{
    public abstract class UsageTreeNode<T> : DataTreeNode<T>
        where T : Utils.IModelElement
    {
        private class UsageEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public UsageEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new UsageEditor();
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        protected UsageTreeNode(T item)
            : base(item)
        {
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Select", new EventHandler(SelectHandler)));

            return retVal;
        }

        /// <summary>
        /// Don't do things we usualy do when we select a new item
        /// This is due to the fact that elements stored in this TreeNode 
        /// do not reference typical sub elements
        /// </summary>
        public override void SelectionChanged()
        {
        }

        public abstract void SelectInGUI();

        private void SelectHandler(object sender, EventArgs e)
        {
            SelectInGUI();
        }

        public override void DoubleClickHandler()
        {
            base.DoubleClickHandler();
            SelectInGUI();
        }
    }
}
