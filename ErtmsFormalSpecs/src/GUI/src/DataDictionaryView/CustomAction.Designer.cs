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
    partial class CustomAction
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
            this.Btn_AddActions = new System.Windows.Forms.Button();
            this.CbB_StateName = new System.Windows.Forms.ComboBox();
            this.Lbl_StateName = new System.Windows.Forms.Label();
            this.GrB_Procedures = new System.Windows.Forms.GroupBox();
            this.Cb_CheckAll = new System.Windows.Forms.CheckBox();
            this.SuspendLayout();
            // 
            // Btn_AddActions
            // 
            this.Btn_AddActions.Location = new System.Drawing.Point(682, 675);
            this.Btn_AddActions.Name = "Btn_AddActions";
            this.Btn_AddActions.Size = new System.Drawing.Size(75, 23);
            this.Btn_AddActions.TabIndex = 0;
            this.Btn_AddActions.Text = "Add actions";
            this.Btn_AddActions.UseVisualStyleBackColor = true;
            this.Btn_AddActions.Click += new System.EventHandler(this.Btn_AddActions_Click);
            // 
            // CbB_StateName
            // 
            this.CbB_StateName.FormattingEnabled = true;
            this.CbB_StateName.Location = new System.Drawing.Point(79, 12);
            this.CbB_StateName.Name = "CbB_StateName";
            this.CbB_StateName.Size = new System.Drawing.Size(174, 21);
            this.CbB_StateName.TabIndex = 1;
            // 
            // Lbl_StateName
            // 
            this.Lbl_StateName.AutoSize = true;
            this.Lbl_StateName.Location = new System.Drawing.Point(12, 15);
            this.Lbl_StateName.Name = "Lbl_StateName";
            this.Lbl_StateName.Size = new System.Drawing.Size(61, 13);
            this.Lbl_StateName.TabIndex = 2;
            this.Lbl_StateName.Text = "State name";
            // 
            // GrB_Procedures
            // 
            this.GrB_Procedures.Location = new System.Drawing.Point(13, 39);
            this.GrB_Procedures.Name = "GrB_Procedures";
            this.GrB_Procedures.Size = new System.Drawing.Size(1274, 630);
            this.GrB_Procedures.TabIndex = 3;
            this.GrB_Procedures.TabStop = false;
            this.GrB_Procedures.Text = "Procedures";
            // 
            // Cb_CheckAll
            // 
            this.Cb_CheckAll.AutoSize = true;
            this.Cb_CheckAll.Location = new System.Drawing.Point(1161, 16);
            this.Cb_CheckAll.Name = "Cb_CheckAll";
            this.Cb_CheckAll.Size = new System.Drawing.Size(126, 17);
            this.Cb_CheckAll.TabIndex = 4;
            this.Cb_CheckAll.Text = "Check all procedures";
            this.Cb_CheckAll.UseVisualStyleBackColor = true;
            this.Cb_CheckAll.CheckedChanged += new System.EventHandler(this.Cb_CheckAll_CheckedChanged);
            // 
            // CustomAction
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1299, 710);
            this.Controls.Add(this.Cb_CheckAll);
            this.Controls.Add(this.GrB_Procedures);
            this.Controls.Add(this.Lbl_StateName);
            this.Controls.Add(this.CbB_StateName);
            this.Controls.Add(this.Btn_AddActions);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "CustomAction";
            this.Text = "Custom actions creator";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Btn_AddActions;
        private System.Windows.Forms.ComboBox CbB_StateName;
        private System.Windows.Forms.Label Lbl_StateName;
        private System.Windows.Forms.GroupBox GrB_Procedures;
        private System.Windows.Forms.CheckBox Cb_CheckAll;
    }
}