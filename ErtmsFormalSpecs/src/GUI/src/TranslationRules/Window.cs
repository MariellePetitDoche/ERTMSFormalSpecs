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

namespace GUI.TranslationRules
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
            get { return commentRichTextBox; }
        }

        public RichTextBox MessagesTextBox
        {
            get { return messageRichTextBox; }
        }

        public BaseTreeView subTreeView
        {
            get { return null; }
        }

        public ExplainTextBox ExplainTextBox
        {
            get { return null; }
        }

        public BaseTreeView TreeView
        {
            get { return translationTreeView; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="dictionary"></param>
        public Window(DataDictionary.Tests.Translations.TranslationDictionary dictionary)
        {
            InitializeComponent();

            FormClosed += new FormClosedEventHandler(Window_FormClosed);
            Visible = false;
            translationTreeView.Root = dictionary;
            Text = dictionary.Dictionary.Name + " test translation view";
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
        /// Refreshes the display
        /// </summary>
        override public void Refresh()
        {
            translationTreeView.Refresh();

            testBrowserStatusLabel.Text = translationTreeView.Root.TranslationsCount + " translation rule(s) loaded";
            base.Refresh();
        }

        private void editTextBox_TextChanged(object sender, EventArgs e)
        {
            translationTreeView.HandleExpressionTextChanged(editTextBox.Text);
        }

        /// <summary>
        /// The enclosing MDI Window
        /// </summary>
        public MainWindow MDIWindow
        {
            get { return GUI.FormsUtils.EnclosingForm(this.Parent) as MainWindow; }
        }

        /// <summary>
        /// Clears messages for the element stored in the tree view in the window
        /// </summary>
        public void Clear()
        {
            translationTreeView.ClearMessages();
            MDIWindow.Refresh();
        }

        /// <summary>
        /// Refreshed the model of the window
        /// </summary>
        public void RefreshModel()
        {
            translationTreeView.RefreshModel();
        }

        private void editTextBox_TextChanged_1(object sender, EventArgs e)
        {
            translationTreeView.HandleExpressionTextChanged(editTextBox.Text);
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

        private void commentRichTextBox_TextChanged(object sender, EventArgs e)
        {
            TreeView.HandleCommentTextChanged(CommentsTextBox.Text);
        }
    }
}
