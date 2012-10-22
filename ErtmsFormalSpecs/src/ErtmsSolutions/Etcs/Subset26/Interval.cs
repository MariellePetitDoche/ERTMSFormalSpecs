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
    /**@brief An interval is made of 2 physical units X0 and X1. It is assumed that X0 != X1 **/
    public class Interval<XUnit> where XUnit : ISiUnit<XUnit>
    {
        private XUnit myX0;
        private XUnit myX1;

        public XUnit X0 { get { return myX0; } set { myX0 = value; } }
        public XUnit X1 { get { return myX1; } set { myX1 = value; } }


        public Interval(XUnit x0, XUnit x1)
        {
            X0 = x0;
            X1 = x1;
        }

        /**@brief Returns wether [X0..X1[ contains the someX parameter. */
        public bool Contains(XUnit someX)
        {
            return ((X0.ToUnits() <= someX.ToUnits()) &&
                     (someX.ToUnits() < X1.ToUnits()));
        }

        /**@brief Returns the intersection between this interval and other niterval. 
          Null is returned if the intersection is empty. */
        public Interval<XUnit> Intersect(Interval<XUnit> other)
        {
            Interval<XUnit> result = null;

            if (this.Contains(other.X0) || this.Contains(other.X1))
            {
                result = new Interval<XUnit>(this.X0.Max(other.X0), this.X1.Min(other.X1));
            }
            else if (other.Contains(this.X0) || other.Contains(this.X1))
            {
                result = new Interval<XUnit>(this.X0.Max(other.X0), this.X1.Min(other.X1));
            }

            return result;
        }
    }
}
