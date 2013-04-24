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
using System.Windows.Forms;

using Report.Specs;
using Report.Tests;

namespace GUI.SpecificationView
{
    public partial class Window : Form, IBaseForm
    {
        public MyPropertyGrid Properties
        {
            get { return propertyGrid; }
        }

        public RichTextBox ExpressionTextBox
        {
            get { return specBrowserTextView; }
        }

        public RichTextBox CommentsTextBox
        {
            get { return commentsRichTextBox; }
        }

        public RichTextBox MessagesTextBox
        {
            get { return messagesRichTextBox; }
        }

        public BaseTreeView TreeView
        {
            get { return specBrowserTreeView; }
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
        /// The specifications handled by this window
        /// </summary>
        public DataDictionary.Specification.Specification Specification
        {
            get
            {
                if (Dictionary != null)
                {
                    return Dictionary.Specifications;
                }
                return null;
            }
        }

        /// <summary>
        /// The rule set which is used to check the specifications
        /// </summary>
        private DataDictionary.Dictionary dictionary;
        public DataDictionary.Dictionary Dictionary
        {
            get { return dictionary; }
            private set
            {
                dictionary = value;
                specBrowserTreeView.Root = dictionary;
                Text = dictionary.Name + " specification view";
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="specification"></param>
        public Window(DataDictionary.Dictionary dictionary)
        {
            InitializeComponent();
            FormClosed += new FormClosedEventHandler(Window_FormClosed);
            Visible = false;
            Dictionary = dictionary;
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

        public override void Refresh()
        {
            specBrowserTreeView.Refresh();
            int applicableCounter = Specification.ApplicableParagraphs.Count;
            int implementedCounter = SpecCoverageReport.CoveredRequirements(Dictionary, true).Count;
            int testedCounter = TestsCoverageReport.CoveredRequirements(Dictionary).Count;

            double percentageImplemented = (double)implementedCounter / (double)applicableCounter;
            double percentageTested = (double)testedCounter / (double)applicableCounter;
            specBrowserStatusLabel.Text = string.Format("{0} applicable paragraphs loaded. {1} ({2:P2}) implemented, {3} ({4:P2}) tested.", new object[] { applicableCounter, implementedCounter, percentageImplemented, testedCounter, percentageTested });
            base.Refresh();
        }

        /// <summary>
        /// Refreshes the model of the window
        /// </summary>
        public void RefreshModel()
        {
            specBrowserTreeView.RefreshModel();
        }

        /// <summary>
        /// The enclosing MDI Window
        /// </summary>
        public MainWindow MDIWindow
        {
            get { return GUI.FormsUtils.EnclosingForm(this.Parent) as MainWindow; }
        }

        private void specBrowserTextView_TextChanged(object sender, EventArgs e)
        {
            specBrowserTextView.Enabled = true;
            specBrowserTreeView.HandleExpressionTextChanged(ExpressionTextBox.Text);
        }

        private void commentsRichTextBox_TextChanged(object sender, EventArgs e)
        {
            specBrowserTreeView.HandleCommentTextChanged(CommentsTextBox.Text);
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
        /// Selects the next node where warning message is available
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void nextWarningToolStripButton_Click(object sender, EventArgs e)
        {
            TreeView.SelectNext(Utils.ElementLog.LevelEnum.Warning);
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
