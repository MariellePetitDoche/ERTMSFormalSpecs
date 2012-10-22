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
using System.Linq;
using System.Text;
using System.Windows.Forms;

using DataDictionary;

namespace GUI
{
    public class MyRichTextBox : RichTextBox
    {
        /// <summary>
        /// The enclosing IBaseForm
        /// </summary>
        IBaseForm EnclosingForm
        {
            get
            {
                Control current = Parent;
                while (current != null && !(current is IBaseForm))
                {
                    current = current.Parent;
                }

                return current as IBaseForm;
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        public MyRichTextBox()
        {
            if (ContextMenu == null)
            {
                ContextMenu = new ContextMenu();
            }
            ContextMenu.MenuItems.Add(new MenuItem("Undo", new EventHandler(UndoHandler)));
            ContextMenu.MenuItems.Add(new MenuItem("Redo", new EventHandler(RedoHandler)));
            ContextMenu.MenuItems.Add(new MenuItem("-"));
            ContextMenu.MenuItems.Add(new MenuItem("Cut", new EventHandler(CutHandler)));
            ContextMenu.MenuItems.Add(new MenuItem("Copy", new EventHandler(CopyHandler)));
            ContextMenu.MenuItems.Add(new MenuItem("Paste", new EventHandler(PasteHandler)));

            AllowDrop = true;
            DragDrop += new DragEventHandler(DragDropHandler);
            ShortcutsEnabled = true;

            GotFocus += new EventHandler(MyRichTextBox_GotFocus);
            LostFocus += new EventHandler(MyRichTextBox_LostFocus);
        }


        void MyRichTextBox_LostFocus(object sender, EventArgs e)
        {
            if (EnclosingForm != null && EnclosingForm.MDIWindow != null)
            {
                EnclosingForm.MDIWindow.SelectedRichTextBox = null;
            }
        }

        void MyRichTextBox_GotFocus(object sender, EventArgs e)
        {
            if (EnclosingForm != null && EnclosingForm.MDIWindow != null)
            {
                EnclosingForm.MDIWindow.SelectedRichTextBox = this;
            }
        }

        /// <summary>
        /// Handles an undo event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void UndoHandler(object sender, EventArgs e)
        {
            Undo();
        }

        /// <summary>
        /// Handles a redo event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void RedoHandler(object sender, EventArgs e)
        {
            Redo();
        }

        /// <summary>
        /// Handles a cut event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void CutHandler(object sender, EventArgs e)
        {
            Cut();
        }

        /// <summary>
        /// Handles a copy event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void CopyHandler(object sender, EventArgs e)
        {
            Copy();
        }

        /// <summary>
        /// Handles a paste event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void PasteHandler(object sender, EventArgs e)
        {
            Paste();
        }

        /// <summary>
        /// Called when the drop operation is performed on this text box
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void DragDropHandler(object sender, DragEventArgs e)
        {
            if (e.Data.GetDataPresent("WindowsForms10PersistentObject", false))
            {
                BaseTreeNode SourceNode = (BaseTreeNode)e.Data.GetData("WindowsForms10PersistentObject");
                if (SourceNode != null)
                {
                    DataDictionaryView.VariableTreeNode variableNode = SourceNode as DataDictionaryView.VariableTreeNode;
                    if (variableNode != null)
                    {
                        StringBuilder text = new StringBuilder();
                        text.Append(StripUseless(SourceNode.Model.FullName, EnclosingForm.Selected) + " <- ");

                        DataDictionary.Variables.Variable variable = variableNode.Item;
                        DataDictionary.Types.Structure structure = variable.Type as DataDictionary.Types.Structure;
                        if (structure != null)
                        {
                            text.Append(StripUseless(structure.FullName, EnclosingForm.Selected) + "{\n");
                            bool first = true;
                            foreach (DataDictionary.Types.StructureElement element in structure.Elements)
                            {
                                if (!first)
                                {
                                    text.Append(",\n");
                                }
                                insertElement(element, text, 4);
                                first = false;
                            }
                            text.Append("}\n");
                        }
                        else
                        {
                            text.Append(variable.DefaultValue.FullName);
                        }
                        SelectedText = text.ToString();
                    }
                    else
                    {
                        SelectedText = StripUseless(SourceNode.Model.FullName, EnclosingForm.Selected);
                    }
                }
            }
        }

        private void insertElement(DataDictionary.Types.ITypedElement element, StringBuilder text, int indent)
        {
            text.Append(TextualExplainUtilities.Pad(element.Name + " => ", indent));
            DataDictionary.Types.Structure structure = element.Type as DataDictionary.Types.Structure;
            if (structure != null)
            {
                indent = indent + 4;
                text.Append(StripUseless(structure.FullName, EnclosingForm.Selected) + "{\n");
                bool first = true;
                foreach (DataDictionary.Types.StructureElement subElement in structure.Elements)
                {
                    if (!first)
                    {
                        text.Append(",\n");
                    }
                    insertElement(subElement, text, indent);
                    first = false;
                }
                indent -= 4;
                text.Append("\n" + TextualExplainUtilities.Pad("}", indent));
            }
            else
            {
                text.Append(element.Default);
            }
        }

        /// <summary>
        /// The prefix for the Default namespace
        /// </summary>
        private static string DEFAULT_PREFIX = "Default.";

        /// <summary>
        /// Removes useless prefixes from the string provided
        /// </summary>
        /// <param name="fullName"></param>
        /// <param name="model"></param>
        /// <returns></returns>
        private string StripUseless(string fullName, Utils.IModelElement model)
        {
            string retVal = fullName;

            if (model != null)
            {
                char[] tmp = fullName.ToArray();
                char[] modelName = model.FullName.ToArray();

                int i = 0;
                while (i < tmp.Length && i < modelName.Length)
                {
                    if (tmp[i] != modelName[i])
                    {
                        break;
                    }
                    i += 1;
                }

                retVal = retVal.Substring(i);
                if (Utils.Utils.isEmpty(retVal))
                {
                    retVal = model.Name;
                }
            }

            if (retVal.StartsWith(DEFAULT_PREFIX))
            {
                retVal = retVal.Substring(DEFAULT_PREFIX.Length);
            }

            return retVal;
        }
    }
}
