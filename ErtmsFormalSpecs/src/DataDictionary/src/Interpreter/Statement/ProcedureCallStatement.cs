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
using Utils;

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
        /// <param name="context"></param>
        public override void SemanticalAnalysis(InterpretationContext context)
        {
            base.SemanticalAnalysis(context);

            Call.SemanticAnalysis(context, false);
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
        /// Provides the statement which modifies the element
        /// </summary>
        /// <param name="element"></param>
        /// <returns>null if no statement modifies the element</returns>
        public override VariableUpdateStatement Modifies(Types.ITypedElement element)
        {
            VariableUpdateStatement retVal = null;

            foreach (Rules.Action action in Actions)
            {
                retVal = action.Modifies(element);
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
            bool prev = ModelElement.PerformLog;
            ModelElement.PerformLog = false;
            try
            {
                foreach (Rules.Action action in Actions)
                {
                    if (action.Statement != null)
                    {
                        action.Statement.UpdateStatements(retVal);
                    }
                }
            }
            finally
            {
                ModelElement.PerformLog = prev;
            }
        }

        /// <summary>
        /// Indicates whether this statement reads the element
        /// </summary>
        /// <param name="element"></param>
        /// <returns></returns>
        public override bool Reads(Types.ITypedElement element)
        {
            foreach (Rules.Action action in Actions)
            {
                if (action.Reads(element))
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
            if (false && deref != null)
            {
                INamable namable = Call.Called.GetValue(context) as INamable;
                retVal = new InterpretationContext(context, namable);
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
            Call.checkExpression(context);
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
        /// <param name="instance">The instance on which the expression should be evaluated</param>
        /// <param name="retVal">the list to fill with changes</param>
        public override void GetChanges(InterpretationContext context, List<Rules.Change> retVal, Interpreter.ExplanationPart explanation)
        {
            if (Call != null)
            {
                InterpretationContext ctxt = getContext(context);
                DataDictionary.Variables.IProcedure procedure = Call.getProcedure(ctxt);
                if (procedure != null)
                {
                    ExplanationPart part = new ExplanationPart();
                    part.Message = procedure.FullName;
                    explanation.SubExplanations.Add(part);

                    ctxt.LocalScope.PushContext();
                    foreach (KeyValuePair<string, Values.IValue> pair in Call.AssignParameterValues(context, procedure, true))
                    {
                        Parameter param = procedure.getFormalParameter(pair.Key);
                        param.Value = pair.Value;
                        ctxt.LocalScope.setVariable(param);
                    }

                    foreach (Rules.Rule rule in Rules)
                    {
                        List<Rules.Change> tmp = new List<Rules.Change>();

                        ApplyRule(rule, tmp, ctxt, part);
                        foreach (Rules.Change change in tmp)
                        {
                            change.Apply();
                        }

                        retVal.AddRange(tmp);
                    }

                    ctxt.LocalScope.PopContext();
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
        /// <param name="retVal"></param>
        /// <param name="ctxt"></param>
        private void ApplyRule(Rules.Rule rule, List<Rules.Change> retVal, InterpretationContext ctxt, ExplanationPart explanation)
        {
            foreach (Rules.RuleCondition condition in rule.RuleConditions)
            {
                if (condition.EvaluatePreConditions(ctxt))
                {
                    foreach (Rules.Action action in condition.Actions)
                    {
                        action.GetChanges(ctxt, retVal, explanation);
                    }

                    foreach (Rules.Rule subRule in condition.SubRules)
                    {
                        ApplyRule(subRule, retVal, ctxt, explanation);
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
