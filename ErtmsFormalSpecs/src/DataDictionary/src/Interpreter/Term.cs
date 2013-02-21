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
        /// Provides the possible references for this term (only available during semantic analysis)
        /// </summary>
        /// <param name="instance">the instance on which this element should be found.</param>
        /// <param name="expectation">the expectation on the element found</param>
        /// <returns></returns>
        public ReturnValue getReferences(Utils.INamable instance, Expression.AcceptableChoice expectation)
        {
            ReturnValue retVal = null;

            if (Designator != null)
            {
                retVal = Designator.getReferences(instance, expectation);
            }
            else if (LiteralValue != null)
            {
                retVal = LiteralValue.getReferences(instance, expectation);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the possible references types for this expression (used in semantic analysis)
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns></returns>
        public ReturnValue getReferenceTypes(Utils.INamable instance, Expression.AcceptableChoice expectation)
        {
            ReturnValue retVal = null;

            if (Designator != null)
            {
                retVal = new ReturnValue();

                foreach (ReturnValueElement element in Designator.getReferences(instance, expectation).Values)
                {
                    if (element.Value is Types.Type)
                    {
                        retVal.Add(element.Value);
                    }
                }
            }
            else if (LiteralValue != null)
            {
                retVal = LiteralValue.getReferenceTypes(instance, expectation);
            }

            return retVal;
        }

        /// <summary>
        /// Performs the semantic analysis of the term
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public void SemanticAnalysis(Utils.INamable instance, Expression.AcceptableChoice expectation)
        {
            if (Designator != null)
            {
                Designator.SemanticAnalysis(instance, expectation);
            }
            else if (LiteralValue != null)
            {
                LiteralValue.SemanticAnalysis(instance, expectation);
            }
        }

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public Types.Type GetExpressionType()
        {
            Types.Type retVal = null;

            if (Designator != null)
            {
                retVal = Designator.GetDesignatorType();
            }
            else if (LiteralValue != null)
            {
                retVal = LiteralValue.GetExpressionType();
            }

            return retVal;
        }

        /// <summary>
        /// Provides the variable referenced by this expression, if any
        /// </summary>
        /// <param name="context">The context on which the variable must be found</param>
        /// <returns></returns>
        public Variables.IVariable GetVariable(InterpretationContext context)
        {
            Variables.IVariable retVal = null;

            if (Designator != null)
            {
                retVal = Designator.GetVariable(context);
            }
            else if (LiteralValue != null)
            {
                retVal = null;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public Values.IValue GetValue(InterpretationContext context)
        {
            Values.IValue retVal = null;

            if (Designator != null)
            {
                retVal = Designator.GetValue(context) as Values.IValue;
            }
            else if (LiteralValue != null)
            {
                retVal = LiteralValue.GetValue(context);
            }

            return retVal;
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

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public void checkExpression()
        {
            if (Designator != null)
            {
                Designator.checkExpression();
            }
            else if (LiteralValue != null)
            {
                LiteralValue.checkExpression();
            }
        }
    }
}
