using System;
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
using System.Collections.Generic;
using DataDictionary.Values;
using Utils;

namespace DataDictionary.Interpreter
{
    public class ListExpression : Expression
    {
        /// <summary>
        /// The values in the list
        /// </summary>
        public List<Expression> ListElements { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="left"></param>
        /// <param name="op"></param>
        /// <param name="right"></param>
        public ListExpression(ModelElement root, List<Expression> elements)
            : base(root)
        {
            ListElements = elements;

            foreach (Expression expr in ListElements)
            {
                expr.Enclosing = this;
            }
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
                foreach (Expression expr in ListElements)
                {
                    expr.SemanticAnalysis(context, type);
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
        public override INamable InnerGetValue(InterpretationContext context)
        {
            List<IValue> elements = new List<IValue>();
            foreach (Expression expr in ListElements)
            {
                IValue val = expr.GetValue(context);
                if (val != null)
                {
                    elements.Add(val);
                }
                else
                {
                    AddError("Cannot evaluate " + expr.ToString());
                }
            }

            ListValue retVal = new ListValue((Types.Collection)getExpressionType(context), elements);
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
            ReturnValue retVal = new ReturnValue();

            retVal.Add(InnerGetValue(context));

            return retVal;
        }

        /// <summary>
        /// Provides the typed element referenced by this . expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        public Types.ITypedElement getTypedElement(InterpretationContext context)
        {
            Types.ITypedElement retVal = InnerGetValue(context) as Types.ITypedElement;

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
            Types.Type elementType = null;

            foreach (Expression expr in ListElements)
            {
                Types.Type currentType = expr.GetType(context);
                if (elementType == null)
                {
                    elementType = currentType;
                }
                else
                {
                    if (elementType != currentType)
                    {
                        AddError("Cannot mix types " + elementType.ToString() + " and " + currentType.ToString() + "in collection");
                    }
                }
            }

            if (elementType == null)
            {
                retVal.Add(EFSSystem.GenericCollection);
            }
            else
            {
                Types.Collection collectionType = (Types.Collection)Generated.acceptor.getFactory().createCollection();
                collectionType.Type = elementType;
                collectionType.Name = "ListOf_" + elementType.FullName;
                collectionType.Enclosing = Root.EFSSystem;

                retVal.Add(collectionType);
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

            foreach (Expression expr in ListElements)
            {
                expr.Elements(ctxt, elements);
            }
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            Values.IValue value = InnerGetValue(new InterpretationContext(Root)) as Values.IValue;
            if (value != null)
            {
                retVal.Add(value);
            }

            foreach (Expression expr in ListElements)
            {
                expr.fillLiterals(retVal);
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

            foreach (Expression expr in ListElements)
            {
                expr.Update(source, target);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the string representation of the binary expression
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            string retVal = "[";

            bool first = true;
            foreach (Expression expr in ListElements)
            {
                if (!first)
                {
                    retVal += ", ";
                }
                retVal += expr.ToString();

                first = false;
            }
            retVal += "]";

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression(InterpretationContext context)
        {
            foreach (Expression expr in ListElements)
            {
                expr.checkExpression(context);
            }
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            throw new Exception("Cannot create graph for " + ToString());
        }

        /// <summary>
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public override Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter)
        {
            throw new Exception("Cannot create graph for " + ToString());
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
            throw new Exception("Cannot create surface for " + ToString());
        }
    }
}
