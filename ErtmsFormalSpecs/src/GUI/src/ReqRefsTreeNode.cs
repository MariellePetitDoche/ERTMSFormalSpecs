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

namespace GUI
{
    public class ReqRefsTreeNode : DataTreeNode<DataDictionary.ReferencesParagraph>
    {
        /// <summary>
        /// The editor for message variables
        /// </summary>
        protected class ItemEditor : Editor
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
        public ReqRefsTreeNode(DataDictionary.ReferencesParagraph item)
            : base(item, "Requirements", true)
        {
            foreach (DataDictionary.ReqRef req in item.Requirements)
            {
                Nodes.Add(new ReqRefTreeNode(req));
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

        /// <summary>
        /// Creates are reference to a requirement
        /// </summary>
        /// <param name="refId"></param>
        public void CreateReqRef(string refId)
        {
            DataDictionary.ReqRef req = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
            req.Name = refId;
            Item.appendRequirements(req);
            Nodes.Add(new ReqRefTreeNode(req));
            SortSubNodes();
        }

        public void AddHandler(object sender, EventArgs args)
        {
            CreateReqRef("<Requirement" + (GetNodeCount(false) + 1) + ">");
        }

        /// <summary>
        /// Handles a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode paragraphTreeNode = (SpecificationView.ParagraphTreeNode)SourceNode;

                CreateReqRef(paragraphTreeNode.Item.FullId);
            }
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
    }
}
