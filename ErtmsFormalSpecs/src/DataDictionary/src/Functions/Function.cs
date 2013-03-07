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

namespace DataDictionary.Functions
{
    public class Function : Generated.Function, Utils.ISubDeclarator, Values.IValue, TextualExplain, Interpreter.ICallable
    {
        /// <summary>
        /// The time spent evaluating this function
        /// </summary>
        public long ExecutionTimeInMilli { get; set; }

        /// <summary>
        /// Provides the number of times this rule has been executed
        /// </summary>
        public int ExecutionCount { get; set; }

        /// <summary>
        /// Provides the type name of the function
        /// </summary>
        public string TypeName
        {
            get { return getTypeName(); }
        }

        /// <summary>
        /// The type associated to this function
        /// </summary>
        public Types.Type Type
        {
            get { return this; }
            set { }
        }

        /// <summary>
        /// The function return type
        /// </summary>
        private Types.Type returnType = null;

        public virtual Types.Type ReturnType
        {
            get
            {
                if (returnType == null)
                {
                    returnType = EFSSystem.findType(NameSpace, getTypeName());
                }
                return returnType;
            }
            set
            {
                if (value != null)
                {
                    setTypeName(value.FullName);
                }
                else
                {
                    setTypeName(null);
                }
                returnType = value;
            }
        }

        /// <summary>
        /// Parameters of the function
        /// </summary>
        public System.Collections.ArrayList FormalParameters
        {
            get
            {
                if (allParameters() == null)
                {
                    setAllParameters(new System.Collections.ArrayList());
                }
                return allParameters();
            }
            set { setAllParameters(value); }
        }

