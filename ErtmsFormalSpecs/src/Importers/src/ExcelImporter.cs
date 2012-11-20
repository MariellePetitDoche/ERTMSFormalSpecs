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
using System.Text;
using System.Globalization;
using Microsoft.Office.Interop.Excel;
using DataDictionary.Tests;


namespace Importers
{
    public struct ExcelInporterConfig
    {
        public Step   TheStep;
        public string FileName;
        public string TrainType;
        public double SpeedInterval;
        public bool   FillEBD;
        public bool   FillSBD;
        public bool   FillEBI;
        public bool   FillSBI1;
        public bool   FillSBI2;
        public bool   FillFLOI;
        public bool   FillWarning;
        public bool   FillPermitted;
        public bool   FillIndication;
    }

    public class ExcelImporter
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);


        public static ExcelInporterConfig TheConfig;

        /// <summary>
        /// Generates the file in the progress dialog worker thread
        /// </summary>
        /// <param name="arg"></param>
        static public void ImportExcelHandler(object arg)
        {
            Microsoft.Office.Interop.Excel.Application application = new Microsoft.Office.Interop.Excel.Application();
            if (application != null)
            {
                Workbook workbook = application.Workbooks.Open(TheConfig.FileName);
                int sheet_number = -1;
                if (TheConfig.TrainType.Equals("Gamma train"))
                {
                    sheet_number = 11;
                }
                else if (TheConfig.TrainType.Equals("Lambda train"))
                {
                    sheet_number = 13;
                }
                if (workbook.Sheets.Count >= sheet_number && sheet_number != -1)
                {
                    Worksheet worksheet           = workbook.Sheets[sheet_number] as Worksheet;
                    List<double> speedValues      = new List<double>();
                    List<double> ebdValues        = new List<double>();
                    List<double> sbdValues        = new List<double>();
                    List<double> ebiValues        = new List<double>();
                    List<double> sbi1Values       = new List<double>();
                    List<double> sbi2Values       = new List<double>();
                    List<double> floiValues       = new List<double>();
                    List<double> warningValues    = new List<double>();
                    List<double> permittedValues  = new List<double>();
                    List<double> indicationValues = new List<double>();
                    Range testRange = worksheet.UsedRange;
                    double val;
                    object obj;
                    double lastAddedSpeedValue = double.MinValue;
                    for (int i = 2; i <= testRange.Rows.Count; i++)
                    {
                        val = (double)(testRange.Cells[i, 14] as Range).Value2;
                        if (val - lastAddedSpeedValue >= TheConfig.SpeedInterval)
                        {
                            lastAddedSpeedValue = val;
                            speedValues.Add(val);
                            Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 14, val);
                            if (TheConfig.FillEBD)
                            {
                                obj = (testRange.Cells[i, 18] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                ebdValues.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 18, val);
                            }
                            if (TheConfig.FillSBD)
                            {
                                obj = (testRange.Cells[i, 19] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                sbdValues.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 16, val);
                            }
                            if (TheConfig.FillEBI)
                            {
                                obj = (testRange.Cells[i, 20] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                ebiValues.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 17, val);
                            }
                            if (TheConfig.FillSBI1)
                            {
                                obj = (testRange.Cells[i, 21] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                sbi1Values.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 18, val);
                            }
                            if (TheConfig.FillSBI2)
                            {
                                obj = (testRange.Cells[i, 22] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                sbi2Values.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 19, val);
                            }
                            if (TheConfig.FillFLOI)
                            {
                                obj = (testRange.Cells[i, 23] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                floiValues.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 20, val);
                            }
                            if (TheConfig.FillWarning)
                            {
                                obj = (testRange.Cells[i, 24] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                warningValues.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 21, val);
                            }
                            if (TheConfig.FillPermitted)
                            {
                                obj = (testRange.Cells[i, 25] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                permittedValues.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 22, val);
                            }
                            if (TheConfig.FillIndication)
                            {
                                obj = (testRange.Cells[i, 26] as Range).Value2;
                                val = obj == null ? -1 : (double)obj;
                                indicationValues.Add(val);
                                Log.InfoFormat("Line {0}, column {1}, value: {2}", i, 23, val);
                            }
                        }
                    }

                    if (TheConfig.FillEBD)
                    {
                        SubStep ebdSubStep = new SubStep();
                        ebdSubStep.Name = "EBD";
                        TheConfig.TheStep.AddModelElement(ebdSubStep);
                        for (int i = 0; i < ebdValues.Count; i++)
                        {
                            if (ebdValues[i] != -1)
                            {
                                Expectation expectation = new Expectation();
                                expectation.Expression = String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.EBD\n    (\n        Distance => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {0:0.0#} )\n    ),\n    Val2 => {1:0.0#}\n)", Math.Round(ebdValues[i], 2), Math.Round(speedValues[i], 2));
                                ebdSubStep.AddModelElement(expectation);
                            }
                        }
                    }
                    if (TheConfig.FillSBD)
                    {
                        SubStep sbdSubStep = new SubStep();
                        sbdSubStep.Name = "SBD";
                        TheConfig.TheStep.AddModelElement(sbdSubStep);
                        for (int i = 0; i < sbdValues.Count; i++)
                        {
                            if (sbdValues[i] != -1)
                            {
                                Expectation expectation = new Expectation();
                                expectation.Expression = String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.SBD\n    (\n        Distance => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {0:0.0#} )\n    ),\n    Val2 => {1:0.0#}\n)", Math.Round(sbdValues[i], 2), Math.Round(speedValues[i], 2));
                                sbdSubStep.AddModelElement(expectation);
                            }
                        }
                    }
                    if (TheConfig.FillEBI)
                    {
                        SubStep ebiSubStep = new SubStep();
                        ebiSubStep.Name = "EBI";
                        TheConfig.TheStep.AddModelElement(ebiSubStep);
                        for (int i = 0; i < ebiValues.Count; i++)
                        {
                            if (ebiValues[i] != -1)
                            {
                                Expectation expectation = new Expectation();
                                expectation.Expression = String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_EBI\n    (\n        Vest  => {0:0.0#},\n        aTarget => Kernel.MA.EndOfMovementAuthority()\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)", Math.Round(speedValues[i], 2), Math.Round(ebiValues[i], 2));
                                ebiSubStep.AddModelElement(expectation);
                            }
                        }
                    }
                    if (TheConfig.FillSBI1)
                    {
                        SubStep sbi1SubStep = new SubStep();
                        sbi1SubStep.Name = "SBI1";
                        TheConfig.TheStep.AddModelElement(sbi1SubStep);
                        for (int i = 0; i < sbi1Values.Count; i++)
                        {
                            if (sbi1Values[i] != -1)
                            {
                                Expectation expectation = new Expectation();
                                expectation.Expression = String.Format(CultureInfo.InvariantCulture, "ERA_BrakingCurvesVerification.Compare\n(\n    Val1 => Kernel.SpeedAndDistanceMonitoring.TargetSupervision.d_SBI1\n    (\n        Vest  => {0:0.0#}\n    ),\n    Val2 => ERA_BrakingCurvesVerification.ConvertTargetDistance ( {1:0.0#} )\n)", Math.Round(speedValues[i], 2), Math.Round(sbi1Values[i], 2));
                                sbi1SubStep.AddModelElement(expectation);
                            }
                        }
                    }
                }
                else
                {
                    if (sheet_number == -1)
                    {
                        Log.ErrorFormat("Incorrect train type selected!!");
                    }
                    else
                    {
                        Log.ErrorFormat("Incorrect number of sheets in the excel document!!");
                    }
                }
            }
            application.Quit();
        }
    }
}
