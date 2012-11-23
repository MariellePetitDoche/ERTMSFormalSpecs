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

namespace GUI.TestRunnerView
{
    public class TestsTreeNode : DataTreeNode<DataDictionary.Dictionary>
    {
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
        public TestsTreeNode(DataDictionary.Dictionary item)
            : base(item)
        {
            foreach (DataDictionary.Tests.Frame frame in item.Tests)
            {
                Nodes.Add(new FrameTreeNode(frame));
            }
            ImageIndex = 1;
            SelectedImageIndex = 1;
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
        /// Creates a new frame
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public FrameTreeNode createFrame(string name)
        {
            FrameTreeNode retVal;

            DataDictionary.Tests.Frame frame = (DataDictionary.Tests.Frame)DataDictionary.Generated.acceptor.getFactory().createFrame();
            frame.Name = name;
            Item.appendTests(frame);

            retVal = new FrameTreeNode(frame);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        public void AddHandler(object sender, EventArgs args)
        {
            createFrame("Frame" + (GetNodeCount(false) + 1));
        }

        private void ClearAll()
        {
            TestTreeView treeView = TreeView as TestTreeView;
            if (treeView != null)
            {
                Window window = treeView.ParentForm as Window;
                window.Clear();
            }
        }

        /// <summary>
        /// Interaction with the runner
        /// </summary>
        int failed = 0;

        /// <summary>
        /// Execution time span
        /// </summary>
        TimeSpan span;

        /// <summary>
        /// Executes the tests related to this frame
        /// </summary>
        /// <param name="args"></param>
        private void ExecuteTests(object args)
        {
            DateTime start = DateTime.Now;

            failed = Item.ExecuteAllTests();
            Item.EFSSystem.Runner = null;

            span = DateTime.Now.Subtract(start);
        }

        /// <summary>
        /// Handles a run event on this test case
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void RunHandler(object sender, EventArgs args)
        {
            ClearAll();
            ClearMessages();

            ProgressDialog dialog = new ProgressDialog("Executing test frames", ExecuteTests);
            dialog.ShowDialog();
            MainWindow.RefreshModel();
            System.Windows.Forms.MessageBox.Show(Item.Tests.Count + " test frame(s) executed, " + failed + " test frame(s) failed.\nTest duration : " + Math.Round(span.TotalSeconds) + " seconds", "Execution report");
        }


        /// <summary>
        /// Handles a run event on these tests and creates the associated report
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
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add", new EventHandler(AddHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Import braking curves verification set", new EventHandler(ImportBrakingCurvesHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Execute", new EventHandler(RunHandler)));
            retVal.Add(new MenuItem("Create report", new EventHandler(ReportHandler)));

            return retVal;
        }


        /// <summary>
        /// Imports a test scenario from the ERA braking curves simulation tool
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void ImportBrakingCurvesHandler(object sender, EventArgs args)
        {
            Window window = BaseForm as Window;
            if (window != null)
            {
                ExcelImport.Frm_ExcelImport excelImport = new ExcelImport.Frm_ExcelImport(this.Item);
                excelImport.ShowDialog();
            }
        }
    }
}
