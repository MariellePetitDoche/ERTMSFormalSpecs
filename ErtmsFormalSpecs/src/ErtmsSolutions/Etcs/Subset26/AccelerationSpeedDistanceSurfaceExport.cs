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
using System.Collections.Generic;
using ErtmsSolutions.SiUnits;

namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    /**@brief GnuPlot requires that surface data is sorted. 
      This utility class presents the data in a way that satisfies GnuPlot */
    public static class AccelerationSpeedDistanceSurfaceExport
    {
        /******************************************************************************************************/
        public class SurfaceTripple
        {
            public SiDistance D;
            public SiSpeed V;
            public SiAcceleration A;

            public SurfaceTripple(SiDistance oneD, SiSpeed oneV, SiAcceleration oneA)
            {
                A = oneA;
                D = oneD;
                V = oneV;
            }

            public static int CompareTripple(SurfaceTripple a, SurfaceTripple b)
            {
                if (a.D < b.D)
                {
                    return -1;
                }
                else if (a.D > b.D)
                {
                    return 1;
                }
                else
                {
                    if (a.V < b.V)
                    {
                        return -1;
                    }
                    else if (a.V > b.V)
                    {
                        return 1;
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        }

        /******************************************************************************************************/
        public static List<SurfaceTripple> Collect_And_Sort_Surface(AccelerationSpeedDistanceSurface A_V_D)
        {
            List<SurfaceTripple> Tripples = new List<SurfaceTripple>();

            /* We stretch the tiles a bit in order to avoid vertical parts in the drawn surface */
            SiDistance dx = new SiDistance(1.0);
            SiSpeed dv = new SiSpeed(1.0, SiSpeed_SubUnits.KiloMeter_per_Hour);

            for (int i = 0; i < A_V_D.Tiles.Count; i++)
            {
                Tripples.Add(new SurfaceTripple(A_V_D.Tiles[i].D.X.X0, A_V_D.Tiles[i].V.X.X0, A_V_D.Tiles[i].D.Y));
                Tripples.Add(new SurfaceTripple(A_V_D.Tiles[i].D.X.X0, A_V_D.Tiles[i].V.X.X1 - dv, A_V_D.Tiles[i].D.Y));
                Tripples.Add(new SurfaceTripple(A_V_D.Tiles[i].D.X.X1 - dx, A_V_D.Tiles[i].V.X.X0, A_V_D.Tiles[i].D.Y));
                Tripples.Add(new SurfaceTripple(A_V_D.Tiles[i].D.X.X1 - dx, A_V_D.Tiles[i].V.X.X1 - dv, A_V_D.Tiles[i].D.Y));
            }

            Tripples.Sort(SurfaceTripple.CompareTripple);

            return Tripples;
        }

    }
}


