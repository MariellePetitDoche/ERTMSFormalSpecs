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

namespace DataDictionary.Interpreter
{
    public class Term : InterpreterTreeNode
    {
        /// <summary>
        /// The designator of this term
        /// </summary>
        public Designator Designator { get; private set; }

        /// <summary>
        /// The literal value of this designator
        /// </summary>
        public Values.IValue LiteralValue { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this model is built</param>
        /// <param name="designator"></parparam>
        public Term(ModelElement root, Designator designator)
            : base(root)
        {
            Designator = designator;
            Designator.Enclosing = this;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this model is built</param>
        /// <param name="literal"></param>
        public Term(ModelElement root, Values.IValue literal)
            : base(root)
        {
            LiteralValue = literal;
        }

        /// <summary>
        /// Provides the typed element associated to this Term
        /// </summary>
        /// <param name="instance">The instance on which the value must be computed</param>
        /// <returns></returns>
        public ReturnValue GetTypedElement(InterpretationContext context)
        {
            ReturnValue retVal = null;

            if (Designator != null)
            {
                retVal = Designator.getReferences(context, true);
            }
            else if (LiteralValue != null)
            {
                retVal = new ReturnValue();
                retVal.Add(LiteralValue);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Term
        /// </summary>
        /// <param name="instance">The instance on which the value must be computed</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public ReturnValue GetValue(InterpretationContext context)
        {
            ReturnValue retVal = null;

            if (Designator != null)
            {
                retVal = Designator.getReferences(context, false);
            }
            else if (LiteralValue != null)
            {
                retVal = new ReturnValue();
                retVal.Add(LiteralValue);
            }

            return retVal;
        }

        /// <summary>
        /// Fills the elements with the elements used by this term
        /// </summary>
        /// <param name="elements"></param>
        public void TypedElements(InterpretationContext context, List<Types.ITypedElement> elements)
        {
            if (Designator != null)
            {
                foreach (Utils.INamable namable in Designator.getReferences(context, true).Values)
                {
                    Types.ITypedElement element = namable as Types.ITypedElement;
                    if (element != null)
                    {
                        elements.Add(element);
                    }
                }
            }
        }

        public override string ToString()
        {
            string retVal = null;

            if (Designator != null)
            {
                retVal = Designator.ToString();
            }
            else if (LiteralValue != null)
            {
                retVal = LiteralValue.LiteralName;
            }

            return retVal;
        }

        public void Update(Values.IValue source, Values.IValue target)
        {
            if (LiteralValue == source)
            {
                LiteralValue = target;
            }
        }
    }
}
