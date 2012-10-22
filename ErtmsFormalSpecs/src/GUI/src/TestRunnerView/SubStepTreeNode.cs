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
using System.IO;

namespace GUI.TestRunnerView
{
    public class SubStepTreeNode : DataTreeNode<DataDictionary.Tests.SubStep>
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

        ActionsTreeNode actions;
        ExpectationsTreeNode expectations;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public SubStepTreeNode(DataDictionary.Tests.SubStep item)
            : base(item)
        {
            actions = new ActionsTreeNode(item);
            expectations = new ExpectationsTreeNode(item);

            Nodes.Add(actions);
            Nodes.Add(expectations);

            ImageIndex = 1;
            SelectedImageIndex = 1;
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

            Window window = BaseForm as Window;
            if (window != null)
            {
                window.ExpressionTextBox.Lines = Utils.Utils.toStrings(Item.Name);
                //window.explainTextBox.Lines = Utils.Utils.toStrings(Item.getExplain());
            }
        }

        /// <summary>
        /// Ensures that the runner corresponds to test case
        /// </summary>
        private void CheckRunner()
        {
            Window window = BaseForm as Window;
            if (window != null && window.EFSSystem.Runner != null && window.EFSSystem.Runner.SubSequence != Item.Step.SubSequence)
            {
                window.Clear();
            }
        }

        /// <summary>
        /// Adds an action for this sub-step
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void AddActionHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.Action action = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            action.Name = "Action" + actions.Nodes.Count;
            createAction(action);
        }

        /// <summary>
        /// Creates a new action
        /// </summary>
        /// <param name="testCase"></param>
        /// <returns></returns>
        public DataDictionaryView.ActionTreeNode createAction(DataDictionary.Rules.Action action)
        {
            DataDictionaryView.ActionTreeNode retVal = new DataDictionaryView.ActionTreeNode(action);

            Item.appendActions(action);
            actions.Nodes.Add(retVal);

            return retVal;
        }

        /// <summary>
        /// Adds an expectation for this sub-step
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void AddExpectationHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.Expectation expectation = (DataDictionary.Tests.Expectation)DataDictionary.Generated.acceptor.getFactory().createExpectation();
            expectation.Name = "Expectation" + expectations.Nodes.Count;
            createExpectation(expectation);
        }

        /// <summary>
        /// Creates a new expectation
        /// </summary>
        /// <param name="testCase"></param>
        /// <returns></returns>
        public ExpectationTreeNode createExpectation(DataDictionary.Tests.Expectation expectation)
        {
            ExpectationTreeNode retVal = new ExpectationTreeNode(expectation);

            Item.appendExpectations(expectation);
            expectations.Nodes.Add(retVal);

            return retVal;
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add action", new EventHandler(AddActionHandler)));
            retVal.Add(new MenuItem("Add expectation", new EventHandler(AddExpectationHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

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
                if (action.Parent is ActionsTreeNode)
                {
                    createAction(action.Item);
                }
                action.Delete();
            }
            else if (SourceNode is ExpectationTreeNode)
            {
                ExpectationTreeNode expectation = SourceNode as ExpectationTreeNode;
                createExpectation(expectation.Item);
                expectation.Delete();
            }
        }
    }
}
