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

namespace DataDictionary.Constants
{
    public class EnumValue : Generated.EnumValue, Values.IValue
    {
        /// <summary>
        /// The corresponding type
        /// </summary>
        public Types.Type Type
        {
            get
            {
                Types.Type retVal = null;

                if (Enum != null)
                {
                    retVal = Enum;
                }
                else if (Range != null)
                {
                    retVal = Range;
                }

                return retVal;
            }
            set { }
        }

        public string LiteralName
        {
            get
            {
                string retVal = "";

                if (Enum != null)
                {
                    retVal = Enum.Name + "." + Name;
                }
                else if (Range != null)
                {
                    retVal = Range.Name + "." + Name;
                }

                return retVal;
            }
        }

        /// <summary>
        /// The enclosing enumeration type
        /// </summary>
        public Types.Enum Enum
        {
            get { return Enclosing as Types.Enum; }
        }

        /// <summary>
        /// The enclosing range
        /// </summary>
        public Types.Range Range
        {
            get { return Enclosing as Types.Range; }
        }

        public Values.IValue Value
        {
            get
            {
                Values.IValue retVal = this;

                if (Range != null)
                {
                    retVal = Range.getValue(getValue());
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the enclosing collection, for deletion purposes
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                System.Collections.ArrayList retVal = null;

                if (Enum != null)
                {
                    retVal = Enum.Values;
                }
                else if (Range != null)
                {
                    retVal = Range.SpecialValues;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Creates a valid right side IValue, according to the target variable (left side)
        /// </summary>
        /// <param name="variable">The target variable</param>
        /// <param name="duplicate">Indicates that a duplication of the variable should be performed</param>
        /// <returns></returns>
        public virtual Values.IValue RightSide(Variables.IVariable variable, bool duplicate)
        {
            return this;
        }

        /// <summary>
        /// The namespace related to the typed element
        /// </summary>
        public Types.NameSpace NameSpace { get { return null; } }

        /// <summary>
        /// Provides the type name of the element
        /// </summary>
        public string TypeName { get { return Type.FullName; } }

        /// <summary>
        /// Provides the mode of the typed element
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode { get { return Generated.acceptor.VariableModeEnumType.aInternal; } }

        /// <summary>
        /// Provides the default value of the typed element
        /// </summary>
        public string Default { get { return this.FullName; } set { } }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
        }
    }
}
