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
            ListExpression = listExpression;
            ListExpression.Enclosing = this;

            IteratorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            IteratorVariable.Enclosing = this;
            IteratorVariable.Name = "X";

            PreviousIteratorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            PreviousIteratorVariable.Enclosing = this;
            PreviousIteratorVariable.Name = "prevX";

            Types.Collection collectionType = listExpression.getExpressionType() as Types.Collection;
            if (collectionType != null)
            {
                IteratorVariable.Type = collectionType.Type;
                PreviousIteratorVariable.Type = collectionType.Type;
            }
        }

        /// <summary>
        /// Prepares the iteration on the context provided
        /// </summary>
        /// <param name="context"></param>
        protected void PrepareIteration(InterpretationContext context)
        {
            context.LocalScope.PushContext();
            context.LocalScope.setVariable(IteratorVariable);
            context.LocalScope.setVariable(PreviousIteratorVariable);

            PreviousIteratorVariable.Value = EFSSystem.EmptyValue;
            IteratorVariable.Value = EFSSystem.EmptyValue;
        }

        /// <summary>
        /// Prepares the next iteration 
        /// </summary>
        protected void NextIteration()
        {
            PreviousIteratorVariable.Value = IteratorVariable.Value;
        }

        /// <summary>
        /// Ends the iteration
        /// </summary>
        /// <param name="context"></param>
        protected void EndIteration(InterpretationContext context)
        {
            context.LocalScope.PopContext();
        }

        /// <summary>
        /// Fills the list of typed element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext context, List<Types.ITypedElement> elements)
        {
            ListExpression.Elements(context, elements);
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            ListExpression.fillLiterals(retVal);
        }

        /// <summary>
        /// Updates the expression by replacing source by target
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public override Expression Update(Values.IValue source, Values.IValue target)
        {
            ListExpression = ListExpression.Update(source, target);

            return this;
        }

        /// <summary>
        /// The elements declared by this declarator
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = new Dictionary<string, List<Utils.INamable>>();

                Utils.ISubDeclaratorUtils.AppendNamable(retVal, IteratorVariable);

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
            if (IteratorVariable.Name.CompareTo(name) == 0)
            {
                retVal.Add(IteratorVariable);
            }
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression(InterpretationContext context)
        {
            Types.Type listExpressionType = ListExpression.getExpressionType(context);
            if (!(listExpressionType is Types.Collection))
            {
                AddError("List expression " + ListExpression.ToString() + " should hold a collection");
            }

            base.getExpressionType(context);
        }

    }
}
