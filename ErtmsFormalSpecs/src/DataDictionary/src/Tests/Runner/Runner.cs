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
using DataDictionary.Rules;
using DataDictionary.Tests.Runner.Events;
using DataDictionary.Values;

namespace DataDictionary.Tests.Runner
{
    public class Runner
    {
        /// <summary>
        /// The event time line for this runner
        /// </summary>
        private Events.EventTimeLine eventTimeLine;
        public Events.EventTimeLine EventTimeLine
        {
            get { return eventTimeLine; }
            private set { eventTimeLine = value; }
        }

        /// <summary>
        /// The data dictionary
        /// </summary>
        public EFSSystem EFSSystem
        {
            get
            {
                return SubSequence.EFSSystem;
            }
        }

        /// <summary>
        /// The test case for which this runner has been created
        /// </summary>
        public SubSequence SubSequence { get; private set; }

        /// <summary>
        /// The step between two activations
        /// </summary>
        private int step = 100;
        public int Step
        {
            get { return step; }
            set { step = value; }
        }

        /// <summary>
        /// The current time
        /// </summary>
        public int Time
        {
            get { return EventTimeLine.CurrentTime; }
            set { EventTimeLine.CurrentTime = value; }
        }

        /// <summary>
        /// The current time
        /// </summary>
        private int lastActivationTime;
        public int LastActivationTime
        {
            get { return lastActivationTime; }
            set { lastActivationTime = value; }
        }

        /// <summary>
        /// Visitor used to clean caches of functions (graphs, surfaces)
        /// </summary>
        private class FunctionGraphCache : Generated.Visitor
        {
            /// <summary>
            /// The list of functions to be cleared
            /// </summary>
            public List<Functions.Function> CachedFunctions = new List<Functions.Function>();

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="system"></param>
            public FunctionGraphCache(EFSSystem system)
            {
                // Fill the list of functions to be cleared
                foreach (DataDictionary.Dictionary dictionnary in EFSSystem.INSTANCE.Dictionaries)
                {
                    visit(dictionnary);
                }
            }

            /// <summary>
            /// Fills the list of functions to be cleared
            /// </summary>
            /// <param name="obj"></param>
            /// <param name="visitSubNodes"></param>
            public override void visit(Generated.Function obj, bool visitSubNodes)
            {
                Functions.Function function = obj as Functions.Function;

                if (function != null)
                {
                    if (function.IsCachedForGraph())
                    {
                        CachedFunctions.Add(function);
                    }
                }

                base.visit(obj, visitSubNodes);
            }

            /// <summary>
            /// Clears the caches of all functions
            /// </summary>
            public void ClearCaches()
            {
                foreach (Functions.Function function in CachedFunctions)
                {
                    function.Graph = null;
                }
            }
        }

