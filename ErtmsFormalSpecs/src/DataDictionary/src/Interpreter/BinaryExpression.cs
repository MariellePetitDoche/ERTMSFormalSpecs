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
    public class BinaryExpression : Expression
    {
        /// <summary>
        /// The left expression of this expression
        /// </summary>
        public Expression Left { get; private set; }

        /// <summary>
        /// The available operators
        /// </summary>
        public enum OPERATOR { EXP, MULT, DIV, ADD, SUB, EQUAL, NOT_EQUAL, IN, NOT_IN, LESS, LESS_OR_EQUAL, GREATER, GREATER_OR_EQUAL, AND, OR, UNDEF };

        public static OPERATOR[] OperatorsLevel0 = { OPERATOR.OR, };
        public static OPERATOR[] OperatorsLevel1 = { OPERATOR.AND, };
        public static OPERATOR[] OperatorsLevel2 = { OPERATOR.EQUAL, OPERATOR.NOT_EQUAL, OPERATOR.IN, OPERATOR.NOT_IN, OPERATOR.LESS_OR_EQUAL, OPERATOR.GREATER_OR_EQUAL, OPERATOR.LESS, OPERATOR.GREATER, };
        public static OPERATOR[] OperatorsLevel3 = { OPERATOR.ADD, OPERATOR.SUB };
        public static OPERATOR[] OperatorsLevel4 = { OPERATOR.MULT, OPERATOR.DIV };
        public static OPERATOR[] OperatorsLevel5 = { OPERATOR.EXP };
        public static OPERATOR[][] OperatorsByLevel = { OperatorsLevel0, OperatorsLevel1, OperatorsLevel2, OperatorsLevel3, OperatorsLevel4, OperatorsLevel5 };

        /// <summary>
        /// The available operators
        /// </summary>
        public static OPERATOR[] Operators =
        {
            OPERATOR.OR, OPERATOR.AND,
            OPERATOR.EQUAL, OPERATOR.NOT_EQUAL, OPERATOR.IN, OPERATOR.NOT_IN, OPERATOR.LESS_OR_EQUAL, OPERATOR.GREATER_OR_EQUAL, OPERATOR.LESS, OPERATOR.GREATER,
            OPERATOR.ADD, OPERATOR.SUB,
            OPERATOR.MULT, OPERATOR.DIV,
            OPERATOR.EXP
        };

        /// <summary>
        /// The corresponding operator images
        /// </summary>
        public static string[] OperatorsImages =
        {
            "OR", "AND",
            "==", "!=", "in", "not in", "<=", ">=", "<", ">",
            "+", "-",
            "*", "/",
            "^",
            ".",
        };

        /// <summary>
        /// The operation for this expression
        /// </summary>
        public OPERATOR Operation { get; private set; }

        /// <summary>
        /// The right expression of this expression
        /// </summary>
        public Expression Right { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="left"></param>
        /// <param name="op"></param>
        /// <param name="right"></param>
        public BinaryExpression(ModelElement root, Expression left, OPERATOR op, Expression right)
            : base(root)
        {
            Left = left;
            Left.Enclosing = this;

            Operation = op;
            Right = right;
            Right.Enclosing = this;
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
                Left.SemanticAnalysis(instance, Filter.IsRightSide);
                Right.SemanticAnalysis(instance, Filter.IsRightSide);
            }

            return retVal;
        }

        private ICallable __staticCallable = null;

        public override ICallable getStaticCallable()
        {
            if (__staticCallable == null)
            {
                ICallable left = Left.getStaticCallable();
                if (left != null)
                {
                    ICallable right = Right.getStaticCallable();
                    if (right != null)
                    {
                        if (left.FormalParameters.Count == right.FormalParameters.Count)
                        {
                            bool match = true;
                            for (int i = 0; i < left.FormalParameters.Count; i++)
                            {
                                Types.Type leftType = ((Parameter)left.FormalParameters[i]).Type;
                                Types.Type rightType = ((Parameter)right.FormalParameters[i]).Type;
                                if (!leftType.Equals(rightType))
                                {
                                    AddError("Non matching formal parameter type for parameter " + i + " " + leftType + " vs " + rightType);
                                    match = false;
                                }
                            }

                            if (left.ReturnType != right.ReturnType)
                            {
                                AddError("Non matching return types " + left.ReturnType + " vs " + right.ReturnType);
                                match = false;
                            }

                            if (match)
                            {
                                // Create a dummy funciton for type analysis
                                Function function = (Function)Generated.acceptor.getFactory().createFunction();
                                function.Name = ToString();
                                function.ReturnType = left.ReturnType;
                                foreach (Parameter param in left.FormalParameters)
                                {
                                    Parameter parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
                                    parameter.Name = param.Name;
                                    parameter.Type = param.Type;
                                    parameter.Enclosing = function;
                                    function.appendParameters(parameter);
                                }
                                function.Enclosing = Root;
                                __staticCallable = function;
                            }
                        }
                        else
                        {
                            AddError("Invalid number of parameters, " + Left + " and " + Right + " should have the same number of parameters");
                        }
                    }
                    else
                    {
                        // Left is not null, but right is. 
                        // Ensure that right type corresponds to left return type 
                        // and return left
                        Types.Type rightType = Right.GetExpressionType();
                        if (rightType.Match(left.ReturnType))
                        {
                            __staticCallable = left;
                        }
                        else
                        {
                            AddError(Left + "(" + left.ReturnType + " ) does not correspond to " + Right + "(" + rightType + ")");
                        }
                    }
                }
                else
                {
                    ICallable right = Right.getStaticCallable();
                    if (right != null)
                    {
                        // Right is not null, but left is. 
                        // Ensure that left type corresponds to right return type 
                        // and return right
                        Types.Type leftType = Left.GetExpressionType();
                        if ((leftType.Match(right.ReturnType)))
                        {
                            __staticCallable = right;
                        }
                        else
                        {
                            AddError(Left + "(" + leftType + ") does not correspond to " + Right + "(" + right.ReturnType + ")");
                        }
                    }
                }
            }

            return __staticCallable;
        }

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <returns></returns>
        public override Types.Type GetExpressionType()
        {
            Types.Type retVal = null;

            Types.Type leftType = Left.GetExpressionType();
            if (leftType == null)
            {
                AddError("Cannot determine expression type (1) for " + Left.ToString());
            }
            else
            {
                Types.Type rightType = Right.GetExpressionType();
                if (rightType == null)
                {
                    AddError("Cannot determine expression type (2) for " + Right.ToString());
                }
                else
                {
                    switch (Operation)
                    {
                        case OPERATOR.EXP:
                        case OPERATOR.MULT:
                        case OPERATOR.DIV:
                        case OPERATOR.ADD:
                        case OPERATOR.SUB:
                            if (leftType.Match(rightType))
                            {
                                if (leftType is Types.IntegerType || leftType is Types.DoubleType)
                                {
                                    retVal = rightType;
                                }
                                else
                                {
                                    retVal = leftType;
                                }
                            }
                            else
                            {
                                retVal = leftType.CombineType(rightType, Operation);
                            }

                            break;

                        case OPERATOR.AND:
                        case OPERATOR.OR:
                            if (leftType == EFSSystem.BoolType && rightType == EFSSystem.BoolType)
                            {
                                retVal = EFSSystem.BoolType;
                            }
                            break;

                        case OPERATOR.EQUAL:
                        case OPERATOR.NOT_EQUAL:
                        case OPERATOR.LESS:
                        case OPERATOR.LESS_OR_EQUAL:
                        case OPERATOR.GREATER:
                        case OPERATOR.GREATER_OR_EQUAL:
                            if (leftType.Match(rightType) || rightType.Match(leftType))
                            {
                                retVal = EFSSystem.BoolType;
                            }
                            break;

                        case OPERATOR.IN:
                        case OPERATOR.NOT_IN:
                            Types.Collection collection = rightType as Types.Collection;
                            if (collection != null)
                            {
                                if (collection.Type == null)
                                {
                                    retVal = EFSSystem.BoolType;
                                }
                                else if (collection.Type == leftType)
                                {
                                    retVal = EFSSystem.BoolType;
                                }
                            }
                            else
                            {
                                Types.StateMachine stateMachine = rightType as Types.StateMachine;
                                if (stateMachine != null && leftType.Match(stateMachine))
                                {
                                    retVal = EFSSystem.BoolType;
                                }
                            }
                            break;

                        case OPERATOR.UNDEF:
                            break;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Term
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override Values.IValue GetValue(InterpretationContext context)
        {
            Values.IValue retVal = null;
            ExplanationPart previous = SetupExplanation();

            Values.IValue leftValue = null;
            Values.IValue rightValue = null;
            try
            {
                leftValue = Left.GetValue(context);
                if (leftValue != null)
                {
                    switch (Operation)
                    {
                        case OPERATOR.EXP:
                        case OPERATOR.MULT:
                        case OPERATOR.ADD:
                        case OPERATOR.SUB:
                        case OPERATOR.DIV:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = leftValue.Type.PerformArithmericOperation(context, leftValue, Operation, rightValue);
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.AND:
                            {
                                if (leftValue.Type == EFSSystem.BoolType)
                                {
                                    Values.BoolValue lb = leftValue as Values.BoolValue;

                                    if (lb.Val)
                                    {
                                        rightValue = Right.GetValue(context);
                                        if (rightValue != null)
                                        {
                                            if (rightValue.Type == EFSSystem.BoolType)
                                            {
                                                retVal = rightValue as Values.BoolValue;
                                            }
                                            else
                                            {
                                                AddError("Cannot apply an operator " + Operation.ToString() + " on a variable of type " + rightValue.GetType());
                                            }
                                        }
                                        else
                                        {
                                            AddError("Error while computing value for " + Right.ToString());
                                        }
                                    }
                                    else
                                    {
                                        retVal = lb;
                                    }
                                }
                                else
                                {
                                    AddError("Cannot apply an operator " + Operation.ToString() + " on a variable of type " + leftValue.GetType());
                                }
                            }
                            break;

                        case OPERATOR.OR:
                            {
                                if (leftValue.Type == EFSSystem.BoolType)
                                {
                                    Values.BoolValue lb = leftValue as Values.BoolValue;

                                    if (!lb.Val)
                                    {
                                        rightValue = Right.GetValue(context);
                                        if (rightValue != null)
                                        {
                                            if (rightValue.Type == EFSSystem.BoolType)
                                            {
                                                retVal = rightValue as Values.BoolValue;
                                            }
                                            else
                                            {
                                                AddError("Cannot apply an operator " + Operation.ToString() + " on a variable of type " + rightValue.GetType());
                                            }
                                        }
                                        else
                                        {
                                            AddError("Error while computing value for " + Right.ToString());
                                        }
                                    }
                                    else
                                    {
                                        retVal = lb;
                                    }
                                }
                                else
                                {
                                    AddError("Cannot apply an operator " + Operation.ToString() + " on a variable of type " + leftValue.GetType());
                                }
                            }
                            break;

                        case OPERATOR.LESS:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(leftValue.Type.Less(leftValue, rightValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.LESS_OR_EQUAL:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(leftValue.Type.CompareForEquality(leftValue, rightValue) || leftValue.Type.Less(leftValue, rightValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.GREATER:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(leftValue.Type.Greater(leftValue, rightValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.GREATER_OR_EQUAL:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(leftValue.Type.CompareForEquality(leftValue, rightValue) || leftValue.Type.Greater(leftValue, rightValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.EQUAL:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(leftValue.Type.CompareForEquality(leftValue, rightValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.NOT_EQUAL:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(!leftValue.Type.CompareForEquality(leftValue, rightValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.IN:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(rightValue.Type.Contains(rightValue, leftValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;

                        case OPERATOR.NOT_IN:
                            {
                                rightValue = Right.GetValue(context);
                                if (rightValue != null)
                                {
                                    retVal = EFSSystem.GetBoolean(!rightValue.Type.Contains(rightValue, leftValue));
                                }
                                else
                                {
                                    AddError("Error while computing value for " + Right.ToString());
                                }
                            }
                            break;
                    }
                }
                else
                {
                    AddError("Error while computing value for " + Left.ToString());
                }
            }
            catch (Exception e)
            {
                AddError(e.Message);
            }

            if (explain)
            {
                CompleteExplanation(previous, Name + " = " + explainNamable(retVal));
            }

            return retVal;
        }

        /// <summary>
        /// Gets the unbound parameters from the function definition and place holders
        /// </summary>
        /// <param name="context"></param>
        /// <param name="function"></param>
        /// <returns></returns>
        private List<Parameter> getUnboundParameter(InterpretationContext context, Functions.Function function)
        {
            List<Parameter> retVal = new List<Parameter>();

            if (function != null)
            {
                foreach (Parameter formal in function.FormalParameters)
                {
                    Variables.IVariable actual = context.findOnStack(formal);
                    if (actual != null)
                    {
                        Values.PlaceHolder placeHolder = actual.Value as Values.PlaceHolder;
                        if (placeHolder != null)
                        {
                            retVal.Add(formal);
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Gets the unbound parameters from either the surface or the graph of the function
        /// </summary>
        /// <param name="leftFunction"></param>
        /// <returns></returns>
        private List<Parameter> getUnboundParametersFromValue(Function leftFunction)
        {
            List<Parameter> retVal = new List<Parameter>();

            if (leftFunction != null)
            {
                if (leftFunction.Surface != null)
                {
                    retVal.Add(leftFunction.Surface.XParameter);
                    retVal.Add(leftFunction.Surface.YParameter);
                }
                else if (leftFunction.Graph != null)
                {
                    // TODO : Use the parameters from the graph when available
                    retVal.Add((Parameter)leftFunction.FormalParameters[0]);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the called function
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        public override ICallable getCalled(InterpretationContext context)
        {
            ICallable retVal = null;

            Function leftFunction = Left.getCalled(context) as Functions.Function;
            List<Parameter> unboundLeft = getUnboundParameter(context, leftFunction);
            if (leftFunction == null || unboundLeft.Count == 0)
            {
                leftFunction = Left.GetValue(context) as Function;
                unboundLeft = getUnboundParametersFromValue(leftFunction);
            }

            Functions.Function rightFunction = Right.getCalled(context) as Functions.Function;
            List<Parameter> unboundRight = getUnboundParameter(context, rightFunction);
            if (rightFunction == null || unboundRight.Count == 0)
            {
                rightFunction = Right.GetValue(context) as Function;
                unboundRight = getUnboundParametersFromValue(rightFunction);
            }

            int max = Math.Max(unboundLeft.Count, unboundRight.Count);
            if (max == 0)
            {
                if (leftFunction == null)
                {
                    if (rightFunction == null)
                    {
                        retVal = GetValue(context) as ICallable;
                    }
                    else
                    {
                        if (rightFunction.FormalParameters.Count == 1)
                        {
                            retVal = createGraphResult(context, leftFunction, unboundLeft, rightFunction, unboundRight);
                        }
                        else if (rightFunction.FormalParameters.Count == 2)
                        {
                            retVal = createSurfaceResult(context, leftFunction, unboundLeft, rightFunction, unboundRight);
                        }
                        else
                        {
                            retVal = GetValue(context) as ICallable;
                        }
                    }
                }
                else if (rightFunction == null)
                {
                    if (leftFunction.FormalParameters.Count == 1)
                    {
                        retVal = createGraphResult(context, leftFunction, unboundLeft, rightFunction, unboundRight);
                    }
                    else if (leftFunction.FormalParameters.Count == 2)
                    {
                        retVal = createSurfaceResult(context, leftFunction, unboundLeft, rightFunction, unboundRight);
                    }
                    else
                    {
                        retVal = GetValue(context) as ICallable;
                    }
                }
                else
                {
                    retVal = GetValue(context) as ICallable;
                }

                if (retVal == null)
                {
                    AddError("Cannot create ICallable when there are no unbound parameters");
                }
            }
            else if (max == 1)
            {
                retVal = createGraphResult(context, leftFunction, unboundLeft, rightFunction, unboundRight);
            }
            else if (max == 2)
            {
                retVal = createSurfaceResult(context, leftFunction, unboundLeft, rightFunction, unboundRight);
            }
            else
            {
                AddError("Cannot create graph or structure when more that 2 parameters are unbound");
            }

            return retVal;
        }

        /// <summary>
        /// Creates the result as a surface
        /// </summary>
        /// <param name="context"></param>
        /// <param name="leftFunction"></param>
        /// <param name="unboundLeft"></param>
        /// <param name="rightFunction"></param>
        /// <param name="unboundRight"></param>
        /// <returns></returns>
        private ICallable createGraphResult(InterpretationContext context, Functions.Function leftFunction, List<Parameter> unboundLeft, Functions.Function rightFunction, List<Parameter> unboundRight)
        {
            ICallable retVal = null;

            Functions.Graph leftGraph = createGraphForUnbound(context, Left, leftFunction, unboundLeft);
            if (leftGraph != null)
            {
                Functions.Graph rightGraph = createGraphForUnbound(context, Right, rightFunction, unboundRight);

                if (rightGraph != null)
                {
                    retVal = combineGraph(leftGraph, rightGraph).Function;
                }
                else
                {
                    AddError("Cannot create graph for " + Right);
                }
            }
            else
            {
                AddError("Cannot create graph for " + Left);
            }

            return retVal;
        }

        /// <summary>
        /// Creates the result as a surface
        /// </summary>
        /// <param name="context"></param>
        /// <param name="leftFunction"></param>
        /// <param name="unboundLeft"></param>
        /// <param name="rightFunction"></param>
        /// <param name="unboundRight"></param>
        /// <returns></returns>
        private ICallable createSurfaceResult(InterpretationContext context, Functions.Function leftFunction, List<Parameter> unboundLeft, Functions.Function rightFunction, List<Parameter> unboundRight)
        {
            ICallable retVal = null;

            Functions.Surface leftSurface = createSurfaceForUnbound(context, Left, leftFunction, unboundLeft);
            if (leftSurface != null)
            {
                Functions.Surface rightSurface = createSurfaceForUnbound(context, Right, rightFunction, unboundRight);
                if (rightSurface != null)
                {
                    retVal = combineSurface(leftSurface, rightSurface).Function;
                }
                else
                {
                    AddError("Cannot create surface for " + Right);
                }
            }
            else
            {
                AddError("Cannot create surface for " + Left);
            }

            return retVal;
        }

        /// <summary>
        /// Creates the graph for the unbound parameters provided
        /// </summary>
        /// <param name="context"></param>
        /// <param name="expression"></param>
        /// <param name="function"></param>
        /// <param name="unbound"></param>
        /// <returns></returns>
        private Graph createGraphForUnbound(InterpretationContext context, Expression expression, Function function, List<Parameter> unbound)
        {
            Graph retVal = null;

            if (unbound.Count == 0)
            {
                if (function != null && function.FormalParameters.Count > 0)
                {
                    retVal = function.createGraph(context, (Parameter)function.FormalParameters[0]);
                }
                else
                {
                    retVal = Graph.createGraph(expression.GetValue(context), null);
                }
            }
            else
            {
                if (function == null)
                {
                    retVal = expression.createGraph(context, unbound[0]);
                }
                else
                {
                    retVal = function.createGraph(context, unbound[0]);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Creates the graph for the unbount parameters provided
        /// </summary>
        /// <param name="context"></param>
        /// <param name="expression"></param>
        /// <param name="function"></param>
        /// <param name="unbound"></param>
        /// <returns></returns>
        private Surface createSurfaceForUnbound(InterpretationContext context, Expression expression, Function function, List<Parameter> unbound)
        {
            Surface retVal = null;

            if (unbound.Count == 0)
            {
                if (function != null)
                {
                    Parameter xAxis = null;

                    if (function.FormalParameters.Count > 0)
                    {
                        xAxis = (Parameter)function.FormalParameters[0];
                    }
                    Parameter yAxis = null;
                    if (function.FormalParameters.Count > 1)
                    {
                        yAxis = (Parameter)function.FormalParameters[1];
                    }
                    retVal = function.createSurfaceForParameters(context, xAxis, yAxis);
                }
                else
                {
                    retVal = Surface.createSurface(expression.GetValue(context), null, null);
                }
            }
            else if (unbound.Count == 1)
            {
                Graph graph = createGraphForUnbound(context, expression, function, unbound);
                retVal = Surface.createSurface(graph.Function, unbound[0], null);
            }
            else
            {
                if (function == null)
                {
                    retVal = expression.createSurface(context, unbound[0], unbound[1]);
                }
                else
                {
                    retVal = function.createSurfaceForParameters(context, unbound[0], unbound[1]);
                }
            }
            return retVal;
        }


        /// <summary>
        /// Combines two graphs using the operator of this binary expression
        /// </summary>
        /// <param name="leftGraph"></param>
        /// <param name="rightGraph"></param>
        /// <returns></returns>
        private Functions.Graph combineGraph(Functions.Graph leftGraph, Functions.Graph rightGraph)
        {
            Functions.Graph retVal = null;

            switch (Operation)
            {
                case BinaryExpression.OPERATOR.ADD:
                    retVal = leftGraph.AddGraph(rightGraph);
                    break;

                case BinaryExpression.OPERATOR.SUB:
                    retVal = leftGraph.SubstractGraph(rightGraph);
                    break;

                case BinaryExpression.OPERATOR.MULT:
                    retVal = leftGraph.MultGraph(rightGraph);
                    break;

                case BinaryExpression.OPERATOR.DIV:
                    retVal = leftGraph.DivGraph(rightGraph);
                    break;
            }

            return retVal;
        }

        /// <summary>
        /// Combines two surfaces using the operator of this binary expression
        /// </summary>
        /// <param name="leftSurface"></param>
        /// <param name="rightSurface"></param>
        /// <returns></returns>
        private Functions.Surface combineSurface(Functions.Surface leftSurface, Functions.Surface rightSurface)
        {
            Functions.Surface retVal = null;

            switch (Operation)
            {
                case BinaryExpression.OPERATOR.ADD:
                    retVal = leftSurface.AddSurface(rightSurface);
                    break;

                case BinaryExpression.OPERATOR.SUB:
                    retVal = leftSurface.SubstractSurface(rightSurface);
                    break;

                case BinaryExpression.OPERATOR.MULT:
                    retVal = leftSurface.MultiplySurface(rightSurface);
                    break;

                case BinaryExpression.OPERATOR.DIV:
                    retVal = leftSurface.DivideSurface(rightSurface);
                    break;
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
            Left.fill(retVal, filter);
            Right.fill(retVal, filter);
        }

        /// <summary>
        /// Indicates that the expression is an equality of the form variable == literal
        /// </summary>
        /// <returns></returns>
        public bool IsSimpleEquality()
        {
            bool retVal = false;

            if (Operation == OPERATOR.EQUAL)
            {
                retVal = Filter.IsLeftSide(Left.Ref) && Filter.IsLiteral(Right.Ref);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the string representation of the binary expression
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            string retVal = "";

            retVal = Left.ToString();
            retVal += " " + Image(Operation) + " ";
            retVal += Right.ToString();

            return retVal;
        }

        /// <summary>
        /// Provides the image of a given operator
        /// </summary>
        /// <param name="op"></param>
        /// <returns></returns>
        public static string Image(OPERATOR op)
        {
            string retVal = null;

            for (int i = 0; i < Operators.Length; i++)
            {
                if (op == Operators[i])
                {
                    retVal = OperatorsImages[i];
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the image of a given operator
        /// </summary>
        /// <param name="op"></param>
        /// <returns></returns>
        public static string[] Images(OPERATOR[] ops)
        {
            string[] retVal = new string[ops.Length];

            for (int i = 0; i < ops.Length; i++)
            {
                retVal[i] = Image(ops[i]);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the operator, based on its image
        /// </summary>
        /// <param name="op"></param>
        /// <returns></returns>
        public static OPERATOR FindOperatorByName(string op)
        {
            OPERATOR retVal = OPERATOR.UNDEF;

            for (int i = 0; i < Operators.Length; i++)
            {
                if (OperatorsImages[i].CompareTo(op) == 0)
                {
                    retVal = Operators[i];
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression()
        {
            base.checkExpression();

            if (Operation == OPERATOR.EQUAL)
            {
                Types.Type leftType = Left.GetExpressionType();
                Types.Type rightType = Right.GetExpressionType();

                if (leftType is Types.StateMachine && rightType is Types.StateMachine)
                {
                    AddWarning("IN operator should be used instead of == between " + Left.ToString() + " and " + Right.ToString());
                }
            }

            Left.checkExpression();
            Right.checkExpression();
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

            Graph leftGraph = Left.createGraph(context, parameter);
            if (leftGraph != null)
            {
                Graph rightGraph = Right.createGraph(context, parameter);

                if (rightGraph != null)
                {
                    retVal = combineGraph(leftGraph, rightGraph);
                }
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
            Surface retVal = base.createSurface(context, xParam, yParam);

            Surface leftSurface = Left.createSurface(context, xParam, yParam);
            if (leftSurface != null)
            {
                Surface rightSurface = Right.createSurface(context, xParam, yParam);

                if (rightSurface != null)
                {
                    retVal = combineSurface(leftSurface, rightSurface);
                }
            }
            retVal.XParameter = xParam;
            retVal.YParameter = yParam;

            return retVal;
        }

        /// <summary>
        /// Inverses the operator provided
        /// </summary>
        /// <param name="Operator"></param>
        /// <returns></returns>
        public static OPERATOR Inverse(OPERATOR Operator)
        {
            OPERATOR retVal = Operator;

            switch (Operator)
            {
                case OPERATOR.GREATER:
                    retVal = OPERATOR.LESS_OR_EQUAL;
                    break;

                case OPERATOR.GREATER_OR_EQUAL:
                    retVal = OPERATOR.LESS;
                    break;

                case OPERATOR.LESS:
                    retVal = OPERATOR.GREATER_OR_EQUAL;
                    break;

                case OPERATOR.LESS_OR_EQUAL:
                    retVal = OPERATOR.GREATER;
                    break;

                default:
                    throw new Exception("Cannot inverse operator " + Operator);
            }

            return retVal;
        }
    }
}