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
    partial class TestReport
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
            this.Btn_CreateReport = new System.Windows.Forms.Button();
            this.Btn_SelectFile = new System.Windows.Forms.Button();
            this.CB_NonCoveredRulesInFrames = new System.Windows.Forms.CheckBox();
            this.CB_ActivatedRulesInFrames = new System.Windows.Forms.CheckBox();
            this.CB_Frames = new System.Windows.Forms.CheckBox();
            this.CB_SubSequences = new System.Windows.Forms.CheckBox();
            this.CB_TestCases = new System.Windows.Forms.CheckBox();
            this.CB_Steps = new System.Windows.Forms.CheckBox();
            this.CB_Log = new System.Windows.Forms.CheckBox();
            this.GrB_Filters = new System.Windows.Forms.GroupBox();
            this.GrB_Statistics = new System.Windows.Forms.GroupBox();
            this.CB_NonCoveredRulesInTestCases = new System.Windows.Forms.CheckBox();
            this.CB_ActivatedRulesInSteps = new System.Windows.Forms.CheckBox();
            this.CB_NonCoveredRulesInSteps = new System.Windows.Forms.CheckBox();
            this.CB_ActivatedRulesInTestCases = new System.Windows.Forms.CheckBox();
            this.CB_NonCoveredRulesInSubSequences = new System.Windows.Forms.CheckBox();
            this.CB_ActivatedRulesInSubSequences = new System.Windows.Forms.CheckBox();
            this.Lbl_NonCoveredRules = new System.Windows.Forms.Label();
            this.Lbl_CoveredRules = new System.Windows.Forms.Label();
            this.TxtB_Path = new System.Windows.Forms.TextBox();
            this.GrB_Filters.SuspendLayout();
            this.GrB_Statistics.SuspendLayout();
            this.SuspendLayout();
            // 
            // Btn_CreateReport
            // 
            this.Btn_CreateReport.Location = new System.Drawing.Point(446, 300);
            this.Btn_CreateReport.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Btn_CreateReport.Name = "Btn_CreateReport";
            this.Btn_CreateReport.Size = new System.Drawing.Size(130, 35);
            this.Btn_CreateReport.TabIndex = 1;
            this.Btn_CreateReport.Text = "Create report";
            this.Btn_CreateReport.UseVisualStyleBackColor = true;
            this.Btn_CreateReport.Click += new System.EventHandler(this.Btn_CreateReport_Click);
            // 
            // Btn_SelectFile
            // 
            this.Btn_SelectFile.Location = new System.Drawing.Point(306, 300);
            this.Btn_SelectFile.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Btn_SelectFile.Name = "Btn_SelectFile";
            this.Btn_SelectFile.Size = new System.Drawing.Size(130, 35);
            this.Btn_SelectFile.TabIndex = 2;
            this.Btn_SelectFile.Text = "Browse...";
            this.Btn_SelectFile.UseVisualStyleBackColor = true;
            this.Btn_SelectFile.Click += new System.EventHandler(this.Btn_SelectFile_Click);
            // 
            // CB_NonCoveredRulesInFrames
            // 
            this.CB_NonCoveredRulesInFrames.AutoSize = true;
            this.CB_NonCoveredRulesInFrames.Location = new System.Drawing.Point(192, 68);
            this.CB_NonCoveredRulesInFrames.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_NonCoveredRulesInFrames.Name = "CB_NonCoveredRulesInFrames";
            this.CB_NonCoveredRulesInFrames.Size = new System.Drawing.Size(27, 26);
            this.CB_NonCoveredRulesInFrames.TabIndex = 0;
            this.CB_NonCoveredRulesInFrames.Tag = "STAT.1";
            this.CB_NonCoveredRulesInFrames.UseVisualStyleBackColor = true;
            this.CB_NonCoveredRulesInFrames.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_ActivatedRulesInFrames
            // 
            this.CB_ActivatedRulesInFrames.AutoSize = true;
            this.CB_ActivatedRulesInFrames.Location = new System.Drawing.Point(51, 71);
            this.CB_ActivatedRulesInFrames.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_ActivatedRulesInFrames.Name = "CB_ActivatedRulesInFrames";
            this.CB_ActivatedRulesInFrames.Size = new System.Drawing.Size(27, 26);
            this.CB_ActivatedRulesInFrames.TabIndex = 1;
            this.CB_ActivatedRulesInFrames.Tag = "STAT.1";
            this.CB_ActivatedRulesInFrames.UseVisualStyleBackColor = true;
            this.CB_ActivatedRulesInFrames.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_Frames
            // 
            this.CB_Frames.AutoSize = true;
            this.CB_Frames.Enabled = false;
            this.CB_Frames.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_Frames.Location = new System.Drawing.Point(9, 100);
            this.CB_Frames.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_Frames.Name = "CB_Frames";
            this.CB_Frames.Size = new System.Drawing.Size(132, 37);
            this.CB_Frames.TabIndex = 0;
            this.CB_Frames.Tag = "FILTER.1";
            this.CB_Frames.Text = "Frames";
            this.CB_Frames.UseVisualStyleBackColor = true;
            this.CB_Frames.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_SubSequences
            // 
            this.CB_SubSequences.AutoSize = true;
            this.CB_SubSequences.Enabled = false;
            this.CB_SubSequences.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_SubSequences.Location = new System.Drawing.Point(9, 131);
            this.CB_SubSequences.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_SubSequences.Name = "CB_SubSequences";
            this.CB_SubSequences.Size = new System.Drawing.Size(219, 37);
            this.CB_SubSequences.TabIndex = 1;
            this.CB_SubSequences.Tag = "FILTER.2";
            this.CB_SubSequences.Text = "Sub sequences";
            this.CB_SubSequences.UseVisualStyleBackColor = true;
            this.CB_SubSequences.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_TestCases
            // 
            this.CB_TestCases.AutoSize = true;
            this.CB_TestCases.Enabled = false;
            this.CB_TestCases.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_TestCases.Location = new System.Drawing.Point(9, 166);
            this.CB_TestCases.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_TestCases.Name = "CB_TestCases";
            this.CB_TestCases.Size = new System.Drawing.Size(171, 37);
            this.CB_TestCases.TabIndex = 2;
            this.CB_TestCases.Tag = "FILTER.3";
            this.CB_TestCases.Text = "Test cases";
            this.CB_TestCases.UseVisualStyleBackColor = true;
            this.CB_TestCases.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_Steps
            // 
            this.CB_Steps.AutoSize = true;
            this.CB_Steps.Enabled = false;
            this.CB_Steps.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_Steps.Location = new System.Drawing.Point(9, 202);
            this.CB_Steps.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_Steps.Name = "CB_Steps";
            this.CB_Steps.Size = new System.Drawing.Size(111, 37);
            this.CB_Steps.TabIndex = 3;
            this.CB_Steps.Tag = "FILTER.4";
            this.CB_Steps.Text = "Steps";
            this.CB_Steps.UseVisualStyleBackColor = true;
            this.CB_Steps.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_Log
            // 
            this.CB_Log.AutoSize = true;
            this.CB_Log.Enabled = false;
            this.CB_Log.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_Log.Location = new System.Drawing.Point(74, 237);
            this.CB_Log.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_Log.Name = "CB_Log";
            this.CB_Log.Size = new System.Drawing.Size(88, 37);
            this.CB_Log.TabIndex = 4;
            this.CB_Log.Tag = "FILTER.5";
            this.CB_Log.Text = "Log";
            this.CB_Log.UseVisualStyleBackColor = true;
            this.CB_Log.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // GrB_Filters
            // 
            this.GrB_Filters.Controls.Add(this.CB_Log);
            this.GrB_Filters.Controls.Add(this.GrB_Statistics);
            this.GrB_Filters.Controls.Add(this.CB_Steps);
            this.GrB_Filters.Controls.Add(this.CB_Frames);
            this.GrB_Filters.Controls.Add(this.CB_TestCases);
            this.GrB_Filters.Controls.Add(this.CB_SubSequences);
            this.GrB_Filters.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.GrB_Filters.Location = new System.Drawing.Point(18, 18);
            this.GrB_Filters.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.GrB_Filters.Name = "GrB_Filters";
            this.GrB_Filters.Padding = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.GrB_Filters.Size = new System.Drawing.Size(558, 272);
            this.GrB_Filters.TabIndex = 3;
            this.GrB_Filters.TabStop = false;
            this.GrB_Filters.Text = "Filters";
            // 
            // GrB_Statistics
            // 
            this.GrB_Statistics.Controls.Add(this.CB_NonCoveredRulesInTestCases);
            this.GrB_Statistics.Controls.Add(this.CB_ActivatedRulesInSteps);
            this.GrB_Statistics.Controls.Add(this.CB_NonCoveredRulesInSteps);
            this.GrB_Statistics.Controls.Add(this.CB_ActivatedRulesInTestCases);
            this.GrB_Statistics.Controls.Add(this.CB_NonCoveredRulesInSubSequences);
            this.GrB_Statistics.Controls.Add(this.CB_ActivatedRulesInSubSequences);
            this.GrB_Statistics.Controls.Add(this.CB_NonCoveredRulesInFrames);
            this.GrB_Statistics.Controls.Add(this.CB_ActivatedRulesInFrames);
            this.GrB_Statistics.Controls.Add(this.Lbl_NonCoveredRules);
            this.GrB_Statistics.Controls.Add(this.Lbl_CoveredRules);
            this.GrB_Statistics.Location = new System.Drawing.Point(262, 29);
            this.GrB_Statistics.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.GrB_Statistics.Name = "GrB_Statistics";
            this.GrB_Statistics.Padding = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.GrB_Statistics.Size = new System.Drawing.Size(286, 234);
            this.GrB_Statistics.TabIndex = 0;
            this.GrB_Statistics.TabStop = false;
            this.GrB_Statistics.Text = "Details";
            // 
            // CB_NonCoveredRulesInTestCases
            // 
            this.CB_NonCoveredRulesInTestCases.AutoSize = true;
            this.CB_NonCoveredRulesInTestCases.Location = new System.Drawing.Point(192, 142);
            this.CB_NonCoveredRulesInTestCases.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_NonCoveredRulesInTestCases.Name = "CB_NonCoveredRulesInTestCases";
            this.CB_NonCoveredRulesInTestCases.Size = new System.Drawing.Size(27, 26);
            this.CB_NonCoveredRulesInTestCases.TabIndex = 7;
            this.CB_NonCoveredRulesInTestCases.Tag = "STAT.3";
            this.CB_NonCoveredRulesInTestCases.UseVisualStyleBackColor = true;
            // 
            // CB_ActivatedRulesInSteps
            // 
            this.CB_ActivatedRulesInSteps.AutoSize = true;
            this.CB_ActivatedRulesInSteps.Location = new System.Drawing.Point(51, 177);
            this.CB_ActivatedRulesInSteps.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_ActivatedRulesInSteps.Name = "CB_ActivatedRulesInSteps";
            this.CB_ActivatedRulesInSteps.Size = new System.Drawing.Size(27, 26);
            this.CB_ActivatedRulesInSteps.TabIndex = 6;
            this.CB_ActivatedRulesInSteps.Tag = "STAT.4";
            this.CB_ActivatedRulesInSteps.UseVisualStyleBackColor = true;
            // 
            // CB_NonCoveredRulesInSteps
            // 
            this.CB_NonCoveredRulesInSteps.AutoSize = true;
            this.CB_NonCoveredRulesInSteps.Location = new System.Drawing.Point(192, 177);
            this.CB_NonCoveredRulesInSteps.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_NonCoveredRulesInSteps.Name = "CB_NonCoveredRulesInSteps";
            this.CB_NonCoveredRulesInSteps.Size = new System.Drawing.Size(27, 26);
            this.CB_NonCoveredRulesInSteps.TabIndex = 5;
            this.CB_NonCoveredRulesInSteps.Tag = "STAT.4";
            this.CB_NonCoveredRulesInSteps.UseVisualStyleBackColor = true;
            // 
            // CB_ActivatedRulesInTestCases
            // 
            this.CB_ActivatedRulesInTestCases.AutoSize = true;
            this.CB_ActivatedRulesInTestCases.Location = new System.Drawing.Point(51, 142);
            this.CB_ActivatedRulesInTestCases.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_ActivatedRulesInTestCases.Name = "CB_ActivatedRulesInTestCases";
            this.CB_ActivatedRulesInTestCases.Size = new System.Drawing.Size(27, 26);
            this.CB_ActivatedRulesInTestCases.TabIndex = 4;
            this.CB_ActivatedRulesInTestCases.Tag = "STAT.3";
            this.CB_ActivatedRulesInTestCases.UseVisualStyleBackColor = true;
            // 
            // CB_NonCoveredRulesInSubSequences
            // 
            this.CB_NonCoveredRulesInSubSequences.AutoSize = true;
            this.CB_NonCoveredRulesInSubSequences.Location = new System.Drawing.Point(192, 106);
            this.CB_NonCoveredRulesInSubSequences.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_NonCoveredRulesInSubSequences.Name = "CB_NonCoveredRulesInSubSequences";
            this.CB_NonCoveredRulesInSubSequences.Size = new System.Drawing.Size(27, 26);
            this.CB_NonCoveredRulesInSubSequences.TabIndex = 3;
            this.CB_NonCoveredRulesInSubSequences.Tag = "STAT.2";
            this.CB_NonCoveredRulesInSubSequences.UseVisualStyleBackColor = true;
            // 
            // CB_ActivatedRulesInSubSequences
            // 
            this.CB_ActivatedRulesInSubSequences.AutoSize = true;
            this.CB_ActivatedRulesInSubSequences.Location = new System.Drawing.Point(51, 106);
            this.CB_ActivatedRulesInSubSequences.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.CB_ActivatedRulesInSubSequences.Name = "CB_ActivatedRulesInSubSequences";
            this.CB_ActivatedRulesInSubSequences.Size = new System.Drawing.Size(27, 26);
            this.CB_ActivatedRulesInSubSequences.TabIndex = 2;
            this.CB_ActivatedRulesInSubSequences.Tag = "STAT.2";
            this.CB_ActivatedRulesInSubSequences.UseVisualStyleBackColor = true;
            // 
            // Lbl_NonCoveredRules
            // 
            this.Lbl_NonCoveredRules.AutoSize = true;
            this.Lbl_NonCoveredRules.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_NonCoveredRules.Location = new System.Drawing.Point(126, 38);
            this.Lbl_NonCoveredRules.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.Lbl_NonCoveredRules.Name = "Lbl_NonCoveredRules";
            this.Lbl_NonCoveredRules.Size = new System.Drawing.Size(145, 20);
            this.Lbl_NonCoveredRules.TabIndex = 1;
            this.Lbl_NonCoveredRules.Text = "Non covered rules";
            // 
            // Lbl_CoveredRules
            // 
            this.Lbl_CoveredRules.AutoSize = true;
            this.Lbl_CoveredRules.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Lbl_CoveredRules.Location = new System.Drawing.Point(9, 38);
            this.Lbl_CoveredRules.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.Lbl_CoveredRules.Name = "Lbl_CoveredRules";
            this.Lbl_CoveredRules.Size = new System.Drawing.Size(113, 20);
            this.Lbl_CoveredRules.TabIndex = 0;
            this.Lbl_CoveredRules.Text = "Covered rules";
            // 
            // TxtB_Path
            // 
            this.TxtB_Path.Location = new System.Drawing.Point(16, 305);
            this.TxtB_Path.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.TxtB_Path.Name = "TxtB_Path";
            this.TxtB_Path.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.TxtB_Path.Size = new System.Drawing.Size(277, 26);
            this.TxtB_Path.TabIndex = 4;
            this.TxtB_Path.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // TestReport
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(592, 354);
            this.Controls.Add(this.TxtB_Path);
            this.Controls.Add(this.GrB_Filters);
            this.Controls.Add(this.Btn_SelectFile);
            this.Controls.Add(this.Btn_CreateReport);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Name = "TestReport";
            this.ShowInTaskbar = false;
            this.Text = "Report options";
            this.TopMost = true;
            this.GrB_Filters.ResumeLayout(false);
            this.GrB_Filters.PerformLayout();
            this.GrB_Statistics.ResumeLayout(false);
            this.GrB_Statistics.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button Btn_CreateReport;
        private System.Windows.Forms.Button Btn_SelectFile;
        private System.Windows.Forms.CheckBox CB_NonCoveredRulesInFrames;
        private System.Windows.Forms.CheckBox CB_ActivatedRulesInFrames;
        private System.Windows.Forms.CheckBox CB_Frames;
        private System.Windows.Forms.CheckBox CB_SubSequences;
        private System.Windows.Forms.CheckBox CB_TestCases;
        private System.Windows.Forms.CheckBox CB_Steps;
        private System.Windows.Forms.CheckBox CB_Log;
        private System.Windows.Forms.GroupBox GrB_Filters;
        private System.Windows.Forms.GroupBox GrB_Statistics;
        private System.Windows.Forms.Label Lbl_NonCoveredRules;
        private System.Windows.Forms.Label Lbl_CoveredRules;
        private System.Windows.Forms.TextBox TxtB_Path;
        private System.Windows.Forms.CheckBox CB_NonCoveredRulesInTestCases;
        private System.Windows.Forms.CheckBox CB_ActivatedRulesInSteps;
        private System.Windows.Forms.CheckBox CB_NonCoveredRulesInSteps;
        private System.Windows.Forms.CheckBox CB_ActivatedRulesInTestCases;
        private System.Windows.Forms.CheckBox CB_NonCoveredRulesInSubSequences;
        private System.Windows.Forms.CheckBox CB_ActivatedRulesInSubSequences;


    }
}