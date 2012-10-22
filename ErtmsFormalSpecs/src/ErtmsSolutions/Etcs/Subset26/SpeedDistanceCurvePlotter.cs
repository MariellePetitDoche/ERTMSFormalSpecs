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

namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    /* Uses GnuPlot to build graphs with curves .*/
    public class SpeedDistanceCurvePlotter : GnuPlotter
    {
        private bool min_x_is_set = false;
        private bool max_x_is_set = false;
        private SiDistance min_x = SiDistance.Zero;
        private SiDistance max_x = SiDistance.Zero;

        public SiDistance Min_X { set { min_x = value; min_x_is_set = true; } }
        public SiDistance Max_X { set { max_x = value; max_x_is_set = true; } }

        /* Default creator */
        public SpeedDistanceCurvePlotter()
            : base()
        {
            Items = new List<PlottedItem>();
        }

        /************************************************************************/
        public bool Add_Extended_Legend = false;


        /************************************************************************/
        public bool Add_Acceleration_Overlay = false;


        /************************************************************************/
        public void AddPoint(SinglePoint aPoint, string Name, string color)
        {
            PlottedItem p = new PlottedItem();
            p.theCurve = aPoint;
            p.theName = Name;
            p.theColor = color;
            Items.Add(p);
        }

        /************************************************************************/
        public void AddCurve(QuadraticSpeedDistanceCurve aCurve, string Name, string color)
        {
            PlottedItem p = new PlottedItem();
            p.theCurve = aCurve;
            p.theName = Name;
            p.theColor = color;
            Items.Add(p);
        }

        /************************************************************************/
        public void AddCurve(FlatSpeedDistanceCurve aCurve, string Name, string color)
        {
            PlottedItem p = new PlottedItem();
            p.theCurve = aCurve;
            p.theName = Name;
            p.theColor = color;
            Items.Add(p);
        }

        /************************************************************************/
        public void AddCurve(AccelerationSpeedDistanceSurface aSurface, string Name)
        {
            PlottedItem p = new PlottedItem();
            p.theCurve = aSurface;
            p.theName = Name;
            Items.Add(p);
        }

        public bool ShowColouredSegments = true;

        public bool Show_ASD_AccelerationValues = true;


        /* Once all public properties have been set and curves have been
           added, will build gnuplot input files, call gnuplot.exe and remove temp files if needed.
           */
        /************************************************************************/
        private class PlottedItem
        {
            public object theCurve;
            public string theName;
            public string theColor;
        }

        /************************************************************************/
        private List<PlottedItem> Items;


        /******************************************************************************************************/
        protected override void Build_Gnuplot_Files(string job_filename, string png_filename)
        {
            int label_counter = 0;
            StreamWriter swj = new StreamWriter(job_filename);

            swj.WriteLine("reset                      ");
            swj.WriteLine("set terminal png size {0}, {1}", my_bitmap_width, my_bitmap_height);
            swj.WriteLine("set output '{0}'", png_filename);
            swj.WriteLine("set palette gray           ");
            swj.WriteLine("set style data points      ");

            swj.WriteLine("set xlabel 'm'             ");
            swj.WriteLine("set xrange [{0}:{1}]       ",
                           min_x_is_set ? min_x.ToSubUnits(SiDistance_SubUnits.Meter).ToString() : "*",
                           max_x_is_set ? max_x.ToSubUnits(SiDistance_SubUnits.Meter).ToString() : "*");

            swj.WriteLine("set ylabel 'km/h'          ");
            swj.WriteLine("set autoscale y            ");
            //swj.WriteLine ("yrange [0:*]               ");
            //swj.WriteLine ("set yzeroaxis              ");


            /* When the Y2 axis is involved and mixx is used, GnuPlot doen not generate anything... */
            /* This must be FIXED in order to plot the Gradient profile along with the braking
               curves */
            {
                //swj.WriteLine ("set x2label 'm2'");
                //swj.WriteLine ("set x2range [{0}:{1}]       ",
                //               min_x_is_set ? min_x.ToSubUnits(SiDistance_SubUnits.Meter).ToString() : "*",
                //               max_x_is_set ? max_x.ToSubUnits(SiDistance_SubUnits.Meter).ToString() : "*" );
                //swj.WriteLine ("set x2tics auto          ");

                //swj.WriteLine ("set y2range [0:*]           ");

                // swj.WriteLine ("set autoscale y2          ");
                // swj.WriteLine ("set y2label '%'         ");
                // swj.WriteLine ("set y2tics auto          ");
                // swj.WriteLine ("set y2zeroaxis             ");
                // swj.WriteLine ("set x2zeroaxis             ");
            }

            swj.WriteLine("set key left bottom        ");
            swj.WriteLine("set grid                   ");

            // swj.WriteLine ("set samples 100            ");
            // swj.WriteLine ("set view map               ");

            List<string> GPPlot = new List<string>();

            /* Let's plot all curves */
            for (int item_idx = 0; item_idx < Items.Count; item_idx++)
            {
                SiSpeed v_offset = 0.0 * new SiSpeed((double)(item_idx) * -5.0, SiSpeed_SubUnits.KiloMeter_per_Hour);
                SiDistance d_offset = 0.0 * new SiDistance((double)(item_idx) * -10.0);

                PlottedItem pi = Items[item_idx];

                /************************ Quadratic  ******************************/
                if (pi.theCurve is QuadraticSpeedDistanceCurve)
                {
                    QuadraticSpeedDistanceCurve Q_Curve = pi.theCurve as QuadraticSpeedDistanceCurve;

                    if (ShowColouredSegments)
                    {
                        for (int segment_idx = 0; segment_idx < Q_Curve.SegmentCount; segment_idx++)
                        {
                            QuadraticCurveSegment aSegment = Q_Curve[segment_idx];

                            string title = "notitle";
                            string filename_dat = BuildTempFile(true, String.Format("{0}_{1:D2}_{2:D2}.dat", my_base_name, item_idx, segment_idx));
                            StreamWriter swd = new StreamWriter(filename_dat);
                            Emit_Quadratic_Segment(swd, aSegment, v_offset, d_offset);
                            swd.Close();

                            if (Add_Extended_Legend)
                            {
                                string the_text = String.Format("{0}_{1}", pi.theName, segment_idx);
                                if (aSegment.A < new SiAcceleration(0.0))
                                {
                                    the_text += String.Format(" A{0,6:F1}{1}", aSegment.A.ToUnits(), aSegment.A.UnitString());
                                    the_text += String.Format(" V{0,6:F1}..{1,6:F1} {2}",
                                                            aSegment.Get(aSegment.X.X0).ToUnits(),
                                                            aSegment.Get(aSegment.X.X1).ToUnits(),
                                                            aSegment.Get(aSegment.X.X0).UnitString());
                                }
                                else
                                    the_text += String.Format(" V{0,6:F1}{1}", aSegment.V0.ToUnits(), aSegment.V0.UnitString());
                                SiDistance segment_length = aSegment.X.X1 - aSegment.X.X0;
                                the_text += String.Format(" ({0,4:F0}{1})", segment_length.ToUnits(), segment_length.UnitString());

                                title = String.Format("title \"{0}\" ", the_text);
                            }
                            else
                            {
                                if (segment_idx == 0)
                                {
                                    title = String.Format("title \"{0}\" ", pi.theName);
                                }
                            }
                            GPPlot.Add(String.Format("'{0}' using 1:2 axes x1y1 {1} with lines", filename_dat, title));
                        }
                    }
                    else
                    {
                        string filename_dat = BuildTempFile(true, String.Format("{0}_{1:D2}.dat", my_base_name, item_idx));
                        string title = String.Format("title \"{0}\" ", pi.theName);
                        StreamWriter swd = new StreamWriter(filename_dat);
                        for (int segment_idx = 0; segment_idx < Q_Curve.SegmentCount; segment_idx++)
                        {
                            QuadraticCurveSegment aSegment = Q_Curve[segment_idx];
                            Emit_Quadratic_Segment(swd, aSegment, v_offset, d_offset);
                        }
                        swd.Close();

                        GPPlot.Add(String.Format("'{0}' using 1:2 axes x1y1 {1} with lines linecolor rgb \"{2}\"", filename_dat, title, pi.theColor));
                    }

                    if (Add_Acceleration_Overlay)
                    {
                        string filename_dat = BuildTempFile(true, String.Format("{0}_{1:D2}_acc.dat", my_base_name, item_idx));
                        string title = String.Format("title \"{0}_A(V,d)\" ", pi.theName);
                        StreamWriter swd = new StreamWriter(filename_dat);
                        for (int segment_idx = 0; segment_idx < Q_Curve.SegmentCount; segment_idx++)
                        {
                            QuadraticCurveSegment aSegment = Q_Curve[segment_idx];

                            Emit_d_a(swd, aSegment.X.X0, aSegment.A);
                            Emit_d_a(swd, aSegment.X.X1 - new SiDistance(0.1), aSegment.A);
                        }
                        swd.Close();

                        GPPlot.Add(String.Format("'{0}' using 1:2 axes x1y2 {1} with lines", filename_dat, title));
                    }
                }

                /************************ Flat curve ******************************/
                else if (pi.theCurve is FlatSpeedDistanceCurve)
                {
                    FlatSpeedDistanceCurve F_Curve = pi.theCurve as FlatSpeedDistanceCurve;

                    string filename_dat = BuildTempFile(true, String.Format("{0}_{1:D2}_speed_distance.dat", my_base_name, item_idx));
                    StreamWriter swd = new StreamWriter(filename_dat);
                    for (int segment_idx = 0; segment_idx < F_Curve.SegmentCount; segment_idx++)
                    {
                        Emit_Constant_Segment(swd, F_Curve[segment_idx], v_offset, d_offset);
                    }
                    swd.Close();

                    GPPlot.Add(String.Format("'{0}' using 1:2 axes x1y1 title \"{1}\" with lines linewidth 3 linecolor rgb \"{2}\"", filename_dat, pi.theName, pi.theColor));

                }
                /************************ Flat curve ******************************/
                else if (pi.theCurve is AccelerationSpeedDistanceSurface)
                {
                    AccelerationSpeedDistanceSurface AVD_Surface = pi.theCurve as AccelerationSpeedDistanceSurface;

                    string filename_dat = BuildTempFile(true, String.Format("{0}_{1:D2}_asd_surface.dat", my_base_name, item_idx));
                    {
                        StreamWriter swd = new StreamWriter(filename_dat);
                        for (int i = 0; i < AVD_Surface.Tiles.Count; i++)
                        {
                            SurfaceTile aTile = AVD_Surface.Tiles[i];

                            Emit_Segment(swd, aTile.D.X.X0, aTile.D.X.X1, aTile.V.X.X0, v_offset, d_offset);
                            Emit_Segment(swd, aTile.D.X.X0, aTile.D.X.X1, aTile.V.X.X1, v_offset, d_offset);
                            Emit_Segment(swd, aTile.V.X.X0, aTile.V.X.X1, aTile.D.X.X0, v_offset, d_offset);
                            Emit_Segment(swd, aTile.V.X.X0, aTile.V.X.X1, aTile.D.X.X1, v_offset, d_offset);

                            if (Show_ASD_AccelerationValues)
                            {
                                SiDistance cx = (aTile.D.X.X0 + aTile.D.X.X1) * 0.5;
                                SiSpeed cy = (aTile.V.X.X0 + aTile.V.X.X1) * 0.5;

                                label_counter++;

                                swj.WriteLine("set label {0} '{1} m/s²' at {2}, {3} center front",
                                               label_counter,
                                               aTile.V.Y.ToUnits().ToString("0.00", System.Globalization.CultureInfo.InvariantCulture),
                                               cx.ToUnits().ToString(System.Globalization.CultureInfo.InvariantCulture),
                                               cy.ToSubUnits(SiSpeed_SubUnits.KiloMeter_per_Hour).ToString(System.Globalization.CultureInfo.InvariantCulture)
                                               );

                            }

                        }
                        swd.Close();
                        GPPlot.Add(String.Format("'{0}' using 1:2 axes x1y1 title \"{1}\" with points pointtype 5 pointsize 0.5 linecolor rgb \"gray\"", filename_dat, pi.theName));

                    }
                }
                /************************ A single Point ****************************/
                else if (pi.theCurve is SinglePoint)
                {
                    string filename_dat = BuildTempFile(true, String.Format("{0}_{1:D2}.dat", my_base_name, item_idx));
                    StreamWriter swd = new StreamWriter(filename_dat);

                    SinglePoint aPoint = pi.theCurve as SinglePoint;
                    Emit_d_V(swd, aPoint.X, aPoint.Y);
                    swd.Close();

                    GPPlot.Add(String.Format("'{0}' axes x1y1 title \"{1}\" with points pointsize 2 pointtype 7 linecolor rgb \"{2}\" ",
                                               filename_dat,
                                               pi.theName,
                                               pi.theColor));

                }
                /************************ WTF is that ? ***************************/
                else
                {
                    throw new ArgumentException("Unsuported curve type" + pi.theCurve);
                }


            }

            swj.Write("plot ");
            for (int i = 0; i < GPPlot.Count - 1; i++)
                swj.WriteLine(" {0},\\", GPPlot[i]);
            swj.WriteLine("    {0}", GPPlot[GPPlot.Count - 1]);

            swj.Close();
        }


    }
}

