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

using System;
/**@brief International System of Units encapsulation. */
namespace ErtmsSolutions.SiUnits
{

    /**@brief List of possible representations of a SiDistance */
    public enum SiDistance_SubUnits
    {
        Meter, // Symbol : 'm', Factor : 1.0
        DecaMeter, // Symbol : 'dm', Factor : 1.0 / 10.0
        HectoMeter, // Symbol : 'hm', Factor : 1.0 / 100.0
        KiloMeter, // Symbol : 'km', Factor : 1.0 / 1000.0
        Centimeter, // Symbol : 'cm', Factor : 100.0
    }

    /**@brief Represents a distance expressed in number of meters */
    public struct SiDistance : ISiUnit<SiDistance>
    {
        /****************** private members and functions ***************/
        /**@brief Internally the value is stored as a double. */
        private double the_value;

        /**@brief The minimum difference between two SiDistance objects. */
        private static double the_epsilon = 0.0001;

        /**@brief The minimum difference between two SiDistance objects. */
        public static double Epsilon
        {
            get
            {
                return the_epsilon;
            }
            set
            {
                the_epsilon = value;
            }
        }

        /****************** constructors ******************************/
        /**@brief A constructor where the value unit's is specified. */
        /**@param "x" The internal value is assigned to it. It is assumed x is distances */
        /**@param "SubUnit" The units in wich 'x' is expressed. */
        public SiDistance(double x, SiDistance_SubUnits SubUnit)
        {
            this.the_value = 0.0;
            this.the_value = x / SubUnitFactor(SubUnit);
        }

        /**@brief A constructor where the default unit is assumed. */
        public SiDistance(double x)
            : this(x, SiDistance_SubUnits.Meter)
        {
        }

        /**@brief Returns the value as a double. */
        public double Value
        {
            get
            {
                return this.the_value;
            }
        }

        /****************** Constants *********************************/
        /**@brief A handy constant for comparisons. */
        public static readonly SiDistance Zero = new SiDistance(0.0);

        /**@brief A handy constant for comparisons. */
        public static readonly SiDistance One = new SiDistance(1.0);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiDistance MinValue = new SiDistance(double.MinValue);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiDistance MaxValue = new SiDistance(double.MaxValue);

        /****************** functions ***********************************/
        public bool Equals(SiDistance obj)
        {
            return (this == obj);
        }

        public override bool Equals(object obj)
        {
            return (obj.GetType() != this.GetType()) ? false : this.Equals((SiDistance)obj);
        }

        public override int GetHashCode()
        {
            return the_value.GetHashCode();
        }

        public static SiDistance Min(SiDistance a, SiDistance b)
        {
            return SiDistance.One * Math.Min(a.Value, b.Value);
        }

        public static SiDistance Max(SiDistance a, SiDistance b)
        {
            return SiDistance.One * Math.Max(a.Value, b.Value);
        }

        public bool IsLessOrEqualThan(SiDistance other)
        {
            return (this.Value <= other.Value);
        }

        public bool IsMoreOrEqualThan(SiDistance other)
        {
            return (this.Value >= other.Value);
        }

        public bool IsLessThan(SiDistance other)
        {
            return (this.Value < other.Value);
        }

        public bool IsMoreThan(SiDistance other)
        {
            return (this.Value > other.Value);
        }

        public SiDistance Min(SiDistance other)
        {
            return SiDistance.Min(this, other);
        }

        public SiDistance Max(SiDistance other)
        {
            return SiDistance.Max(this, other);
        }

        /****************** operators ***********************************/
        /**@brief Test two distances for equality. */
        /**@param "a" The first distance. */
        /**@param "b" The second distance. */
        /**@return 'true' if a.Value and b.Value differ less than Epsilon. Otherwise, 'else' is returned */
        public static bool operator ==(SiDistance a, SiDistance b)
        {
            return (Math.Abs(a.the_value - b.the_value) < the_epsilon);
        }

        /**@brief Test two distances for inequality. */
        /**@param "a" The first distance. */
        /**@param "b" The second distance. */
        /**@return 'true' if a.Value and b.Value differ more than Epsilon. Otherwise, 'else' is returned */
        public static bool operator !=(SiDistance a, SiDistance b)
        {
            return (!(a == b));
        }

        /**@brief Compare two distances */
        /**@param "a" The first distance. */
        /**@param "b" The second distance. */
        /**@return 'true' if a.Value is less or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator <=(SiDistance a, SiDistance b)
        {
            return (a.the_value <= b.the_value);
        }

        /**@brief Compare two distances */
        /**@param "a" The first distance. */
        /**@param "b" The second distance. */
        /**@return 'true' if a.Value is greater or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator >=(SiDistance a, SiDistance b)
        {
            return (a.the_value >= b.the_value);
        }

        /**@brief Compare two distances */
        /**@param "a" The first distance. */
        /**@param "b" The second distance. */
        /**@return 'true' if a.Value is less than b.Value. Otherwise, 'else' is returned */
        public static bool operator <(SiDistance a, SiDistance b)
        {
            return (a.the_value < b.the_value);
        }

