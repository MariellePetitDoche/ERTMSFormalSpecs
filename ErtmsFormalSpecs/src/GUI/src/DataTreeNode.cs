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
using Utils;

namespace GUI
{
    /// <summary>
    /// The base class for all tree nodes
    /// </summary>
    public class BaseTreeNode : TreeNode, IComparable<BaseTreeNode>
    {
        /// <summary>
        /// The fixed node name
        /// </summary>
        private string defaultName;
        private string DefaultName
        {
            get { return defaultName; }
            set { defaultName = value; }
        }

        /// <summary>
        /// The model represented by this node
        /// </summary>
        private Utils.IModelElement model;
        public Utils.IModelElement Model
        {
            get { return model; }
            private set { model = value; }
        }

        /// <summary>
        /// Provides the base tree view which holds this node
        /// </summary>
        public BaseTreeView BaseTreeView
        {
            get
            {
                return TreeView as BaseTreeView;
            }
        }

        /// <summary>
        /// Provides the base form which holds this node
        /// </summary>
        public IBaseForm BaseForm
        {
            get
            {
                IBaseForm retVal = null;

                BaseTreeView treeView = BaseTreeView;
                if (treeView != null)
                {
                    retVal = treeView.ParentForm;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="value"></param>
        public BaseTreeNode(Utils.IModelElement value, string name = null, bool isFolder = false)
            : base(name)
        {
            Model = value;

            if (name != null)
            {
                DefaultName = name;
            }

            setImageIndex(isFolder);
            RefreshNode();
        }

        /// <summary>
        /// Sets the image index for this node
        /// </summary>
        /// <param name="isFolder">Indicates whether this item represents a folder</param>
        protected virtual void setImageIndex(bool isFolder)
        {
            if (ImageIndex == -1)
            {
                // Image index not yet selected
                ImageIndex = BaseTreeView.ModelImageIndex;

                if (isFolder)
                {
                    ImageIndex = BaseTreeView.ClosedFolderImageIndex;
                }
                else
                {
                    Utils.IModelElement element = Model;
                    while (element != null && ImageIndex == BaseTreeView.ModelImageIndex)
                    {
                        element = element.Enclosing as IModelElement;
                        if (element is DataDictionary.Tests.Frame
                            || element is DataDictionary.Tests.SubSequence
                            || element is DataDictionary.Tests.TestCase
                            || element is DataDictionary.Tests.Step)
                        {
                            ImageIndex = BaseTreeView.TestImageIndex;
                        }

                        if (element is DataDictionary.Specification.Specification
                            || element is DataDictionary.Specification.Chapter
                            || element is DataDictionary.Specification.Paragraph)
                        {
                            ImageIndex = BaseTreeView.RequirementImageIndex;
                        }
                    }
                }
            }

            SelectedImageIndex = ImageIndex;
        }

        /// <summary>
        /// Called before the selection changes
        /// </summary>
        public virtual void BeforeSelectionChange()
        {
        }

        /// <summary>
        /// Handles a selection change event
        /// </summary>
        public virtual void SelectionChanged()
        {
            if (BaseTreeView.RefreshNodeContent)
            {
                IBaseForm baseForm = BaseForm;
                if (baseForm != null)
                {
                    if (baseForm.ExpressionTextBox != null)
                    {
                        if (Model.ExpressionText != null)
                        {
                            baseForm.ExpressionTextBox.Lines = Utils.Utils.toStrings(Model.ExpressionText);
                            baseForm.ExpressionTextBox.Enabled = true;
                        }
                        else
                        {
                            baseForm.ExpressionTextBox.Text = "";
                            baseForm.ExpressionTextBox.Enabled = false;
                        }

                        RefreshNode();
                    }

                    if (baseForm.CommentsTextBox != null)
                    {
                        if (Model is DataDictionary.ICommentable)
                        {
                            DataDictionary.ICommentable commentable = (DataDictionary.ICommentable)Model;

                            baseForm.CommentsTextBox.Lines = Utils.Utils.toStrings(commentable.Comment);
                            baseForm.CommentsTextBox.Enabled = true;
                        }
                        else
                        {
                            baseForm.CommentsTextBox.Text = "";
                            baseForm.CommentsTextBox.Enabled = false;
                        }

                        RefreshNode();
                    }

                    if (baseForm.MessagesTextBox != null)
                    {
                        baseForm.MessagesTextBox.Lines = Utils.Utils.toStrings(Model.Messages);
                        baseForm.MessagesTextBox.ReadOnly = true;
                    }

                    if (baseForm.subTreeView != null)
                    {
                        baseForm.subTreeView.SetRoot(Model);
                    }

                    if (baseForm.ExplainTextBox != null)
                    {
                        baseForm.ExplainTextBox.SetModel(Model);
                    }
                }
            }
        }

        /// <summary>
        /// Handles a double click event on this tree node
        /// </summary>
        public virtual void DoubleClickHandler()
        {
            // By default, nothing to do
        }

        /// <summary>
        /// Handles a expression text change event
        /// </summary>
        /// <param name="text">the new text</param>
        public virtual void ExpressionTextChanged(string text)
        {
            IBaseForm baseForm = BaseForm;
            if (baseForm != null && baseForm.ExpressionTextBox != null)
            {
                Model.ExpressionText = baseForm.ExpressionTextBox.Text;
            }
        }

        /// <summary>
        /// Handles a comment text change event
        /// </summary>
        /// <param name="text">the new text</param>
        public virtual void CommentTextChanged(string text)
        {
            IBaseForm baseForm = BaseForm;
            if (baseForm != null && baseForm.ExpressionTextBox != null)
            {
                if (Model is DataDictionary.ICommentable)
                {
                    DataDictionary.ICommentable commentable = (DataDictionary.ICommentable)Model;

                    commentable.Comment = baseForm.CommentsTextBox.Text;
                }
            }
        }

        /// <summary>
        /// Compares two tree nodes, used by the sort
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public int CompareTo(BaseTreeNode other)
        {
            if (Model != null && other.Model != null)
            {
                return Model.CompareTo(other.Model);
            }
            else
            {
                return Text.CompareTo(other.Text);
            }
        }

        private static System.Drawing.Color NOTHING_COLOR = System.Drawing.Color.Black;
        private static System.Drawing.Color ERROR_COLOR = System.Drawing.Color.Red;
        private static System.Drawing.Color ERROR_COLOR_PATH = System.Drawing.Color.Orange;
        private static System.Drawing.Color WARNING_COLOR = System.Drawing.Color.Brown;
        private static System.Drawing.Color WARNING_COLOR_PATH = System.Drawing.Color.LightCoral;
        private static System.Drawing.Color INFO_COLOR = System.Drawing.Color.Blue;
        private static System.Drawing.Color INFO_COLOR_PATH = System.Drawing.Color.LightBlue;

        private static Dictionary<System.Drawing.Color, int> value;

        private static Dictionary<System.Drawing.Color, int> Value
        {
            get
            {
                if (value == null)
                {
                    value = new Dictionary<System.Drawing.Color, int>();
                    value[ERROR_COLOR] = 10;
                    value[ERROR_COLOR_PATH] = 9;
                    value[WARNING_COLOR] = 8;
                    value[WARNING_COLOR_PATH] = 7;
                    value[INFO_COLOR] = 6;
                    value[INFO_COLOR_PATH] = 5;
                    value[NOTHING_COLOR] = 4;
                }
                return value;
            }
        }

        /// <summary>
        /// An order between colors
        /// </summary>
        /// <param name="col1"></param>
        /// <param name="col2"></param>
        /// <returns></returns>
        private static System.Drawing.Color max(System.Drawing.Color col1, System.Drawing.Color col2)
        {
            System.Drawing.Color retVal = col1;

            int v1;
            int v2;

            Value.TryGetValue(col1, out v1);
            Value.TryGetValue(col2, out v2);

            if (v2 > v1)
            {
                retVal = col2;
            }

            return retVal;
        }


        /// <summary>
        /// Updates the node color according to the associated messages
        /// </summary>
        protected virtual void UpdateColor()
        {
            System.Drawing.Color color = System.Drawing.Color.Black;

            if (Model != null)
            {
                // Compute the color associated to sub elements
                foreach (BaseTreeNode node in Nodes)
                {
                    color = max(color, node.ForeColor);
                }

                if (color == ERROR_COLOR)
                {
                    color = ERROR_COLOR_PATH;
                }
                else if (color == WARNING_COLOR)
                {
                    color = WARNING_COLOR_PATH;
                }
                else if (color == INFO_COLOR)
                {
                    color = INFO_COLOR_PATH;
                }

                color = max(color, ColorByErrorLevel());
            }

            if (color != ForeColor)
            {
                ForeColor = color;
            }
        }

        /// <summary>
        /// Provides the color corresponding to the error level
        /// </summary>
        /// <returns></returns>
        private System.Drawing.Color ColorByErrorLevel()
        {
            System.Drawing.Color retVal = NOTHING_COLOR;

            foreach (Utils.ElementLog log in Model.Messages)
            {
                if (log.Level == Utils.ElementLog.LevelEnum.Error)
                {
                    retVal = max(retVal, ERROR_COLOR);
                    break;
                }
                else if (log.Level == Utils.ElementLog.LevelEnum.Warning)
                {
                    retVal = max(retVal, WARNING_COLOR);
                }
                else if (log.Level == Utils.ElementLog.LevelEnum.Info)
                {
                    retVal = max(retVal, INFO_COLOR);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Updates the node name text according to the modelized item
        /// </summary>
        protected virtual void UpdateText()
        {
            string name = "";
            if (DefaultName != null)
            {
                name = DefaultName;
            }
            else
            {
                if (Model != null)
                {
                    name = Model.Name;
                }
            }
            if (Text != name && !Utils.Utils.isEmpty(name))
            {
                Text = name;
            }
        }

        /// <summary>
        /// Deletes the item modelised by this tree node
        /// </summary>
        public virtual void Delete()
        {
            BaseTreeNode parent = Parent as BaseTreeNode;
            if ((parent != null) && (parent.Nodes != null))
            {
                parent.Nodes.Remove(this);
                Model.Delete();

                if (model is DataDictionary.ReqRelated)
                {
                    DataDictionary.ReqRelated reqRelated = (DataDictionary.ReqRelated)model;
                    reqRelated.setVerified(false);
                }

                DataDictionary.Generated.ControllersManager.NamableController.alertChange(null, null);
            }
        }

        /// <summary>
        /// Deletes the selected item
        /// </summary>
        public virtual void DeleteHandler(object sender, EventArgs args)
        {
            Delete();
        }

        /// <summary>
        /// Marks all model elements as implemented
        /// </summary>
        private class MarkAsImplementedVisitor : DataDictionary.Generated.Visitor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public MarkAsImplementedVisitor(Utils.IModelElement element)
            {
                if (element is DataDictionary.ModelElement)
                {
                    visit((DataDictionary.ModelElement)element);
                    dispatch((DataDictionary.ModelElement)element);
                }
            }

            /// <summary>
            /// Marks all req related as implemented
            /// </summary>
            /// <param name="obj"></param>
            /// <param name="visitSubNodes"></param>
            public override void visit(DataDictionary.Generated.ReqRelated obj, bool visitSubNodes)
            {
                obj.setImplemented(true);

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Recursively marks all model elements as implemented
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void MarkAsImplemented(object sender, EventArgs e)
        {
            MarkAsImplementedVisitor visitor = new MarkAsImplementedVisitor(Model);
        }

        /// <summary>
        /// Marks all model elements as verified
        /// </summary>
        private class MarkAsVerifiedVisitor : DataDictionary.Generated.Visitor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public MarkAsVerifiedVisitor(Utils.IModelElement element)
            {
                if (element is DataDictionary.ModelElement)
                {
                    visit((DataDictionary.ModelElement)element);
                    dispatch((DataDictionary.ModelElement)element);
                }
            }

            /// <summary>
            /// Marks all req related as implemented
            /// </summary>
            /// <param name="obj"></param>
            /// <param name="visitSubNodes"></param>
            public override void visit(DataDictionary.Generated.ReqRelated obj, bool visitSubNodes)
            {
                obj.setVerified(true);

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Recursively marks all model elements as verified
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void MarkAsVerified(object sender, EventArgs e)
        {
            MarkAsVerifiedVisitor visitor = new MarkAsVerifiedVisitor(Model);
        }

        /// <summary>
        /// Recursively marks all model elements as verified
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected void RefreshNodeHandler(object sender, EventArgs e)
        {
            RefreshNode();
        }

        /// <summary>
        /// Launches label editing
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void LabelEditHandler(object sender, EventArgs args)
        {
            BeginEdit();
        }

        /// <summary>
        /// Provides the menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected virtual List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Recursively mark as implemented", new EventHandler(MarkAsImplemented)));
            retVal.Add(new MenuItem("Recursively mark as verified", new EventHandler(MarkAsVerified)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Refresh", new EventHandler(RefreshNodeHandler)));
            retVal.Add(new MenuItem("Rename", new EventHandler(LabelEditHandler)));

            return retVal;
        }

        /// <summary>
        /// Provides the context menu for this item
        /// </summary>
        public override ContextMenu ContextMenu
        {
            get
            {
                return new ContextMenu(GetMenuItems().ToArray());
            }
        }

        /// <summary>
        /// Provides the sub node whose text matches the string provided as parameter
        /// </summary>
        /// <param name="text"></param>
        /// <returns></returns>
        public BaseTreeNode findSubNode(string text)
        {
            BaseTreeNode retVal = null;

            foreach (TreeNode node in Nodes)
            {
                if (node.Text.CompareTo(text) == 0)
                {
                    retVal = node as BaseTreeNode;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// refreshes the node text and color
        /// </summary>
        public virtual void RefreshNode()
        {
            UpdateText();
            UpdateColor();
            if (BaseForm != null && BaseForm.MessagesTextBox != null)
            {
                if (BaseForm.Selected == Model)
                {
                    BaseForm.MessagesTextBox.Lines = Utils.Utils.toStrings(Model.Messages);
                    BaseForm.MessagesTextBox.ReadOnly = true;
                }
            }
        }

        /// <summary>
        /// Clears messages for all nodes under this node
        /// </summary>
        public void ClearMessages()
        {
            Model.Messages.Clear();
            foreach (BaseTreeNode node in Nodes)
            {
                node.ClearMessages();
            }
        }

        /// <summary>
        /// Sort the sub nodes of this node
        /// </summary>
        public virtual void SortSubNodes()
        {
            List<BaseTreeNode> subNodes = new List<BaseTreeNode>();

            foreach (BaseTreeNode node in Nodes)
            {
                subNodes.Add(node);
            }
            subNodes.Sort();

            Nodes.Clear();
            foreach (BaseTreeNode node in subNodes)
            {
                Nodes.Add(node);
            }
        }

        /// <summary>
        /// Accepts the drop of a base tree node on this node
        /// </summary>
        /// <param name="SourceNode"></param>
        public virtual void AcceptDrop(BaseTreeNode SourceNode)
        {
        }

        /// <summary>
        /// Accepts the drop of a base tree node on this node
        /// </summary>
        /// <param name="SourceNode"></param>
        public virtual void AcceptCopy(BaseTreeNode SourceNode)
        {
            XmlBooster.XmlBBase xmlBBase = SourceNode.Model as XmlBooster.XmlBBase;
            if (xmlBBase != null)
            {
                string data = xmlBBase.ToXMLString();
                XmlBooster.XmlBStringContext ctxt = new XmlBooster.XmlBStringContext(data);
                try
                {
                    DataDictionary.ModelElement copy = DataDictionary.Generated.acceptor.accept(ctxt) as DataDictionary.ModelElement;
                    Model.AddModelElement(copy);
                    MainWindow.RefreshModel();
                }
                catch (Exception)
                {
                    MessageBox.Show("Cannot copy element\n" + data);
                }
            }
        }

        /// <summary>
        /// Accepts the move of a base tree node on this node
        /// </summary>
        /// <param name="SourceNode"></param>
        public virtual void AcceptMove(BaseTreeNode SourceNode)
        {
            System.Collections.ArrayList SourceCollection = SourceNode.Model.EnclosingCollection;
            System.Collections.ArrayList ThisCollection = Model.EnclosingCollection;

            if (ThisCollection != null && SourceCollection == ThisCollection)
            {
                // This is a reordering
                int sourceIndex = ThisCollection.IndexOf(SourceNode.Model);
                int thisIndex = ThisCollection.IndexOf(Model);
                if (thisIndex >= 0 && thisIndex >= 0 && thisIndex != sourceIndex)
                {
                    ThisCollection.Remove(SourceNode.Model);
                    thisIndex = ThisCollection.IndexOf(Model);
                    ThisCollection.Insert(thisIndex, SourceNode.Model);
                    MainWindow.RefreshModel();
                }
            }
        }
        /// <summary>
        /// Provides the main window wich holds this tree node
        /// </summary>
        public MainWindow MainWindow
        {
            get
            {
                return (TreeView as BaseTreeView).ParentForm.MDIWindow;
            }
        }

        /// <summary>
        /// Called when an expand event is performed in this tree node
        /// </summary>
        public virtual void HandleExpand()
        {
            if (ImageIndex == BaseTreeView.ClosedFolderImageIndex)
            {
                ImageIndex = BaseTreeView.ExpandedFolderImageIndex;
                SelectedImageIndex = BaseTreeView.ExpandedFolderImageIndex;
            }
        }

        /// <summary>
        /// Called when a collapse event is performed in this tree node
        /// </summary>
        public virtual void HandleCollapse()
        {
            if (ImageIndex == BaseTreeView.ExpandedFolderImageIndex)
            {
                ImageIndex = BaseTreeView.ClosedFolderImageIndex;
                SelectedImageIndex = BaseTreeView.ClosedFolderImageIndex;
            }
        }

        /// <summary>
        /// Called when a label edit event is performed in this tree node
        /// </summary>
        public void HandleLabelEdit(string newLabel)
        {
            if (newLabel != null && newLabel != "")
            {
                Model.Name = newLabel;
            }
            RefreshNode();
        }
    }

    /// <summary>
    /// A tree node which hold a reference to a data item. 
    /// This item can be edited by a PropertyGrid
    /// </summary>
    /// <typeparam name="T"></typeparam>
    public abstract class DataTreeNode<T> : BaseTreeNode
        where T : class, Utils.IModelElement
    {
        /// <summary>
        /// An editor for an item. It is the responsibility of this class to implement attributes 
        /// for the elements to be edited.
        /// </summary>
        /// <typeparam name="T"></typeparam>
        public abstract class Editor
        {
            /// <summary>
            /// The item that is edited. 
            /// </summary>
            private T item;
            internal T Item
            {
                get { return item; }
                set { item = value; }
            }

            /// <summary>
            /// The node that holds the item. 
            /// </summary>
            private DataTreeNode<T> node;
            internal DataTreeNode<T> Node
            {
                get { return node; }
                set { node = value; }
            }

            /// <summary>
            /// The item name
            /// </summary>
            [Category("Description")]
            public virtual string Name
            {
                get { return Item.Name; }
                set
                {
                    Item.Name = value;
                    RefreshNode();
                }
            }

            /// <summary>
            /// Provides the unique identifier
            /// </summary>
            [Category("Meta data")]
            public virtual string UniqueIdentifier
            {
                get { return Item.FullName; }
            }

            public void RefreshNode()
            {
                Node.RefreshNode();
            }

            public void RefreshTree()
            {
                Node.BaseTreeView.Refresh();
            }

            /// <summary>
            /// Constructor
            /// </summary>
            protected Editor()
            {
            }
        }

        /// <summary>
        /// The element that is represented by this tree node
        /// </summary>
        private T item;
        internal T Item
        {
            get { return item; }
            set { item = value; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item">The element to be represented by this tree node</param>
        /// <param name="name">The display name of the node</param>
        /// <param name="isFolder">Indicates whether this node is a folder</param>
        protected DataTreeNode(T item, string name = null, bool isFolder = false)
            : base(item, name, isFolder)
        {
            Item = item;
            RefreshNode();
        }

        /// <summary>
        /// refreshes the node text
        /// </summary>
        public override void RefreshNode()
        {
            base.RefreshNode();

            UpdateText();
            UpdateColor();
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <param name="item"></param>
        /// <returns></returns>
        protected abstract Editor createEditor();

        /// <summary>
        /// Handles a selection change event
        /// </summary>
        public override void SelectionChanged()
        {
            base.SelectionChanged();

            if (BaseTreeView.RefreshNodeContent)
            {
                IBaseForm baseForm = BaseForm;
                if (baseForm != null)
                {
                    if (baseForm.Properties != null)
                    {
                        Editor editor = createEditor();
                        editor.Item = item;
                        editor.Node = this;
                        baseForm.Properties.SelectedObject = editor;
                    }
                }
            }
            if (BaseForm is GUI.DataDictionaryView.Window)
            {
                (BaseForm as GUI.DataDictionaryView.Window).toolStripStatusLabel.Text = "";
            }
        }
    }
}
