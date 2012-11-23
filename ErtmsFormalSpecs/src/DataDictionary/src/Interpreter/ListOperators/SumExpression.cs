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
using System;
using Utils;

namespace DataDictionary.Interpreter.ListOperators
{
    public class SumExpression : ExpressionBasedListExpression
    {
        /// <summary>
        /// The operator for this expression
        /// </summary>
        public static string OPERATOR = "SUM";

        /// <summary>
        /// The accumulator variable
        /// </summary>
        public Variables.Variable AccumulatorVariable { get; private set; }

        /// <summary>
        /// The accumulator expression
        /// </summary>
        public Expression Accumulator { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="listExpression"></param>
        /// <param name="condition"></param>
        /// <param name="expression"></param>
        /// <param name="root">the root element for which this expression should be parsed</param>
        public SumExpression(ModelElement root, Expression listExpression, Expression condition, Expression expression)
            : base(root, listExpression, condition, expression)
        {

            AccumulatorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            AccumulatorVariable.Enclosing = this;
            AccumulatorVariable.Name = "RESULT";

            InterpretationContext context = new InterpretationContext(root);
            context.LocalScope.setVariable(IteratorVariable);
            AccumulatorVariable.Type = expression.getExpressionType(context);

            Accumulator = new BinaryExpression(root, expression, BinaryExpression.OPERATOR.ADD, new UnaryExpression(root, new Term(root, new Designator(root, "RESULT"))));
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="context"></param>
        /// <paraparam name="type">Indicates whether we are looking for a type or a value</paraparam>
        public override bool SemanticAnalysis(InterpretationContext context, bool type)
        {
            bool retVal = base.SemanticAnalysis(context, type);

            if (retVal)
            {
                PrepareIteration(context);
                Accumulator.SemanticAnalysis(context, false);
                EndIteration(context);
            }

            return retVal;
        }


        /// <summary>
        /// Provides the typed element associated to this Expression 
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="localScope">The local scope used to compute the value of this expression</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override ReturnValue InnerGetTypedElement(InterpretationContext context)
        {
            ReturnValue retVal = getExpressionTypes(context);

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Term
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override INamable InnerGetValue(InterpretationContext context)
        {
            INamable retVal = null;

            Values.ListValue value = ListExpression.GetValue(context) as Values.ListValue;
            if (value != null)
            {
                PrepareIteration(context);
                context.LocalScope.setVariable(AccumulatorVariable);

                Types.Type resultType = getExpressionType(context);
                if (resultType != null)
                {
                    AccumulatorVariable.Value = resultType.getValue("0");

                    foreach (Values.IValue v in value.Val)
                    {
                        if (v != EFSSystem.EmptyValue)
                        {
                            IteratorVariable.Value = v;
                            if (conditionSatisfied(context))
                            {
                                AccumulatorVariable.Value = Accumulator.GetValue(context);
                            }
                        }
                        NextIteration();
                    }
                }

                EndIteration(context);

                retVal = AccumulatorVariable.Value;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the type of the expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override ReturnValue getExpressionTypes(InterpretationContext context)
        {
            ReturnValue retVal = new ReturnValue();

            PrepareIteration(context);
            context.LocalScope.setVariable(AccumulatorVariable);
            retVal.Add(IteratorExpression.getExpressionType(context));
            EndIteration(context);

            return retVal;
        }

        /// <summary>
        /// Provides the expression text
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            string retVal = OPERATOR + " " + ListExpression.ToString();

            if (Condition != null)
            {
                retVal += " | " + Condition.ToString();
            }

            retVal = retVal + " USING " + IteratorExpression.ToString();

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression(InterpretationContext context)
        {
            base.checkExpression(context);

            Types.Collection listExpressionType = ListExpression.getExpressionType(context) as Types.Collection;
            if (listExpressionType != null)
            {
                PrepareIteration(context);
                context.LocalScope.setVariable(AccumulatorVariable);
                IteratorExpression.checkExpression(context);
                EndIteration(context);
            }
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            throw new Exception("Cannot create graph for " + ToString());
        }

        /// <summary>
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public override Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter)
        {
            throw new Exception("Cannot create graph for " + ToString());
        }

        /// <summary>
        /// Provides the surface of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the surface</param>
        /// <param name="xParam">The X axis of this surface</param>
        /// <param name="yParam">The Y axis of this surface</param>
        /// <returns>The surface which corresponds to this expression</returns>
        public override Functions.Surface createSurface(Interpreter.InterpretationContext context, Parameter xParam, Parameter yParam)
        {
            throw new Exception("Cannot create surface for " + ToString());
        }
    }
}
