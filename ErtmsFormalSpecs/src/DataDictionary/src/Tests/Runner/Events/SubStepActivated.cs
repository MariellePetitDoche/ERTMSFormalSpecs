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

namespace DataDictionary.Tests.Runner.Events
{
    public class SubStepActivated : ModelEvent
    {
        /// <summary>
        /// The activated step
        /// </summary>
        private Tests.SubStep subStep;
        public Tests.SubStep SubStep
        {
            get { return subStep; }
            private set { subStep = value; }
        }

        /// <summary>
        /// <summary>
        /// The namespace associated to this event
        /// </summary>
        public override Types.NameSpace NameSpace { get { return null; } }

        /// Constructor
        /// </summary>
        /// <param name="step">The activated step</param>
        public SubStepActivated(Tests.SubStep subStep)
            : base(subStep.Name, subStep)
        {
            SubStep = subStep;
        }

        /// <summary>
        /// Applies this step activation be registering it in the activation cache
        /// </summary>
        /// <param name="localScope">The values of local variables</param>
        public override void Apply(Interpreter.InterpretationContext context)
        {
            base.Apply(context);

            TimeLine.SubStepActivationCache[SubStep] = this;

            // Modifies the system's state
            foreach (DataDictionary.Rules.Action action in subStep.Actions)
            {
                if (action.Statement != null)
                {
                    TimeLine.AddModelEvent(new VariableUpdate(action, SubStep.Dictionary));
                }
                else
                {
                    action.AddError("Cannot parse action statement");
                }
            }

            // Store the step corresponding expectations
            foreach (Expectation expectation in subStep.Expectations)
            {
                TimeLine.AddModelEvent(new Events.Expect(expectation));
            }
        }

        /// <summary>
        /// Rolls back this step be removing it from the cache
        /// </summary>
        public override void RollBack()
        {
            TimeLine.SubStepActivationCache.Remove(SubStep);

            base.RollBack();
        }
    }
}
