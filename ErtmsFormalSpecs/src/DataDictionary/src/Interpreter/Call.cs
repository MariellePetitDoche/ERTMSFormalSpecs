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
        /// Provides the association between parameters and their corresponding expression
        /// </summary>
        public Dictionary<Parameter, Expression> ParameterAssociation { get; set; }

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

            Call calledFunction = Called as Call;
            if (calledFunction != null)
            {
                retVal = Called.GetValue(context) as ICallable;
            }
            else
            {
                retVal = Called.getCalled(context);
                if (retVal == null)
                {
                    Types.Range range = Called.GetExpressionType() as Types.Range;
                    if (range != null)
                    {
                        retVal = range.CastFunction;
                    }

                    if (retVal == null)
                    {
                        retVal = Called.GetValue(context) as ICallable;
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

                ParameterAssociation = createParameterAssociation(Called.Ref as ICallable);
            }

            return retVal;
        }

        /// <summary>
        /// Creates the association between parameter (from the called ICallable) and its associated expression
        /// </summary>
        /// <param name="callable"></param>
        /// <returns></returns>
        private Dictionary<Parameter, Expression> createParameterAssociation(ICallable callable)
        {
            Dictionary<Parameter, Expression> retVal = null;

            if (callable != null)
            {
                if (callable.FormalParameters.Count == NamedActualParameters.Count + ActualParameters.Count)
                {
                    retVal = new Dictionary<Parameter, Expression>();

                    int i = 0;
                    foreach (Expression expression in ActualParameters)
                    {
                        Parameter parameter = callable.FormalParameters[i] as Parameter;
                        retVal.Add(parameter, expression);
                        i = i + 1;
                    }

                    foreach (KeyValuePair<string, Expression> pair in NamedActualParameters)
                    {
                        Parameter parameter = callable.getFormalParameter(pair.Key);
                        retVal.Add(parameter, pair.Value);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the parameter association according to the icallable provided.
        /// If the call is statically determined, take the cached association
        /// </summary>
        /// <param name="callable"></param>
        /// <returns></returns>
        private Dictionary<Parameter, Expression> getParameterAssociation(ICallable callable)
        {
            Dictionary<Parameter, Expression> retVal = ParameterAssociation;

            if (retVal == null)
            {
                retVal = createParameterAssociation(callable);
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

                Dictionary<Variables.Actual, Values.IValue> parameterValues = AssignParameterValues(context, function, true);
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
                    int token = context.LocalScope.PushContext();
                    context.LocalScope.setGraphParameter(parameters[0]);
                    Functions.Graph graph = function.createGraphForParameter(context, parameters[0]);
                    context.LocalScope.PopContext(token);
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
                    CompleteExplanation(previous, function.Name + " ( " + ParameterValues(parameterValues) + " ) returned " + explainNamable(retVal) + "\n");
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
        private List<Parameter> GetPlaceHolders(Functions.Function function, Dictionary<Variables.Actual, Values.IValue> parameterValues)
        {
            List<Parameter> retVal = new List<Parameter>();

            foreach (KeyValuePair<Variables.Actual, Values.IValue> pair in parameterValues)
            {
                Variables.Actual actual = pair.Key;

                Values.PlaceHolder placeHolder = pair.Value as Values.PlaceHolder;
                if (placeHolder != null && actual.Parameter.Enclosing == function)
                {
                    retVal.Add(actual.Parameter);
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
        private static string ParameterValues(Dictionary<Variables.Actual, Values.IValue> parameterValues)
        {
            string parameters = "";
            foreach (KeyValuePair<Variables.Actual, Values.IValue> pair in parameterValues)
            {
                if (!Utils.Utils.isEmpty(parameters))
                {
                    parameters += ", ";
                }
                parameters += pair.Key.Name + " => " + pair.Value.FullName;
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
        public Dictionary<Variables.Actual, Values.IValue> AssignParameterValues(InterpretationContext context, ICallable callable, bool log)
        {
            // Compute the unnamed actual parameter values
            Dictionary<Variables.Actual, Values.IValue> retVal = new Dictionary<Variables.Actual, Values.IValue>();

            if (callable.FormalParameters.Count == NamedActualParameters.Count + ActualParameters.Count)
            {
                int i = 0;
                foreach (Expression expression in ActualParameters)
                {
                    Parameter parameter = callable.FormalParameters[i] as Parameter;
                    Values.IValue val = expression.GetValue(context);
                    if (val != null)
                    {
                        Variables.Actual actual = parameter.createActual();
                        val = val.RightSide(actual, false);
                        retVal.Add(actual, val);
                    }
                    else
                    {
                        AddError("Cannot evaluate value for parameter " + i + " (" + expression.ToString() + ") of function " + callable.Name);
                        return new Dictionary<Variables.Actual, Values.IValue>();
                    }
                    i = i + 1;
                }

                foreach (KeyValuePair<string, Expression> pair in NamedActualParameters)
                {
                    Parameter parameter = callable.getFormalParameter(pair.Key);
                    Values.IValue val = pair.Value.GetValue(context);
                    if (val != null)
                    {
                        Variables.Actual actual = parameter.createActual();
                        val = val.RightSide(actual, false);
                        actual.Value = val;
                        retVal.Add(actual, val);
                    }
                    else
                    {
                        AddError("Cannot evaluate value for parameter " + pair.Key + " of function " + callable.Name);
                        return new Dictionary<Variables.Actual, Values.IValue>();
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
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(InterpretationContext context, Parameter parameter)
        {
            Functions.Graph retVal = base.createGraph(context, parameter);

            Functions.PredefinedFunctions.Cast cast = Called.Ref as Functions.PredefinedFunctions.Cast;
            if (cast != null)
            {
                // In case of cast, just take the graph of the enclosed expression
                Parameter param = (Parameter)cast.FormalParameters[0];
                retVal = cast.createGraphForParameter(context, param);
            }

            Function calledFunction = Called.Ref as Function;
            Dictionary<Parameter, Expression> parameterAssociation = null;
            if (calledFunction == null)
            {
                calledFunction = Called.GetValue(context) as Function;
                parameterAssociation = createParameterAssociation(calledFunction);
            }
            else
            {
                parameterAssociation = ParameterAssociation;
            }

            Parameter Xaxis = null;
            foreach (KeyValuePair<Parameter, Expression> pair in parameterAssociation)
            {
                if (pair.Value.Ref == parameter)
                {
                    if (Xaxis == null)
                    {
                        Xaxis = pair.Key;
                    }
                    else
                    {
                        Root.AddError("Cannot evaluate graph for function call " + ToString() + " which has more than 1 parameter used as X axis");
                        Xaxis = null;
                        break;
                    }
                }
            }

            int token = context.LocalScope.PushContext();
            calledFunction.AssignParameters(context, AssignParameterValues(context, calledFunction, false));
            if (Xaxis != null)
            {
                retVal = calledFunction.createGraphForParameter(context, Xaxis);
            }
            else
            {
                retVal = calledFunction.createGraph(context, null);
            }
            context.LocalScope.PopContext(token);

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
            Functions.Surface retVal = base.createSurface(context, xParam, yParam);

            Functions.Function function = getFunction(context);
            Functions.PredefinedFunctions.Cast cast = Called.Ref as Functions.PredefinedFunctions.Cast;
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

                if (function == null)
                {
                    function = Called.getCalled(context) as Function;
                }

                SelectXandYAxis(context, xParam, yParam, function, out Xaxis, out Yaxis);
                if (Xaxis != null || Yaxis != null)
                {
                    int token = context.LocalScope.PushContext();
                    function.AssignParameters(context, AssignParameterValues(context, function, true));
                    retVal = function.createSurfaceForParameters(context, Xaxis, Yaxis);
                    context.LocalScope.PopContext(token);
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
        private void SelectXandYAxis(Interpreter.InterpretationContext context, Parameter xParam, Parameter yParam, Functions.Function function, out Parameter Xaxis, out Parameter Yaxis)
        {
            Xaxis = null;
            Yaxis = null;

            Dictionary<Parameter, Expression> association = getParameterAssociation(function);
            if (association != null)
            {
                foreach (KeyValuePair<Parameter, Expression> pair in association)
                {
                    if (pair.Value.Ref == xParam)
                    {
                        if (Xaxis == null)
                        {
                            Xaxis = pair.Key;
                        }
                        else
                        {
                            Root.AddError("Cannot evaluate surface for function call " + ToString() + " which has more than 1 X axis parameter");
                            Xaxis = null;
                            break;
                        }
                    }

                    if (pair.Value.Ref == yParam)
                    {
                        if (Yaxis == null)
                        {
                            Yaxis = pair.Key;
                        }
                        else
                        {
                            Root.AddError("Cannot evaluate surface for function call " + ToString() + " which has more than 1 Y axis parameter");
                            Yaxis = null;
                            break;
                        }
                    }
                }
            }
        }

        /// <summary>
        /// Indicates whether this call may read a given variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns></returns>
        public bool Reads(Types.ITypedElement variable)
        {
            bool retVal = false;

            Function function = Called.getStaticCallable() as Function;
            if (function != null)
            {
                retVal = function.Reads(variable);
            }

            return retVal;
        }
    }
}