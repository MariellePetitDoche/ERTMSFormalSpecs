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

namespace DataDictionary.Interpreter.ListOperators
{
    public abstract class ListOperatorExpression : Expression, Utils.ISubDeclarator
    {
        /// <summary>
        /// List operators
        /// </summary>
        public static string[] LIST_OPERATORS = 
        { 
            ThereIsExpression.OPERATOR,
            ForAllExpression.OPERATOR, 
            FirstExpression.OPERATOR, 
            LastExpression.OPERATOR,
            CountExpression.OPERATOR,
            ReduceExpression.OPERATOR, 
            SumExpression.OPERATOR,
            MapExpression.OPERATOR
        };

        /// <summary>
        /// The expression which evaluates to a list
        /// </summary>
        public Expression ListExpression { get; private set; }

        /// <summary>
        /// The iterator variable
        /// </summary>
        public Variables.Variable IteratorVariable { get; private set; }

        /// <summary>
        /// The iterator variable during the previous iteration
        /// </summary>
        public Variables.Variable PreviousIteratorVariable { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="listExpression"></param>
        /// <param name="function"></param>
        /// <param name="root">the root element for which this expression should be parsed</param>
        public ListOperatorExpression(ModelElement root, Expression listExpression)
            : base(root)
        {
            DeclaredElements = new Dictionary<string, List<Utils.INamable>>();

            ListExpression = listExpression;
            ListExpression.Enclosing = this;

            IteratorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            IteratorVariable.Enclosing = this;
            IteratorVariable.Name = "X";
            Utils.ISubDeclaratorUtils.AppendNamable(DeclaredElements, IteratorVariable);

            PreviousIteratorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            PreviousIteratorVariable.Enclosing = this;
            PreviousIteratorVariable.Name = "prevX";
            Utils.ISubDeclaratorUtils.AppendNamable(DeclaredElements, PreviousIteratorVariable);
        }

        /// <summary>
        /// The elements declared by this declarator
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements { get; private set; }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            Utils.ISubDeclaratorUtils.Find(DeclaredElements, name, retVal);
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(Utils.INamable instance, Filter.AcceptableChoice expectation)
        {
            bool retVal = base.SemanticAnalysis(instance, expectation);

            if (retVal)
            {
                ListExpression.SemanticAnalysis(instance, Filter.IsRightSide);

                Types.Collection collectionType = ListExpression.GetExpressionType() as Types.Collection;
                if (collectionType != null)
                {
                    IteratorVariable.Type = collectionType.Type;
                    PreviousIteratorVariable.Type = collectionType.Type;
                }
                else
                {
                    AddError("Cannot determine collection type on list expression " + ToString());
                }
            }

            return retVal;
        }

        /// <summary>
        /// Prepares the iteration on the context provided
        /// </summary>
        /// <param name="context"></param>
        /// <returns>the token required to EndIteration</returns>
        protected virtual int PrepareIteration(InterpretationContext context)
        {
            int retVal = context.LocalScope.PushContext();
            context.LocalScope.setVariable(IteratorVariable);
            context.LocalScope.setVariable(PreviousIteratorVariable);

            PreviousIteratorVariable.Value = EFSSystem.EmptyValue;
            IteratorVariable.Value = EFSSystem.EmptyValue;

            return retVal;
        }

        /// <summary>
        /// Prepares the next iteration 
        /// </summary>
        protected virtual void NextIteration()
        {
            PreviousIteratorVariable.Value = IteratorVariable.Value;
        }

        /// <summary>
        /// Ends the iteration
        /// </summary>
        /// <param name="context"></param>
        protected virtual void EndIteration(InterpretationContext context, int token)
        {
            context.LocalScope.PopContext(token);
        }

        /// <summary>
        /// Fills the list provided with the element matching the filter provided
        /// </summary>
        /// <param name="retVal">The list to be filled with the element matching the condition expressed in the filter</param>
        /// <param name="filter">The filter to apply</param>
        public override void fill(List<Utils.INamable> retVal, Filter.AcceptableChoice filter)
        {
            ListExpression.fill(retVal, filter);
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression()
        {
            base.checkExpression();

            Types.Type listExpressionType = ListExpression.GetExpressionType();
            if (!(listExpressionType is Types.Collection))
            {
                AddError("List expression " + ListExpression.ToString() + " should hold a collection");
            }
        }

    }
}
