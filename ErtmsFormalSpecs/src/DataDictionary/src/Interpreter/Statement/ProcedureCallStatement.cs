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
using DataDictionary.Rules;

namespace DataDictionary.Interpreter.Statement
{
    public class ProcedureCallStatement : Statement
    {
        /// <summary>
        /// The designator which identifies the procedure to call
        /// </summary>
        public Call Call { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        /// <param name="call">The corresponding function call designator</param>
        /// <param name="parameters">The expressions used to compute the parameters</param>
        public ProcedureCallStatement(ModelElement root, Call call)
            : base(root)
        {
            Call = call;
            Call.Enclosing = this;
        }

        /// <summary>
        /// Performs the semantic analysis of the statement
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(Utils.INamable instance)
        {
            bool retVal = base.SemanticAnalysis(instance);

            if (retVal)
            {
                Call.SemanticAnalysis(instance);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the rules associates to this procedure call statement
        /// </summary>
        public System.Collections.ArrayList Rules
        {
            get
            {
                InterpretationContext ctxt = getContext(new InterpretationContext(Root));
                if (Call != null)
                {
                    Variables.IProcedure procedure = Call.getProcedure(ctxt);
                    if (procedure != null)
                    {
                        return procedure.Rules;
                    }
                }

                return new System.Collections.ArrayList();
            }
        }

        /// <summary>
        /// Provides the list of actions performed during this procedure call
        /// </summary>
        public List<Rules.Action> Actions
        {
            get
            {
                List<Rules.Action> retVal = new List<Rules.Action>();

                foreach (Rules.Rule rule in Rules)
                {
                    foreach (Rules.RuleCondition condition in rule.RuleConditions)
                    {
                        foreach (Rules.Action action in condition.Actions)
                        {
                            retVal.Add(action);
                        }
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the statement which modifies the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>null if no statement modifies the element</returns>
        public override VariableUpdateStatement Modifies(Types.ITypedElement variable)
        {
            VariableUpdateStatement retVal = null;

            foreach (Rules.Action action in Actions)
            {
                retVal = action.Modifies(variable);
                if (retVal != null)
                {
                    return retVal;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the list of update statements induced by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void UpdateStatements(List<VariableUpdateStatement> retVal)
        {
            foreach (Rules.Action action in Actions)
            {
                if (action.Statement != null)
                {
                    action.Statement.UpdateStatements(retVal);
                }
            }
        }

        /// <summary>
        /// Indicates whether this statement reads the element
        /// </summary>
        /// <param name="variable"></param>
        /// <returns></returns>
        public override bool Reads(Types.ITypedElement variable)
        {
            foreach (Rules.Action action in Actions)
            {
                if (action.Reads(variable))
                {
                    return true;
                }
            }

            return false;
        }

        /// <summary>
        /// Provides the list of elements read by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void ReadElements(List<Types.ITypedElement> retVal)
        {
            foreach (Rules.Action action in Actions)
            {
                if (action.Statement != null)
                {
                    action.Statement.ReadElements(retVal);
                }
            }
        }

        /// <summary>
        /// Provides the context on which function evaluation should be performed
        /// </summary>
        /// <param name="context"></param>
        /// <returns></returns>
        private InterpretationContext getContext(InterpretationContext context)
        {
            InterpretationContext retVal = context;

            DerefExpression deref = Call.Called as DerefExpression;
            if (deref != null)
            {
                Values.IValue value = deref.GetPrefixValue(context, deref.Arguments.Count - 1) as Values.IValue;
                if (value != null)
                {
                    retVal = new InterpretationContext(context, value);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Checks the statement for semantical errors
        /// </summary>
        public override void CheckStatement()
        {
            InterpretationContext context = getContext(new InterpretationContext(Root));
            CheckStatement(context);
        }

        /// <summary>
        /// Checks the statement for semantical errors
        /// </summary>
        public void CheckStatement(InterpretationContext context)
        {
            Call.checkExpression();
            if (Call != null)
            {
                DataDictionary.Variables.IProcedure procedure = Call.getProcedure(context);
                if (procedure != null)
                {

                }
                else
                {
                    Root.AddError("Cannot determine called procedure (2)");
                }
            }
            else
            {
                Root.AddError("Cannot determine called procedure (1)");

            }
        }

        /// <summary>
        /// Provides the changes performed by this statement
        /// </summary>
        /// <param name="context">The context on which the changes should be computed</param>
        /// <param name="changes">The list to fill with the changes</param>
        /// <param name="explanation">The explanatino to fill, if any</param>
        /// <param name="apply">Indicates that the changes should be applied immediately</param>
        public override void GetChanges(InterpretationContext context, ChangeList changes, ExplanationPart explanation, bool apply)
        {
            if (Call != null)
            {
                InterpretationContext ctxt = getContext(context);
                DataDictionary.Variables.IProcedure procedure = Call.getProcedure(ctxt);
                if (procedure != null)
                {
                    ExplanationPart part = new ExplanationPart(Root);
                    part.Message = procedure.FullName;
                    explanation.SubExplanations.Add(part);

                    int token = ctxt.LocalScope.PushContext();
                    foreach (KeyValuePair<Variables.Actual, Values.IValue> pair in Call.AssignParameterValues(context, procedure, true))
                    {
                        ctxt.LocalScope.setVariable(pair.Key, pair.Value);
                    }

                    foreach (Rules.Rule rule in Rules)
                    {
                        ApplyRule(rule, changes, ctxt, part);
                    }

                    ctxt.LocalScope.PopContext(token);
                }
                else
                {
                    AddError("Cannot determine the called procedure for " + ToString());
                }
            }
            else
            {
                AddError("Expression " + ToString() + " is not a valid procedure call");
            }
        }

        /// <summary>
        /// Applies a rule defined in a procedure
        /// </summary>
        /// <param name="rule"></param>
        /// <param name="changes"></param>
        /// <param name="ctxt"></param>
        private void ApplyRule(Rules.Rule rule, ChangeList changes, InterpretationContext ctxt, ExplanationPart explanation)
        {
            foreach (Rules.RuleCondition condition in rule.RuleConditions)
            {
                if (condition.EvaluatePreConditions(ctxt))
                {
                    foreach (Rules.Action action in condition.Actions)
                    {
                        action.GetChanges(ctxt, changes, explanation, true);
                    }

                    foreach (Rules.Rule subRule in condition.SubRules)
                    {
                        ApplyRule(subRule, changes, ctxt, explanation);
                    }
                    break;
                }
            }
        }

        public override string ToString()
        {
            return Call.ToString();
        }
    }
}
