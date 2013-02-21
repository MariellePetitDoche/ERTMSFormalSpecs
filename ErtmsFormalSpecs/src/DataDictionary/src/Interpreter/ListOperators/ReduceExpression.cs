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

namespace DataDictionary.Interpreter.ListOperators
{
    public class ReduceExpression : ExpressionBasedListExpression
    {
        /// <summary>
        /// The operator for this expression
        /// </summary>
        public static string OPERATOR = "REDUCE";

        /// <summary>
        /// The reduce initial value
        /// </summary>
        public Expression InitialValue { get; private set; }

        /// <summary>
        /// The accumulator variable
        /// </summary>
        public Variables.Variable AccumulatorVariable { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="listExpression"></param>
        /// <param name="condition"></param>
        /// <param name="function"></param>
        /// <param name="initialValue"></param>
        /// <param name="root">the root element for which this expression should be parsed</param>
        public ReduceExpression(ModelElement root, Expression listExpression, Expression condition, Expression function, Expression initialValue)
            : base(root, listExpression, condition, function)
        {
            InitialValue = initialValue;
            InitialValue.Enclosing = this;

            AccumulatorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            AccumulatorVariable.Enclosing = this;
            AccumulatorVariable.Name = "RESULT";
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
                InitialValue.SemanticAnalysis(instance, Filter.AllMatches);

                AccumulatorVariable.Type = InitialValue.GetExpressionType();
            }

            return retVal;
        }

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public override Types.Type GetExpressionType()
        {
            return IteratorExpression.GetExpressionType();
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public override Values.IValue GetValue(InterpretationContext context)
        {
            Values.IValue retVal = null;

            Values.ListValue value = ListExpression.GetValue(context) as Values.ListValue;
            if (value != null)
            {
                PrepareIteration(context);
                context.LocalScope.setVariable(AccumulatorVariable);
                AccumulatorVariable.Value = InitialValue.GetValue(context);

                foreach (Values.IValue v in value.Val)
                {
                    if (v != EFSSystem.EmptyValue)
                    {
                        IteratorVariable.Value = v;
                        if (conditionSatisfied(context))
                        {
                            AccumulatorVariable.Value = IteratorExpression.GetValue(context);
                        }
                    }
                    NextIteration();
                }
                EndIteration(context);
                retVal = AccumulatorVariable.Value;
            }
            else
            {
                AddError("Cannot evaluate list value " + ListExpression.ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Provides the callable that is called by this expression
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public override ICallable getCalled(InterpretationContext context)
        {
            ICallable retVal = null;

            Functions.Graph graph = createGraph(context);
            if (graph != null)
            {
                retVal = graph.Function;
            }

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

            retVal = retVal + " USING " + IteratorExpression.ToString() + " INITIAL_VALUE " + InitialValue.ToString();

            return retVal;
        }

        /// <summary>
        /// Prepares the iteration on the context provided
        /// </summary>
        /// <param name="context"></param>
        protected override void PrepareIteration(InterpretationContext context)
        {
            base.PrepareIteration(context);
            context.LocalScope.setVariable(AccumulatorVariable);
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression()
        {
            base.checkExpression();

            Types.Type initialValueType = InitialValue.GetExpressionType();
            if (initialValueType != null)
            {
                Types.Collection listExpressionType = ListExpression.GetExpressionType() as Types.Collection;
                if (listExpressionType != null)
                {
                    IteratorExpression.checkExpression();
                }
            }
            else
            {
                AddError("Cannot determine initial value expression type for " + ToString());
            }
        }

        /// <summary>
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public override Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter)
        {
            Functions.Graph retVal = null;

            Values.IValue value = GetValue(context);

            Functions.Function function = value as Functions.Function;
            if (function != null)
            {
                retVal = function.Graph;
            }
            else
            {
                retVal = Functions.Graph.createGraph(Functions.Function.getDoubleValue(value));
            }

            return retVal;
        }


        /// <summary>
        /// Creates the graph associated to this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(InterpretationContext context)
        {
            Functions.Graph retVal = null;

            Functions.Graph graph = InitialValue.createGraph(context);
            if (graph != null)
            {
                Values.ListValue value = ListExpression.GetValue(context) as Values.ListValue;
                if (value != null)
                {
                    PrepareIteration(context);
                    AccumulatorVariable.Value = graph.Function;

                    foreach (Values.IValue v in value.Val)
                    {
                        if (v != EFSSystem.EmptyValue)
                        {
                            IteratorVariable.Value = v;
                            if (conditionSatisfied(context))
                            {
                                AccumulatorVariable.Value = IteratorExpression.GetValue(context);
                            }
                        }
                        NextIteration();
                    }
                    Functions.Function function = AccumulatorVariable.Value as Functions.Function;
                    if (function != null)
                    {
                        retVal = function.Graph;
                    }
                    else
                    {
                        throw new Exception("Expression does not reduces to a function");
                    }
                    EndIteration(context);
                }
            }
            else
            {
                throw new Exception("Cannot create graph for initial value " + InitialValue.ToString());
            }

            return retVal;
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
