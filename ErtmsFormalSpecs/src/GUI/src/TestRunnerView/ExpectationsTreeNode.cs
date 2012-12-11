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

namespace GUI.TestRunnerView
{
    public class ExpectationsTreeNode : DataTreeNode<DataDictionary.Tests.SubStep>
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
        public ExpectationsTreeNode(DataDictionary.Tests.SubStep item)
            : base(item, "Expectations", true)
        {
            foreach (DataDictionary.Tests.Expectation expectation in item.Expectations)
            {
                Nodes.Add(new ExpectationTreeNode(expectation));
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
        public void addExpectation(DataDictionary.Tests.Expectation expectation)
        {
            ExpectationTreeNode expectationNode = new ExpectationTreeNode(expectation);
            Item.appendExpectations(expectation);
            Nodes.Add(expectationNode);
            SortSubNodes();
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.Expectation expectation = (DataDictionary.Tests.Expectation)DataDictionary.Generated.acceptor.getFactory().createExpectation();
            expectation.Name = "<Expectation" + (GetNodeCount(false)) + ">";
            expectation.Blocking = true;
            expectation.DeadLine = 1000;
            addExpectation(expectation);
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
            if (SourceNode is ExpectationTreeNode)
            {
                ExpectationTreeNode expectation = SourceNode as ExpectationTreeNode;
                expectation.Delete();
                addExpectation(expectation.Item);
            }
        }
    }
}
