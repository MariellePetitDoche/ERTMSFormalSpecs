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
using ErtmsSolutions.SiUnits;

namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    /**@brief A piece of A(V,d). It has a D0..D0 V0..V1 domain and a constant A value over it. */
    public class SurfaceTile
    {
        private ConstantCurveSegment<SiDistance, SiAcceleration> myD;
        private ConstantCurveSegment<SiSpeed, SiAcceleration> myV;


        /**@brief The SiDistance domain.*/
        public ConstantCurveSegment<SiDistance, SiAcceleration> D { get { return myD; } }

        /**@brief The SiSpeed domain.*/
        public ConstantCurveSegment<SiSpeed, SiAcceleration> V { get { return myV; } }


        public SurfaceTile(SiDistance d0, SiDistance d1, SiSpeed v0, SiSpeed v1, SiAcceleration a)
        {
            myD = new ConstantCurveSegment<SiDistance, SiAcceleration>(d0, d1, a);
            myV = new ConstantCurveSegment<SiSpeed, SiAcceleration>(v0, v1, a);
        }

        public override string ToString()
        {
            return String.Format(" D:[{0,7:F2}..{1,7:F2}]({2})   V:[{3,7:F2}..{4,7:F2}]({5})    A:{6,7:F2}({7})",
                                  D.X.X0.ToUnits(),
                                  D.X.X1.ToUnits(),
                                  D.X.X0.UnitString(),
                                  V.X.X0.ToUnits(),
                                  V.X.X1.ToUnits(),
                                  V.X.X0.UnitString(),
                                  V.Y.ToUnits(),
                                  V.Y.UnitString());
        }
    }

    /**@brief A RxR->R surface that returns and SiAcceleration for every SiSpeed,SiDistance pair. 
      Used to store braking capablity over speed and distance. Namely A(V,d) in Subset26 notation.**/
    public class AccelerationSpeedDistanceSurface
    {
        /************************************************************/
        public static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);
        private List<SurfaceTile> myTiles;


        /**@brief The list of tiles is sorted every time a new one is added*/
        private static int CompareTiles(SurfaceTile a, SurfaceTile b)
        {
            if (a.D.X.X0 < b.D.X.X0)
            {
                return -1;
            }
            else if (a.D.X.X0 > b.D.X.X0)
            {
                return 1;
            }
            else
            {
                if (a.V.X.X0 < b.V.X.X0)
                {
                    return -1;
                }
                else if (a.V.X.X0 > b.V.X.X0)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        }

        /************************************************************/
        public AccelerationSpeedDistanceSurface()
        {
            myTiles = new List<SurfaceTile>();
        }

        /**@brief The surface is stored as a list of 'tiles'. Each one has a D0..D0 V0..V1 domain and a constant A value over it. */
        public List<SurfaceTile> Tiles { get { return myTiles; } }

        /************************************************************/
        public SurfaceTile GetTileAt(SiSpeed V, SiDistance D)
        {
            foreach (SurfaceTile T in Tiles)
            {
                if (T.D.X.Contains(D))
                {
                    if (T.V.X.Contains(V))
                        return T;
                }
            }
            return null;
        }

        /************************************************************/
        public void Dump(string Title)
        {
            Log.DebugFormat("**************{0}**************", Title);
            foreach (SurfaceTile t in myTiles)
                Log.DebugFormat(t.ToString());
        }

    }
}



