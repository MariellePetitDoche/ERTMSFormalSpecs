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
using System.Drawing;
using System.Windows.Forms;
using DataDictionary.Constants;
using DataDictionary.Types;

namespace GUI.StateDiagram
{
    public partial class StatePanel : Panel
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public StatePanel()
        {
            InitializeComponent();
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="container"></param>
        public StatePanel(IContainer container)
        {
            container.Add(this);

            InitializeComponent();
        }

        /// <summary>
        /// Handles the add state event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void AddStateHandler(object sender, EventArgs e)
        {
        }

        /// <summary>
        /// Handles the add transition event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void AddTransitionHandler(object sender, EventArgs e)
        {
        }

        /// <summary>
        /// Provides access to the enclosing MDI window
        /// </summary>
        public MainWindow MDIWindow
        {
            get
            {
                MainWindow retVal = null;

                Control current = this;
                while (current != null && retVal == null)
                {
                    retVal = current as MainWindow;
                    current = current.Parent;
                }

                return retVal;
            }
        }

        /// <summary>
        /// The dictionary used to keep the relation between states and states controls
        /// </summary>
        private Dictionary<State, StateControl> states = new Dictionary<State, StateControl>();

        /// <summary>
        /// Provides the state control which corresponds to the state provided
        /// </summary>
        /// <param name="state"></param>
        /// <returns></returns>
        public StateControl getStateControl(State state)
        {
            StateControl retVal = null;

            if (state != null)
            {
                if (states.ContainsKey(state))
                {
                    retVal = states[state];
                }
            }

            return retVal;
        }

        /// <summary>
        /// The dictionary used to keep the relation between transitions and transition controls
        /// </summary>
        private Dictionary<DataDictionary.Rules.Transition, TransitionControl> transitions = new Dictionary<DataDictionary.Rules.Transition, TransitionControl>();

        /// <summary>
        /// Provides the transition control which corresponds to the transition provided
        /// </summary>
        /// <param name="transition"></param>
        /// <returns></returns>
        public TransitionControl getTransitionControl(DataDictionary.Rules.Transition transition)
        {
            TransitionControl retVal = null;

            if (transitions.ContainsKey(transition))
            {
                retVal = transitions[transition];
            }

            return retVal;
        }

        /// <summary>
        /// Provides the transition control which corresponds to the rule
        /// </summary>
        /// <param name="ruleCondition"></param>
        /// <returns></returns>
        public TransitionControl getTransitionControl(DataDictionary.Rules.RuleCondition ruleCondition)
        {
            TransitionControl retVal = null;

            foreach (TransitionControl control in transitions.Values)
            {
                if (control.Transition.RuleCondition == ruleCondition)
                {
                    retVal = control;
                    break;
                }
            }

            return retVal;
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
                RefreshControl();
            }
        }

        /// <summary>
        /// Indicates whether the layout should be suspended
        /// </summary>
        bool suspend = false;

        /// <summary>
        /// Refreshes the layout, if it is not suspended
        /// </summary>
        public override void Refresh()
        {
            if (!suspend)
            {
                base.Refresh();
            }
        }

        /// <summary>
        /// Refreshes the control according to the state machine
        /// </summary>
        public void RefreshControl()
        {
            try
            {
                suspend = true;
                SuspendLayout();

                foreach (StateControl control in states.Values)
                {
                    control.Parent = null;
                }
                states.Clear();

                foreach (TransitionControl control in transitions.Values)
                {
                    control.Parent = null;
                }
                transitions.Clear();

                if (stateMachine != null)
                {
                    Text = stateMachine.Name;
                    foreach (State state in stateMachine.States)
                    {
                        StateControl stateControl = new StateControl();
                        states[state] = stateControl;
                        stateControl.Parent = this;
                        stateControl.State = state;
                    }
                    foreach (DataDictionary.Rules.Transition transition in stateMachine.Transitions)
                    {
                        TransitionControl transitionControl = new TransitionControl();
                        transitions[transition] = transitionControl;
                        transitionControl.Parent = this;
                        transitionControl.Transition = transition;
                        transitionControl.UpdatePosition();
                        transitionControl.Visible = true;
                    }
                }
            }
            finally
            {
                suspend = false;
                ResumeLayout(true);
            }
        }

        private Point currentPosition = new Point(1, 1);
        private static int X_OFFSET = StateControl.DEFAULT_SIZE.Width + 10;
        private static int Y_OFFSET = StateControl.DEFAULT_SIZE.Height + 10;

