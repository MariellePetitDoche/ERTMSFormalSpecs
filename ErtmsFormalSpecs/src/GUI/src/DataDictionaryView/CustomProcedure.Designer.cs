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
namespace GUI.DataDictionaryView
{
    partial class CustomProcedure
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Btn_Add = new System.Windows.Forms.Button();
            this.CbB_Types = new System.Windows.Forms.ComboBox();
            this.Lbl_ProcedureName = new System.Windows.Forms.Label();
            this.Lbl_VariableIN = new System.Windows.Forms.Label();
            this.Lbl_VariableOut = new System.Windows.Forms.Label();
            this.Lbl_Request = new System.Windows.Forms.Label();
            this.Lbl_DisableRequest = new System.Windows.Forms.Label();
            this.TxtB_ProcedureName = new System.Windows.Forms.TextBox();
            this.TxtB_VariableIn = new System.Windows.Forms.TextBox();
            this.TxtB_VariableOut = new System.Windows.Forms.TextBox();
            this.TxtB_VariableRequest = new System.Windows.Forms.TextBox();
            this.TxtB_VariableRequestDisabled = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // Btn_Add
            // 
            this.Btn_Add.Location = new System.Drawing.Point(105, 177);
            this.Btn_Add.Name = "Btn_Add";
            this.Btn_Add.Size = new System.Drawing.Size(94, 23);
            this.Btn_Add.TabIndex = 5;
            this.Btn_Add.Text = "Add procedure";
            this.Btn_Add.UseVisualStyleBackColor = true;
            this.Btn_Add.Click += new System.EventHandler(this.Btn_Add_Click);
            // 
            // CbB_Types
            // 
            this.CbB_Types.FormattingEnabled = true;
            this.CbB_Types.Location = new System.Drawing.Point(12, 150);
            this.CbB_Types.Name = "CbB_Types";
            this.CbB_Types.Size = new System.Drawing.Size(290, 21);
            this.CbB_Types.TabIndex = 1;
            this.CbB_Types.SelectedIndexChanged += new System.EventHandler(this.CbB_Types_SelectedIndexChanged);
            // 
            // Lbl_ProcedureName
            // 
            this.Lbl_ProcedureName.AutoSize = true;
            this.Lbl_ProcedureName.Location = new System.Drawing.Point(12, 16);
            this.Lbl_ProcedureName.Name = "Lbl_ProcedureName";
            this.Lbl_ProcedureName.Size = new System.Drawing.Size(85, 13);
            this.Lbl_ProcedureName.TabIndex = 2;
            this.Lbl_ProcedureName.Text = "Procedure name";
            // 
            // Lbl_VariableIN
            // 
            this.Lbl_VariableIN.AutoSize = true;
            this.Lbl_VariableIN.Location = new System.Drawing.Point(12, 42);
            this.Lbl_VariableIN.Name = "Lbl_VariableIN";
            this.Lbl_VariableIN.Size = new System.Drawing.Size(88, 13);
            this.Lbl_VariableIN.TabIndex = 3;
            this.Lbl_VariableIN.Text = "Variable IN name";
            // 
            // Lbl_VariableOut
            // 
            this.Lbl_VariableOut.AutoSize = true;
            this.Lbl_VariableOut.Location = new System.Drawing.Point(12, 68);
            this.Lbl_VariableOut.Name = "Lbl_VariableOut";
            this.Lbl_VariableOut.Size = new System.Drawing.Size(102, 13);
            this.Lbl_VariableOut.TabIndex = 4;
            this.Lbl_VariableOut.Text = "Variable OUT Name";
            // 
            // Lbl_Request
            // 
            this.Lbl_Request.AutoSize = true;
            this.Lbl_Request.Location = new System.Drawing.Point(12, 94);
            this.Lbl_Request.Name = "Lbl_Request";
            this.Lbl_Request.Size = new System.Drawing.Size(76, 13);
            this.Lbl_Request.TabIndex = 5;
            this.Lbl_Request.Text = "Request name";
            // 
            // Lbl_DisableRequest
            // 
            this.Lbl_DisableRequest.AutoSize = true;
            this.Lbl_DisableRequest.Location = new System.Drawing.Point(12, 120);
            this.Lbl_DisableRequest.Name = "Lbl_DisableRequest";
            this.Lbl_DisableRequest.Size = new System.Drawing.Size(109, 13);
            this.Lbl_DisableRequest.TabIndex = 6;
            this.Lbl_DisableRequest.Text = "Disable request name";
            // 
            // TxtB_ProcedureName
            // 
            this.TxtB_ProcedureName.Location = new System.Drawing.Point(130, 13);
            this.TxtB_ProcedureName.Name = "TxtB_ProcedureName";
            this.TxtB_ProcedureName.Size = new System.Drawing.Size(172, 20);
            this.TxtB_ProcedureName.TabIndex = 0;
            this.TxtB_ProcedureName.Text = "ProcedureDMI";
            // 
            // TxtB_VariableIn
            // 
            this.TxtB_VariableIn.Location = new System.Drawing.Point(130, 39);
            this.TxtB_VariableIn.Name = "TxtB_VariableIn";
            this.TxtB_VariableIn.Size = new System.Drawing.Size(172, 20);
            this.TxtB_VariableIn.TabIndex = 1;
            this.TxtB_VariableIn.Text = "VariableIN";
            // 
            // TxtB_VariableOut
            // 
            this.TxtB_VariableOut.Location = new System.Drawing.Point(130, 65);
            this.TxtB_VariableOut.Name = "TxtB_VariableOut";
            this.TxtB_VariableOut.Size = new System.Drawing.Size(172, 20);
            this.TxtB_VariableOut.TabIndex = 2;
            this.TxtB_VariableOut.Text = "VariableOUT";
            // 
            // TxtB_VariableRequest
            // 
            this.TxtB_VariableRequest.Location = new System.Drawing.Point(130, 91);
            this.TxtB_VariableRequest.Name = "TxtB_VariableRequest";
            this.TxtB_VariableRequest.Size = new System.Drawing.Size(172, 20);
            this.TxtB_VariableRequest.TabIndex = 3;
            this.TxtB_VariableRequest.Text = "VariableReq";
            // 
            // TxtB_VariableRequestDisabled
            // 
            this.TxtB_VariableRequestDisabled.Location = new System.Drawing.Point(130, 117);
            this.TxtB_VariableRequestDisabled.Name = "TxtB_VariableRequestDisabled";
            this.TxtB_VariableRequestDisabled.Size = new System.Drawing.Size(172, 20);
            this.TxtB_VariableRequestDisabled.TabIndex = 4;
            this.TxtB_VariableRequestDisabled.Text = "VariableReqDisabled";
            // 
            // CustomProcedure
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(314, 212);
            this.Controls.Add(this.TxtB_VariableRequestDisabled);
            this.Controls.Add(this.TxtB_VariableRequest);
            this.Controls.Add(this.TxtB_VariableOut);
            this.Controls.Add(this.TxtB_VariableIn);
            this.Controls.Add(this.TxtB_ProcedureName);
            this.Controls.Add(this.Lbl_DisableRequest);
            this.Controls.Add(this.Lbl_Request);
            this.Controls.Add(this.Lbl_VariableOut);
            this.Controls.Add(this.Lbl_VariableIN);
            this.Controls.Add(this.Lbl_ProcedureName);
            this.Controls.Add(this.CbB_Types);
            this.Controls.Add(this.Btn_Add);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "CustomProcedure";
            this.ShowInTaskbar = false;
            this.Text = "Add custom procedure";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Btn_Add;
        private System.Windows.Forms.ComboBox CbB_Types;
        private System.Windows.Forms.Label Lbl_ProcedureName;
        private System.Windows.Forms.Label Lbl_VariableIN;
        private System.Windows.Forms.Label Lbl_VariableOut;
        private System.Windows.Forms.Label Lbl_Request;
        private System.Windows.Forms.Label Lbl_DisableRequest;
        private System.Windows.Forms.TextBox TxtB_ProcedureName;
        private System.Windows.Forms.TextBox TxtB_VariableIn;
        private System.Windows.Forms.TextBox TxtB_VariableOut;
        private System.Windows.Forms.TextBox TxtB_VariableRequest;
        private System.Windows.Forms.TextBox TxtB_VariableRequestDisabled;
    }
}