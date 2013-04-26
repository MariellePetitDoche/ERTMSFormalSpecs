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
namespace GUI.StateDiagram
{
    partial class StateDiagramWindow
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
            this.components = new System.ComponentModel.Container();
            this.splitContainer1 = new System.Windows.Forms.SplitContainer();
            this.StateContainerPanel = new GUI.StateDiagram.StatePanel(this.components);
            this.contextMenu = new System.Windows.Forms.ContextMenuStrip(this.components);
            this.addStateMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.addTransitionMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.toolStripMenuItem1 = new System.Windows.Forms.ToolStripMenuItem();
            this.splitContainer2 = new System.Windows.Forms.SplitContainer();
            this.propertyGrid = new System.Windows.Forms.PropertyGrid();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).BeginInit();
            this.splitContainer1.Panel1.SuspendLayout();
            this.splitContainer1.Panel2.SuspendLayout();
            this.splitContainer1.SuspendLayout();
            this.contextMenu.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer2)).BeginInit();
            this.splitContainer2.Panel1.SuspendLayout();
            this.splitContainer2.Panel2.SuspendLayout();
            this.splitContainer2.SuspendLayout();
            this.SuspendLayout();
            // 
            // splitContainer1
            // 
            this.splitContainer1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer1.Location = new System.Drawing.Point(0, 0);
            this.splitContainer1.Margin = new System.Windows.Forms.Padding(2);
            this.splitContainer1.Name = "splitContainer1";
            // 
            // splitContainer1.Panel1
            // 
            this.splitContainer1.Panel1.Controls.Add(this.StateContainerPanel);
            // 
            // splitContainer1.Panel2
            // 
            this.splitContainer1.Panel2.Controls.Add(this.splitContainer2);
            this.splitContainer1.Size = new System.Drawing.Size(639, 341);
            this.splitContainer1.SplitterDistance = 403;
            this.splitContainer1.SplitterWidth = 3;
            this.splitContainer1.TabIndex = 1;
            // 
            // StateContainerPanel
            // 
            this.StateContainerPanel.AutoScroll = true;
            this.StateContainerPanel.ContextMenuStrip = this.contextMenu;
            this.StateContainerPanel.Dock = System.Windows.Forms.DockStyle.Fill;
            this.StateContainerPanel.Location = new System.Drawing.Point(0, 0);
            this.StateContainerPanel.Margin = new System.Windows.Forms.Padding(2);
            this.StateContainerPanel.Name = "StateContainerPanel";
            this.StateContainerPanel.Size = new System.Drawing.Size(403, 341);
            this.StateContainerPanel.StateMachine = null;
            this.StateContainerPanel.TabIndex = 0;
            // 
            // contextMenu
            // 
            this.contextMenu.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.addStateMenuItem,
            this.addTransitionMenuItem,
            this.toolStripSeparator1,
            this.toolStripMenuItem1});
            this.contextMenu.Name = "contextMenu";
            this.contextMenu.Size = new System.Drawing.Size(154, 98);
            // 
            // addStateMenuItem
            // 
            this.addStateMenuItem.Name = "addStateMenuItem";
            this.addStateMenuItem.Size = new System.Drawing.Size(161, 22);
            this.addStateMenuItem.Text = "Add State";
            this.addStateMenuItem.Click += new System.EventHandler(this.addStateMenuItem_Click);
            // 
            // addTransitionMenuItem
            // 
            this.addTransitionMenuItem.Name = "addTransitionMenuItem";
            this.addTransitionMenuItem.Size = new System.Drawing.Size(161, 22);
            this.addTransitionMenuItem.Text = "Add transition";
            this.addTransitionMenuItem.Click += new System.EventHandler(this.addTransitionMenuItem_Click);
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(158, 6);
            // 
            // toolStripMenuItem1
            // 
            this.toolStripMenuItem1.Name = "toolStripMenuItem1";
            this.toolStripMenuItem1.Size = new System.Drawing.Size(153, 22);
            this.toolStripMenuItem1.Text = "Delete selected";
            this.toolStripMenuItem1.Click += new System.EventHandler(this.deleteMenuItem1_Click);
            // 
            // splitContainer2
            // 
            this.splitContainer2.Dock = System.Windows.Forms.DockStyle.Fill;
            this.splitContainer2.Location = new System.Drawing.Point(0, 0);
            this.splitContainer2.Name = "splitContainer2";
            this.splitContainer2.Orientation = System.Windows.Forms.Orientation.Horizontal;
            // 
            // splitContainer2.Panel1
            // 
            this.splitContainer2.Panel1.Controls.Add(this.propertyGrid);
            // 
            // splitContainer2.Panel2
            // 
            this.splitContainer2.Panel2.Controls.Add(this.descriptionRichTextBox);
            this.splitContainer2.Size = new System.Drawing.Size(233, 341);
            this.splitContainer2.SplitterDistance = 170;
            this.splitContainer2.TabIndex = 1;
            // 
            // propertyGrid
            // 
            this.propertyGrid.Dock = System.Windows.Forms.DockStyle.Fill;
            this.propertyGrid.Location = new System.Drawing.Point(0, 0);
            this.propertyGrid.Margin = new System.Windows.Forms.Padding(2);
            this.propertyGrid.Name = "propertyGrid";
            this.propertyGrid.PropertySort = System.Windows.Forms.PropertySort.Categorized;
            this.propertyGrid.Size = new System.Drawing.Size(233, 170);
            this.propertyGrid.TabIndex = 0;
            // 
            // descriptionRichTextBox
            // 
            this.descriptionRichTextBox.Dock = System.Windows.Forms.DockStyle.Fill;
            this.descriptionRichTextBox.Location = new System.Drawing.Point(0, 0);
            this.descriptionRichTextBox.Name = "descriptionRichTextBox";
            this.descriptionRichTextBox.Size = new System.Drawing.Size(233, 167);
            this.descriptionRichTextBox.TabIndex = 0;
            this.descriptionRichTextBox.Text = "";
            // 
            // StateDiagramWindow
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(639, 341);
            this.Controls.Add(this.splitContainer1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.SizableToolWindow;
            this.Margin = new System.Windows.Forms.Padding(2);
            this.Name = "StateDiagramWindow";
            this.Text = "StateDiagramWindow";
            this.splitContainer1.Panel1.ResumeLayout(false);
            this.splitContainer1.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer1)).EndInit();
            this.splitContainer1.ResumeLayout(false);
            this.contextMenu.ResumeLayout(false);
            this.splitContainer2.Panel1.ResumeLayout(false);
            this.splitContainer2.Panel2.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.splitContainer2)).EndInit();
            this.splitContainer2.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private StatePanel StateContainerPanel;
        private System.Windows.Forms.SplitContainer splitContainer1;
        private System.Windows.Forms.PropertyGrid propertyGrid;
        private System.Windows.Forms.ContextMenuStrip contextMenu;
        private System.Windows.Forms.ToolStripMenuItem addStateMenuItem;
        private System.Windows.Forms.ToolStripMenuItem addTransitionMenuItem;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem toolStripMenuItem1;
        private System.Windows.Forms.SplitContainer splitContainer2;
        private MyRichTextBox descriptionRichTextBox;
    }
}