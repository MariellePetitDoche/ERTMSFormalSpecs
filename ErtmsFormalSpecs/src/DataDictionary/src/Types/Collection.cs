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

namespace DataDictionary.Types
{
    public class Collection : Generated.Collection, TextualExplain
    {
        public override string ExpressionText
        {
            get
            {
                string retVal = Default;
                if (retVal == null)
                {
                    retVal = "";
                }
                return retVal;
            }
            set
            {
                Default = value;
            }
        }

        /// <summary>
        /// The type associated to this structure element
        /// </summary>
        private Type type;
        public virtual Type Type
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
                if (value != null)
                {
                    setTypeName(value.getName());
                }
                else
                {
                    setTypeName(null);
                }
                type = value;
            }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return NameSpace.Collections; }
        }

        /// <summary>
        /// Compares two lists for equality
        /// </summary>
        /// <param name="first"></param>
        /// <param name="other"></param>
        /// <returns></returns>
        public override bool CompareForEquality(Values.IValue first, Values.IValue other)
        {
            bool retVal = false;

            Values.ListValue list1 = first as Values.ListValue;
            Values.ListValue list2 = other as Values.ListValue;
            if (list1 != null && list2 != null)
            {
                if (list1.ElementCount == list2.ElementCount)
                {
                    retVal = true;
                    foreach (Values.IValue val1 in list1.Val)
                    {
                        if (!(val1 is Values.EmptyValue))
                        {
                            bool found = false;

                            foreach (Values.IValue val2 in list2.Val)
                            {
                                if (val1.Type.CompareForEquality(val1, val2))
                                {
                                    found = true;
                                    break;
                                }
                            }

                            if (!found)
                            {
                                retVal = false;
                                break;
                            }
                        }
                    }
                }
            }

            return retVal;
        }

        public override bool Contains(Values.IValue first, Values.IValue other)
        {
            bool retVal = false;

            Values.ListValue listValue = first as Values.ListValue;
            if (listValue != null)
            {
                foreach (Values.IValue value in listValue.Val)
                {
                    StateMachine stateMachine = value.Type as StateMachine;
                    if (stateMachine != null)
                    {
                        if (stateMachine.Contains(value, other))
                        {
                            retVal = true;
                            break;
                        }
                    }
                    else
                    {
                        if (value.Type.CompareForEquality(value, other))
                        {
                            retVal = true;
                            break;
                        }
                    }
                }
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

            Interpreter.Parser parser = new Interpreter.Parser(EFSSystem);
            Interpreter.Expression expression = parser.Expression(this, image);
            if (expression != null)
            {
                retVal = expression.GetValue(new Interpreter.InterpretationContext(this));
            }

            return retVal;
        }

        /// <summary>
        /// Indicates that this collection matches the other collections
        /// </summary>
        /// <param name="otherType"></param>
        /// <returns></returns>
        public override bool Match(Type otherType)
        {
            bool retVal = base.Match(otherType);

            if (!retVal && otherType is Collection)
            {
                Collection otherCollection = (Collection)otherType;

                if (Type != null)
                {
                    if (otherCollection.Type != null)
                    {
                        retVal = Type.Match(otherCollection.Type);
                    }
                    else
                    {
                        // null type for a collection means "any type"
                        retVal = true;
                    }
                }
                else
                {
                    // null type for a collection means "any type"
                    retVal = true;
                }
            }

            return retVal;
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
        /// Provides an explanation of the collection
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel)
        {
            string retVal = "";

            retVal = TextualExplainUtilities.Pad("{" + Name + " : COLLECTION OF " + getTypeName() + "}", indentLevel);

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the collection
        /// </summary>
        /// <param name="explainSubElements">Precises if we need to explain the sub elements (if any)</param>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0);

            return TextualExplainUtilities.Encapsule(retVal);
        }
    }

    /// <summary>
    /// A generic collection
    /// </summary>
    public class GenericCollection : Collection
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        public GenericCollection(EFSSystem efsSystem)
        {
            Enclosing = efsSystem;
        }

        /// <summary>
        /// The type of the elements in this collection
        /// </summary>
        public override Type Type
        {
            get { return EFSSystem.AnyType; }
        }
    }
}
