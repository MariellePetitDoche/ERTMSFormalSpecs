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
using System.Linq;
using System.Text;
using System.ComponentModel;
using System.Windows.Forms;

namespace GUI.DataDictionaryView
{
    public class StructureElementTreeNode : ReqRelatedTreeNode<DataDictionary.Types.StructureElement>
    {
        private class InternalTypesConverter : TypesConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                return GetValues(((ItemEditor)context.Instance).Item);
            }
        }

        private class InternalValuesConverter : ValuesConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                ItemEditor editor = (ItemEditor)context.Instance;
                DataDictionary.Types.NameSpace nameSpace = editor.Item.NameSpace;
                DataDictionary.Types.Type type = editor.Item.Type;

                return GetValues(nameSpace, type);
            }
        }

        private class ItemEditor : ReqRelatedEditor
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
            /// The variable type
            /// </summary>
            [Category("Description"), TypeConverter(typeof(InternalTypesConverter))]
            public string Type
            {
                get { return Item.getTypeName(); }
                set
                {
                    Item.Type = null;
                    Item.setTypeName(value);
                }
            }



            /// <summary>

            /// The default value for this variable

            /// </summary>

            [Category("Description"), TypeConverter(typeof(InternalValuesConverter))]

            public string DefaultValue
            {

                get { return Item.getDefault(); }

                set { Item.setDefault(value); }

            }



            /// <summary>

            /// The variable mode

            /// </summary>

            [Category("Description"), TypeConverter(typeof(VariableModeConverter))]

            public DataDictionary.Generated.acceptor.VariableModeEnumType Mode
            {

                get { return Item.Mode; }

                set { Item.Mode = value; }

            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public StructureElementTreeNode(DataDictionary.Types.StructureElement item)
            : base(item)
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
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }
    }
}
