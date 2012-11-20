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
using System.IO;
using ErtmsSolutions.SiUnits;
using ErtmsSolutions.Utils.RunProcessExec;


namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    public class SinglePoint
    {
        public SiDistance X;
        public SiSpeed Y;

        public SinglePoint(SiDistance anX, SiSpeed anY)
        {
            X = anX;
            Y = anY;
        }
    }


    /* Uses GnuPlot to build graphs with curves .*/
    public abstract class GnuPlotter
    {
        /**@brief How much time (in seconds) we allocate to GnuPlot process. Default 10 seconds. */
        public int GnuPlotTimeOut { get { return my_gnuplot_time_out; } set { my_gnuplot_time_out = value; } }

        /**@brief When Plot() in invoked it shall launch gnuplot.exe from here */
        public string GnuPlot_Home_Path { set { my_gnuplot_home_path = value; } }

        /**@brief Temporary files and resulting bitmaps are produced here */
        public string Output_Path { set { my_output_path = value; } }

        /**@brief The base of all output file names */
        public string Base_Name { set { my_base_name = value; } }

        /**@brief The generated bitmap width (default 1600)*/
        public int ImageWidth { set { my_bitmap_width = value; } }

        /**@brief The generated bitmap height (default 800)*/
        public int ImageHeight { set { my_bitmap_height = value; } }

        /**@brief Upon GnuPlot success, temporary files are erased if set to true (default). Upon failure, files are not erased. */
        public bool EraseTemporaryFiles { set { my_erase_temporary_files = value; } }

        /**@brief Returns the name of the image file that was produced by GnuPlot. */
        public string ImageFileName { get { return my_image_file_name; } }


        /**@brief Default creator */
        public GnuPlotter()
        {
            Base_Name = "undefined";
            GnuPlot_Home_Path = "";
            Output_Path = ".";
            ImageWidth = 1600;
            ImageHeight = 800;
            EraseTemporaryFiles = true;
            GnuPlotTimeOut = 10;

            my_list_of_temporary_files = new List<string>();

            /* This shall be defined upon GnuPlot success */
            my_image_file_name = null;
        }


        /************************************************************************/
        protected static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);
        protected bool my_erase_temporary_files;
        protected string my_base_name;
        protected string my_output_path;
        protected string my_gnuplot_home_path;
        protected int my_bitmap_width;
        protected int my_bitmap_height;
        protected string my_image_file_name;
        protected int my_gnuplot_time_out;
        protected List<string> my_list_of_temporary_files;



        /******************************************************************************************************/
        protected void Emit_d_v_a(StreamWriter swd, SiDistance d, SiSpeed V, SiAcceleration a)
        {
            swd.WriteLine("{0} {1} {2}",
                           d.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture),
                           V.ToSubUnits(SiSpeed_SubUnits.KiloMeter_per_Hour).ToString(System.Globalization.CultureInfo.InvariantCulture),
                           a.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture));
        }

        /******************************************************************************************************/
        protected void Emit_d_a(StreamWriter swd, SiDistance d, SiAcceleration a)
        {
            swd.WriteLine("{0} {1}",
                           d.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture),
                           a.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture));
        }

        /******************************************************************************************************/
        protected void Emit_d_d(StreamWriter swd, SiDistance d1, SiDistance d2)
        {
            swd.WriteLine("{0} {1}",
                           d1.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture),
                           d2.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture));
        }


        /******************************************************************************************************/
        protected void Emit_d_V(StreamWriter swd, SiDistance d, SiSpeed V)
        {
            swd.WriteLine("{0} {1}",
                           d.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture),
                           V.ToSubUnits(SiSpeed_SubUnits.KiloMeter_per_Hour).ToString(System.Globalization.CultureInfo.InvariantCulture));
        }


        /******************************************************************************************************/
        protected void Emit_Constant_Segment(StreamWriter swd, ConstantCurveSegment<SiDistance, SiSpeed> aSegment, SiSpeed v_offset, SiDistance d_offset)
        {

            SiDistance d0 = aSegment.X.X0;
            SiDistance d1 = aSegment.X.X1;

            Emit_d_V(swd, d0 + d_offset, aSegment.Get(d0) + v_offset);

            /*if (d1 - d0 > SiDistance.One)
            {
                SiDistance delta = SiDistance.One;
                SiDistance d = d0 + delta;
                do
                {
                    Emit_d_V(swd, d + d_offset, aSegment.Get(d) + v_offset);

                    d += delta;
                } while (d < d1);
            }*/

            Emit_d_V(swd, d1 + d_offset, aSegment.Get(d1) + v_offset);
        }


        /******************************************************************************************************/
        protected void Emit_Segment(StreamWriter swd, SiDistance d0, SiDistance d1, SiSpeed v, SiSpeed v_offset, SiDistance d_offset)
        {
            Emit_d_V(swd, d0 + d_offset, v + v_offset);

            SiDistance delta = d1 - d0;

            if (delta > SiDistance.One)
            {
                delta = new SiDistance(1.0);
                SiDistance d = d0 + delta;
                do
                {
                    Emit_d_V(swd, d + d_offset, v + v_offset);

                    d += delta;
                } while (d < d1);
            }

            Emit_d_V(swd, d1 + d_offset, v + v_offset);
        }

        /******************************************************************************************************/
        protected void Emit_Segment(StreamWriter swd, SiSpeed v0, SiSpeed v1, SiDistance d, SiSpeed v_offset, SiDistance d_offset)
        {
            Emit_d_V(swd, d + d_offset, v0 + v_offset);

            SiSpeed delta = v1 - v0;

            if (delta > SiSpeed.One)
            {
                delta = new SiSpeed(0.5);
                SiSpeed v = v0 + delta;
                do
                {
                    Emit_d_V(swd, d + d_offset, v + v_offset);

                    v += delta;
                } while (v < v1);
            }

            Emit_d_V(swd, d + d_offset, v1 + v_offset);
        }



        /******************************************************************************************************/
        protected void Emit_Quadratic_Segment(StreamWriter swd, QuadraticCurveSegment aSegment, SiSpeed v_offset, SiDistance d_offset)
        {
            SiDistance d0 = aSegment.X.X0;
            SiDistance d1 = aSegment.X.X1;

            Emit_d_V(swd, d0 + d_offset, aSegment.Get(d0) + v_offset);

            if (d1 - d0 > SiDistance.One)
            {
                SiDistance delta = SiDistance.One;
                SiDistance d = d0 + delta;
                do
                {
                    Emit_d_V(swd, d + d_offset, aSegment.Get(d) + v_offset);

                    d += delta;
                } while (d < d1);
            }

            Emit_d_V(swd, d1 + d_offset, aSegment.Get(d1) + v_offset);
        }

        /******************************************************************************************************/
        protected string BuildTempFile(bool Mark_As_Temporary, string name)
        {
            string some_file_name = Path.Combine(my_output_path, name);

            Log.InfoFormat("creating {0}", some_file_name);

            if (Mark_As_Temporary)
            {
                my_list_of_temporary_files.Add(some_file_name);
            }

            return some_file_name;
        }



        /******************************************************************************************************/
        protected abstract void Build_Gnuplot_Files(string job, string png);


        /******************************************************************************************************/
        public bool Plot()
        {
            string job = BuildTempFile(true, my_base_name + ".job");
            string png = BuildTempFile(false, my_base_name + ".png");

            Build_Gnuplot_Files(job, png);

            bool result = Run_Gnu_Plot(job);

            if (result)
            {
                if (my_erase_temporary_files)
                {
                    foreach (string s in my_list_of_temporary_files)
                    {
                        Log.DebugFormat("  erasing {0}", s);
                        System.IO.File.Delete(s);
                    }
                }

                my_image_file_name = png;
            }


            return result;
        }


        /******************************************************************************************************/
        private bool Run_Gnu_Plot(string job_filename)
        {
            RunProcessExec pe;

            string std_out = BuildTempFile(true, "gnuplot.out");
            string std_err = BuildTempFile(true, "gnuplot.err");

            pe = new RunProcessExec(/* WorkingDirectory,    */ "./",
                /* Path,                */ my_gnuplot_home_path,
                /* Program,             */ "pgnuplot.exe",
                /* Arguments,           */ job_filename,
                /* FName_StandardInput, */ null,
                /* FName_StandardOutput,*/ std_out,
                /* FName_StandardError, */ std_err,
                /* TimeSpan TimeOut)    */ new TimeSpan(0, 0, 0, GnuPlotTimeOut /*second*/));

            RunProcessExec.ProcessExecResult_Struct result = pe.StartAndWait();

            Log.InfoFormat("  gnuplot result is '{0}', exit code={1}", result.ExecResult, result.ExitCode);

            return (result.ExecResult == RunProcessExec.ProcessExecResult_Enum.OK);
        }


    }
}