        /**@brief Compare two distances */
        /**@param "a" The first distance. */
        /**@param "b" The second distance. */
        /**@return 'true' if a.Value is bigger than b.Value. Otherwise, 'else' is returned */
        public static bool operator >(SiDistance a, SiDistance b)
        {
            return (a.the_value > b.the_value);
        }

        /**@brief Returns the sum of two distances */
        /**@param "a" The first term of the sum. */
        /**@param "b" The second term of the sum. */
        /**@return The sum of a.Value and b.Value as a new SiDistance object */
        public static SiDistance operator +(SiDistance a, SiDistance b)
        {
            return new SiDistance(a.the_value + b.the_value);
        }

        /**@brief Returns the difference of two distances */
        /**@param "a" The first term of the difference. */
        /**@param "b" The second term of the difference. */
        /**@return The difference of (a.Value - b.Value) as a new SiDistance object */
        public static SiDistance operator -(SiDistance a, SiDistance b)
        {
            return new SiDistance(a.the_value - b.the_value);
        }

        /**@brief Returns the ratio of two distances */
        /**@param "a" The numerator of the ratio. */
        /**@param "b" The denominator of the ratio. */
        /**@return The ratio (a.Value / b.Value) as a double. */
        public static double operator /(SiDistance a, SiDistance b)
        {
            return (a.the_value / b.the_value);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" A SiDistance object. */
        /**@param "b" The scalar multiplier. */
        /**@return The value (a.Value * b) as a new .SiDistance object */
        public static SiDistance operator *(SiDistance a, double b)
        {
            return new SiDistance(a.the_value * b);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" The scalar multiplier. */
        /**@param "b" A SiDistance object. */
        /**@return The value (a.Value * b) as a new .SiDistance object */
        public static SiDistance operator *(double a, SiDistance b)
        {
            return new SiDistance(a * b.the_value);
        }

        /**@brief Divides by a scalar (dimensionless) */
        /**@param "a" A SiDistance object. */
        /**@param "b" The scalar divisor. */
        /**@return The value (a.Value / b) as a new .SiDistance object */
        public static SiDistance operator /(SiDistance a, double b)
        {
            return new SiDistance(a.the_value / b);
        }

        /****************** operators for other classes *****************/
        /**@brief Computes a(distance) '/' b(time) and returns a speed. */
        /**@param "a" A distance. */
        /**@param "b" A time. */
        /**@return a.Value '/ b.Value as a speed. */
        public static SiSpeed operator /(SiDistance a, SiTime b)
        {
            return new SiSpeed(a.Value / b.Value);
        }

        /****************************************************************/
        /******************************************************************/
        public string SubUnitString(SiDistance_SubUnits SubUnit)
        {
            string sub_unit_name = "";
            switch (SubUnit)
            {
                case SiDistance_SubUnits.Meter:
                    sub_unit_name = "m";
                    break;
                case SiDistance_SubUnits.DecaMeter:
                    sub_unit_name = "dm";
                    break;
                case SiDistance_SubUnits.HectoMeter:
                    sub_unit_name = "hm";
                    break;
                case SiDistance_SubUnits.KiloMeter:
                    sub_unit_name = "km";
                    break;
                case SiDistance_SubUnits.Centimeter:
                    sub_unit_name = "cm";
                    break;
            }
            return sub_unit_name;
        }

        /******************************************************************/
        public double SubUnitFactor(SiDistance_SubUnits SubUnit)
        {
            double factor = 1.0;
            switch (SubUnit)
            {
                case SiDistance_SubUnits.Meter:
                    factor = 1.0;
                    break;
                case SiDistance_SubUnits.DecaMeter:
                    factor = 1.0 / 10.0;
                    break;
                case SiDistance_SubUnits.HectoMeter:
                    factor = 1.0 / 100.0;
                    break;
                case SiDistance_SubUnits.KiloMeter:
                    factor = 1.0 / 1000.0;
                    break;
                case SiDistance_SubUnits.Centimeter:
                    factor = 100.0;
                    break;
            }
            return factor;
        }

        /**@brief Returns the value converted to the selected units. */
        public double ToSubUnits(SiDistance_SubUnits SubUnit)
        {
            return this.Value * SubUnitFactor(SubUnit);
        }
        /**@brief Returns the value converted to the default units. */
        public double ToUnits()
        {
            return ToSubUnits(SiDistance_SubUnits.Meter);
        }
        /**@brief Returns the value converted to the default units. */
        public string UnitString()
        {
            return SubUnitString(SiDistance_SubUnits.Meter);
        }

    } /* End of 'SiDistance' class.*/
} /* End of 'ErtmsSolutions.SiUnits' name space. */


/* End of file.*/
