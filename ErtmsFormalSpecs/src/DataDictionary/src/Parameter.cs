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
using System.Collections.Generic;

namespace DataDictionary
{
    public class Parameter : Generated.Parameter, Variables.IVariable
    {
        /// <summary>
        /// Parameter namespace
        /// </summary>
        public DataDictionary.Types.NameSpace NameSpace
        {
            get { return DataDictionary.EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// Parameter type name
        /// </summary>
        public string TypeName
        {
            get
            {
                return getTypeName();
            }
            set
            {
                type = null;
                setTypeName(value);
            }
        }

        /// <summary>
        /// Parameter type
        /// </summary>
        private Types.Type type;
        public Types.Type Type
        {
            get
            {
                if (type == null)
                {
                    type = EFSSystem.findType(NameSpace, TypeName);
                }
                return type;
            }
            set
            {
                TypeName = value.Name;
                type = value;
            }
        }

        /// <summary>
        /// The enclosing collection of the parameter
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                if (this.Enclosing is DataDictionary.Functions.Function)
                {
                    return Utils.EnclosingFinder<Functions.Function>.find(this).FormalParameters;
                }
                else if (this.Enclosing is DataDictionary.Variables.Procedure)
                {
                    return Utils.EnclosingFinder<Variables.Procedure>.find(this).FormalParameters;
                }
                else
                {
                    return Utils.EnclosingFinder<Types.StructureProcedure>.find(this).FormalParameters;
                }
            }
        }

        /// <summary>
        /// The parameter value
        /// </summary>
        public Values.IValue theValue;
        public Values.IValue Value
        {
            get { return theValue; }
            set { theValue = value; }
        }

        /// <summary>
        /// The default value name
        /// </summary>
        public string Default
        {
            get { return null; }
            set { }
        }

        /// <summary>
        /// Provides the parameters's default value
        /// </summary>
        public Values.IValue DefaultValue
        {
            get { return null; }
        }

        /// <summary>
        /// Provides the mode of the parameter
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode
        {
            get { return DataDictionary.Generated.acceptor.VariableModeEnumType.aInternal; }
            set { }
        }

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

                        if (Value != null)
                        {
                            if (Value is Values.StructureValue)
                            {
                                Values.StructureValue structureValue = Value as Values.StructureValue;

                                foreach (Utils.INamable namable in structureValue.Val.Values)
                                {
                                    Utils.ISubDeclaratorUtils.AppendNamable(retVal, namable);
                                }
                            }
                        }
                        else
                        {
                            Types.Structure structure = Type as Types.Structure;
                            if (structure != null)
                            {
                                retVal = structure.DeclaredElements;
                            }
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

                    if (Value != null)
                    {
                        if (Value is Values.StructureValue)
                        {
                            Values.StructureValue structureValue = Value as Values.StructureValue;

                            foreach (Utils.INamable item in structureValue.Val.Values)
                            {
                                if (item.Name.CompareTo(name) == 0)
                                {
                                    retVal.Add(item);
                                    break;
                                }
                            }
                        }
                    }
                    else
                    {
                        Types.Structure structure = Type as Types.Structure;
                        if (structure != null)
                        {
                            structure.find(name, retVal);
                        }
                    }
                }
                finally
                {
                    BuildingDeclaredElements = false;
                }
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
        }

        public override string ToString()
        {
            string retVal = "Parameter " + Name;
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
