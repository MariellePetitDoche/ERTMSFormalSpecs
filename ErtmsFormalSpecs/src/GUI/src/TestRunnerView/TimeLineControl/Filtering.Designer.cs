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
namespace GUI.TestRunnerView.TimeLineControl
{
    partial class Filtering
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
            this.ruleActivationCheckBox = new System.Windows.Forms.CheckBox();
            this.variableUpdateCheckBox = new System.Windows.Forms.CheckBox();
            this.expectationsCheckBox = new System.Windows.Forms.CheckBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.nameSpaceTreeView = new System.Windows.Forms.TreeView();
            this.button1 = new System.Windows.Forms.Button();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.regExpTextBox = new System.Windows.Forms.TextBox();
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.groupBox1.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox3.SuspendLayout();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.SuspendLayout();
            // 
            // ruleActivationCheckBox
            // 
            this.ruleActivationCheckBox.AutoSize = true;
            this.ruleActivationCheckBox.Location = new System.Drawing.Point(6, 19);
            this.ruleActivationCheckBox.Name = "ruleActivationCheckBox";
            this.ruleActivationCheckBox.Size = new System.Drawing.Size(134, 17);
            this.ruleActivationCheckBox.TabIndex = 0;
            this.ruleActivationCheckBox.Text = "Display rule activations";
            this.ruleActivationCheckBox.UseVisualStyleBackColor = true;
            // 
            // variableUpdateCheckBox
            // 
            this.variableUpdateCheckBox.AutoSize = true;
            this.variableUpdateCheckBox.Location = new System.Drawing.Point(6, 43);
            this.variableUpdateCheckBox.Name = "variableUpdateCheckBox";
            this.variableUpdateCheckBox.Size = new System.Drawing.Size(141, 17);
            this.variableUpdateCheckBox.TabIndex = 1;
            this.variableUpdateCheckBox.Text = "Display variable updates";
            this.variableUpdateCheckBox.UseVisualStyleBackColor = true;
            // 
            // expectationsCheckBox
            // 
            this.expectationsCheckBox.AutoSize = true;
            this.expectationsCheckBox.Location = new System.Drawing.Point(6, 67);
            this.expectationsCheckBox.Name = "expectationsCheckBox";
            this.expectationsCheckBox.Size = new System.Drawing.Size(123, 17);
            this.expectationsCheckBox.TabIndex = 2;
            this.expectationsCheckBox.Text = "Display expectations";
            this.expectationsCheckBox.UseVisualStyleBackColor = true;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.ruleActivationCheckBox);
            this.groupBox1.Controls.Add(this.expectationsCheckBox);
            this.groupBox1.Controls.Add(this.variableUpdateCheckBox);
            this.groupBox1.Dock = System.Windows.Forms.DockStyle.Top;
            this.groupBox1.Location = new System.Drawing.Point(0, 0);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(287, 92);
            this.groupBox1.TabIndex = 3;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Event kind filtering";
            // 
            // nameSpaceTreeView
            // 
            this.nameSpaceTreeView.CheckBoxes = true;
            this.nameSpaceTreeView.Dock = System.Windows.Forms.DockStyle.Fill;
            this.nameSpaceTreeView.Location = new System.Drawing.Point(0, 0);
            this.nameSpaceTreeView.Name = "nameSpaceTreeView";
            this.nameSpaceTreeView.Size = new System.Drawing.Size(281, 252);
            this.nameSpaceTreeView.TabIndex = 4;
            // 
            // button1
            // 
            this.button1.Dock = System.Windows.Forms.DockStyle.Bottom;
            this.button1.Location = new System.Drawing.Point(0, 425);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(287, 31);
            this.button1.TabIndex = 5;
            this.button1.Text = "Ok";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.splitContainer1);
            this.groupBox2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.groupBox2.Location = new System.Drawing.Point(0, 92);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(287, 333);
            this.groupBox2.TabIndex = 6;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Namespace filtering";
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.regExpTextBox);
            this.groupBox3.Dock = System.Windows.Forms.DockStyle.Fill;
            this.groupBox3.Location = new System.Drawing.Point(0, 0);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(281, 58);
            this.groupBox3.TabIndex = 7;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "Regexp";
            // 
            // regExpTextBox
            // 
            this.regExpTextBox.Dock = System.Windows.Forms.DockStyle.Fill;
            this.regExpTextBox.Location = new System.Drawing.Point(3, 16);
            this.regExpTextBox.Multiline = true;
            this.regExpTextBox.Name = "regExpTextBox";
            this.regExpTextBox.Size = new System.Drawing.Size(275, 39);
            this.regExpTextBox.TabIndex = 0;
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(3, 16);
            this.splitContainer1.Name = "splitContainer1";
            this.splitContainer1.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.nameSpaceTreeView);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.groupBox3);
            this.splitContainer1.Size = new System.Drawing.Size(281, 314);
            this.splitContainer1.SplitterDistance = 252;
            this.splitContainer1.TabIndex = 5;
            // 
            // Filtering
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(287, 456);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.groupBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.SizableToolWindow;
            this.Name = "Filtering";
            this.Text = "Event filter";
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            this.splitContainer1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.CheckBox ruleActivationCheckBox;
        private System.Windows.Forms.CheckBox variableUpdateCheckBox;
        private System.Windows.Forms.CheckBox expectationsCheckBox;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TreeView nameSpaceTreeView;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.TextBox regExpTextBox;
        private System.Windows.Forms.SplitContainer splitContainer1;
    }
}