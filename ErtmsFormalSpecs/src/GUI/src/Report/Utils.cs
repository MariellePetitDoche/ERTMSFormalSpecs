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
using System.Diagnostics;
using System.Windows.Forms;
using Report;

namespace ReportUtils
{
    public static class Utils
    {
        public static void displayReport(ReportConfig config)
        {
            try
            {
                Process.Start(config.FileName);
            }
            catch (Exception)
            {
                MessageBox.Show("Cannot find pdf viewer. Please install a pdf viewer.", "Cannot find pdf viewer", MessageBoxButtons.OK, MessageBoxIcon.Error);
            }
        }
    }
}