        /// <summary>
        /// Provides the next available position in the state diagram
        /// </summary>
        /// <returns></returns>
        public Point GetNextPosition()
        {
            Point retVal = new Point(currentPosition.X, currentPosition.Y);

            currentPosition.Offset(X_OFFSET, 0);
            if (currentPosition.X > Size.Width - StateControl.DEFAULT_SIZE.Width)
            {
                currentPosition = new Point(1, currentPosition.Y + Y_OFFSET);
            }

            return retVal;
        }

        protected override void OnPaint(PaintEventArgs e)
        {
            base.OnPaint(e);

            foreach (StateControl control in states.Values)
            {
                control.PaintInStatePanel(e);
            }

            foreach (TransitionControl control in transitions.Values)
            {
                control.PaintInStatePanel(e);
            }
        }

        internal void ControlHasMoved()
        {
            foreach (TransitionControl transition in transitions.Values)
            {
                transition.UpdatePosition();
            }

            Refresh();
        }

        /// <summary>
        /// Provides the enclosing state diagram window
        /// </summary>
        StateDiagramWindow StateDiagramWindow
        {
            get { return GUIUtils.EnclosingFinder<StateDiagramWindow>.find(this); }
        }

        /// <summary>
        /// Selects a model element
        /// </summary>
        /// <param name="model"></param>
        public void Select(object model)
        {
            if (StateDiagramWindow != null)
            {
                StateDiagramWindow.Select(model);
            }
            else
            {
                if (model is StateControl)
                {
                    StateControl control = model as StateControl;
                    MDIWindow.Select(control.State);
                }
                else if (model is TransitionControl)
                {
                    TransitionControl control = model as TransitionControl;
                    MDIWindow.Select(control.Transition.RuleCondition);
                }
            }
        }

        /// <summary>
        /// The size of the shift to be used when overlap occurs
        /// </summary>
        static int SHIFT_SIZE = 40;

        /// <summary>
        /// Indicates whether the angle is nearly vertical
        /// </summary>
        /// <param name="angle"></param>
        /// <returns></returns>
        private bool aroundVertical(double angle)
        {
            // Ensure the angle is in the first or second quadrant 
            while (angle < 0)
            {
                angle = angle + 2 * Math.PI;
            }
            while (angle > Math.PI)
            {
                angle = angle - Math.PI;
            }

            return (angle > 3 * Math.PI / 8) && (angle < 5 * Math.PI / 8);
        }

        /// <summary>
        /// Ensures that two transitions do not overlap
        /// </summary>
        internal void EnsureNoOverlap()
        {
            List<TransitionControl> workingSet = new List<TransitionControl>();
            workingSet.AddRange(transitions.Values);

            while (workingSet.Count > 1)
            {
                TransitionControl t1 = workingSet[0];
                workingSet.Remove(t1);

                List<TransitionControl> overlap = new List<TransitionControl>();
                foreach (TransitionControl t in workingSet)
                {
                    if (t.Transition.InitialState == t1.Transition.InitialState &&
                        t.Transition.TargetState == t1.Transition.TargetState)
                    {
                        overlap.Add(t);
                    }
                    else if ((t.Transition.InitialState == t1.Transition.TargetState &&
                        t.Transition.TargetState == t1.Transition.InitialState))
                    {
                        overlap.Add(t);
                    }
                }

                foreach (TransitionControl t in overlap)
                {
                    workingSet.Remove(t);
                }
                overlap.Add(t1);
                if (overlap.Count > 1)
                {
                    Point shift;
                    Point offset;
                    double angle = overlap[0].Angle;
                    if ((angle > Math.PI / 4 && angle < 3 * Math.PI / 4) ||
                        (angle < -Math.PI / 4 && angle > -3 * Math.PI / 4))
                    {
                        // Horizontal shift
                        shift = new Point(-overlap.Count * SHIFT_SIZE / 4, 0);
                        offset = new Point(SHIFT_SIZE, 0);
                    }
                    else
                    {
                        shift = new Point(0, -overlap.Count * SHIFT_SIZE / 4);
                        offset = new Point(0, SHIFT_SIZE);
                    }

                    int i = 0;
                    int Yoffset = 0;
                    foreach (TransitionControl transition in overlap)
                    {
                        transition.Offset = shift;
                        if (transition.TargetStateControl != null && aroundVertical(angle))
                        {
                            transition.TextOffset = new Point(0, Yoffset);
                            Yoffset += 30;
                        }
                        shift.Offset(offset);

                        if (transition.TargetStateControl == null)
                        {
                            transition.EndOffset = new Point(0, SHIFT_SIZE * i / 2);
                        }
                        i = i + 1;
                    }
                }
            }
        }
    }
}
