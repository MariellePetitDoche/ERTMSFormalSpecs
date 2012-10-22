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
using System.IO;
using System.ComponentModel;

namespace GUI.TestRunnerView
{
    public class ExpectationTreeNode : DataTreeNode<DataDictionary.Tests.Expectation>
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

            [Category("Description")]
            public override string Name
            {
                get { return Item.Name; }
            }

            [Category("Description")]
            public bool Blocking
            {
                get { return Item.Blocking; }
                set { Item.Blocking = value; }
            }

            [Category("Description")]
            public int DeadLine
            {
                get { return Item.DeadLine; }
                set { Item.DeadLine = value; }
            }

        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public ExpectationTreeNode(DataDictionary.Tests.Expectation item)
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

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        /// <summary>
        /// Creates sub sequence tree nodes
        /// </summary>
        /// <param name="elements">The elements to be placed in the node</param>
        public static List<BaseTreeNode> CreateExpectations(System.Collections.ArrayList elements)
        {
            List<BaseTreeNode> retVal = new List<BaseTreeNode>();

            foreach (DataDictionary.Tests.Expectation expectation in elements)
            {
                retVal.Add(new ExpectationTreeNode(expectation));
            }

            return retVal;
        }
    }
}
