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
using System.ComponentModel;
using System.Windows.Forms;
using DataDictionary;
using DataDictionary.Functions;

namespace GUI.DataDictionaryView
{
    public class FunctionTreeNode : ReqRelatedTreeNode<Function>
    {
        private class InternalTypesConverter : TypesConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                ItemEditor editor = (ItemEditor)context.Instance;
                return GetValues(editor.Item);
            }
        }

        private class ItemEditor : TypeEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            [Category("Description")]
            public override string Name
            {
                get { return base.Name; }
                set { base.Name = value; }
            }

            /// <summary>
            /// The function type
            /// </summary>
            [Category("Description"), TypeConverter(typeof(InternalTypesConverter))]
            public string Type
            {
                get { return Item.getTypeName(); }
                set
                {
                    Item.ReturnType = null;
                    Item.setTypeName(value);
                }
            }

            /// <summary>
            /// Indicates that the function result can be cached, from one cycle to the other
            /// </summary>
            [Category("Description")]
            public bool IsCacheable
            {
                get { return Item.getCacheable(); }
                set
                {
                    Item.setCacheable(value);
                }
            }
        }

        private CasesTreeNode Cases;
        private ParametersTreeNode Parameters;


        /// <summary>
        /// The editor for message variables
        /// </summary>
        protected class TypeEditor : ReqRelatedEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public TypeEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public FunctionTreeNode(Function item)
            : base(item)
        {
            Cases = new CasesTreeNode(item);
            Nodes.Add(Cases);

            Parameters = new ParametersTreeNode(item);
            Nodes.Add(Parameters);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        public FunctionTreeNode(Function item, string name, bool isFolder = false, bool addRequirements = true)
            : base(item, name, isFolder, addRequirements)
        {
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        public void AddParameterHandler(object sender, EventArgs args)
        {
            DataDictionaryTreeView treeView = BaseTreeView as DataDictionaryTreeView;
            if (treeView != null)
            {
                DataDictionary.Parameter parameter = (DataDictionary.Parameter)DataDictionary.Generated.acceptor.getFactory().createParameter();
                parameter.Name = "Parameter" + (Item.FormalParameters.Count + 1);
                Parameters.AddParameter(parameter);
            }
        }

        public void AddCaseHandler(object sender, EventArgs args)
        {
            DataDictionaryTreeView treeView = BaseTreeView as DataDictionaryTreeView;
            if (treeView != null)
            {
                DataDictionary.Functions.Case aCase = (DataDictionary.Functions.Case)DataDictionary.Generated.acceptor.getFactory().createCase();
                aCase.Name = "Case" + (Item.Cases.Count + 1);
                Cases.AddCase(aCase);
            }
        }

        public void DisplayHandler(object sender, EventArgs args)
        {
            GraphView.GraphView view = new GraphView.GraphView();
            MainWindow.AddChildWindow(view);
            view.Functions.Add(Item);
            view.Refresh();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Add parameter", new EventHandler(AddParameterHandler)));
            retVal.Add(new MenuItem("Add case", new EventHandler(AddCaseHandler)));
            retVal.Add(new MenuItem("-"));

            DataDictionary.Interpreter.InterpretationContext context = new DataDictionary.Interpreter.InterpretationContext(Item);
            if (Item.FormalParameters.Count == 1)
            {
                Parameter parameter = (Parameter)Item.FormalParameters[0];
                DataDictionary.Functions.Graph graph = Item.createGraph(context, parameter);
                if (graph != null && graph.Segments.Count != 0)
                {
                    retVal.Add(new MenuItem("Display", new EventHandler(DisplayHandler)));
                    retVal.Add(new MenuItem("-"));
                }
            }
            else if (Item.FormalParameters.Count == 2)
            {
                DataDictionary.Functions.Surface surface = Item.createSurface(context);
                if (surface != null && surface.Segments.Count != 0)
                {
                    retVal.Add(new MenuItem("Display", new EventHandler(DisplayHandler)));
                    retVal.Add(new MenuItem("-"));
                }
            }

            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
