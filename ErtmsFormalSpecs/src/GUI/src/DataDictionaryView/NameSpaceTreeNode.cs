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
    public class NameSpaceTreeNode : DataTreeNode<DataDictionary.Types.NameSpace>
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

        NameSpaceSubNameSpacesTreeNode subNameSpaces;
        RangesTreeNode ranges;
        EnumerationsTreeNode enumerations;
        StructuresTreeNode structures;
        CollectionsTreeNode collections;
        FunctionsTreeNode functions;
        NameSpaceProceduresTreeNode procedures;
        NameSpaceVariablesTreeNode variables;
        NameSpaceRulesTreeNode rules;

        bool isDirectory = false;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="name"></param>
        public NameSpaceTreeNode(DataDictionary.Types.NameSpace item)
            : base(item, null, false)
        {
            subNameSpaces = new NameSpaceSubNameSpacesTreeNode(Item);
            ranges = new RangesTreeNode(Item);
            enumerations = new EnumerationsTreeNode(Item);
            structures = new StructuresTreeNode(Item);
            collections = new CollectionsTreeNode(Item);
            functions = new FunctionsTreeNode(Item);
            procedures = new NameSpaceProceduresTreeNode(Item);
            variables = new NameSpaceVariablesTreeNode(Item);
            rules = new NameSpaceRulesTreeNode(Item);

            Nodes.Add(subNameSpaces);
            Nodes.Add(ranges);
            Nodes.Add(enumerations);
            Nodes.Add(structures);
            Nodes.Add(collections);
            Nodes.Add(functions);
            Nodes.Add(procedures);
            Nodes.Add(variables);
            Nodes.Add(rules);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="name"></param>
        public NameSpaceTreeNode(DataDictionary.Types.NameSpace item, string name, bool isFolder)
            : base(item, name, isFolder)
        {
            isDirectory = true;
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
        /// Adds a new range type
        /// </summary>
        /// <param name="range"></param>
        public void AddRangeType(DataDictionary.Types.Range range)
        {
            ranges.AddRange(range);
        }

        private void AddRangeHandler(object sender, EventArgs args)
        {
            ranges.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a new enumeration type
        /// </summary>
        /// <param name="enumeration"></param>
        public void AddEnumeration(DataDictionary.Types.Enum enumeration)
        {
            enumerations.AddEnum(enumeration);
        }

        private void AddEnumerationHandler(object sender, EventArgs args)
        {
            enumerations.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a new collection type
        /// </summary>
        /// <param name="collection"></param>
        public void AddCollection(DataDictionary.Types.Collection collection)
        {
            collections.AddCollection(collection);
        }

        private void AddCollectionHandler(object sender, EventArgs args)
        {
            collections.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a new structure
        /// </summary>
        /// <param name="structure"></param>
        /// <returns>the corresponding node</returns>
        public StructureTreeNode AddStructure(DataDictionary.Types.Structure structure)
        {
            return structures.AddStructure(structure);
        }

        private void AddStructureHandler(object sender, EventArgs args)
        {
            structures.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a new function
        /// </summary>
        /// <param name="structure"></param>
        /// <returns>the corresponding node</returns>
        public FunctionTreeNode AddFunction(DataDictionary.Functions.Function function)
        {
            return functions.AddFunction(function);
        }

        private void AddFunctionHandler(object sender, EventArgs args)
        {
            functions.AddHandler(sender, args);
        }

        /// <summary>
        /// Adds a new variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>the corresponding node</returns>
        public VariableTreeNode AddVariable(DataDictionary.Variables.Variable variable)
        {
            return variables.AddVariable(variable);
        }

        private void AddVariableHandler(object sender, EventArgs args)
        {
            variables.AddHandler(sender, args);
        }


        /// <summary>
        /// Adds a namespace in the corresponding namespace
        /// </summary>
        /// <param name="nameSpace"></param>
        public NameSpaceTreeNode AddNameSpace(DataDictionary.Types.NameSpace nameSpace)
        {
            return subNameSpaces.AddNameSpace(nameSpace);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add range", new EventHandler(AddRangeHandler)));
            retVal.Add(new MenuItem("Add enumeration", new EventHandler(AddEnumerationHandler)));
            retVal.Add(new MenuItem("Add collection", new EventHandler(AddCollectionHandler)));
            retVal.Add(new MenuItem("Add structure", new EventHandler(AddStructureHandler)));
            retVal.Add(new MenuItem("Add function", new EventHandler(AddFunctionHandler)));
            retVal.Add(new MenuItem("Add variable", new EventHandler(AddVariableHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        /// <summary>
        /// Accepts a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (isDirectory)
            {
                BaseTreeNode parent = Parent as BaseTreeNode;
                parent.AcceptDrop(SourceNode);
            }
            else
            {
                if (SourceNode is VariableTreeNode)
                {
                    variables.AcceptDrop(SourceNode);
                }
                else if (SourceNode is ProcedureTreeNode)
                {
                    procedures.AcceptDrop(SourceNode);
                }
                else if (SourceNode is RuleTreeNode)
                {
                    rules.AcceptDrop(SourceNode);
                }
                else if (SourceNode is StructureTreeNode)
                {
                    structures.AcceptDrop(SourceNode);
                }
                else if (SourceNode is NameSpaceTreeNode)
                {
                    NameSpaceTreeNode nameSpaceTreeNode = SourceNode as NameSpaceTreeNode;
                    DataDictionary.Types.NameSpace nameSpace = nameSpaceTreeNode.Item;

                    nameSpaceTreeNode.Delete();
                    AddNameSpace(nameSpace);
                }
            }
        }


        /// <summary>
        /// Update counts according to the selected namespace
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();
            List<DataDictionary.Types.NameSpace> namespaces = new List<DataDictionary.Types.NameSpace>();
            namespaces.Add(Item);

            (BaseForm as Window).toolStripStatusLabel.Text = CreateStatMessage(namespaces, false);
        }


        /// <summary>
        /// Creates the stat message according to the list of namespaces provided
        /// </summary>
        /// <param name="paragraphs"></param>
        /// <returns></returns>
        public static string CreateStatMessage(List<DataDictionary.Types.NameSpace> namespaces, bool isFolder)
        {
            string result = "";

            int ranges = 0;
            int enumerations = 0;
            int structures = 0;
            int collections = 0;
            int functions = 0;
            int procedures = 0;
            int variables = 0;
            int rules = 0;

            List<DataDictionary.Types.NameSpace> allNamespaces = new List<DataDictionary.Types.NameSpace>();
            foreach (DataDictionary.Types.NameSpace aNamespace in namespaces)
            {
                allNamespaces.AddRange(collectNamespaces(aNamespace));
            }

            foreach (DataDictionary.Types.NameSpace aNamespace in allNamespaces)
            {
                ranges += aNamespace.Ranges.Count;
                enumerations += aNamespace.Enumerations.Count;
                structures += aNamespace.Structures.Count;
                collections += aNamespace.Collections.Count;
                functions += aNamespace.Functions.Count;
                procedures += aNamespace.Procedures.Count;
                variables += aNamespace.Variables.Count;
                rules += aNamespace.Rules.Count;
            }

            if (!isFolder)
            {
                result += "The namespace " + namespaces[0].Name + " contains ";
            }
            else
            {
                result += namespaces.Count + (namespaces.Count > 1 ? " namespaces " : " namespace ") + "selected, containing ";
            }

            result += (allNamespaces.Count - namespaces.Count) + (allNamespaces.Count - namespaces.Count > 1 ? " sub-namespaces, " : " sub-namespace, ") +
                      ranges + (ranges > 1 ? " ranges, " : " range, ") +
                      enumerations + (enumerations > 1 ? " enumerations, " : " enumeration, ") +
                      structures + (structures > 1 ? " structures, " : " structure, ") +
                      collections + (collections > 1 ? " collections, " : " collection, ") +
                      functions + (functions > 1 ? " functions, " : " function, ") +
                      procedures + (procedures > 1 ? " procedures, " : " procedure, ") +
                      variables + (variables > 1 ? " variables and " : " variable and ") +
                      rules + (rules > 1 ? " rules." : " rule.");

            return result;

        }


        private static List<DataDictionary.Types.NameSpace> collectNamespaces(DataDictionary.Types.NameSpace aNamespace)
        {
            List<DataDictionary.Types.NameSpace> result = new List<DataDictionary.Types.NameSpace>();
            result.Add(aNamespace);
            foreach (DataDictionary.Types.NameSpace aSubNamespace in aNamespace.SubNameSpaces)
            {
                result.AddRange(collectNamespaces(aSubNamespace));
            }
            return result;
        }
    }
}
