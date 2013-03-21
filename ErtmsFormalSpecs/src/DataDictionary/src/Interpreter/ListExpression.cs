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
        /// The type of the collection
        /// </summary>
        private Types.Collection ExpressionType { get; set; }

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
                Types.Type elementType = null;

                foreach (Expression expr in ListElements)
                {
                    expr.SemanticAnalysis(instance, expectation);
                    Types.Type current = expr.GetExpressionType();
                    if (elementType == null)
                    {
                        elementType = current;
                    }
                    else
                    {
                        if (current != elementType)
                        {
                            AddError("Cannot mix types " + current.ToString() + " and " + elementType.ToString() + "in collection");
                        }
                    }
                }

                if (elementType != null)
                {
                    ExpressionType = (Types.Collection)Generated.acceptor.getFactory().createCollection();
                    ExpressionType.Type = elementType;
                    ExpressionType.Name = "ListOf_" + elementType.FullName;
                    ExpressionType.Enclosing = Root.EFSSystem;
                }
                else
                {
                    ExpressionType = new Types.GenericCollection(EFSSystem);
                }
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
            return ExpressionType;
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public override Values.IValue GetValue(InterpretationContext context)
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

            Values.IValue retVal = new Values.ListValue(ExpressionType, elements);
            return retVal;
        }

        /// <summary>
        /// Fills the list provided with the element matching the filter provided
        /// </summary>
        /// <param name="retVal">The list to be filled with the element matching the condition expressed in the filter</param>
        /// <param name="filter">The filter to apply</param>
        public override void fill(List<Utils.INamable> retVal, Filter.AcceptableChoice filter)
        {
            foreach (Expression expr in ListElements)
            {
                expr.fill(retVal, filter);
            }
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
    }
}
