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
using System.ComponentModel;
using System.Globalization;

namespace GUI
{
    public class VariableModeConverter : EnumConverter
    {
        private Type _enumType;

        /// <summary>
        /// Provides the translation between a enum and its textual representation
        /// </summary>
        protected struct Converter
        {
            public DataDictionary.Generated.acceptor.VariableModeEnumType val;
            public string display;

            public Converter(DataDictionary.Generated.acceptor.VariableModeEnumType val, string display)
            {
                this.val = val;
                this.display = display;
            }
        }

        /// <summary>
        /// Holds the convertion rules
        /// </summary>
        protected List<Converter> converters = new List<Converter>();

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        public VariableModeConverter(Type type)
            : base(type)
        {
            _enumType = type;

            converters.Add(new Converter(DataDictionary.Generated.acceptor.VariableModeEnumType.aConstant, "Constant"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.VariableModeEnumType.aIncoming, "In"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.VariableModeEnumType.aInOut, "In Out"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.VariableModeEnumType.aInternal, "Internal"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.VariableModeEnumType.aOutgoing, "Out"));
        }

        public override bool CanConvertTo(ITypeDescriptorContext context, Type destType)
        {
            return destType == typeof(string);
        }

        public override object ConvertTo(ITypeDescriptorContext context, CultureInfo culture, object value, Type destType)
        {
            string retVal = converters[0].display;

            DataDictionary.Generated.acceptor.VariableModeEnumType val = (DataDictionary.Generated.acceptor.VariableModeEnumType)value;
            foreach (Converter converter in converters)
            {
                if (converter.val == val)
                {
                    retVal = converter.display;
                    break;
                }
            }

            return retVal;
        }

        public override bool CanConvertFrom(ITypeDescriptorContext context, Type srcType)
        {
            return srcType == typeof(string);
        }

        public override object ConvertFrom(ITypeDescriptorContext context, CultureInfo culture, object value)
        {
            DataDictionary.Generated.acceptor.VariableModeEnumType retVal = converters[0].val;

            foreach (Converter converter in converters)
            {
                if (converter.display.CompareTo(value) == 0)
                {
                    retVal = converter.val;
                    break;
                }
            }

            return retVal;
        }
    }

    public class ImplementationStatusConverter : EnumConverter
    {
        private Type _enumType;

        /// <summary>
        /// Provides the translation between a enum and its textual representation
        /// </summary>
        protected struct Converter
        {
            public DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM val;
            public string display;

            public Converter(DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM val, string display)
            {
                this.val = val;
                this.display = display;
            }
        }

        /// <summary>
        /// Holds the convertion rules
        /// </summary>
        protected List<Converter> converters = new List<Converter>();

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        public ImplementationStatusConverter(Type type)
            : base(type)
        {
            _enumType = type;

            converters.Add(new Converter(DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_NA, "N/A"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_Implemented, "Implemented"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_NotImplementable, "Not implementable"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_NewRevisionAvailable, "New revision available"));
        }

        public override bool CanConvertTo(ITypeDescriptorContext context, Type destType)
        {
            return destType == typeof(string);
        }

        public override object ConvertTo(ITypeDescriptorContext context, CultureInfo culture, object value, Type destType)
        {
            string retVal = converters[0].display;

            DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM val = (DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM)value;
            foreach (Converter converter in converters)
            {
                if (converter.val == val)
                {
                    retVal = converter.display;
                    break;
                }
            }

            return retVal;
        }

        public override bool CanConvertFrom(ITypeDescriptorContext context, Type srcType)
        {
            return srcType == typeof(string);
        }

        public override object ConvertFrom(ITypeDescriptorContext context, CultureInfo culture, object value)
        {
            DataDictionary.Generated.acceptor.SPEC_IMPLEMENTED_ENUM retVal = converters[0].val;

            foreach (Converter converter in converters)
            {
                if (converter.display.CompareTo(value) == 0)
                {
                    retVal = converter.val;
                    break;
                }
            }

            return retVal;
        }
    }

    public class ScopeConverter : EnumConverter
    {
        private Type _enumType;

