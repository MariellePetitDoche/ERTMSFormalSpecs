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
namespace GUI.GraphView
{
    partial class GraphView
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
            this.pictureBox = new System.Windows.Forms.PictureBox();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.tabPage1 = new System.Windows.Forms.TabPage();
            this.tabPage2 = new System.Windows.Forms.TabPage();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.maximumYValueTextBox = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.setMaximumYValueCheckBox = new System.Windows.Forms.CheckBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.setMinimumValueCheckBox = new System.Windows.Forms.CheckBox();
            this.maximumValueTextBox = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.minimumValueTextBox = new System.Windows.Forms.TextBox();
            this.setMaximumValueCheckBox = new System.Windows.Forms.CheckBox();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox)).BeginInit();
            this.tabControl1.SuspendLayout();
            this.tabPage1.SuspendLayout();
            this.tabPage2.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // pictureBox
            // 
            this.pictureBox.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pictureBox.Location = new System.Drawing.Point(3, 3);
            this.pictureBox.Name = "pictureBox";
            this.pictureBox.Size = new System.Drawing.Size(758, 444);
            this.pictureBox.TabIndex = 0;
            this.pictureBox.TabStop = false;
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.tabPage1);
            this.tabControl1.Controls.Add(this.tabPage2);
            this.tabControl1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tabControl1.Location = new System.Drawing.Point(0, 0);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(772, 476);
            this.tabControl1.TabIndex = 1;
            // 
            // tabPage1
            // 
            this.tabPage1.Controls.Add(this.pictureBox);
            this.tabPage1.Location = new System.Drawing.Point(4, 22);
            this.tabPage1.Name = "tabPage1";
            this.tabPage1.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage1.Size = new System.Drawing.Size(764, 450);
            this.tabPage1.TabIndex = 0;
            this.tabPage1.Text = "Graph";
            this.tabPage1.UseVisualStyleBackColor = true;
            // 
            // tabPage2
            // 
            this.tabPage2.Controls.Add(this.groupBox2);
            this.tabPage2.Controls.Add(this.groupBox1);
            this.tabPage2.Location = new System.Drawing.Point(4, 22);
            this.tabPage2.Name = "tabPage2";
            this.tabPage2.Padding = new System.Windows.Forms.Padding(3);
            this.tabPage2.Size = new System.Drawing.Size(764, 450);
            this.tabPage2.TabIndex = 1;
            this.tabPage2.Text = "Properties";
            this.tabPage2.UseVisualStyleBackColor = true;
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.maximumYValueTextBox);
            this.groupBox2.Controls.Add(this.label3);
            this.groupBox2.Controls.Add(this.setMaximumYValueCheckBox);
            this.groupBox2.Location = new System.Drawing.Point(9, 151);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(245, 148);
            this.groupBox2.TabIndex = 7;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Y axis";
            // 
            // maximumYValueTextBox
            // 
            this.maximumYValueTextBox.Location = new System.Drawing.Point(132, 41);
            this.maximumYValueTextBox.Name = "maximumYValueTextBox";
            this.maximumYValueTextBox.Size = new System.Drawing.Size(100, 20);
            this.maximumYValueTextBox.TabIndex = 2;
            this.maximumYValueTextBox.TextChanged += new System.EventHandler(this.maximumYValueTextBox_TextChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(35, 48);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(80, 13);
            this.label3.TabIndex = 1;
            this.label3.Text = "Maximum value";
            // 
            // setMaximumYValueCheckBox
            // 
            this.setMaximumYValueCheckBox.AutoSize = true;
            this.setMaximumYValueCheckBox.Location = new System.Drawing.Point(6, 19);
            this.setMaximumYValueCheckBox.Name = "setMaximumYValueCheckBox";
            this.setMaximumYValueCheckBox.Size = new System.Drawing.Size(117, 17);
            this.setMaximumYValueCheckBox.TabIndex = 0;
            this.setMaximumYValueCheckBox.Text = "Set maximum value";
            this.setMaximumYValueCheckBox.UseVisualStyleBackColor = true;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.setMinimumValueCheckBox);
            this.groupBox1.Controls.Add(this.maximumValueTextBox);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.minimumValueTextBox);
            this.groupBox1.Controls.Add(this.setMaximumValueCheckBox);
            this.groupBox1.Location = new System.Drawing.Point(9, 6);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(245, 138);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "X axis";
            // 
            // setMinimumValueCheckBox
            // 
            this.setMinimumValueCheckBox.AutoSize = true;
            this.setMinimumValueCheckBox.Location = new System.Drawing.Point(6, 19);
            this.setMinimumValueCheckBox.Name = "setMinimumValueCheckBox";
            this.setMinimumValueCheckBox.Size = new System.Drawing.Size(114, 17);
            this.setMinimumValueCheckBox.TabIndex = 0;
            this.setMinimumValueCheckBox.Text = "Set minimum value";
            this.setMinimumValueCheckBox.UseVisualStyleBackColor = true;
            this.setMinimumValueCheckBox.CheckedChanged += new System.EventHandler(this.setMinimumValueCheckBox_CheckedChanged);
            // 
            // maximumValueTextBox
            // 
            this.maximumValueTextBox.Enabled = false;
            this.maximumValueTextBox.Location = new System.Drawing.Point(132, 95);
            this.maximumValueTextBox.Name = "maximumValueTextBox";
            this.maximumValueTextBox.Size = new System.Drawing.Size(100, 20);
            this.maximumValueTextBox.TabIndex = 5;
            this.maximumValueTextBox.LostFocus += new System.EventHandler(this.maximumValueTextBox_LostFocus);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(32, 43);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(77, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Minimum value";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(35, 98);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(80, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "Maximum value";
            // 
            // minimumValueTextBox
            // 
            this.minimumValueTextBox.Enabled = false;
            this.minimumValueTextBox.Location = new System.Drawing.Point(132, 40);
            this.minimumValueTextBox.Name = "minimumValueTextBox";
            this.minimumValueTextBox.Size = new System.Drawing.Size(100, 20);
            this.minimumValueTextBox.TabIndex = 2;
            this.minimumValueTextBox.LostFocus += new System.EventHandler(this.minimumValueTextBox_LostFocus);
            // 
            // setMaximumValueCheckBox
            // 
            this.setMaximumValueCheckBox.AutoSize = true;
            this.setMaximumValueCheckBox.Location = new System.Drawing.Point(6, 74);
            this.setMaximumValueCheckBox.Name = "setMaximumValueCheckBox";
            this.setMaximumValueCheckBox.Size = new System.Drawing.Size(117, 17);
            this.setMaximumValueCheckBox.TabIndex = 3;
            this.setMaximumValueCheckBox.Text = "Set maximum value";
            this.setMaximumValueCheckBox.UseVisualStyleBackColor = true;
            this.setMaximumValueCheckBox.CheckedChanged += new System.EventHandler(this.setMaximumValueCheckBox_CheckedChanged);
            // 
            // GraphView
            // 
            this.AllowDrop = true;
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(772, 476);
            this.Controls.Add(this.tabControl1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.SizableToolWindow;
            this.Name = "GraphView";
            this.ShowInTaskbar = false;
            this.Text = "Graph View";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox)).EndInit();
            this.tabControl1.ResumeLayout(false);
            this.tabPage1.ResumeLayout(false);
            this.tabPage2.ResumeLayout(false);
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage tabPage1;
        private System.Windows.Forms.TabPage tabPage2;
        private System.Windows.Forms.TextBox maximumValueTextBox;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.CheckBox setMaximumValueCheckBox;
        private System.Windows.Forms.TextBox minimumValueTextBox;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.CheckBox setMinimumValueCheckBox;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.TextBox maximumYValueTextBox;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.CheckBox setMaximumYValueCheckBox;
        private System.Windows.Forms.GroupBox groupBox1;
    }
}