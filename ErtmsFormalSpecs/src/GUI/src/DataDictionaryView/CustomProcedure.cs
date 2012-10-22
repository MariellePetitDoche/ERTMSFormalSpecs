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

namespace GUI.DataDictionaryView
{
    public partial class CustomProcedure : Form
    {
        public enum CustomProcedureType
        {
            DMI_In,
            DMI_Out
        }

        public class DMIProcedureConfig
        {
            public string ProcedureName { set; get; }
            public string VariableInName { set; get; }
            public string VariableOutName { set; get; }
            public string VariableRequestName { set; get; }
            public string VariableRequestDisabledName { set; get; }
            public CustomProcedureType Type { set; get; }
        }

        public delegate void CustomProcedureCreator(DMIProcedureConfig aConfig);
        public CustomProcedureCreator CreateCustomProcedure;

        public CustomProcedure(string type, CustomProcedureCreator aCustomProcedureCreator)
        {
            InitializeComponent();
            CbB_Types.DataSource = Enum.GetValues(typeof(CustomProcedureType));
            Lbl_ProcedureName.Text = type + " name";
            TxtB_ProcedureName.Text = type + "Out";
            Btn_Add.Text = "Add " + type;
            CreateCustomProcedure = aCustomProcedureCreator;
        }

        private void Btn_Add_Click(object sender, EventArgs e)
        {
            if (CreateCustomProcedure != null)
            {
                DMIProcedureConfig aConfig = new DMIProcedureConfig();
                aConfig.ProcedureName = TxtB_ProcedureName.Text;
                aConfig.VariableInName = TxtB_VariableIn.Text;
                aConfig.VariableOutName = TxtB_VariableOut.Text;
                aConfig.VariableRequestName = TxtB_VariableRequest.Text;
                aConfig.VariableRequestDisabledName = TxtB_VariableRequestDisabled.Text;
                aConfig.Type = (CustomProcedureType)Enum.Parse(typeof(CustomProcedureType), CbB_Types.SelectedValue.ToString());
                CreateCustomProcedure(aConfig);
            }
            this.Hide();
        }

        private void CbB_Types_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch (CbB_Types.SelectedItem.ToString())
            {
                case ("DMI_In"):
                    {
                        TxtB_ProcedureName.Text = "ProcedureIn";
                        TxtB_VariableIn.Text = "DriverAnswered";
                        TxtB_VariableIn.Enabled = true;
                        TxtB_VariableOut.Text = "DisplayRequested";
                        TxtB_VariableRequest.Text = "RequestStatus";
                        TxtB_VariableRequestDisabled.Text = "";
                        TxtB_VariableRequestDisabled.Enabled = false;
                        break;
                    }
                case ("DMI_Out"):
                    {
                        TxtB_ProcedureName.Text = "ProcedureOut";
                        TxtB_VariableIn.Text = "";
                        TxtB_VariableIn.Enabled = false;
                        TxtB_VariableOut.Text = "DisplayRequested";
                        TxtB_VariableRequest.Text = "ShowRequestStatus";
                        TxtB_VariableRequestDisabled.Text = "HideRequestStatus";
                        TxtB_VariableRequestDisabled.Enabled = true;
                        break;
                    }
            }
        }
    }
}
