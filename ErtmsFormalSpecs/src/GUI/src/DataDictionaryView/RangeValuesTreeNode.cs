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
    public class RangeValuesTreeNode : RangeTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public RangeValuesTreeNode(DataDictionary.Types.Range item)
            : base(item, "Special values", true, false)
        {
            foreach (DataDictionary.Constants.EnumValue value in item.SpecialValues)
            {
                Nodes.Add(new EnumerationValueTreeNode(value));
            }
            SortSubNodes();
        }

        public override void AddSpecialValueHandler(object sender, EventArgs e)
        {
            DataDictionary.Constants.EnumValue value = (DataDictionary.Constants.EnumValue)DataDictionary.Generated.acceptor.getFactory().createEnumValue();
            value.Name = "<unnamed>";
            AppendSpecialValue(value);
        }

        /// <summary>
        /// Adds a new special value to this range
        /// </summary>
        /// <param name="value"></param>
        public void AppendSpecialValue(DataDictionary.Constants.EnumValue value)
        {
            Item.appendSpecialValues(value);
            Nodes.Add(new EnumerationValueTreeNode(value));
            SortSubNodes();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add value", new EventHandler(AddSpecialValueHandler)));

            return retVal;
        }

    }
}
