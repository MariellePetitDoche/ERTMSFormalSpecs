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

    /**@brief List of possible representations of a SiSpeed */
    public enum SiSpeed_SubUnits
    {
        Meter_per_Second, // Symbol : 'm/s', Factor : 1.0
        KiloMeter_per_Hour, // Symbol : 'km/h', Factor : 3600.0 / 1000.0
        Centimeter_per_Second, // Symbol : 'cm/s', Factor : 100.0
    }

    /**@brief Represents a speed expressed in number of meter/seconds */
    public struct SiSpeed : ISiUnit<SiSpeed>
    {
        /****************** private members and functions ***************/
        /**@brief Internally the value is stored as a double. */
        private double the_value;

        /**@brief The minimum difference between two SiSpeed objects. */
        private static double the_epsilon = 0.0001;

        /**@brief The minimum difference between two SiSpeed objects. */
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
        /**@param "x" The internal value is assigned to it. It is assumed x is speeds */
        /**@param "SubUnit" The units in wich 'x' is expressed. */
        public SiSpeed(double x, SiSpeed_SubUnits SubUnit)
        {
            this.the_value = 0.0;
            this.the_value = x / SubUnitFactor(SubUnit);
        }

        /**@brief A constructor where the default unit is assumed. */
        public SiSpeed(double x)
            : this(x, SiSpeed_SubUnits.Meter_per_Second)
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
        public static readonly SiSpeed Zero = new SiSpeed(0.0);

        /**@brief A handy constant for comparisons. */
        public static readonly SiSpeed One = new SiSpeed(1.0);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiSpeed MinValue = new SiSpeed(double.MinValue);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiSpeed MaxValue = new SiSpeed(double.MaxValue);

        /****************** functions ***********************************/
        public bool Equals(SiSpeed obj)
        {
            return (this == obj);
        }

        public override bool Equals(object obj)
        {
            return (obj.GetType() != this.GetType()) ? false : this.Equals((SiSpeed)obj);
        }

        public override int GetHashCode()
        {
            return the_value.GetHashCode();
        }

        public static SiSpeed Min(SiSpeed a, SiSpeed b)
        {
            return SiSpeed.One * Math.Min(a.Value, b.Value);
        }

        public static SiSpeed Max(SiSpeed a, SiSpeed b)
        {
            return SiSpeed.One * Math.Max(a.Value, b.Value);
        }

        public bool IsLessOrEqualThan(SiSpeed other)
        {
            return (this.Value <= other.Value);
        }

        public bool IsMoreOrEqualThan(SiSpeed other)
        {
            return (this.Value >= other.Value);
        }

        public bool IsLessThan(SiSpeed other)
        {
            return (this.Value < other.Value);
        }

        public bool IsMoreThan(SiSpeed other)
        {
            return (this.Value > other.Value);
        }

        public SiSpeed Min(SiSpeed other)
        {
            return SiSpeed.Min(this, other);
        }

        public SiSpeed Max(SiSpeed other)
        {
            return SiSpeed.Max(this, other);
        }

        /****************** operators ***********************************/
        /**@brief Test two speeds for equality. */
        /**@param "a" The first speed. */
        /**@param "b" The second speed. */
        /**@return 'true' if a.Value and b.Value differ less than Epsilon. Otherwise, 'else' is returned */
        public static bool operator ==(SiSpeed a, SiSpeed b)
        {
            return (Math.Abs(a.the_value - b.the_value) < the_epsilon);
        }

        /**@brief Test two speeds for inequality. */
        /**@param "a" The first speed. */
        /**@param "b" The second speed. */
        /**@return 'true' if a.Value and b.Value differ more than Epsilon. Otherwise, 'else' is returned */
        public static bool operator !=(SiSpeed a, SiSpeed b)
        {
            return (!(a == b));
        }

        /**@brief Compare two speeds */
        /**@param "a" The first speed. */
        /**@param "b" The second speed. */
        /**@return 'true' if a.Value is less or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator <=(SiSpeed a, SiSpeed b)
        {
            return (a.the_value <= b.the_value);
        }

        /**@brief Compare two speeds */
        /**@param "a" The first speed. */
        /**@param "b" The second speed. */
        /**@return 'true' if a.Value is greater or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator >=(SiSpeed a, SiSpeed b)
        {
            return (a.the_value >= b.the_value);
        }

        /**@brief Compare two speeds */
        /**@param "a" The first speed. */
        /**@param "b" The second speed. */
        /**@return 'true' if a.Value is less than b.Value. Otherwise, 'else' is returned */
        public static bool operator <(SiSpeed a, SiSpeed b)
        {
            return (a.the_value < b.the_value);
        }

        /**@brief Compare two speeds */
        /**@param "a" The first speed. */
        /**@param "b" The second speed. */
        /**@return 'true' if a.Value is bigger than b.Value. Otherwise, 'else' is returned */
        public static bool operator >(SiSpeed a, SiSpeed b)
        {
            return (a.the_value > b.the_value);
        }

        /**@brief Returns the sum of two speeds */
        /**@param "a" The first term of the sum. */
        /**@param "b" The second term of the sum. */
        /**@return The sum of a.Value and b.Value as a new SiSpeed object */
        public static SiSpeed operator +(SiSpeed a, SiSpeed b)
        {
            return new SiSpeed(a.the_value + b.the_value);
        }

        /**@brief Returns the difference of two speeds */
        /**@param "a" The first term of the difference. */
        /**@param "b" The second term of the difference. */
        /**@return The difference of (a.Value - b.Value) as a new SiSpeed object */
        public static SiSpeed operator -(SiSpeed a, SiSpeed b)
        {
            return new SiSpeed(a.the_value - b.the_value);
        }

        /**@brief Returns the ratio of two speeds */
        /**@param "a" The numerator of the ratio. */
        /**@param "b" The denominator of the ratio. */
        /**@return The ratio (a.Value / b.Value) as a double. */
        public static double operator /(SiSpeed a, SiSpeed b)
        {
            return (a.the_value / b.the_value);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" A SiSpeed object. */
        /**@param "b" The scalar multiplier. */
        /**@return The value (a.Value * b) as a new .SiSpeed object */
        public static SiSpeed operator *(SiSpeed a, double b)
        {
            return new SiSpeed(a.the_value * b);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" The scalar multiplier. */
        /**@param "b" A SiSpeed object. */
        /**@return The value (a.Value * b) as a new .SiSpeed object */
        public static SiSpeed operator *(double a, SiSpeed b)
        {
            return new SiSpeed(a * b.the_value);
        }

        /**@brief Divides by a scalar (dimensionless) */
        /**@param "a" A SiSpeed object. */
        /**@param "b" The scalar divisor. */
        /**@return The value (a.Value / b) as a new .SiSpeed object */
        public static SiSpeed operator /(SiSpeed a, double b)
        {
            return new SiSpeed(a.the_value / b);
        }

        /****************** operators for other classes *****************/
        /**@brief Computes a(speed) '*' b(time) and returns a distance. */
        /**@param "a" A speed. */
        /**@param "b" A time. */
        /**@return a.Value '* b.Value as a distance. */
        public static SiDistance operator *(SiSpeed a, SiTime b)
        {
            return new SiDistance(a.Value * b.Value);
        }

        /**@brief Computes a(speed) '/' b(time) and returns a acceleration. */
        /**@param "a" A speed. */
        /**@param "b" A time. */
        /**@return a.Value '/ b.Value as a acceleration. */
        public static SiAcceleration operator /(SiSpeed a, SiTime b)
        {
            return new SiAcceleration(a.Value / b.Value);
        }

        /****************************************************************/
        /******************************************************************/
        public string SubUnitString(SiSpeed_SubUnits SubUnit)
        {
            string sub_unit_name = "";
            switch (SubUnit)
            {
                case SiSpeed_SubUnits.Meter_per_Second:
                    sub_unit_name = "m/s";
                    break;
                case SiSpeed_SubUnits.KiloMeter_per_Hour:
                    sub_unit_name = "km/h";
                    break;
                case SiSpeed_SubUnits.Centimeter_per_Second:
                    sub_unit_name = "cm/s";
                    break;
            }
            return sub_unit_name;
        }

        /******************************************************************/
        public double SubUnitFactor(SiSpeed_SubUnits SubUnit)
        {
            double factor = 1.0;
            switch (SubUnit)
            {
                case SiSpeed_SubUnits.Meter_per_Second:
                    factor = 1.0;
                    break;
                case SiSpeed_SubUnits.KiloMeter_per_Hour:
                    factor = 3600.0 / 1000.0;
                    break;
                case SiSpeed_SubUnits.Centimeter_per_Second:
                    factor = 100.0;
                    break;
            }
            return factor;
        }

        /**@brief Returns the value converted to the selected units. */
        public double ToSubUnits(SiSpeed_SubUnits SubUnit)
        {
            return this.Value * SubUnitFactor(SubUnit);
        }
        /**@brief Returns the value converted to the default units. */
        public double ToUnits()
        {
            return ToSubUnits(SiSpeed_SubUnits.Meter_per_Second);
        }
        /**@brief Returns the value converted to the default units. */
        public string UnitString()
        {
            return SubUnitString(SiSpeed_SubUnits.Meter_per_Second);
        }

    } /* End of 'SiSpeed' class.*/
} /* End of 'ErtmsSolutions.SiUnits' name space. */


/* End of file.*/
