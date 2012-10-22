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
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class NameSpaceSubNameSpacesTreeNode : NameSpaceTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="name"></param>
        public NameSpaceSubNameSpacesTreeNode(DataDictionary.Types.NameSpace item)
            : base("Namespaces", item)
        {
            foreach (DataDictionary.Types.NameSpace nameSpace in item.SubNameSpaces)
            {
                Nodes.Add(new NameSpaceTreeNode(nameSpace));
            }
            ImageIndex = 1;
            SelectedImageIndex = 1;
            SortSubNodes();
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
            List<MenuItem> retVal = new List<MenuItem>();

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
    }
}
