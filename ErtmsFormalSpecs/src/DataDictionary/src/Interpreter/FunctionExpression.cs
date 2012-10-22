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

namespace DataDictionary.Interpreter
{
    public class FunctionExpression : Expression
    {
        /// <summary>
        /// The parameters for this function expression
        /// </summary>
        public List<Parameter> Parameters { get; private set; }

        /// <summary>
        /// The expression associated to this function
        /// </summary>
        public Expression Expression { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="expression">the functional expression</param>
        /// <param name="parameters">the function parameters</param>
        /// <param name="root"></param>
        public FunctionExpression(ModelElement root, List<Parameter> parameters, Expression expression)
            : base(root)
        {
            Parameters = parameters;
            foreach (Parameter parameter in parameters)
            {
                parameter.Enclosing = this;
            }

            Expression = expression;
            Expression.Enclosing = this;
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
            return InnerGetValue(context);
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

            try
            {
                InterpretationContext ctxt = new InterpretationContext(context);
                if (Parameters.Count == 1)
                {
                    Functions.Graph graph = createGraphForParameter(ctxt, Parameters[0]);
                    if (graph != null)
                    {
                        retVal.Add(graph.Function);
                    }
                }
                else if (Parameters.Count == 2)
                {
                    Functions.Surface surface = createSurface(ctxt, Parameters[0], Parameters[1]);
                    if (surface != null)
                    {
                        retVal.Add(surface.Function);
                    }
                }
            }
            catch (Exception)
            {
                /// TODO Ugly hack, because functions & function types are merged.
                /// This provides an empty function as the type of this
                retVal = getExpressionTypes(context);
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list of element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext context, List<Types.ITypedElement> elements)
        {
            if (Expression != null)
            {
                Expression.Elements(context, elements);
            }
        }

        public override string ToString()
        {
            string retVal = "FUNCTION ";

            bool first = true;
            foreach (Parameter parameter in Parameters)
            {
                if (!first)
                {
                    retVal += ", ";
                }
                retVal += parameter.Name + " : " + parameter.Type.ToString();
                first = false;
            }

            retVal += " => " + Expression.ToString();

            return retVal;
        }


        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            if (Expression != null)
            {
                Expression.fillLiterals(retVal);
            }
        }

        /// <summary>
        /// Updates the expression by replacing source by target
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public override Expression Update(Values.IValue source, Values.IValue target)
        {
            if (Expression != null)
            {
                Expression = Expression.Update(source, target);
            }

            return this;
        }

        /// <summary>
        /// Provides the type of the expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override ReturnValue getExpressionTypes(InterpretationContext context)
        {
            ReturnValue retVal = new ReturnValue();

            Functions.Function function = (Functions.Function)Generated.acceptor.getFactory().createFunction();
            function.Name = ToString();
            context.LocalScope.PushContext();
            foreach (Parameter parameter in Parameters)
            {
                context.LocalScope.setVariable(parameter);
            }
            function.ReturnType = Expression.getExpressionType(context);
            context.LocalScope.PopContext();

            foreach (Parameter parameter in Parameters)
            {
                Parameter param = (Parameter)Generated.acceptor.getFactory().createParameter();
                param.Name = parameter.Name;
                param.Type = parameter.Type;
                function.appendParameters(param);
            }
            retVal.Add(function);

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression(InterpretationContext context)
        {
            context.LocalScope.PushContext();
            foreach (Parameter parameter in Parameters)
            {
                context.LocalScope.setVariable(parameter);
            }
            Expression.checkExpression(context);
            context.LocalScope.PopContext();
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            Functions.Graph retVal = null;

            if (Parameters.Count == 1)
            {
                retVal = Expression.createGraphForParameter(context, Parameters[0]);
            }
            else
            {
                AddError("Cannot create graph for function with more than 1 parameter");
            }

            return retVal;
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

            if (parameter == Parameters[0] || parameter == Parameters[1])
            {
                retVal = Expression.createGraphForParameter(context, parameter);
            }
            else
            {
                throw new Exception("Cannot create graph for parameter " + parameter.Name);
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
            Functions.Surface retVal = null;

            if (xParam == Parameters[0] && yParam == Parameters[1])
            {
                retVal = Expression.createSurface(context, xParam, yParam);
            }
            else
            {
                throw new Exception("Cannot create surface for parameters " + xParam.Name + " and " + yParam);
            }

            retVal.XParameter = xParam;
            retVal.YParameter = yParam;

            return retVal;
        }
    }
}
