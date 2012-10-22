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

using System.Data;

using System.Drawing;

using System.Text;

using System.Windows.Forms;

using DataDictionary;





namespace GUI.DataDictionaryView
{

    public class ParameterTreeNode : DataTreeNode<Parameter>
    {

        private class InternalNameSpaceConverter : NameSpaceConverter
        {

            public override StandardValuesCollection GetStandardValues(ITypeDescriptorContext context)
            {

                ItemEditor editor = ((ItemEditor)context.Instance);



                return new StandardValuesCollection(GetValues(editor.Item.Dictionary));

            }

        }



        private class InternalTypesConverter : TypesConverter
        {

            public override StandardValuesCollection

            GetStandardValues(ITypeDescriptorContext context)
            {

                ItemEditor editor = (ItemEditor)context.Instance;

                return GetValues(editor.Item);

            }

        }



        private class ItemEditor : Editor
        {

            /// <summary>

            /// Constructor

            /// </summary>

            public ItemEditor()

                : base()
            {

            }



            /// <summary>

            /// The parameter namespace

            /// </summary>

            private string namSpace;

            [Category("Description"), TypeConverter(typeof(InternalNameSpaceConverter))]

            public string NameSpace
            {

                get
                {

                    if (namSpace == null)
                    {

                        DataDictionary.Types.ITypedElement element = DataDictionary.OverallTypedElementFinder.INSTANCE.findByName(Item, Item.NameSpace.Name);

                        if (element != null && element.NameSpace != null)
                        {

                            namSpace = element.NameSpace.Name;

                        }

                    }



                    if (namSpace == null)
                    {

                        if (Item.NameSpace != null)
                        {

                            namSpace = Item.NameSpace.Name;

                        }

                        else
                        {

                            namSpace = "Default";

                        }

                    }

                    return namSpace;

                }

                set { namSpace = value; }

            }



            /// <summary>

            /// The parameter type

            /// </summary>

            [Category("Description"), TypeConverter(typeof(InternalTypesConverter))]

            public string Type
            {

                get
                {

                    return base.Item.TypeName;

                }

                set
                {

                    base.Item.TypeName = value;

                }

            }

        }





        /// <summary>

        /// Constructor

        /// </summary>

        /// <param name="item"></param>

        public ParameterTreeNode(Parameter parameter)

            : base(parameter)
        {

        }





        /// <summary>

        /// Constructor

        /// </summary>

        /// <param name="name"></param>

        /// <param name="item"></param>

        public ParameterTreeNode(string name, Parameter item)

            : base(name, item)
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

            List<MenuItem> retVal = new List<MenuItem>();



            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));



            return retVal;

        }

    }

}

