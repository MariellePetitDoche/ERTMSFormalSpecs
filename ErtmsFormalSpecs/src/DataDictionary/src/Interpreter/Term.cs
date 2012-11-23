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
using Utils;

namespace DataDictionary.Interpreter
{
    public class Term : InterpreterTreeNode, IReference
    {
        /// <summary>
        /// The designator of this term
        /// </summary>
        public Designator Designator { get; private set; }

        /// <summary>
        /// The literal value of this designator
        /// </summary>
        public Expression LiteralValue { get; private set; }

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
        public Term(ModelElement root, Expression literal)
            : base(root)
        {
            LiteralValue = literal;
        }

        /// <summary>
        /// Sets the element referenced by this Deref expression
        /// </summary>
        /// <param name="reference"></param>
        /// <returns></returns>
        public bool setReference(Utils.INamable reference)
        {
            bool retVal = false;

            Variables.IVariable variable = reference as Variables.IVariable;
            if (variable == null)
            {
                // We do not want to hard code reference to variables since they can belong to a structure, 
                // or be variables available on the stack.
                Ref = reference;
                retVal = true;
            }

            return retVal;
        }

        /// <summary>
        /// The model element referenced by this designator.
        /// This value can be null. In that case, reference should be done by dereferencing each argument of the Deref expression
        /// </summary>
        public INamable Ref { get; private set; }

        /// <summary>
        /// Indicates whether the semantic analysis has been performed
        /// </summary>
        protected bool SemanticAnalysisDone { get; private set; }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="context"></param>
        /// <paraparam name="type">Indicates whether we are looking for a type or a value</paraparam>
        public bool SemanticAnalysis(InterpretationContext context, bool type)
        {
            bool retVal = !SemanticAnalysisDone;

            if (!SemanticAnalysisDone)
            {
                SemanticAnalysisDone = true;
                if (Designator != null)
                {
                    Designator.SemanticAnalysis(context, type);
                }
                else if (LiteralValue != null)
                {
                    LiteralValue.SemanticAnalysis(context, type);
                }
            }

            return retVal;
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
                retVal = Designator.getReferences(context, false);
            }
            else if (LiteralValue != null)
            {
                retVal = new ReturnValue(this);
                retVal.Add(LiteralValue.GetValue(context));
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Term
        /// </summary>
        /// <param name="instance">The instance on which the value must be computed</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public INamable GetValue(InterpretationContext context)
        {
            INamable retVal = null;

            SemanticAnalysis(context, false);
            if (Designator != null)
            {
                retVal = Designator.GetValue(context, null);
            }
            else if (LiteralValue != null)
            {
                retVal = LiteralValue.GetValue(context);
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
                foreach (ReturnValueElement elem in Designator.getReferences(context, true).Values)
                {
                    Types.ITypedElement element = elem.Value as Types.ITypedElement;
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
                retVal = LiteralValue.ToString();
            }

            return retVal;
        }

        public void Update(Values.IValue source, Values.IValue target)
        {
            if (LiteralValue != null)
            {
                LiteralValue.Update(source, target);
            }
        }
    }
}
