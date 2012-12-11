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
    public class ActionsTreeNode : RuleConditionTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public ActionsTreeNode(DataDictionary.Rules.RuleCondition item)
            : base(item, "Actions", true)
        {
            foreach (DataDictionary.Rules.Action action in item.Actions)
            {
                Nodes.Add(new ActionTreeNode(action));
            }
            if (Item.EnclosingRule != null && !Item.EnclosingRule.BelongsToAProcedure())
            {
                SortSubNodes();
            }
        }

        public override ActionTreeNode AddAction(DataDictionary.Rules.Action action)
        {
            ActionTreeNode retVal = new ActionTreeNode(action);
            Item.appendActions(action);

            Nodes.Add(retVal);
            if (Item.EnclosingRule != null && !Item.EnclosingRule.BelongsToAProcedure())
            {
                SortSubNodes();
            }

            Item.setVerified(false);
            return retVal;
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.Action action = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            action.Expression = "";
            AddAction(action);
        }

        public void AddCustomHandler(object sender, EventArgs args)
        {
            CustomAction customAction = new CustomAction(Item.EnclosingStructure);
            customAction.CreateCustomAction = AddAction;
            customAction.ShowDialog();
        }

        /// <summary>
        /// Handles a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            if (SourceNode is ActionTreeNode)
            {
                if (MessageBox.Show("Are you sure you want to move the corresponding action ?", "Move action", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {
                    ActionTreeNode actionTreeNode = (ActionTreeNode)SourceNode;

                    DataDictionary.Rules.Action action = actionTreeNode.Item;
                    actionTreeNode.Delete();
                    AddAction(action);
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
            retVal.Add(new MenuItem("Add custom...", new EventHandler(AddCustomHandler)));

            return retVal;
        }
    }
}
