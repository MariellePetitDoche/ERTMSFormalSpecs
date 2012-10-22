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

namespace GUI.DataDictionaryView.UsageTreeView
{
    public class RuleUsageTreeNode : UsageTreeNode<DataDictionary.Rules.RuleCondition>
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public RuleUsageTreeNode(DataDictionary.Rules.RuleCondition item)
            : base(item)
        {
        }

        /// <summary>
        /// Selects the elements in the GUI
        /// </summary>
        public override void SelectInGUI()
        {
            MainWindow window = BaseForm.MDIWindow;

            if (window.DataDictionaryWindow != null)
            {
                window.DataDictionaryWindow.TreeView.Select(Item);
            }
        }
    }
}
