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

namespace GUI.SearchDialog
{
    public partial class SearchDialog : Form
    {
        /// <summary>
        /// The system for which this dialog is built
        /// </summary>
        public DataDictionary.EFSSystem EFSSystem { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public SearchDialog()
        {
            InitializeComponent();
        }

        public MainWindow MDIWindow
        {
            get
            {
                return Owner as MainWindow;
            }
        }

        /// <summary>
        /// Initialises the dialog
        /// </summary>
        /// <param name="efsSystem"></param>
        public void Initialise(DataDictionary.EFSSystem efsSystem)
        {
            EFSSystem = efsSystem;
        }

        /// <summary>
        /// Medor, who searches through the model
        /// </summary>
        private class Medor : DataDictionary.Generated.Visitor
        {
            /// <summary>
            /// The string to be looked for
            /// </summary>
            public string SearchString { get; private set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="searchString"></param>
            public Medor(string searchString)
            {
                SearchString = searchString;
            }

            public override void visit(DataDictionary.Generated.Namable obj, bool visitSubNodes)
            {
                DataDictionary.Namable namable = (DataDictionary.Namable)obj;

                if (namable.FullName != null && namable.FullName.Contains(SearchString))
                {
                    namable.AddInfo(SearchString + " found here");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Search Medor, search....
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void searchButton_Click(object sender, EventArgs e)
        {
            Medor medor = new Medor(searchTextBox.Text);

            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                dictionary.ClearMessages();
                medor.visit(dictionary);
            }
            MDIWindow.Refresh();

            Close();
        }

        /// <summary>
        /// Launch search by pressing Enter key
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void searchTextBox_KeyDown(object sender, System.Windows.Forms.KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                Medor medor = new Medor(searchTextBox.Text);

                foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    dictionary.ClearMessages();
                    medor.visit(dictionary);
                }
                MDIWindow.Refresh();

                Close();
            }
        }
    }
}
