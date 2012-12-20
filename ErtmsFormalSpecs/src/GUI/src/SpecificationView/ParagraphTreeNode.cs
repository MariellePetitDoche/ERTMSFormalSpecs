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

namespace GUI.SpecificationView
{
    public class ParagraphTreeNode : ReferencesParagraphTreeNode<DataDictionary.Specification.Paragraph>
    {
        /// <summary>
        /// The value editor
        /// </summary>
        private class ItemEditor : ReferencesParagraphEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }

            /// <summary>
            /// The item name
            /// </summary>
            [Category("Description")]
            public override string Name
            {
                get { return base.Name; }
                set
                {
                    base.Name = value;
                    RefreshNode();
                }
            }

            /// <summary>
            /// The item name
            /// </summary>
            [Category("Description")]
            public string Id
            {
                get { return Item.getId(); }
                set
                {
                    Item.setId(value);
                    RefreshNode();
                }
            }

            /// <summary>
            /// Provides the type of the paragraph
            /// </summary>
            [Category("Description"), TypeConverter(typeof(SpecTypeConverter))]
            public virtual DataDictionary.Generated.acceptor.Paragraph_type Type
            {
                get { return Item.getType(); }
                set
                {
                    Item.SetType(value);
                    RefreshNode();
                }
            }


            /// <summary>
            /// Provides the scope of the paragraph
            /// </summary>
            [Category("Description"), TypeConverter(typeof(ScopeConverter))]
            public virtual DataDictionary.Generated.acceptor.Paragraph_scope Scope
            {
                get { return Item.getScope(); }
                set { Item.setScope(value); }
            }

            /// <summary>
            /// Indicates if the paragraph has been reviewed (content & structure)
            /// </summary>
            [Category("Meta data")]
            public virtual bool Reviewed
            {
                get { return Item.getReviewed(); }
                set { Item.setReviewed(value); }
            }

            /// <summary>
            /// Indicates that more information is required to understand the requirement
            /// </summary>
            [Category("Meta data")]
            public virtual bool MoreInfoRequired
            {
                get { return Item.getMoreInfoRequired(); }
                set { Item.setMoreInfoRequired(value); }
            }

            /// <summary>
            /// Indicates that this paragraph has an issue
            /// </summary>
            [Category("Meta data")]
            public virtual bool SpecIssue
            {
                get { return Item.getSpecIssue(); }
                set { Item.setSpecIssue(value); }
            }

            /// <summary>
            /// Indicates if the paragraph can be implemented by the EFS
            /// </summary>
            [Category("Meta data"), TypeConverter(typeof(ImplementationStatusConverter))]
            public virtual DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM ImplementationStatus
            {
                get { return Item.getImplementationStatus(); }
                set { Item.setImplementationStatus(value); }
            }

            /// <summary>
            /// Indicates if the paragraph is functional block
            /// </summary>
            [Category("Meta data")]
            public virtual bool IsFunctionalBlock
            {
                get { return Item.getFunctionalBlock(); }
                set { Item.setFunctionalBlock(value); }
            }

