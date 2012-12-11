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
using System.ComponentModel;
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class StructureProcedureTreeNode : ReqRelatedTreeNode<DataDictionary.Types.StructureProcedure>
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

            [Category("Description")]
            public override string Name
            {
                get { return base.Name; }
                set { base.Name = value; }
            }
        }

        /// <summary>
        /// The state machine tree node 
        /// </summary>
        public StateMachineTreeNode stateMachine;

        /// <summary>
        /// The rules associates to this structure procedure
        /// </summary>
        public StructureProcedureRulesTreeNode rules;

        /// <summary>
        /// The parameters of this structure procedure
        /// </summary>
        public StructureProcedureParametersTreeNode parameters;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public StructureProcedureTreeNode(DataDictionary.Types.StructureProcedure item)
            : base(item)
        {
            stateMachine = new StateMachineTreeNode(item.StateMachine);
            rules = new StructureProcedureRulesTreeNode(item);
            parameters = new StructureProcedureParametersTreeNode(item);
            Nodes.Add(stateMachine);
            Nodes.Add(rules);
            Nodes.Add(parameters);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        public StructureProcedureTreeNode(string name, DataDictionary.Types.StructureProcedure item, bool isFolder)
            : base(item, name, isFolder)
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
        /// Shows the state diagram
        /// </summary>
        public override void DoubleClickHandler()
        {
            stateMachine.ViewDiagram();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        /// <summary>
        /// Called before the selection changes
        /// </summary>
        public override void BeforeSelectionChange()
        {
            if (BaseTreeView != null)
            {
                Window window = BaseTreeView.ParentForm as Window;
                if (window != null)
                {
                    window.ruleExplainTextBox.Visible = true;
                    window.stateDiagramPanel.Visible = false;
                }
            }

            base.BeforeSelectionChange();
        }

        /// <summary>
        /// Handles a selection change event
        /// </summary>
        public override void SelectionChanged()
        {
            Window window = BaseTreeView.ParentForm as Window;
            if (window != null)
            {
                window.stateDiagramPanel.StateMachine = Item.StateMachine;
                window.ruleExplainTextBox.Visible = false;
                window.stateDiagramPanel.Visible = true;
            }

            base.SelectionChanged();
        }
    }
}
