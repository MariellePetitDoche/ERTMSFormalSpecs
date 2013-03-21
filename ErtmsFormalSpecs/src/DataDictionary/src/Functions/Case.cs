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
using DataDictionary.Interpreter;
using DataDictionary.Rules;

namespace DataDictionary.Functions
{
    public class Case : Generated.Case, TextualExplain
    {
        private Expression expression;

        /// <summary>
        /// The enclosing function
        /// </summary>
        public Function EnclosingFunction
        {
            get { return Enclosing as Function; }
        }


        /// <summary>
        /// Pre-conditions of the case
        /// </summary>
        public System.Collections.ArrayList PreConditions
        {
            get
            {
                System.Collections.ArrayList retVal = allPreConditions();
                if (retVal == null)
                    retVal = new System.Collections.ArrayList();
                return retVal;
            }
            set { this.setAllPreConditions(value); }
        }

        /// <summary>
        /// Expression of the case as string
        /// </summary>
        public override string ExpressionText
        {
            get
            {
                if (getExpression() == null)
                {
                    setExpression("");
                }
                return getExpression();
            }
            set { setExpression(value); expression = null; }
        }

        /// <summary>
        /// Expression of the case
        /// </summary>
        public Expression Expression
        {
            get
            {
                if (expression == null)
                {
                    expression = EFSSystem.Parser.Expression(EnclosingFunction, ExpressionText);
                }
                return expression;
            }
            set { expression = value; }
        }

        /// <summary>
        /// The enclosing collection of the parameter
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                return Utils.EnclosingFinder<Functions.Function>.find(this).Cases;
            }
        }

        /// <summary>
        /// Expression of the case
        /// </summary>
        public bool EvaluatePreConditions(InterpretationContext context)
        {
            bool retVal = true;
            foreach (DataDictionary.Rules.PreCondition preCondition in PreConditions)
            {
                Interpreter.Expression expression = preCondition.ExpressionTree;
                Values.BoolValue value = expression.GetValue(context) as Values.BoolValue;

                if (value != null)
                {
                    retVal = retVal && value.Val;
                }
                else
                {
                    retVal = false;
                }

                if (!retVal)
                {
                    break;
                }
            }
            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel)
        {
            string retVal = "";

            if (PreConditions.Count > 0)
            {
                bool first = true;
                foreach (Rules.PreCondition preCondition in PreConditions)
                {
                    if (first)
                    {
                        retVal = retVal + TextualExplainUtilities.Pad(preCondition.getExplain(true), indentLevel);
                        first = false;
                    }
                    else
                    {
                        retVal = retVal + " {\\b AND} " + preCondition.getExplain(true);
                    }
                }
                if (!first)
                {
                    retVal = retVal + " {\\b => }\\par";
                }

                if (Expression != null)
                {
                    retVal = retVal + TextualExplainUtilities.Pad((ExpressionText != "" ? Expression.ToString() : "UndefinedExpression") + "\\par", indentLevel + 2);
                }

            }
            else
            {
                retVal = retVal + TextualExplainUtilities.Pad("{\\b => }", indentLevel);
                try
                {
                    if (Expression != null)
                    {
                        retVal = retVal + (ExpressionText != "" ? Expression.ToString() : "UndefinedExpression") + "\\par";
                    }
                }
                catch (Exception)
                {
                }
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
                Rules.PreCondition item = element as Rules.PreCondition;
                if (item != null)
                {
                    appendPreConditions(item);
                }
            }
        }


        public bool Read(Types.ITypedElement variable)
        {
            bool retVal = false;

            foreach (PreCondition preCondition in PreConditions)
            {
                if (preCondition.Reads(variable))
                {
                    retVal = true;
                    break;
                }
            }

            if (!retVal && Expression != null)
            {
                foreach (Variables.IVariable var in Expression.GetVariables())
                {
                    if (var == variable)
                    {
                        retVal = true;
                        break;
                    }
                }
            }

            return retVal;
        }

        public List<Values.IValue> GetLiterals()
        {
            List<Values.IValue> retVal = new List<Values.IValue>();

            foreach (PreCondition preCondition in PreConditions)
            {
                if (preCondition.ExpressionTree != null)
                {
                    retVal.AddRange(preCondition.ExpressionTree.GetLiterals());
                }
            }

            if (expression != null)
            {
                retVal.AddRange(Expression.GetLiterals());
            }

            return retVal;
        }
    }
}
