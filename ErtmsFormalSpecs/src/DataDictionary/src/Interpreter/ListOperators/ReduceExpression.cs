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
            AccumulatorVariable.Type = InitialValue.getExpressionType();
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
        public override ReturnValue InnerGetValue(InterpretationContext context)
        {
            ReturnValue retVal = new ReturnValue();

            InterpretationContext ctxt = new InterpretationContext(context, Root);

            Values.ListValue value = ListExpression.GetValue(ctxt) as Values.ListValue;
            if (value != null)
            {
                PrepareIteration(ctxt);
                ctxt.LocalScope.setVariable(AccumulatorVariable);
                AccumulatorVariable.Value = InitialValue.GetValue(ctxt);

                foreach (Values.IValue v in value.Val)
                {
                    if (v != EFSSystem.EmptyValue)
                    {
                        IteratorVariable.Value = v;
                        if (conditionSatisfied(ctxt))
                        {
                            AccumulatorVariable.Value = IteratorExpression.GetValue(ctxt);
                        }
                    }
                    NextIteration();
                }
                EndIteration(ctxt);
                retVal.Add(AccumulatorVariable.Value);
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
        /// Provides the callable that is called by this expression
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public override ReturnValue getCalled(InterpretationContext context)
        {
            ReturnValue retVal = new ReturnValue();

            Functions.Graph graph = createGraph(context);
            if (graph != null)
            {
                retVal.Add(graph.Function);
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
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression(InterpretationContext context)
        {
            base.checkExpression(context);

            Types.Type initialValueType = InitialValue.getExpressionType(context);
            if (initialValueType != null)
            {
                Types.Collection listExpressionType = ListExpression.getExpressionType(context) as Types.Collection;
                if (listExpressionType != null)
                {
                    PrepareIteration(context);
                    context.LocalScope.setVariable(AccumulatorVariable);
                    IteratorExpression.checkExpression(context);
                    EndIteration(context);
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
                    context.LocalScope.setVariable(AccumulatorVariable);
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
