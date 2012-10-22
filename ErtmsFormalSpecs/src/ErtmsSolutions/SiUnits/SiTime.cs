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

    /**@brief List of possible representations of a SiTime */
    public enum SiTime_SubUnits
    {
        Second, // Symbol : 's', Factor : 1.0
        Minute, // Symbol : 'm', Factor : 1.0 / 60.0
        Hour, // Symbol : 'h', Factor : 1.0 / 3600.0
        Millisecond, // Symbol : 'ms', Factor : 1000.0
    }

    /**@brief Represents a time expressed in number of seconds */
    public struct SiTime : ISiUnit<SiTime>
    {
        /****************** private members and functions ***************/
        /**@brief Internally the value is stored as a double. */
        private double the_value;

        /**@brief The minimum difference between two SiTime objects. */
        private static double the_epsilon = 0.0001;

        /**@brief The minimum difference between two SiTime objects. */
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
        /**@param "x" The internal value is assigned to it. It is assumed x is times */
        /**@param "SubUnit" The units in wich 'x' is expressed. */
        public SiTime(double x, SiTime_SubUnits SubUnit)
        {
            this.the_value = 0.0;
            this.the_value = x / SubUnitFactor(SubUnit);
        }

        /**@brief A constructor where the default unit is assumed. */
        public SiTime(double x)
            : this(x, SiTime_SubUnits.Second)
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
        public static readonly SiTime Zero = new SiTime(0.0);

        /**@brief A handy constant for comparisons. */
        public static readonly SiTime One = new SiTime(1.0);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiTime MinValue = new SiTime(double.MinValue);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiTime MaxValue = new SiTime(double.MaxValue);

        /****************** functions ***********************************/
        public bool Equals(SiTime obj)
        {
            return (this == obj);
        }

        public override bool Equals(object obj)
        {
            return (obj.GetType() != this.GetType()) ? false : this.Equals((SiTime)obj);
        }

        public override int GetHashCode()
        {
            return the_value.GetHashCode();
        }

        public static SiTime Min(SiTime a, SiTime b)
        {
            return SiTime.One * Math.Min(a.Value, b.Value);
        }

        public static SiTime Max(SiTime a, SiTime b)
        {
            return SiTime.One * Math.Max(a.Value, b.Value);
        }

        public bool IsLessOrEqualThan(SiTime other)
        {
            return (this.Value <= other.Value);
        }

        public bool IsMoreOrEqualThan(SiTime other)
        {
            return (this.Value >= other.Value);
        }

        public bool IsLessThan(SiTime other)
        {
            return (this.Value < other.Value);
        }

        public bool IsMoreThan(SiTime other)
        {
            return (this.Value > other.Value);
        }

        public SiTime Min(SiTime other)
        {
            return SiTime.Min(this, other);
        }

        public SiTime Max(SiTime other)
        {
            return SiTime.Max(this, other);
        }

        /****************** operators ***********************************/
        /**@brief Test two times for equality. */
        /**@param "a" The first time. */
        /**@param "b" The second time. */
        /**@return 'true' if a.Value and b.Value differ less than Epsilon. Otherwise, 'else' is returned */
        public static bool operator ==(SiTime a, SiTime b)
        {
            return (Math.Abs(a.the_value - b.the_value) < the_epsilon);
        }

        /**@brief Test two times for inequality. */
        /**@param "a" The first time. */
        /**@param "b" The second time. */
        /**@return 'true' if a.Value and b.Value differ more than Epsilon. Otherwise, 'else' is returned */
        public static bool operator !=(SiTime a, SiTime b)
        {
            return (!(a == b));
        }

        /**@brief Compare two times */
        /**@param "a" The first time. */
        /**@param "b" The second time. */
        /**@return 'true' if a.Value is less or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator <=(SiTime a, SiTime b)
        {
            return (a.the_value <= b.the_value);
        }

        /**@brief Compare two times */
        /**@param "a" The first time. */
        /**@param "b" The second time. */
        /**@return 'true' if a.Value is greater or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator >=(SiTime a, SiTime b)
        {
            return (a.the_value >= b.the_value);
        }

        /**@brief Compare two times */
        /**@param "a" The first time. */
        /**@param "b" The second time. */
        /**@return 'true' if a.Value is less than b.Value. Otherwise, 'else' is returned */
        public static bool operator <(SiTime a, SiTime b)
        {
            return (a.the_value < b.the_value);
        }

        /**@brief Compare two times */
        /**@param "a" The first time. */
        /**@param "b" The second time. */
        /**@return 'true' if a.Value is bigger than b.Value. Otherwise, 'else' is returned */
        public static bool operator >(SiTime a, SiTime b)
        {
            return (a.the_value > b.the_value);
        }

        /**@brief Returns the sum of two times */
        /**@param "a" The first term of the sum. */
        /**@param "b" The second term of the sum. */
        /**@return The sum of a.Value and b.Value as a new SiTime object */
        public static SiTime operator +(SiTime a, SiTime b)
        {
            return new SiTime(a.the_value + b.the_value);
        }

        /**@brief Returns the difference of two times */
        /**@param "a" The first term of the difference. */
        /**@param "b" The second term of the difference. */
        /**@return The difference of (a.Value - b.Value) as a new SiTime object */
        public static SiTime operator -(SiTime a, SiTime b)
        {
            return new SiTime(a.the_value - b.the_value);
        }

        /**@brief Returns the ratio of two times */
        /**@param "a" The numerator of the ratio. */
        /**@param "b" The denominator of the ratio. */
        /**@return The ratio (a.Value / b.Value) as a double. */
        public static double operator /(SiTime a, SiTime b)
        {
            return (a.the_value / b.the_value);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" A SiTime object. */
        /**@param "b" The scalar multiplier. */
        /**@return The value (a.Value * b) as a new .SiTime object */
        public static SiTime operator *(SiTime a, double b)
        {
            return new SiTime(a.the_value * b);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" The scalar multiplier. */
        /**@param "b" A SiTime object. */
        /**@return The value (a.Value * b) as a new .SiTime object */
        public static SiTime operator *(double a, SiTime b)
        {
            return new SiTime(a * b.the_value);
        }

        /**@brief Divides by a scalar (dimensionless) */
        /**@param "a" A SiTime object. */
        /**@param "b" The scalar divisor. */
        /**@return The value (a.Value / b) as a new .SiTime object */
        public static SiTime operator /(SiTime a, double b)
        {
            return new SiTime(a.the_value / b);
        }

        /****************** operators for other classes *****************/
        /**@brief Computes a(time) '*' b(speed) and returns a distance. */
        /**@param "a" A time. */
        /**@param "b" A speed. */
        /**@return a.Value '* b.Value as a distance. */
        public static SiDistance operator *(SiTime a, SiSpeed b)
        {
            return new SiDistance(a.Value * b.Value);
        }

        /**@brief Computes a(time) '*' b(acceleration) and returns a speed. */
        /**@param "a" A time. */
        /**@param "b" A acceleration. */
        /**@return a.Value '* b.Value as a speed. */
        public static SiSpeed operator *(SiTime a, SiAcceleration b)
        {
            return new SiSpeed(a.Value * b.Value);
        }

        /****************************************************************/
        /******************************************************************/
        public string SubUnitString(SiTime_SubUnits SubUnit)
        {
            string sub_unit_name = "";
            switch (SubUnit)
            {
                case SiTime_SubUnits.Second:
                    sub_unit_name = "s";
                    break;
                case SiTime_SubUnits.Minute:
                    sub_unit_name = "m";
                    break;
                case SiTime_SubUnits.Hour:
                    sub_unit_name = "h";
                    break;
                case SiTime_SubUnits.Millisecond:
                    sub_unit_name = "ms";
                    break;
            }
            return sub_unit_name;
        }

        /******************************************************************/
        public double SubUnitFactor(SiTime_SubUnits SubUnit)
        {
            double factor = 1.0;
            switch (SubUnit)
            {
                case SiTime_SubUnits.Second:
                    factor = 1.0;
                    break;
                case SiTime_SubUnits.Minute:
                    factor = 1.0 / 60.0;
                    break;
                case SiTime_SubUnits.Hour:
                    factor = 1.0 / 3600.0;
                    break;
                case SiTime_SubUnits.Millisecond:
                    factor = 1000.0;
                    break;
            }
            return factor;
        }

        /**@brief Returns the value converted to the selected units. */
        public double ToSubUnits(SiTime_SubUnits SubUnit)
        {
            return this.Value * SubUnitFactor(SubUnit);
        }
        /**@brief Returns the value converted to the default units. */
        public double ToUnits()
        {
            return ToSubUnits(SiTime_SubUnits.Second);
        }
        /**@brief Returns the value converted to the default units. */
        public string UnitString()
        {
            return SubUnitString(SiTime_SubUnits.Second);
        }

    } /* End of 'SiTime' class.*/
} /* End of 'ErtmsSolutions.SiUnits' name space. */


/* End of file.*/
