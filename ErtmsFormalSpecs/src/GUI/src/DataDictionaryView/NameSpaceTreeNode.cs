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

        // The file name used in the ImportMessagesHandler
        private string fileName;

        private void ImportMessageDefinitionHandler(object sender, EventArgs args)
        {
            OpenFileDialog openFileDialog = new OpenFileDialog();
            openFileDialog.Title = "Open Message definition file";
            openFileDialog.Filter = "Message definition file (*.xml)|*.xml|All Files (*.*)|*.*";
            if (openFileDialog.ShowDialog(MainWindow) == DialogResult.OK)
            {
                fileName = openFileDialog.FileName;
                ProgressDialog dialog = new ProgressDialog("Import message definition", ImportMessagesHandler);
                dialog.ShowDialog();
                BaseForm.RefreshModel();
            }
            Utils.FinderRepository.INSTANCE.ClearCache();
        }

        /// <summary>
        /// Actually imports the messages
        /// </summary>
        /// <param name="arg"></param>
        private void ImportMessagesHandler(object arg)
        {
            // Importers.CodecNTImporter importer = new Importers.CodecNTImporter(fileName);
            // importer.Import(Item);
            Utils.FinderRepository.INSTANCE.ClearCache();
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
            retVal.Add(new MenuItem("Import message definition", new EventHandler(ImportMessageDefinitionHandler)));
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
        }
    }
}
