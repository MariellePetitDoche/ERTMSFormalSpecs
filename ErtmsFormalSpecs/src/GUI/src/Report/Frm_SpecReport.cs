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
using DataDictionary;
using Report;
using Report.Specs;


namespace GUI.Report
{
    public partial class SpecReport : Form
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);
        private SpecCoverageReportConfig reportConfig;

        /// <summary>
        /// The system for which this report is built
        /// </summary>
        public EFSSystem EFSSystem { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="dictionary"></param>
        public SpecReport(Dictionary dictionary)
        {
            InitializeComponent();
            EFSSystem = dictionary.EFSSystem;
            reportConfig = new SpecCoverageReportConfig(dictionary);
            TxtB_Path.Text = reportConfig.FileName;
        }


        /// <summary>
        /// Gives the list of all the controls of the form
        /// (situated on the main form or on its group box)
        /// </summary>
        public ArrayList AllControls
        {
            get
            {
                System.Collections.ArrayList retVal = new System.Collections.ArrayList();
                retVal.AddRange(this.Controls);
                retVal.AddRange(this.GrB_Options.Controls);
                return retVal;
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
                    if (cbLevel == level && !cbProperty.Equals("FILTER"))
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
            reportConfig.Name = "Specification coverage report";

            reportConfig.AddSpecification = CB_AddSpecification.Checked;
            reportConfig.ShowFullSpecification = CB_ShowFullSpecification.Checked;

            reportConfig.AddCoveredParagraphs = CB_AddCoveredParagraphs.Checked;
            reportConfig.ShowAssociatedReqRelated = CB_ShowAssociatedReqRelated.Checked;

            reportConfig.AddNonCoveredParagraphs = CB_AddNonCoveredParagraphs.Checked;

            reportConfig.AddReqRelated = CB_AddReqRelated.Checked;
            reportConfig.ShowAssociatedParagraphs = CB_ShowAssociatedParagraphs.Checked;

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
            if (!builder.BuildSpecsReport(reportConfig))
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
