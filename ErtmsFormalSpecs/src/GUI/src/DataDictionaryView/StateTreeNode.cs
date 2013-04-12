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

namespace GUI.DataDictionaryView
{
    public class StateTreeNode : ReqRelatedTreeNode<DataDictionary.Constants.State>
    {
        private class InternalStateTypeConverter : StateTypeConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                return GetValues(((ItemEditor)context.Instance).Item);
            }
        }

        private class ItemEditor : ReqRelatedEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            [Category("Default")]
            public override string Name
            {
                get { return Item.Name; }
                set { Item.Name = value; }
            }

            [Category("Default"), TypeConverter(typeof(InternalStateTypeConverter))]
            public string InitialState
            {
                get { return Item.StateMachine.InitialState; }
                set { Item.StateMachine.InitialState = value; }
            }
        }

        /// <summary>
        /// The state machine tree node 
        /// </summary>
        public StateMachineTreeNode StateMachine;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public StateTreeNode(DataDictionary.Constants.State item)
            : base(item, null, false, true)
        {
            StateMachine = new StateMachineTreeNode(item.StateMachine);
            Nodes.Add(StateMachine);
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        public void AddStateHandler(object sender, EventArgs args)
        {
            DataDictionary.Constants.State state = (DataDictionary.Constants.State)DataDictionary.Generated.acceptor.getFactory().createState();
            state.Name = "State" + (GetNodeCount(true) + 1);
            Item.StateMachine.appendStates(state);
            Nodes.Add(new StateTreeNode(state));
            SortSubNodes();
        }

        /// <summary>
        /// Handles the drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            if (SourceNode is StateMachineTreeNode)
            {
                if (MessageBox.Show("Are you sure you want to override the state machine ? ", "Override state machine", MessageBoxButtons.OKCancel) == DialogResult.OK)
                {
                    StateMachineTreeNode stateMachineTreeNode = (StateMachineTreeNode)SourceNode;
                    DataDictionary.Types.StateMachine stateMachine = stateMachineTreeNode.Item;
                    stateMachineTreeNode.Delete();

                    // Update the model
                    Item.StateMachine = stateMachine;

                    // Update the view
                    TreeNode parent = Parent;
                    parent.Nodes.Remove(this);
                    parent.Nodes.Add(stateMachineTreeNode);
                }
            }

            base.AcceptDrop(SourceNode);
        }

        protected void ViewStateDiagramHandler(object sender, EventArgs args)
        {
            StateMachine.ViewDiagram();
        }

        public override void DoubleClickHandler()
        {
            StateMachine.ViewDiagram();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add sub state", new EventHandler(AddStateHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("View state diagram", new EventHandler(ViewStateDiagramHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        /// <summary>
        /// Called before the selection changes
        /// </summary>
        public override void BeforeSelectionChange()
        {
            if (BaseTreeView != null)
            {
                Window window = BaseTreeView.ParentForm as Window;
                if (window != null)
                {
                    window.ruleExplainTextBox.Visible = true;
                    // window.stateDiagramPanel.Visible = false;
                }
            }

            base.BeforeSelectionChange();
        }

        /// <summary>
        /// Handles a selection change event
        /// </summary>
        public override void SelectionChanged()
        {
            if (BaseTreeView.RefreshNodeContent)
            {
                Window window = BaseTreeView.ParentForm as Window;
                if (window != null)
                {
                    // window.stateDiagramPanel.StateMachine = Item.StateMachine;
                    // window.ruleExplainTextBox.Visible = false;
                    // window.stateDiagramPanel.Visible = true;
                }
            }

            base.SelectionChanged();
        }
    }
}
