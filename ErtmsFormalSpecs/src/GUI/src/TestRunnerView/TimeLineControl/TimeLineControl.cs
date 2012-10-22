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
using System.Drawing;
using System.Windows.Forms;
using DataDictionary.Tests.Runner.Events;

namespace GUI.TestRunnerView.TimeLineControl
{
    /// <summary>
    /// this control displays all execution events on a timeline
    /// </summary>
    public class TimeLineControl : Panel
    {
        /// <summary>
        /// The tool tip
        /// </summary>
        private ToolTip toolTip;
        public ToolTip ToolTip
        {
            get { return toolTip; }
            private set { toolTip = value; }
        }

        /// <summary>
        /// Components for the tool tip
        /// </summary>
        private System.ComponentModel.IContainer components;

        /// <summary>
        /// The enclosing window
        /// </summary>
        public Window Window
        {
            get { return FormsUtils.EnclosingIBaseForm(this) as Window; }
        }

        /// <summary>
        /// The runner
        /// </summary>
        public DataDictionary.Tests.Runner.Runner Runner
        {
            get
            {
                if (Window != null && Window.EFSSystem.Runner != null)
                {
                    return Window.EFSSystem.Runner;
                }
                return null;
            }
        }

        /// <summary>
        /// The time line handled by this window
        /// </summary>
        public EventTimeLine TimeLine
        {
            get
            {
                if (Runner != null)
                {
                    return Runner.EventTimeLine;
                }
                return null;
            }
        }

