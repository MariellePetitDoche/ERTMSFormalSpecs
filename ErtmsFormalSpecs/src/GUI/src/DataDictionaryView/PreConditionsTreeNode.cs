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
    public class PreConditionsTreeNode : CaseTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="children"></param>
        public PreConditionsTreeNode(DataDictionary.Functions.Case item)
            : base(item, "Pre condition", true)
        {
            foreach (DataDictionary.Rules.PreCondition preCondition in item.PreConditions)
            {
                Nodes.Add(new DataDictionaryView.PreConditionTreeNode(preCondition));
            }
        }

        /// <summary>
        /// Create structure based on the subsystem structure
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is PreConditionTreeNode)
            {
                if (MessageBox.Show("Are you sure you want to move the corresponding function ?", "Move action", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {
                    PreConditionTreeNode node = SourceNode as PreConditionTreeNode;
                    DataDictionary.Rules.PreCondition preCondition = node.Item;
                    node.Delete();
                    AddPreCondition(preCondition);
                }
            }
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.PreCondition preCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            preCondition.Condition = "<empty>";
            AddPreCondition(preCondition);
        }

        /// <summary>
        /// Adds a preCondition to the modelized item
        /// </summary>
        /// <param name="preCondition"></param>
        public void AddPreCondition(DataDictionary.Rules.PreCondition preCondition)
        {
            Item.appendPreConditions(preCondition);
            Nodes.Add(new DataDictionaryView.PreConditionTreeNode(preCondition));
            SortSubNodes();
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
