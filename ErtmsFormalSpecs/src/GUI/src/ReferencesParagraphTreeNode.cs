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

using System.Drawing;
using System.Drawing.Design;

namespace GUI
{
    public abstract class ReferencesParagraphTreeNode<T> : DataTreeNode<T>
        where T : DataDictionary.ReferencesParagraph
    {
        /// <summary>
        /// The editor for message variables
        /// </summary>
        protected class ReferencesParagraphEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            protected ReferencesParagraphEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// The tree node that holds the references to requirements
        /// </summary>
        protected ReqRefsTreeNode ReqReferences;

        /// <summary>
        /// Indicates whether this node handles requirements
        /// </summary>
        protected bool HandleRequirements { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        protected ReferencesParagraphTreeNode(T item)
            : base(item)
        {
            HandleRequirements = true;
            if (item.Requirements.Count > 0)
            {
                ReqReferences = new ReqRefsTreeNode(item);
                Nodes.Add(ReqReferences);
            }
        }


        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        protected ReferencesParagraphTreeNode(string name, T item)
            : base(name, item)
        {
            HandleRequirements = true;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        protected ReferencesParagraphTreeNode(string name, T item, bool addRequirements)
            : base(name, item)
        {
            HandleRequirements = addRequirements;
            if (addRequirements && item.Requirements.Count > 0)
            {
                ReqReferences = new ReqRefsTreeNode(item);
                Nodes.Add(ReqReferences);
            }
        }

        /// <summary>
        /// Handles a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (HandleRequirements && ReqReferences == null)
            {
                ReqReferences = new ReqRefsTreeNode(Item);
                Nodes.Add(ReqReferences);
            }

            if (ReqReferences != null)
            {
                if (SourceNode is SpecificationView.ParagraphTreeNode)
                {
                    SpecificationView.ParagraphTreeNode paragraphTreeNode = (SpecificationView.ParagraphTreeNode)SourceNode;

                    ReqReferences.CreateReqRef(paragraphTreeNode.Item.FullId);
                }
            }
        }

        public override void SelectionChanged()
        {
            base.SelectionChanged();

            DataDictionaryView.Window window = BaseForm as DataDictionaryView.Window;
            if (window != null)
            {
                window.requirementsTextBox.Lines = Utils.Utils.toStrings(Item.getRequirements());
            }
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            return retVal;
        }

    }
}
