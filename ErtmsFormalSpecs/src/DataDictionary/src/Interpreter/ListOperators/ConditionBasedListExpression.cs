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
        /// <param name="context"></param>
        /// <paraparam name="type">Indicates whether we are looking for a type or a value</paraparam>
        public override bool SemanticAnalysis(InterpretationContext context, bool type)
        {
            bool retVal = base.SemanticAnalysis(context, type);

            if (retVal)
            {
                if (Condition != null)
                {
                    PrepareIteration(context);
                    Condition.SemanticAnalysis(context, false);
                    EndIteration(context);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list of typed element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext context, List<Types.ITypedElement> elements)
        {
            base.Elements(context, elements);
            if (Condition != null)
            {
                Condition.Elements(context, elements);
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
        /// Updates the expression by replacing source by target
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public override Expression Update(Values.IValue source, Values.IValue target)
        {
            if (Condition != null)
            {
                Condition = Condition.Update(source, target);
            }

            return base.Update(source, target);
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
                InterpretationContext ctxt = new InterpretationContext(context, true);
                Values.BoolValue b = Condition.GetValue(ctxt) as Values.BoolValue;
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
        public override void checkExpression(InterpretationContext context)
        {
            PrepareIteration(context);

            Types.Type conditionType = null;
            if (Condition != null)
            {
                foreach (ReturnValueElement elem in Condition.getExpressionTypes(context).Values)
                {
                    conditionType = elem.Value as Types.BoolType;
                    if (conditionType != null)
                    {
                        break;
                    }
                }
                if (conditionType == null)
                {
                    AddError("Conditions on list expressions should be a predicate (return a boolean value)");
                }
            }
            EndIteration(context);

            base.getExpressionType(context);
        }
    }
}
