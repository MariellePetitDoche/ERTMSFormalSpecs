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

using DataDictionary.Rules;

namespace GUI.StateDiagram
{
    public partial class TransitionControl : Label
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public TransitionControl()
        {
            InitializeComponent();
            MouseClick += new MouseEventHandler(MouseClickHandler);
            MouseDoubleClick += new MouseEventHandler(MouseDoubleClickHandler);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="container"></param>
        public TransitionControl(IContainer container)
        {
            container.Add(this);

            InitializeComponent();
            MouseClick += new MouseEventHandler(MouseClickHandler);
            MouseDoubleClick += new MouseEventHandler(MouseDoubleClickHandler);
        }

        /// <summary>
        /// Handles a mouse click event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void MouseClickHandler(object sender, MouseEventArgs e)
        {
            if (EnclosingForm is StateDiagramWindow)
            {
                SelectTransition();
            }
        }

        /// <summary>
        /// Handles a mouse click event on a transition
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void MouseDoubleClickHandler(object sender, MouseEventArgs e)
        {
            SelectTransition();
        }

        /// <summary>
        /// The parent state panel
        /// </summary>
        public StatePanel StatePanel
        {
            get { return GUIUtils.EnclosingFinder<StatePanel>.find(this); }
        }

        /// <summary>
        /// Provides the enclosing form
        /// </summary>
        public Form EnclosingForm
        {
            get { return GUIUtils.EnclosingFinder<Form>.find(this); }
        }

        /// <summary>
        /// Selects the current transition
        /// </summary>
        public void SelectTransition()
        {
            StatePanel.Select(this);
        }

        /// <summary>
        /// Provides the enclosing state diagram panel
        /// </summary>
        public StatePanel Panel
        {
            get { return GUIUtils.EnclosingFinder<StatePanel>.find(this); }
        }

        /// <summary>
        /// The transition which is modeled by this control
        /// </summary>
        private Transition transition;
        public Transition Transition
        {
            get { return transition; }
            set
            {
                transition = value;
                RefreshControl();
            }
        }

        /// <summary>
        /// Refreshes the control contents, according to the modeled transition
        /// </summary>
        public void RefreshControl()
        {
            if (Transition.RuleCondition != null)
            {
                Text = Transition.RuleCondition.Name;
            }
            else
            {
                Text = "Initial state";

            }
            AutoSize = true;
            Panel.Refresh();
        }

        /// <summary>
        /// Provides the state control which corresponds to the initial state
        /// </summary>
        public StateControl InitialStateControl
        {
            get
            {
                StateControl retVal = null;

                if (Transition.InitialState != null)
                {
                    retVal = Panel.getStateControl(Transition.InitialState);
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the state control which corresponds to the target state
        /// </summary>
        public StateControl TargetStateControl
        {
            get
            {
                StateControl retVal = null;

                retVal = Panel.getStateControl(Transition.TargetState);

                return retVal;
            }
        }

        /// <summary>
        /// The size of a transition when no initial state is defined
        /// </summary>
        private static int INITIAL_TRANSITION_LENGTH = 40;

        private static double ARROW_LENGTH = 10.0;
        private static double ARROW_ANGLE = Math.PI / 6;

        /// <summary>
        /// Provides the angle the transition performs
        /// </summary>
        public double Angle
        {
            get
            {
                double retVal = Math.PI / 2;

                if (InitialStateControl != null && TargetStateControl != null)
                {
                    double deltaX = TargetStateControl.Center.X - InitialStateControl.Center.X;
                    double deltaY = TargetStateControl.Center.Y - InitialStateControl.Center.Y;
                    retVal = Math.Atan2(deltaY, deltaX);

                    // Make horizontal or vertical transitions, when possible
                    if (Span.Intersection(InitialStateControl.XSpan, TargetStateControl.XSpan) != null)
                    {
                        if (retVal >= 0)
                        {
                            // Quadrant 1 & 2
                            retVal = Math.PI / 2;
                        }
                        else
                        {
                            // Quadrant 3 & 4
                            retVal = -Math.PI / 2;
                        }
                    }
                    else
                    {
                        if (Span.Intersection(InitialStateControl.YSpan, TargetStateControl.YSpan) != null)
                        {
                            if (Math.Abs(retVal) >= Math.PI / 2)
                            {
                                // Quadrant 2 & 3
                                retVal = Math.PI;
                            }
                            else
                            {
                                // Quadrant 1 & 4
                                retVal = 0;
                            }
                        }
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the start location of the transition
        /// </summary>
        public Point StartLocation
        {
            get
            {
                Point retVal;

                int x;
                int y;

                StateControl initialStateControl = InitialStateControl;
                StateControl targetStateControl = TargetStateControl;

                if (initialStateControl != null)
                {
                    Point center = initialStateControl.Center;
                    double angle = Angle;

                    x = center.X + (int)(Math.Cos(angle) * initialStateControl.Width / 2);
                    y = center.Y + (int)(Math.Sin(angle) * initialStateControl.Height / 2);

                    if (targetStateControl != null)
                    {
                        Span xIntersection = Span.Intersection(initialStateControl.XSpan, targetStateControl.XSpan);
                        if (xIntersection != null)
                        {
                            x = xIntersection.Center + Math.Max(initialStateControl.Location.X, targetStateControl.Location.X);
                        }

                        Span yIntersection = Span.Intersection(initialStateControl.YSpan, targetStateControl.YSpan);
                        if (yIntersection != null)
                        {
                            y = yIntersection.Center + Math.Max(initialStateControl.Location.Y, targetStateControl.Location.Y);
                        }
                    }

                    retVal = new Point(x, y);
                }
                else if (targetStateControl != null)
                {
                    retVal = new Point(targetStateControl.Center.X, targetStateControl.Location.Y - INITIAL_TRANSITION_LENGTH);
                }
                else
                {
                    retVal = new Point(50, 50);
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the target location of the transition
        /// </summary>
        public Point TargetLocation
        {
            get
            {
                Point retVal;

                int x;
                int y;

                StateControl initialStateControl = InitialStateControl;
                StateControl targetStateControl = TargetStateControl;

                if (targetStateControl != null)
                {
                    Point center = targetStateControl.Center;
                    double angle = Math.PI + Angle;

                    x = center.X + (int)(Math.Cos(angle) * targetStateControl.Width / 2);
                    y = center.Y + (int)(Math.Sin(angle) * targetStateControl.Height / 2);

                    if (initialStateControl != null)
                    {
                        Span xIntersection = Span.Intersection(initialStateControl.XSpan, targetStateControl.XSpan);
                        if (xIntersection != null)
                        {
                            x = xIntersection.Center + Math.Max(initialStateControl.Location.X, targetStateControl.Location.X);
                        }

                        Span yIntersection = Span.Intersection(initialStateControl.YSpan, targetStateControl.YSpan);
                        if (yIntersection != null)
                        {
                            y = yIntersection.Center + Math.Max(initialStateControl.Location.Y, targetStateControl.Location.Y);
                        }
                    }

                    retVal = new Point(x, y);
                }
                else if (initialStateControl != null)
                {
                    retVal = new Point(initialStateControl.Center.X, initialStateControl.Location.Y + initialStateControl.Height + INITIAL_TRANSITION_LENGTH);
                }
                else
                {
                    retVal = new Point(50, 50 + INITIAL_TRANSITION_LENGTH);
                }
                retVal.Offset(EndOffset);

                return retVal;
            }
        }

        /// <summary>
        /// Sets the label color
        /// </summary>
        /// <param name="color"></param>
        private void SetColor(Color color)
        {
            if (ForeColor != color)
            {
                ForeColor = color;
            }
        }

        /// <summary>
        /// A normal pen
        /// </summary>
        public static Color NORMAL_COLOR = Color.Black;
        public static Pen NORMAL_PEN = new Pen(NORMAL_COLOR);

        /// <summary>
        /// A pen indicating that the transition is disabled
        /// </summary>
        public static Color DISABLED_COLOR = Color.Red;
        public static Pen DISABLED_PEN = new Pen(DISABLED_COLOR);

        /// <summary>
        /// A activated pen
        /// </summary>
        public static Color ACTIVATED_COLOR = Color.Blue;
        public static Pen ACTIVATED_PEN = new Pen(ACTIVATED_COLOR, 4);

        /// <summary>
        /// Draws the transition within the state panel
        /// </summary>
        /// <param name="e"></param>
        public void PaintInStatePanel(PaintEventArgs e)
        {
            if (Visible)
            {
                double angle = Angle;
                Point start = StartLocation;
                Point target = TargetLocation;

                // Apply the offset to avoid overlaps
                start.Offset(Offset);
                target.Offset(Offset);

                // Select the pen used to draw the arrow
                Pen pen = NORMAL_PEN;
                SetColor(NORMAL_COLOR);
                if (Transition.RuleCondition != null)
                {
                    if (Transition.RuleCondition.IsDisabled())
                    {
                        pen = DISABLED_PEN;
                        SetColor(DISABLED_COLOR);
                    }
                    else
                    {
                        DataDictionary.Tests.Runner.Runner runner = Transition.RuleCondition.EFSSystem.Runner;
                        if (runner != null)
                        {
                            if (runner.RuleActivatedAtTime(Transition.RuleCondition, runner.LastActivationTime))
                            {
                                pen = ACTIVATED_PEN;
                                SetColor(ACTIVATED_COLOR);
                            }
                        }
                    }
                }

                // Draw the arrow
                e.Graphics.DrawLine(pen, start, target);
                {
                    int x = target.X - (int)(Math.Cos(angle + ARROW_ANGLE) * ARROW_LENGTH);
                    int y = target.Y - (int)(Math.Sin(angle + ARROW_ANGLE) * ARROW_LENGTH);
                    e.Graphics.DrawLine(pen, target, new Point(x, y));
                }
                {
                    int x = target.X - (int)(Math.Cos(angle - ARROW_ANGLE) * ARROW_LENGTH);
                    int y = target.Y - (int)(Math.Sin(angle - ARROW_ANGLE) * ARROW_LENGTH);
                    e.Graphics.DrawLine(pen, target, new Point(x, y));
                }

                if (TargetStateControl == null)
                {
                    Font boldFont = new Font(Font, FontStyle.Bold);
                    string targetStateName = transition.getTargetStateName();

                    SizeF size = e.Graphics.MeasureString(targetStateName, boldFont);
                    int x = target.X - (int)(size.Width / 2);
                    int y = target.Y + 10;
                    e.Graphics.DrawString(targetStateName, boldFont, pen.Brush, new Point(x, y));
                }
            }
        }

        /// <summary>
        /// Updates the position of the label, according to the initial state and target state
        /// </summary>
        public void UpdatePosition()
        {
            // Set the start & end location of the arrow
            Point startLocation = StartLocation;
            Point targetLocation = TargetLocation;
            (Parent as StatePanel).EnsureNoOverlap();

            startLocation.Offset(Offset);
            targetLocation.Offset(Offset);
            targetLocation.Offset(EndOffset);

            // Set the location of the text
            Span Xspan = new Span(startLocation.X, targetLocation.X);
            Span Yspan = new Span(startLocation.Y, targetLocation.Y);

            int x = Math.Min(startLocation.X, targetLocation.X) + Xspan.Center - Width / 2;
            int y = Math.Min(startLocation.Y, targetLocation.Y) + Yspan.Center - Height / 2;

            if (InitialStateControl == null)
            {
                y = y - INITIAL_TRANSITION_LENGTH / 2;
            }

            Point tmp = new Point(x, y);
            tmp.Offset(TextOffset);
            Location = tmp;
        }

        /// <summary>
        /// Sets the initial state of the transition controlled by this transition control
        /// </summary>
        /// <param name="state"></param>
        public void SetInitialState(DataDictionary.Constants.State state)
        {
            Transition.SetInitialState(state);
            UpdatePosition();
            RefreshControl();
        }

        /// <summary>
        /// Sets the target state of the transition controlled by this transition control
        /// </summary>
        /// <param name="state"></param>
        public void SetTargetState(DataDictionary.Constants.State state)
        {
            Transition.SetTargetState(state);
            UpdatePosition();
            RefreshControl();
        }

        /// <summary>
        /// The offset to apply to the start location & end location before painting the transition
        /// </summary>
        public Point Offset { get; set; }

        /// <summary>
        /// The offset to apply to the text before painting the transition
        /// </summary>
        public Point TextOffset { get; set; }

        /// <summary>
        /// The offset to be applied to the end transition
        /// </summary>
        public Point EndOffset { get; set; }
    }
}
