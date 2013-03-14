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
    public class RuleConditionTreeNode : ReqRelatedTreeNode<DataDictionary.Rules.RuleCondition>
    {
        private class ItemEditor : ReqRelatedEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }
        }

        private RulePreConditionsTreeNode PreConditions;
        private ActionsTreeNode Actions;
        private SubRulesTreeNode SubRules;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public RuleConditionTreeNode(DataDictionary.Rules.RuleCondition item)
            : base(item)
        {
            PreConditions = new RulePreConditionsTreeNode(item);
            Nodes.Add(PreConditions);

            Actions = new ActionsTreeNode(item);
            Nodes.Add(Actions);

            SubRules = new SubRulesTreeNode(item);
            Nodes.Add(SubRules);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public RuleConditionTreeNode(DataDictionary.Rules.RuleCondition item, string name, bool isFolder = false)
            : base(item, name, false, true)
        {
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
        /// Handles a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is ActionTreeNode)
            {
                Actions.AcceptDrop(SourceNode);
            }
            else if (SourceNode is PreConditionTreeNode)
            {
                PreConditions.AcceptDrop(SourceNode);
            }
            else if (SourceNode is RuleTreeNode)
            {
                SubRules.AcceptDrop(SourceNode);
            }
        }

        /// <summary>
        /// Adds a precondition
        /// </summary>
        public void AddPreConditionHandler(object sender, EventArgs args)
        {
            PreConditions.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a precondition
        /// </summary>
        /// <param name="preCondition"></param>
        /// <returns></returns>
        public virtual PreConditionTreeNode AddPreCondition(DataDictionary.Rules.PreCondition preCondition)
        {
            return PreConditions.AddPreCondition(preCondition);
        }

        /// <summary>
        /// Adds an action
        /// </summary>
        public void AddActionHandler(object sender, EventArgs args)
        {
            Actions.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds an action
        /// </summary>
        /// <param name="action"></param>
        /// <returns></returns>
        public virtual ActionTreeNode AddAction(DataDictionary.Rules.Action action)
        {
            return Actions.AddAction(action);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add preCondition", new EventHandler(AddPreConditionHandler)));
            retVal.Add(new MenuItem("Add action", new EventHandler(AddActionHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
