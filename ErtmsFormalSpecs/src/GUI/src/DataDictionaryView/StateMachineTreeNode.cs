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
    public class StateMachineTreeNode : ReqRelatedTreeNode<DataDictionary.Types.StateMachine>
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

            [Category("Default"), TypeConverter(typeof(InternalStateTypeConverter))]
            public string InitialState
            {
                get { return Item.InitialState; }
                set { Item.InitialState = value; }
            }
        }

        StateMachineStatesTreeNode states;
        StateMachineRulesTreeNode rules;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="children"></param>
        public StateMachineTreeNode(DataDictionary.Types.StateMachine item)
            : base(item, "State machine", true)
        {
            states = new StateMachineStatesTreeNode(item);
            Nodes.Add(states);

            rules = new StateMachineRulesTreeNode(item);
            Nodes.Add(rules);
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
            states.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a new state 
        /// </summary>
        /// <param name="state"></param>
        public StateTreeNode AddState(DataDictionary.Constants.State state)
        {
            return states.AddState(state);
        }

        public void AddRuleHandler(object sender, EventArgs args)
        {
            rules.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a new state 
        /// </summary>
        /// <param name="state"></param>
        public RuleTreeNode AddRule(DataDictionary.Rules.Rule rule)
        {
            return rules.AddRule(rule);
        }

        /// <summary>
        /// Display the associated state diagram
        /// </summary>
        public void ViewDiagram()
        {
            StateDiagram.StateDiagramWindow window = new StateDiagram.StateDiagramWindow();
            BaseTreeView.ParentForm.MDIWindow.AddChildWindow(window);
            window.StateMachine = Item;
            window.Text = Item.Name + " state diagram";
        }

        protected void ViewStateDiagramHandler(object sender, EventArgs args)
        {
            ViewDiagram();
        }

        public override void DoubleClickHandler()
        {
            ViewDiagram();
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
                    if (Item.EnclosingState != null)
                    {
                        Item.EnclosingState.StateMachine = stateMachine;
                    }
                    else if (Item.EnclosingProcedure != null)
                    {
                        Item.EnclosingProcedure.StateMachine = stateMachine;
                    }

                    // Update the view
                    TreeNode parent = Parent;
                    parent.Nodes.Remove(this);
                    parent.Nodes.Add(stateMachineTreeNode);
                }
            }
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add state", new EventHandler(AddStateHandler)));
            retVal.Add(new MenuItem("Add rule", new EventHandler(AddRuleHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("View state diagram", new EventHandler(ViewStateDiagramHandler)));

            return retVal;
        }

        /// <summary>
        /// Called before the selection changes
        /// </summary>
        public override void BeforeSelectionChange()
        {
            Window window = BaseTreeView.ParentForm as Window;
            if (window != null)
            {
                window.ruleExplainTextBox.Visible = true;
                window.stateDiagramPanel.Visible = false;
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
                    window.stateDiagramPanel.StateMachine = Item;
                    window.ruleExplainTextBox.Visible = false;
                    window.stateDiagramPanel.Visible = true;
                }
            }

            base.SelectionChanged();
        }
    }
}
