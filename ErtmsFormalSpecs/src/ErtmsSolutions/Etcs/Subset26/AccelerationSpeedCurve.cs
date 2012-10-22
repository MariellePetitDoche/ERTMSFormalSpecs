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
    /**@brief A 1 dimension curve that returns an SiAcceleration for every SiSpeed. Used to store braking capability over speed **/
    public class FlatAccelerationSpeedCurve : Curve<ConstantCurveSegment<SiSpeed, SiAcceleration>, SiSpeed, SiAcceleration>
    {
        public void Add(SiSpeed v0, SiSpeed v1, SiAcceleration a)
        {
            this.AddSegment(new ConstantCurveSegment<SiSpeed, SiAcceleration>(v0, v1, a));
        }
    }
}


