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
    public class StateMachineStatesTreeNode : DataTreeNode<DataDictionary.Types.StateMachine>
    {
        private class InternalStateTypeConverter : StateTypeConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                return GetValues(((ItemEditor)context.Instance).Item);
            }
        }

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
        /// <param name="children"></param>
        public StateMachineStatesTreeNode(DataDictionary.Types.StateMachine item)
            : base(item, "States", true)
        {
            foreach (DataDictionary.Constants.State state in item.States)
            {
                Nodes.Add(new StateTreeNode(state));
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
            DataDictionary.Constants.State state = (DataDictionary.Constants.State)DataDictionary.Generated.acceptor.getFactory().createState();
            state.Name = "<State" + (GetNodeCount(false) + 1) + ">";
            AddState(state);
        }

        /// <summary>
        /// Adds a new state 
        /// </summary>
        /// <param name="state"></param>
        public StateTreeNode AddState(DataDictionary.Constants.State state)
        {
            Item.appendStates(state);
            StateTreeNode retVal = new StateTreeNode(state);
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
    }
}