            /// <summary>
            /// The name of functional block, if any
            /// </summary>
            [Category("Meta data")]
            public string FunctionalBlockName
            {
                get
                {
                    if (Item.getFunctionalBlock() && Item.getFunctionalBlockName().Equals(""))
                        Item.setFunctionalBlockName(this.Name);
                    return Item.getFunctionalBlockName();
                }
                set
                {
                    Item.setFunctionalBlockName(value);
                    RefreshNode();
                }
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public ParagraphTreeNode(DataDictionary.Specification.Paragraph item)
            : base(item)
        {
            foreach (DataDictionary.Specification.Paragraph paragraph in item.SubParagraphs)
            {
                Nodes.Add(new ParagraphTreeNode(paragraph));
            }
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        public override void SelectionChanged()
        {
            base.SelectionChanged();

            Window window = BaseForm as Window;
            if (window != null)
            {
                window.specBrowserRuleView.Nodes.Clear();
                foreach (DataDictionary.ReqRef reqRef in Item.Implementations)
                {
                    window.specBrowserRuleView.Nodes.Add(new ReqRefTreeNode(reqRef, reqRef.Model.Name));
                }
            }

            List<DataDictionary.Specification.Paragraph> paragraphs = Item.getSubParagraphs();
            paragraphs.Add(Item);
            (BaseForm as Window).toolStripStatusLabel.Text = CreateStatMessage(paragraphs);
        }

        public void ImplementedHandler(object sender, EventArgs args)
        {
            if (Item.isApplicable())
            {
                Item.setImplementationStatus(DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aImplemented);
            }

            RefreshNode();
        }

        public void NotImplementableHandler(object sender, EventArgs args)
        {
            Item.setImplementationStatus(DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aNotImplementable);
            RefreshNode();
        }

        /// <summary>
        /// Adds a new paragraph in this paragraph
        /// </summary>
        /// <param name="paragraph"></param>
        public void AddParagraph(DataDictionary.Specification.Paragraph paragraph)
        {
            Item.appendParagraphs(paragraph);
            Nodes.Add(new ParagraphTreeNode(paragraph));
            RefreshNode();
        }

        public void AddParagraphHandler(object sender, EventArgs args)
        {
            DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)DataDictionary.Generated.acceptor.getFactory().createParagraph();
            paragraph.FullId = Item.GetNewSubParagraphId();
            paragraph.Text = "";
            paragraph.setType(DataDictionary.Generated.acceptor.Paragraph_type.aREQUIREMENT);
            AddParagraph(paragraph);
        }

        /// <summary>
        /// Handles a drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            if (SourceNode is ParagraphTreeNode)
            {
                if (MessageBox.Show("Are you sure you want to move the corresponding paragraph?", "Move paragraph", MessageBoxButtons.YesNo, MessageBoxIcon.Question) == DialogResult.Yes)
                {
                    ParagraphTreeNode paragraphTreeNode = (ParagraphTreeNode)SourceNode;

                    DataDictionary.Specification.Paragraph paragraph = paragraphTreeNode.Item;
                    paragraphTreeNode.Delete();
                    AddParagraph(paragraph);
                }
            }
        }

        /// <summary>
        /// Updates the paragraph name by appending the "Table " string at its beginning
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void AddTableHandler(object sender, EventArgs args)
        {
            Item.setId("Table " + Item.getId());
            RefreshNode();
        }

        /// <summary>
        /// Updates the paragraph name by appending the "Entry " string at its beginning
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void AddEntryHandler(object sender, EventArgs args)
        {
            Item.setId("Entry " + Item.getId());
            RefreshNode();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add Table to Id", new EventHandler(AddTableHandler)));
            retVal.Add(new MenuItem("Add Entry to Id", new EventHandler(AddEntryHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Implemented", new EventHandler(ImplementedHandler)));
            retVal.Add(new MenuItem("Not implementable", new EventHandler(NotImplementableHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Add paragraph", new EventHandler(AddParagraphHandler)));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        /// <summary>
        /// Creates the stat message according to the list of paragraphs provided
        /// </summary>
        /// <param name="paragraphs"></param>
        /// <returns></returns>
        public static string CreateStatMessage(List<DataDictionary.Specification.Paragraph> paragraphs)
        {
            int subParagraphCount = paragraphs.Count;
            int implementableCount = 0;
            int implementedCount = 0;
            int unImplementedCount = 0;
            int notImplementable = 0;

            foreach (DataDictionary.Specification.Paragraph p in paragraphs)
            {
                switch (p.getImplementationStatus())
                {
                    case DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aImplemented:
                        if (!p.isApplicable())
                        {
                            p.AddWarning("Paragraph state does not correspond to implementation status");
                        }
                        implementableCount += 1;
                        implementedCount += 1;
                        break;

                    case DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aNA:
                    case DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.defaultSPEC_IMPLEMENTED_ENUM:
                        if (!p.isApplicable())
                        {
                            p.AddWarning("Paragraph state does not correspond to implementation status");
                        }
                        implementableCount += 1;
                        unImplementedCount += 1;
                        break;

                    case DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aNotImplementable:
                        if (p.isApplicable())
                        {
                            p.AddWarning("Paragraph state does not correspond to implementation status");
                        }
                        notImplementable += 1;
                        break;
                }
            }
            return subParagraphCount + " selected, "
                + implementableCount + " implementable (" + Math.Round(((float)implementableCount / subParagraphCount * 100), 2) + "%), "
                + implementedCount + " implemented (" + Math.Round(((float)implementedCount / implementableCount * 100), 2) + "%), "
                + unImplementedCount + " not implemented (" + Math.Round(((float)unImplementedCount / implementableCount * 100), 2) + "%) ";
        }
    }
}
