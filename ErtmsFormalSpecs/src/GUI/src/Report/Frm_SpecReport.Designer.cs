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
    partial class SpecReport
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
            this.CB_ShowFullSpecification = new System.Windows.Forms.CheckBox();
            this.CB_AddSpecification = new System.Windows.Forms.CheckBox();
            this.CB_AddNonCoveredParagraphs = new System.Windows.Forms.CheckBox();
            this.CB_ShowAssociatedReqRelated = new System.Windows.Forms.CheckBox();
            this.CB_AddCoveredParagraphs = new System.Windows.Forms.CheckBox();
            this.CB_ShowAssociatedParagraphs = new System.Windows.Forms.CheckBox();
            this.CB_AddReqRelated = new System.Windows.Forms.CheckBox();
            this.TxtB_Path = new System.Windows.Forms.TextBox();
            this.Btn_SelectFile = new System.Windows.Forms.Button();
            this.Btn_CreateReport = new System.Windows.Forms.Button();
            this.GrB_Options.SuspendLayout();
            this.SuspendLayout();
            // 
            // GrB_Options
            // 
            this.GrB_Options.Controls.Add(this.CB_ShowFullSpecification);
            this.GrB_Options.Controls.Add(this.CB_AddSpecification);
            this.GrB_Options.Controls.Add(this.CB_AddNonCoveredParagraphs);
            this.GrB_Options.Controls.Add(this.CB_ShowAssociatedReqRelated);
            this.GrB_Options.Controls.Add(this.CB_AddCoveredParagraphs);
            this.GrB_Options.Controls.Add(this.CB_ShowAssociatedParagraphs);
            this.GrB_Options.Controls.Add(this.CB_AddReqRelated);
            this.GrB_Options.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.GrB_Options.Location = new System.Drawing.Point(20, 20);
            this.GrB_Options.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.GrB_Options.Name = "GrB_Options";
            this.GrB_Options.Padding = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.GrB_Options.Size = new System.Drawing.Size(582, 188);
            this.GrB_Options.TabIndex = 0;
            this.GrB_Options.TabStop = false;
            this.GrB_Options.Text = "Options";
            // 
            // CB_ShowFullSpecification
            // 
            this.CB_ShowFullSpecification.AutoSize = true;
            this.CB_ShowFullSpecification.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_ShowFullSpecification.Location = new System.Drawing.Point(292, 32);
            this.CB_ShowFullSpecification.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_ShowFullSpecification.Name = "CB_ShowFullSpecification";
            this.CB_ShowFullSpecification.Size = new System.Drawing.Size(297, 37);
            this.CB_ShowFullSpecification.TabIndex = 6;
            this.CB_ShowFullSpecification.Tag = "STAT.1";
            this.CB_ShowFullSpecification.Text = "Show full specification";
            this.CB_ShowFullSpecification.UseVisualStyleBackColor = true;
            // 
            // CB_AddSpecification
            // 
            this.CB_AddSpecification.AutoSize = true;
            this.CB_AddSpecification.Checked = true;
            this.CB_AddSpecification.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddSpecification.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddSpecification.Location = new System.Drawing.Point(10, 32);
            this.CB_AddSpecification.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_AddSpecification.Name = "CB_AddSpecification";
            this.CB_AddSpecification.Size = new System.Drawing.Size(300, 37);
            this.CB_AddSpecification.TabIndex = 5;
            this.CB_AddSpecification.Tag = "FILTER.1";
            this.CB_AddSpecification.Text = "Specification coverage";
            this.CB_AddSpecification.UseVisualStyleBackColor = true;
            this.CB_AddSpecification.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddNonCoveredParagraphs
            // 
            this.CB_AddNonCoveredParagraphs.AutoSize = true;
            this.CB_AddNonCoveredParagraphs.Checked = true;
            this.CB_AddNonCoveredParagraphs.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddNonCoveredParagraphs.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddNonCoveredParagraphs.Location = new System.Drawing.Point(10, 103);
            this.CB_AddNonCoveredParagraphs.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_AddNonCoveredParagraphs.Name = "CB_AddNonCoveredParagraphs";
            this.CB_AddNonCoveredParagraphs.Size = new System.Drawing.Size(342, 37);
            this.CB_AddNonCoveredParagraphs.TabIndex = 4;
            this.CB_AddNonCoveredParagraphs.Tag = "FILTER.3";
            this.CB_AddNonCoveredParagraphs.Text = "Non covered requirements";
            this.CB_AddNonCoveredParagraphs.UseVisualStyleBackColor = true;
            this.CB_AddNonCoveredParagraphs.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_ShowAssociatedReqRelated
            // 
            this.CB_ShowAssociatedReqRelated.AutoSize = true;
            this.CB_ShowAssociatedReqRelated.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_ShowAssociatedReqRelated.Location = new System.Drawing.Point(292, 71);
            this.CB_ShowAssociatedReqRelated.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_ShowAssociatedReqRelated.Name = "CB_ShowAssociatedReqRelated";
            this.CB_ShowAssociatedReqRelated.Size = new System.Drawing.Size(422, 37);
            this.CB_ShowAssociatedReqRelated.TabIndex = 3;
            this.CB_ShowAssociatedReqRelated.Tag = "STAT.2";
            this.CB_ShowAssociatedReqRelated.Text = "Show associated model elements";
            this.CB_ShowAssociatedReqRelated.UseVisualStyleBackColor = true;
            // 
            // CB_AddCoveredParagraphs
            // 
            this.CB_AddCoveredParagraphs.AutoSize = true;
            this.CB_AddCoveredParagraphs.Checked = true;
            this.CB_AddCoveredParagraphs.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddCoveredParagraphs.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddCoveredParagraphs.Location = new System.Drawing.Point(10, 68);
            this.CB_AddCoveredParagraphs.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_AddCoveredParagraphs.Name = "CB_AddCoveredParagraphs";
            this.CB_AddCoveredParagraphs.Size = new System.Drawing.Size(294, 37);
            this.CB_AddCoveredParagraphs.TabIndex = 2;
            this.CB_AddCoveredParagraphs.Tag = "FILTER.2";
            this.CB_AddCoveredParagraphs.Text = "Covered requirements";
            this.CB_AddCoveredParagraphs.UseVisualStyleBackColor = true;
            this.CB_AddCoveredParagraphs.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_ShowAssociatedParagraphs
            // 
            this.CB_ShowAssociatedParagraphs.AutoSize = true;
            this.CB_ShowAssociatedParagraphs.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_ShowAssociatedParagraphs.Location = new System.Drawing.Point(292, 137);
            this.CB_ShowAssociatedParagraphs.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_ShowAssociatedParagraphs.Name = "CB_ShowAssociatedParagraphs";
            this.CB_ShowAssociatedParagraphs.Size = new System.Drawing.Size(392, 37);
            this.CB_ShowAssociatedParagraphs.TabIndex = 1;
            this.CB_ShowAssociatedParagraphs.Tag = "STAT.4";
            this.CB_ShowAssociatedParagraphs.Text = "Show associated requirements";
            this.CB_ShowAssociatedParagraphs.UseVisualStyleBackColor = true;
            // 
            // CB_AddReqRelated
            // 
            this.CB_AddReqRelated.AutoSize = true;
            this.CB_AddReqRelated.Checked = true;
            this.CB_AddReqRelated.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddReqRelated.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddReqRelated.Location = new System.Drawing.Point(10, 138);
            this.CB_AddReqRelated.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_AddReqRelated.Name = "CB_AddReqRelated";
            this.CB_AddReqRelated.Size = new System.Drawing.Size(224, 37);
            this.CB_AddReqRelated.TabIndex = 0;
            this.CB_AddReqRelated.Tag = "FILTER.4";
            this.CB_AddReqRelated.Text = "Model coverage";
            this.CB_AddReqRelated.UseVisualStyleBackColor = true;
            this.CB_AddReqRelated.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // TxtB_Path
            // 
            this.TxtB_Path.Location = new System.Drawing.Point(18, 217);
            this.TxtB_Path.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.TxtB_Path.Name = "TxtB_Path";
            this.TxtB_Path.Size = new System.Drawing.Size(298, 26);
            this.TxtB_Path.TabIndex = 7;
            // 
            // Btn_SelectFile
            // 
            this.Btn_SelectFile.Location = new System.Drawing.Point(327, 217);
            this.Btn_SelectFile.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Btn_SelectFile.Name = "Btn_SelectFile";
            this.Btn_SelectFile.Size = new System.Drawing.Size(130, 35);
            this.Btn_SelectFile.TabIndex = 6;
            this.Btn_SelectFile.Text = "Browse...";
            this.Btn_SelectFile.UseVisualStyleBackColor = true;
            this.Btn_SelectFile.Click += new System.EventHandler(this.Btn_SelectFile_Click);
            // 
            // Btn_CreateReport
            // 
            this.Btn_CreateReport.Location = new System.Drawing.Point(471, 217);
            this.Btn_CreateReport.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Btn_CreateReport.Name = "Btn_CreateReport";
            this.Btn_CreateReport.Size = new System.Drawing.Size(130, 35);
            this.Btn_CreateReport.TabIndex = 5;
            this.Btn_CreateReport.Text = "Create report";
            this.Btn_CreateReport.UseVisualStyleBackColor = true;
            this.Btn_CreateReport.Click += new System.EventHandler(this.Btn_CreateReport_Click);
            // 
            // SpecReport
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(620, 262);
            this.Controls.Add(this.TxtB_Path);
            this.Controls.Add(this.Btn_SelectFile);
            this.Controls.Add(this.Btn_CreateReport);
            this.Controls.Add(this.GrB_Options);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Name = "SpecReport";
            this.ShowInTaskbar = false;
            this.Text = "Report options";
            this.GrB_Options.ResumeLayout(false);
            this.GrB_Options.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox GrB_Options;
        private System.Windows.Forms.CheckBox CB_AddNonCoveredParagraphs;
        private System.Windows.Forms.CheckBox CB_ShowAssociatedReqRelated;
        private System.Windows.Forms.CheckBox CB_AddCoveredParagraphs;
        private System.Windows.Forms.CheckBox CB_ShowAssociatedParagraphs;
        private System.Windows.Forms.CheckBox CB_AddReqRelated;
        private System.Windows.Forms.TextBox TxtB_Path;
        private System.Windows.Forms.Button Btn_SelectFile;
        private System.Windows.Forms.Button Btn_CreateReport;
        private System.Windows.Forms.CheckBox CB_ShowFullSpecification;
        private System.Windows.Forms.CheckBox CB_AddSpecification;
    }
}