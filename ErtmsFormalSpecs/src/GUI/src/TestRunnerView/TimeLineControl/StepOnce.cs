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

using System.Windows.Forms;

namespace GUI.TestRunnerView.TimeLineControl
{
    public class StepOnce : TimeLineButton
    {
        /// <summary>
        /// Initialize the Component
        /// </summary>
        protected override void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(StepOnce));
            this.SuspendLayout();
            // 
            // CurrentTimeControl
            // 
            this.Image = ((System.Drawing.Image)(resources.GetObject("$this.Image")));
            this.ResumeLayout(false);
        }

        /// <summary>
        /// Click!
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected override void HandleClick(object sender, EventArgs e)
        {
            Enclosing.Window.StepOnce();
        }

        /// <summary>
        /// Handles the mouse up event
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        protected override void HandleMouseUp(object sender, MouseEventArgs e)
        {
            base.HandleMouseUp(sender, e);

            if (XDelta > 0 && Runner != null)
            {
                int steps = XDelta / (SIZE.Width + TimeLineControl.BUTTON_MARGIN_SIZE);
                if (steps > 0)
                {
                    Runner.RunUntilTime(Runner.Time + steps * Runner.Step);
                }
                MDIWindow.Refresh();
            }
        }
    }
}
