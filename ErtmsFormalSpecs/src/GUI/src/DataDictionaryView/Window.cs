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

namespace GUI.DataDictionaryView
{
    public partial class Window : Form, IBaseForm
    {
        public MyPropertyGrid Properties
        {
            get { return dataDictPropertyGrid; }
        }

        public RichTextBox ExpressionTextBox
        {
            get { return expressionTextBox; }
        }

        public RichTextBox CommentsTextBox
        {
            get { return commentRichTextBox; }
        }

        public RichTextBox MessageTextBox
        {
            get { return messagesRichTextBox; }
        }

        public BaseTreeView TreeView
        {
            get { return dataDictTree; }
        }

        public BaseTreeView subTreeView
        {
            get { return usageTreeView; }
        }

        public ExplainTextBox ExplainTextBox
        {
            get { return ruleExplainTextBox; }
        }

        /// <summary>
        /// The Dictionary handled by this view
        /// </summary>
        private DataDictionary.Dictionary dictionary;
        public DataDictionary.Dictionary Dictionary
        {
            get { return dictionary; }
            set
            {
                dictionary = value;
                dataDictTree.Root = dictionary;
                Text = dictionary.Name + " model view";
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="dictionary"></param>
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
            dataDictTree.Refresh();
            base.Refresh();
        }

        /// <summary>
        /// Refreshes the model of the window
        /// </summary>
        public void RefreshModel()
        {
            dataDictTree.RefreshModel();
        }

        private void expressionTextBox_TextChanged(object sender, EventArgs e)
        {
            dataDictTree.HandleExpressionTextChanged(expressionTextBox.Text);
        }

        private void commentTextBox_TextChanged(object sender, EventArgs e)
        {
            dataDictTree.HandleCommentTextChanged(commentRichTextBox.Text);
        }

        /// <summary>
        /// The enclosing MDI Window
        /// </summary>
        public MainWindow MDIWindow
        {
            get { return GUI.FormsUtils.EnclosingForm(this.Parent) as MainWindow; }
        }

        /// <summary>
        /// Finds the tree node which corresponds to the model element
        /// </summary>
        /// <param name="model"></param>
        /// <returns></returns>
        public BaseTreeNode FindNode(Utils.IModelElement model)
        {
            return TreeView.FindNode(model);
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
