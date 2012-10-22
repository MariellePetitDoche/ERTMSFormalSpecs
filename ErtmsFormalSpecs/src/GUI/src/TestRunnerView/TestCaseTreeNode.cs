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
using System.ComponentModel;
using System.IO;

namespace GUI.TestRunnerView
{
    public class TestCaseTreeNode : ReqRelatedTreeNode<DataDictionary.Tests.TestCase>
    {
        /// <summary>
        /// The value editor
        /// </summary>
        private class ItemEditor : ReqRelatedEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            /// <summary>
            /// The item name
            /// </summary>
            [Category("Description")]
            public override string Name
            {
                get { return Item.Name; }
                set
                {
                    if (Item.getFeature() == 0 && Item.getCase() == 0)
                    {
                        base.Name = value;
                    }

                    if (Item.getFeature() == 9999 && Item.getCase() == 9999)
                    {
                        base.Name = value;
                    }
                }
            }

            /// <summary>
            /// The item feature
            /// </summary>
            [Category("Description")]
            public int Feature
            {
                get { return Item.getFeature(); }
                set { Item.setFeature(value); }
            }

            /// <summary>
            /// The item test case
            /// </summary>
            [Category("Description")]
            public int TestCase
            {
                get { return Item.getCase(); }
                set { Item.setCase(value); }
            }
        }

        /// <summary>
        /// The steps tree node
        /// </summary>
        StepsTreeNode steps = null;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public TestCaseTreeNode(DataDictionary.Tests.TestCase item)
            : base(item)
        {
            steps = new StepsTreeNode(Item);
            Nodes.Add(steps);
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
        /// Ensures that the runner corresponds to test sequence
        /// </summary>
        private void CheckRunner()
        {
            Window window = BaseForm as Window;
            if (Item.EFSSystem.Runner != null && Item.EFSSystem.Runner.SubSequence != Item.SubSequence)
            {
                window.Clear();
            }
        }

        /// <summary>
        /// Executes the tests related to this frame
        /// </summary>
        /// <param name="args"></param>
        private void ExecuteTests(object args)
        {
            Window window = BaseForm as Window;
            if (window != null)
            {
                DataDictionary.Tests.Runner.Runner runner = window.getRunner(Item.SubSequence);
                DataDictionary.Tests.Step lastStep = (DataDictionary.Tests.Step)Item.Steps[Item.Steps.Count - 1];
                runner.RunUntilStep(lastStep);
            }
        }

        /// <summary>
        /// Translates the corresponding test case, according to translation rules
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void TranslateHandler(object sender, EventArgs args)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();
            Item.Translate(Item.Dictionary.TranslationDictionary);
            MainWindow.RefreshModel();
        }

        /// <summary>
        /// Handles a run event on this test case
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void RunHandler(object sender, EventArgs args)
        {
            CheckRunner();
            ClearMessages();

            if (TestTreeView.SHOW_DIALOG)
            {
                ProgressDialog dialog = new ProgressDialog("Executing test steps", ExecuteTests);
                dialog.ShowDialog();
            }
            else
            {
                ExecuteTests(null);
            }

            MainWindow.RefreshModel();
        }

        /// <summary>
        /// Handles a run event on this test case and creates the associated report
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void ReportHandler(object sender, EventArgs args)
        {
            Report.TestReport aReport = new Report.TestReport(Item);
            aReport.Show();
        }

        /// <summary>
        /// Creates a new step
        /// </summary>
        /// <param name="step"></param>
        public StepTreeNode createStep(DataDictionary.Tests.Step step)
        {
            return steps.createStep(step);
        }

        public void AddHandler(object sender, EventArgs args)
        {
            steps.AddHandler(sender, args);
        }

        /// <summary>
        /// Extracts the test case in a new subsequence
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void Extract(object sender, EventArgs args)
        {
            MainWindow mainWindow = MainWindow;
            mainWindow.AllowRefresh = false;

            try
            {
                DataDictionary.Tests.SubSequence subSequence = (DataDictionary.Tests.SubSequence)DataDictionary.Generated.acceptor.getFactory().createSubSequence();
                subSequence.Name = Item.Name;

                FrameTreeNode frameTreeNode = Parent.Parent as FrameTreeNode;
                SubSequenceTreeNode newSubSequence = frameTreeNode.createSubSequence(subSequence);

                SubSequenceTreeNode subSequenceTreeNode = Parent as SubSequenceTreeNode;
                newSubSequence.AcceptCopy((BaseTreeNode)subSequenceTreeNode.Nodes[0]);
                newSubSequence.AcceptDrop(this);
            }
            finally
            {
                mainWindow.AllowRefresh = true;
                mainWindow.RefreshModel();
            }
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Apply translation rules", new EventHandler(TranslateHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Add Step", new EventHandler(AddHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Extract in a new subsequence", new EventHandler(Extract)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Execute", new EventHandler(RunHandler)));
            retVal.Add(new MenuItem("Create report", new EventHandler(ReportHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
