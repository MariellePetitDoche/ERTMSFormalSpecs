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
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class SubEnumerationsTreeNode : DataTreeNode<DataDictionary.Types.Enum>
    {
        private class ItemEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="name"></param>
        public SubEnumerationsTreeNode(DataDictionary.Types.Enum item)
            : base(item, "Enumerations", true)
        {
            foreach (DataDictionary.Types.Enum enumeration in item.SubEnums)
            {
                Nodes.Add(new EnumerationTreeNode(enumeration));
            }
            SortSubNodes();
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        public void AddHandler(object sender, EventArgs args)
        {
            DataDictionaryTreeView treeView = BaseTreeView as DataDictionaryTreeView;
            if (treeView != null)
            {
                DataDictionary.Types.Enum enumeration = (DataDictionary.Types.Enum)DataDictionary.Generated.acceptor.getFactory().createEnum();
                enumeration.Name = "<Enumeration" + (GetNodeCount(false) + 1) + ">";
                AddEnum(enumeration);
            }
        }

        /// <summary>
        /// Adds a new enumeration
        /// </summary>
        /// <param name="enumeration"></param>
        public void AddEnum(DataDictionary.Types.Enum enumeration)
        {
            Item.appendSubEnums(enumeration);
            Nodes.Add(new EnumerationTreeNode(enumeration));
            SortSubNodes();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add", new EventHandler(AddHandler)));

            return retVal;
        }

        /// <summary>
        /// Accepts drop of a tree node, in a drag & drop operation
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is EnumerationTreeNode)
            {
                EnumerationTreeNode enumerationTreeNode = SourceNode as EnumerationTreeNode;
                DataDictionary.Types.Enum enumeration = enumerationTreeNode.Item;

                enumerationTreeNode.Delete();
                AddEnum(enumeration);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Types.Enum enumeration = (DataDictionary.Types.Enum)DataDictionary.Generated.acceptor.getFactory().createEnum();
                enumeration.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                enumeration.appendRequirements(reqRef);
                AddEnum(enumeration);
            }
        }

    }
}
