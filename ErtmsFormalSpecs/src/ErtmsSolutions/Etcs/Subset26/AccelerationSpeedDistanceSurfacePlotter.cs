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


namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    /**@brief GnuPlots a A(V,d) surface as a SnuPlot surface (splot).*/
    public class AccelerationSpeedDistanceCurvePlotter : GnuPlotter
    {

        /* Default creator */
        public AccelerationSpeedDistanceCurvePlotter()
            : base()
        {
        }

        /**@brief The A(V,d) surface we shall draw */
        public AccelerationSpeedDistanceSurface A_V_D;

        /******************************************************************************************************/
        protected override void Build_Gnuplot_Files(string job_filename, string png_filename)
        {
            StreamWriter swj = new StreamWriter(job_filename);

            List<AccelerationSpeedDistanceSurfaceExport.SurfaceTripple> Tripples = AccelerationSpeedDistanceSurfaceExport.Collect_And_Sort_Surface(A_V_D);

            string filename_dat = BuildTempFile(true, String.Format("{0}.dat", my_base_name));
            {
                StreamWriter swd = new StreamWriter(filename_dat);
                for (int i = 0; i < Tripples.Count; i++)
                {
                    if ((i > 0) && (Tripples[i - 1].D != Tripples[i].D))
                    {
                        swd.WriteLine("");
                    }
                    Emit_d_v_a(swd, Tripples[i].D, -1.0 * Tripples[i].V, -1.0 * Tripples[i].A);
                }
                swd.Close();
            }


            swj.WriteLine("reset                      ");
            swj.WriteLine("set terminal png size {0}, {1}", my_bitmap_width, my_bitmap_height);
            swj.WriteLine("set output '{0}'", png_filename);
            swj.WriteLine("set xlabel 'm'         ");
            swj.WriteLine("set ylabel 'km/h'      ");
            swj.WriteLine("set zlabel 'm/s²'      ");
            swj.WriteLine("set hidden3d");
            swj.WriteLine("set samples 100");
            swj.WriteLine("set isosamples 100");
            swj.WriteLine("set pm3d at b");
            swj.WriteLine("splot '{0}' using 1:2:3 with lines smooth bezier", filename_dat);


            swj.Close();
        }
    }
}

