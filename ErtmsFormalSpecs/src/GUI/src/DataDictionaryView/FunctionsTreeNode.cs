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
    public class FunctionsTreeNode : DataTreeNode<DataDictionary.Types.NameSpace>
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
        public FunctionsTreeNode(DataDictionary.Types.NameSpace item)
            : base("Functions", item)
        {
            foreach (DataDictionary.Functions.Function function in item.Functions)
            {
                Nodes.Add(new FunctionTreeNode(function));
            }
            ImageIndex = 1;
            SelectedImageIndex = 1;
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
                DataDictionary.Functions.Function function = (DataDictionary.Functions.Function)DataDictionary.Generated.acceptor.getFactory().createFunction();
                function.Name = "<Function" + (GetNodeCount(false) + 1) + ">";
                AddFunction(function);
            }
        }

        /// <summary>
        /// Adds a new function
        /// </summary>
        /// <param name="function"></param>
        public FunctionTreeNode AddFunction(DataDictionary.Functions.Function function)
        {
            // Ensure that functions always have a type
            if (function.ReturnType == null)
            {
                function.ReturnType = function.EFSSystem.BoolType;
            }

            Item.appendFunctions(function);
            FunctionTreeNode retVal = new FunctionTreeNode(function);
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

            if (SourceNode is FunctionTreeNode)
            {
                FunctionTreeNode node = SourceNode as FunctionTreeNode;
                DataDictionary.Functions.Function function = node.Item;
                DataDictionary.Functions.Function duplFunction = DataDictionary.OverallFunctionFinder.INSTANCE.findByName(function.Dictionary, function.Name);
                if (duplFunction != null) // If there is a function with the same name, we must delete it
                {
                    if (MessageBox.Show("Are you sure you want to move the corresponding function?", "Move action", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                    {
                        for (int i = 0; i < Nodes.Count; i++)
                        {
                            FunctionTreeNode temp = Nodes[i] as FunctionTreeNode;
                            if (temp.Item.Name == function.Name)
                            {
                                temp.Delete();
                            }
                        }
                        node.Delete();
                        AddFunction(function);
                    }
                }
                else
                {
                    node.Delete();
                    AddFunction(function);
                }
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Functions.Function function = (DataDictionary.Functions.Function)DataDictionary.Generated.acceptor.getFactory().createFunction();
                function.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                function.appendRequirements(reqRef);
                AddFunction(function);
            }
        }
    }
}
