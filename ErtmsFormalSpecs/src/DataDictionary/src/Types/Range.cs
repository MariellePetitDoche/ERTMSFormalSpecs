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
using System.Collections.Generic;
using DataDictionary.Interpreter;

namespace DataDictionary.Types
{
    public class Range : Generated.Range, IEnumerateValues, Utils.ISubDeclarator, DataDictionary.TextualExplain
    {
        /// <summary>
        /// The min value of the range
        /// </summary>
        public string MinValue
        {
            get { return getMinValue(); }
            set
            {
                setMinValue(value);
                minValueSet = false;
            }
        }

        /// <summary>
        /// A cache for the min value
        /// </summary>
        private bool minValueSet;
        private Decimal minValueAsLong;
        private double minValueAsDouble;
        public Decimal MinValueAsLong
        {
            get
            {
                if (!minValueSet)
                {
                    minValueAsLong = Decimal.Parse(MinValue);
                    minValueSet = true;
                }
                return minValueAsLong;
            }

        }

        public double MinValueAsDouble
        {
            get
            {
                if (!minValueSet)
                {
                    minValueAsDouble = getDouble(MinValue);
                    minValueSet = true;
                }
                return minValueAsDouble;
            }
        }

        /// <summary>
        /// The max value of the range
        /// </summary>
        public string MaxValue
        {
            get { return getMaxValue(); }
            set { setMaxValue(value); }
        }

        /// <summary>
        /// A cache for the min value
        /// </summary>
        private bool maxValueSet = false;
        private Decimal maxValueAsLong;
        private double maxValueAsDouble;
        public Decimal MaxValueAsLong
        {
            get
            {
                if (!maxValueSet)
                {
                    maxValueAsLong = Decimal.Parse(MaxValue);
                    maxValueSet = true;
                }
                return maxValueAsLong;
            }

        }

        public double MaxValueAsDouble
        {
            get
            {
                if (!maxValueSet)
                {
                    maxValueAsDouble = getDouble(MaxValue);
                    maxValueSet = true;
                }
                return maxValueAsDouble;
            }
        }

        /// <summary>
        /// The special values of the range
        /// </summary>
        public System.Collections.ArrayList SpecialValues
        {
            get
            {
                if (allSpecialValues() == null)
                {
                    setAllSpecialValues(new System.Collections.ArrayList());
                }
                return allSpecialValues();
            }
            set
            {
                setAllSpecialValues(value);
            }
        }

        /// <summary>
        /// Just a cache
        /// </summary>
        private static Dictionary<string, double> cache = new Dictionary<string, double>();

        /// <summary>
        /// Faster method of getting a double from its string representation
        /// </summary>
        /// <param name="image"></param>
        /// <returns></returns>
        private static double getDouble(string image)
        {
            double retVal;

            if (!cache.TryGetValue(image, out retVal))
            {
                retVal = double.Parse(image, System.Globalization.CultureInfo.InvariantCulture);
                cache.Add(image, retVal);
            }

            return retVal;
        }

