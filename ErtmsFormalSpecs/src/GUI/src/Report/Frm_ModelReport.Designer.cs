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
    partial class ModelReport
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
            this.CB_SelectAllDetails = new System.Windows.Forms.CheckBox();
            this.CB_SelectAll = new System.Windows.Forms.CheckBox();
            this.CB_AddRulesDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddRules = new System.Windows.Forms.CheckBox();
            this.CB_AddStructuresDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddCollectionsDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddFunctionsDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddProceduresDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddVariablesDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddVariables = new System.Windows.Forms.CheckBox();
            this.CB_AddProcedures = new System.Windows.Forms.CheckBox();
            this.CB_AddFunctions = new System.Windows.Forms.CheckBox();
            this.CB_AddCollections = new System.Windows.Forms.CheckBox();
            this.CB_AddEnumerations = new System.Windows.Forms.CheckBox();
            this.CB_AddRangesDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddRanges = new System.Windows.Forms.CheckBox();
            this.CB_AddEnumerationsDetails = new System.Windows.Forms.CheckBox();
            this.CB_AddStructures = new System.Windows.Forms.CheckBox();
            this.TxtB_Path = new System.Windows.Forms.TextBox();
            this.Btn_SelectFile = new System.Windows.Forms.Button();
            this.Btn_CreateReport = new System.Windows.Forms.Button();
            this.GrB_Options.SuspendLayout();
            this.SuspendLayout();
            // 
            // GrB_Options
            // 
            this.GrB_Options.Controls.Add(this.CB_SelectAllDetails);
            this.GrB_Options.Controls.Add(this.CB_SelectAll);
            this.GrB_Options.Controls.Add(this.CB_AddRulesDetails);
            this.GrB_Options.Controls.Add(this.CB_AddRules);
            this.GrB_Options.Controls.Add(this.CB_AddStructuresDetails);
            this.GrB_Options.Controls.Add(this.CB_AddCollectionsDetails);
            this.GrB_Options.Controls.Add(this.CB_AddFunctionsDetails);
            this.GrB_Options.Controls.Add(this.CB_AddProceduresDetails);
            this.GrB_Options.Controls.Add(this.CB_AddVariablesDetails);
            this.GrB_Options.Controls.Add(this.CB_AddVariables);
            this.GrB_Options.Controls.Add(this.CB_AddProcedures);
            this.GrB_Options.Controls.Add(this.CB_AddFunctions);
            this.GrB_Options.Controls.Add(this.CB_AddCollections);
            this.GrB_Options.Controls.Add(this.CB_AddEnumerations);
            this.GrB_Options.Controls.Add(this.CB_AddRangesDetails);
            this.GrB_Options.Controls.Add(this.CB_AddRanges);
            this.GrB_Options.Controls.Add(this.CB_AddEnumerationsDetails);
            this.GrB_Options.Controls.Add(this.CB_AddStructures);
            this.GrB_Options.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.GrB_Options.Location = new System.Drawing.Point(13, 13);
            this.GrB_Options.Name = "GrB_Options";
            this.GrB_Options.Size = new System.Drawing.Size(388, 232);
            this.GrB_Options.TabIndex = 0;
            this.GrB_Options.TabStop = false;
            this.GrB_Options.Text = "Options";
            // 
            // CB_SelectAllDetails
            // 
            this.CB_SelectAllDetails.AutoSize = true;
            this.CB_SelectAllDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_SelectAllDetails.Location = new System.Drawing.Point(205, 205);
            this.CB_SelectAllDetails.Name = "CB_SelectAllDetails";
            this.CB_SelectAllDetails.Size = new System.Drawing.Size(69, 17);
            this.CB_SelectAllDetails.TabIndex = 18;
            this.CB_SelectAllDetails.Tag = "STAT.9";
            this.CB_SelectAllDetails.Text = "Select all";
            this.CB_SelectAllDetails.UseVisualStyleBackColor = true;
            this.CB_SelectAllDetails.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_SelectAll
            // 
            this.CB_SelectAll.AutoSize = true;
            this.CB_SelectAll.Checked = true;
            this.CB_SelectAll.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_SelectAll.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_SelectAll.Location = new System.Drawing.Point(6, 205);
            this.CB_SelectAll.Name = "CB_SelectAll";
            this.CB_SelectAll.Size = new System.Drawing.Size(81, 17);
            this.CB_SelectAll.TabIndex = 17;
            this.CB_SelectAll.Tag = "FILTER.9";
            this.CB_SelectAll.Text = "Deselect all";
            this.CB_SelectAll.UseVisualStyleBackColor = true;
            this.CB_SelectAll.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddRulesDetails
            // 
            this.CB_AddRulesDetails.AutoSize = true;
            this.CB_AddRulesDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddRulesDetails.Location = new System.Drawing.Point(205, 182);
            this.CB_AddRulesDetails.Name = "CB_AddRulesDetails";
            this.CB_AddRulesDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddRulesDetails.TabIndex = 16;
            this.CB_AddRulesDetails.Tag = "STAT.8";
            this.CB_AddRulesDetails.Text = "Show details";
            this.CB_AddRulesDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddRules
            // 
            this.CB_AddRules.AutoSize = true;
            this.CB_AddRules.Checked = true;
            this.CB_AddRules.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddRules.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddRules.Location = new System.Drawing.Point(6, 182);
            this.CB_AddRules.Name = "CB_AddRules";
            this.CB_AddRules.Size = new System.Drawing.Size(53, 17);
            this.CB_AddRules.TabIndex = 15;
            this.CB_AddRules.Tag = "FILTER.8";
            this.CB_AddRules.Text = "Rules";
            this.CB_AddRules.UseVisualStyleBackColor = true;
            this.CB_AddRules.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddStructuresDetails
            // 
            this.CB_AddStructuresDetails.AutoSize = true;
            this.CB_AddStructuresDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddStructuresDetails.Location = new System.Drawing.Point(205, 67);
            this.CB_AddStructuresDetails.Name = "CB_AddStructuresDetails";
            this.CB_AddStructuresDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddStructuresDetails.TabIndex = 6;
            this.CB_AddStructuresDetails.Tag = "STAT.3";
            this.CB_AddStructuresDetails.Text = "Show details";
            this.CB_AddStructuresDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddCollectionsDetails
            // 
            this.CB_AddCollectionsDetails.AutoSize = true;
            this.CB_AddCollectionsDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddCollectionsDetails.Location = new System.Drawing.Point(205, 90);
            this.CB_AddCollectionsDetails.Name = "CB_AddCollectionsDetails";
            this.CB_AddCollectionsDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddCollectionsDetails.TabIndex = 8;
            this.CB_AddCollectionsDetails.Tag = "STAT.4";
            this.CB_AddCollectionsDetails.Text = "Show details";
            this.CB_AddCollectionsDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddFunctionsDetails
            // 
            this.CB_AddFunctionsDetails.AutoSize = true;
            this.CB_AddFunctionsDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddFunctionsDetails.Location = new System.Drawing.Point(205, 113);
            this.CB_AddFunctionsDetails.Name = "CB_AddFunctionsDetails";
            this.CB_AddFunctionsDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddFunctionsDetails.TabIndex = 10;
            this.CB_AddFunctionsDetails.Tag = "STAT.5";
            this.CB_AddFunctionsDetails.Text = "Show details";
            this.CB_AddFunctionsDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddProceduresDetails
            // 
            this.CB_AddProceduresDetails.AutoSize = true;
            this.CB_AddProceduresDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddProceduresDetails.Location = new System.Drawing.Point(205, 136);
            this.CB_AddProceduresDetails.Name = "CB_AddProceduresDetails";
            this.CB_AddProceduresDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddProceduresDetails.TabIndex = 12;
            this.CB_AddProceduresDetails.Tag = "STAT.6";
            this.CB_AddProceduresDetails.Text = "Show details";
            this.CB_AddProceduresDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddVariablesDetails
            // 
            this.CB_AddVariablesDetails.AutoSize = true;
            this.CB_AddVariablesDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddVariablesDetails.Location = new System.Drawing.Point(205, 159);
            this.CB_AddVariablesDetails.Name = "CB_AddVariablesDetails";
            this.CB_AddVariablesDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddVariablesDetails.TabIndex = 14;
            this.CB_AddVariablesDetails.Tag = "STAT.7";
            this.CB_AddVariablesDetails.Text = "Show details";
            this.CB_AddVariablesDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddVariables
            // 
            this.CB_AddVariables.AutoSize = true;
            this.CB_AddVariables.Checked = true;
            this.CB_AddVariables.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddVariables.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddVariables.Location = new System.Drawing.Point(6, 159);
            this.CB_AddVariables.Name = "CB_AddVariables";
            this.CB_AddVariables.Size = new System.Drawing.Size(69, 17);
            this.CB_AddVariables.TabIndex = 13;
            this.CB_AddVariables.Tag = "FILTER.7";
            this.CB_AddVariables.Text = "Variables";
            this.CB_AddVariables.UseVisualStyleBackColor = true;
            this.CB_AddVariables.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddProcedures
            // 
            this.CB_AddProcedures.AutoSize = true;
            this.CB_AddProcedures.Checked = true;
            this.CB_AddProcedures.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddProcedures.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddProcedures.Location = new System.Drawing.Point(6, 136);
            this.CB_AddProcedures.Name = "CB_AddProcedures";
            this.CB_AddProcedures.Size = new System.Drawing.Size(80, 17);
            this.CB_AddProcedures.TabIndex = 11;
            this.CB_AddProcedures.Tag = "FILTER.6";
            this.CB_AddProcedures.Text = "Procedures";
            this.CB_AddProcedures.UseVisualStyleBackColor = true;
            this.CB_AddProcedures.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddFunctions
            // 
            this.CB_AddFunctions.AutoSize = true;
            this.CB_AddFunctions.Checked = true;
            this.CB_AddFunctions.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddFunctions.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddFunctions.Location = new System.Drawing.Point(6, 113);
            this.CB_AddFunctions.Name = "CB_AddFunctions";
            this.CB_AddFunctions.Size = new System.Drawing.Size(72, 17);
            this.CB_AddFunctions.TabIndex = 9;
            this.CB_AddFunctions.Tag = "FILTER.5";
            this.CB_AddFunctions.Text = "Functions";
            this.CB_AddFunctions.UseVisualStyleBackColor = true;
            this.CB_AddFunctions.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddCollections
            // 
            this.CB_AddCollections.AutoSize = true;
            this.CB_AddCollections.Checked = true;
            this.CB_AddCollections.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddCollections.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddCollections.Location = new System.Drawing.Point(6, 90);
            this.CB_AddCollections.Name = "CB_AddCollections";
            this.CB_AddCollections.Size = new System.Drawing.Size(77, 17);
            this.CB_AddCollections.TabIndex = 7;
            this.CB_AddCollections.Tag = "FILTER.4";
            this.CB_AddCollections.Text = "Collections";
            this.CB_AddCollections.UseVisualStyleBackColor = true;
            this.CB_AddCollections.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddEnumerations
            // 
            this.CB_AddEnumerations.AutoSize = true;
            this.CB_AddEnumerations.Checked = true;
            this.CB_AddEnumerations.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddEnumerations.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddEnumerations.Location = new System.Drawing.Point(6, 44);
            this.CB_AddEnumerations.Name = "CB_AddEnumerations";
            this.CB_AddEnumerations.Size = new System.Drawing.Size(90, 17);
            this.CB_AddEnumerations.TabIndex = 3;
            this.CB_AddEnumerations.Tag = "FILTER.2";
            this.CB_AddEnumerations.Text = "Enumerations";
            this.CB_AddEnumerations.UseVisualStyleBackColor = true;
            this.CB_AddEnumerations.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddRangesDetails
            // 
            this.CB_AddRangesDetails.AutoSize = true;
            this.CB_AddRangesDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddRangesDetails.Location = new System.Drawing.Point(205, 21);
            this.CB_AddRangesDetails.Name = "CB_AddRangesDetails";
            this.CB_AddRangesDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddRangesDetails.TabIndex = 2;
            this.CB_AddRangesDetails.Tag = "STAT.1";
            this.CB_AddRangesDetails.Text = "Show details";
            this.CB_AddRangesDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddRanges
            // 
            this.CB_AddRanges.AutoSize = true;
            this.CB_AddRanges.Checked = true;
            this.CB_AddRanges.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddRanges.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddRanges.Location = new System.Drawing.Point(6, 20);
            this.CB_AddRanges.Name = "CB_AddRanges";
            this.CB_AddRanges.Size = new System.Drawing.Size(63, 17);
            this.CB_AddRanges.TabIndex = 1;
            this.CB_AddRanges.Tag = "FILTER.1";
            this.CB_AddRanges.Text = "Ranges";
            this.CB_AddRanges.UseVisualStyleBackColor = true;
            this.CB_AddRanges.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // CB_AddEnumerationsDetails
            // 
            this.CB_AddEnumerationsDetails.AutoSize = true;
            this.CB_AddEnumerationsDetails.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddEnumerationsDetails.Location = new System.Drawing.Point(205, 44);
            this.CB_AddEnumerationsDetails.Name = "CB_AddEnumerationsDetails";
            this.CB_AddEnumerationsDetails.Size = new System.Drawing.Size(86, 17);
            this.CB_AddEnumerationsDetails.TabIndex = 4;
            this.CB_AddEnumerationsDetails.Tag = "STAT.2";
            this.CB_AddEnumerationsDetails.Text = "Show details";
            this.CB_AddEnumerationsDetails.UseVisualStyleBackColor = true;
            // 
            // CB_AddStructures
            // 
            this.CB_AddStructures.AutoSize = true;
            this.CB_AddStructures.Checked = true;
            this.CB_AddStructures.CheckState = System.Windows.Forms.CheckState.Checked;
            this.CB_AddStructures.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.CB_AddStructures.Location = new System.Drawing.Point(6, 67);
            this.CB_AddStructures.Name = "CB_AddStructures";
            this.CB_AddStructures.Size = new System.Drawing.Size(74, 17);
            this.CB_AddStructures.TabIndex = 5;
            this.CB_AddStructures.Tag = "FILTER.3";
            this.CB_AddStructures.Text = "Structures";
            this.CB_AddStructures.UseVisualStyleBackColor = true;
            this.CB_AddStructures.CheckedChanged += new System.EventHandler(this.CheckedChanged);
            // 
            // TxtB_Path
            // 
            this.TxtB_Path.Location = new System.Drawing.Point(12, 251);
            this.TxtB_Path.Name = "TxtB_Path";
            this.TxtB_Path.Size = new System.Drawing.Size(200, 20);
            this.TxtB_Path.TabIndex = 19;
            // 
            // Btn_SelectFile
            // 
            this.Btn_SelectFile.Location = new System.Drawing.Point(218, 251);
            this.Btn_SelectFile.Name = "Btn_SelectFile";
            this.Btn_SelectFile.Size = new System.Drawing.Size(87, 23);
            this.Btn_SelectFile.TabIndex = 20;
            this.Btn_SelectFile.Text = "Browse...";
            this.Btn_SelectFile.UseVisualStyleBackColor = true;
            this.Btn_SelectFile.Click += new System.EventHandler(this.Btn_SelectFile_Click);
            // 
            // Btn_CreateReport
            // 
            this.Btn_CreateReport.Location = new System.Drawing.Point(314, 251);
            this.Btn_CreateReport.Name = "Btn_CreateReport";
            this.Btn_CreateReport.Size = new System.Drawing.Size(87, 23);
            this.Btn_CreateReport.TabIndex = 0;
            this.Btn_CreateReport.Text = "Create report";
            this.Btn_CreateReport.UseVisualStyleBackColor = true;
            this.Btn_CreateReport.Click += new System.EventHandler(this.Btn_CreateReport_Click);
            // 
            // ModelReport
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(413, 278);
            this.Controls.Add(this.TxtB_Path);
            this.Controls.Add(this.Btn_SelectFile);
            this.Controls.Add(this.Btn_CreateReport);
            this.Controls.Add(this.GrB_Options);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "ModelReport";
            this.ShowInTaskbar = false;
            this.Text = "Report options";
            this.GrB_Options.ResumeLayout(false);
            this.GrB_Options.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox GrB_Options;
        private System.Windows.Forms.CheckBox CB_AddEnumerations;
        private System.Windows.Forms.CheckBox CB_AddRangesDetails;
        private System.Windows.Forms.CheckBox CB_AddRanges;
        private System.Windows.Forms.CheckBox CB_AddEnumerationsDetails;
        private System.Windows.Forms.CheckBox CB_AddStructures;
        private System.Windows.Forms.TextBox TxtB_Path;
        private System.Windows.Forms.Button Btn_SelectFile;
        private System.Windows.Forms.Button Btn_CreateReport;
        private System.Windows.Forms.CheckBox CB_AddVariables;
        private System.Windows.Forms.CheckBox CB_AddProcedures;
        private System.Windows.Forms.CheckBox CB_AddFunctions;
        private System.Windows.Forms.CheckBox CB_AddCollections;
        private System.Windows.Forms.CheckBox CB_AddStructuresDetails;
        private System.Windows.Forms.CheckBox CB_AddCollectionsDetails;
        private System.Windows.Forms.CheckBox CB_AddFunctionsDetails;
        private System.Windows.Forms.CheckBox CB_AddProceduresDetails;
        private System.Windows.Forms.CheckBox CB_AddVariablesDetails;
        private System.Windows.Forms.CheckBox CB_AddRulesDetails;
        private System.Windows.Forms.CheckBox CB_AddRules;
        private System.Windows.Forms.CheckBox CB_SelectAllDetails;
        private System.Windows.Forms.CheckBox CB_SelectAll;
    }
}