        /// <summary>
        /// The function cache cleaner
        /// </summary>
        private FunctionGraphCache FunctionCacheCleaner { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="subSequence"></param>
        public Runner(SubSequence subSequence)
        {
            EventTimeLine = new Events.EventTimeLine();
            SubSequence = subSequence;
            EFSSystem.Runner = this;

            // Compile everything
            Interpreter.Compiler compiler = new Interpreter.Compiler(EFSSystem, EFSSystem.ShouldRebuild);
            compiler.Compile();

            Setup();
        }

        /// <summary>
        /// Sets up all variables before any execution on the system
        /// </summary>
        private class Setuper : Generated.Visitor
        {
            /// <summary>
            /// The EFS system for which this setuper is created
            /// </summary>
            public EFSSystem EFSSystem { get; private set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="efsSystem"></param>
            public Setuper(EFSSystem efsSystem)
            {
                EFSSystem = efsSystem;
            }

            /// <summary>
            /// Sets the default values to each variable
            /// </summary>
            /// <param name="variable">The variable to set</param>
            /// <param name="subNodes">Indicates whether sub nodes should be considered</param>
            public override void visit(DataDictionary.Generated.Variable variable, bool subNodes)
            {
                DataDictionary.Variables.Variable var = (DataDictionary.Variables.Variable)variable;

                var.Value = var.DefaultValue;

                base.visit(variable, subNodes);
            }

            /// <summary>
            /// Set the initial value for each procedure
            /// </summary>
            /// <param name="obj"></param>
            /// <param name="visitSubNodes"></param>
            public override void visit(Generated.Procedure obj, bool visitSubNodes)
            {
                DataDictionary.Variables.Procedure procedure = obj as DataDictionary.Variables.Procedure;

                if (procedure != null)
                {
                    if (procedure.StateMachine.States.Count > 0)
                    {
                        procedure.CurrentState.Value = procedure.DefaultValue;
                    }
                }

                base.visit(obj, visitSubNodes);
            }

            /// <summary>
            /// Indicates which rules are not active
            /// </summary>
            /// <param name="obj"></param>
            /// <param name="visitSubNodes"></param>
            public override void visit(Generated.Rule obj, bool visitSubNodes)
            {
                Rules.Rule rule = obj as Rule;
                if (rule != null)
                {
                    rule.ActivationPriorities = null;
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Sets up the runner before performing a test case
        /// </summary>
        public void Setup()
        {
            // Setup the execution environment
            Setuper setuper = new Setuper(EFSSystem);
            foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
            {
                setuper.visit(dictionary);
            }

            // Clears all caches
            Utils.FinderRepository.INSTANCE.ClearCache();

            // Builds the list of functions that will require a cache for their graph 
            FunctionCacheCleaner = new FunctionGraphCache(EFSSystem);
        }

        public class Activation
        {
            /// <summary>
            /// The action to activate
            /// </summary>
            private Rules.RuleCondition ruleCondition;
            public Rules.RuleCondition RuleCondition
            {
                get { return ruleCondition; }
                private set { ruleCondition = value; }
            }

            /// <summary>
            /// The instance on which the action is applied
            /// </summary>
            private Utils.IModelElement instance;
            public Utils.IModelElement Instance
            {
                get { return instance; }
                private set { instance = value; }
            }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="ruleCondition">The rule condition which leads to this activation</param>
            /// <param name="instance">The instance on which this rule condition's preconditions are evaluated to true</param>
            public Activation(Rules.RuleCondition ruleCondition, Utils.IModelElement instance)
            {
                RuleCondition = ruleCondition;
                Instance = instance;
            }

            /// <summary>
            /// Indicates that two Activations are the same when they share the action and, 
            /// if specified, the instance on which they are applied
            /// </summary>
            /// <param name="obj"></param>
            /// <returns></returns>
            public override bool Equals(object obj)
            {
                bool retVal = false;

                Activation other = obj as Activation;
                if (other != null)
                {
                    retVal = RuleCondition.Equals(other.RuleCondition);
                    if (retVal && Instance != null)
                    {
                        if (other.Instance != null)
                        {
                            retVal = retVal && Instance.Equals(other.Instance);
                        }
                        else
                        {
                            retVal = false;
                        }
                    }
                }
                return retVal;
            }

            /// <summary>
            /// The hash code, according to Equal operator.
            /// </summary>
            /// <returns></returns>
            public override int GetHashCode()
            {
                int retVal = RuleCondition.GetHashCode();

                if (Instance != null)
                {
                    retVal = retVal + Instance.GetHashCode();
                }

                return retVal;
            }

            /// <summary>
            /// Registers the actions to be activated, as an activation.
            /// </summary>
            /// <param name="activations"></param>
            /// <param name="actions"></param>
            public static void RegisterRules(HashSet<Activation> activations, List<Rules.RuleCondition> ruleConditions, Utils.IModelElement instance)
            {
                foreach (Rules.RuleCondition ruleCondition in ruleConditions)
                {
                    activations.Add(new Activation(ruleCondition, instance));
                }
            }
        }

        /// <summary>
        /// Provides the order in which rules should be activated
        /// </summary>
        public static Generated.acceptor.RulePriority[] PRIORITIES_ORDER = 
        { 
            Generated.acceptor.RulePriority.aVerification,
            Generated.acceptor.RulePriority.aUpdateINTERNAL,
            Generated.acceptor.RulePriority.aProcessing,
            Generated.acceptor.RulePriority.aUpdateOUT,
            Generated.acceptor.RulePriority.aCleanUp,
        };

        /// <summary>
        /// Activates the rules in the dictionary until stabilisation
        /// </summary>
        public void Cycle()
        {
            LastActivationTime = Time;

            Utils.ModelElement.ErrorCount = 0;

            foreach (Generated.acceptor.RulePriority priority in PRIORITIES_ORDER)
            {
                // Clears the cache of functions
                FunctionCacheCleaner.ClearCaches();

                // Activates the processing engine
                HashSet<Activation> activations = new HashSet<Activation>();
                foreach (DataDictionary.Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    foreach (DataDictionary.Types.NameSpace nameSpace in dictionary.NameSpaces)
                    {
                        SetupNameSpaceActivations(priority, activations, nameSpace);
                    }
                }

                ApplyActivations(activations);
            }
            // Clears the cache of functions
            FunctionCacheCleaner.ClearCaches();

            if (Utils.ModelElement.ErrorCount > 0)
            {
                SubStep subStep = CurrentSubStep();
                if (subStep != null)
                {
                    subStep.AddError("Errors were raised while evaluating this sub step. See model view for more informations");
                }
                else
                {
                    Step step = CurrentStep();
                    if (step != null)
                    {
                        step.AddError("Errors were raised while evaluating this step. See model view for more informations");
                    }
                    else
                    {
                        TestCase testCase = CurrentTestCase();
                        if (testCase != null)
                        {
                            testCase.AddError("Errors were raised while evaluating this test case. See model view for more informations");
                        }
                        else
                        {
                            SubSequence.AddError("Errors were raised while evaluating this sub sequence. See model view for more informations");
                        }
                    }
                }
            }

            EventTimeLine.CurrentTime += Step;
        }

        /// <summary>
        /// Determines the set of rules in a specific namespace to be applied.
        /// </summary>
        /// <param name="priority">The priority for which this activation is requested</param>
        /// <param name="activations">The set of activations to be filled</param>
        /// <param name="nameSpace">The namespace to consider</param>
        /// <returns></returns>
        private void SetupNameSpaceActivations(Generated.acceptor.RulePriority priority, HashSet<Activation> activations, Types.NameSpace nameSpace)
        {
            // Finds all activations in sub namespaces
            foreach (Types.NameSpace subNameSpace in nameSpace.SubNameSpaces)
            {
                SetupNameSpaceActivations(priority, activations, subNameSpace);
            }

            List<Rules.RuleCondition> rules = new List<Rules.RuleCondition>();
            foreach (Rule rule in nameSpace.Rules)
            {
                rules.Clear();
                rule.Evaluate(this, priority, rule, rules);
                Activation.RegisterRules(activations, rules, nameSpace);
            }

            foreach (Variables.Procedure procedure in nameSpace.Procedures)
            {
                rules.Clear();
                EvaluateStateMachine(rules, priority, procedure.CurrentState);
                Activation.RegisterRules(activations, rules, procedure);
            }

            foreach (Variables.IVariable variable in nameSpace.Variables)
            {
                EvaluateVariable(priority, activations, variable);
            }
        }

        /// <summary>
        /// Evaluates the rules associated to a single variable
        /// </summary>
        /// <param name="priority"></param>
        /// <param name="activations"></param>
        /// <param name="variable"></param>
        private void EvaluateVariable(Generated.acceptor.RulePriority priority, HashSet<Activation> activations, Variables.IVariable variable)
        {
            if (variable != null)
            {
                if (variable.Type is Types.Structure)
                {
                    List<Rules.RuleCondition> rules = new List<RuleCondition>();
                    Types.Structure structure = variable.Type as Types.Structure;
                    foreach (Rule rule in structure.Rules)
                    {
                        rule.Evaluate(this, priority, variable, rules);
                    }
                    Activation.RegisterRules(activations, rules, variable);

                    StructureValue value = variable.Value as StructureValue;
                    if (value != null)
                    {
                        foreach (Variables.IVariable subVariable in value.SubVariables.Values)
                        {
                            EvaluateVariable(priority, activations, subVariable);
                        }
                        foreach (Variables.IProcedure procedure in value.Procedures.Values)
                        {
                            EvaluateVariable(priority, activations, procedure.CurrentState);
                        }
                    }
                }
                else if (variable.Type is Types.StateMachine)
                {
                    List<Rules.RuleCondition> rules = new List<RuleCondition>();
                    EvaluateStateMachine(rules, priority, variable);
                    Activation.RegisterRules(activations, rules, variable);
                }
                else if (variable.Type is Types.Collection)
                {
                    Types.Collection collectionType = variable.Type as Types.Collection;
                    if (variable.Value != EFSSystem.EmptyValue)
                    {
                        ListValue val = variable.Value as ListValue;

                        int i = 1;
                        foreach (IValue subVal in val.Val)
                        {
                            Variables.Variable tmp = new Variables.Variable();
                            tmp.Name = variable.Name + '[' + i + ']';
                            tmp.Type = collectionType.Type;
                            tmp.Value = subVal;
                            EvaluateVariable(priority, activations, tmp);
                            i = i + 1;
                        }
                    }
                }
            }
        }

        /// <summary>
        /// Try to find a rule, in this state machine, or in a sub state machine 
        /// which 
        /// </summary>
        /// <param name="ruleConditions"></param>
        /// <param name="priority"></param>
        /// <param name="currentStateVariable">The variable which holds the current state of the procedure</param>
        private void EvaluateStateMachine(List<Rules.RuleCondition> ruleConditions, Generated.acceptor.RulePriority priority, Variables.IVariable currentStateVariable)
        {
            if (currentStateVariable != null)
            {
                Constants.State currentState = currentStateVariable.Value as Constants.State;
                Types.StateMachine currentStateMachine = currentState.StateMachine;
                while (currentStateMachine != null)
                {
                    foreach (Rule rule in currentStateMachine.Rules)
                    {
                        rule.Evaluate(this, priority, currentStateVariable, ruleConditions);
                    }
                    currentStateMachine = currentStateMachine.EnclosingStateMachine;
                }
            }
        }

        /// <summary>
        /// Applies the selected actions and update the system state
        /// </summary>
        /// <param name="updates"></param>
        public void ApplyActivations(HashSet<Activation> activations)
        {
            foreach (Activation activation in activations)
            {
                if (activation.RuleCondition.Actions.Count > 0)
                {
                    EventTimeLine.AddModelEvent(new Tests.Runner.Events.RuleFired(activation.RuleCondition));
                }
            }

            foreach (Activation activation in activations)
            {
                foreach (Rules.Action action in activation.RuleCondition.Actions)
                {
                    if (action.Statement != null)
                    {
                        EventTimeLine.AddModelEvent(new Events.VariableUpdate(action, activation.Instance));
                    }
                    else
                    {
                        action.AddError("Cannot parse action statement");
                    }

                }
            }

            CheckExpectationsState();
        }

        /// <summary>
        /// Setups the sub-step by applying its actions and adding its expects in the expect list
        /// </summary>
        public void SetupSubStep(SubStep subStep)
        {
            LogInstance = subStep;

            // No setup can occur when some expectations are still active
            if (ActiveBlockingExpectations().Count == 0)
            {
                EventTimeLine.AddModelEvent(new SubStepActivated(subStep));
            }
        }

        /// <summary>
        /// Provides the still active expectations
        /// </summary>
        /// <returns></returns>
        public HashSet<Expect> ActiveExpectations()
        {
            return new HashSet<Expect>(EventTimeLine.ActiveExpectations);
        }

        /// <summary>
        /// Provides the still active and blocking expectations
        /// </summary>
        /// <returns></returns>
        public HashSet<Expect> ActiveBlockingExpectations()
        {
            return EventTimeLine.ActiveBlockingExpectations();
        }

        /// <summary>
        /// Provides the failed expectations
        /// </summary>
        /// <returns></returns>
        public HashSet<Expect> FailedExpectations()
        {
            return EventTimeLine.FailedExpectations();
        }

        /// <summary>
        /// Updates the expectation state according to the variables' value
        /// </summary>
        private void CheckExpectationsState()
        {
            // Update the state of the expectation according to system's state
            foreach (Events.Expect expect in ActiveExpectations())
            {
                if (expect.TimeOut < EventTimeLine.CurrentTime)
                {
                    EventTimeLine.AddModelEvent(new FailedExpectation(expect));
                }
                else
                {
                    try
                    {
                        Interpreter.Expression expression = expect.Expectation.ExpressionTree;
                        Interpreter.InterpretationContext context = new Interpreter.InterpretationContext(expect.Expectation);
                        BoolValue value = expression.GetValue(context) as BoolValue;
                        if (value != null)
                        {
                            if (value.Val)
                            {
                                EventTimeLine.AddModelEvent(new ExpectationReached(expect));
                            }
                        }
                        else
                        {
                            // Error
                        }
                    }
                    catch (Exception e)
                    {
                        expect.Expectation.AddException(e);
                    }
                }
            }
        }

        /// <summary>
        /// Runs until all expectations are reached or failed
        /// </summary>
        public void RunForExpectations(bool performCycle)
        {
            if (performCycle)
            {
                Cycle();
            }

            while (ActiveBlockingExpectations().Count > 0)
            {
                Cycle();
            }
        }

        /// <summary>
        /// Indicates that no test has been run yet
        /// </summary>
        private static int TEST_NOT_RUN = -1;

        /// <summary>
        /// Indicates that the current test case & current step & current sub-step must be rebuilt from the time line
        /// </summary>
        private static int REBUILD_CURRENT_SUB_STEP = -2;

        /// <summary>
        /// Indicates that the current test case & current step & current sub-step must be rebuilt from the time line
        /// </summary>
        private static int NO_MORE_STEP = -3;

        /// <summary>
        /// The index of the last activated sub-step in the current test case
        /// </summary>
        private int currentSubStepIndex = TEST_NOT_RUN;

        /// <summary>
        /// The index of the last activated step in the current test case
        /// </summary>
        private int currentStepIndex = TEST_NOT_RUN;

        /// <summary>
        /// The index of the test case in which the last activated step belongs
        /// </summary>
        private int currentTestCaseIndex = TEST_NOT_RUN;

        /// <summary>
        /// Provides the next test case
        /// </summary>
        /// <returns></returns>
        public TestCase CurrentTestCase()
        {
            TestCase retVal = null;

            if (currentTestCaseIndex != NO_MORE_STEP)
            {
                if (currentTestCaseIndex >= 0 && currentTestCaseIndex < SubSequence.TestCases.Count)
                {
                    retVal = (TestCase)SubSequence.TestCases[currentTestCaseIndex];
                }
            }

            return retVal;
        }

        /// <summary>
        /// steps to the next test case
        /// </summary>
        private void NextTestCase()
        {
            if (currentTestCaseIndex != NO_MORE_STEP)
            {
                if (currentTestCaseIndex == REBUILD_CURRENT_SUB_STEP)
                {
                    currentStepIndex = REBUILD_CURRENT_SUB_STEP;
                    NextStep();
                }
                else
                {
                    currentTestCaseIndex += 1;
                    TestCase testCase = CurrentTestCase();
                    while (testCase != null && testCase.Steps.Count == 0 && currentTestCaseIndex < SubSequence.TestCases.Count)
                    {
                        currentTestCaseIndex += 1;
                        testCase = CurrentTestCase();
                    }

                    if (testCase == null)
                    {
                        currentTestCaseIndex = NO_MORE_STEP;
                        currentStepIndex = NO_MORE_STEP;
                    }
                }
            }
        }

        /// <summary>
        /// Provides the current test step
        /// </summary>
        /// <returns></returns>
        public Step CurrentStep()
        {
            Step retVal = null;

            if (currentStepIndex != NO_MORE_STEP)
            {

                TestCase testCase = CurrentTestCase();
                if (testCase != null)
                {
                    if (currentStepIndex >= 0 && currentStepIndex < testCase.Steps.Count)
                    {
                        retVal = (Step)testCase.Steps[currentStepIndex];
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Steps to the next step (either in the current test case, or in the next test case)
        /// </summary>
        private void NextStep()
        {
            if (currentStepIndex != NO_MORE_STEP)
            {
                Step step = CurrentStep();

                do
                {
                    if (currentStepIndex != REBUILD_CURRENT_SUB_STEP)
                    {
                        currentStepIndex += 1;
                        TestCase testCase = CurrentTestCase();
                        if (testCase == null)
                        {
                            NextTestCase();
                            testCase = CurrentTestCase();
                        }

                        if (testCase != null && currentStepIndex >= testCase.Steps.Count)
                        {
                            NextTestCase();
                            testCase = CurrentTestCase();
                            if (testCase != null)
                            {
                                currentStepIndex = 0;
                            }
                            else
                            {
                                currentTestCaseIndex = NO_MORE_STEP;
                                currentStepIndex = NO_MORE_STEP;
                            }
                        }
                        step = CurrentStep();
                    }
                }
                while (step != null && step.IsEmpty());
            }
        }

        /// <summary>
        /// Provides the current test step
        /// </summary>
        /// <returns></returns>
        public SubStep CurrentSubStep()
        {
            SubStep retVal = null;

            if (currentSubStepIndex != NO_MORE_STEP)
            {
                if (currentSubStepIndex == REBUILD_CURRENT_SUB_STEP)
                {
                    currentTestCaseIndex = -1;
                    currentStepIndex = -1;
                    currentSubStepIndex = -1;
                    int previousTestCaseIndex = currentTestCaseIndex;
                    int previousStepIndex = currentStepIndex;
                    int previousSubStepIndex = currentSubStepIndex;

                    NextSubStep();
                    retVal = CurrentSubStep();
                    while (retVal != null && EventTimeLine.SubStepActivationCache.ContainsKey(retVal))
                    {
                        previousTestCaseIndex = currentTestCaseIndex;
                        previousStepIndex = currentStepIndex;
                        previousSubStepIndex = currentSubStepIndex;

                        NextSubStep();
                        retVal = CurrentSubStep();
                    }

                    currentTestCaseIndex = previousTestCaseIndex;
                    currentStepIndex = previousStepIndex;
                    currentSubStepIndex = previousSubStepIndex;
                }

                Step step = CurrentStep();
                if (step != null)
                {
                    if (currentSubStepIndex >= 0 && currentSubStepIndex < step.SubSteps.Count)
                    {
                        retVal = (SubStep)step.SubSteps[currentSubStepIndex];
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Steps to the next sub-step (either in the current test case, or in the next test case)
        /// </summary>
        private void NextSubStep()
        {
            if (currentSubStepIndex != NO_MORE_STEP)
            {
                SubStep subStep = CurrentSubStep();
                Step step;

                do
                {
                    currentSubStepIndex++;
                    step = CurrentStep();
                    if (step == null)
                    {
                        NextStep();
                        step = CurrentStep();
                    }

                    if (step != null && currentSubStepIndex >= step.SubSteps.Count)
                    {
                        NextStep();
                        step = CurrentStep();
                        if (step != null)
                        {
                            currentSubStepIndex = 0;
                        }
                        else
                        {
                            currentTestCaseIndex = NO_MORE_STEP;
                            currentStepIndex = NO_MORE_STEP;
                        }
                    }
                    subStep = CurrentSubStep();
                }
                while (step != null && (step.IsEmpty() || subStep.IsEmpty()));
            }
        }

        /// <summary>
        /// Runs the test case until the step provided is encountered
        /// This does not execute the corresponding step. 
        /// </summary>
        /// <param name="Item"></param>
        public void RunUntilStep(Step target)
        {
            currentStepIndex = NO_MORE_STEP;
            currentTestCaseIndex = NO_MORE_STEP;

            RunForExpectations(false);

            // Run all following steps until the target step is encountered
            foreach (TestCase testCase in SubSequence.TestCases)
            {
                foreach (Step step in testCase.Steps)
                {
                    if (step == target)
                    {
                        currentStepIndex = REBUILD_CURRENT_SUB_STEP;
                        currentTestCaseIndex = REBUILD_CURRENT_SUB_STEP;
                        break;
                    }

                    if (!EventTimeLine.ContainsStep(step))
                    {
                        foreach (SubStep subStep in step.SubSteps)
                        {
                            SetupSubStep(subStep);
                            if (!subStep.getSkipEngine())
                            {
                                RunForExpectations(true);
                            }
                        }
                    }
                }
            }
        }

        /// <summary>
        /// Runs the test case until the step provided is encountered
        /// This does not execute the corresponding step. 
        /// </summary>
        /// <param name="Item"></param>
        public void RunUntilTime(int targetTime)
        {
            while (EventTimeLine.CurrentTime < targetTime)
            {
                SubStep subStep = null;
                if (ActiveBlockingExpectations().Count == 0)
                {
                    NextSubStep();
                    subStep = CurrentSubStep();
                    if (subStep != null)
                    {
                        SetupSubStep(subStep);
                    }
                }

                if (subStep == null || !subStep.getSkipEngine())
                {
                    Cycle();
                }
                else
                {
                    EventTimeLine.CurrentTime += Step;
                }
            }
        }

        /// <summary>
        /// Steps one step backward in this run
        /// </summary>
        public void StepBack()
        {
            FunctionCacheCleaner.ClearCaches();
            EventTimeLine.StepBack(step);
            currentSubStepIndex = REBUILD_CURRENT_SUB_STEP;
            currentStepIndex = REBUILD_CURRENT_SUB_STEP;
            currentTestCaseIndex = REBUILD_CURRENT_SUB_STEP;
        }

        /// <summary>
        /// Indicates whether a rule condition has been activated at a given time
        /// </summary>
        /// <param name="ruleCondition"></param>
        /// <param name="time"></param>
        /// <returns>true if the corresponding rule condition has been activated at the time provided</returns>
        public bool RuleActivatedAtTime(DataDictionary.Rules.RuleCondition ruleCondition, int time)
        {
            return EventTimeLine.RuleActivatedAtTime(ruleCondition, time);
        }

        /// <summary>
        /// Provides the log instance, an object on which logging should be performed
        /// </summary>
        public ModelElement LogInstance { get; set; }

        /// <summary>
        /// Terminates the execution of a run
        /// </summary>
        public void EndExecution()
        {
            FunctionCacheCleaner.ClearCaches();
        }
    }
}