        /// <summary>
        /// Provides the formal parameter whose name corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Parameter getFormalParameter(string name)
        {
            Parameter retVal = null;

            foreach (Parameter parameter in FormalParameters)
            {
                if (parameter.Name.CompareTo(name) == 0)
                {
                    retVal = parameter;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Cases of the function
        /// </summary>
        public System.Collections.ArrayList Cases
        {
            get
            {
                System.Collections.ArrayList retVal = allCases();
                if (retVal == null)
                    retVal = new System.Collections.ArrayList();
                return retVal;
            }
            set { setAllCases(value); }
        }

        /// <summary>
        /// Assigns the values of the function parameters with values provided in the list Parameters
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameterValues">The values of the parameters</param>
        public void AssignParameters(Interpreter.InterpretationContext context, Dictionary<string, Values.IValue> parameterValues)
        {
            foreach (KeyValuePair<string, Values.IValue> pair in parameterValues)
            {
                context.LocalScope.setVariable(getFormalParameter(pair.Key), pair.Value);
            }
        }

        /// <summary>
        /// Provides the mode of the variable
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode
        {
            get { return Generated.acceptor.VariableModeEnumType.aInternal; }
            set { }
        }

        /// <summary>
        /// The enclosing collection of the function
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                {
                    return NameSpace.Functions;
                }
            }
        }

        /// <summary>
        /// The complete name to access the value
        /// </summary>
        public string LiteralName { get { return FullName; } }

        /// <summary>
        /// Creates a valid right side IValue, according to the target variable (left side)
        /// </summary>
        /// <param name="variable">The target variable</param>
        /// <param name="duplicate">Indicates that a duplication of the variable should be performed</param>
        /// <returns></returns>
        public Values.IValue RightSide(Variables.IVariable variable, bool duplicate)
        {
            return this;
        }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        public void additionalChecks(ModelElement root, Dictionary<string, Interpreter.Expression> actualParameters)
        {
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public virtual Graph createGraph(Interpreter.InterpretationContext context, Parameter parameter)
        {
            Graph retVal = Graph;

            if (retVal == null)
            {
                try
                {
                    Interpreter.InterpretationContext ctxt = new Interpreter.InterpretationContext(context);
                    if (Cases.Count > 0)
                    {
                        // For now, just create graphs for functions using 0 or 1 parameter.
                        if (FormalParameters.Count == 0)
                        {
                            Values.IValue value = Evaluate(ctxt, new Dictionary<string, Values.IValue>());
                            retVal = Graph.createGraph(value, parameter);
                        }
                        else if (FormalParameters.Count == 1)
                        {
                            Parameter param = (Parameter)FormalParameters[0];
                            ctxt.LocalScope.PushContext();
                            if (parameter != null)
                            {
                                ctxt.LocalScope.setVariable(param, parameter.Value);
                            }
                            retVal = createGraphForParameter(ctxt, param);
                            ctxt.LocalScope.PopContext();
                        }
                        else
                        {
                            throw new Exception("Cannot create graph for functions with more than 1 parameter");
                        }
                    }
                }
                catch (Exception e)
                {
                    AddError("Cannot create graph of function, reason : " + e.Message);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Creates the graph for a given parameter, the other parameters are considered fixed by the interpretation context
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameter for the X axis</param>
        /// <returns></returns>
        public virtual Graph createGraphForParameter(Interpreter.InterpretationContext context, Parameter parameter)
        {
            Graph retVal = null;

            if (parameter.Enclosing == this && graph != null)
            {
                retVal = graph;
            }
            else
            {
                retVal = new Graph();

                foreach (Case cas in Cases)
                {
                    if (PreconditionSatisfied(context, cas, parameter))
                    {
                        Graph subGraph = cas.Expression.createGraph(context, parameter);
                        ReduceGraph(context, subGraph, cas, parameter);
                        retVal.Merge(subGraph);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Combines two types to create a new one
        /// </summary>
        /// <param name="right"></param>
        /// <param name="Operator"></param>
        /// <returns></returns>
        public override Types.Type CombineType(Types.Type right, Interpreter.BinaryExpression.OPERATOR Operator)
        {
            Types.Type retVal = null;

            Function function = right as Function;
            if (function != null)
            {
                if (this.ReturnType == function.ReturnType)
                {
                    if (this.FormalParameters.Count >= function.FormalParameters.Count)
                    {
                        retVal = this;
                    }
                    else
                    {
                        retVal = function;
                    }
                }
                else
                {
                    AddError("Cannot combine types " + this.ReturnType.Name + " and " + function.ReturnType.Name);
                }
            }
            else if (right.IsDouble())
            {
                retVal = this;
            }
            else
            {
                AddError("Cannot combine types " + this.ReturnType.Name + " and " + right.Name);
            }

            return retVal;
        }

        /// <summary>
        /// Indicates whether all preconditions are satisfied for a given case, ignoring expressions like parameter <= xxx or parameter >= xxx
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="cas">The case to evaluate</param>
        /// <param name="parameter"></param>
        /// <returns></returns>
        private bool PreconditionSatisfied(Interpreter.InterpretationContext context, Case cas, Parameter parameter)
        {
            bool retVal = true;

            foreach (Rules.PreCondition preCondition in cas.PreConditions)
            {
                if (!ExpressionBasedOnParameter(context, parameter, preCondition.ExpressionTree))
                {
                    Values.BoolValue boolValue = preCondition.ExpressionTree.GetValue(context) as Values.BoolValue;
                    if (boolValue == null)
                    {
                        throw new Exception("Cannot evaluate precondition " + preCondition.Name);
                    }
                    else if (!boolValue.Val)
                    {
                        retVal = false;
                        break;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Indicates if the expression if of the form parameter <= xxx or xxx <= parameter
        /// </summary>
        /// <param name="context">The context used to evaluate the expression</param>
        /// <param name="parameter">The parameter of the template</param>
        /// <param name="expression">The expression to analyze</param>
        /// <returns></returns>
        private bool ExpressionBasedOnParameter(Interpreter.InterpretationContext context, Parameter parameter, Interpreter.Expression expression)
        {
            bool retVal = false;

            Interpreter.BinaryExpression binaryExpression = expression as Interpreter.BinaryExpression;
            if (binaryExpression != null)
            {
                retVal = binaryExpression.Right.GetVariable(context) == parameter
                      || binaryExpression.Left.GetVariable(context) == parameter
                      || FunctionCallOnParameter(context, binaryExpression.Right, parameter)
                      || FunctionCallOnParameter(context, binaryExpression.Left, parameter);
            }

            return retVal;
        }

        /// <summary>
        /// Indicates that the expression is a function call using the parameter as argument value
        /// </summary>
        /// <param name="context">The context used to evaluate the actual parameters</param>
        /// <param name="expression">The expression to evaluate</param>
        /// <param name="parameter">The parameter</param>
        /// <returns></returns>
        private bool FunctionCallOnParameter(Interpreter.InterpretationContext context, Interpreter.Expression expression, Parameter parameter)
        {
            bool retVal = false;

            Interpreter.Call call = expression as Interpreter.Call;
            if (call != null)
            {
                if (call.ActualParameters.Count + call.NamedActualParameters.Count > 0)
                {
                    Interpreter.Expression expr = null;
                    if (call.ActualParameters.Count == 1)
                    {
                        expr = call.ActualParameters[0];
                    }
                    else
                    {
                        foreach (String name in call.NamedActualParameters.Keys)
                        {
                            expr = call.NamedActualParameters[name];
                        }
                    }

                    Variables.IVariable param = expr.GetVariable(context);
                    retVal = param == parameter;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Evaluates the boundaries associated to a specific preCondition
        /// </summary>
        /// <param name="context">The context used to evaluate the precondition and segment value</param>
        /// <param name="preCondition">The precondition to evaluate the range</param>
        /// <param name="parameter"></param>
        /// <returns></returns>
        private List<Graph.Segment> EvaluateBoundaries(Interpreter.InterpretationContext context, Rules.PreCondition preCondition, Parameter parameter)
        {
            List<Graph.Segment> retVal = new List<Graph.Segment>();

            if (parameter != null)
            {
                Interpreter.BinaryExpression expression = preCondition.ExpressionTree as Interpreter.BinaryExpression;
                if (ExpressionBasedOnParameter(context, parameter, expression))
                {
                    Values.IValue val;
                    if (expression.Right.GetVariable(context) == parameter)
                    {
                        // Expression like xxx <= Parameter
                        val = expression.Left.GetValue(context);
                        switch (expression.Operation)
                        {
                            case Interpreter.BinaryExpression.OPERATOR.LESS:
                            case Interpreter.BinaryExpression.OPERATOR.LESS_OR_EQUAL:
                                retVal.Add(new Graph.Segment(getDoubleValue(val), double.MaxValue, new Graph.Segment.Curve()));
                                break;

                            case Interpreter.BinaryExpression.OPERATOR.GREATER:
                            case Interpreter.BinaryExpression.OPERATOR.GREATER_OR_EQUAL:
                                retVal.Add(new Graph.Segment(0, getDoubleValue(val), new Graph.Segment.Curve()));
                                break;

                            default:
                                throw new Exception("Invalid comparison operator while evaluating Graph of function");
                        }
                    }
                    else
                    {
                        if (expression.Left.GetVariable(context) == parameter)
                        {
                            // Expression like Parameter <= xxx
                            val = expression.Right.GetValue(context);
                            switch (expression.Operation)
                            {
                                case Interpreter.BinaryExpression.OPERATOR.LESS:
                                case Interpreter.BinaryExpression.OPERATOR.LESS_OR_EQUAL:
                                    retVal.Add(new Graph.Segment(0, getDoubleValue(val), new Graph.Segment.Curve()));
                                    break;

                                case Interpreter.BinaryExpression.OPERATOR.GREATER:
                                case Interpreter.BinaryExpression.OPERATOR.GREATER_OR_EQUAL:
                                    retVal.Add(new Graph.Segment(getDoubleValue(val), double.MaxValue, new Graph.Segment.Curve()));
                                    break;

                                default:
                                    throw new Exception("Invalid comparison operator while evaluating Graph of function");
                            }
                        }
                        else
                        {
                            if (FunctionCallOnParameter(context, expression.Right, parameter))
                            {
                                Graph graph = expression.Right.createGraph(context, parameter);
                                if (graph != null)
                                {
                                    // Expression like xxx <= f(Parameter)
                                    val = expression.Left.GetValue(context);
                                    retVal = graph.GetSegments(Interpreter.BinaryExpression.Inverse(expression.Operation), getDoubleValue(val));
                                }
                                else
                                {
                                    AddError("Cannot create graph for " + expression.Right);
                                }
                            }
                            else
                            {
                                Graph graph = expression.Left.createGraph(context, parameter);
                                if (graph != null)
                                {
                                    // Expression like f(Parameter) <= xxx
                                    val = expression.Right.GetValue(context);
                                    retVal = graph.GetSegments(expression.Operation, getDoubleValue(val));
                                }
                                else
                                {
                                    throw new Exception("Cannot evaluate bounds of segment");
                                }
                            }
                        }
                    }
                }
                else
                {
                    if (!ExpressionBasedOnPlaceHolder(context, parameter, expression))
                    {
                        Values.BoolValue value = preCondition.ExpressionTree.GetValue(context) as Values.BoolValue;
                        if (value != null && value.Val)
                        {
                            retVal.Add(new Graph.Segment(0, double.MaxValue, new Graph.Segment.Curve()));
                        }
                    }
                }
            }
            else
            {
                AddError("Parameter is null");
            }

            return retVal;
        }

        /// <summary>
        /// Indicates whether the expression is based on a placeholder value, ommiting the parameter provided
        /// </summary>
        /// <param name="context">The current interpretation context</param>
        /// <param name="parameter">The parameter to ommit</param>
        /// <param name="expression">The expression to evaluate</param>
        /// <returns></returns>
        private bool ExpressionBasedOnPlaceHolder(Interpreter.InterpretationContext context, Parameter parameter, Interpreter.BinaryExpression expression)
        {
            bool retVal = false;

            foreach (Parameter other in context.PlaceHolders())
            {
                if (other != parameter && ExpressionBasedOnParameter(context, other, expression))
                {
                    retVal = true;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Reduces the graph to the only part releated to the preconditions
        /// </summary>
        /// <param name="context">The context used to evaluate the precondition and segment value</param>
        /// <param name="graph">The graph to reduce</param>
        /// <param name="cas">The case which is used to reduce the graph</param>
        /// <param name="parameter"></param>
        /// <returns></returns>
        private void ReduceGraph(Interpreter.InterpretationContext context, Graph graph, Case cas, Parameter parameter)
        {
            foreach (Rules.PreCondition preCondition in cas.PreConditions)
            {
                List<Graph.Segment> boundaries = EvaluateBoundaries(context, preCondition, parameter);
                graph.Reduce(boundaries);
            }
        }

        /// <summary>
        /// Provides the graph associated to the function, if any
        /// </summary>
        private Graph graph;

        public Graph Graph
        {
            get
            {
                return graph;
            }
            set
            {
                graph = value;
                if (graph != null)
                {
                    graph.Function = this;
                }
            }
        }

        /// <summary>
        /// Provides the surface of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public virtual Surface createSurface(Interpreter.InterpretationContext context)
        {
            Surface retVal = Surface;

            if (retVal == null)
            {
                try
                {
                    if (FormalParameters.Count == 2)
                    {
                        // Select which parameter is the X axis of the surface, and which is the Y
                        Parameter Xparameter = SelectXAxisParameter(context);
                        Parameter Yparameter = SelectYAxisParameter(Xparameter);
                        if (Xparameter != null && Yparameter != null)
                        {
                            context.LocalScope.PushContext();
                            context.LocalScope.setSurfaceParameters(Xparameter, Yparameter);
                            retVal = createSurfaceForParameters(context, Xparameter, Yparameter);
                            context.LocalScope.PopContext();
                        }
                    }
                    else
                    {
                        throw new Exception("Wrong number of parameters for function " + FullName + " to create a surface");
                    }
                }
                catch (Exception e)
                {
                    AddError("Cannot create surface of function, reason : " + e.Message);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the surface which corresponds to the parameters provided
        /// </summary>
        /// <param name="X"></param>
        /// <param name="Y"></param>
        /// <returns></returns>
        public Surface getSurface(Parameter X, Parameter Y)
        {
            Surface retVal = null;

            if (Surface != null)
            {
                // TODO : Ensure parameters are OK
                retVal = Surface;
            }
            else if (Graph != null)
            {
                // TODO : Check parameters name for conversion to X surface (or not done here) Y surface
                Parameter parameter = (Parameter)FormalParameters[0];
                retVal = this.Graph.ToSurfaceX();
            }

            return retVal;
        }

        /// <summary>
        /// Provides the surface of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <param name="Xparameter">The parameter used for the X axis</param>
        /// <param name="Yparameter">The parameter used for the Y axis</param>
        /// <returns></returns>
        public virtual Surface createSurfaceForParameters(Interpreter.InterpretationContext context, Parameter Xparameter, Parameter Yparameter)
        {
            Surface retVal;
            if (Surface != null)
            {
                retVal = Surface;
            }
            else
            {
                retVal = new Surface(Xparameter, Yparameter);
                if (Xparameter != null)
                {
                    // TODO : Remove check code
                    if ((Xparameter.Enclosing != this))
                    {
                        System.Diagnostics.Debugger.Break();
                    }

                    if (Yparameter != null)
                    {
                        // TODO : Remove check code
                        if ((Yparameter.Enclosing != this))
                        {
                            System.Diagnostics.Debugger.Break();
                        }

                        if (Cases.Count > 0)
                        {
                            foreach (Case cas in Cases)
                            {
                                if (PreconditionSatisfied(context, cas, Xparameter, Yparameter))
                                {
                                    Surface surface = cas.Expression.createSurface(context, Xparameter, Yparameter);
                                    surface.XParameter = Xparameter;
                                    surface.YParameter = Yparameter;
                                    if (surface != null)
                                    {
                                        Parameter parameter = null;
                                        surface = ReduceSurface(context, cas, surface, out parameter);

                                        if (parameter == null || parameter == surface.XParameter)
                                        {
                                            retVal.MergeX(surface);
                                        }
                                        else
                                        {
                                            retVal = Surface.MergeY(retVal, surface);
                                        }
                                    }
                                    else
                                    {
                                        AddError("Cannot create surface for expression " + cas.ExpressionText);
                                        retVal = null;
                                        break;
                                    }
                                }
                            }
                        }
                        else if (Graph != null)
                        {
                            // The function is defined by a graph
                            // Extend it to a surface
                            // TODO: Check the right parameter
                            retVal = Graph.ToSurfaceX();
                            retVal.XParameter = Xparameter;
                            retVal.YParameter = Yparameter;
                        }
                        else
                        {
                            throw new Exception("cannot create surface for parameters");
                        }
                    }
                    else
                    {
                        // Function with 1 parameter that ranges over the Xaxis
                        retVal = new Surface(Xparameter, Yparameter);
                        Functions.Graph graph = createGraphForParameter(context, Xparameter);
                        foreach (Graph.Segment segment in graph.Segments)
                        {
                            Graph newGraph = Graph.createGraph(segment.Expression.v0);
                            Surface.Segment newSegment = new Surface.Segment(segment.Start, segment.End, newGraph);
                            retVal.AddSegment(newSegment);
                        }
                    }
                }
                else if (Yparameter != null)
                {
                    // TODO : Remove check code
                    if ((Yparameter.Enclosing != this))
                    {
                        System.Diagnostics.Debugger.Break();
                    }

                    // Function with 1 parameter that ranges over the Yaxis
                    retVal = new Surface(Xparameter, Yparameter);
                    Graph graph = createGraphForParameter(context, Yparameter);
                    Surface.Segment segment = new Functions.Surface.Segment(0, double.MaxValue, graph);
                    retVal.AddSegment(segment);
                }
                else
                {
                    AddError("Invalid parameters for surface creation");
                }
            }

            return retVal;
        }

        /// <summary>
        /// Indicates whether all preconditions are satisfied for a given case, ignoring expressions like x (y) <= xxx or x (y) >= xxx
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="cas">The case to evaluate</param>
        /// <param name="x">First parameter</param>
        /// <param name="y">Second parameter</param>
        /// <returns></returns>
        private bool PreconditionSatisfied(Interpreter.InterpretationContext context, Case cas, Parameter x, Parameter y)
        {
            bool retVal = true;

            foreach (Rules.PreCondition preCondition in cas.PreConditions)
            {
                if (!ExpressionBasedOnParameter(context, x, preCondition.ExpressionTree) && !ExpressionBasedOnParameter(context, y, preCondition.ExpressionTree))
                {
                    Values.BoolValue boolValue = preCondition.ExpressionTree.GetValue(context) as Values.BoolValue;
                    if (boolValue == null)
                    {
                        throw new Exception("Cannot evaluate precondition " + preCondition.Name);
                    }
                    else if (!boolValue.Val)
                    {
                        retVal = false;
                        break;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Indicates that the list of segments spans to the full range (0 .. infinity)
        /// </summary>
        /// <param name="boudaries"></param>
        /// <returns></returns>
        private bool fullRange(List<Graph.Segment> boudaries)
        {
            return boudaries.Count == 1 && boudaries[0].Start == 0 && boudaries[0].End == double.MaxValue;
        }

        /// <summary>
        /// Reduces the X axis of the surface according to the preconditions of this case
        /// </summary>
        /// <param name="context">The context used to reduce the surface</param>
        /// <param name="cas">The case used to reduce the surface</param>
        /// <param name="surface">The surface to reduce</param>
        /// <param name="parameter">The parameter for which the reduction has been performed</param>
        /// <returns>The reduced surface</returns>
        private Surface ReduceSurface(Interpreter.InterpretationContext context, Case cas, Surface surface, out Parameter parameter)
        {
            Surface retVal;

            // Evaluate the axis
            parameter = null;
            foreach (Rules.PreCondition preCondition in cas.PreConditions)
            {
                List<Graph.Segment> boundaries = EvaluateBoundaries(context, preCondition, surface.XParameter);
                if (boundaries.Count != 0 && !fullRange(boundaries))
                {
                    if (parameter != surface.YParameter)
                    {
                        parameter = surface.XParameter;
                    }
                    else
                    {
                        throw new Exception("Cannot reduce a graph on both X axis and Y axis on the same time (1)");
                    }
                }
                else
                {
                    boundaries = EvaluateBoundaries(context, preCondition, surface.YParameter);
                    if (boundaries.Count != 0 && !fullRange(boundaries))
                    {
                        if (parameter != surface.XParameter)
                        {
                            parameter = surface.YParameter;
                        }
                        else
                        {
                            throw new Exception("Cannot reduce a graph on both X axis and Y axis on the same time (2)");
                        }
                    }
                }
            }

            if (parameter == surface.XParameter)
            {
                // Reduce the surface on the X axis
                retVal = new Surface(surface.XParameter, surface.YParameter);
                foreach (Surface.Segment segment in surface.Segments)
                {
                    retVal.AddSegment(new Surface.Segment(segment));
                }

                // Reduces the segments according to this preconditions
                foreach (Rules.PreCondition preCondition in cas.PreConditions)
                {
                    List<Graph.Segment> boundaries = EvaluateBoundaries(context, preCondition, surface.XParameter);
                    retVal.Reduce(boundaries);
                }
            }
            else if (parameter == surface.YParameter)
            {
                // Reduce the surface, for all segments of the X axis, on the Y axis
                retVal = new Surface(surface.XParameter, surface.YParameter);
                foreach (Surface.Segment segment in surface.Segments)
                {
                    // Reduces the segments according to this preconditions
                    foreach (Rules.PreCondition preCondition in cas.PreConditions)
                    {
                        List<Graph.Segment> boundaries = EvaluateBoundaries(context, preCondition, surface.YParameter);
                        segment.Graph.Reduce(boundaries);
                    }
                    if (!segment.Empty())
                    {
                        retVal.AddSegment(segment);
                    }
                }
            }
            else
            {
                retVal = surface;
            }

            return retVal;
        }

        /// <summary>
        /// Selects the X axis of the surface, according to the function cases
        /// </summary>
        /// <param name="context">The context used to create the surface</param>
        /// <returns>the X axus if the surface</returns>
        private Parameter SelectXAxisParameter(Interpreter.InterpretationContext context)
        {
            Parameter retVal = null;

            foreach (Case cas in Cases)
            {
                foreach (Parameter parameter in FormalParameters)
                {
                    foreach (Rules.PreCondition preCondition in cas.PreConditions)
                    {
                        if (ExpressionBasedOnParameter(context, parameter, preCondition.ExpressionTree))
                        {
                            if (retVal == null)
                            {
                                retVal = parameter;
                            }
                            else
                            {
                                if (retVal != parameter)
                                {
                                    AddError("Cannot create surface when mixed parameters are used in the function cases");
                                    return null;
                                }
                            }
                        }
                    }
                }
            }

            if (retVal == null)
            {
                retVal = (Parameter)FormalParameters[0];
            }

            return retVal;
        }

        /// <summary>
        /// Selects the Y axis of the surface, according to the X parameter
        /// </summary>
        /// <returns>the Y axis if the surface</returns>
        private Parameter SelectYAxisParameter(Parameter Xparameter)
        {
            Parameter retVal = (Parameter)FormalParameters[0];

            if (retVal == Xparameter)
            {
                retVal = (Parameter)FormalParameters[1];
            }

            return retVal;
        }

        /// <summary>
        /// Provides the surface associated to the function, if any
        /// </summary>
        private Surface surface;

        public Surface Surface
        {
            get
            {
                return surface;
            }
            set
            {
                surface = value;
                if (surface != null)
                {
                    surface.Function = this;
                }
            }
        }

        /// <summary>
        /// Provides the value of the function
        /// </summary>
        /// <param name="instance">the instance on which the function is evaluated</param>
        /// <param name="localScope">the values of local variables</param>
        /// <returns>The value for the function application</returns>
        public virtual Values.IValue Evaluate(Interpreter.InterpretationContext context, Dictionary<string, Values.IValue> actuals)
        {
            Values.IValue retVal = null;

            context.LocalScope.PushContext();
            AssignParameters(context, actuals);
            if (Cases.Count > 0)
            {
                // Statically defined function
                foreach (Case aCase in Cases)
                {
                    if (aCase.EvaluatePreConditions(context))
                    {
                        retVal = aCase.Expression.GetValue(context);
                        break;
                    }
                }
            }
            else if (Surface != null && FormalParameters.Count == 2)
            {
                Parameter formal1 = (Parameter)FormalParameters[0];
                Values.DoubleValue x = actuals[formal1.Name] as Values.DoubleValue;
                Parameter formal2 = (Parameter)FormalParameters[1];
                Values.DoubleValue y = actuals[formal2.Name] as Values.DoubleValue;
                retVal = new Values.DoubleValue(EFSSystem.DoubleType, Surface.Val(x.Val, y.Val));
            }
            else if (Graph != null && FormalParameters.Count < 2)
            {
                if (FormalParameters.Count == 0)
                {
                    retVal = new Values.DoubleValue(EFSSystem.DoubleType, Graph.Val(0));
                }
                else if (FormalParameters.Count == 1)
                {
                    Parameter formal = (Parameter)FormalParameters[0];
                    Values.DoubleValue x = actuals[formal.Name] as Values.DoubleValue;
                    if (x != null)
                    {
                        retVal = new Values.DoubleValue(EFSSystem.DoubleType, Graph.Val(x.Val));
                    }
                    else
                    {
                        AddError("Cannot evaluate value of formal parameter " + formal.Name);
                    }
                }
            }
            context.LocalScope.PopContext();

            return retVal;
        }

        /// <summary>
        /// Creates the graph for a value
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static Graph createGraphForValue(Values.IValue value)
        {
            Graph retVal = new Graph();

            double val = Functions.Function.getDoubleValue(value);
            retVal.addSegment(new Graph.Segment(0, double.MaxValue, new Graph.Segment.Curve(0.0, val, 0.0)));

            return retVal;
        }

        /// <summary>
        /// Caches the declared elements
        /// </summary>
        private Dictionary<string, List<Utils.INamable>> __declaredElements = null;

        /// <summary>
        /// Provides all the parameters declared for this function
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                if (__declaredElements == null)
                {
                    __declaredElements = new Dictionary<string, List<Utils.INamable>>();
                    foreach (Parameter parameter in FormalParameters)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(__declaredElements, parameter);
                    }
                }

                return __declaredElements;
            }
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            ISubDeclaratorUtils.Find(DeclaredElements, name, retVal);
        }

        /// <summary>
        /// Provides an explanation of the function's behaviour
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel)
        {
            string retVal = "";

            retVal =
                  TextualExplainUtilities.Comment(Comment, indentLevel)
                + TextualExplainUtilities.Comment(TextualExplainUtilities.Iterate('-', 6 + Name.Length), indentLevel)
                + TextualExplainUtilities.Pad("{FUNCTION " + Name + "(", indentLevel);

            foreach (Parameter parameter in FormalParameters)
            {
                retVal = retVal + "\\par" + TextualExplainUtilities.Pad(parameter.Name + " : " + parameter.TypeName, indentLevel + 2);
            }

            if (FormalParameters.Count > 0)
            {
                retVal += "\\par";
            }
            retVal = retVal + ") {\\b RETURNS} { \\cf2" + TypeName + "}}\\par";

            foreach (Case cas in Cases)
            {
                retVal = retVal + "\\par"
                    + TextualExplainUtilities.Pad("{\\cf11 // " + cas.Name + "}\\cf1\\par", indentLevel + 2)
                    + cas.getExplain(indentLevel + 2);
            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <param name="explainSubElements">Precises if we need to explain the sub elements (if any)</param>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0);

            return TextualExplainUtilities.Encapsule(retVal);
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Case item = element as Case;
                if (item != null)
                {
                    appendCases(item);
                }
            }
            {
                Parameter item = element as Parameter;
                if (item != null)
                {
                    appendParameters(item);
                }
            }

            base.AddModelElement(element);
        }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="context">The evaluation context</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        public virtual void additionalChecks(ModelElement root, Interpreter.InterpretationContext context, Dictionary<string, Interpreter.Expression> actualParameters)
        {
        }

        /// <summary>
        /// Provides the double value according to the value provided
        /// </summary>
        /// <param name="value"></param>
        /// <returns></returns>
        public static double getDoubleValue(Values.IValue value)
        {
            double retVal = 0;

            if (!(value is Values.EmptyValue))
            {
                Constants.EnumValue enumValue = value as Constants.EnumValue;
                if (enumValue != null)
                {
                    value = enumValue.Value;
                }

                Values.IntValue intValue = value as Values.IntValue;
                if (intValue != null)
                {
                    retVal = (double)intValue.Val;
                }
                else
                {
                    Values.DoubleValue doubleValue = value as Values.DoubleValue;

                    if (doubleValue != null)
                    {
                        retVal = doubleValue.Val;
                    }
                    else if (value != null)
                    {
                        throw new Exception("Value " + value.Name + " cannot be converted to double");
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the parameter whose name matches the string provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Parameter findParameter(string name)
        {
            Parameter retVal = null;

            foreach (Parameter parameter in FormalParameters)
            {
                if (parameter.Name.CompareTo(name) == 0)
                {
                    retVal = parameter;
                    break;
                }
            }

            return retVal;
        }
    }
}