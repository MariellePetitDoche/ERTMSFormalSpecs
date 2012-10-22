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
    /************************************************************/
    /************************************************************/
    public class SpeedDistanceCurveMinimizer
    {

        static int CompareDistances(SiDistance a, SiDistance b)
        {
            if (a.ToUnits() < b.ToUnits())
            {
                return -1;
            }
            else if (a.ToUnits() > b.ToUnits())
            {
                return 1;
            }
            return 0;
        }


        /// <summary>
        /// Provides the graph of the minimal value between this graph and another graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>

        public static FlatSpeedDistanceCurve Min(FlatSpeedDistanceCurve left, FlatSpeedDistanceCurve right)
        {
            /* Here goes the result */
            FlatSpeedDistanceCurve result = new FlatSpeedDistanceCurve();

            /* Early exit to avoid accessing unexisting elements */
            if (left.SegmentCount == 0)
            {
                for (int i = 0; i < right.SegmentCount; i++)
                    result.Add(right[i].X.X0, right[i].X.X1, right[i].Y);
                return result;
            }
            if (right.SegmentCount == 0)
            {
                for (int i = 0; i < left.SegmentCount; i++)
                    result.Add(left[i].X.X0, left[i].X.X1, left[i].Y);
                return result;
            }


            /* We collect all x positions */
            List<SiDistance> x_positions = new List<SiDistance>();

            /* Collect all X positions from left */
            x_positions.Add(left[0].X.X0);
            for (int i = 0; i < left.SegmentCount; i++)
                x_positions.Add(left[i].X.X1);

            /* Collect all X positions from right */
            x_positions.Add(right[0].X.X0);
            for (int i = 0; i < right.SegmentCount; i++)
                x_positions.Add(right[i].X.X1);

            x_positions.Sort(CompareDistances);

            for (int i = 1; i < x_positions.Count; i++)
            {
                SiDistance x0 = x_positions[i - 1];
                SiDistance x1 = x_positions[i];

                /* Caution GetSegmentAt might return null */
                ConstantCurveSegment<SiDistance, SiSpeed> left_segment = left.GetSegmentAt(x0);
                ConstantCurveSegment<SiDistance, SiSpeed> right_segment = right.GetSegmentAt(x0);

                if (left_segment == null)
                {
                    result.Add(x0, x1, right_segment.Y);
                }
                else if (right_segment == null)
                {
                    result.Add(x0, x1, left_segment.Y);
                }
                else
                {
                    result.Add(x0, x1, SiSpeed.Min(left_segment.Y, right_segment.Y));
                }
            }

            return result;
        }
    }
}
