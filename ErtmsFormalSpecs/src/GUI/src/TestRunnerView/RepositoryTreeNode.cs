using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace GUI.TestRunnerView
{
    public class RepositoryTreeNode : SortedDataTreeNode<TestSpecification.Repository>
    {
        /// <summary>
        /// The value editor
        /// </summary>
        private class ItemEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        /// <param name="children"></param>
        public RepositoryTreeNode(TestSpecification.Repository item, List<BaseTreeNode> children)
            : base(item, children)
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

        public void AddHandler(object sender, EventArgs args)
        {
            TestSpecification.Frame frame = (TestSpecification.Frame)Item.Factory.createFrame();
            frame.Name = "Frame" + (Item.Frames.Count+1);
            Item.appendFrames(frame);

            BaseForm.Refresh();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add frame", new EventHandler(AddHandler), Shortcut.CtrlD));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler), Shortcut.CtrlD));

            return retVal;
        }
    }
}
