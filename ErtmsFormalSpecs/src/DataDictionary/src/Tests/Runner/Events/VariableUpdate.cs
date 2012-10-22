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

namespace DataDictionary.Tests.Runner.Events
{
    public class VariableUpdate : ModelEvent
    {
        /// <summary>
        /// The action to execute
        /// </summary>
        public Rules.Action Action { get; private set; }

        /// <summary>
        /// The namespace associated to this event
        /// </summary>
        public override Types.NameSpace NameSpace { get { return Action.NameSpace; } }

        /// <summary>
        /// The changes performed by this action execution
        /// </summary>
        public List<DataDictionary.Rules.Change> Changes { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="action"The action which raised the variable update></param>
        public VariableUpdate(Rules.Action action, Utils.IModelElement instance)
            : base(action.Statement.ToString(), instance)
        {
            Action = action;
        }

        /// <summary>
        /// Performs the variable change
        /// </summary>
        /// <param name="localScope">The values of local variables</param>
        public override void Apply(Interpreter.InterpretationContext context)
        {
            base.Apply(context);

            Explanation = new Interpreter.ExplanationPart();
            Explanation.Message = "Action " + Action.Name;
            Changes = new List<Rules.Change>();
            Action.GetChanges(context, Changes, Explanation);
            Message = Explanation.ToString();
            foreach (DataDictionary.Rules.Change change in Changes)
            {
                change.Apply();
                if (change.NewValue == null)
                {
                    Action.AddError(change.Variable.FullName + " <- <cannot evaluate value>");
                }
            }
        }

        /// <summary>
        /// Rollsback the changes performed during this event
        /// </summary>
        public override void RollBack()
        {
            base.RollBack();

            foreach (DataDictionary.Rules.Change change in Changes)
            {
                change.UnApply();
            }
        }
    }
}
