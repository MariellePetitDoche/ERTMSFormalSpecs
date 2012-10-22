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
    public class DerefExpression : BinaryExpression
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="left"></param>
        /// <param name="op"></param>
        /// <param name="right"></param>
        public DerefExpression(ModelElement root, Expression left, Expression right)
            : base(root, left, BinaryExpression.OPERATOR.DOT, right)
        {
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

            ReturnValue leftParts = Left.InnerGetTypedElement(context);
            if (!leftParts.Empty())
            {
                foreach (Utils.INamable leftObject in leftParts.Values)
                {
                    InterpretationContext ctxt = new InterpretationContext(context, leftObject, false);
                    retVal.Merge(Right.InnerGetTypedElement(ctxt));
                }

                if (retVal.Empty())
                {
                    AddError("Cannot find " + Right.ToString() + " in " + Left.ToString());
                }
            }
            else
            {
                AddError("Cannot evaluate " + Left.ToString());
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
            ReturnValue retVal = new ReturnValue();

            ReturnValue leftParts = Left.InnerGetValue(context);
            if (!leftParts.Empty())
            {
                foreach (Utils.INamable leftObject in leftParts.Values)
                {
                    InterpretationContext ctxt = new InterpretationContext(context, leftObject, false);
                    retVal.Merge(Right.InnerGetValue(ctxt));
                }

                if (retVal.Empty())
                {
                    AddError("Cannot find " + Right.ToString() + " in " + Left.ToString());
                }
            }
            else
            {
                AddError("Cannot evaluate " + Left.ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Provides the typed element referenced by this . expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        public Types.ITypedElement getTypedElement(InterpretationContext context)
        {
            Types.ITypedElement retVal = null;

            foreach (Utils.INamable namable in InnerGetValue(context).Values)
            {
                retVal = namable as Types.ITypedElement;
                if (retVal != null)
                {
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Dereferences a namable
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        private Utils.INamable deref(Utils.INamable namable)
        {
            Utils.INamable retVal = namable;

            Functions.Function function = namable as Functions.Function;
            if (function != null)
            {
                retVal = function.Type;
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

            ReturnValue lType = Left.getExpressionTypes(context);
            if (lType.Empty())
            {
                AddError("Cannot determine expression type (4) for " + Left.ToString());
            }
            else
            {
                foreach (Utils.INamable namable in lType.Values)
                {
                    InterpretationContext ctxt = new InterpretationContext(context, deref(namable), false);
                    retVal.Merge(Right.getExpressionTypes(ctxt));
                }

                if (retVal.Empty())
                {
                    AddError("Cannot find " + Right.ToString() + " in " + Left.ToString());
                }
            }

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

            ReturnValue leftParts = Left.InnerGetValue(context);
            if (!leftParts.Empty())
            {
                foreach (Utils.INamable leftObject in leftParts.Values)
                {
                    InterpretationContext ctxt = new InterpretationContext(context, deref(leftObject), false);
                    retVal.Merge(Right.getCalled(ctxt));
                }
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list of element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext ctxt, List<Types.ITypedElement> elements)
        {
            Types.ITypedElement element = getTypedElement(ctxt);
            if (element != null)
            {
                elements.Add(element);
            }
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            foreach (Utils.INamable namable in InnerGetValue(new InterpretationContext(Root)).Values)
            {
                Values.IValue value = namable as Values.IValue;

                if (value != null)
                {
                    retVal.Add(value);
                }
            }
        }

        /// <summary>
        /// Updates the expression text
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public override Expression Update(Values.IValue source, Values.IValue target)
        {
            Expression retVal = this;

            if (ToString().CompareTo(source.LiteralName) == 0)
            {
                Parser parser = new Parser(EFSSystem);
                retVal = parser.Expression(Root, target.LiteralName);
                if (retVal == null)
                {
                    retVal = this;
                }
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

            retVal = Left.ToString() + Image(Operation) + Right.ToString();

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression(InterpretationContext context)
        {
            Left.checkExpression(context);

            ReturnValue lType = Left.getExpressionTypes(context);
            if (lType.Empty())
            {
                AddError("Cannot determine refererence of " + Left.ToString());
            }

            foreach (Utils.INamable namable in lType.Values)
            {
                InterpretationContext ctxt = new InterpretationContext(context, deref(namable), false);
                Right.checkExpression(ctxt);
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

            retVal = Functions.Graph.createGraph(GetValue(context));

            if (retVal == null)
            {
                throw new Exception("Cannot create graph for " + ToString());
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

            retVal = Functions.Graph.createGraph(GetValue(context));

            if (retVal == null)
            {
                throw new Exception("Cannot create graph for " + ToString());
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

            retVal = Functions.Surface.createSurface(GetValue(context), xParam, yParam);

            if (retVal == null)
            {
                throw new Exception("Cannot create surface for " + ToString());
            }

            retVal.XParameter = xParam;
            retVal.YParameter = yParam;

            return retVal;
        }

    }
}