        /// <summary>
        /// Provides the translation between a enum and its textual representation
        /// </summary>
        protected struct Converter
        {
            public DataDictionary.Generated.acceptor.Paragraph_scope val;
            public string display;

            public Converter(DataDictionary.Generated.acceptor.Paragraph_scope val, string display)
            {
                this.val = val;
                this.display = display;
            }
        }

        /// <summary>
        /// Holds the convertion rules
        /// </summary>
        protected List<Converter> converters = new List<Converter>();

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        public ScopeConverter(Type type)
            : base(type)
        {
            _enumType = type;

            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_scope.aOBU, "On Board Unit"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_scope.aOBU_AND_TRACK, "On Board Unit and Track"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_scope.aTRACK, "Track"));
        }

        public override bool CanConvertTo(ITypeDescriptorContext context, Type destType)
        {
            return destType == typeof(string);
        }

        public override object ConvertTo(ITypeDescriptorContext context, CultureInfo culture, object value, Type destType)
        {
            string retVal = converters[0].display;

            DataDictionary.Generated.acceptor.Paragraph_scope val = (DataDictionary.Generated.acceptor.Paragraph_scope)value;
            foreach (Converter converter in converters)
            {
                if (converter.val == val)
                {
                    retVal = converter.display;
                    break;
                }
            }

            return retVal;
        }

        public override bool CanConvertFrom(ITypeDescriptorContext context, Type srcType)
        {
            return srcType == typeof(string);
        }

        public override object ConvertFrom(ITypeDescriptorContext context, CultureInfo culture, object value)
        {
            DataDictionary.Generated.acceptor.Paragraph_scope retVal = converters[0].val;

            foreach (Converter converter in converters)
            {
                if (converter.display.CompareTo(value) == 0)
                {
                    retVal = converter.val;
                    break;
                }
            }

            return retVal;
        }
    }

    public class SpecTypeConverter : EnumConverter
    {
        private Type _enumType;

        /// <summary>
        /// Provides the translation between a enum and its textual representation
        /// </summary>
        protected struct Converter
        {
            public DataDictionary.Generated.acceptor.Paragraph_type val;
            public string display;

            public Converter(DataDictionary.Generated.acceptor.Paragraph_type val, string display)
            {
                this.val = val;
                this.display = display;
            }
        }

        /// <summary>
        /// Holds the convertion rules
        /// </summary>
        protected List<Converter> converters = new List<Converter>();

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        public SpecTypeConverter(Type type)
            : base(type)
        {
            _enumType = type;

            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_type.aDEFINITION, "Definition"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_type.aDELETED, "Deleted"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_type.aNOTE, "Note"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_type.aPROBLEM, "Problem"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_type.aREQUIREMENT, "Requirement"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_type.aTITLE, "Title"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.Paragraph_type.aTABLE_HEADER, "Table header"));
        }

        public override bool CanConvertTo(ITypeDescriptorContext context, Type destType)
        {
            return destType == typeof(string);
        }

        public override object ConvertTo(ITypeDescriptorContext context, CultureInfo culture, object value, Type destType)
        {
            string retVal = converters[0].display;

            DataDictionary.Generated.acceptor.Paragraph_type val = (DataDictionary.Generated.acceptor.Paragraph_type)value;
            foreach (Converter converter in converters)
            {
                if (converter.val == val)
                {
                    retVal = converter.display;
                    break;
                }
            }

            return retVal;
        }

        public override bool CanConvertFrom(ITypeDescriptorContext context, Type srcType)
        {
            return srcType == typeof(string);
        }

        public override object ConvertFrom(ITypeDescriptorContext context, CultureInfo culture, object value)
        {
            DataDictionary.Generated.acceptor.Paragraph_type retVal = converters[0].val;

            foreach (Converter converter in converters)
            {
                if (converter.display.CompareTo(value) == 0)
                {
                    retVal = converter.val;
                    break;
                }
            }

            return retVal;
        }
    }


    public class RulePriorityConverter : EnumConverter
    {
        private Type _enumType;

        /// <summary>
        /// Provides the translation between a enum and its textual representation
        /// </summary>
        protected struct Converter
        {
            public DataDictionary.Generated.acceptor.RulePriority val;
            public string display;

            public Converter(DataDictionary.Generated.acceptor.RulePriority val, string display)
            {
                this.val = val;
                this.display = display;
            }
        }

        /// <summary>
        /// Holds the convertion rules
        /// </summary>
        protected List<Converter> converters = new List<Converter>();

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        public RulePriorityConverter(Type type)
            : base(type)
        {
            _enumType = type;

            converters.Add(new Converter(DataDictionary.Generated.acceptor.RulePriority.aProcessing, "Processing"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.RulePriority.aUpdateINTERNAL, "Update INTERNAL variables"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.RulePriority.aUpdateOUT, "Update OUT variables"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.RulePriority.aVerification, "INPUT Verification"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.RulePriority.aCleanUp, "Clean Up"));
        }

        public override bool CanConvertTo(ITypeDescriptorContext context, Type destType)
        {
            return destType == typeof(string);
        }

        public override object ConvertTo(ITypeDescriptorContext context, CultureInfo culture, object value, Type destType)
        {
            string retVal = converters[0].display;

            DataDictionary.Generated.acceptor.RulePriority val = (DataDictionary.Generated.acceptor.RulePriority)value;
            foreach (Converter converter in converters)
            {
                if (converter.val == val)
                {
                    retVal = converter.display;
                    break;
                }
            }

            return retVal;
        }

        public override bool CanConvertFrom(ITypeDescriptorContext context, Type srcType)
        {
            return srcType == typeof(string);
        }

        public override object ConvertFrom(ITypeDescriptorContext context, CultureInfo culture, object value)
        {
            DataDictionary.Generated.acceptor.RulePriority retVal = converters[0].val;

            foreach (Converter converter in converters)
            {
                if (converter.display.CompareTo(value) == 0)
                {
                    retVal = converter.val;
                    break;
                }
            }

            return retVal;
        }
    }

    public class RangePrecisionConverter : EnumConverter
    {
        private Type _enumType;

        /// <summary>
        /// Provides the translation between a enum and its textual representation
        /// </summary>
        protected struct Converter
        {
            public DataDictionary.Generated.acceptor.PrecisionEnum val;
            public string display;

            public Converter(DataDictionary.Generated.acceptor.PrecisionEnum val, string display)
            {
                this.val = val;
                this.display = display;
            }
        }

        /// <summary>
        /// Holds the convertion rules
        /// </summary>
        protected List<Converter> converters = new List<Converter>();

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        public RangePrecisionConverter(Type type)
            : base(type)
        {
            _enumType = type;

            converters.Add(new Converter(DataDictionary.Generated.acceptor.PrecisionEnum.aIntegerPrecision, "Integer"));
            converters.Add(new Converter(DataDictionary.Generated.acceptor.PrecisionEnum.aDoublePrecision, "Floating point"));
        }

        public override bool CanConvertTo(ITypeDescriptorContext context, Type destType)
        {
            return destType == typeof(string);
        }

        public override object ConvertTo(ITypeDescriptorContext context, CultureInfo culture, object value, Type destType)
        {
            string retVal = converters[0].display;

            DataDictionary.Generated.acceptor.PrecisionEnum val = (DataDictionary.Generated.acceptor.PrecisionEnum)value;
            foreach (Converter converter in converters)
            {
                if (converter.val == val)
                {
                    retVal = converter.display;
                    break;
                }
            }

            return retVal;
        }

        public override bool CanConvertFrom(ITypeDescriptorContext context, Type srcType)
        {
            return srcType == typeof(string);
        }

        public override object ConvertFrom(ITypeDescriptorContext context, CultureInfo culture, object value)
        {
            DataDictionary.Generated.acceptor.PrecisionEnum retVal = converters[0].val;

            foreach (Converter converter in converters)
            {
                if (converter.display.CompareTo(value) == 0)
                {
                    retVal = converter.val;
                    break;
                }
            }

            return retVal;
        }
    }
}
