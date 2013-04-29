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

        /// <summary>
        /// The list of changes related to this sub step
        /// </summary>
        public List<VariableUpdate> Updates { get; set; }

        /// Constructor
        /// </summary>
        /// <param name="step">The activated step</param>
        public SubStepActivated(Tests.SubStep subStep)
            : base(subStep.Name, subStep)
        {
            SubStep = subStep;
        }

        /// <summary>
        /// Computes the changes related to this event
        /// </summary>
        /// <param name="apply">Indicates that the changes should be applied directly</param>
        public override bool ComputeChanges(bool apply)
        {
            bool retVal = base.ComputeChanges(apply);

            if (retVal)
            {
                // Computes the list of variable updates
                Updates = new List<VariableUpdate>();
                foreach (DataDictionary.Rules.Action action in subStep.Actions)
                {
                    if (action.Statement != null)
                    {
                        Updates.Add(new VariableUpdate(action, SubStep.Dictionary));
                    }
                    else
                    {
                        action.AddError("Cannot parse action statement");
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Applies this step activation be registering it in the activation cache
        /// </summary>
        public override void Apply()
        {
            base.Apply();

            TimeLine.SubStepActivationCache[SubStep] = this;
            foreach (VariableUpdate update in Updates)
            {
                TimeLine.AddModelEvent(update);
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
