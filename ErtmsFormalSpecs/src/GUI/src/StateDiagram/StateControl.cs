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

namespace GUI.StateDiagram
{
    public partial class StateControl : Label
    {
        /// <summary>
        /// The size of an state control button
        /// </summary>
        public static Size DEFAULT_SIZE = new Size(100, 50);

        /// <summary>
        /// The grid size used to place states
        /// </summary>
        public static int GRID_SIZE = 10;

        /// <summary>
        /// Provides the enclosing state panel
        /// </summary>
        public StatePanel Panel
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
        /// The state which is modeled by this control
        /// </summary>
        private State state;
        public State State
        {
            get { return state; }
            set
            {
                state = value;
                RefreshControl();
            }
        }

        /// <summary>
        /// Refreshes the control according to the related state
        /// </summary>
        public void RefreshControl()
        {
            if (State.getWidth() == 0 || State.getHeight() == 0)
            {
                State.setWidth(DEFAULT_SIZE.Width);
                State.setHeight(DEFAULT_SIZE.Height);
            }
            Size = new Size(State.getWidth(), State.getHeight());

            if (State.getX() == 0 || State.getY() == 0)
            {
                Point p = Panel.GetNextPosition();
                State.setX(p.X);
                State.setY(p.Y);
            }
            SetPosition(State.getX(), State.getY());
            this.TextAlign = ContentAlignment.MiddleCenter;
            Text = State.Name;
            if (State.StateMachine.States.Count > 0)
            {
                Text = Text + "*";
            }
        }

        /// <summary>
        /// Sets the color of the state
        /// </summary>
        /// <param name="color"></param>
        private void SetColor(Color color)
        {
            if (color != BackColor)
            {
                BackColor = color;
            }
        }

        /// <summary>
        /// A normal pen
        /// </summary>
        public static Color NORMAL_COLOR = Color.LightGray;
        public static Pen NORMAL_PEN = new Pen(Color.Black);

        /// <summary>
        /// A activated pen
        /// </summary>
        public static Color ACTIVATED_COLOR = Color.Blue;
        public static Pen ACTIVATED_PEN = new Pen(Color.Black, 4);

        /// <summary>
        /// Draws the state within the state panel
        /// </summary>
        /// <param name="e"></param>
        public void PaintInStatePanel(PaintEventArgs e)
        {
            Pen pen = NORMAL_PEN;
            e.Graphics.DrawRectangle(pen, Location.X, Location.Y, Width, Height);

            DataDictionary.Variables.Procedure procedure = State.EnclosingProcedure;
            if (procedure != null)
            {
                if (Panel.StateMachine.Contains(State, State.EnclosingProcedure.CurrentState.Value))
                {
                    pen = ACTIVATED_PEN;
                    SetColor(ACTIVATED_COLOR);
                }
                else
                {
                    SetColor(NORMAL_COLOR);
                }
            }
            else
            {
                SetColor(NORMAL_COLOR);
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        public StateControl()
        {
            InitializeComponent();
            MouseDown += new MouseEventHandler(HandleMouseDown);
            MouseUp += new MouseEventHandler(HandleMouseUp);
            MouseMove += new MouseEventHandler(HandleMouseMove);
            MouseClick += new MouseEventHandler(HandleMouseClick);
            MouseDoubleClick += new MouseEventHandler(HandleMouseDoubleClick);
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="container"></param>
        public StateControl(IContainer container)
        {
            container.Add(this);

            InitializeComponent();
            MouseDown += new MouseEventHandler(HandleMouseDown);
            MouseUp += new MouseEventHandler(HandleMouseUp);
            MouseMove += new MouseEventHandler(HandleMouseMove);
            MouseClick += new MouseEventHandler(HandleMouseClick);
            MouseDoubleClick += new MouseEventHandler(HandleMouseDoubleClick);
        }

        /// <summary>
        /// Selects the current state 
        /// </summary>
        public void SelectState()
        {
            Panel.Select(this);
        }

        /// <summary>
        /// The location where the mouse down occured
        /// </summary>
        private Point moveStartLocation;

        /// <summary>
        /// The control location where the mouse down occured
        /// </summary>
        private Point positionBeforeMove;

        /// <summary>
        /// In a move operation ? 
        /// </summary>
        private bool moving = false;

        /// <summary>
        /// Handles a mouse down event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void HandleMouseDown(object sender, MouseEventArgs e)
        {
            moving = true;
            moveStartLocation = e.Location;
            positionBeforeMove = new Point(State.getX(), State.getY());

        }

        /// <summary>
        /// Handles a mouse up event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void HandleMouseUp(object sender, MouseEventArgs e)
        {
            moving = false;
            if (State.getX() != positionBeforeMove.X || State.getY() != positionBeforeMove.Y)
            {
                Panel.ControlHasMoved();
            }
        }

        /// <summary>
        /// Handles a mouse move event, when 
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void HandleMouseMove(object sender, MouseEventArgs e)
        {
            if (moving)
            {
                Point mouseMoveLocation = e.Location;

                int deltaX = mouseMoveLocation.X - moveStartLocation.X;
                int deltaY = mouseMoveLocation.Y - moveStartLocation.Y;

                if (Math.Abs(deltaX) > 5 || Math.Abs(deltaY) > 5)
                {
                    SetPosition(State.getX() + deltaX, State.getY() + deltaY);
                }
            }
        }

        /// <summary>
        /// Sets the position of the control, according to the X & Y provided
        /// </summary>
        /// <param name="x"></param>
        /// <param name="y"></param>
        private void SetPosition(int x, int y)
        {
            int posX = x / GRID_SIZE;
            posX = posX * GRID_SIZE;

            int posY = y / GRID_SIZE;
            posY = posY * GRID_SIZE;

            State.setX(posX);
            State.setY(posY);

            Location = new Point(state.getX(), state.getY());
        }

        /// <summary>
        /// Provides the center of the state control
        /// </summary>
        public Point Center
        {
            get
            {
                Point retVal = Location;

                retVal.X = retVal.X + Width / 2;
                retVal.Y = retVal.Y + Height / 2;

                return retVal;
            }
        }


        /// <summary>
        /// Handles a mouse click event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void HandleMouseClick(object sender, MouseEventArgs e)
        {
            if (EnclosingForm is StateDiagramWindow)
            {
                SelectState();
            }
        }

        /// <summary>
        /// Handles a double click event on the control
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        void HandleMouseDoubleClick(object sender, MouseEventArgs e)
        {
            SelectState();

            if (Panel != null)
            {
                StateDiagram.StateDiagramWindow window = new StateDiagram.StateDiagramWindow();
                Panel.MDIWindow.AddChildWindow(window);
                window.StateMachine = State.StateMachine;
                window.Text = State.StateMachine.Name + " state diagram";
            }
        }

        /// <summary>
        /// Provides the span of this control, over the X axis
        /// </summary>
        public Span XSpan
        {
            get { return new Span(Location.X, Location.X + Width); }
        }

        /// <summary>
        /// Provides the span of this control, over the Y axis
        /// </summary>
        public Span YSpan
        {
            get { return new Span(Location.Y, Location.Y + Height); }
        }
    }
}
