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
using System.Collections;
using System.Windows.Forms;
using Report;
using Report.Tests;


namespace GUI.Report
{
    public partial class TestReport : Form
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);
        private TestsCoverageReportConfig reportConfig;
        private int currentLevel; // level in filters (frame = 1, sub sequence = 2, test case = 3)

        /// <summary>
        /// The EFSSystem for which this report is built
        /// </summary>
        public DataDictionary.EFSSystem EFSSystem { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem">The system for which this frame is built</param>
        public TestReport(DataDictionary.EFSSystem efsSystem)
        {
            InitializeComponent();
            reportConfig = new TestsCoverageReportConfig(null);
            TxtB_Path.Text = reportConfig.FileName;
            EFSSystem = efsSystem;
        }


        /// <summary>
        /// Constructor: creates a report for the dictionary
        /// </summary>
        /// <param name="aDictionary"></param>
        public TestReport(DataDictionary.Dictionary aDictionary)
        {
            InitializeComponent();
            EFSSystem = aDictionary.EFSSystem;
            reportConfig = new TestsCoverageReportConfig(aDictionary);
            reportConfig.Dictionary = aDictionary;
            InitializeCheckBoxes(1);
            TxtB_Path.Text = reportConfig.FileName;
        }


        /// <summary>
        /// Constructor: creates a report for the selected frame
        /// </summary>
        /// <param name="aFrame"></param>
        public TestReport(DataDictionary.Tests.Frame aFrame)
        {
            InitializeComponent();
            EFSSystem = aFrame.EFSSystem;
            reportConfig = new TestsCoverageReportConfig(aFrame.Dictionary);
            reportConfig.Frame = aFrame;
            InitializeCheckBoxes(1);
            TxtB_Path.Text = reportConfig.FileName;
        }


        /// <summary>
        /// Constructor: creates a report for the selected sub sequence
        /// </summary>
        /// <param name="aSubSequence"></param>
        public TestReport(DataDictionary.Tests.SubSequence aSubSequence)
        {
            InitializeComponent();
            EFSSystem = aSubSequence.EFSSystem;
            reportConfig = new TestsCoverageReportConfig(aSubSequence.Dictionary);
            reportConfig.SubSequence = aSubSequence;
            InitializeCheckBoxes(2);
            TxtB_Path.Text = reportConfig.FileName;
        }


        /// <summary>
        /// Consctructor: creates a report for a selected test case
        /// </summary>
        /// <param name="aTestCase"></param>
        public TestReport(DataDictionary.Tests.TestCase aTestCase)
        {
            InitializeComponent();
            EFSSystem = aTestCase.EFSSystem;
            reportConfig = new TestsCoverageReportConfig(aTestCase.Dictionary);
            reportConfig.TestCase = aTestCase;
            InitializeCheckBoxes(3);
            TxtB_Path.Text = reportConfig.FileName;
        }


        /// <summary>
        /// Gives the list of all the controls of the form
        /// (situated on the main form or on its group boxes)
        /// </summary>
        public ArrayList AllControls
        {
            get
            {
                System.Collections.ArrayList retVal = new System.Collections.ArrayList();
                retVal.AddRange(this.Controls);
                retVal.AddRange(this.GrB_Filters.Controls);
                retVal.AddRange(this.GrB_Statistics.Controls);
                return retVal;
            }
        }


        /// <summary>
        /// Initialize the check boxes of the form (by (un)checking 
        /// or (de)activating them) according to user selection
        /// </summary>
        /// <param name="level"></param>
        private void InitializeCheckBoxes(int level)
        {
            currentLevel = level;
            foreach (Control control in AllControls)
            {
                if (control is CheckBox)
                {
                    CheckBox cb = control as CheckBox;
                    string[] tags = cb.Tag.ToString().Split('.');
                    string cbProperty = tags[0]; /* the property can be either FILTER (frame, sub sequence, ...
                                                  * either STAT (for a given filter, do we have to show its ativated rules ?..) */
                    int cbLevel;
                    Int32.TryParse(tags[1], out cbLevel);
                    if (cbLevel < level) /* for example, if we create a report for a sub sequence, we
                                          * will deselect the "frame" check box */
                    {
                        cb.Enabled = false;
                    }
                    else if (cbLevel == level || cbProperty.Equals("FILTER")) /* we select all the filters of the level >= current level
                                                                               * and the stats of the current level */
                    {
                        cb.Enabled = true;
                        cb.Checked = true;
                    }
                    else
                    {
                        cb.Enabled = true;
                    }
                }
            }
        }


        /// <summary>
        /// Method called in case of check event of one of the check boxes
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void CheckedChanged(object sender, EventArgs e)
        {
            CheckBox cb = sender as CheckBox;
            string[] tags = cb.Tag.ToString().Split('.');
            string cbProperty = tags[0];
            if (cbProperty.Equals("FILTER"))
            {
                int cbLevel;
                Int32.TryParse(tags[1], out cbLevel);
                if (cb.Checked)
                {
                    SelectCheckBoxes(cbLevel); /* we enable all the check boxes of the selected level */
                }
                else
                {
                    DeselectCheckBoxes(cbLevel); /* we disable the statistics check boxes of the selected level */
                }
            }
        }


        /// <summary>
        /// Enables all the check boxes of the selected level
        /// and the check box corresponding to the filter of selected level + 1
        /// </summary>
        /// <param name="level">Level of the checked check box</param>
        private void SelectCheckBoxes(int level)
        {
            foreach (Control control in AllControls)
            {
                if (control is CheckBox)
                {
                    CheckBox cb = control as CheckBox;
                    string[] tags = cb.Tag.ToString().Split('.');
                    string cbProperty = tags[0];
                    int cbLevel;
                    Int32.TryParse(tags[1], out cbLevel);
                    if ((cbLevel == level && cbProperty.Equals("STAT")) || (cbLevel == level + 1 && cbProperty.Equals("FILTER")))
                    {
                        cb.Enabled = true;
                    }
                }
            }
        }


        /// <summary>
        /// Disables the check boxes corresponding to the statistics of the selected level
        /// </summary>
        /// <param name="level">Level of the unckecked check box</param>
        private void DeselectCheckBoxes(int level)
        {
            foreach (Control control in AllControls)
            {
                if (control is CheckBox)
                {
                    CheckBox cb = control as CheckBox;
                    string[] tags = cb.Tag.ToString().Split('.');
                    string cbProperty = tags[0];
                    int cbLevel;
                    Int32.TryParse(tags[1], out cbLevel);
                    if (cbLevel > level || (cbLevel == level && !cbProperty.Equals("FILTER")))
                    {
                        cb.Checked = false;
                        cb.Enabled = false;
                    }
                }
            }
        }


        /// <summary>
        /// Creates a report config with user's choices
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void Btn_CreateReport_Click(object sender, EventArgs e)
        {
            reportConfig.Name = "Tests coverage report";

            reportConfig.AddFrames = CB_Frames.Checked;
            reportConfig.AddActivatedRulesInFrames = CB_ActivatedRulesInFrames.Checked;
            reportConfig.AddNonCoveredRulesInFrames = CB_NonCoveredRulesInFrames.Checked;

            reportConfig.AddSubSequences = CB_SubSequences.Checked;
            reportConfig.AddActivatedRulesInSubSequences = CB_ActivatedRulesInSubSequences.Checked;
            reportConfig.AddNonCoveredRulesInSubSequences = CB_NonCoveredRulesInSubSequences.Checked;

            reportConfig.AddTestCases = CB_TestCases.Checked;
            reportConfig.AddActivatedRulesInTestCases = CB_ActivatedRulesInTestCases.Checked;
            reportConfig.AddNonCoveredRulesInTestCases = CB_NonCoveredRulesInTestCases.Checked;

            reportConfig.AddSteps = CB_Steps.Checked;
            reportConfig.AddActivatedRulesInSteps = CB_ActivatedRulesInSteps.Checked;
            reportConfig.AddNonCoveredRulesInSteps = CB_NonCoveredRulesInSteps.Checked;

            reportConfig.AddLog = CB_Log.Checked;

            Hide();

            ProgressDialog dialog = new ProgressDialog("Generating report", GenerateFileHandler);
            dialog.ShowDialog(Owner);
        }


        /// <summary>
        /// Generates the file in the progress dialog worker thread
        /// </summary>
        /// <param name="arg"></param>
        private void GenerateFileHandler(object arg)
        {
            ReportBuilder builder = new ReportBuilder(EFSSystem);
            if (!builder.BuildTestsReport(reportConfig))
            {
                Log.ErrorFormat("Report creation failed");
            }
            else
            {
                ReportUtils.Utils.displayReport(reportConfig);
            }
        }


        /// <summary>
        /// Permits to select the name and the path of the report
        /// </summary>
        /// <param name="sender"></param>
        /// <param name="e"></param>
        private void Btn_SelectFile_Click(object sender, EventArgs e)
        {
            SaveFileDialog saveFileDialog = new SaveFileDialog();
            saveFileDialog.InitialDirectory = Environment.GetFolderPath(Environment.SpecialFolder.Personal);
            if (saveFileDialog.ShowDialog(this) == DialogResult.OK)
            {
                reportConfig.FileName = saveFileDialog.FileName;
                TxtB_Path.Text = reportConfig.FileName;
            }
        }
    }
}
