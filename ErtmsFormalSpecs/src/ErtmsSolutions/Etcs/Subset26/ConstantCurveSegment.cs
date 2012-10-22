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
    /**@brief A piece of a one dimensional curve where the value Y is constant on the domain.*/
    public class ConstantCurveSegment<XUnit, YUnit> : CurveSegment<XUnit, YUnit>
        where XUnit : ISiUnit<XUnit>
        where YUnit : ISiUnit<YUnit>
    {
        private YUnit myY;

        public ConstantCurveSegment(XUnit x0, XUnit x1, YUnit y)
            : base(x0, x1)
        {
            myY = y;
        }

        public override YUnit Get(XUnit x)
        {
            return myY;
        }

        public YUnit Y { get { return myY; } }


        public override string ToString()
        {
            return base.ToString() +
                    String.Format(" Y:{0,7:F2}({1})", myY.ToUnits(), myY.UnitString());
        }

    }
}
