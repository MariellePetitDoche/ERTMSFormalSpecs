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
using System.Threading;
using System.Windows.Forms;

namespace GUI
{
    /// <summary>
    /// A progress dialog, for long operations
    /// </summary>
    public partial class ProgressDialog : Form
    {
        /// <summary>
        /// The work to perform
        /// </summary>
        private ParameterizedThreadStart work;
        private ParameterizedThreadStart Work
        {
            get { return work; }
            set { work = value; }
        }

        private void ManageCancel(object sender, DoWorkEventArgs e)
        {
            BackgroundWorker worker = sender as BackgroundWorker;

            Thread thread = new Thread(work);
            thread.Start();

            int percent = 0;
            while (thread.ThreadState != ThreadState.Stopped)
            {
                Thread.Sleep(100);

                if (worker.CancellationPending)
                {
                    thread.Abort();
                    break;
                }

                // Show something moving
                percent += 1;
                if (percent > 100)
                {
                    percent = 0;
                }

                worker.ReportProgress(percent);
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="reason"></param>
        /// <param name="work"></param>
        public ProgressDialog(string reason, ParameterizedThreadStart work)
        {
            InitializeComponent();

            Work = work;
            Text = reason;
            label1.Text = reason;
            backgroundWorker1.DoWork += new DoWorkEventHandler(ManageCancel);
        }

        private void btnCancel_Click(object sender, EventArgs e)
        {
            label1.Text = "Cancel pending";
            backgroundWorker1.CancelAsync();
            btnCancel.Enabled = false;
        }

        private void Progress_Load(object sender, EventArgs e)
        {
            backgroundWorker1.RunWorkerAsync();
        }

        private void backgroundWorker1_ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            progressBar1.Value = e.ProgressPercentage;
        }

        private void backgroundWorker1_RunWorkerCompleted(object sender, RunWorkerCompletedEventArgs e)
        {
            Close();
        }
    }
}
