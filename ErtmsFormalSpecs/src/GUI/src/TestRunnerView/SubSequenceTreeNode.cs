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
    public class SubSequenceTreeNode : DataTreeNode<DataDictionary.Tests.SubSequence>
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
        public SubSequenceTreeNode(DataDictionary.Tests.SubSequence item)
            : base(item)
        {
            foreach (DataDictionary.Tests.TestCase testCase in item.TestCases)
            {
                Nodes.Add(new TestCaseTreeNode(testCase));
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
        /// Creates a new test case (e.g. feature + test case)
        /// </summary>
        /// <param name="testCase"></param>
        /// <returns></returns>
        public TestCaseTreeNode createTestCase(DataDictionary.Tests.TestCase testCase)
        {
            TestCaseTreeNode retVal = new TestCaseTreeNode(testCase);

            Item.appendTestCases(testCase);
            Nodes.Add(retVal);

            return retVal;
        }

        /// <summary>
        /// Translates the corresponding sub sequence, according to translation rules
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void TranslateHandler(object sender, EventArgs args)
        {
            ProgressDialog progress = new ProgressDialog("Applying translation rules", ApplyRules);
            progress.ShowDialog(MainWindow);
            MainWindow.RefreshModel();
        }

        /// <summary>
        /// Worker task to apply the translation rules
        /// </summary>
        /// <param name="arg"></param>
        private void ApplyRules(object arg)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();
            Item.Translate(Item.Dictionary.TranslationDictionary);
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.TestCase testCase = (DataDictionary.Tests.TestCase)DataDictionary.Generated.acceptor.getFactory().createTestCase();
            testCase.Name = "Test case" + (Item.TestCases.Count + 1);
            createTestCase(testCase);
        }

        /// <summary>
        /// Provides the EFS System in which this element belongs
        /// </summary>
        public DataDictionary.EFSSystem EFSSystem
        {
            get
            {
                return Utils.EnclosingFinder<DataDictionary.EFSSystem>.find(Item);
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
                EFSSystem.Runner = new DataDictionary.Tests.Runner.Runner(Item);
                EFSSystem.Runner.RunUntilStep(null);
            }
        }

        /// <summary>
        /// Handles a run event on this test case
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void RunHandler(object sender, EventArgs args)
        {
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
        /// Handles a run event on sub sequence case and creates the associated report
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void ReportHandler(object sender, EventArgs args)
        {
            Report.TestReport aReport = new Report.TestReport(Item);
            aReport.Show();
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
            retVal.Add(new MenuItem("Add test case", new EventHandler(AddHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Execute", new EventHandler(RunHandler)));
            retVal.Add(new MenuItem("Create report", new EventHandler(ReportHandler)));
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
            if (SourceNode is TestCaseTreeNode)
            {
                TestCaseTreeNode testCase = SourceNode as TestCaseTreeNode;
                testCase.Delete();

                createTestCase(testCase.Item);
            }
        }
    }
}
