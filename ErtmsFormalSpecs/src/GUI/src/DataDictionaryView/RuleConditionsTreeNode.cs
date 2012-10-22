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
using System.ComponentModel;
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class RuleConditionsTreeNode : DataTreeNode<DataDictionary.Rules.Rule>
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
        public RuleConditionsTreeNode(DataDictionary.Rules.Rule item)
            : base("Conditions", item)
        {
            foreach (DataDictionary.Rules.RuleCondition ruleCondition in item.RuleConditions)
            {
                Nodes.Add(new RuleConditionTreeNode(ruleCondition));
            }
            ImageIndex = 1;
            SelectedImageIndex = 1;
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
        /// Create structure based on the subsystem structure
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is RuleConditionTreeNode)
            {
                RuleConditionTreeNode node = SourceNode as RuleConditionTreeNode;
                DataDictionary.Rules.RuleCondition ruleCondition = node.Item;
                node.Delete();
                AddRuleCondition(ruleCondition);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Rules.RuleCondition ruleCondition = (DataDictionary.Rules.RuleCondition)DataDictionary.Generated.acceptor.getFactory().createRuleCondition();
                ruleCondition.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                ruleCondition.appendRequirements(reqRef);
                AddRuleCondition(ruleCondition);
            }
        }

        private void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.RuleCondition rule = (DataDictionary.Rules.RuleCondition)DataDictionary.Generated.acceptor.getFactory().createRuleCondition();
            rule.Name = "<RuleCondition" + (GetNodeCount(false) + 1) + ">";
            AddRuleCondition(rule);
        }

        /// <summary>
        /// Adds a new rule to the model
        /// </summary>
        /// <param name="ruleCondition"></param>
        public void AddRuleCondition(DataDictionary.Rules.RuleCondition ruleCondition)
        {
            Item.appendConditions(ruleCondition);
            Nodes.Add(new DataDictionaryView.RuleConditionTreeNode(ruleCondition));
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add", new EventHandler(AddHandler)));

            return retVal;
        }
    }
}
