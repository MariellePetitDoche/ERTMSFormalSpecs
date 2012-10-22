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
using System.Windows.Forms;

namespace GUI
{
    public class MyPropertyGrid : PropertyGrid
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public MyPropertyGrid()
        {
            AllowDrop = true;
            DragDrop += new DragEventHandler(DragDropHandler);
        }

        /// <summary>
        /// Provides the enclosing IBaseForm
        /// </summary>
        public IBaseForm EnclosingForm
        {
            get { return GUIUtils.EnclosingFinder<IBaseForm>.find(this); }
        }

        /// <summary>
        /// Called when the drop operation is performed on this text box
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void DragDropHandler(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent("WindowsForms10PersistentObject", false))
            {
                BaseTreeNode SourceNode = (BaseTreeNode)e.Data.GetData("WindowsForms10PersistentObject");
                if (SourceNode != null)
                {
                    BaseTreeNode node = EnclosingForm.TreeView.Selected;
                    if (node != null)
                    {
                        node.AcceptDrop(SourceNode);
                    }
                }
            }
        }
    }
}
