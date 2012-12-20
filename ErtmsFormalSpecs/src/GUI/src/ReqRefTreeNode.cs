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
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Windows.Forms;

namespace GUI
{
    public class ReqRefTreeNode : DataTreeNode<DataDictionary.ReqRef>
    {
        public class InternalTracesConverter : TracesConverter
        {
            public override StandardValuesCollection GetStandardValues(ITypeDescriptorContext context)
            {
                return GetValues(((ItemEditor)context.Instance).Item);
            }
        }

        private class ItemEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            [Category("Description"), TypeConverter(typeof(InternalTracesConverter))]
            public override string Name
            {
                get
                {
                    return base.Name;
                }
                set
                {
                    base.Name = value;
                }
            }

        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        public ReqRefTreeNode(DataDictionary.ReqRef item, string name = null)
            : base(item, name)
        {
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        public override void DoubleClickHandler()
        {
            base.DoubleClickHandler();

            MainWindow mainWindow = BaseForm.MDIWindow;

            if (mainWindow.DataDictionaryWindow != null)
            {
                mainWindow.DataDictionaryWindow.TreeView.Select(Item.Model);
            }
            if (mainWindow.SpecificationWindow != null)
            {
                mainWindow.SpecificationWindow.TreeView.Select(Item.Paragraph);
            }
            if (mainWindow.TestWindow != null)
            {
                mainWindow.TestWindow.TreeView.Select(Item.Model);
            }
        }

        /// <summary>
        /// Handles the selection of the requirement
        /// </summary>
        public void SelectHandler(object sender, EventArgs args)
        {
            DoubleClickHandler();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Select", new EventHandler(SelectHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }


        /// <summary>
        /// Accepts a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode paragraph = SourceNode as SpecificationView.ParagraphTreeNode;

                Item.Name = paragraph.Item.FullId;
                RefreshNode();
            }
        }
    }
}
