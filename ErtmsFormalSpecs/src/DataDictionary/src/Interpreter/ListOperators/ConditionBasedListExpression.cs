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

namespace DataDictionary.Interpreter.ListOperators
{
    public abstract class ConditionBasedListExpression : ListOperatorExpression
    {
        /// <summary>
        /// The condition used for THERE_IS, FORALL, FIRST, LAST
        /// </summary>
        public Expression Condition { get; private set; }

        /// <summary>
        /// Constructor for THERE_IS, FORALL, FIRST, LAST
        /// </summary>
        /// <param name="listExpression"></param>
        /// <param name="condition"></param>
        /// <param name="root">the root element for which this expression should be parsed</param>
        public ConditionBasedListExpression(ModelElement root, Expression listExpression, Expression condition)
            : base(root, listExpression)
        {
            Condition = condition;
            if (Condition != null)
            {
                Condition.Enclosing = this;
            }
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(Utils.INamable instance, AcceptableChoice expectation)
        {
            bool retVal = base.SemanticAnalysis(instance, expectation);

            if (retVal)
            {
                if (Condition != null)
                {
                    Condition.SemanticAnalysis(instance, expectation);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list of variables used by this expression
        /// </summary>
        /// <context></context>
        /// <param name="variables"></param>
        public override void FillVariables(InterpretationContext context, List<Variables.IVariable> variables)
        {
            base.FillVariables(context, variables);
            if (Condition != null)
            {
                Condition.FillVariables(context, variables);
            }
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            base.fillLiterals(retVal);
            if (Condition != null)
            {
                Condition.fillLiterals(retVal);
            }
        }

        /// <summary>
        /// Indicates whether the condition is satisfied with the value provided
        /// Hyp : the value of the iterator variable has been assigned before
        /// </summary>
        /// <returns></returns>
        public bool conditionSatisfied(InterpretationContext context)
        {
            bool retVal = true;

            if (Condition != null)
            {
                Values.BoolValue b = Condition.GetValue(context) as Values.BoolValue;
                if (b == null)
                {
                    retVal = false;
                }
                else
                {
                    retVal = b.Val;
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

            Types.Type conditionType = null;
            if (Condition != null)
            {
                conditionType = Condition.GetExpressionType() as Types.BoolType;
                if (conditionType == null)
                {
                    AddError("Conditions on list expressions should be a predicate (return a boolean value)");
                }
            }
        }
    }
}
