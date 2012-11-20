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
using ErtmsSolutions.SiUnits;

namespace ErtmsSolutions.Etcs.Subset26.BrakingCurves
{
    public static class EtcsBrakingCurveBuilder
    {
        /************************************************************/
        public static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);
        private static bool debug = false;


        public static QuadraticSpeedDistanceCurve Build_A_Safe_Backward(AccelerationSpeedDistanceSurface A_V_D, FlatSpeedDistanceCurve MRSP)
        {
            Log.InfoFormat("#######################################################");
            Log.InfoFormat("## Build_A_Safe_Backward_Surface#######################");
            Log.InfoFormat("#######################################################");

            int debugging_counter = 0;
            QuadraticSpeedDistanceCurve result = new QuadraticSpeedDistanceCurve();

            /*********************************************************** 
              The ending point is the first point in the MRSP
             ***********************************************************/
            SiDistance end_position = MRSP[0].X.X0;


            /*********************************************************** 
              Go forward in the MRSP until we find the point with
              minimal speed. This shall be our starting point
              **********************************************************/
            SiDistance current_position = SiDistance.Zero;
            SiSpeed current_speed = SiSpeed.MaxValue;

            if (debug)
                Log.DebugFormat("  Search the position of the minimal speed in the MRSP");
            for (int i = 0; i < MRSP.SegmentCount; i++)
            {
                ConstantCurveSegment<SiDistance, SiSpeed> segment = MRSP[i];
                if (segment.Y < current_speed)
                {
                    current_speed = segment.Y;
                    current_position = segment.X.X1;

                    if (debug)
                        Log.DebugFormat("    new start position V={0,7:F2} at={1,7:F2} ", current_speed.ToUnits(), current_position.ToUnits());
                }
            }

            if (debug)
                Log.DebugFormat("    end position is at={0,7:F2} ", end_position.ToUnits());

            /*************************************************************************/
            /* Starting from the right side of curves, go back to the left side.     */
            /* Build small curves arcs where the acceleration is constant on each one*/
            /*************************************************************************/
            while (current_position > end_position)
            {
                if (debug)
                {
                    Log.DebugFormat("#######################################################");
                    Log.DebugFormat("### Loop {0}  #########################################", debugging_counter);
                    Log.DebugFormat("#######################################################");
                }

                /************************************************************ 
                  Based on current speed and position, search on wich tile
                  of A_V_D tile we are
                  ***********************************************************/
                SurfaceTile current_tile = A_V_D.GetTileAt(current_speed + new SiSpeed(0.01), current_position - new SiDistance(0.1));
                SiAcceleration current_acceleration = current_tile.V.Y;

                /***************************************************************************/
                /* If at previous loop wi did 'hit' the vertical part of the MRSP,
                   we might have a speed above the current MRSP segment.*/
                /***************************************************************************/
                if (current_speed > MRSP.GetValueAt(current_position - new SiDistance(0.1)))
                {
                    current_speed = MRSP.GetValueAt(current_position - new SiDistance(0.1));
                }


                /******************************************************************* 
                  We build a quadratic arc with current train position, speed
                  and acceleration. The arc domain [0..current_position] is not valid yet.
                  We must find out the domain left limit.
                 *****************************************************************/
                QuadraticCurveSegment current_curve = new QuadraticCurveSegment(SiDistance.Zero,
                                                                                 current_position,
                                                                                 current_acceleration,
                                                                                 current_speed,
                                                                                 current_position);

                if (debug)
                {
                    Log.DebugFormat("  current_acceleration = {0,7:F2} from a_tile {1}", current_acceleration.ToUnits(), current_tile.ToString());
                    Log.DebugFormat("  current_speed        = {0,7:F2} ", current_speed.ToUnits());
                    Log.DebugFormat("  current_position     = {0,7:F2} ", current_position.ToUnits());

                    Log.DebugFormat("  --> current_curve    = {0} ", current_curve.ToString());
                }


                /********************************************************************/
                /* The current_curve may 'hit' one of these 4 items:
                     1) The upper border of the tile (because of a new acceleration) 
                     2) The left border of the tile (because of a gradient?)
                     3) A vertical segment of the MRSP                                                           
                     4) An horizontal segment of the MRSP
                   Text all of them and update the next_position accordingly.
                *************************************************************************/
                SiDistance next_position = SiDistance.Zero;

                /* 1) The distance at wich our temporary arc intersects the top (V2) segment of the AVD tile */
                {
                    SiDistance d = current_curve.IntersectAt(current_tile.V.X.X1);
                    if (debug)
                        Log.DebugFormat("  intersection with tile (V_TOP) at {0,7:F2} ", d.ToUnits());
                    if (d >= next_position)
                    {
                        if (debug)
                            Log.DebugFormat("  --> case_1  next_position {0,7:F2} -> {1,7:F2}", next_position.ToUnits(), d.ToUnits());
                        next_position = d;
                    }
                }

                /* 2) The distance at wich our temporary arc intersects the left (D0) segment of the AVD tile */
                {
                    SiDistance d = current_tile.D.X.X0;
                    if (debug)
                        Log.DebugFormat("  intersection with tile (D0)    at {0,7:F2} ", d.ToUnits());
                    if (d >= next_position)
                    {
                        if (debug)
                            Log.DebugFormat("  --> case_2  next_position {0,7:F2} -> {1,7:F2}", next_position.ToUnits(), d.ToUnits());
                        next_position = d;
                    }
                }

                /*Since the MRSP is continous, the following cannot fail. */
                ConstantCurveSegment<SiDistance, SiSpeed> speed_limit_here = MRSP.Intersect(current_position - new SiDistance(0.1), current_curve);
                if (debug)
                    Log.DebugFormat("  MRSP segment          {0} ", speed_limit_here.ToString());

                /* 3) Do we hit the vertical segment of the MRSP ? */
                {
                    if (speed_limit_here.X.X0 >= next_position)
                    {
                        if (debug)
                            Log.DebugFormat("  --> case_3  next_position {0,7:F2} -> {1,7:F2}", next_position.ToUnits(), speed_limit_here.X.X0.ToUnits());
                        next_position = speed_limit_here.X.X0;
                    }
                }


                /* 4) Do we hit the horizontal segment of the MRSP */
                {
                    if (current_speed + new SiSpeed(0.01) < speed_limit_here.Y)
                    {
                        SiDistance d = current_curve.IntersectAt(speed_limit_here.Y);
                        if (d >= next_position)
                        {
                            if (debug)
                                Log.DebugFormat("  --> case_4a next_d        {0,7:F2} -> {1,7:F2}", next_position.ToUnits(), d.ToUnits());
                            next_position = d;
                        }
                    }
                    else
                    {
                        if (debug)
                            Log.DebugFormat("  --> case_4b next_acc_0    {0,7:F2} -> {1,7:F2}", next_position.ToUnits(), speed_limit_here.X.X0.ToUnits());
                        current_acceleration = SiAcceleration.Zero;
                        next_position = speed_limit_here.X.X0;
                    }
                }


                /* Finally we can add the segment because next_position has been computed. */
                result.Add(next_position, current_position, current_acceleration, current_speed, current_position);

                result.Dump("result so far ");

                /* Next loop starts from our new position.
                   We do not need to update current_acceleration because
                   it is done at the beginning of the loop*/
                current_position = next_position;
                current_speed = result.GetValueAt(current_position);


                /*************************************************************/
                /* If this exception is thrown, you'd better call Juan       */
                /*************************************************************/
                if (debugging_counter++ > 200)
                {
                    throw new Exception("Algorithm is broken");
                }
            }

            return result;
        }
    }
}
