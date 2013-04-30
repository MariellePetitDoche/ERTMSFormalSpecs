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
        bool refreshingControl = false;

        /// <summary>
        /// Refreshes the layout, if it is not suspended
        /// </summary>
        public override void Refresh()
        {
            if (!refreshingControl)
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
                refreshingControl = true;
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
                    }
                    UpdateTransitionPosition();
                }
            }
            finally
            {
                refreshingControl = false;
                ResumeLayout(true);
            }

            Refresh();
        }

        /// <summary>
        /// Handles the rectangles that are already allocated in the diagram
        /// </summary>
        private class BoxAllocation
        {
            /// <summary>
            /// The allocated rectangles
            /// </summary>
            List<Rectangle> AllocatedBoxes = new List<Rectangle>();

            /// <summary>
            /// Constructor
            /// </summary>
            public BoxAllocation()
            {
            }

            /// <summary>
            /// Finds a rectangle which intersects with the current rectangle
            /// </summary>
            /// <param name="rectangle"></param>
            /// <returns></returns>
            public Rectangle Intersects(Rectangle rectangle)
            {
                Rectangle retVal = Rectangle.Empty;

                foreach (Rectangle current in AllocatedBoxes)
                {
                    if (current.IntersectsWith(rectangle))
                    {
                        retVal = current;
                        break;
                    }
                }

                return retVal;
            }

            /// <summary>
            /// Allocates a new rectangle 
            /// </summary>
            /// <param name="rectangle"></param>
            public void Allocate(Rectangle rectangle)
            {
                AllocatedBoxes.Add(rectangle);
            }
        }

        /// <summary>
        /// The allocated boxes
        /// </summary>
        private BoxAllocation AllocatedBoxes;

        /// <summary>
        /// Provides a distance between two points
        /// </summary>
        /// <param name="p1"></param>
        /// <param name="p2"></param>
        /// <returns></returns>
        private int distance(Point p1, Point p2)
        {
            return Math.Abs(p1.X - p2.X) + Math.Abs(p1.Y - p2.Y);
        }

        /// <summary>
        /// Updates the transition position to ensure that no overlap exists
        ///   - on the arrows
        ///   - on the transition text
        /// </summary>
        public void UpdateTransitionPosition()
        {
            ComputeTransitionArrowPosition();
            ComputeTransitionTextPosition();
        }

        /// <summary>
        /// The size of the shift between arrows to be used when overlap occurs
        /// </summary>
        static int SHIFT_SIZE = 40;

        /// <summary>
        /// The size of the shift, between texts, to be used when overlap occurs
        /// </summary>
        static int TEXT_SHIFT_SIZE = 20;

        /// <summary>
        /// 2 * Pi
        /// </summary>
        static double TWO_PI = Math.PI * 2;

        /// <summary>
        /// Ensures that two transitions do not overlap by computing an offset between the transitions
        /// </summary>
        private void ComputeTransitionArrowPosition()
        {
            List<TransitionControl> workingSet = new List<TransitionControl>();
            workingSet.AddRange(transitions.Values);

            while (workingSet.Count > 1)
            {
                TransitionControl t1 = workingSet[0];
                workingSet.Remove(t1);

                // Compute the set of transitions overlapping with t1
                List<TransitionControl> overlap = new List<TransitionControl>();
                overlap.Add(t1);
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

                // Remove all transitions of this overlap class from the working set
                foreach (TransitionControl t in overlap)
                {
                    workingSet.Remove(t);
                }

                // Shift transitions of this overlap set if they are overlapping (that is, if the set size > 1)
                if (overlap.Count > 1)
                {
                    Point shift;        // the shift to be applied to the current transition
                    Point offset;       // the offset to apply on all transitions of this overlap set

                    double angle = overlap[0].Angle;
                    if ((angle > Math.PI / 4 && angle < 3 * Math.PI / 4) ||
                        (angle < -Math.PI / 4 && angle > -3 * Math.PI / 4))
                    {
                        // Horizontal shift
                        shift = new Point(-(overlap.Count - 1) * SHIFT_SIZE / 2, 0);
                        offset = new Point(SHIFT_SIZE, 0);
                    }
                    else
                    {
                        // Vertical shift
                        shift = new Point(0, -(overlap.Count - 1) * SHIFT_SIZE / 2);
                        offset = new Point(0, SHIFT_SIZE);
                    }

                    int i = 0;
                    foreach (TransitionControl transition in overlap)
                    {
                        transition.Offset = shift;
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

        /// <summary>
        /// Computes the position of the transition texts, following the transition arrow, to avoid text overlap
        /// </summary>
        private void ComputeTransitionTextPosition()
        {
            AllocatedBoxes = new BoxAllocation();
            foreach (TransitionControl transition in transitions.Values)
            {
                Point center = transition.getCenter();
                Point upSlide = Slide(transition, center, TransitionControl.SlideDirection.Up);
                Point downSlide = Slide(transition, center, TransitionControl.SlideDirection.Down);

                Rectangle boundingBox;
                if (distance(center, upSlide) <= distance(center, downSlide))
                {
                    boundingBox = transition.getTextBoundingBox(upSlide);
                }
                else
                {
                    boundingBox = transition.getTextBoundingBox(downSlide);
                }

                transition.Location = new Point(boundingBox.X, boundingBox.Y);
                AllocatedBoxes.Allocate(boundingBox);
            }
        }

        /// <summary>
        /// Tries to slide the transition up following the transition arrow to avoid any collision
        /// with the already allocated bounding boxes
        /// </summary>
        /// <param name="transition"></param>
        /// <param name="center"></param>
        /// <returns></returns>
        private Point Slide(TransitionControl transition, Point center, TransitionControl.SlideDirection direction)
        {
            Point retVal = center;
            Rectangle colliding = AllocatedBoxes.Intersects(transition.getTextBoundingBox(retVal));

            while (colliding != Rectangle.Empty)
            {
                retVal = transition.Slide(retVal, colliding, direction);
                colliding = AllocatedBoxes.Intersects(transition.getTextBoundingBox(retVal));
            }

            return retVal;
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
            RefreshControl();
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

            Refresh();
        }

        /// <summary>
        /// Indicates whether the control is selected
        /// </summary>
        /// <param name="transitionControl"></param>
        /// <returns></returns>
        internal bool isSelected(Control control)
        {
            return StateDiagramWindow.isSelected(control);
        }
    }
}
