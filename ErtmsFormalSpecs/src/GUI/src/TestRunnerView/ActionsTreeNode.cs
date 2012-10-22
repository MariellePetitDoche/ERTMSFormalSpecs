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
using System.ComponentModel;
using System.Windows.Forms;

namespace GUI.TestRunnerView
{
    public class ActionsTreeNode : DataTreeNode<DataDictionary.Tests.SubStep>
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
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public ActionsTreeNode(DataDictionary.Tests.SubStep item)
            : base("Actions", item)
        {
            foreach (DataDictionary.Rules.Action action in item.Actions)
            {
                Nodes.Add(new DataDictionaryView.ActionTreeNode(action));
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
        /// Adds the given action to the list of actions
        /// </summary>
        /// <param name="action"></param>
        public void addAction(DataDictionary.Rules.Action action)
        {
            DataDictionaryView.ActionTreeNode actionNode = new DataDictionaryView.ActionTreeNode(action);
            Item.appendActions(action);
            Nodes.Add(actionNode);
            SortSubNodes();
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.Action action = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            action.Expression = "";
            addAction(action);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add", new EventHandler(AddHandler)));

            return retVal;
        }

        /// <summary>
        /// Handles the drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);
            if (SourceNode is DataDictionaryView.ActionTreeNode)
            {
                DataDictionaryView.ActionTreeNode action = SourceNode as DataDictionaryView.ActionTreeNode;
                action.Delete();
                addAction(action.Item);
            }
        }
    }
}
