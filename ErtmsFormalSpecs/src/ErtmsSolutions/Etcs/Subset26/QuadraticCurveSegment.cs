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
    /************************************************************/
    /************************************************************/
    public class QuadraticCurveSegment : CurveSegment<SiDistance, SiSpeed>
    {
        private SiAcceleration myA;
        private SiSpeed myV0;
        private SiDistance myD0;

        public SiAcceleration A { get { return myA; } }
        public SiSpeed V0 { get { return myV0; } }
        public SiDistance D0 { get { return myD0; } }


        public QuadraticCurveSegment(SiDistance x0,
                                      SiDistance x1,
                                      SiAcceleration a,
                                      SiSpeed v0,
                                      SiDistance d0)
            : base(x0, x1)
        {
            myV0 = v0;
            myA = a;
            myD0 = d0;
        }

        /******************************************************************************/
        /**@brief Returns the speed at some position x                                */
        /******************************************************************************/
        public override SiSpeed Get(SiDistance x)
        {
            if (x > X.X1)
            {
                throw new ArgumentException();
            }
            if (x < X.X0)
            {
                throw new ArgumentException();
            }

            if (Math.Abs(A.ToUnits()) > 0.0)
            {
                SiDistance dx = x - D0;
                SiSpeed v = new SiSpeed(Math.Sqrt((V0.ToUnits() * V0.ToUnits()) + (2.0 * A.ToUnits() * dx.ToUnits())));
                return v;
            }
            else
                return V0;
        }

        /******************************************************************************/
        /**@brief Returns the position (distance) at wich this arc intersects the     
                  horizontal line 'v'                                                 */
        /******************************************************************************/
        public SiDistance IntersectAt(SiSpeed v)
        {
            /* We must solve this equation:                      */
            /*        v = SQRT (  v0*V0 + (2 * A * (d - D0)) )   */
            /*    where V0, A, D0 are known (this)               */
            /*    where v is given                               */
            /*    where d is unknown.                            */
            /*                                                   */
            /*    If you solve this, you'll find:                */
            /*        d = ( (v*v) - (V0*V0) ) / 2*A              */
            if (Math.Abs(A.ToUnits()) > 0.0)
            {
                SiDistance d = this.D0 +
                               new SiDistance(
                                                   ((v.ToUnits() * v.ToUnits()) - (this.V0.ToUnits() * this.V0.ToUnits()))
                                                                               /
                                                                       (2.0 * this.A.ToUnits())
                                              );

                return d;
            }
            throw new ArgumentException();
        }

        /******************************************************************/
        public override string ToString()
        {
            return base.ToString() +
                    String.Format(" A:{0,7:F2}({1})", myA.ToUnits(), myA.UnitString()) +
                    String.Format(" V:{0,7:F2}({1})", myV0.ToUnits(), myV0.UnitString()) +
                    String.Format(" D:{0,7:F2}({1})", myD0.ToUnits(), myD0.UnitString());
        }

    }
}