        /// <summary>
        /// Parses the image and provides the corresponding value
        /// </summary>
        /// <param name="image"></param>
        /// <returns></returns>
        public override Values.IValue getValue(string image)
        {
            Values.IValue retVal = null;

            if (Char.IsLetter(image[0]) || image[0] == '_')
            {
                retVal = findEnumValue(image);
                if (retVal == null)
                {
                    Log.Error("Cannot create range value from " + image);
                }
            }
            else
            {
                try
                {
                    switch (getPrecision())
                    {
                        case Generated.acceptor.PrecisionEnum.aIntegerPrecision:
                            {
                                Decimal val = Decimal.Parse(image);
                                Decimal min = MinValueAsLong;
                                Decimal max = MaxValueAsLong;
                                if (val >= min && val <= max)
                                {
                                    retVal = new Values.IntValue(this, val);
                                }
                            }
                            break;

                        case Generated.acceptor.PrecisionEnum.aDoublePrecision:
                            {
                                System.Globalization.CultureInfo info = System.Globalization.CultureInfo.InvariantCulture;

                                double val = getDouble(image);
                                double min = MinValueAsDouble;
                                double max = MaxValueAsDouble;
                                if (val >= min && val <= max && image.IndexOf('.') >= 0)
                                {
                                    retVal = new Values.DoubleValue(this, val);
                                }
                                break;
                            }
                    }

                }
                catch (Exception exception)
                {
                    Log.Error("Cannot create range value", exception);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Converts a value in this type
        /// </summary>
        /// <param name="value">The value to convert</param>
        /// <returns></returns>
        public Values.IValue convert(Values.IValue value)
        {
            Values.IValue retVal = null;

            Constants.EnumValue enumValue = value as Constants.EnumValue;
            if (enumValue != null && enumValue.Range != null)
            {
                retVal = findEnumValue(enumValue.Name);
                if (retVal == null)
                {
                    Log.Error("Cannot convert " + enumValue.Name + " to " + FullName);
                }
            }
            else
            {
                try
                {
                    switch (getPrecision())
                    {
                        case Generated.acceptor.PrecisionEnum.aIntegerPrecision:
                            {
                                Decimal val = getValueAsInt(value);
                                Decimal min = MinValueAsLong;
                                Decimal max = MaxValueAsLong;
                                if (val >= min && val <= max)
                                {
                                    retVal = new Values.IntValue(this, val);
                                }
                            }
                            break;
                        case Generated.acceptor.PrecisionEnum.aDoublePrecision:
                            {
                                double val = getValueAsDouble(value);
                                double min = MinValueAsDouble;
                                double max = MaxValueAsDouble;
                                if (val >= min && val <= max)
                                {
                                    retVal = new Values.DoubleValue(this, val);
                                }
                                break;
                            }
                    }
                }
                catch (Exception exception)
                {
                    Log.Error("Cannot convert range value", exception);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value as a decimal value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        private Decimal getValueAsInt(Values.IValue value)
        {
            Decimal retVal;

            Values.IntValue intVal = value as Values.IntValue;
            if (intVal != null)
            {
                retVal = intVal.Val;
            }
            else
            {
                Values.DoubleValue doubleVal = value as Values.DoubleValue;
                if (doubleVal != null)
                {
                    retVal = new Decimal(Math.Round(doubleVal.Val));
                }
                else
                {
                    throw new Exception("Cannot convert value " + value + " to " + FullName);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value as a double value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        private Double getValueAsDouble(Values.IValue value)
        {
            Double retVal;

            Values.IntValue intVal = value as Values.IntValue;
            if (intVal != null)
            {
                retVal = Decimal.ToDouble(intVal.Val);
            }
            else
            {
                Values.DoubleValue doubleVal = value as Values.DoubleValue;
                if (doubleVal != null)
                {
                    retVal = doubleVal.Val;
                }
                else
                {
                    throw new Exception("Cannot convert value " + value + " to " + FullName);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the enclosing collection to allow deletion of a range
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return NameSpace.Ranges; }
        }

        /// <summary>
        /// Performs the arithmetic operation based on the type of the result
        /// </summary>
        /// <param name="context">The context used to perform this operation</param>
        /// <param name="left"></param>
        /// <param name="Operation"></param>
        /// <param name="right"></param>
        /// <returns></returns>
        public override Values.IValue PerformArithmericOperation(Interpreter.InterpretationContext context, Values.IValue left, Interpreter.BinaryExpression.OPERATOR Operation, Values.IValue right)  // left +/-/*/div/exp right
        {
            Values.IValue retVal = null;

            Constants.EnumValue enumValue = left as Constants.EnumValue;
            if (enumValue != null)
            {
                left = enumValue.Value;
            }

            enumValue = right as Constants.EnumValue;
            if (enumValue != null)
            {
                right = enumValue.Value;
            }

            Values.IntValue int1 = left as Values.IntValue;
            Values.IntValue int2 = right as Values.IntValue;

            if (int1 == null || int2 == null)
            {
                retVal = EFSSystem.DoubleType.PerformArithmericOperation(context, left, Operation, right);
            }
            else
            {
                retVal = EFSSystem.IntegerType.PerformArithmericOperation(context, left, Operation, right);
            }

            return retVal;
        }

        /// <summary>
        /// Compares two ranges for equality
        /// </summary>
        /// <param name="left"></param>
        /// <param name="right"></param>
        /// <returns></returns>
        public override bool CompareForEquality(Values.IValue left, Values.IValue right)
        {
            bool retVal = false;

            Values.IntValue int1 = left as Values.IntValue;
            Values.IntValue int2 = right as Values.IntValue;

            if (int1 != null && int2 != null)
            {
                retVal = (int1.Val == int2.Val);
            }
            else
            {
                Values.DoubleValue double1 = left as Values.DoubleValue;
                Values.DoubleValue double2 = right as Values.DoubleValue;

                if (double1 != null && double2 != null)
                {
                    retVal = Types.DoubleType.CompareDoubleForEquality(double1.Val, double2.Val); ;
                }
                else
                {
                    retVal = base.CompareForEquality(left, right);
                }
            }

            return retVal;
        }

        public override bool Less(Values.IValue left, Values.IValue right)  // left < right
        {
            bool retVal = false;

            Values.IntValue int1 = left as Values.IntValue;
            Values.IntValue int2 = right as Values.IntValue;

            if (int1 != null && int2 != null)
            {
                retVal = int1.Val < int2.Val;
            }
            else
            {
                retVal = EFSSystem.DoubleType.Less(left, right);
            }

            return retVal;
        }

        public override bool Greater(Values.IValue left, Values.IValue right)  // left > right
        {
            bool retVal = false;

            Values.IntValue int1 = left as Values.IntValue;
            Values.IntValue int2 = right as Values.IntValue;

            if (int1 != null && int2 != null)
            {
                retVal = int1.Val > int2.Val;
            }
            else
            {
                retVal = EFSSystem.DoubleType.Greater(left, right);
            }

            return retVal;
        }

        /// <summary>
        /// Provides all constant values for this type
        /// </summary>
        /// <param name="scope"></param>
        /// <param name="retVal"></param>
        public void Constants(string scope, Dictionary<string, object> retVal)
        {
            foreach (Constants.EnumValue value in SpecialValues)
            {
                string name = Utils.Utils.concat(scope, value.Name);
                retVal[name] = retVal;
            }
        }

        /// <summary>
        /// Provides all the values that can be stored in this structure
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = new Dictionary<string, List<Utils.INamable>>();

                foreach (Constants.EnumValue value in SpecialValues)
                {
                    Utils.ISubDeclaratorUtils.AppendNamable(retVal, value);
                }

                return retVal;
            }
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            foreach (Constants.EnumValue item in SpecialValues)
            {
                if (item.Name.CompareTo(name) == 0)
                {
                    retVal.Add(item);
                    break;
                }
            }
        }

        /// <summary>
        /// Provides the enum value which corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Constants.EnumValue findEnumValue(string name)
        {
            Constants.EnumValue retVal = null;

            retVal = (Constants.EnumValue)Utils.INamableUtils.findByName(name, SpecialValues);

            return retVal;
        }

        /// <summary>
        /// Provides the values whose name matches the name provided
        /// </summary>
        /// <param name="index">the index in names to consider</param>
        /// <param name="names">the simple value names</param>
        public Values.IValue findValue(string[] names, int index)
        {
            // HaCK: we should check the enclosing range names
            return findEnumValue(names[names.Length - 1]);
        }

        /// <summary>
        /// Indicates that the other type may be placed in this range
        /// </summary>
        /// <param name="otherType"></param>
        /// <returns></returns>
        public override bool Match(Type otherType)
        {
            bool retVal = base.Match(otherType);

            if (!retVal)
            {
                if (otherType is IntegerType && getPrecision() == Generated.acceptor.PrecisionEnum.aIntegerPrecision)
                {
                    retVal = true;
                }
                else if (otherType is DoubleType && getPrecision() == Generated.acceptor.PrecisionEnum.aDoublePrecision)
                {
                    retVal = true;
                }
                else
                {
                    Range otherRange = otherType as Types.Range;
                    if (otherRange != null && getPrecision() == otherRange.getPrecision())
                    {
                        retVal = true;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// A function which allows to cast a value as a new value of this type
        /// </summary>
        public Functions.Function castFunction;
        public Functions.Function CastFunction
        {
            get
            {
                if (castFunction == null)
                {
                    castFunction = new Functions.PredefinedFunctions.Cast(this);
                }

                return castFunction;
            }
        }


        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Constants.EnumValue item = element as Constants.EnumValue;
                if (item != null)
                {
                    appendSpecialValues(item);
                }
            }

            base.AddModelElement(element);
        }

        /// <summary>
        /// Provides an explanation of the range
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel)
        {
            string retVal = "";

            retVal = TextualExplainUtilities.Pad("{" + Name + " : RANGE FROM " + MinValue + " TO " + MaxValue + "}", indentLevel);

            foreach (Constants.EnumValue enumValue in SpecialValues)
            {
                retVal += "\\par" + TextualExplainUtilities.Pad("{" + enumValue.Name + " : " + enumValue.getValue() + "}", indentLevel + 2);
            }


            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the range
        /// </summary>
        /// <param name="explainSubElements">Precises if we need to explain the sub elements (if any)</param>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0);

            return TextualExplainUtilities.Encapsule(retVal);
        }
        /// <summary>
        /// Combines two types to create a new one
        /// </summary>
        /// <param name="right"></param>
        /// <returns></returns>
        public override ReturnValue CombineType(Type right, BinaryExpression.OPERATOR Operator)
        {
            ReturnValue retVal = new ReturnValue();

            if (Operator == BinaryExpression.OPERATOR.MULT)
            {
                if (FullName.CompareTo("Default.BaseTypes.Speed") == 0 && right.FullName.CompareTo("Default.BaseTypes.Time") == 0)
                {
                    NameSpace nameSpace = EnclosingNameSpaceFinder.find(this);
                    retVal.Add(nameSpace.findTypeByName("Distance"));
                }
            }
            else
            {
                if (IsDouble())
                {
                    if (right == EFSSystem.DoubleType)
                    {
                        retVal.Add(this);
                    }
                }
                else
                {
                    if (right == EFSSystem.IntegerType)
                    {
                        retVal.Add(this);
                    }
                }
            }

            return retVal;
        }

    }
}
