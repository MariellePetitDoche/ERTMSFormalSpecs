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

namespace DataDictionary.Interpreter.ListOperators
{
    public abstract class ExpressionBasedListExpression : ConditionBasedListExpression
    {
        /// <summary>
        /// The function used for MAP & REDUCE
        /// </summary>
        public Expression IteratorExpression { get; private set; }

        /// <summary>
        /// Constructor for MAP, REDUCE
        /// </summary>
        /// <param name="listExpression"></param>
        /// <param name="condition">the condition to apply to list elements</param>
        /// <param name="iteratorExpression">the expression to be evaluated on each element of the list</param>
        /// <param name="enclosing">the root element for which this expression should be parsed</param>
        public ExpressionBasedListExpression(ModelElement root, Expression listExpression, Expression condition, Expression iteratorExpression)
            : base(root, listExpression, condition)
        {
            IteratorExpression = iteratorExpression;
            IteratorExpression.Enclosing = this;
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="context"></param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(InterpretationContext context, AcceptableChoice expectation)
        {
            bool retVal = base.SemanticAnalysis(context, expectation);

            if (retVal)
            {
                PrepareIteration(context);
                IteratorExpression.SemanticAnalysis(context, AllMatches);
                EndIteration(context);
            }

            return retVal;
        }
    }
}
