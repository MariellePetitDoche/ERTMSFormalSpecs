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
    public class NameSpaceSubNameSpacesTreeNode : NameSpaceTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="name"></param>
        public NameSpaceSubNameSpacesTreeNode(DataDictionary.Types.NameSpace item)
            : base(item, "Namespaces", true)
        {
            foreach (DataDictionary.Types.NameSpace nameSpace in item.SubNameSpaces)
            {
                Nodes.Add(new NameSpaceTreeNode(nameSpace));
            }
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
        /// Update counts according to the selected folder
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();
            List<DataDictionary.Types.NameSpace> namespaces = new List<DataDictionary.Types.NameSpace>();
            foreach (DataDictionary.Types.NameSpace aNamespace in Item.SubNameSpaces)
            {
                namespaces.Add(aNamespace);
            }

            (BaseForm as Window).toolStripStatusLabel.Text = NameSpaceTreeNode.CreateStatMessage(namespaces, true);
        }
    }
}
