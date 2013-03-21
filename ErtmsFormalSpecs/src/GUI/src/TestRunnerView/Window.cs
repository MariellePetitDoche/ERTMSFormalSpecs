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
    public partial class Window : Form, IBaseForm
    {
        public MyPropertyGrid Properties
        {
            get { return propertyGrid; }
        }

        public RichTextBox ExpressionTextBox
        {
            get { return editTextBox; }
        }

        public RichTextBox CommentsTextBox
        {
            get { return commentsRichTextBox; }
        }

        public RichTextBox MessageTextBox
        {
            get { return messageRichTextBox; }
        }

        public BaseTreeView TreeView
        {
            get { return testBrowserTreeView; }
        }

        public BaseTreeView subTreeView
        {
            get { return null; }
        }

        public ExplainTextBox ExplainTextBox
        {
            get { return null; }
        }

        /// <summary>
        /// The data dictionary for this view
        /// </summary>
        private DataDictionary.EFSSystem efsSystem;
        public DataDictionary.EFSSystem EFSSystem
        {
            get { return efsSystem; }
            private set
            {
                efsSystem = value;
                testBrowserTreeView.Root = efsSystem;
            }
        }

        /// <summary>
        /// The runner
        /// </summary>
        public DataDictionary.Tests.Runner.Runner getRunner(DataDictionary.Tests.SubSequence subSequence)
        {
            if (EFSSystem.Runner == null)
            {
                foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    if (subSequence != null)
                    {
                        EFSSystem.Runner = new DataDictionary.Tests.Runner.Runner(subSequence);
                        break;
                    }
                }
            }

            return EFSSystem.Runner;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="dictionary"></param>
        public Window(DataDictionary.EFSSystem efsSystem)
        {
            InitializeComponent();
            FormClosed += new FormClosedEventHandler(Window_FormClosed);
            Text = "System test view";
            Visible = false;
            EFSSystem = efsSystem;
            Refresh();
        }

        /// <summary>
        /// Handles the close event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void Window_FormClosed(object sender, FormClosedEventArgs e)
        {
            MDIWindow.HandleSubWindowClosed(this);
        }

        /// <summary>
        /// Indicates that a refresh is ongoing
        /// </summary>
        private bool DoingRefresh { get; set; }

        /// <summary>
        /// Refreshes the display
        /// </summary>
        override public void Refresh()
        {
            if (!DoingRefresh)
            {
                try
                {
                    DoingRefresh = true;

                    string selectedFrame = frameToolStripComboBox.Text;
                    string selectedSequence = subSequenceSelectorComboBox.Text;

                    if (EFSSystem.Runner == null)
                    {
                        toolStripTimeTextBox.Text = "0";
                        toolStripCurrentStepTextBox.Text = "<none>";
                    }
                    else
                    {
                        toolStripTimeTextBox.Text = "" + EFSSystem.Runner.Time;
                        DataDictionary.Tests.Step currentStep = EFSSystem.Runner.CurrentStep();
                        if (currentStep != null)
                        {
                            toolStripCurrentStepTextBox.Text = currentStep.Name;
                        }
                        else
                        {
                            toolStripCurrentStepTextBox.Text = "<none>";
                        }
                        Frame = EFSSystem.Runner.SubSequence.Frame;
                        selectedFrame = EFSSystem.Runner.SubSequence.Frame.Name;
                        selectedSequence = EFSSystem.Runner.SubSequence.Name;
                    }

                    testBrowserTreeView.Refresh();
                    evcTimeLineControl.Refresh();

                    frameToolStripComboBox.Items.Clear();
                    List<string> frames = new List<string>();
                    foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                    {
                        foreach (DataDictionary.Tests.Frame frame in dictionary.Tests)
                        {
                            frames.Add(frame.Name);
                        }
                    }
                    frames.Sort();

                    foreach (string frame in frames)
                    {
                        if (frame != null)
                        {
                            frameToolStripComboBox.Items.Add(frame);
                        }
                    }
                    frameToolStripComboBox.Text = selectedFrame;
                    frameToolStripComboBox.ToolTipText = selectedFrame;

                    if (Frame == null || frameToolStripComboBox.Text.CompareTo(Frame.Name) != 0)
                    {
                        subSequenceSelectorComboBox.Items.Clear();
                        foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                        {
                            Frame = dictionary.findFrame(frameToolStripComboBox.Text);
                            if (Frame != null)
                            {
                                foreach (DataDictionary.Tests.SubSequence subSequence in Frame.SubSequences)
                                {
                                    subSequenceSelectorComboBox.Items.Add(subSequence.Name);
                                }
                                break;
                            }
                        }
                        if (subSequenceSelectorComboBox.Items.Count > 0)
                        {
                            subSequenceSelectorComboBox.Text = subSequenceSelectorComboBox.Items[0].ToString();
                        }
                        else
                        {
                            subSequenceSelectorComboBox.Text = "";
                        }
                        EFSSystem.Runner = null;
                    }

                    if (EFSSystem.Runner != null)
                    {
                        subSequenceSelectorComboBox.Text = EFSSystem.Runner.SubSequence.Name;
                    }

                    subSequenceSelectorComboBox.ToolTipText = subSequenceSelectorComboBox.Text;
                    testBrowserStatusLabel.Text = frames.Count + " frame(s) loaded";
                }
                finally
                {
                    DoingRefresh = false;
                }
            }

            base.Refresh();
        }

        private void editTextBox_TextChanged(object sender, EventArgs e)
        {
            testBrowserTreeView.HandleExpressionTextChanged(editTextBox.Text);
        }

        private void commentsRichTextBox_TextChanged(object sender, EventArgs e)
        {
            testBrowserTreeView.HandleCommentTextChanged(commentsRichTextBox.Text);
        }

        /// <summary>
        /// The enclosing MDI Window
        /// </summary>
        public MainWindow MDIWindow
        {
            get { return GUI.FormsUtils.EnclosingForm(this.Parent) as MainWindow; }
        }

        /// <summary>
        /// Step once
        /// </summary>
        public void StepOnce()
        {
            CheckRunner();
            if (EFSSystem.Runner != null)
            {
                EFSSystem.Runner.RunUntilTime(EFSSystem.Runner.Time + EFSSystem.Runner.Step);
                MDIWindow.Refresh();
            }
        }

        private void stepOnce_Click(object sender, EventArgs e)
        {
            StepOnce();
        }

        private void restart_Click(object sender, EventArgs e)
        {
            EFSSystem.Runner = null;
            Clear();
        }

        public void Clear()
        {
            CheckRunner();

            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.ClearMessages();
            }
            MDIWindow.Refresh();
        }

        /// <summary>
        /// Ensures that the runner is not empty
        /// </summary>
        private void CheckRunner()
        {
            if (EFSSystem.Runner == null)
            {
                if (Frame != null)
                {
                    DataDictionary.Tests.SubSequence subSequence = Frame.findSubSequence(subSequenceSelectorComboBox.Text);
                    if (subSequence != null)
                    {
                        EFSSystem.Runner = new DataDictionary.Tests.Runner.Runner(subSequence);
                    }
                }
            }
        }

        private void rewindButton_Click(object sender, EventArgs e)
        {
            StepBack();
        }

        public void StepBack()
        {
            CheckRunner();
            if (EFSSystem.Runner != null)
            {
                EFSSystem.Runner.StepBack();
                MDIWindow.Refresh();
            }
        }

        private void testCaseSelectorComboBox_SelectionChanged(object sender, EventArgs e)
        {
            if (EFSSystem.Runner != null && EFSSystem.Runner.SubSequence.Name.CompareTo(subSequenceSelectorComboBox.Text) != 0)
            {
                EFSSystem.Runner = null;
            }
            Refresh();
        }

        /// <summary>
        /// Refreshes the model of the window
        /// </summary>
        public void RefreshModel()
        {
            testBrowserTreeView.RefreshModel();
            Refresh();
        }

        /// <summary>
        /// Selects the current step by clicking on the label
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void toolStripLabel4_Click(object sender, EventArgs e)
        {
            if (EFSSystem.Runner != null)
            {
                DataDictionary.Tests.Step step = EFSSystem.Runner.CurrentStep();
                if (step != null)
                {
                    MDIWindow.Select(step);
                }
            }
        }

        /// <summary>
        /// Selects the current test sequence by clicking on the label
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void toolStripLabel2_Click(object sender, EventArgs e)
        {
            if (EFSSystem.Runner != null)
            {
                DataDictionary.Tests.SubSequence subSequence = EFSSystem.Runner.SubSequence;
                if (subSequence != null)
                {
                    MDIWindow.Select(subSequence);
                }
            }
        }

        /// <summary>
        /// Selects the next node where info message is available
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void nextInfoToolStripButton_Click(object sender, EventArgs e)
        {
            TreeView.SelectNext(Utils.ElementLog.LevelEnum.Info);
        }

        /// <summary>
        /// Selects the next node where warning message is available
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void nextWarningToolStripButton_Click(object sender, EventArgs e)
        {
            TreeView.SelectNext(Utils.ElementLog.LevelEnum.Warning);
        }

        /// <summary>
        /// Selects the next node where error message is available
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void nextErrortoolStripButton_Click(object sender, EventArgs e)
        {
            TreeView.SelectNext(Utils.ElementLog.LevelEnum.Error);
        }

        /// <summary>
        /// The frame currently selected
        /// </summary>
        private DataDictionary.Tests.Frame Frame { get; set; }

        private void frameSelectorComboBox_SelectionChanged(object sender, EventArgs e)
        {
            if (Frame != null && Frame.Name.CompareTo(frameToolStripComboBox.Text) != 0)
            {
                EFSSystem.Runner = null;
            }

            Refresh();
        }

        /// <summary>
        /// Provides the model element currently selected in this IBaseForm
        /// </summary>
        public Utils.IModelElement Selected
        {
            get
            {
                Utils.IModelElement retVal = null;

                if (TreeView != null && TreeView.Selected != null)
                {
                    retVal = TreeView.Selected.Model;
                }

                return retVal;
            }
        }
    }
}
