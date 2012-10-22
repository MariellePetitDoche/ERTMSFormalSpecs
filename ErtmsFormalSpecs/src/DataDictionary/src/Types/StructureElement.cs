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

namespace DataDictionary.Types
{
    public class StructureElement : Generated.StructureElement, ITypedElement, Utils.ISubDeclarator
    {
        public NameSpace NameSpace
        {
            get { return EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// Provides the mode of the structure element
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode
        {
            get { return getMode(); }

            set { setMode(value); }
        }

        /// <summary>
        /// Provides all the values that can be stored in this structure
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = new Dictionary<string, List<Utils.INamable>>();

                if (Type is Structure)
                {
                    Structure structure = Type as Structure;
                    retVal = structure.DeclaredElements;
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
            if (Type is Structure)
            {
                Structure structure = Type as Structure;
                structure.find(name, retVal);
            }
        }

        /// <summary>
        /// Provides the type name of the structure element
        /// </summary>
        public string TypeName
        {
            get { return getTypeName(); }
            set { setTypeName(value); }
        }

        /// <summary>
        /// The type associated to this structure element
        /// </summary>
        public Type Type
        {
            get { return EFSSystem.findType(NameSpace, getTypeName()); }
            set
            {
                if (value != null)
                {
                    setTypeName(value.getName());
                }
                else
                {
                    setTypeName(null);
                }
            }
        }

        /// <summary>
        /// The enclosing structure
        /// </summary>
        public Structure Structure
        {
            get { return (Structure)getFather(); }
        }

        /// <summary>
        /// The enclosing collection
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return Structure.Elements; }
        }

        /// <summary>
        /// The default value
        /// </summary>
        public string Default
        {
            get { return getDefault(); }
            set { setDefault(value); }
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
                    if (Utils.Utils.isEmpty(Default))
                    {
                        retVal = Type.DefaultValue;
                    }
                    else
                    {
                        retVal = Type.getValue(Default);

                        if (retVal == null)
                        {
                            Interpreter.Parser parser = new Interpreter.Parser(EFSSystem);
                            Interpreter.Expression expression = parser.Expression(this, Default);
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

                return retVal;
            }
        }

        public override string ExpressionText
        {
            get
            {
                string retVal = getDefault();
                if (retVal == null)
                {
                    retVal = "";
                }
                return retVal;
            }
            set
            {
                setDefault(value);
            }
        }
        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            base.AddModelElement(element);
        }
    }
}
