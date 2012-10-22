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
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class SubVariablesTreeNode : DataTreeNode<DataDictionary.Variables.Variable>
    {
        /// <summary>
        /// The editor for Train data variables
        /// </summary>
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
        /// <param name="encounteredTypes">the types that have already been encountered in the path to create this variable </param>
        public SubVariablesTreeNode(DataDictionary.Variables.Variable item, HashSet<DataDictionary.Types.Type> encounteredTypes)
            : base("Sub variables", item)
        {
            foreach (DataDictionary.Variables.IVariable ivariable in item.SubVariables.Values)
            {
                DataDictionary.Variables.Variable variable = ivariable as DataDictionary.Variables.Variable;
                if (variable != null)
                {
                    if (variable.Type == null)
                    {
                        Nodes.Add(new VariableTreeNode(variable, encounteredTypes));
                    }
                    else
                    {
                        if (!encounteredTypes.Contains(variable.Type))
                        {
                            encounteredTypes.Add(variable.Type);
                            Nodes.Add(new VariableTreeNode(variable, encounteredTypes));
                            encounteredTypes.Remove(variable.Type);
                        }
                    }
                }
            }

            foreach (DataDictionary.Variables.IProcedure iprocedure in item.SubProcedures.Values)
            {
                DataDictionary.Variables.Procedure procedure = iprocedure as DataDictionary.Variables.Procedure;
                if (procedure != null)
                {
                    if (procedure.CurrentState != null)
                    {
                        Nodes.Add(new VariableTreeNode(procedure.CurrentState, procedure.Name, encounteredTypes));
                    }
                }
            }

            ImageIndex = 1;
            SelectedImageIndex = 1;

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
    }
}
