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
using DataDictionary.Tests;
using DataDictionary.Tests.Translations;


namespace GUI.TranslationRules
{
    public class TranslationTreeNode : DataTreeNode<DataDictionary.Tests.Translations.Translation>
    {
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
            /// The step name
            /// </summary>
            [Category("Description")]
            public bool Implemented
            {
                get { return Item.getImplemented(); }
                set { Item.setImplemented(value); }
            }
        }

        SourceTextsTreeNode sources;

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public TranslationTreeNode(Translation item)
            : base(item)
        {
            sources = new SourceTextsTreeNode(item);
            Nodes.Add(sources);

            foreach (SubStep subStep in item.SubSteps)
            {
                Nodes.Add(new TestRunnerView.SubStepTreeNode(subStep));
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

        /// <summary>
        /// Creates a new source text
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public SourceTextTreeNode createSourceText(SourceText sourceText)
        {
            return sources.createSourceText(sourceText);
        }

        public void AddSourceHandler(object sender, EventArgs args)
        {
            sources.AddHandler(sender, args);
        }

        /// <summary>
        /// Creates a new sub-step
        /// </summary>
        /// <param name="testCase"></param>
        /// <returns></returns>
        public TestRunnerView.SubStepTreeNode createSubStep(DataDictionary.Tests.SubStep subStep)
        {
            TestRunnerView.SubStepTreeNode retVal = new TestRunnerView.SubStepTreeNode(subStep);

            Item.appendSubSteps(subStep);
            Nodes.Add(retVal);

            return retVal;
        }

        /// <summary>
        /// Adds a step after this one
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="args"></param>
        public void AddSubStepHandler(object sender, EventArgs args)
        {
            DataDictionary.Tests.SubStep subStep = (DataDictionary.Tests.SubStep)DataDictionary.Generated.acceptor.getFactory().createSubStep();
            subStep.Name = "Sub-step" + Nodes.Count;
            subStep.Enclosing = Item;
            createSubStep(subStep);
        }

        public override void SelectionChanged()
        {
            base.SelectionChanged();

            Window window = BaseForm as Window;

            if (window != null)
            {
                if (window.ExpressionTextBox != null)
                {
                    window.ExpressionTextBox.Lines = Utils.Utils.toStrings(Item.getExplain());
                }
                if (window.CommentsTextBox != null)
                {
                    window.CommentsTextBox.Lines = Utils.Utils.toStrings(Item.getComment());
                }
            }
            RefreshNode();
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = new List<MenuItem>();

            retVal.Add(new MenuItem("Add source text", new EventHandler(AddSourceHandler)));
            retVal.Add(new MenuItem("Add sub-step", new EventHandler(AddSubStepHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }


        /// <summary>
        /// Handles drop event
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);
            if (SourceNode is SourceTextTreeNode)
            {
                SourceTextTreeNode text = SourceNode as SourceTextTreeNode;

                DataDictionary.Tests.Translations.SourceText otherText = (DataDictionary.Tests.Translations.SourceText)DataDictionary.Generated.acceptor.getFactory().createSourceText();
                text.Item.copyTo(otherText);
                createSourceText(otherText);
                text.Delete();
            }
            else if (SourceNode is TestRunnerView.StepTreeNode)
            {
                TestRunnerView.StepTreeNode step = SourceNode as TestRunnerView.StepTreeNode;

                DataDictionary.Tests.Translations.SourceText sourceText = (DataDictionary.Tests.Translations.SourceText)DataDictionary.Generated.acceptor.getFactory().createSourceText();
                sourceText.setName(step.Item.getDescription());
                Item.appendSourceTexts(sourceText);
                createSourceText(sourceText);
            }
        }
    }
}
