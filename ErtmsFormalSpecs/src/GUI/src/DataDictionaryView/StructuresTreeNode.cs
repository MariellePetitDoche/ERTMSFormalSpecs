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
    public class StructuresTreeNode : DataTreeNode<DataDictionary.Types.NameSpace>
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
        public StructuresTreeNode(DataDictionary.Types.NameSpace item)
            : base(item, "Structures", true)
        {
            foreach (DataDictionary.Types.Structure structure in item.Structures)
            {
                Nodes.Add(new StructureTreeNode(structure));
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
            DataDictionary.Types.Structure structure = (DataDictionary.Types.Structure)DataDictionary.Generated.acceptor.getFactory().createStructure();
            structure.Name = "<Structure" + (GetNodeCount(false) + 1) + ">";
            AddStructure(structure);
        }

        /// <summary>
        /// Adds a structure in this collection of structures
        /// </summary>
        /// <param name="structure"></param>
        /// <returns></returns>
        public StructureTreeNode AddStructure(DataDictionary.Types.Structure structure)
        {
            Item.appendStructures(structure);

            StructureTreeNode retVal = new StructureTreeNode(structure);
            Nodes.Add(retVal);
            SortSubNodes();

            return retVal;
        }

        public void AddCustomHandler(object sender, EventArgs args)
        {
            CustomProcedure customProcedure = new CustomProcedure("Structure", CreateCustomStructure);
            customProcedure.ShowDialog();
        }

        public void CreateCustomStructure(CustomProcedure.DMIProcedureConfig aConfig)
        {
            switch (aConfig.Type)
            {
                case (CustomProcedure.CustomProcedureType.DMI_In):
                    {
                        AddDMIInStructure(aConfig);
                        break;
                    }
                case (CustomProcedure.CustomProcedureType.DMI_Out):
                    {
                        AddDMIOutStructure(aConfig);
                        break;
                    }
                default:
                    {
                        break;
                    }
            }
        }


        private void AddDMIInStructure(CustomProcedure.DMIProcedureConfig aConfig)
        {
            DataDictionary.Types.Structure aStructure = (DataDictionary.Types.Structure)DataDictionary.Generated.acceptor.getFactory().createStructure();
            aStructure.Name = aConfig.ProcedureName;
            aStructure.NeedsRequirement = true;
            Item.appendStructures(aStructure);
            StructureTreeNode aStructureTreeNode = new StructureTreeNode(aStructure);
            Nodes.Add(aStructureTreeNode);

            DataDictionary.Types.StructureElement structElemIn = (DataDictionary.Types.StructureElement)DataDictionary.Generated.acceptor.getFactory().createStructureElement();
            structElemIn.Name = "InputInformation";
            structElemIn.TypeName = "DMI.InputInformation";
            structElemIn.Mode = DataDictionary.Generated.acceptor.VariableModeEnumType.aIncoming;
            aStructureTreeNode.AddStructureElement(structElemIn);

            SortSubNodes();
        }


        private void AddDMIOutStructure(CustomProcedure.DMIProcedureConfig aConfig)
        {
            DataDictionary.Types.Structure aStructure = (DataDictionary.Types.Structure)DataDictionary.Generated.acceptor.getFactory().createStructure();
            aStructure.Name = aConfig.ProcedureName;
            aStructure.NeedsRequirement = true;
            Item.appendStructures(aStructure);
            StructureTreeNode aStructureTreeNode = new StructureTreeNode(aStructure);
            Nodes.Add(aStructureTreeNode);

            DataDictionary.Types.StructureElement structElemIn = (DataDictionary.Types.StructureElement)DataDictionary.Generated.acceptor.getFactory().createStructureElement();
            structElemIn.Name = "OutputInformation";
            structElemIn.TypeName = "DMI.OutputInformation";
            structElemIn.Mode = DataDictionary.Generated.acceptor.VariableModeEnumType.aIncoming;
            aStructureTreeNode.AddStructureElement(structElemIn);

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
            retVal.Add(new MenuItem("Add custom...", new EventHandler(AddCustomHandler)));

            return retVal;
        }


        /// <summary>
        /// Accepts drop of a tree node, in a drag & drop operation
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is StructureTreeNode)
            {
                StructureTreeNode structureTreeNode = SourceNode as StructureTreeNode;
                DataDictionary.Types.Structure structure = structureTreeNode.Item;

                structureTreeNode.Delete();
                AddStructure(structure);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Types.Structure structure = (DataDictionary.Types.Structure)DataDictionary.Generated.acceptor.getFactory().createStructure();
                structure.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                structure.appendRequirements(reqRef);
                AddStructure(structure);
            }
        }

        /// <summary>
        /// Update counts according to the selected folder
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();
            (BaseForm as Window).toolStripStatusLabel.Text = Item.Structures.Count + (Item.Structures.Count > 1 ? " structures " : " structure ") + "selected.";
        }
    }
}
