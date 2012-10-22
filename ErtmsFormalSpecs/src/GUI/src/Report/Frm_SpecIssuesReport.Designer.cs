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
namespace GUI.Report
{
    partial class SpecIssuesReport
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
            this.GrB_Options = new System.Windows.Forms.GroupBox();
            this.CB_ShowDesignChoices = new System.Windows.Forms.CheckBox();
            this.CB_ShowIssues = new System.Windows.Forms.CheckBox();
            this.TxtB_Path = new System.Windows.Forms.TextBox();
            this.Btn_SelectFile = new System.Windows.Forms.Button();
            this.Btn_CreateReport = new System.Windows.Forms.Button();
            this.GrB_Options.SuspendLayout();
            this.SuspendLayout();
            // 
            // GrB_Options
            // 
            this.GrB_Options.Controls.Add(this.CB_ShowDesignChoices);
            this.GrB_Options.Controls.Add(this.CB_ShowIssues);
            this.GrB_Options.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.GrB_Options.Location = new System.Drawing.Point(13, 13);
            this.GrB_Options.Name = "GrB_Options";
            this.GrB_Options.Size = new System.Drawing.Size(388, 72);
            this.GrB_Options.TabIndex = 0;
            this.GrB_Options.TabStop = false;
            this.GrB_Options.Text = "Options";
            // 
            // CB_ShowDesignChoices
            // 
            this.CB_ShowDesignChoices.AutoSize = true;
            this.CB_ShowDesignChoices.Checked = true;
            this.CB_ShowDesignChoices.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_ShowDesignChoices.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_ShowDesignChoices.Location = new System.Drawing.Point(6, 43);
            this.CB_ShowDesignChoices.Name = "CB_ShowDesignChoices";
            this.CB_ShowDesignChoices.Size = new System.Drawing.Size(99, 17);
            this.CB_ShowDesignChoices.TabIndex = 1;
            this.CB_ShowDesignChoices.Text = "Design choices";
            this.CB_ShowDesignChoices.UseVisualStyleBackColor = true;
            // 
            // CB_ShowIssues
            // 
            this.CB_ShowIssues.AutoSize = true;
            this.CB_ShowIssues.Checked = true;
            this.CB_ShowIssues.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_ShowIssues.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_ShowIssues.Location = new System.Drawing.Point(6, 20);
            this.CB_ShowIssues.Name = "CB_ShowIssues";
            this.CB_ShowIssues.Size = new System.Drawing.Size(56, 17);
            this.CB_ShowIssues.TabIndex = 0;
            this.CB_ShowIssues.Text = "Issues";
            this.CB_ShowIssues.UseVisualStyleBackColor = true;
            // 
            // TxtB_Path
            // 
            this.TxtB_Path.Location = new System.Drawing.Point(13, 91);
            this.TxtB_Path.Name = "TxtB_Path";
            this.TxtB_Path.Size = new System.Drawing.Size(200, 20);
            this.TxtB_Path.TabIndex = 7;
            // 
            // Btn_SelectFile
            // 
            this.Btn_SelectFile.Location = new System.Drawing.Point(219, 91);
            this.Btn_SelectFile.Name = "Btn_SelectFile";
            this.Btn_SelectFile.Size = new System.Drawing.Size(87, 23);
            this.Btn_SelectFile.TabIndex = 6;
            this.Btn_SelectFile.Text = "Browse...";
            this.Btn_SelectFile.UseVisualStyleBackColor = true;
            this.Btn_SelectFile.Click += new System.EventHandler(this.Btn_SelectFile_Click);
            // 
            // Btn_CreateReport
            // 
            this.Btn_CreateReport.Location = new System.Drawing.Point(312, 91);
            this.Btn_CreateReport.Name = "Btn_CreateReport";
            this.Btn_CreateReport.Size = new System.Drawing.Size(87, 23);
            this.Btn_CreateReport.TabIndex = 5;
            this.Btn_CreateReport.Text = "Create report";
            this.Btn_CreateReport.UseVisualStyleBackColor = true;
            this.Btn_CreateReport.Click += new System.EventHandler(this.Btn_CreateReport_Click);
            // 
            // SpecIssuesReport
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(413, 124);
            this.Controls.Add(this.TxtB_Path);
            this.Controls.Add(this.Btn_SelectFile);
            this.Controls.Add(this.Btn_CreateReport);
            this.Controls.Add(this.GrB_Options);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "SpecIssuesReport";
            this.ShowInTaskbar = false;
            this.Text = "Report options";
            this.GrB_Options.ResumeLayout(false);
            this.GrB_Options.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox GrB_Options;
        private System.Windows.Forms.TextBox TxtB_Path;
        private System.Windows.Forms.Button Btn_SelectFile;
        private System.Windows.Forms.Button Btn_CreateReport;
        private System.Windows.Forms.CheckBox CB_ShowDesignChoices;
        private System.Windows.Forms.CheckBox CB_ShowIssues;
    }
}