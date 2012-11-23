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
using System.Collections.Generic;
using Utils;

namespace DataDictionary.Interpreter
{
    class StabilizeExpression : Expression
    {
        /// <summary>
        /// The expression to stabilize
        /// </summary>
        public Expression Expression { get; private set; }

        /// <summary>
        /// The initial value for the stabilisation algorithm
        /// </summary>
        public Expression InitialValue { get; private set; }

        /// <summary>
        /// The condition which indicates that the stabilization is complete
        /// </summary>
        public Expression Condition { get; private set; }

        /// <summary>
        /// The value of the last iteration
        /// </summary>
        private Variables.Variable LastIteration { get; set; }

        /// <summary>
        /// The value of the current iteration
        /// </summary>
        private Variables.Variable CurrentIteration { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root"></param>
        /// <param name="expression">The expression to stabilize</param>
        /// <param name="initialValue">The initial value for this stabilisation computation</param>
        /// <param name="condition">The condition which indicates that the stabilisation is not complete</param>
        public StabilizeExpression(ModelElement root, Expression expression, Expression initialValue, Expression condition)
            : base(root)
        {
            Expression = expression;
            Expression.Enclosing = this;

            InitialValue = initialValue;
            InitialValue.Enclosing = this;

            Condition = condition;
            Condition.Enclosing = this;

            LastIteration = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            LastIteration.Enclosing = this;
            LastIteration.Name = "PREVIOUS";
            LastIteration.Type = InitialValue.getExpressionType();

            CurrentIteration = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            CurrentIteration.Enclosing = this;
            CurrentIteration.Name = "CURRENT";
            CurrentIteration.Type = InitialValue.getExpressionType();
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
                Expression.SemanticAnalysis(context, false);
                InitialValue.SemanticAnalysis(context, false);
                Condition.SemanticAnalysis(context, false);
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
            return InitialValue.InnerGetTypedElement(context);
        }


        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override INamable InnerGetValue(InterpretationContext context)
        {
            INamable retVal = null;

            LastIteration.Value = InitialValue.GetValue(context);

            bool stop;
            do
            {
                context.LocalScope.PushContext();
                context.LocalScope.setVariable(LastIteration);
                CurrentIteration.Value = Expression.GetValue(context);

                context.LocalScope.setVariable(CurrentIteration);
                Values.BoolValue stopCondition = Condition.GetValue(context) as Values.BoolValue;
                if (stopCondition != null)
                {
                    stop = stopCondition.Val;
                }
                else
                {
                    AddError("Cannot evaluate condition " + Condition.ToString());
                    stop = false;
                }
                context.LocalScope.PopContext();
                LastIteration.Value = CurrentIteration.Value;
            } while (!stop);

            retVal = CurrentIteration.Value;

            return retVal;
        }


        /// <summary>
        /// Fills the list of element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext context, List<Types.ITypedElement> elements)
        {
            Expression.Elements(context, elements);
            InitialValue.Elements(context, elements);
            Condition.Elements(context, elements);
        }

        /// <summary>
        /// Provides the string representation of the expression
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            string retVal = "STABILIZE " + Expression.ToString() + " INITIAL_VALUE " + InitialValue.ToString() + " STOP_CONDITION " + Condition.ToString();

            return retVal;
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            Expression.fillLiterals(retVal);
            InitialValue.fillLiterals(retVal);
            Condition.fillLiterals(retVal);
        }


        /// <summary>
        /// Updates the expression text
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public override Expression Update(Values.IValue source, Values.IValue target)
        {
            Expression = Expression.Update(source, target);
            InitialValue = InitialValue.Update(source, target);
            Condition = Condition.Update(source, target);

            return this;
        }


        /// <summary>
        /// Provides the type of the expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override ReturnValue getExpressionTypes(InterpretationContext context)
        {
            ReturnValue retVal = InitialValue.getExpressionTypes(context);

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression(InterpretationContext context)
        {
            InitialValue.checkExpression(context);
            Types.Type initialValueType = InitialValue.getExpressionType(context);
            if (initialValueType != null)
            {
                context.LocalScope.PushContext();
                context.LocalScope.setVariable(LastIteration);
                Expression.checkExpression(context);
                Types.Type expressionType = Expression.getExpressionType(context);
                if (expressionType != null)
                {
                    if (expressionType != initialValueType)
                    {
                        AddError("Expression " + Expression + " has not the same type (" + expressionType.FullName + " than initial value " + InitialValue + " type " + initialValueType.FullName);
                    }
                }
                else
                {
                    AddError("Cannot determine type of expression " + Expression);
                }

                context.LocalScope.setVariable(CurrentIteration);
                Types.Type conditionType = Condition.getExpressionType(context);
                if (conditionType != null)
                {
                    if (!(conditionType is Types.BoolType))
                    {
                        AddError("Condition " + Condition + " does not evaluate to a boolean");
                    }
                }
                else
                {
                    AddError("Cannot determine type of condition " + Condition);
                }
                context.LocalScope.PopContext();
            }
            else
            {
                AddError("Cannot determine type of the initial value " + InitialValue);
            }

            base.checkExpression(context);
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            return Functions.Graph.createGraph(GetValue(context));
        }


        /// <summary>
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public override Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter)
        {
            throw new Exception("Cannot create graph for Stabilize Expression");
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
            throw new Exception("Cannot create surface for Stabilize Expression");
        }
    }
}
