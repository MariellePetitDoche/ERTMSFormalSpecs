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

namespace DataDictionary.Interpreter.ListOperators
{
    public class LastExpression : ConditionBasedListExpression
    {
        /// <summary>
        /// The operator for this expression
        /// </summary>
        public static string OPERATOR = "LAST_IN";

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="listExpression"></param>
        /// <param name="condition"></param>
        /// <param name="root">the root element for which this expression should be parsed</param>
        public LastExpression(ModelElement root, Expression listExpression, Expression condition)
            : base(root, listExpression, condition)
        {
        }

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public override Types.Type GetExpressionType()
        {
            Types.Type retVal = null;

            Types.Collection listType = ListExpression.GetExpressionType() as Types.Collection;
            if (listType != null)
            {
                retVal = listType.Type;
            }
            else
            {
                AddError("Cannot evaluate list type of " + ToString());
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
            Values.IValue retVal = EFSSystem.EmptyValue;

            Values.ListValue value = ListExpression.GetValue(context) as Values.ListValue;
            if (value != null)
            {
                PrepareIteration(context);
                for (int i = value.Val.Count - 1; i >= 0; i--)
                {
                    Values.IValue v = value.Val[i];

                    if (v != EFSSystem.EmptyValue)
                    {
                        IteratorVariable.Value = v;
                        if (conditionSatisfied(context))
                        {
                            retVal = IteratorVariable.Value;
                            break;
                        }
                    }
                    NextIteration();
                }
                EndIteration(context);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the expression text
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            string retVal = OPERATOR + " " + ListExpression.ToString();

            if (Condition != null)
            {
                retVal += " | " + Condition.ToString();
            }

            return retVal;
        }
    }
}
