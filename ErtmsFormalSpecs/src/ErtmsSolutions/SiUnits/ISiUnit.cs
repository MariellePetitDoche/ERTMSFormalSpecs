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
/********************************************************************************
 * ERTMS Solutions CS Library                            (c) ERTMS Solutions 2010
 ********************************************************************************
 * Caution : Automatically generated class.
 *           Do not modify by hand.
 ********************************************************************************/

/**@brief International System of Units base interface. */

namespace ErtmsSolutions.SiUnits
{
    public interface ISiUnit<T>
    {
        bool IsLessOrEqualThan(T other);
        bool IsMoreOrEqualThan(T other);
        bool IsLessThan(T other);
        bool IsMoreThan(T other);

        T Min(T other);
        T Max(T other);

        double ToUnits();
        string UnitString();
    }
}
