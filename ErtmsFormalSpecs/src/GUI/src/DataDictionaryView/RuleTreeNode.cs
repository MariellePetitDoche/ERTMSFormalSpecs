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

using System.Drawing;
using System.Drawing.Design;

namespace GUI.DataDictionaryView
{
    public class RuleTreeNode : ReqRelatedTreeNode<DataDictionary.Rules.Rule>
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

            /// <summary>
            /// The item name
            /// </summary>
            [Category("Description"), TypeConverter(typeof(RulePriorityConverter))]
            public DataDictionary.Generated.acceptor.RulePriority Priority
            {
                get { return Item.getPriority(); }
                set { Item.setPriority(value); }
            }
        }

        private RuleConditionsTreeNode Conditions;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public RuleTreeNode(DataDictionary.Rules.Rule item)
            : base(item)
        {
            Conditions = new RuleConditionsTreeNode(item);
            Nodes.Add(Conditions);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public RuleTreeNode(string name, DataDictionary.Rules.Rule item)
            : base(name, item, false)
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

        public override void SelectionChanged()
        {
            base.SelectionChanged();

            DataDictionaryView.Window window = BaseForm as DataDictionaryView.Window;
            if (window != null)
            {
                window.requirementsTextBox.Lines = Utils.Utils.toStrings(Item.getRequirements());
            }
        }

        /// <summary>
        /// Handles a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);
        }

        /// <summary>
        /// Disable the rule, in a specific data dictionary
        /// </summary>
        public void DisableHandler(object sender, EventArgs args)
        {
            DataDictionary.Dictionary dictionary = MainWindow.GetActiveDictionary();

            if (dictionary != null)
            {
                dictionary.AppendRuleDisabling(Item);
                MainWindow.RefreshModel();
            }
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Disable", new EventHandler(DisableHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