        /// <summary>
        /// The events displayed by the event time line
        /// </summary>
        private Dictionary<ModelEvent, EventControl> handledEvents = new Dictionary<ModelEvent, EventControl>();
        public Dictionary<ModelEvent, EventControl> HandledEvents
        {
            get
            {
                if (handledEvents == null)
                {
                    handledEvents = new Dictionary<ModelEvent, EventControl>();
                }
                return handledEvents;
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        public TimeLineControl()
        {
            InitializeComponent();

            FilterConfiguration = new FilterConfiguration();
            ContextMenu = new ContextMenu();
            ContextMenu.MenuItems.Add(new MenuItem("Configure filter...", new EventHandler(OpenFilter)));
        }

        /// <summary>
        /// Provides the enclosing MDI window
        /// </summary>
        public MainWindow MDIWindow
        {
            get
            {
                Control current = Parent;
                while (current != null && !(current is MainWindow))
                {
                    current = current.Parent;
                }
                return current as MainWindow;
            }
        }

        /// <summary>
        /// The time line filtering configuration
        /// </summary>
        public FilterConfiguration FilterConfiguration { get; private set; }

        /// <summary>
        /// Opens the filtering dialog
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void OpenFilter(object sender, EventArgs e)
        {
            Filtering filtering = new Filtering();
            filtering.Configure(MDIWindow.EFSSystem, FilterConfiguration);
            filtering.ShowDialog(this);
            filtering.UpdateConfiguration(FilterConfiguration);
            Clear();
            SynchronizeWithTimeLine();
        }

        /// <summary>
        /// Removes one event control from the displayed event controls
        /// </summary>
        /// <param name="control"></param>
        private void RemoveEventControl(EventControl control)
        {
            control.Parent = null;
            Controls.Remove(control);
        }

        /// <summary>
        /// The number of events at a given time
        /// </summary>
        private Dictionary<int, int> EventsAtTime = new Dictionary<int, int>();

        /// <summary>
        /// The top position of the button
        /// </summary>
        private int EventTop(ModelEvent modelEvent)
        {
            int retVal = 0;

            if (!EventsAtTime.ContainsKey(modelEvent.Time))
            {
                EventsAtTime[modelEvent.Time] = 0;
            }

            int eventCount = EventsAtTime[modelEvent.Time];

            retVal = TIMELINE_HEIGHT + (3 * MARGIN_OFFSET) / 2 + eventCount * (EventControl.SIZE.Height);

            return retVal;
        }

        /// <summary>
        /// The right position of the button
        /// </summary>
        /// <param name="modelEvent"></param>
        /// <returns></returns>
        private int EventLeft(ModelEvent modelEvent)
        {
            int retVal = 0;

            retVal = LEGEND_WIDTH + (3 * MARGIN_OFFSET) / 2 + 1 + (modelEvent.Time / 100) * (EventControl.SIZE.Width + BUTTON_MARGIN_SIZE) - HorizontalScroll.Value;

            return retVal;
        }

        /// <summary>
        /// Indicates whether the layout is suspended
        /// </summary>
        private bool LayoutSuspended = false;

        public void MySuspendLayout()
        {
            if (!LayoutSuspended)
            {
                LayoutSuspended = true;
                SuspendLayout();
                foreach (EventControl eventControl in HandledEvents.Values)
                {
                    eventControl.SuspendLayout();
                }
            }
        }

        public void MyResumeLayout()
        {
            if (LayoutSuspended)
            {
                try
                {
                    foreach (EventControl eventControl in handledEvents.Values)
                    {
                        eventControl.ResumeLayout();
                    }
                }
                finally
                {
                    ResumeLayout();
                    LayoutSuspended = false;
                }
            }
        }

        public override void Refresh()
        {
            MySuspendLayout();
            if (TimeLine != null)
            {
                SynchronizeWithTimeLine();
                RefreshEventsState();
            }
            else
            {
                Clear();
            }
            MyResumeLayout();

            base.Refresh();
        }

        /// <summary>
        /// Removes all event controls in the panel
        /// </summary>
        private void Clear()
        {
            EventsAtTime.Clear();
            foreach (EventControl eventControl in HandledEvents.Values)
            {
                RemoveEventControl(eventControl);
            }
            HandledEvents.Clear();
        }

        /// <summary>
        /// The maximum number of events that can be displayed in the time line
        /// </summary>
        private static int MAX_NUMBER_OF_EVENTS = 1000;

        /// <summary>
        /// Synchronizes the EventControls with the Events located in the time line
        /// Hyp : When removing an event at some time, all the events for the corresponding time are also removed
        /// </summary>
        private void SynchronizeWithTimeLine()
        {
            // Remove the events that no more exist in the time line
            EventsAtTime.Clear();
            foreach (EventControl eventControl in HandledEvents.Values)
            {
                if (TimeLine.Contains(eventControl.ModelEvent))
                {
                    RegisterEventAtTime(eventControl);
                }
                else
                {
                    RemoveEventControl(eventControl);
                }
            }

            // Add EventControl for each new Event in the time line
            if (TimeLine != null)
            {
                foreach (ModelEvent modelEvent in TimeLine.Events)
                {
                    // add a EventControl for this event
                    if (FilterConfiguration.VisibleEvent(modelEvent))
                    {
                        if (!HandledEvents.ContainsKey(modelEvent))
                        {
                            if (HandledEvents.Count <= MAX_NUMBER_OF_EVENTS)
                            {
                                EventControl eventControl = new EventControl(this, modelEvent);
                                eventControl.Top = EventTop(modelEvent);
                                eventControl.Left = EventLeft(modelEvent);
                                SetPanelSize(eventControl);
                                Controls.Add(eventControl);

                                string msg = modelEvent.Message;
                                if (msg.Length > 1000)
                                {
                                    // Message is too big for tool tips, reduce it.
                                    msg = msg.Substring(0, 1000) + "...";
                                }
                                ToolTip.SetToolTip(eventControl, msg);

                                // TODO : I do not understand this one... 
                                if (!HandledEvents.ContainsKey(modelEvent))
                                {
                                    HandledEvents[modelEvent] = eventControl;
                                }
                                RegisterEventAtTime(eventControl);

                                if (HandledEvents.Count == MAX_NUMBER_OF_EVENTS)
                                {
                                    MessageBox.Show("Too many events displayed.\nDisplaying only the " + MAX_NUMBER_OF_EVENTS + " first events.\nPlease consider filtering out events.", "Too many events", MessageBoxButtons.OK, MessageBoxIcon.Error);
                                }
                            }
                        }
                    }
                }
            }
        }

        private Size RequiredSize;

        /// <summary>
        /// Sets the size of the time line to ensure that the new Event is displayed
        /// </summary>
        /// <param name="newEvent"></param>
        private void SetPanelSize(EventControl newEvent)
        {
            int width = newEvent.Location.X + newEvent.Width + MARGIN_OFFSET;
            int height = newEvent.Location.Y + newEvent.Height + MARGIN_OFFSET;

            if (RequiredSize.Width < width || RequiredSize.Height < height)
            {
                RequiredSize = new Size(width, height);
            }
        }

        /// <summary>
        /// Registers the fact that a new event is present at current time
        /// </summary>
        /// <param name="eventControl"></param>
        private void RegisterEventAtTime(EventControl eventControl)
        {
            if (!EventsAtTime.ContainsKey(eventControl.ModelEvent.Time))
            {
                EventsAtTime[eventControl.ModelEvent.Time] = 0;
            }

            EventsAtTime[eventControl.ModelEvent.Time] += 1;
        }

        private void RefreshEventsState()
        {
            foreach (EventControl eventControl in HandledEvents.Values)
            {
                eventControl.UpdateState();
            }
        }

        private static int MARGIN_OFFSET = 10;
        private static int TIMELINE_HEIGHT = 24;
        private static int DEFAULT_STEP_SIZE = 50;
        private int step_size = DEFAULT_STEP_SIZE;

        private Point timelineUpperLeft;

        /// <summary>
        /// Draws the time line
        /// </summary>
        private void drawTimeLine(PaintEventArgs pe)
        {
            Pen bluePen = new Pen(Color.Blue);
            Pen blackPen = new Pen(Color.Black);

            timelineUpperLeft = new Point(Bounds.Left, Bounds.Top);
            timelineUpperLeft.Offset(LEGEND_WIDTH + MARGIN_OFFSET, MARGIN_OFFSET);

            Size timeLineSize = new Size(Math.Max(RequiredSize.Width, Size.Width) - MARGIN_OFFSET * 2 - LEGEND_WIDTH, TIMELINE_HEIGHT);
            Rectangle timeLineRectangle = new Rectangle(timelineUpperLeft, timeLineSize);
            pe.Graphics.DrawRectangle(bluePen, timeLineRectangle);
            SolidBrush shadowBrush = new SolidBrush(Color.FromArgb(50, Color.Gray));
            pe.Graphics.FillRectangle(shadowBrush, timeLineRectangle);

            Point current = new Point(timelineUpperLeft.X, timelineUpperLeft.Y + timeLineSize.Height);
            while (current.X < timeLineRectangle.Right)
            {
                pe.Graphics.DrawLine(blackPen, current, new Point(current.X, current.Y - (timeLineSize.Height / 3)));
                current.Offset(EventControl.SIZE.Width + MARGIN_OFFSET / 2, 0);
            }
        }

        protected override void OnPaint(PaintEventArgs pe)
        {
            drawTimeLine(pe);
        }

        public static int BUTTON_MARGIN_SIZE = 5;
        public static int LEGEND_WIDTH = 30;

        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.toolTip = new ToolTip(this.components);
            toolTip.Active = true;
            toolTip.InitialDelay = 250;
            AutoScroll = true;
        }
    }
}
