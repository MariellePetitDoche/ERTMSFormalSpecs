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
using System.Windows.Forms;

namespace GUI
{
    public interface IBaseForm
    {
        /// <summary>
        /// The property grid used to edit elements properties
        /// </summary>
        MyPropertyGrid Properties { get; }

        /// <summary>
        /// The text editor for expressions
        /// </summary>
        RichTextBox ExpressionTextBox { get; }

        /// <summary>
        /// The text editor for comments
        /// </summary>
        RichTextBox CommentsTextBox { get; }

        /// <summary>
        /// The text editor for messages
        /// </summary>
        RichTextBox MessagesTextBox { get; }

        /// <summary>
        /// The enclosing MDI Window
        /// </summary>
        MainWindow MDIWindow { get; }

        /// <summary>
        /// The main tree view of the form
        /// </summary>
        BaseTreeView TreeView { get; }

        /// <summary>
        /// The sub tree view of the form
        /// </summary>
        BaseTreeView subTreeView { get; }

        /// <summary>
        /// The explain text box
        /// </summary>
        ExplainTextBox ExplainTextBox { get; }

        /// <summary>
        /// Refreshed the view, while no structural model occurred
        /// </summary>
        void Refresh();

        /// <summary>
        /// Allows to refresh the view, according to the fact that the structure for the model could change
        /// </summary>
        void RefreshModel();

        /// <summary>
        /// Provides the model element currently selected in this IBaseForm
        /// </summary>
        Utils.IModelElement Selected { get; }
    }

    public class FormsUtils
    {
        public static Form EnclosingForm(Control control)
        {
            while (control != null && !(control is Form))
            {
                control = control.Parent;
            }
            return control as Form;
        }

        public static IBaseForm EnclosingIBaseForm(Control control)
        {
            while (control != null && !(control is IBaseForm))
            {
                control = control.Parent;
            }
            return control as IBaseForm;
        }

    }
}
