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

using System.Drawing;
using System.Windows.Forms;

namespace GUI.TestRunnerView.TimeLineControl
{
    public class TimeLineButton : Button
    {
        /// <summary>
        /// The size of an event control button
        /// </summary>
        public static Size SIZE = new Size(40, 20);

        /// <summary>
        /// The enclosing time line control
        /// </summary>
        public TimeLineControl Enclosing
        {
            get { return Parent as TimeLineControl; }
        }

        /// <summary>
        /// The enclosing MDI window
        /// </summary>
        public MainWindow MDIWindow
        {
            get { return Enclosing.Window.MDIWindow; }
        }

        /// <summary>
        /// The corresponding runner
        /// </summary>
        protected DataDictionary.Tests.Runner.Runner Runner
        {
            get { return Enclosing.Window.EFSSystem.Runner; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        public TimeLineButton()
        {
            Size = SIZE;
            Click += new EventHandler(HandleClick);
            MouseDown += new MouseEventHandler(HandleMouseDown);
            MouseUp += new MouseEventHandler(HandleMouseUp);

            InitializeComponent();
        }

        /// <summary>
        /// Initializes the component
        /// </summary>
        protected virtual void InitializeComponent()
        {
            // Nothing to do : abstract class
        }

        /// <summary>
        /// Click!
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected virtual void HandleClick(object sender, EventArgs e)
        {
            // Abstract class, nothing to do
        }

        /// <summary>
        /// The location where the mouse down was performed
        /// </summary>
        private Point mouseDownLocation;
        protected Point MouseDownLocation
        {
            get { return mouseDownLocation; }
            private set { mouseDownLocation = value; }
        }

        /// <summary>
        /// Mouse down
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected virtual void HandleMouseDown(object sender, MouseEventArgs e)
        {
            MouseDownLocation = e.Location;
        }

        /// <summary>
        /// The location where the mouse up event occured
        /// </summary>
        private Point mouseUpLocation;
        protected Point MouseUpLocation
        {
            get { return mouseUpLocation; }
            private set { mouseUpLocation = value; }
        }

        /// <summary>
        /// The X delta between the mouse down and the mouse up events
        /// </summary>
        protected int XDelta
        {
            get { return mouseUpLocation.X - mouseDownLocation.X; }
        }

        /// <summary>
        /// The Y delta between the mouse down and the mouse up events
        /// </summary>
        protected int YDelta
        {
            get { return mouseUpLocation.Y - mouseDownLocation.Y; }
        }

        /// <summary>
        /// Mouse up
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected virtual void HandleMouseUp(object sender, MouseEventArgs e)
        {
            mouseUpLocation = e.Location;
        }

    }
}
