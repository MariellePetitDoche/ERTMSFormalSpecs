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

namespace GUI.DataDictionaryView
{
    public class EnumerationTreeNode : TypeTreeNode<DataDictionary.Types.Enum>
    {
        private class InternalValuesConverter : ValuesConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                ItemEditor editor = (ItemEditor)context.Instance;
                DataDictionary.Types.NameSpace nameSpace = editor.Item.NameSpace;
                DataDictionary.Types.Type type = editor.Item;

                return GetValues(nameSpace, type);
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

            /// <summary>
            /// The default value
            /// </summary>
            [Category("Description"), TypeConverter(typeof(InternalValuesConverter))]
            public string DefaultValue
            {
                get { return Item.Default; }
                set { Item.Default = value; }
            }

            [Category("Description"), Editor(@"System.Windows.Forms.Design.StringCollectionEditor,System.Design, Version=2.0.0.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a", typeof(System.Drawing.Design.UITypeEditor))]
            public List<string> Values
            {
                get
                {
                    List<string> result = new List<string>();
                    foreach (DataDictionary.Constants.EnumValue val in Item.Values)
                    {
                        result.Add(val.getName());
                    }
                    return result;
                }
                set
                {
                    Item.Values.Clear();
                    foreach (string s in value)
                    {
                        DataDictionary.Constants.EnumValue val = new DataDictionary.Constants.EnumValue();
                        val.setName(s);
                        Item.Values.Add(val);
                    }
                }
            }
        }


        private EnumerationValuesTreeNode valuesTreeNode;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        public EnumerationTreeNode(DataDictionary.Types.Enum item)
            : base(item)
        {
            valuesTreeNode = new EnumerationValuesTreeNode(item);
            Nodes.Add(valuesTreeNode);
            Nodes.Add(new SubEnumerationsTreeNode(item));
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        public EnumerationTreeNode(DataDictionary.Types.Enum item, string name, bool isFolder)
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

        public void AddValueHandler(object sender, EventArgs args)
        {
            DataDictionary.Constants.EnumValue value = (DataDictionary.Constants.EnumValue)DataDictionary.Generated.acceptor.getFactory().createEnumValue();
            valuesTreeNode.AddValue(value);
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add value", new EventHandler(AddValueHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
