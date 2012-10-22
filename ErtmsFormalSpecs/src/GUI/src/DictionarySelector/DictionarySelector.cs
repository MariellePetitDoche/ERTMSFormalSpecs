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

namespace GUI.DictionarySelector
{
    public partial class DictionarySelector : Form
    {
        /// <summary>
        /// An entry in the list box
        /// </summary>
        private class ListBoxEntry
        {
            /// <summary>
            /// The reference entry
            /// </summary>
            public DataDictionary.Dictionary Dictionary { get; private set; }

            /// <summary>
            /// The display name of the entry
            /// </summary>
            public string Name { get { return Dictionary.Name; } }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="dictionary"></param>
            public ListBoxEntry(DataDictionary.Dictionary dictionary)
            {
                Dictionary = dictionary;
            }
        }

        /// <summary>
        /// Constructor (for designer)
        /// </summary>
        public DictionarySelector()
        {
            InitializeComponent();
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem">The EFSSystem for which this rule set selector is created</param>
        public DictionarySelector(DataDictionary.EFSSystem efsSystem)
        {
            InitializeComponent();
            EFSSystem = efsSystem;
        }

        /// <summary>
        /// The associated EFS System
        /// </summary>
        private DataDictionary.EFSSystem efsSystem;
        public DataDictionary.EFSSystem EFSSystem
        {
            get { return efsSystem; }
            private set
            {
                efsSystem = value;
                System.Collections.ArrayList entries = new System.Collections.ArrayList();
                foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    entries.Add(new ListBoxEntry(dictionary));
                }
                dataDictionaryListBox.DataSource = entries;
                dataDictionaryListBox.DisplayMember = "Name";
                dataDictionaryListBox.ValueMember = "Dictionary";
            }
        }

        /// <summary>
        /// The selected dictionary
        /// </summary>
        public DataDictionary.Dictionary Selected { get; private set; }

        /// <summary>
        /// Handles the click event on the select button : 
        ///   - stores the selected dictionary
        ///   - close the window
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void selectButton_Click(object sender, EventArgs e)
        {
            Selected = null;

            ListBoxEntry selected = dataDictionaryListBox.SelectedItem as ListBoxEntry;
            if (selected != null)
            {
                Selected = selected.Dictionary;
            }

            Close();
        }
    }
}
