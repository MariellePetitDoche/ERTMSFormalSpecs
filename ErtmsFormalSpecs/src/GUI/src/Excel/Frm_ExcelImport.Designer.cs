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
namespace GUI.ExcelImport
{
    partial class Frm_ExcelImport
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
            this.TB_FileName = new System.Windows.Forms.TextBox();
            this.Btn_SelectFile = new System.Windows.Forms.Button();
            this.Btn_Import = new System.Windows.Forms.Button();
            this.CB_EBD = new System.Windows.Forms.CheckBox();
            this.CB_SBD = new System.Windows.Forms.CheckBox();
            this.CB_EBI = new System.Windows.Forms.CheckBox();
            this.CB_SBI1 = new System.Windows.Forms.CheckBox();
            this.CB_SBI2 = new System.Windows.Forms.CheckBox();
            this.CB_FLOI = new System.Windows.Forms.CheckBox();
            this.CB_Warning = new System.Windows.Forms.CheckBox();
            this.CB_Permitted = new System.Windows.Forms.CheckBox();
            this.CB_Indication = new System.Windows.Forms.CheckBox();
            this.CB_Select = new System.Windows.Forms.CheckBox();
            this.CBB_TrainType = new System.Windows.Forms.ComboBox();
            this.CBB_SpeedInterval = new System.Windows.Forms.ComboBox();
            this.L_TrainType = new System.Windows.Forms.Label();
            this.L_SpeedInterval = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // TB_FileName
            // 
            this.TB_FileName.Location = new System.Drawing.Point(13, 181);
            this.TB_FileName.Name = "TB_FileName";
            this.TB_FileName.Size = new System.Drawing.Size(259, 20);
            this.TB_FileName.TabIndex = 0;
            // 
            // Btn_SelectFile
            // 
            this.Btn_SelectFile.Location = new System.Drawing.Point(116, 207);
            this.Btn_SelectFile.Name = "Btn_SelectFile";
            this.Btn_SelectFile.Size = new System.Drawing.Size(75, 23);
            this.Btn_SelectFile.TabIndex = 1;
            this.Btn_SelectFile.Text = "Browse...";
            this.Btn_SelectFile.UseVisualStyleBackColor = true;
            this.Btn_SelectFile.Click += new System.EventHandler(this.Btn_SelectFile_Click);
            // 
            // Btn_Import
            // 
            this.Btn_Import.Location = new System.Drawing.Point(197, 207);
            this.Btn_Import.Name = "Btn_Import";
            this.Btn_Import.Size = new System.Drawing.Size(75, 23);
            this.Btn_Import.TabIndex = 2;
            this.Btn_Import.Text = "Import";
            this.Btn_Import.UseVisualStyleBackColor = true;
            this.Btn_Import.Click += new System.EventHandler(this.Btn_Import_Click);
            // 
            // CB_EBD
            // 
            this.CB_EBD.AutoSize = true;
            this.CB_EBD.Checked = true;
            this.CB_EBD.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_EBD.Location = new System.Drawing.Point(13, 12);
            this.CB_EBD.Name = "CB_EBD";
            this.CB_EBD.Size = new System.Drawing.Size(48, 17);
            this.CB_EBD.TabIndex = 3;
            this.CB_EBD.Tag = "FILTER";
            this.CB_EBD.Text = "EBD";
            this.CB_EBD.UseVisualStyleBackColor = true;
            // 
            // CB_SBD
            // 
            this.CB_SBD.AutoSize = true;
            this.CB_SBD.Checked = true;
            this.CB_SBD.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_SBD.Location = new System.Drawing.Point(13, 35);
            this.CB_SBD.Name = "CB_SBD";
            this.CB_SBD.Size = new System.Drawing.Size(48, 17);
            this.CB_SBD.TabIndex = 4;
            this.CB_SBD.Tag = "FILTER";
            this.CB_SBD.Text = "SBD";
            this.CB_SBD.UseVisualStyleBackColor = true;
            // 
            // CB_EBI
            // 
            this.CB_EBI.AutoSize = true;
            this.CB_EBI.Checked = true;
            this.CB_EBI.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_EBI.Location = new System.Drawing.Point(13, 58);
            this.CB_EBI.Name = "CB_EBI";
            this.CB_EBI.Size = new System.Drawing.Size(43, 17);
            this.CB_EBI.TabIndex = 5;
            this.CB_EBI.Tag = "FILTER";
            this.CB_EBI.Text = "EBI";
            this.CB_EBI.UseVisualStyleBackColor = true;
            // 
            // CB_SBI1
            // 
            this.CB_SBI1.AutoSize = true;
            this.CB_SBI1.Checked = true;
            this.CB_SBI1.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_SBI1.Location = new System.Drawing.Point(100, 12);
            this.CB_SBI1.Name = "CB_SBI1";
            this.CB_SBI1.Size = new System.Drawing.Size(49, 17);
            this.CB_SBI1.TabIndex = 6;
            this.CB_SBI1.Tag = "FILTER";
            this.CB_SBI1.Text = "SBI1";
            this.CB_SBI1.UseVisualStyleBackColor = true;
            // 
            // CB_SBI2
            // 
            this.CB_SBI2.AutoSize = true;
            this.CB_SBI2.Checked = true;
            this.CB_SBI2.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_SBI2.Location = new System.Drawing.Point(100, 35);
            this.CB_SBI2.Name = "CB_SBI2";
            this.CB_SBI2.Size = new System.Drawing.Size(49, 17);
            this.CB_SBI2.TabIndex = 7;
            this.CB_SBI2.Tag = "FILTER";
            this.CB_SBI2.Text = "SBI2";
            this.CB_SBI2.UseVisualStyleBackColor = true;
            // 
            // CB_FLOI
            // 
            this.CB_FLOI.AutoSize = true;
            this.CB_FLOI.Checked = true;
            this.CB_FLOI.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_FLOI.Location = new System.Drawing.Point(100, 58);
            this.CB_FLOI.Name = "CB_FLOI";
            this.CB_FLOI.Size = new System.Drawing.Size(49, 17);
            this.CB_FLOI.TabIndex = 8;
            this.CB_FLOI.Tag = "FILTER";
            this.CB_FLOI.Text = "FLOI";
            this.CB_FLOI.UseVisualStyleBackColor = true;
            // 
            // CB_Warning
            // 
            this.CB_Warning.AutoSize = true;
            this.CB_Warning.Checked = true;
            this.CB_Warning.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_Warning.Location = new System.Drawing.Point(197, 12);
            this.CB_Warning.Name = "CB_Warning";
            this.CB_Warning.Size = new System.Drawing.Size(66, 17);
            this.CB_Warning.TabIndex = 9;
            this.CB_Warning.Tag = "FILTER";
            this.CB_Warning.Text = "Warning";
            this.CB_Warning.UseVisualStyleBackColor = true;
            // 
            // CB_Permitted
            // 
            this.CB_Permitted.AutoSize = true;
            this.CB_Permitted.Checked = true;
            this.CB_Permitted.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_Permitted.Location = new System.Drawing.Point(197, 35);
            this.CB_Permitted.Name = "CB_Permitted";
            this.CB_Permitted.Size = new System.Drawing.Size(70, 17);
            this.CB_Permitted.TabIndex = 10;
            this.CB_Permitted.Tag = "FILTER";
            this.CB_Permitted.Text = "Permitted";
            this.CB_Permitted.UseVisualStyleBackColor = true;
            // 
            // CB_Indication
            // 
            this.CB_Indication.AutoSize = true;
            this.CB_Indication.Checked = true;
            this.CB_Indication.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_Indication.Location = new System.Drawing.Point(197, 58);
            this.CB_Indication.Name = "CB_Indication";
            this.CB_Indication.Size = new System.Drawing.Size(72, 17);
            this.CB_Indication.TabIndex = 11;
            this.CB_Indication.Tag = "FILTER";
            this.CB_Indication.Text = "Indication";
            this.CB_Indication.UseVisualStyleBackColor = true;
            // 
            // CB_Select
            // 
            this.CB_Select.AutoSize = true;
            this.CB_Select.Checked = true;
            this.CB_Select.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_Select.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_Select.Location = new System.Drawing.Point(13, 81);
            this.CB_Select.Name = "CB_Select";
            this.CB_Select.Size = new System.Drawing.Size(81, 17);
            this.CB_Select.TabIndex = 12;
            this.CB_Select.Tag = "GLOBAL_FILTER";
            this.CB_Select.Text = "Deselect all";
            this.CB_Select.UseVisualStyleBackColor = true;
            this.CB_Select.CheckedChanged += new System.EventHandler(this.CB_Select_CheckedChanged);
            // 
            // CBB_TrainType
            // 
            this.CBB_TrainType.FormattingEnabled = true;
            this.CBB_TrainType.Location = new System.Drawing.Point(100, 154);
            this.CBB_TrainType.Name = "CBB_TrainType";
            this.CBB_TrainType.Size = new System.Drawing.Size(172, 21);
            this.CBB_TrainType.TabIndex = 13;
            this.CBB_TrainType.Text = "Lambda train";
            // 
            // CBB_SpeedInterval
            // 
            this.CBB_SpeedInterval.FormattingEnabled = true;
            this.CBB_SpeedInterval.Location = new System.Drawing.Point(100, 127);
            this.CBB_SpeedInterval.Name = "CBB_SpeedInterval";
            this.CBB_SpeedInterval.Size = new System.Drawing.Size(172, 21);
            this.CBB_SpeedInterval.TabIndex = 14;
            this.CBB_SpeedInterval.Text = "1.0";
            // 
            // L_TrainType
            // 
            this.L_TrainType.AutoSize = true;
            this.L_TrainType.Location = new System.Drawing.Point(13, 157);
            this.L_TrainType.Name = "L_TrainType";
            this.L_TrainType.Size = new System.Drawing.Size(57, 13);
            this.L_TrainType.TabIndex = 15;
            this.L_TrainType.Text = "Train type:";
            // 
            // L_SpeedInterval
            // 
            this.L_SpeedInterval.AutoSize = true;
            this.L_SpeedInterval.Location = new System.Drawing.Point(13, 130);
            this.L_SpeedInterval.Name = "L_SpeedInterval";
            this.L_SpeedInterval.Size = new System.Drawing.Size(78, 13);
            this.L_SpeedInterval.TabIndex = 16;
            this.L_SpeedInterval.Text = "Speed interval:";
            // 
            // Frm_ExcelImport
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 242);
            this.Controls.Add(this.L_SpeedInterval);
            this.Controls.Add(this.L_TrainType);
            this.Controls.Add(this.CBB_SpeedInterval);
            this.Controls.Add(this.CBB_TrainType);
            this.Controls.Add(this.CB_Select);
            this.Controls.Add(this.CB_Indication);
            this.Controls.Add(this.CB_Permitted);
            this.Controls.Add(this.CB_Warning);
            this.Controls.Add(this.CB_FLOI);
            this.Controls.Add(this.CB_SBI2);
            this.Controls.Add(this.CB_SBI1);
            this.Controls.Add(this.CB_EBI);
            this.Controls.Add(this.CB_SBD);
            this.Controls.Add(this.CB_EBD);
            this.Controls.Add(this.Btn_Import);
            this.Controls.Add(this.Btn_SelectFile);
            this.Controls.Add(this.TB_FileName);
            this.Name = "Frm_ExcelImport";
            this.Text = "Import excel file....";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox TB_FileName;
        private System.Windows.Forms.Button Btn_SelectFile;
        private System.Windows.Forms.Button Btn_Import;
        private System.Windows.Forms.CheckBox CB_EBD;
        private System.Windows.Forms.CheckBox CB_SBD;
        private System.Windows.Forms.CheckBox CB_EBI;
        private System.Windows.Forms.CheckBox CB_SBI1;
        private System.Windows.Forms.CheckBox CB_SBI2;
        private System.Windows.Forms.CheckBox CB_FLOI;
        private System.Windows.Forms.CheckBox CB_Warning;
        private System.Windows.Forms.CheckBox CB_Permitted;
        private System.Windows.Forms.CheckBox CB_Indication;
        private System.Windows.Forms.CheckBox CB_Select;
        private System.Windows.Forms.ComboBox CBB_TrainType;
        private System.Windows.Forms.ComboBox CBB_SpeedInterval;
        private System.Windows.Forms.Label L_TrainType;
        private System.Windows.Forms.Label L_SpeedInterval;
    }
}