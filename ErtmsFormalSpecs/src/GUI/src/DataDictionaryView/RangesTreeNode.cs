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
    public class RangesTreeNode : DataTreeNode<DataDictionary.Types.NameSpace>
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
        public RangesTreeNode(DataDictionary.Types.NameSpace item)
            : base(item, "Ranges", true)
        {
            foreach (DataDictionary.Types.Range range in item.Ranges)
            {
                Nodes.Add(new RangeTreeNode(range));
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
            DataDictionary.Types.Range range = (DataDictionary.Types.Range)DataDictionary.Generated.acceptor.getFactory().createRange();
            range.Name = "<Range" + (GetNodeCount(false) + 1) + ">";
            range.MinValue = "0";
            range.MaxValue = "1";
            AddRange(range);
        }

        /// <summary>
        /// Adds a range
        /// </summary>
        /// <param name="range"></param>
        public void AddRange(DataDictionary.Types.Range range)
        {
            Item.appendRanges(range);
            Nodes.Add(new RangeTreeNode(range));
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

            if (SourceNode is RangeTreeNode)
            {
                RangeTreeNode rangeTreeNode = SourceNode as RangeTreeNode;
                DataDictionary.Types.Range range = rangeTreeNode.Item;

                rangeTreeNode.Delete();
                AddRange(range);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Types.Range range = (DataDictionary.Types.Range)DataDictionary.Generated.acceptor.getFactory().createRange();
                range.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                range.appendRequirements(reqRef);
                AddRange(range);
            }
        }

    }
}
