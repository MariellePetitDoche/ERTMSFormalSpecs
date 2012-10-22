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
namespace GUI.SpecificationView
{
    partial class Window
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Window));
            this.toolStrip3 = new System.Windows.Forms.ToolStrip();
            this.toolStripLabel1 = new System.Windows.Forms.ToolStripLabel();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.specBrowserStatusLabel = new System.Windows.Forms.ToolStripLabel();
            this.toolStripSeparator4 = new System.Windows.Forms.ToolStripSeparator();
            this.nextErrortoolStripButton = new System.Windows.Forms.ToolStripButton();
            this.nextWarningToolStripButton = new System.Windows.Forms.ToolStripButton();
            this.nextInfoToolStripButton = new System.Windows.Forms.ToolStripButton();
            this.toolStripSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.specBrowserTreeView = new GUI.SpecificationView.SpecificationTreeView();
            this.splitContainer2 = new System.Windows.Forms.SplitContainer();
            this.propertyGrid = new GUI.MyPropertyGrid();
            this.tabControl1 = new System.Windows.Forms.TabControl();
            this.specTabPage = new System.Windows.Forms.TabPage();
            this.specBrowserTextView = new GUI.MyRichTextBox();
            this.commentsTabPage = new System.Windows.Forms.TabPage();
            this.commentsRichTextBox = new GUI.MyRichTextBox();
            this.implementationTabPage = new System.Windows.Forms.TabPage();
            this.specBrowserRuleView = new GUI.SpecificationView.SpecificationTreeView();
            this.messagesRichTextBox = new GUI.MyRichTextBox();
            this.statusStrip = new System.Windows.Forms.StatusStrip();
            this.toolStripStatusLabel = new System.Windows.Forms.ToolStripStatusLabel();
            this.splitContainer3 = new System.Windows.Forms.SplitContainer();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.toolStrip3.SuspendLayout();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.splitContainer2.Panel1.SuspendLayout();
            this.splitContainer2.Panel2.SuspendLayout();
            this.splitContainer2.SuspendLayout();
            this.tabControl1.SuspendLayout();
            this.specTabPage.SuspendLayout();
            this.commentsTabPage.SuspendLayout();
            this.implementationTabPage.SuspendLayout();
            this.statusStrip.SuspendLayout();
            this.splitContainer3.Panel1.SuspendLayout();
            this.splitContainer3.Panel2.SuspendLayout();
            this.splitContainer3.SuspendLayout();
            this.groupBox1.SuspendLayout();
            this.SuspendLayout();
            // 
            // toolStrip3
            // 
            this.toolStrip3.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripLabel1,
            this.toolStripSeparator1,
            this.specBrowserStatusLabel,
            this.toolStripSeparator4,
            this.nextErrortoolStripButton,
            this.nextWarningToolStripButton,
            this.nextInfoToolStripButton,
            this.toolStripSeparator2});
            this.toolStrip3.Location = new System.Drawing.Point(0, 0);
            this.toolStrip3.Name = "toolStrip3";
            this.toolStrip3.Size = new System.Drawing.Size(1021, 25);
            this.toolStrip3.TabIndex = 1;
            this.toolStrip3.Text = "toolStrip3";
            // 
            // toolStripLabel1
            // 
            this.toolStripLabel1.Name = "toolStripLabel1";
            this.toolStripLabel1.Size = new System.Drawing.Size(80, 22);
            this.toolStripLabel1.Text = "Specifications";
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(6, 25);
            // 
            // specBrowserStatusLabel
            // 
            this.specBrowserStatusLabel.Name = "specBrowserStatusLabel";
            this.specBrowserStatusLabel.Size = new System.Drawing.Size(128, 22);
            this.specBrowserStatusLabel.Text = "specBrowerStatusLabel";
            // 
            // toolStripSeparator4
            // 
            this.toolStripSeparator4.Name = "toolStripSeparator4";
            this.toolStripSeparator4.Size = new System.Drawing.Size(6, 25);
            // 
            // nextErrortoolStripButton
            // 
            this.nextErrortoolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.nextErrortoolStripButton.Image = ((System.Drawing.Image)(resources.GetObject("nextErrortoolStripButton.Image")));
            this.nextErrortoolStripButton.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.nextErrortoolStripButton.Name = "nextErrortoolStripButton";
            this.nextErrortoolStripButton.Size = new System.Drawing.Size(23, 22);
            this.nextErrortoolStripButton.Text = "Next error";
            this.nextErrortoolStripButton.Click += new System.EventHandler(this.nextErrortoolStripButton_Click);
            // 
            // nextWarningToolStripButton
            // 
            this.nextWarningToolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.nextWarningToolStripButton.Image = ((System.Drawing.Image)(resources.GetObject("nextWarningToolStripButton.Image")));
            this.nextWarningToolStripButton.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.nextWarningToolStripButton.Name = "nextWarningToolStripButton";
            this.nextWarningToolStripButton.Size = new System.Drawing.Size(23, 22);
            this.nextWarningToolStripButton.Text = "Next warning";
            this.nextWarningToolStripButton.Click += new System.EventHandler(this.nextWarningToolStripButton_Click);
            // 
            // nextInfoToolStripButton
            // 
            this.nextInfoToolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.nextInfoToolStripButton.Image = ((System.Drawing.Image)(resources.GetObject("nextInfoToolStripButton.Image")));
            this.nextInfoToolStripButton.ImageTransparentColor = System.Drawing.Color.Magenta;
            this.nextInfoToolStripButton.Name = "nextInfoToolStripButton";
            this.nextInfoToolStripButton.Size = new System.Drawing.Size(23, 22);
            this.nextInfoToolStripButton.Text = "Next info";
            this.nextInfoToolStripButton.Click += new System.EventHandler(this.nextInfoToolStripButton_Click);
            // 
            // toolStripSeparator2
            // 
            this.toolStripSeparator2.Name = "toolStripSeparator2";
            this.toolStripSeparator2.Size = new System.Drawing.Size(6, 25);
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 25);
            this.splitContainer1.Margin = new System.Windows.Forms.Padding(2);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.specBrowserTreeView);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.splitContainer2);
            this.splitContainer1.Size = new System.Drawing.Size(1021, 523);
            this.splitContainer1.SplitterDistance = 335;
            this.splitContainer1.SplitterWidth = 3;
            this.splitContainer1.TabIndex = 5;
            // 
            // specBrowserTreeView
            // 
            this.specBrowserTreeView.AllowDrop = true;
            this.specBrowserTreeView.Dock = System.Windows.Forms.DockStyle.Fill;
            this.specBrowserTreeView.Location = new System.Drawing.Point(0, 0);
            this.specBrowserTreeView.Name = "specBrowserTreeView";
            this.specBrowserTreeView.Root = null;
            this.specBrowserTreeView.Selected = null;
            this.specBrowserTreeView.Size = new System.Drawing.Size(335, 523);
            this.specBrowserTreeView.TabIndex = 2;
            // 
            // splitContainer2
            // 
            this.splitContainer2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer2.Location = new System.Drawing.Point(0, 0);
            this.splitContainer2.Margin = new System.Windows.Forms.Padding(2);
            this.splitContainer2.Name = "splitContainer2";
            this.splitContainer2.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer2.Panel1
            // 
            this.splitContainer2.Panel1.Controls.Add(this.splitContainer3);
            // 
            // splitContainer2.Panel2
            // 
            this.splitContainer2.Panel2.Controls.Add(this.tabControl1);
            this.splitContainer2.Size = new System.Drawing.Size(683, 523);
            this.splitContainer2.SplitterDistance = 210;
            this.splitContainer2.SplitterWidth = 3;
            this.splitContainer2.TabIndex = 0;
            // 
            // propertyGrid
            // 
            this.propertyGrid.AllowDrop = true;
            this.propertyGrid.Dock = System.Windows.Forms.DockStyle.Fill;
            this.propertyGrid.Location = new System.Drawing.Point(0, 0);
            this.propertyGrid.Margin = new System.Windows.Forms.Padding(2);
            this.propertyGrid.Name = "propertyGrid";
            this.propertyGrid.PropertySort = System.Windows.Forms.PropertySort.Categorized;
            this.propertyGrid.Size = new System.Drawing.Size(343, 210);
            this.propertyGrid.TabIndex = 0;
            // 
            // tabControl1
            // 
            this.tabControl1.Controls.Add(this.specTabPage);
            this.tabControl1.Controls.Add(this.commentsTabPage);
            this.tabControl1.Controls.Add(this.implementationTabPage);
            this.tabControl1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.tabControl1.Location = new System.Drawing.Point(0, 0);
            this.tabControl1.Margin = new System.Windows.Forms.Padding(2);
            this.tabControl1.Name = "tabControl1";
            this.tabControl1.SelectedIndex = 0;
            this.tabControl1.Size = new System.Drawing.Size(683, 310);
            this.tabControl1.TabIndex = 5;
            // 
            // specTabPage
            // 
            this.specTabPage.Controls.Add(this.specBrowserTextView);
            this.specTabPage.Location = new System.Drawing.Point(4, 22);
            this.specTabPage.Margin = new System.Windows.Forms.Padding(2);
            this.specTabPage.Name = "specTabPage";
            this.specTabPage.Padding = new System.Windows.Forms.Padding(2);
            this.specTabPage.Size = new System.Drawing.Size(675, 284);
            this.specTabPage.TabIndex = 0;
            this.specTabPage.Text = "Specification";
            this.specTabPage.UseVisualStyleBackColor = true;
            // 
            // specBrowserTextView
            // 
            this.specBrowserTextView.AllowDrop = true;
            this.specBrowserTextView.Dock = System.Windows.Forms.DockStyle.Fill;
            this.specBrowserTextView.Location = new System.Drawing.Point(2, 2);
            this.specBrowserTextView.Name = "specBrowserTextView";
            this.specBrowserTextView.Size = new System.Drawing.Size(671, 280);
            this.specBrowserTextView.TabIndex = 3;
            this.specBrowserTextView.Text = "";
            this.specBrowserTextView.TextChanged += new System.EventHandler(this.specBrowserTextView_TextChanged);
            // 
            // commentsTabPage
            // 
            this.commentsTabPage.Controls.Add(this.commentsRichTextBox);
            this.commentsTabPage.Location = new System.Drawing.Point(4, 22);
            this.commentsTabPage.Margin = new System.Windows.Forms.Padding(2);
            this.commentsTabPage.Name = "commentsTabPage";
            this.commentsTabPage.Padding = new System.Windows.Forms.Padding(2);
            this.commentsTabPage.Size = new System.Drawing.Size(544, 156);
            this.commentsTabPage.TabIndex = 3;
            this.commentsTabPage.Text = "Comments";
            this.commentsTabPage.UseVisualStyleBackColor = true;
            // 
            // commentsRichTextBox
            // 
            this.commentsRichTextBox.AllowDrop = true;
            this.commentsRichTextBox.Dock = System.Windows.Forms.DockStyle.Fill;
            this.commentsRichTextBox.Location = new System.Drawing.Point(2, 2);
            this.commentsRichTextBox.Margin = new System.Windows.Forms.Padding(2);
            this.commentsRichTextBox.Name = "commentsRichTextBox";
            this.commentsRichTextBox.Size = new System.Drawing.Size(537, 148);
            this.commentsRichTextBox.TabIndex = 0;
            this.commentsRichTextBox.Text = "";
            this.commentsRichTextBox.TextChanged += new System.EventHandler(this.commentsRichTextBox_TextChanged);
            // 
            // implementationTabPage
            // 
            this.implementationTabPage.Controls.Add(this.specBrowserRuleView);
            this.implementationTabPage.Location = new System.Drawing.Point(4, 22);
            this.implementationTabPage.Margin = new System.Windows.Forms.Padding(2);
            this.implementationTabPage.Name = "implementationTabPage";
            this.implementationTabPage.Padding = new System.Windows.Forms.Padding(2);
            this.implementationTabPage.Size = new System.Drawing.Size(544, 156);
            this.implementationTabPage.TabIndex = 1;
            this.implementationTabPage.Text = "Implementation";
            this.implementationTabPage.UseVisualStyleBackColor = true;
            // 
            // specBrowserRuleView
            // 
            this.specBrowserRuleView.AllowDrop = true;
            this.specBrowserRuleView.Dock = System.Windows.Forms.DockStyle.Fill;
            this.specBrowserRuleView.Location = new System.Drawing.Point(2, 2);
            this.specBrowserRuleView.Name = "specBrowserRuleView";
            this.specBrowserRuleView.Root = null;
            this.specBrowserRuleView.Selected = null;
            this.specBrowserRuleView.Size = new System.Drawing.Size(537, 148);
            this.specBrowserRuleView.TabIndex = 4;
            // 
            // messagesRichTextBox
            // 
            this.messagesRichTextBox.AllowDrop = true;
            this.messagesRichTextBox.Dock = System.Windows.Forms.DockStyle.Fill;
            this.messagesRichTextBox.Location = new System.Drawing.Point(3, 16);
            this.messagesRichTextBox.Margin = new System.Windows.Forms.Padding(2);
            this.messagesRichTextBox.Name = "messagesRichTextBox";
            this.messagesRichTextBox.Size = new System.Drawing.Size(330, 191);
            this.messagesRichTextBox.TabIndex = 0;
            this.messagesRichTextBox.Text = "";
            // 
            // statusStrip
            // 
            this.statusStrip.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.toolStripStatusLabel});
            this.statusStrip.Location = new System.Drawing.Point(0, 526);
            this.statusStrip.Name = "statusStrip";
            this.statusStrip.Padding = new System.Windows.Forms.Padding(1, 0, 9, 0);
            this.statusStrip.Size = new System.Drawing.Size(1021, 22);
            this.statusStrip.TabIndex = 6;
            this.statusStrip.Text = "statusStrip";
            // 
            // toolStripStatusLabel
            // 
            this.toolStripStatusLabel.Name = "toolStripStatusLabel";
            this.toolStripStatusLabel.Size = new System.Drawing.Size(31, 17);
            this.toolStripStatusLabel.Text = "        ";
            // 
            // splitContainer3
            // 
            this.splitContainer3.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer3.Location = new System.Drawing.Point(0, 0);
            this.splitContainer3.Name = "splitContainer3";
            // 
            // splitContainer3.Panel1
            // 
            this.splitContainer3.Panel1.Controls.Add(this.propertyGrid);
            // 
            // splitContainer3.Panel2
            // 
            this.splitContainer3.Panel2.Controls.Add(this.groupBox1);
            this.splitContainer3.Size = new System.Drawing.Size(683, 210);
            this.splitContainer3.SplitterDistance = 343;
            this.splitContainer3.TabIndex = 1;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.messagesRichTextBox);
            this.groupBox1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.groupBox1.Location = new System.Drawing.Point(0, 0);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(336, 210);
            this.groupBox1.TabIndex = 1;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Messages";
            // 
            // Window
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1021, 548);
            this.Controls.Add(this.statusStrip);
            this.Controls.Add(this.splitContainer1);
            this.Controls.Add(this.toolStrip3);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.SizableToolWindow;
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "Window";
            this.ShowInTaskbar = false;
            this.Text = "Specifications";
            this.toolStrip3.ResumeLayout(false);
            this.toolStrip3.PerformLayout();
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            this.splitContainer1.ResumeLayout(false);
            this.splitContainer2.Panel1.ResumeLayout(false);
            this.splitContainer2.Panel2.ResumeLayout(false);
            this.splitContainer2.ResumeLayout(false);
            this.tabControl1.ResumeLayout(false);
            this.specTabPage.ResumeLayout(false);
            this.commentsTabPage.ResumeLayout(false);
            this.implementationTabPage.ResumeLayout(false);
            this.statusStrip.ResumeLayout(false);
            this.statusStrip.PerformLayout();
            this.splitContainer3.Panel1.ResumeLayout(false);
            this.splitContainer3.Panel2.ResumeLayout(false);
            this.splitContainer3.ResumeLayout(false);
            this.groupBox1.ResumeLayout(false);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ToolStrip toolStrip3;
        private System.Windows.Forms.ToolStripLabel specBrowserStatusLabel;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator4;
        private SpecificationTreeView specBrowserTreeView;
        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.SplitContainer splitContainer2;
        private MyPropertyGrid propertyGrid;
        private System.Windows.Forms.TabControl tabControl1;
        private System.Windows.Forms.TabPage specTabPage;
        public MyRichTextBox specBrowserTextView;
        private System.Windows.Forms.TabPage implementationTabPage;
        public GUI.SpecificationView.SpecificationTreeView specBrowserRuleView;
        private MyRichTextBox messagesRichTextBox;
        private System.Windows.Forms.ToolStripLabel toolStripLabel1;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.TabPage commentsTabPage;
        private MyRichTextBox commentsRichTextBox;
        private System.Windows.Forms.ToolStripButton nextErrortoolStripButton;
        private System.Windows.Forms.ToolStripButton nextWarningToolStripButton;
        private System.Windows.Forms.ToolStripButton nextInfoToolStripButton;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator2;
        private System.Windows.Forms.StatusStrip statusStrip;
        public System.Windows.Forms.ToolStripStatusLabel toolStripStatusLabel;
        private System.Windows.Forms.SplitContainer splitContainer3;
        private System.Windows.Forms.GroupBox groupBox1;

    }
}