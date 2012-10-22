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
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class RulePreConditionsTreeNode : RuleConditionTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="children"></param>
        public RulePreConditionsTreeNode(DataDictionary.Rules.RuleCondition item)
            : base("Pre conditions", item)
        {
            foreach (DataDictionary.Rules.PreCondition preCondition in item.PreConditions)
            {
                Nodes.Add(new PreConditionTreeNode(preCondition));
            }
            ImageIndex = 1;
            SelectedImageIndex = 1;
        }

        /// <summary>
        /// Adds a preCondition to the modelized item
        /// </summary>
        /// <param name="preCondition"></param>
        /// <returns></returns>
        public override PreConditionTreeNode AddPreCondition(DataDictionary.Rules.PreCondition preCondition)
        {
            PreConditionTreeNode retVal = new PreConditionTreeNode(preCondition);

            Item.appendPreConditions(preCondition);
            Nodes.Add(retVal);
            SortSubNodes();

            Item.setVerified(false);

            return retVal;
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.PreCondition preCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            preCondition.Condition = "<empty>";
            AddPreCondition(preCondition);
        }

        /// <summary>
        /// Handles a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            if (SourceNode is DataDictionaryView.PreConditionTreeNode)
            {
                if (MessageBox.Show("Are you sure you want to move the corresponding pre-condition ?", "Move pre-condition", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {
                    DataDictionaryView.PreConditionTreeNode preConditionTreeNode = (DataDictionaryView.PreConditionTreeNode)SourceNode;

                    DataDictionary.Rules.PreCondition preCondition = preConditionTreeNode.Item;
                    preConditionTreeNode.Delete();
                    AddPreCondition(preCondition);
                }
            }
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
    }
}
