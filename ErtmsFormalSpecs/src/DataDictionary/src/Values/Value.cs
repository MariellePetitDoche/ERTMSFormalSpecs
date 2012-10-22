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

namespace DataDictionary.Values
{
    public interface IValue : Utils.INamable, Types.ITypedElement
    {
        /// <summary>
        /// Provides the EFS system in which this value is created
        /// </summary>
        EFSSystem EFSSystem { get; }

        /// <summary>
        /// The complete name to access the value
        /// </summary>
        string LiteralName { get; }

        /// <summary>
        /// Creates a valid right side IValue, according to the target variable (left side)
        /// </summary>
        /// <param name="variable">The target variable</param>
        /// <param name="duplicate">Indicates that a duplication of the variable should be performed</param>
        /// <returns></returns>
        IValue RightSide(Variables.IVariable variable, bool duplicate);
    }

    public abstract class Value : IValue
    {
        public virtual string Name
        {
            get { return "<unnamed value>"; }
            set { }
        }

        public virtual string FullName
        {
            get { return Name; }
        }

        public virtual string LiteralName
        {
            get { return Name; }
        }

        /// <summary>
        /// Provides the EFS system in which this value is created
        /// </summary>
        public EFSSystem EFSSystem
        {
            get
            {
                if (Type != null)
                {
                    return Type.EFSSystem;
                }
                return null;
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        public Value(Types.Type type)
        {
            Type = type;
        }

        /// <summary>
        /// Creates a valid right side IValue, according to the target variable (left side)
        /// </summary>
        /// <param name="variable">The target variable</param>
        /// <param name="duplicate">Indicates that a duplication of the variable should be performed</param>
        /// <returns></returns>
        public virtual Values.IValue RightSide(Variables.IVariable variable, bool duplicate)
        {
            this.Enclosing = variable;
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
        /// The type of the element
        /// </summary>
        public Types.Type Type { get; set; }

        /// <summary>
        /// Provides the mode of the typed element
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode { get { return Generated.acceptor.VariableModeEnumType.aInternal; } }

        /// <summary>
        /// Provides the default value of the typed element
        /// </summary>
        public string Default { get { return this.FullName; } set { } }

        /// <summary>
        /// The enclosing model element
        /// </summary>
        public object Enclosing { get; set; }

        /// <summary>
        /// Compares two values
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public int CompareTo(Utils.IModelElement other)
        {
            if (this == other)
            {
                return 0;
            }
            return -1;
        }

        /// <summary>
        /// Nothing to do
        /// </summary>
        public void Delete() { }

        /// <summary>
        /// The enclosing collection
        /// </summary>
        public System.Collections.ArrayList EnclosingCollection { get { return null; } }

        /// <summary>
        /// The expression text data of this model element
        /// </summary>
        /// <param name="text"></param>
        public string ExpressionText { get { return null; } set { } }

        /// <summary>
        /// The messages logged on the model element
        /// </summary>
        public List<Utils.ElementLog> Messages { get { return null; } }

        /// <summary>
        /// Indicates that at least one message of type levelEnum is attached to the element
        /// </summary>
        /// <param name="levelEnum"></param>
        /// <returns></returns>
        public bool HasMessage(Utils.ElementLog.LevelEnum levelEnum) { return false; }

        /// <summary>
        /// The sub elements of this model element
        /// </summary>
        public System.Collections.ArrayList SubElements { get { return null; } }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public void AddModelElement(Utils.IModelElement element) { }

    }

    public abstract class BaseValue<CorrespondingType, StorageType> : Value
        where CorrespondingType : Types.Type
    {
        /// <summary>
        /// The actual value of this value
        /// </summary>
        private StorageType val;
        public StorageType Val
        {
            get { return val; }
            set { val = value; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="type"></param>
        /// <param name="val"></param>
        public BaseValue(CorrespondingType type, StorageType val)
            : base(type)
        {
            Val = val;
        }

        /// <summary>
        /// The enclosing value, if exists
        /// </summary>
        public Value EnclosingValue
        {
            get
            {
                return Utils.EnclosingFinder<Value>.find(this);
            }
        }
    }
}
