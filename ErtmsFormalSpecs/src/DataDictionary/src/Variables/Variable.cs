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

namespace DataDictionary.Variables
{
    public class Variable : Generated.Variable, IVariable, Utils.ISubDeclarator, TextualExplain
    {
        /// <summary>
        /// Indicates that the DeclaredElement dictionary is currently being built
        /// </summary>
        private bool BuildingDeclaredElements = false;

        /// <summary>
        /// The elements declared by this variable
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = new Dictionary<string, List<Utils.INamable>>();

                if (!BuildingDeclaredElements)
                {
                    try
                    {
                        BuildingDeclaredElements = true;

                        Values.StructureValue structureValue = Value as Values.StructureValue;
                        if (structureValue != null)
                        {
                            retVal = structureValue.DeclaredElements;
                        }
                    }
                    finally
                    {
                        BuildingDeclaredElements = false;
                    }
                }

                return retVal;
            }
        }



        /// <summary>

        /// Indicates if this Procedure contains implemented sub-elements

        /// </summary>

        public override bool ImplementationPartiallyCompleted
        {

            get
            {

                if (getImplemented())
                {

                    return true;

                }

                foreach (DataDictionary.Variables.Variable subVariable in allSubVariables())
                {

                    if (subVariable.ImplementationPartiallyCompleted)
                    {

                        return true;

                    }

                }

                return false;

            }

        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            if (!BuildingDeclaredElements)
            {
                try
                {
                    BuildingDeclaredElements = true;

                    Values.StructureValue structureValue = Value as Values.StructureValue;
                    if (structureValue != null)
                    {
                        structureValue.find(name, retVal);
                    }

                    // Dereference of an empty value holds the empty value
                    Values.EmptyValue emptyValue = Value as Values.EmptyValue;
                    if (emptyValue != null)
                    {
                        retVal.Add(emptyValue);
                    }
                }
                finally
                {
                    BuildingDeclaredElements = false;
                }
            }
        }

        /// <summary>
        /// The enclosing name space
        /// </summary>
        public Types.NameSpace NameSpace
        {
            get { return EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// Provides the mode of the variable
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode
        {
            get { return getVariableMode(); }
            set { setVariableMode(value); }
        }

        /// <summary>
        /// The default value
        /// </summary>
        public string Default
        {
            get { return getDefaultValue(); }
            set { setDefaultValue(value); }
        }

        /// <summary>
        /// The editable default value
        /// </summary>
        public override string ExpressionText
        {
            get
            {
                string retVal = getDefaultValue();
                if (retVal == null)
                {
                    retVal = "";
                }
                return retVal;
            }
            set { setDefaultValue(value); }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                return NameSpace.Variables;
            }
        }

        /// <summary>
        /// Provides the type name of the variable
        /// </summary>
        public string TypeName
        {
            get { return getTypeName(); }
        }

        /// <summary>
        /// The type associated to this variable
        /// </summary>
        private Types.Type type;
        public Types.Type Type
        {
            get
            {
                if (type == null)
                {
                    type = EFSSystem.findType(NameSpace, getTypeName());
                }
                return type;
            }
            set
            {
                type = value;
                if (value != null)
                {
                    setTypeName(value.FullName);
                }
                else
                {
                    setTypeName(null);
                }
            }
        }

        /// <summary>
        /// The enclosed variables
        /// </summary>
        public Dictionary<string, IVariable> SubVariables
        {
            get
            {
                Values.StructureValue structureValue = Value as Values.StructureValue;
                if (structureValue != null)
                {
                    return structureValue.SubVariables;
                }
                else
                {
                    return new Dictionary<string, IVariable>();
                }
            }
        }

        /// <summary>
        /// The enclosed procedures
        /// </summary>
        public Dictionary<string, IProcedure> SubProcedures
        {
            get
            {
                Values.StructureValue structureValue = Value as Values.StructureValue;
                if (structureValue != null)
                {
                    return structureValue.Procedures;
                }
                else
                {
                    return new Dictionary<string, IProcedure>();
                }
            }
        }

        /// <summary>
        /// Provides the variable's default value
        /// </summary>
        public Values.IValue DefaultValue
        {
            get
            {
                Values.IValue retVal = null;

                if (Type != null)
                {
                    if (Utils.Utils.isEmpty(getDefaultValue()))
                    {
                        retVal = Type.DefaultValue;
                    }
                    else
                    {
                        retVal = Type.getValue(getDefaultValue());

                        if (retVal == null)
                        {
                            Interpreter.Expression expression = EFSSystem.Parser.Expression(this, getDefaultValue());
                            if (expression != null)
                            {
                                retVal = expression.GetValue(new Interpreter.InterpretationContext(this));
                                if (retVal != null && !Type.Match(retVal.Type))
                                {
                                    AddError("Default value type does not match variable type");
                                    retVal = null;
                                }
                            }
                        }
                    }
                }
                else
                {
                    AddError("Cannot find type of variable");
                }

                if (retVal == null)
                {
                    AddError("Cannot create default value");
                }
                else
                {
                    retVal = retVal.RightSide(this, false);
                }

                return retVal;
            }
        }

        /// <summary>
        /// The variable's value
        /// </summary>
        public Values.IValue theValue;
        public Values.IValue Value
        {
            get
            {
                if (theValue == null)
                {
                    theValue = DefaultValue;
                }
                return theValue;
            }
            set { theValue = value; }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            base.AddModelElement(element);
        }

        /// <summary>
        /// Explains the current item
        /// </summary>
        /// <param name="subElements"></param>
        /// <returns></returns>
        public string getExplain(bool subElements)
        {
            string retVal = "";

            if (Type != null)
            {
                if (!Utils.Utils.isEmpty(Type.Comment))
                {
                    retVal = retVal + Type.Comment + "\n";
                }
            }

            if (!Utils.Utils.isEmpty(Comment))
            {
                retVal = retVal + Comment;
            }

            return TextualExplainUtilities.Encapsule(retVal);
        }

        public override string ToString()
        {
            string retVal = "Variable " + Name;
            if (Value != null)
            {
                retVal += " = " + Value.ToString();
            }
            else
            {
                retVal += " is null";
            }

            return retVal;
        }
    }
}
