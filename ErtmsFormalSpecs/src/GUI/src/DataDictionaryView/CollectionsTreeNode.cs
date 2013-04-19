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
    public class CollectionsTreeNode : DataTreeNode<DataDictionary.Types.NameSpace>
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
        public CollectionsTreeNode(DataDictionary.Types.NameSpace item)
            : base(item, "Collections", true)
        {
            foreach (DataDictionary.Types.Collection collection in item.Collections)
            {
                Nodes.Add(new CollectionTreeNode(collection));
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
                DataDictionary.Types.Collection collection = (DataDictionary.Types.Collection)DataDictionary.Generated.acceptor.getFactory().createCollection();
                collection.Name = "<Collection" + (GetNodeCount(false) + 1) + ">";
                AddCollection(collection);
            }
        }

        /// <summary>
        /// Adds a new collection
        /// </summary>
        /// <param name="collection"></param>
        public void AddCollection(DataDictionary.Types.Collection collection)
        {
            Item.appendCollections(collection);
            Nodes.Add(new CollectionTreeNode(collection));
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

            if (SourceNode is CollectionTreeNode)
            {
                CollectionTreeNode collectionTreeNode = SourceNode as CollectionTreeNode;
                DataDictionary.Types.Collection collection = collectionTreeNode.Item;

                collectionTreeNode.Delete();
                AddCollection(collection);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Types.Collection collection = (DataDictionary.Types.Collection)DataDictionary.Generated.acceptor.getFactory().createCollection();
                collection.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                collection.appendRequirements(reqRef);
                AddCollection(collection);
            }
        }

        /// <summary>
        /// Update counts according to the selected folder
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();
            (BaseForm as Window).toolStripStatusLabel.Text = Item.Collections.Count + (Item.Collections.Count > 1 ? " collections " : " collection ") + "selected.";
        }
    }
}
