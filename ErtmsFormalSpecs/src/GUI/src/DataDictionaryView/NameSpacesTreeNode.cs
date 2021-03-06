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
    public class NameSpacesTreeNode : DataTreeNode<DataDictionary.Dictionary>
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
        public NameSpacesTreeNode(DataDictionary.Dictionary item)
            : base(item, "Name spaces", true)
        {
            foreach (DataDictionary.Types.NameSpace nameSpace in item.NameSpaces)
            {
                Nodes.Add(new NameSpaceTreeNode(nameSpace));
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
            DataDictionary.Types.NameSpace nameSpace = (DataDictionary.Types.NameSpace)DataDictionary.Generated.acceptor.getFactory().createNameSpace();
            nameSpace.Name = "<NameSpace" + (GetNodeCount(false) + 1) + ">";
            AddNameSpace(nameSpace);
        }

        /// <summary>
        /// Adds a namespace in the corresponding namespace
        /// </summary>
        /// <param name="nameSpace"></param>
        public NameSpaceTreeNode AddNameSpace(DataDictionary.Types.NameSpace nameSpace)
        {
            Item.appendNameSpaces(nameSpace);
            NameSpaceTreeNode retVal = new NameSpaceTreeNode(nameSpace);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
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

            if (SourceNode is NameSpaceTreeNode)
            {
                NameSpaceTreeNode nameSpaceTreeNode = SourceNode as NameSpaceTreeNode;
                DataDictionary.Types.NameSpace nameSpace = nameSpaceTreeNode.Item;

                nameSpaceTreeNode.Delete();
                AddNameSpace(nameSpace);
            }
        }

        /// <summary>
        /// Update counts according to the selected folder
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();
            List<DataDictionary.Types.NameSpace> namespaces = new List<DataDictionary.Types.NameSpace>();
            foreach (DataDictionary.Types.NameSpace aNamespace in Item.NameSpaces)
            {
                namespaces.Add(aNamespace);
            }

            (BaseForm as Window).toolStripStatusLabel.Text = NameSpaceTreeNode.CreateStatMessage(namespaces, true);
        }
    }
}
