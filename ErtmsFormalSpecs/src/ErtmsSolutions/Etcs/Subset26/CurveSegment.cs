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
    /**@brief The base class for other curve segments. 
    The domain interval is X. The value (Y) must be defined 
    by derived classes in Get method */
    public abstract class CurveSegment<XUnit, YUnit>
        where XUnit : ISiUnit<XUnit>
        where YUnit : ISiUnit<YUnit>
    {
        private Interval<XUnit> myX;

        /**@brief The domain of definition of this curve element. */
        public Interval<XUnit> X { get { return myX; } }


        public CurveSegment(XUnit x0, XUnit x1)
        {
            myX = new Interval<XUnit>(x0, x1);
        }

        /**@brief Must be redefined by derived class in order to expose the 'Y' values */
        public abstract YUnit Get(XUnit x);

        public override string ToString()
        {
            return String.Format(" [{0,7:F2}..{1,7:F2}]({2})",
                                  X.X0.ToUnits(),
                                  X.X1.ToUnits(),
                                  X.X0.UnitString());
        }
    }
}
