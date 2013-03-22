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
using System.ComponentModel;
using System.Drawing;
using System.Windows.Forms;
using DataDictionary.Constants;
using DataDictionary.Rules;
using DataDictionary.Types;
using Utils;

namespace GUI.StateDiagram
{
    public partial class StateDiagramWindow : Form
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public StateDiagramWindow()
        {
            InitializeComponent();
        }

        /// <summary>
        /// The state machine currently displayed
        /// </summary>
        private StateMachine stateMachine;
        public StateMachine StateMachine
        {
            get { return stateMachine; }
            set
            {
                stateMachine = value;
                StateContainerPanel.StateMachine = value;
            }
        }

        /// <summary>
        /// Provides access to the enclosing MDI window
        /// </summary>
        public MainWindow MDIWindow
        {
            get { return GUIUtils.EnclosingFinder<MainWindow>.find(this); }
        }

        /// <summary>
        /// A state editor
        /// </summary>
        private class StateEditor
        {
            private StateControl control;

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="control"></param>
            public StateEditor(StateControl control)
            {
                this.control = control;
            }

            [Category("Description")]
            public string Name
            {
                get { return control.State.Name; }
                set
                {
                    control.State.Name = value;
                    control.RefreshControl();
                }
            }

            [Category("Description")]
            public Point Position
            {
                get { return new Point(control.State.getX(), control.State.getY()); }
                set
                {
                    control.State.setX(value.X);
                    control.State.setY(value.Y);
                    control.RefreshControl();
                }
            }

            [Category("Description")]
            public Point Size
            {
                get { return new Point(control.State.getWidth(), control.State.getHeight()); }
                set
                {
                    control.State.setWidth(value.X);
                    control.State.setHeight(value.Y);
                    control.RefreshControl();
                }
            }
        }

        private class InternalStateTypeConverter : StateTypeConverter
        {
            public override StandardValuesCollection
            GetStandardValues(ITypeDescriptorContext context)
            {
                return GetValues(((TransitionEditor)context.Instance).control.StatePanel.StateMachine);
            }
        }

        /// <summary>
        /// A transition editor
        /// </summary>
        private class TransitionEditor
        {
            public TransitionControl control;

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="control"></param>
            public TransitionEditor(TransitionControl control)
            {
                this.control = control;
            }

            [Category("Description")]
            public string Name
            {
                get
                {
                    if (control.Transition.RuleCondition != null)
                    {
                        return control.Transition.RuleCondition.Name;
                    }
                    return "Initial state";
                }
                set
                {
                    if (control.Transition.RuleCondition != null)
                    {
                        control.Transition.RuleCondition.Name = value;
                        control.RefreshControl();
                    }
                }
            }

            [Category("Description"), TypeConverter(typeof(InternalStateTypeConverter))]
            public string InitialState
            {
                get
                {
                    string retVal = "";

                    if (control.Transition.InitialState != null)
                    {
                        retVal = control.Transition.InitialState.Name;
                    }
                    return retVal;
                }
                set
                {
                    State state = DataDictionary.OverallStateFinder.INSTANCE.findByName(control.Panel.StateMachine, value);
                    if (state != null)
                    {
                        control.SetInitialState(state);
                        control.RefreshControl();
                    }
                }
            }

            [Category("Description"), TypeConverter(typeof(InternalStateTypeConverter))]
            public string TargetState
            {
                get
                {
                    string retVal = "";

                    if (control.Transition != null && control.Transition.TargetState != null)
                    {
                        retVal = control.Transition.TargetState.Name;
                    }

                    return retVal;
                }
                set
                {
                    State state = DataDictionary.OverallStateFinder.INSTANCE.findByName(control.Panel.StateMachine, value);
                    if (state != null)
                    {
                        control.SetTargetState(state);
                        control.RefreshControl();
                    }
                }
            }
        }

        private object Selected { get; set; }

        /// <summary>
        /// Selects a model element
        /// </summary>
        /// <param name="model"></param>
        public void Select(object model)
        {
            Selected = model;
            if (model is StateControl)
            {
                StateControl control = model as StateControl;
                propertyGrid.SelectedObject = new StateEditor(control);
                MDIWindow.Select(control.State);
            }
            else if (model is TransitionControl)
            {
                TransitionControl control = model as TransitionControl;
                propertyGrid.SelectedObject = new TransitionEditor(control);
                MDIWindow.Select(control.Transition.RuleCondition);
            }
            else
            {
                propertyGrid.SelectedObject = null;
            }
        }

        private void addStateMenuItem_Click(object sender, EventArgs e)
        {
            State state = (State)DataDictionary.Generated.acceptor.getFactory().createState();
            state.Name = "State" + (stateMachine.States.Count + 1);

            if (MDIWindow.DataDictionaryWindow != null)
            {
                DataDictionaryView.StateMachineTreeNode node = MDIWindow.DataDictionaryWindow.FindNode(StateMachine) as DataDictionaryView.StateMachineTreeNode;
                if (node != null)
                {
                    node.AddState(state);
                }
                else
                {
                    StateMachine.appendStates(state);
                }
            }

            StateContainerPanel.RefreshControl();
        }

        private void addTransitionMenuItem_Click(object sender, EventArgs e)
        {
            if (StateMachine.States.Count > 1)
            {
                DataDictionary.ObjectFactory factory = (DataDictionary.ObjectFactory)DataDictionary.Generated.acceptor.getFactory();
                DataDictionary.Rules.Rule rule = (DataDictionary.Rules.Rule)factory.createRule();
                rule.Name = "<Rule" + (stateMachine.Rules.Count + 1) + ">";

                DataDictionary.Rules.RuleCondition ruleCondition = (DataDictionary.Rules.RuleCondition)factory.createRuleCondition();
                ruleCondition.Name = "<RuleCondition" + (rule.RuleConditions.Count + 1) + ">";
                rule.appendConditions(ruleCondition);

                DataDictionary.Rules.Action action = (DataDictionary.Rules.Action)factory.createAction();
                action.Expression = "CurrentState <- " + ((State)StateMachine.States[1]).LiteralName;
                ruleCondition.appendActions(action);

                if (MDIWindow.DataDictionaryWindow != null)
                {
                    DataDictionaryView.StateTreeNode stateNode = MDIWindow.DataDictionaryWindow.FindNode((State)StateMachine.States[0]) as DataDictionaryView.StateTreeNode;
                    DataDictionaryView.RuleTreeNode ruleNode = stateNode.StateMachine.AddRule(rule);
                }

                StateContainerPanel.RefreshControl();
                StateContainerPanel.Refresh();

                TransitionControl control = StateContainerPanel.getTransitionControl(ruleCondition);
                Select(control);
            }
        }

        private void deleteMenuItem1_Click(object sender, EventArgs e)
        {
            IModelElement model = null;

            if (Selected is StateControl)
            {
                model = (Selected as StateControl).State;
            }
            else if (Selected is TransitionControl)
            {
                TransitionControl control = Selected as TransitionControl;
                RuleCondition ruleCondition = control.Transition.RuleCondition;
                Rule rule = ruleCondition.EnclosingRule;
                if (rule.countConditions() == 1)
                {
                    model = rule;
                }
                else
                {
                    model = ruleCondition;
                }

            }

            if (MDIWindow.DataDictionaryWindow != null)
            {
                BaseTreeNode node = MDIWindow.DataDictionaryWindow.FindNode(model);
                if (node != null)
                {
                    node.Delete();
                }
            }
            Select(null);

            StateContainerPanel.RefreshControl();
            StateContainerPanel.Refresh();
        }
    }
}
