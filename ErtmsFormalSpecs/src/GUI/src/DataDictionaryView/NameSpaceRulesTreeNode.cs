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

namespace GUI.DataDictionaryView
{
    public class NameSpaceRulesTreeNode : DataTreeNode<DataDictionary.Types.NameSpace>
    {
        /// <summary>
        /// The editor for message variables
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
        /// <param name="name"></param>
        public NameSpaceRulesTreeNode(DataDictionary.Types.NameSpace item)
            : base(item, "Rules", true)
        {
            foreach (DataDictionary.Rules.Rule rule in item.Rules)
            {
                Nodes.Add(new RuleTreeNode(rule));
            }
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

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.Rule rule = (DataDictionary.Rules.Rule)DataDictionary.Generated.acceptor.getFactory().createRule();
            rule.Name = "<Rule" + (GetNodeCount(false) + 1) + ">";
            AddRule(rule);
        }

        /// <summary>
        /// Adds a rule in the corresponding namespace
        /// </summary>
        /// <param name="variable"></param>
        public RuleTreeNode AddRule(DataDictionary.Rules.Rule rule)
        {
            Item.appendRules(rule);
            RuleTreeNode retVal = new RuleTreeNode(rule);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add", new EventHandler(AddHandler)));

            return retVal;
        }

        /// <summary>
        /// Accepts drop of a tree node, in a drag & drop operation
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is RuleTreeNode)
            {
                RuleTreeNode ruleTreeNode = SourceNode as RuleTreeNode;
                DataDictionary.Rules.Rule rule = ruleTreeNode.Item;

                ruleTreeNode.Delete();
                AddRule(rule);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Rules.Rule rule = (DataDictionary.Rules.Rule)DataDictionary.Generated.acceptor.getFactory().createRule();
                rule.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                rule.appendRequirements(reqRef);
                AddRule(rule);
            }
        }

        /// <summary>
        /// Update counts according to the selected folder
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();
            (BaseForm as Window).toolStripStatusLabel.Text = Item.Rules.Count + (Item.Rules.Count > 1 ? " rules " : " rule ") + "selected.";
        }
    }
}
