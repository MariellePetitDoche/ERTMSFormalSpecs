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

namespace GUI.TestRunnerView.TimeLineControl
{
    public partial class Filtering : Form
    {
        public Filtering()
        {
            InitializeComponent();

            nameSpaceTreeView.AfterCheck += new TreeViewEventHandler(nameSpaceTreeView_AfterCheck);
        }

        void nameSpaceTreeView_AfterCheck(object sender, TreeViewEventArgs e)
        {
            NamableTreeNode node = e.Node as NamableTreeNode;
            foreach (NamableTreeNode subNode in node.Nodes)
            {
                subNode.Checked = node.Checked;
            }
        }

        /// <summary>
        /// A tree node that references a namable
        /// </summary>
        private class NamableTreeNode : TreeNode
        {
            /// <summary>
            /// The referenced namable
            /// </summary>
            public Utils.INamable Namable { get; private set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="namable"></param>
            public NamableTreeNode(Utils.INamable namable)
            {
                Namable = namable;
                Text = Namable.Name;
                Expand();
            }
        }

        /// <summary>
        /// Configures the filtering dialog
        /// </summary>
        /// <param name="efsSystem"></param>
        /// <param name="filterConfiguration"></param>
        public void Configure(DataDictionary.EFSSystem efsSystem, FilterConfiguration filterConfiguration)
        {
            ruleActivationCheckBox.Checked = filterConfiguration.RuleFired;
            expectationsCheckBox.Checked = filterConfiguration.Expect;
            variableUpdateCheckBox.Checked = filterConfiguration.VariableUpdate;

            List<DataDictionary.Dictionary> dictionaries = new List<DataDictionary.Dictionary>(efsSystem.Dictionaries);
            dictionaries.Sort(compare);
            foreach (DataDictionary.Dictionary dictionary in dictionaries)
            {
                NamableTreeNode dictionaryTreeNode = new NamableTreeNode(dictionary);
                nameSpaceTreeView.Nodes.Add(dictionaryTreeNode);

                List<DataDictionary.Types.NameSpace> nameSpaces = new List<DataDictionary.Types.NameSpace>();
                foreach (DataDictionary.Types.NameSpace nameSpace in dictionary.NameSpaces)
                {
                    nameSpaces.Add(nameSpace);
                }
                nameSpaces.Sort();

                foreach (DataDictionary.Types.NameSpace nameSpace in nameSpaces)
                {
                    GatherNamespaces(dictionaryTreeNode, nameSpace, filterConfiguration);
                }
            }

            regExpTextBox.Text = filterConfiguration.RegExp;
        }

        /// <summary>
        /// Provides a comparator for sort method
        /// </summary>
        /// <param name="x">First dictionary</param>
        /// <param name="y">Second discionary</param>
        /// <returns></returns>
        private static int compare(DataDictionary.Dictionary x, DataDictionary.Dictionary y)
        {
            int retVal = 0;  // x = y
            if (String.Compare(x.Name, y.Name) < 0)  // x < y
            {
                retVal = -1;
            }
            else if (String.Compare(x.Name, y.Name) > 0)  // x > y
            {
                retVal = 1;
            }
            return retVal;
        }

        /// <summary>
        /// Fills the tree view with the namespace and enclosed namespaces
        /// </summary>
        /// <param name="treeNode"></param>
        /// <param name="nameSpace"></param>
        /// <param name="filterConfiguration">The filter configuration used to set up the check boxes</param>
        private void GatherNamespaces(TreeNode treeNode, DataDictionary.Types.NameSpace nameSpace, FilterConfiguration filterConfiguration)
        {
            NamableTreeNode nameSpaceTreeNode = new NamableTreeNode(nameSpace);
            nameSpaceTreeNode.Checked = filterConfiguration.NameSpaces.Contains(nameSpace);
            treeNode.Nodes.Add(nameSpaceTreeNode);

            List<DataDictionary.Types.NameSpace> subNameSpaces = new List<DataDictionary.Types.NameSpace>();
            foreach (DataDictionary.Types.NameSpace otherNameSpace in nameSpace.SubNameSpaces)
            {
                subNameSpaces.Add(otherNameSpace);
            }
            subNameSpaces.Sort();

            foreach (DataDictionary.Types.NameSpace subNameSpace in subNameSpaces)
            {
                GatherNamespaces(nameSpaceTreeNode, subNameSpace, filterConfiguration);
            }
        }

        /// <summary>
        /// Updates the configuration according to the user selected filters
        /// </summary>
        /// <param name="filterConfiguration"></param>
        public void UpdateConfiguration(FilterConfiguration filterConfiguration)
        {
            filterConfiguration.RuleFired = ruleActivationCheckBox.Checked;
            filterConfiguration.Expect = expectationsCheckBox.Checked;
            filterConfiguration.VariableUpdate = variableUpdateCheckBox.Checked;

            filterConfiguration.NameSpaces.Clear();
            foreach (NamableTreeNode node in nameSpaceTreeView.Nodes)
            {
                UpdateConfiguration(node, filterConfiguration);
            }

            filterConfiguration.RegExp = regExpTextBox.Text;
        }

        /// <summary>
        /// Updates the namespace configuration according to the provided node, and enclosed nodes
        /// </summary>
        /// <param name="node"></param>
        /// <param name="filterConfiguration"></param>
        private void UpdateConfiguration(NamableTreeNode node, FilterConfiguration filterConfiguration)
        {
            DataDictionary.Types.NameSpace nameSpace = node.Namable as DataDictionary.Types.NameSpace;
            if (nameSpace != null)
            {
                if (node.Checked)
                {
                    filterConfiguration.NameSpaces.Add(nameSpace);
                }
            }

            foreach (NamableTreeNode subNode in node.Nodes)
            {
                UpdateConfiguration(subNode, filterConfiguration);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Close();
        }

    }
}
