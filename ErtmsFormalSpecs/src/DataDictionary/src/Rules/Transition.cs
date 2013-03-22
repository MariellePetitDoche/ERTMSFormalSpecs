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

using DataDictionary.Constants;

namespace DataDictionary.Rules
{
    /// <summary>
    /// Transitions are translations of rules which have the following properties
    ///   - there is an action in the rule (only direct) which modifies a state of the the state machine
    ///   - if there is a pre condition of the rule (either direct or inherited from parent rule)
    ///     which refers to a state S, this provvides the initial state of the transition. Otherwise, 
    ///     there is no initial state
    /// </summary>
    public class Transition
    {
        /// <summary>
        /// The pre condition associated to this transaction
        /// </summary>
        public PreCondition PreCondition { get; private set; }

        /// <summary>
        /// The statment which modifies the state machine's state
        /// </summary>
        public Interpreter.Statement.VariableUpdateStatement Update { get; private set; }

        /// <summary>
        /// The action associated to this transaction
        /// </summary>
        public Action Action
        {
            get
            {
                if (Update != null)
                {
                    return (Action)Update.Root;
                }
                return null;
            }
        }

        /// <summary>
        /// The rule associated to this transition
        /// </summary>
        public RuleCondition RuleCondition
        {
            get
            {
                if (Action != null)
                {
                    return Action.RuleCondition;
                }
                return null;
            }
        }

        /// <summary>
        /// The initial state associated to this transition
        /// </summary>
        public State InitialState { get; private set; }

        /// <summary>
        /// The target state associated to this transition
        /// </summary>
        public State TargetState { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="rule"></param>
        /// <param name="preCondition">The precondition which setup the initial state</param>
        /// <param name="initialState">The initial stae of this transition</param>
        /// <param name="update">The statement which set up the target state</param>
        /// <param name="targetState">The target state of this transition</param>
        public Transition(PreCondition preCondition, State initialState, Interpreter.Statement.VariableUpdateStatement update, State targetState)
        {
            PreCondition = preCondition;
            InitialState = initialState;
            Update = update;
            TargetState = targetState;
        }

        public class CannotChangeRuleException : Exception
        {
            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="message"></param>
            public CannotChangeRuleException(string message)
                : base(message)
            {
            }
        }

        /// <summary>
        /// Updates (if possible) the initial state for this transition
        /// </summary>
        /// <param name="initialState"></param>
        public void SetInitialState(State initialState)
        {
            if (Action != null)
            {
                if (PreCondition != null)
                {
                    if (PreCondition.Rule == Action.Rule)
                    {
                        List<State> states = DataDictionary.Types.StateMachine.GetStates(PreCondition.ExpressionTree);
                        if (states.Count == 1)
                        {
                            PreCondition.ExpressionText = "CurrentState == " + initialState.FullName;
                            InitialState = initialState;
                        }
                        else
                        {
                            throw new CannotChangeRuleException("More than one state in the pre condition expression");
                        }
                    }
                    else
                    {
                        throw new CannotChangeRuleException("Precondition is not at the same level as the action");
                    }
                }
                else
                {
                    RuleCondition ruleCondition = Action.Enclosing as RuleCondition;
                    Rule rule = ruleCondition.EnclosingRule;

                    if (Utils.EnclosingFinder<Constants.State>.find(rule) == InitialState)
                    {
                        if (rule.RuleConditions.Count == 1)
                        {
                            InitialState.StateMachine.removeRules(rule);
                            InitialState = initialState;
                            InitialState.StateMachine.appendRules(rule);
                        }
                        else
                        {
                            rule.removeConditions(ruleCondition);
                            InitialState = initialState;
                            Rule newRule = (Rule)Generated.acceptor.getFactory().createRule();
                            newRule.Name = rule.Name;
                            newRule.appendConditions(ruleCondition);
                            InitialState.StateMachine.appendRules(newRule);
                        }
                    }
                    else
                    {
                        throw new CannotChangeRuleException("Action is not defined directly in the state");
                    }
                }
            }
            InitialState = initialState;
        }

        /// <summary>
        /// Updates (if possible) the target state of this transition
        /// </summary>
        /// <param name="targetState"></param>
        public void SetTargetState(State targetState)
        {
            if (Action != null)
            {
                Action.Expression = Update.Target.Name + " <- " + targetState.LiteralName;
            }
            TargetState = targetState;
        }

        /// <summary>
        /// Provides the name of the target state
        /// </summary>
        /// <returns></returns>
        public string getTargetStateName()
        {
            string retVal = "<Unknown>";

            if (TargetState != null)
            {
                retVal = TargetState.FullName;
            }
            else
            {
                State targetState = Update.Expression.Ref as State;
                if (targetState != null)
                {
                    retVal = targetState.FullName.Substring(targetState.EnclosingProcedure.FullName.Length);
                }
            }

            return retVal;
        }
    }
}
