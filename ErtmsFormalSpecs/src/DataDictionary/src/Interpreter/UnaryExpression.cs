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
    public class UnaryExpression : Expression
    {
        /// <summary>
        /// The term of this expression
        /// </summary>
        public Term Term { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root for which this expression should be evaluated</param>
        /// <param name="term"></parparam>
        public UnaryExpression(ModelElement root, Term term)
            : base(root)
        {
            Term = term;
            Term.Enclosing = this;
        }

        /// <summary>
        /// The expression for the unary op
        /// </summary>
        public Expression Expression { get; private set; }

        /// <summary>
        /// The unary operator used
        /// </summary>
        public string UnaryOp { get; private set; }

        /// <summary>
        /// The not operator
        /// </summary>
        public static string NOT = "NOT";
        public static string MINUS = "-";
        public static string[] UNARY_OPERATORS = { NOT, MINUS };


        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root for which this expression should be evaluated</param>
        /// <param name="unaryOp">the unary operator for this unary expression</parparam>
        public UnaryExpression(ModelElement root, string unaryOp, Expression expression)
            : base(root)
        {
            Expression = expression;
            Expression.Enclosing = this;

            UnaryOp = unaryOp;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root for which this expression should be evaluated</param>
        /// <param name="unaryOp">the unary operator for this unary expression</parparam>
        public UnaryExpression(ModelElement root, Expression expression)
            : base(root)
        {
            Expression = expression;
            Expression.Enclosing = this;

            UnaryOp = null;
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
            ReturnValue retVal = new ReturnValue();

            if (Term != null)
            {
                retVal = Term.GetTypedElement(context);
            }
            else if (Expression != null)
            {
                retVal.Add(Expression.GetTypedElement(context));
            }

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
            ReturnValue retVal;

            if (Term != null)
            {
                retVal = Term.GetValue(context);
            }
            else
            {
                if (NOT.CompareTo(UnaryOp) == 0)
                {
                    retVal = new ReturnValue();
                    Values.BoolValue b = Expression.GetValue(context) as Values.BoolValue;
                    if (b != null)
                    {
                        if (b.Val)
                        {
                            retVal.Add(EFSSystem.BoolType.False);
                        }
                        else
                        {
                            retVal.Add(EFSSystem.BoolType.True);
                        }
                    }
                }
                else if (MINUS.CompareTo(UnaryOp) == 0)
                {
                    retVal = new ReturnValue();
                    Values.IValue val = Expression.GetValue(context);
                    Values.IntValue intValue = val as Values.IntValue;
                    if (intValue != null)
                    {
                        retVal.Add(new Values.IntValue(intValue.Type, -intValue.Val));
                    }
                    else
                    {
                        Values.DoubleValue doubleValue = val as Values.DoubleValue;
                        if (doubleValue != null)
                        {
                            retVal.Add(new Values.DoubleValue(doubleValue.Type, -doubleValue.Val));
                        }
                    }
                }
                else
                {
                    retVal = Expression.InnerGetValue(context);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list of element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext context, List<Types.ITypedElement> elements)
        {
            if (Term != null)
            {
                Term.TypedElements(context, elements);
            }
            if (Expression != null)
            {
                Expression.Elements(context, elements);
            }
        }

        public override string ToString()
        {
            string retVal = "";

            if (Term != null)
            {
                retVal = Term.ToString();
            }
            else
            {
                if (UnaryOp != null)
                {
                    retVal = UnaryOp + " " + Expression.ToString();
                }
                else
                {
                    retVal = "(" + Expression.ToString() + ")";
                }
            }

            return retVal;
        }


        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            if (Term != null && Term.LiteralValue != null)
            {
                retVal.Add(Term.LiteralValue);
            }
            else if (Expression != null)
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
            if (Term != null)
            {
                Term.Update(source, target);
            }
            else if (Expression != null)
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

            if (context.Instance is Types.StateMachine)
            {
                retVal.Add(context.Instance as Types.StateMachine);
            }
            else
            {
                if (Term != null)
                {
                    foreach (Utils.INamable namable in Term.GetTypedElement(context).Values)
                    {
                        Types.ITypedElement element = namable as Types.ITypedElement;
                        if (element != null)
                        {
                            retVal.Add(element.Type);
                        }
                        else
                        {
                            Variables.Procedure procedure = namable as Variables.Procedure;
                            if (procedure != null && procedure.CurrentState != null)
                            {
                                retVal.Add(procedure.CurrentState.Type);
                            }
                            else
                            {
                                retVal.Add(namable);
                            }
                        }
                    }
                }
                else if (Expression != null)
                {
                    if (NOT.CompareTo(UnaryOp) == 0)
                    {
                        InterpretationContext ctxt = new InterpretationContext(context, true);
                        foreach (Utils.INamable namable in Expression.getExpressionTypes(ctxt).Values)
                        {
                            Types.Type type = namable as Types.Type;
                            if (type is Types.BoolType)
                            {
                                retVal.Add(type);
                            }
                            else
                            {
                                AddError("Cannot apply NOT on non boolean types");
                            }
                        }
                    }
                    else if (MINUS.CompareTo(UnaryOp) == 0)
                    {
                        InterpretationContext ctxt = new InterpretationContext(context, true);
                        foreach (Utils.INamable namable in Expression.getExpressionTypes(ctxt).Values)
                        {
                            Types.Type type = namable as Types.Type;
                            if (type == EFSSystem.IntegerType || type == EFSSystem.DoubleType || type is Types.Range)
                            {
                                retVal.Add(type);
                            }
                            else
                            {
                                AddError("Cannot apply - on non integral types");
                            }
                        }
                    }
                    else
                    {
                        retVal = Expression.getExpressionTypes(context);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression(InterpretationContext context)
        {
            base.getExpressionType(context);
            if (Expression != null)
            {
                Expression.checkExpression(context);
            }
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            Functions.Graph retVal = Functions.Graph.createGraph(GetValue(context));

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

            if (Term != null)
            {
                retVal = Functions.Graph.createGraph(GetValue(context));
            }
            else if (Expression != null)
            {
                if (UnaryOp == null)
                {
                    retVal = Expression.createGraphForParameter(context, parameter);
                }
                else if (UnaryOp == MINUS)
                {
                    retVal = Expression.createGraphForParameter(context, parameter);
                    retVal.Negate();
                }
                else
                {
                    throw new Exception("Cannot create graph where NOT operator is defined");
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
            Functions.Surface retVal = null;

            if (Term != null)
            {
                retVal = Functions.Surface.createSurface(xParam, yParam, GetValue(context));
            }
            else if (Expression != null)
            {
                if (UnaryOp == null)
                {
                    retVal = Expression.createSurface(context, xParam, yParam);
                }
                else
                {
                    if (UnaryOp == MINUS)
                    {
                        retVal = Expression.createSurface(context, xParam, yParam);
                        retVal.Negate();
                    }
                    else
                    {
                        AddError("Cannot create surface with unary op " + UnaryOp);
                    }
                }
            }

            retVal.XParameter = xParam;
            retVal.YParameter = yParam;

            return retVal;
        }
    }
}
