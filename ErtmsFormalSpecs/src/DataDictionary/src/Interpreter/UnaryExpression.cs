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
namespace DataDictionary.Interpreter
{
    using System;
    using System.Collections.Generic;

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
        /// <param name="expression">The enclosed expression</param>
        /// <param name="unaryOp">the unary operator for this unary expression</parparam>
        public UnaryExpression(ModelElement root, Expression expression, string unaryOp = null)
            : base(root)
        {
            Expression = expression;
            Expression.Enclosing = this;

            UnaryOp = unaryOp;
        }

        /// <summary>
        /// Provides the possible references for this dereference expression (only available during semantic analysis)
        /// </summary>
        /// <param name="instance">the instance on which this element should be found.</param>
        /// <param name="expectation">the expectation on the element found</param>
        /// <param name="last">indicates that this is the last element in a dereference chain</param>
        /// <returns></returns>
        public override ReturnValue getReferences(Utils.INamable instance, Filter.AcceptableChoice expectation, bool last)
        {
            ReturnValue retVal = ReturnValue.Empty;

            if (Term != null)
            {
                retVal = Term.getReferences(instance, expectation, last);
            }
            else
            {
                if (UnaryOp == null)
                {
                    retVal = Expression.getReferences(instance, expectation, last);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the possible references types for this expression (used in semantic analysis)
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <param name="last">indicates that this is the last element in a dereference chain</param>
        /// <returns></returns>
        public override ReturnValue getReferenceTypes(Utils.INamable instance, Filter.AcceptableChoice expectation, bool last)
        {
            ReturnValue retVal = ReturnValue.Empty;

            if (Term != null)
            {
                retVal = Term.getReferenceTypes(instance, expectation, last);
            }
            else
            {
                if (UnaryOp == null)
                {
                    retVal = Expression.getReferenceTypes(instance, expectation, true);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <param name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(Utils.INamable instance, Filter.AcceptableChoice expectation)
        {
            bool retVal = base.SemanticAnalysis(instance, expectation);

            if (retVal)
            {
                if (Term != null)
                {
                    Term.SemanticAnalysis(instance, expectation, true);
                }
                else if (Expression != null)
                {
                    Expression.SemanticAnalysis(instance, expectation);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the ICallable that is statically defined
        /// </summary>
        public override ICallable getStaticCallable()
        {
            ICallable retVal = null;

            if (Term != null)
            {
                retVal = base.getStaticCallable();
            }
            else if (Expression != null)
            {
                retVal = Expression.getStaticCallable();
            }

            return retVal;
        }

        /// <summary>
        /// The model element referenced by this expression.
        /// </summary>
        public override Utils.INamable Ref
        {
            get
            {
                Utils.INamable retVal = null;

                if (Term != null)
                {
                    retVal = Term.Ref;
                }
                else if (Expression != null)
                {
                    if (UnaryOp == null)
                    {
                        retVal = Expression.Ref;
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public override Types.Type GetExpressionType()
        {
            Types.Type retVal = null;

            if (Term != null)
            {
                retVal = Term.GetExpressionType();

                Variables.IProcedure procedure = retVal as Variables.IProcedure;
                if (procedure != null && procedure.CurrentState != null)
                {
                    retVal = procedure.CurrentState.Type;
                }
            }
            else if (Expression != null)
            {
                if (NOT.CompareTo(UnaryOp) == 0)
                {
                    Types.Type type = Expression.GetExpressionType();
                    if (type is Types.BoolType)
                    {
                        retVal = type;
                    }
                    else
                    {
                        AddError("Cannot apply NOT on non boolean types");
                    }
                }
                else if (MINUS.CompareTo(UnaryOp) == 0)
                {
                    Types.Type type = Expression.GetExpressionType();
                    if (type == EFSSystem.IntegerType || type == EFSSystem.DoubleType || type is Types.Range)
                    {
                        retVal = type;
                    }
                    else
                    {
                        AddError("Cannot apply - on non integral types");
                    }
                }
                else
                {
                    retVal = Expression.GetExpressionType();
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the variable referenced by this expression, if any
        /// </summary>
        /// <param name="context">The context on which the variable must be found</param>
        /// <returns></returns>
        public override Variables.IVariable GetVariable(InterpretationContext context)
        {
            Variables.IVariable retVal = null;

            if (Term != null)
            {
                retVal = Term.GetVariable(context);
            }
            else
            {
                AddError("Cannot get variable from expression" + ToString());
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

            if (Term != null)
            {
                retVal = Term.GetValue(context);
            }
            else
            {
                if (NOT.CompareTo(UnaryOp) == 0)
                {
                    Values.BoolValue b = Expression.GetValue(context) as Values.BoolValue;
                    if (b != null)
                    {
                        if (b.Val)
                        {
                            retVal = EFSSystem.BoolType.False;
                        }
                        else
                        {
                            retVal = EFSSystem.BoolType.True;
                        }
                    }
                    else
                    {
                        AddError("Expression " + Expression.ToString() + " does not evaluate to boolean");
                    }
                }
                else if (MINUS.CompareTo(UnaryOp) == 0)
                {
                    Values.IValue val = Expression.GetValue(context);
                    Values.IntValue intValue = val as Values.IntValue;
                    if (intValue != null)
                    {
                        retVal = new Values.IntValue(intValue.Type, -intValue.Val);
                    }
                    else
                    {
                        Values.DoubleValue doubleValue = val as Values.DoubleValue;
                        if (doubleValue != null)
                        {
                            retVal = new Values.DoubleValue(doubleValue.Type, -doubleValue.Val);
                        }
                    }

                    if (retVal == null)
                    {
                        AddError("Cannot negate value for " + Expression.ToString());
                    }
                }
                else
                {
                    retVal = Expression.GetValue(context);
                }
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

            if (Term != null)
            {
                retVal = Term.getCalled(context);
            }
            else if (Expression != null)
            {
                retVal = Expression.getCalled(context);
            }

            // TODO : Investigate why this 
            if (retVal == null)
            {
                retVal = GetValue(context) as ICallable;
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
            if (Term != null)
            {
                Term.fill(retVal, filter);
            }
            if (Expression != null)
            {
                Expression.fill(retVal, filter);
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
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression()
        {
            base.checkExpression();

            if (Term != null)
            {
                Term.checkExpression();
            }
            if (Expression != null)
            {
                Expression.checkExpression();
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

            if (Term != null)
            {
                retVal = Functions.Graph.createGraph(GetValue(context), parameter);
            }
            else if (Expression != null)
            {
                if (UnaryOp == null)
                {
                    retVal = Expression.createGraph(context, parameter);
                }
                else if (UnaryOp == MINUS)
                {
                    retVal = Expression.createGraph(context, parameter);
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
            Functions.Surface retVal = base.createSurface(context, xParam, yParam);

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
