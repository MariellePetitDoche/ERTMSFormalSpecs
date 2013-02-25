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
using DataDictionary.Functions;
using Utils;

namespace DataDictionary.Interpreter
{
    public class FunctionExpression : Expression, ISubDeclarator
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
            DeclaredElements = new Dictionary<string, List<INamable>>();

            Parameters = parameters;
            foreach (Parameter parameter in parameters)
            {
                parameter.Enclosing = this;
                Utils.ISubDeclaratorUtils.AppendNamable(DeclaredElements, parameter);
            }

            Expression = expression;
            Expression.Enclosing = this;
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
                Expression.SemanticAnalysis(instance, Filter.AllMatches);
            }

            return retVal;
        }

        private ICallable __staticCallable = null;

        /// <summary>
        /// Provides the ICallable that is statically defined
        /// </summary>
        public override ICallable getStaticCallable()
        {
            if (__staticCallable == null)
            {
                __staticCallable = GetExpressionType() as ICallable;
            }

            return __staticCallable;
        }
        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public override Types.Type GetExpressionType()
        {
            Functions.Function retVal = (Functions.Function)Generated.acceptor.getFactory().createFunction();
            retVal.Name = ToString();
            retVal.ReturnType = Expression.GetExpressionType();

            foreach (Parameter parameter in Parameters)
            {
                Parameter param = (Parameter)Generated.acceptor.getFactory().createParameter();
                param.Name = parameter.Name;
                param.Type = parameter.Type;
                retVal.appendParameters(param);
            }
            retVal.Enclosing = Root;

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public override Values.IValue GetValue(InterpretationContext context)
        {
            Values.IValue retVal = null;

            try
            {
                if (Parameters.Count == 1)
                {
                    Functions.Graph graph = createGraphForParameter(context, Parameters[0]);
                    if (graph != null)
                    {
                        retVal = graph.Function;
                    }
                }
                else if (Parameters.Count == 2)
                {
                    Functions.Surface surface = createSurface(context, Parameters[0], Parameters[1]);
                    if (surface != null)
                    {
                        retVal = surface.Function;
                    }
                }
            }
            catch (Exception)
            {
                /// TODO Ugly hack, because functions & function types are merged.
                /// This provides an empty function as the type of this
                retVal = GetExpressionType() as Values.IValue;
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list provided with the element matching the filter provided
        /// </summary>
        /// <param name="retVal">The list to be filled with the element matching the condition expressed in the filter</param>
        /// <param name="filter">The filter to apply</param>
        public override void fill(List<Utils.INamable> retVal, Filter.AcceptableChoice filter)
        {
            if (Parameters != null)
            {
                foreach (Parameter parameter in Parameters)
                {
                    if (filter(parameter))
                    {
                        retVal.Add(parameter);
                    }
                }
            }

            if (Expression != null)
            {
                Expression.fill(retVal, filter);
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
                retVal += parameter.Name + " : " + parameter.TypeName;
                first = false;
            }

            retVal += " => " + Expression.ToString();

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression()
        {
            base.checkExpression();

            Expression.checkExpression();
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
