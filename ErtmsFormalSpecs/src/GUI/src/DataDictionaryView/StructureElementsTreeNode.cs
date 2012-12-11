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
    public class StructureElementsTreeNode : StructureTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public StructureElementsTreeNode(DataDictionary.Types.Structure item)
            : base(item, "Sub elements", true)
        {
            foreach (DataDictionary.Types.StructureElement structureElement in item.Elements)
            {
                Nodes.Add(new StructureElementTreeNode(structureElement));
            }
            SortSubNodes();
        }

        /// <summary>
        /// Adds a structure element to the model
        /// </summary>
        /// <param name="element"></param>
        public void AddElement(DataDictionary.Types.StructureElement element)
        {
            Item.appendElements(element);
            Nodes.Add(new StructureElementTreeNode(element));
            SortSubNodes();
        }

        private void AddStructureElementHandler(object sender, EventArgs args)
        {
            DataDictionary.Types.StructureElement element = (DataDictionary.Types.StructureElement)DataDictionary.Generated.acceptor.getFactory().createStructureElement();
            element.Name = "<Element" + (GetNodeCount(false) + 1) + ">";
            AddElement(element);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add sub element", new EventHandler(AddStructureElementHandler)));

            return retVal;
        }

        /// <summary>
        /// Accepts drop of a tree node, in a drag & drop operation
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is StructureElementTreeNode)
            {
                StructureElementTreeNode structureElementTreeNode = SourceNode as StructureElementTreeNode;
                DataDictionary.Types.StructureElement element = structureElementTreeNode.Item;

                structureElementTreeNode.Delete();
                AddElement(element);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Types.StructureElement element = (DataDictionary.Types.StructureElement)DataDictionary.Generated.acceptor.getFactory().createStructureElement();
                element.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                element.appendRequirements(reqRef);
                AddElement(element);
            }
        }

    }
}
