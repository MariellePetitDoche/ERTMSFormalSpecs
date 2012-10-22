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
using System.Windows.Forms;
using DataDictionary.Types;

namespace GUI.DataDictionaryView
{
    public partial class CustomAction : Form
    {
        private Structure myStructure;

        private enum StateNames
        {
            Active,
            Available,
            NationalSystemAvailability,
            NotApplicable,
            NotAvailable
        }

        public delegate ActionTreeNode CustomActionCreator(DataDictionary.Rules.Action anAction);
        public CustomActionCreator CreateCustomAction;


        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="aStructure"></param>
        public CustomAction(Structure aStructure)
        {
            InitializeComponent();

            myStructure = aStructure;
            CbB_StateName.DataSource = System.Enum.GetValues(typeof(StateNames));

            /* Creation of the list of check boxes */
            if (myStructure != null)
            {
                int X = 17;
                int Y = 17;
                foreach (StructureElement element in aStructure.Elements)
                {
                    if (element.Type is Structure)
                    {
                        Structure structure = DataDictionary.OverallStructureFinder.INSTANCE.findByName(myStructure.Dictionary, element.Type.FullName);
                        if (structure != null)
                        {
                            foreach (DataDictionary.Types.StructureProcedure procedure in structure.Procedures)
                            {
                                System.Windows.Forms.CheckBox aCheckBox = new System.Windows.Forms.CheckBox();
                                aCheckBox.AutoSize = true;
                                aCheckBox.Location = new System.Drawing.Point(X, Y);
                                aCheckBox.Name = "Cb_StateType";
                                aCheckBox.Size = new System.Drawing.Size(74, 17);
                                aCheckBox.Text = element.Name + "." + procedure.Name;
                                aCheckBox.UseVisualStyleBackColor = true;
                                this.GrB_Procedures.Controls.Add(aCheckBox);
                                Y += 20;
                                if (Y > GrB_Procedures.Height - 22)
                                {
                                    X += 407;
                                    Y = 17;
                                }
                            }
                        }
                    }
                }
            }
        }

        private void Btn_AddActions_Click(object sender, EventArgs e)
        {
            foreach (Control control in GrB_Procedures.Controls)
            {
                if (control is CheckBox)
                {
                    // For each selected check box an action is created
                    CheckBox aCheckBox = control as CheckBox;
                    if (aCheckBox.Checked == true)
                    {
                        DataDictionary.Rules.Action anAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
                        anAction.ExpressionText = aCheckBox.Text + ".CurrentState" + " <- " + aCheckBox.Text + "." + CbB_StateName.SelectedItem.ToString();
                        CreateCustomAction(anAction);
                    }
                }
            }
            this.Hide();
        }

        private void Cb_CheckAll_CheckedChanged(object sender, EventArgs e)
        {
            foreach (Control control in GrB_Procedures.Controls)
            {
                if (control is CheckBox)
                {
                    CheckBox aCheckBox = control as CheckBox;
                    aCheckBox.Checked = Cb_CheckAll.Checked;
                }
            }
        }
    }
}