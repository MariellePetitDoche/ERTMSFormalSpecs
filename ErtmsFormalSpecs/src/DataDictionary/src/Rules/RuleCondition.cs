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

namespace DataDictionary.Rules
{
    public class RuleCondition : Generated.RuleCondition, TextualExplain
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public RuleCondition()
        {
        }

        /// <summary>
        /// Indicates if this RuleCondition contains implemented sub-elements
        /// </summary>
        public override bool ImplementationPartiallyCompleted
        {
            get
            {
                if (getImplemented())
                {
                    return true;
                }

                foreach (DataDictionary.Rules.Rule rule in SubRules)
                {
                    if (rule.ImplementationPartiallyCompleted)
                    {
                        return true;
                    }
                }

                return false;
            }
        }

        /// <summary>
        /// Provides the preconditions associated to this rule condition
        /// </summary>
        public System.Collections.ArrayList PreConditions
        {
            get
            {
                if (allPreConditions() == null)
                {
                    setAllPreConditions(new System.Collections.ArrayList());
                }
                return allPreConditions();
            }
            set { setAllPreConditions(value); }
        }

        /// <summary>
        /// Provides the set of preconditions (both local and from the eclosing rules)
        /// </summary>
        public List<PreCondition> AllPreConditions
        {
            get
            {
                List<PreCondition> retVal = new List<PreCondition>();

                RuleCondition current = this;
                while (current != null)
                {
                    foreach (PreCondition preCondition in current.PreConditions)
                    {
                        retVal.Add(preCondition);
                    }

                    // TODO : Also add the negation of the preceding rule conditions
                    current = current.EnclosingRule.EnclosingRuleCondition;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the actions associated to this rule condition
        /// </summary>
        public System.Collections.ArrayList Actions
        {
            get
            {
                if (allActions() == null)
                {
                    setAllActions(new System.Collections.ArrayList());
                }
                return allActions();
            }
            set { setAllActions(value); }
        }

        /// <summary>
        /// Provides the sub rules associated to this rule condition
        /// </summary>
        public System.Collections.ArrayList SubRules
        {
            get
            {
                if (allSubRules() == null)
                {
                    setAllSubRules(new System.Collections.ArrayList());
                }
                return allSubRules();
            }
            set { setAllSubRules(value); }
        }

        /// <summary>
        /// Provides the enclosing rule
        /// </summary>
        public Rule EnclosingRule { get { return getFather() as Rules.Rule; } }

        /// <summary>
        /// Provides the enclosing structure
        /// </summary>
        public Types.Structure EnclosingStructure { get { return Utils.EnclosingFinder<Types.Structure>.find(this); } }

        /// <summary>
        /// Provides the enclosing collection
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return EnclosingRule.RuleConditions; }
        }

        /// <summary>
        /// Indicates whether this rule uses the typed element
        /// </summary>
        /// <param name="variable"></param>
        /// <returns></returns>
        public bool Uses(Variables.IVariable variable)
        {
            bool prev = ModelElement.PerformLog;
            ModelElement.PerformLog = false;
            try
            {
                return Modifies(variable) != null || Reads(variable);
            }
            finally
            {
                ModelElement.PerformLog = prev;
            }
        }

        /// <summary>
        /// Provides the statement which modifies the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>null if no statement modifies the element</returns>
        public Interpreter.Statement.VariableUpdateStatement Modifies(Types.ITypedElement variable)
        {
            Interpreter.Statement.VariableUpdateStatement retVal = null;

            bool prev = ModelElement.PerformLog;
            ModelElement.PerformLog = false;
            try
            {
                foreach (Action action in Actions)
                {
                    retVal = action.Modifies(variable);
                    if (retVal != null)
                    {
                        return retVal;
                    }
                }
            }
            finally
            {
                ModelElement.PerformLog = prev;
            }

            return retVal;
        }


        /// <summary>
        /// Indicates whether this rule reads the content of this variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns></returns>
        public bool Reads(Types.ITypedElement variable)
        {
            foreach (PreCondition precondition in PreConditions)
            {
                if (precondition.Reads(variable))
                {
                    return true;
                }
            }

            foreach (Action action in Actions)
            {
                if (action.Reads(variable))
                {
                    return true;
                }
            }

            return false;
        }


        /// <summary>
        /// Evaluates the rule and its sub rules
        /// </summary>
        /// <param name="runner"></param>
        /// <param name="priority">the priority level : a rule can be activated only if its priority level == priority</param>
        /// <param name="instance">The instance on which the rule must be evaluated</param>
        /// <param name="ruleConditions">the rule conditions to be activated</param>
        /// <returns>the number of actions that were activated during this evaluation</returns>
        public bool Evaluate(Tests.Runner.Runner runner, Generated.acceptor.RulePriority priority, Utils.IModelElement instance, List<RuleCondition> ruleConditions)
        {
            bool retVal = false;

            Interpreter.InterpretationContext context = new Interpreter.InterpretationContext(instance);
            retVal = EvaluatePreConditions(context);

            if (retVal)
            {
                foreach (Rule subRule in SubRules)
                {
                    subRule.Evaluate(runner, priority, instance, ruleConditions);
                }

                if (EnclosingRule.getPriority() == priority)
                {
                    ruleConditions.Add(this);
                }
            }


            return retVal;
        }

        /// <summary>
        /// Provides the actual value for the preconditions
        /// </summary>
        /// <param name="context">The context on which the precondition must be evaluated</param>
        /// <returns></returns>
        public bool EvaluatePreConditions(Interpreter.InterpretationContext context)
        {
            bool retVal = true;

            foreach (DataDictionary.Rules.PreCondition preCondition in PreConditions)
            {
                try
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
                        // TODO : Handle Error
                    }

                    if (!retVal)
                    {
                        break;
                    }
                }
                catch (Exception e)
                {
                    preCondition.AddException(e);
                    retVal = false;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <param name="firstCondition">indicates whether this is the first condition or a following condition in a rule</param>
        /// <returns></returns>
        public string getExplain(int indentLevel, bool firstCondition, bool getExplain)
        {
            string retVal = "";

            int subIndent = 0;
            if (PreConditions.Count > 0)
            {
                subIndent = 2;
                bool first = true;
                foreach (PreCondition preCondition in PreConditions)
                {
                    if (first)
                    {
                        if (firstCondition)
                        {
                            retVal = retVal + TextualExplainUtilities.Pad("{\\b IF} " + preCondition.getExplain(true), indentLevel);
                        }
                        else
                        {
                            retVal = retVal + TextualExplainUtilities.Pad("{\\b ELSIF} " + preCondition.getExplain(true), indentLevel);
                        }
                        first = false;
                    }
                    else
                    {
                        retVal = retVal + " {\\b AND} " + preCondition.getExplain(true);
                    }
                }
                retVal = retVal + " {\\b THEN}\\par";
            }
            else
            {
                if (!firstCondition)
                {
                    subIndent = 2;
                    retVal = retVal + TextualExplainUtilities.Pad("{\\b ELSE\\par} ", indentLevel);
                }
            }

            if (Name.CompareTo(EnclosingRule.Name) != 0)
            {
                retVal = retVal + TextualExplainUtilities.Pad("{\\cf11//" + Name + "}\\cf1\\par", indentLevel + subIndent);
            }

            if (getExplain)
            {
                foreach (Rule subRule in SubRules)
                {
                    retVal = retVal + subRule.getExplain(indentLevel + subIndent, true);
                }
            }

            foreach (Action action in Actions)
            {
                retVal = retVal + "{" + TextualExplainUtilities.Pad(action.getExplain() + "\\par}", indentLevel + subIndent);
            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0, true, true);

            return TextualExplainUtilities.Encapsule(retVal);
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                PreCondition item = element as PreCondition;
                if (item != null)
                {
                    appendPreConditions(item);
                }
            }
            {
                Action item = element as Action;
                if (item != null)
                {
                    appendActions(item);
                }
            }

            base.AddModelElement(element);
        }


        /// <summary>
        /// Indicates that the rule condition has been disabled
        /// </summary>
        /// <returns></returns>
        public bool IsDisabled()
        {
            bool retVal = false;

            Rule rule = EnclosingRule;
            while (rule != null && !retVal)
            {
                retVal = retVal || rule.Disabled;
                rule = rule.EnclosingRule;
            }

            return retVal;
        }
    }
}
