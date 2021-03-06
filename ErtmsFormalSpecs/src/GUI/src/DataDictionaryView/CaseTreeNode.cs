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
using DataDictionary.Functions;

namespace GUI.DataDictionaryView
{
    public class CaseTreeNode : DataTreeNode<Case>
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

            [Category("Description")]
            public string Expression
            {
                get { return Item.getExpression(); }
                set
                {
                    Item.ExpressionText = value;
                    RefreshNode();
                }
            }
        }


        private PreConditionsTreeNode PreConditions;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public CaseTreeNode(Case aCase)
            : base(aCase)
        {
            PreConditions = new PreConditionsTreeNode(aCase);
            Nodes.Add(PreConditions);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public CaseTreeNode(Case aCase, string name, bool isFolder)
            : base(aCase, name, isFolder)
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

        public void AddPreConditionHandler(object sender, EventArgs args)
        {
            DataDictionary.Rules.PreCondition preCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            preCondition.Condition = "<empty>";
            PreConditions.AddPreCondition(preCondition);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add pre-condition", new EventHandler(AddPreConditionHandler)));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
