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

    /**@brief List of possible representations of a SiAcceleration */
    public enum SiAcceleration_SubUnits
    {
        Meter_per_SecondSquare, // Symbol : 'm/s²', Factor : 1.0
        Eearth_G_Constant, // Symbol : 'g', Factor : 100.0 / 981.0
    }

    /**@brief Represents a acceleration expressed in number of meter/second2s */
    public struct SiAcceleration : ISiUnit<SiAcceleration>
    {
        /****************** private members and functions ***************/
        /**@brief Internally the value is stored as a double. */
        private double the_value;

        /**@brief The minimum difference between two SiAcceleration objects. */
        private static double the_epsilon = 0.0001;

        /**@brief The minimum difference between two SiAcceleration objects. */
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
        /**@param "x" The internal value is assigned to it. It is assumed x is accelerations */
        /**@param "SubUnit" The units in wich 'x' is expressed. */
        public SiAcceleration(double x, SiAcceleration_SubUnits SubUnit)
        {
            this.the_value = 0.0;
            this.the_value = x / SubUnitFactor(SubUnit);
        }

        /**@brief A constructor where the default unit is assumed. */
        public SiAcceleration(double x)
            : this(x, SiAcceleration_SubUnits.Meter_per_SecondSquare)
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
        public static readonly SiAcceleration Zero = new SiAcceleration(0.0);

        /**@brief A handy constant for comparisons. */
        public static readonly SiAcceleration One = new SiAcceleration(1.0);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiAcceleration MinValue = new SiAcceleration(double.MinValue);

        /**@brief A handy constant for Min/Max computations. */
        public static readonly SiAcceleration MaxValue = new SiAcceleration(double.MaxValue);

        /****************** functions ***********************************/
        public bool Equals(SiAcceleration obj)
        {
            return (this == obj);
        }

        public override bool Equals(object obj)
        {
            return (obj.GetType() != this.GetType()) ? false : this.Equals((SiAcceleration)obj);
        }

        public override int GetHashCode()
        {
            return the_value.GetHashCode();
        }

        public static SiAcceleration Min(SiAcceleration a, SiAcceleration b)
        {
            return SiAcceleration.One * Math.Min(a.Value, b.Value);
        }

        public static SiAcceleration Max(SiAcceleration a, SiAcceleration b)
        {
            return SiAcceleration.One * Math.Max(a.Value, b.Value);
        }

        public bool IsLessOrEqualThan(SiAcceleration other)
        {
            return (this.Value <= other.Value);
        }

        public bool IsMoreOrEqualThan(SiAcceleration other)
        {
            return (this.Value >= other.Value);
        }

        public bool IsLessThan(SiAcceleration other)
        {
            return (this.Value < other.Value);
        }

        public bool IsMoreThan(SiAcceleration other)
        {
            return (this.Value > other.Value);
        }

        public SiAcceleration Min(SiAcceleration other)
        {
            return SiAcceleration.Min(this, other);
        }

        public SiAcceleration Max(SiAcceleration other)
        {
            return SiAcceleration.Max(this, other);
        }

        /****************** operators ***********************************/
        /**@brief Test two accelerations for equality. */
        /**@param "a" The first acceleration. */
        /**@param "b" The second acceleration. */
        /**@return 'true' if a.Value and b.Value differ less than Epsilon. Otherwise, 'else' is returned */
        public static bool operator ==(SiAcceleration a, SiAcceleration b)
        {
            return (Math.Abs(a.the_value - b.the_value) < the_epsilon);
        }

        /**@brief Test two accelerations for inequality. */
        /**@param "a" The first acceleration. */
        /**@param "b" The second acceleration. */
        /**@return 'true' if a.Value and b.Value differ more than Epsilon. Otherwise, 'else' is returned */
        public static bool operator !=(SiAcceleration a, SiAcceleration b)
        {
            return (!(a == b));
        }

        /**@brief Compare two accelerations */
        /**@param "a" The first acceleration. */
        /**@param "b" The second acceleration. */
        /**@return 'true' if a.Value is less or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator <=(SiAcceleration a, SiAcceleration b)
        {
            return (a.the_value <= b.the_value);
        }

        /**@brief Compare two accelerations */
        /**@param "a" The first acceleration. */
        /**@param "b" The second acceleration. */
        /**@return 'true' if a.Value is greater or equal than b.Value. Otherwise, 'else' is returned */
        public static bool operator >=(SiAcceleration a, SiAcceleration b)
        {
            return (a.the_value >= b.the_value);
        }

        /**@brief Compare two accelerations */
        /**@param "a" The first acceleration. */
        /**@param "b" The second acceleration. */
        /**@return 'true' if a.Value is less than b.Value. Otherwise, 'else' is returned */
        public static bool operator <(SiAcceleration a, SiAcceleration b)
        {
            return (a.the_value < b.the_value);
        }

        /**@brief Compare two accelerations */
        /**@param "a" The first acceleration. */
        /**@param "b" The second acceleration. */
        /**@return 'true' if a.Value is bigger than b.Value. Otherwise, 'else' is returned */
        public static bool operator >(SiAcceleration a, SiAcceleration b)
        {
            return (a.the_value > b.the_value);
        }

        /**@brief Returns the sum of two accelerations */
        /**@param "a" The first term of the sum. */
        /**@param "b" The second term of the sum. */
        /**@return The sum of a.Value and b.Value as a new SiAcceleration object */
        public static SiAcceleration operator +(SiAcceleration a, SiAcceleration b)
        {
            return new SiAcceleration(a.the_value + b.the_value);
        }

        /**@brief Returns the difference of two accelerations */
        /**@param "a" The first term of the difference. */
        /**@param "b" The second term of the difference. */
        /**@return The difference of (a.Value - b.Value) as a new SiAcceleration object */
        public static SiAcceleration operator -(SiAcceleration a, SiAcceleration b)
        {
            return new SiAcceleration(a.the_value - b.the_value);
        }

        /**@brief Returns the ratio of two accelerations */
        /**@param "a" The numerator of the ratio. */
        /**@param "b" The denominator of the ratio. */
        /**@return The ratio (a.Value / b.Value) as a double. */
        public static double operator /(SiAcceleration a, SiAcceleration b)
        {
            return (a.the_value / b.the_value);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" A SiAcceleration object. */
        /**@param "b" The scalar multiplier. */
        /**@return The value (a.Value * b) as a new .SiAcceleration object */
        public static SiAcceleration operator *(SiAcceleration a, double b)
        {
            return new SiAcceleration(a.the_value * b);
        }

        /**@brief Multiplies by a scalar (dimensionless) */
        /**@param "a" The scalar multiplier. */
        /**@param "b" A SiAcceleration object. */
        /**@return The value (a.Value * b) as a new .SiAcceleration object */
        public static SiAcceleration operator *(double a, SiAcceleration b)
        {
            return new SiAcceleration(a * b.the_value);
        }

        /**@brief Divides by a scalar (dimensionless) */
        /**@param "a" A SiAcceleration object. */
        /**@param "b" The scalar divisor. */
        /**@return The value (a.Value / b) as a new .SiAcceleration object */
        public static SiAcceleration operator /(SiAcceleration a, double b)
        {
            return new SiAcceleration(a.the_value / b);
        }

        /****************** operators for other classes *****************/
        /**@brief Computes a(acceleration) '*' b(time) and returns a speed. */
        /**@param "a" A acceleration. */
        /**@param "b" A time. */
        /**@return a.Value '* b.Value as a speed. */
        public static SiSpeed operator *(SiAcceleration a, SiTime b)
        {
            return new SiSpeed(a.Value * b.Value);
        }

        /****************************************************************/
        /******************************************************************/
        public string SubUnitString(SiAcceleration_SubUnits SubUnit)
        {
            string sub_unit_name = "";
            switch (SubUnit)
            {
                case SiAcceleration_SubUnits.Meter_per_SecondSquare:
                    sub_unit_name = "m/s²";
                    break;
                case SiAcceleration_SubUnits.Eearth_G_Constant:
                    sub_unit_name = "g";
                    break;
            }
            return sub_unit_name;
        }

        /******************************************************************/
        public double SubUnitFactor(SiAcceleration_SubUnits SubUnit)
        {
            double factor = 1.0;
            switch (SubUnit)
            {
                case SiAcceleration_SubUnits.Meter_per_SecondSquare:
                    factor = 1.0;
                    break;
                case SiAcceleration_SubUnits.Eearth_G_Constant:
                    factor = 100.0 / 981.0;
                    break;
            }
            return factor;
        }

        /**@brief Returns the value converted to the selected units. */
        public double ToSubUnits(SiAcceleration_SubUnits SubUnit)
        {
            return this.Value * SubUnitFactor(SubUnit);
        }
        /**@brief Returns the value converted to the default units. */
        public double ToUnits()
        {
            return ToSubUnits(SiAcceleration_SubUnits.Meter_per_SecondSquare);
        }
        /**@brief Returns the value converted to the default units. */
        public string UnitString()
        {
            return SubUnitString(SiAcceleration_SubUnits.Meter_per_SecondSquare);
        }

    } /* End of 'SiAcceleration' class.*/
} /* End of 'ErtmsSolutions.SiUnits' name space. */


/* End of file.*/
