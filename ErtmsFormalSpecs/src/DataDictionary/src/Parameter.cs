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

namespace DataDictionary
{
    public class Parameter : Generated.Parameter, Types.ITypedElement
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
        /// Creates an actual parameter based on this formal parameter and the value assigned to that parameter
        /// </summary>
        /// <returns></returns>
        public Variables.Actual createActual()
        {
            Variables.Actual retVal = new Variables.Actual();
            retVal.Name = Name;
            retVal.Enclosing = Enclosing;
            retVal.Parameter = this;

            return retVal;
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
        /// The default value
        /// </summary>
        public string Default
        {
            get { return Type.Default; }
            set { }
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

            return retVal;
        }
    }
}
