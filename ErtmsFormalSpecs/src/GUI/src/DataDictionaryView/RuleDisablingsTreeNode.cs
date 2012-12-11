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
    public class RuleDisablingsTreeNode : DataTreeNode<DataDictionary.Dictionary>
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
        /// <param name="name"></param>
        public RuleDisablingsTreeNode(DataDictionary.Dictionary item)
            : base(item, "Disabled rules", true)
        {
            foreach (DataDictionary.Rules.RuleDisabling ruleDisabling in item.RuleDisablings)
            {
                Nodes.Add(new RuleDisablingTreeNode(ruleDisabling));
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
            DataDictionary.Rules.RuleDisabling ruleDisabling = (DataDictionary.Rules.RuleDisabling)DataDictionary.Generated.acceptor.getFactory().createRuleDisabling();
            ruleDisabling.Name = "<RuleDisabling" + (GetNodeCount(false) + 1) + ">";
            Item.appendRuleDisablings(ruleDisabling);
            Nodes.Add(new RuleDisablingTreeNode(ruleDisabling));
            SortSubNodes();
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
