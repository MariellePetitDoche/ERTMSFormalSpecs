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
using System.Windows.Forms;

namespace GUI.TestRunnerView
{
    public partial class ExplainBox : Form
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public ExplainBox()
        {
            InitializeComponent();
        }

        /// <summary>
        /// Sets the node, and its subnode according to the content of the explanation
        /// </summary>
        /// <param name="part"></param>
        /// <param name="node"></param>
        private void innerSetExplanation(DataDictionary.Interpreter.ExplanationPart part, TreeNode node)
        {
            node.Text = part.Message;
            node.Nodes.Clear();

            foreach (DataDictionary.Interpreter.ExplanationPart subPart in part.SubExplanations)
            {
                TreeNode subNode = new TreeNode();
                innerSetExplanation(subPart, subNode);
                node.Nodes.Add(subNode);
            }
        }

        /// <summary>
        /// Sets the explanation for this explain box
        /// </summary>
        /// <param name="explanation"></param>
        public void setExplanation(DataDictionary.Interpreter.ExplanationPart explanation)
        {
            TreeNode node = new TreeNode();
            innerSetExplanation(explanation, node);

            explainTreeView.Nodes.Clear();
            explainTreeView.Nodes.Add(node);
            explainTreeView.ExpandAll();
        }
    }
}
