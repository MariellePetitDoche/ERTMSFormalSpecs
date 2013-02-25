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
    /// <summary>
    /// Something that can be called
    /// </summary>
    public interface ICallable : Utils.INamable
    {
        /// <summary>
        /// Formal parameters of the callable
        /// </summary>
        System.Collections.ArrayList FormalParameters { get; }

        /// <summary>
        /// Provides the formal parameter which matches the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        Parameter getFormalParameter(string name);

        /// <summary>
        /// Provides the return type of the called element
        /// </summary>
        Types.Type ReturnType { get; }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        void additionalChecks(ModelElement root, Dictionary<string, Expression> actualParameters);
    }

    public class Call : Expression
    {
        /// <summary>
        /// The expression which identifies the function
        /// </summary>
        public Expression Called { get; private set; }

        /// <summary>
        /// The unnamed actual parameters
        /// </summary>
        private List<Expression> actualParameters;
        public List<Expression> ActualParameters
        {
            get
            {
                if (actualParameters == null)
                {
                    actualParameters = new List<Expression>();
                }
                return actualParameters;
            }
            set
            {
                actualParameters = null;
            }
        }

        /// <summary>
        /// The list of named actual parameters
        /// </summary>
        private Dictionary<string, Expression> namedActualParameters;
        public Dictionary<string, Expression> NamedActualParameters
        {
            get
            {
                if (namedActualParameters == null)
                {
                    namedActualParameters = new Dictionary<string, Expression>();
                }
                return namedActualParameters;
            }
            set { namedActualParameters = value; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        /// <param name="called">The called function</param>
        public Call(ModelElement root, Expression called)
            : base(root)
        {
            Called = called;
            Called.Enclosing = this;
        }

        /// <summary>
        /// Provides all the parameters for this call (both named and unnamed)
        /// </summary>
        public List<Expression> AllParameters
        {
            get
            {
                List<Expression> retVal = new List<Expression>();

                retVal.AddRange(ActualParameters);
                retVal.AddRange(NamedActualParameters.Values);

                return retVal;
            }
        }

        /// <summary>
        /// Adds an expression as a parameter
        /// </summary>
        /// <param name="name">the name of the actual parameter</param>
        /// <param name="expression">the actual parameter value</param>
        public void AddActualParameter(string name, Expression expression)
        {
            if (name == null)
            {
                ActualParameters.Add(expression);
            }
            else
            {
                if (!NamedActualParameters.ContainsKey(name))
                {
                    NamedActualParameters[name] = expression;
                }
                else
                {
                    AddError("Actual parameter " + name + " is bound twice");
                }
            }

            expression.Enclosing = this;
        }

        /// <summary>
        /// Provides the callable that is called by this expression
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public override ICallable getCalled(InterpretationContext context)
        {
            ICallable retVal = null;

            retVal = Called.getCalled(context);
            if (retVal == null)
            {
                Types.Range range = Called.GetExpressionType() as Types.Range;
                if (range != null)
                {
                    retVal = range.CastFunction;
                }
                else
                {
                    // TODO : Investigate where this is used
                    Variables.IVariable variable = GetValue(context) as Variables.IVariable;
                    if (variable != null)
                    {
                        Functions.Function function = variable.Value as Functions.Function;
                        if (function != null)
                        {
                            retVal = function;
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// The procedure which is called by this call statement
        /// </summary>
        public Variables.IProcedure getProcedure(InterpretationContext context)
        {
            Variables.IProcedure retVal = getCalled(context) as Variables.IProcedure;

            return retVal;
        }

        /// <summary>
        /// The function which is called by this call statement
        /// </summary>
        public Functions.Function getFunction(InterpretationContext context)
        {
            Functions.Function retVal = getCalled(context) as Functions.Function;

            return retVal;
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
                Called.SemanticAnalysis(instance, Filter.IsCallable);
                foreach (Expression actual in AllParameters)
                {
                    actual.SemanticAnalysis(instance, Filter.IsActualParameter);
                }
            }

            return retVal;
        }


        /// <summary>
        /// Provides the ICallable that is statically defined
        /// </summary>
        public override ICallable getStaticCallable()
        {
            ICallable retVal = base.getStaticCallable();

            if (retVal == null)
            {
                retVal = Called.getStaticCallable().ReturnType as ICallable;
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
            Types.Type retVal = null;

            Functions.Function function = Called.getStaticCallable() as Functions.Function;
            if (function != null)
            {
                retVal = function.ReturnType;
            }
            else
            {
                AddError("Cannot get type of function call " + ToString());
            }

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
            ExplanationPart previous = SetupExplanation();

            Functions.Function function = getFunction(context);
            if (function != null)
            {
                long start = System.Environment.TickCount;

                Dictionary<string, Values.IValue> parameterValues = AssignParameterValues(context, function, true);
                List<Parameter> parameters = GetPlaceHolders(function, parameterValues);
                if (parameters == null)
                {
                    retVal = function.Evaluate(context, parameterValues);
                    if (retVal == null)
                    {
                        AddError("Call " + function.Name + " ( " + ParameterValues(parameterValues) + " ) returned nothing");
                    }
                }
                else if (parameters.Count == 1) // graph
                {
                    Functions.Graph graph = function.createGraphForParameter(context, parameters[0]);
                    if (graph != null)
                    {
                        retVal = graph.Function;
                    }
                    else
                    {
                        AddError("Cannot create graph on Call " + function.Name + " ( " + ParameterValues(parameterValues) + " )");
                    }
                }
                else // surface
                {
                    Functions.Surface surface = function.createSurfaceForParameters(context, parameters[0], parameters[1]);
                    if (surface != null)
                    {
                        retVal = surface.Function;
                    }
                    else
                    {
                        AddError("Cannot create surface on Call " + function.Name + " ( " + ParameterValues(parameterValues) + " )");
                    }
                }

                long stop = System.Environment.TickCount;
                long span = (stop - start);
                function.ExecutionTimeInMilli += span;
                function.ExecutionCount += 1;

                if (explain)
                {
                    CompleteExplanation(previous, function.Name + " ( " + ParameterValues(parameterValues) + " ) returned " + retVal.ToString() + "\n");
                }
            }
            else
            {
                AddError("Cannot find function " + ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Provides the parameters whose value are place holders
        /// </summary>
        /// <param name="function">The function on which the call is performed</param>
        /// <param name="parameterValues">The actual parameter values</param>
        /// <returns></returns>
        private List<Parameter> GetPlaceHolders(Functions.Function function, Dictionary<string, Values.IValue> parameterValues)
        {
            List<Parameter> retVal = new List<Parameter>();

            foreach (KeyValuePair<string, Values.IValue> pair in parameterValues)
            {
                if (pair.Value is Values.PlaceHolder)
                {
                    retVal.Add(function.findParameter(pair.Key));
                }
                else
                {
                    break;
                }
            }

            if (retVal.Count != parameterValues.Count || retVal.Count == 0)
            {
                retVal = null;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the parameter's values along with their name
        /// </summary>
        /// <param name="parameterValues"></param>
        /// <returns></returns>
        private static string ParameterValues(Dictionary<string, Values.IValue> parameterValues)
        {
            string parameters = "";
            foreach (KeyValuePair<string, Values.IValue> pair in parameterValues)
            {
                if (!Utils.Utils.isEmpty(parameters))
                {
                    parameters += ", ";
                }
                parameters += pair.Key + " => " + pair.Value.FullName;
            }
            return parameters;
        }

        /// <summary>
        /// Creates the parameter value associationg according to actual parameters
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="callable">The callable</param>
        /// <param name="log">Indicates whether errors should be logged</param>
        /// <returns></returns>
        public Dictionary<string, Values.IValue> AssignParameterValues(InterpretationContext context, ICallable callable, bool log)
        {
            // Compute the unnamed actual parameter values
            Dictionary<string, Values.IValue> retVal = new Dictionary<string, Values.IValue>();

            if (callable.FormalParameters.Count == NamedActualParameters.Count + ActualParameters.Count)
            {
                int i = 0;
                foreach (Expression expression in ActualParameters)
                {
                    Parameter parameter = callable.FormalParameters[i] as Parameter;
                    Values.IValue val = expression.GetValue(context);
                    if (val != null)
                    {
                        val = val.RightSide(parameter, false);
                        retVal.Add(parameter.Name, val);
                    }
                    else
                    {
                        if (log)
                        {
                            AddError("Cannot evaluate value for parameter " + i + " (" + expression.ToString() + ") of function " + callable.Name);
                            return new Dictionary<string, Values.IValue>();
                        }
                    }
                    i = i + 1;
                }

                foreach (KeyValuePair<string, Expression> pair in NamedActualParameters)
                {
                    Parameter parameter = callable.getFormalParameter(pair.Key);
                    Values.IValue val = pair.Value.GetValue(context);
                    if (val != null)
                    {
                        val = val.RightSide(parameter, false);
                        retVal.Add(pair.Key, val);
                    }
                    else
                    {
                        if (log)
                        {
                            AddError("Cannot evaluate value for parameter " + pair.Key + " of function " + callable.Name);
                            return new Dictionary<string, Values.IValue>();
                        }
                    }
                }
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
            foreach (Expression expression in NamedActualParameters.Values)
            {
                expression.fill(retVal, filter);
            }

            foreach (Expression expression in ActualParameters)
            {
                expression.fill(retVal, filter);
            }
        }

        public override string ToString()
        {
            string retVal = Called.ToString() + "(";

            bool first = true;
            foreach (Expression argument in ActualParameters)
            {
                if (!first)
                {
                    retVal += ", ";
                }
                first = false;
                retVal += argument.ToString();
            }
            foreach (KeyValuePair<string, Expression> pair in NamedActualParameters)
            {
                if (!first)
                {
                    retVal += ", ";
                }
                first = false;
                retVal += pair.Key.ToString() + " => " + pair.Value.ToString();
            }
            retVal = retVal + ")";

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression()
        {
            base.checkExpression();

            Called.checkExpression();
            ICallable called = Called.getStaticCallable();
            if (called != null)
            {
                if (called.FormalParameters.Count != NamedActualParameters.Count + ActualParameters.Count)
                {
                    AddError("Invalid number of arguments provided for function call " + ToString() + " expected " + called.FormalParameters.Count + " actual " + NamedActualParameters.Count);

                }
                else
                {
                    Dictionary<string, Expression> actuals = new Dictionary<string, Expression>();

                    int i = 0;
                    foreach (Expression expression in ActualParameters)
                    {
                        Parameter parameter = called.FormalParameters[i] as Parameter;
                        CheckActualAgainstFormal(actuals, expression, parameter);
                        i = i + 1;
                    }

                    foreach (KeyValuePair<string, Expression> pair in NamedActualParameters)
                    {
                        string name = pair.Key;
                        Expression expression = pair.Value;
                        Parameter parameter = called.getFormalParameter(name);
                        if (parameter == null)
                        {
                            AddError("Parameter " + name + " is not defined as formal parameter of function " + called.FullName);
                        }
                        else
                        {
                            if (actuals.ContainsKey(name))
                            {
                                AddError("Parameter " + name + " isassigned twice in " + ToString());
                            }
                            else
                            {
                                CheckActualAgainstFormal(actuals, expression, parameter);
                            }
                        }
                    }

                    if (called.FormalParameters.Count > 2)
                    {
                        if (ActualParameters.Count > 0)
                        {
                            AddWarning("Calls where more than two parameters are provided must be performed using named association");
                        }
                    }

                    called.additionalChecks(Root, actuals);
                }
            }
            else
            {
                AddError("Cannot determine callable referenced by " + ToString());
            }
        }

        private void CheckActualAgainstFormal(Dictionary<string, Expression> actuals, Expression expression, Parameter parameter)
        {
            actuals[parameter.Name] = expression;

            expression.checkExpression();
            Types.Type argumentType = expression.GetExpressionType();
            if (argumentType == null)
            {
                AddError("Cannot evaluate argument type for argument " + expression.ToString());
            }
            else
            {
                if (parameter.Type == null)
                {
                    AddError("Cannot evaluate formal parameter type for " + parameter.Name);
                }
                else
                {
                    if (!parameter.Type.Match(argumentType))
                    {
                        AddError("Invalid argument " + expression.ToString() + " type, expected " + parameter.Type.FullName + ", actual " + argumentType.FullName);
                    }
                }
            }
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            Functions.Graph retVal = null;

            Functions.Function function = getFunction(context);
            function.createGraph(context);

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

            Functions.Function function = getFunction(context);

            Functions.PredefinedFunctions.Cast cast = function as Functions.PredefinedFunctions.Cast;
            if (cast != null)
            {
                // In case of cast, just take the graph of the enclosed expression
                Parameter param = (Parameter)cast.FormalParameters[0];
                retVal = cast.createGraphForParameter(context, param);
            }

            context.LocalScope.PushContext();
            Values.Value XValue = new Values.PlaceHolder(EFSSystem.AnyType, 1);
            parameter.Value = XValue;
            context.LocalScope.setVariable(parameter);
            Dictionary<string, Values.IValue> actualValues = AssignParameterValues(context, function, false);
            function.AssignParameters(context, actualValues);
            context.LocalScope.PopContext();

            Parameter Xaxis = null;
            foreach (Parameter param in function.FormalParameters)
            {
                if (param.Value == XValue)
                {
                    if (Xaxis == null)
                    {
                        Xaxis = param;
                    }
                    else
                    {
                        Root.AddError("Cannot evaluate graph for function call " + ToString() + " which has more than 1 parameter used as X axis");
                        Xaxis = null;
                        break;
                    }
                }
            }

            context.LocalScope.PushContext();
            if (Xaxis != null)
            {
                Xaxis.Value = null;
                context.LocalScope.setVariable(Xaxis);
                retVal = function.createGraphForParameter(context, Xaxis);
            }
            else
            {
                function.AssignParameters(context, actualValues);
                retVal = function.createGraphForParameter(context, parameter);
            }
            context.LocalScope.PopContext();

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

            Functions.Function function = getFunction(context);
            Functions.PredefinedFunctions.Cast cast = function as Functions.PredefinedFunctions.Cast;
            if (cast != null)
            {
                // In case of cast, just take the surface of the enclosed expression
                Expression actual = (Expression)ActualParameters[0];
                retVal = actual.createSurface(context, xParam, yParam);
            }
            else
            {
                Parameter Xaxis = null;
                Parameter Yaxis = null;

                if (SelectXandYAxis(context, xParam, yParam, function, out Xaxis, out Yaxis))
                {
                    context.LocalScope.PushContext();
                    context.LocalScope.setVariable(Xaxis);
                    context.LocalScope.setVariable(Yaxis);
                    retVal = function.createSurfaceForParameters(context, Xaxis, Yaxis);
                    context.LocalScope.PopContext();
                }
                else
                {
                    Values.IValue value = GetValue(context);
                    if (value != null)
                    {
                        retVal = Functions.Surface.createSurface(Functions.Function.getDoubleValue(value), xParam, yParam);
                    }
                    else
                    {
                        throw new Exception("Cannot create surface for expression");
                    }
                }
            }

            retVal.XParameter = xParam;
            retVal.YParameter = yParam;

            return retVal;
        }

        /// <summary>
        /// Selects the X and Y axis of the surface to be created according to the function for which the surface need be created and the parameters on which the surface is created
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="xParam">The X parameter for which the surface need be created</param>
        /// <param name="yParam">The Y parameter for which the surface need be created</param>
        /// <param name="function">The function creating the surface</param>
        /// <param name="Xaxis">The resulting X axis</param>
        /// <param name="Yaxis">The resulting Y axis</param>
        /// <returns>true if the axis could be selected</returns>
        private bool SelectXandYAxis(Interpreter.InterpretationContext context, Parameter xParam, Parameter yParam, Functions.Function function, out Parameter Xaxis, out Parameter Yaxis)
        {
            bool retVal = false;

            context.LocalScope.PushContext();
            Values.Value XValue = new Values.PlaceHolder(EFSSystem.AnyType, 1);
            Values.Value YValue = new Values.PlaceHolder(EFSSystem.AnyType, 2);
            xParam.Value = XValue;
            yParam.Value = YValue;
            context.LocalScope.setVariable(xParam);
            context.LocalScope.setVariable(yParam);
            Dictionary<string, Values.IValue> actualValues = AssignParameterValues(context, function, false);
            function.AssignParameters(context, actualValues);
            context.LocalScope.PopContext();

            Xaxis = null;
            Yaxis = null;
            foreach (Parameter param in function.FormalParameters)
            {
                if (param.Value == XValue)
                {
                    if (Xaxis == null)
                    {
                        Xaxis = param;
                    }
                    else
                    {
                        Root.AddError("Cannot evaluate surface for function call " + ToString() + " which has more than 1 X axis parameter");
                        Xaxis = null;
                        break;
                    }
                }

                if (param.Value == YValue)
                {
                    if (Yaxis == null)
                    {
                        Yaxis = param;
                    }
                    else
                    {
                        Root.AddError("Cannot evaluate surface for function call " + ToString() + " which has more than 1 Y axis parameter");
                        Yaxis = null;
                        break;
                    }
                }
            }

            if (Xaxis != null || Yaxis != null)
            {
                retVal = true;
                if (Xaxis == null)
                {
                    Xaxis = xParam;
                }
                if (Yaxis == null)
                {
                    Yaxis = yParam;
                }
            }

            return retVal;
        }
    }
}