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
using ErtmsSolutions.SiUnits;

namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    /******************************************************************************/
    /**@brief A curve made of line segments. Each segment is a represents a 
              constant speed over a position interval. */
    /******************************************************************************/
    public class FlatSpeedDistanceCurve : Curve<ConstantCurveSegment<SiDistance, SiSpeed>, SiDistance, SiSpeed>
    {
        private bool debug = false;

        /******************************************************************************/
        /**@brief Add a new segment to the curve.                                     */
        /******************************************************************************/
        public void Add(SiDistance x0,
                         SiDistance x1,
                         SiSpeed v)
        {
            this.AddSegment(new ConstantCurveSegment<SiDistance, SiSpeed>(x0, x1, v));
        }

        /* Find the intersection beween this FlatCurve and a Quadratic one */
        /******************************************************************************/
        /**@brief Returns the segment wich intersects the arc a_quadratic_segment.    */
        /******************************************************************************/
        public ConstantCurveSegment<SiDistance, SiSpeed> Intersect(SiDistance d_max, QuadraticCurveSegment a_quadratic_segment)
        {
            ConstantCurveSegment<SiDistance, SiSpeed> matching_flat_segment = null;

            /* Find the right most one. */
            for (int i = this.SegmentCount - 1; i >= 0; i--)
            {
                matching_flat_segment = this[i];

                SiDistance d_intersection = a_quadratic_segment.IntersectAt(matching_flat_segment.Y);

                if (debug)
                {
                    Log.DebugFormat(" FlatSD [{0:D2}/{1:D2}] Q:{2} intersects F:{3} at {4,7:F2} d_max:{5,7:F2}",
                                     i,
                                     this.SegmentCount,
                                     a_quadratic_segment.ToString(),
                                     matching_flat_segment.ToString(),
                                     d_intersection.ToUnits(),
                                     d_max.ToUnits());
                }

                if (matching_flat_segment.X.X0 <= d_max)
                {
                    return matching_flat_segment;
                }
            }

            return this[0];
        }

    }

    /******************************************************************************/
    /**@brief A curve made of arcs. Each arc is a function that gives a speed 
              based on a distance. */
    /******************************************************************************/
    public class QuadraticSpeedDistanceCurve : Curve<QuadraticCurveSegment, SiDistance, SiSpeed>
    {
        /******************************************************************************/
        /**@brief Add a new arc to the curve.                                         */
        /******************************************************************************/
        public void Add(SiDistance x0,
                         SiDistance x1,
                         SiAcceleration a,
                         SiSpeed v0,
                         SiDistance d0)
        {
            this.AddSegment(new QuadraticCurveSegment(x0, x1, a, v0, d0));
        }
    }

}


