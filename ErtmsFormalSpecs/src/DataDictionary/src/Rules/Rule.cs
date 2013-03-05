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

using DataDictionary.Specification;

namespace DataDictionary.Rules
{
    public class Rule : Generated.Rule, TextualExplain
    {
        /// <summary>
        /// Provides the execution time for this rule, in milliseconds
        /// </summary>
        public long ExecutionTimeInMilli { get; set; }

        /// <summary>
        /// Provides the number of times this rule has been executed
        /// </summary>
        public int ExecutionCount { get; set; }

        /// <summary>
        /// Indicates if this Rule contains implemented sub-elements
        /// </summary>
        public override bool ImplementationPartiallyCompleted
        {
            get
            {
                if (getImplemented())
                {
                    return true;
                }

                foreach (DataDictionary.Rules.RuleCondition ruleCondition in RuleConditions)
                {
                    if (ruleCondition.ImplementationPartiallyCompleted)
                    {
                        return true;
                    }
                }

                return false;
            }
        }

        /// <summary>
        /// Provides the namespace associated to the rule
        /// </summary>
        public Types.NameSpace NameSpace
        {
            get { return EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// The preconditions for this rule
        /// </summary>
        public System.Collections.ArrayList RuleConditions
        {
            get
            {
                if (allConditions() == null)
                {
                    setAllConditions(new System.Collections.ArrayList());
                }
                return allConditions();
            }
        }

        /// <summary>
        /// The traces to the specifications
        /// </summary>
        public System.Collections.ArrayList Traces
        {
            get
            {
                if (allRequirements() == null)
                {
                    setAllRequirements(new System.Collections.ArrayList());
                }
                return allRequirements();
            }
        }

        /// <summary>
        /// The enclosing rule, if any
        /// </summary>
        public Rule EnclosingRule
        {
            get { return Enclosing as Rule; }
        }

        /// <summary>
        /// The enclosing rule condition, if any
        /// </summary>
        public RuleCondition EnclosingRuleCondition
        {
            get { return Enclosing as RuleCondition; }
        }

        /// <summary>
        /// The enclosing procedure, if any
        /// </summary>
        public Variables.Procedure EnclosingProcedure
        {
            get { return Enclosing as Variables.Procedure; }
        }

        /// <summary>
        /// The enclosing structure (if any)
        /// </summary>
        public Types.Structure EnclosingStructure
        {
            get { return Utils.EnclosingFinder<Types.Structure>.find(this); }
        }

        /// <summary>
        /// The enclosing structure procedure (if any)
        /// </summary>
        public Types.StructureProcedure EnclosingStructureProcedure
        {
            get { return Enclosing as Types.StructureProcedure; }
        }

        /// <summary>
        /// The enclosing state machine (if any)
        /// </summary>
        public Types.StateMachine EnclosingStateMachine
        {
            get { return Utils.EnclosingFinder<Types.StateMachine>.find(this); }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                if (EnclosingRuleCondition != null)
                {
                    return EnclosingRuleCondition.SubRules;
                }
                if (EnclosingProcedure != null)
                {
                    return EnclosingProcedure.Rules;
                }
                if (EnclosingStateMachine != null)
                {
                    return EnclosingStateMachine.Rules;
                }
                if (EnclosingStructure != null)
                {
                    return EnclosingStructure.Rules;
                }
                if (EnclosingStructureProcedure != null)
                {
                    return EnclosingStructureProcedure.Rules;
                }
                else
                {
                    return NameSpace.Rules;
                }
            }
        }

        /// <summary>
        /// Indicates if the implementation of this Rule is completed
        /// </summary>
        public override bool ImplementationCompleted
        {
            get
            {
                bool retVal = getImplemented();
                foreach (RuleCondition ruleCondition in RuleConditions)
                {
                    foreach (Rule rule in ruleCondition.SubRules)
                    {
                        retVal = retVal && rule.ImplementationCompleted;
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel, bool explainSubRules)
        {
            string retVal = TextualExplainUtilities.Pad("{\\cf11 // " + Name + "}\\cf1\\par", indentLevel);

            bool first = true;
            bool condition = false;
            foreach (RuleCondition ruleCondition in RuleConditions)
            {
                retVal += ruleCondition.getExplain(indentLevel, first, explainSubRules);
                first = false;
                condition = condition || ruleCondition.PreConditions.Count > 0;
            }

            if (condition)
            {
                retVal = retVal + TextualExplainUtilities.Pad("{\\b END IF}\\par", indentLevel);
            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>

        /// <param name="explainSubElements">Precises if we need to explain the sub elements (if any)</param>
        /// <returns></returns>
        public string getExplain(bool explainSubRules)
        {
            string retVal = "";

            List<PreCondition> enclosingPreConditions = new List<PreCondition>();

            if (EnclosingRuleCondition != null)
            {
                enclosingPreConditions = EnclosingRuleCondition.AllPreConditions;
            }

            if (enclosingPreConditions.Count == 0 || explainSubRules)
            {
                retVal = retVal + getExplain(0, explainSubRules);
            }
            else  // we will only display enclosing preconditions for the report, when explainSubRules == true
            {
                bool first = true;
                foreach (PreCondition preCondition in enclosingPreConditions)
                {
                    if (first)
                    {
                        retVal = retVal + "{\\b IF} " + preCondition.getExplain(true);
                        first = false;
                    }
                    else
                    {
                        retVal = retVal + "{\\b AND} " + preCondition.getExplain(true);
                    }
                }
                if (!first)
                {
                    retVal = retVal + "{\\b THEN}\\par";
                }
                retVal = retVal + getExplain(2, explainSubRules);
                if (!first)
                {
                    retVal = retVal + "{\\b END IF}\\par";
                }
            }

            return TextualExplainUtilities.Encapsule(retVal);
        }

        /// <summary>
        /// Provides the requirements for enclosing rules
        /// </summary>
        public List<ReqRef> EnclosingRequirements
        {
            get
            {
                List<ReqRef> retVal = new List<ReqRef>();

                Rule enclosing = EnclosingRule;
                while (enclosing != null)
                {
                    foreach (ReqRef req in enclosing.Traces)
                    {
                        retVal.Add(req);
                    }
                    enclosing = enclosing.EnclosingRule;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the list of applicable paragraphs
        /// </summary>
        public List<Paragraph> ApplicableParagraphs
        {
            get
            {
                List<Paragraph> retVal;

                if (EnclosingRequirements.Count == 0)
                {
                    retVal = Dictionary.Specifications.AllParagraphs;
                }
                else
                {
                    retVal = new List<Paragraph>();

                    foreach (ReqRef req in EnclosingRequirements)
                    {
                        Dictionary.Specifications.SubParagraphs(req.Name, retVal);
                    }
                }
                return retVal;
            }
        }

        /// <summary>
        /// Provides the activation priority list for this rule
        /// </summary>
        private HashSet<Generated.acceptor.RulePriority> activationPriorities;

        public HashSet<Generated.acceptor.RulePriority> ActivationPriorities
        {
            get
            {
                if (activationPriorities == null)
                {
                    activationPriorities = new HashSet<Generated.acceptor.RulePriority>();
                    activationPriorities.Add(getPriority());
                    foreach (RuleCondition condition in RuleConditions)
                    {
                        foreach (Rule subRule in condition.SubRules)
                        {
                            activationPriorities.UnionWith(subRule.ActivationPriorities);
                        }
                    }
                }
                return activationPriorities;
            }
            set
            {
                activationPriorities = value;
            }
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

            long start = System.Environment.TickCount;

            if (Disabled == false && ActivationPriorities.Contains(priority))
            {
                foreach (RuleCondition ruleCondition in RuleConditions)
                {
                    retVal = ruleCondition.Evaluate(runner, priority, instance, ruleConditions);
                    if (retVal)
                    {
                        break;
                    }
                }
            }

            // Guard evaluation execution time
            long stop = System.Environment.TickCount;
            long span = (stop - start);
            ExecutionTimeInMilli += span;

            return retVal;
        }

        /// <summary>
        /// Finds all usages of a TypedElement
        /// </summary>
        private class UsageVisitor : Generated.Visitor
        {
            /// <summary>
            /// The usages
            /// </summary>
            public HashSet<RuleCondition> Usages { get; private set; }

            /// <summary>
            /// The element looked for
            /// </summary>
            public Variables.IVariable Target { get; private set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="target"></param>
            public UsageVisitor(Variables.IVariable target)
            {
                Target = target;
                Usages = new HashSet<RuleCondition>();
            }

            /// <summary>
            /// Take care of all conditions
            /// </summary>
            /// <param name="obj"></param>
            /// <param name="visitSubNodes"></param>
            public override void visit(Generated.RuleCondition obj, bool visitSubNodes)
            {
                RuleCondition ruleCondition = (RuleCondition)obj;

                if (ruleCondition.Uses(Target))
                {
                    Usages.Add(ruleCondition);
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Provides the set of rules which uses this variable
        /// </summary>
        /// <param name="node">the element to find in rules</param>
        /// <returns>the list of rules which use the element provided</returns>
        public static HashSet<Rules.RuleCondition> RulesUsingThisElement(Variables.IVariable node)
        {
            UsageVisitor visitor = new UsageVisitor(node);

            EFSSystem efsSystem = Utils.EnclosingFinder<EFSSystem>.find(node);
            if (efsSystem != null)
            {
                foreach (Dictionary dictionary in efsSystem.Dictionaries)
                {
                    visitor.visit(dictionary);
                }
            }

            return visitor.Usages;
        }

        /// <summary>
        /// Provides all the paragraphs associated to this rule
        /// </summary>
        /// <param name="paragraphs">The list of paragraphs to be filled</param>
        /// <returns></returns>
        public override void findRelatedParagraphsRecursively(List<Specification.Paragraph> paragraphs)
        {
            base.findRelatedParagraphsRecursively(paragraphs);

            // Perform the call recursively
            foreach (RuleCondition ruleCondition in RuleConditions)
            {
                foreach (Rule subRule in ruleCondition.SubRules)
                {
                    subRule.findRelatedParagraphsRecursively(paragraphs);
                }
            }
        }

        /// <summary>
        /// Indicates whether the rule is disabled
        /// </summary>
        public bool Disabled
        {
            get
            {
                return EFSSystem.isDisabled(this);
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                RuleCondition item = element as RuleCondition;
                if (item != null)
                {
                    appendConditions(item);
                }
            }

            base.AddModelElement(element);
        }

        /// <summary>
        /// Indicates that this rule has been defined in a procedure
        /// </summary>
        /// <returns></returns>
        public bool BelongsToAProcedure()
        {
            Variables.IProcedure procedure = Utils.EnclosingFinder<Variables.IProcedure>.find(this);

            return procedure != null;
        }
    }
}