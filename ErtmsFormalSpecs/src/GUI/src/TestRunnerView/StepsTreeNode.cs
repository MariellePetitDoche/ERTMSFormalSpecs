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

namespace GUI.TestRunnerView
{
    public class StepsTreeNode : DataTreeNode<DataDictionary.Tests.TestCase>
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
        public StepsTreeNode(DataDictionary.Tests.TestCase item)
            : base("Steps", item)
        {
            foreach (DataDictionary.Tests.Step step in item.Steps)
            {
                Nodes.Add(new StepTreeNode(step));
            }
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
        /// Creates a new step
        /// </summary>
        /// <param name="step"></param>
        /// <returns></returns>
        public StepTreeNode createStep(DataDictionary.Tests.Step step)
        {
            StepTreeNode retVal = new StepTreeNode(step);

            Item.appendSteps(step);
            Nodes.Add(retVal);

            return retVal;
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.Step step = (DataDictionary.Tests.Step)DataDictionary.Generated.acceptor.getFactory().createStep();
            step.Name = "Step" + (GetNodeCount(false) + 1);

            createStep(step);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add Step", new EventHandler(AddHandler)));

            return retVal;
        }

        /// <summary>
        /// Handles the drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);
            if (SourceNode is StepTreeNode)
            {
                StepTreeNode step = SourceNode as StepTreeNode;
                step.Delete();

                createStep(step.Item);
            }
        }
    }
}
