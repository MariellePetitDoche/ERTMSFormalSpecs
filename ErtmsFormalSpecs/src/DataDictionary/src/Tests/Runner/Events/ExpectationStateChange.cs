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
    public class ExpectationStateChange : ModelEvent
    {
        /// <summary>
        /// The corresponding expect
        /// </summary>
        private Expect expect;
        public Expect Expect
        {
            get { return expect; }
            private set { expect = value; }
        }

        /// <summary>
        /// The namespace associated to this event
        /// </summary>
        public override Types.NameSpace NameSpace { get { return Expect.NameSpace; } }

        /// <summary>
        /// The new expectation state
        /// </summary>
        private Expect.EventState newState;
        public Expect.EventState NewState
        {
            get { return newState; }
            private set { newState = value; }
        }

        /// <summary>
        /// The previous expectation state
        /// </summary>
        private Expect.EventState prevState;
        public Expect.EventState PrevState
        {
            get { return prevState; }
            private set { prevState = value; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="expect">the expectation which changed</param>
        /// <param name="newState">the new expectation state</param>
        /// <param name="prevState">the previous expectation state</param>
        /// <param name="message">the message associated to this expectation state change</param>
        public ExpectationStateChange(Expect expect)
            : base("Expectation state change", expect.Expectation)
        {
            Expect = expect;
        }

        /// <summary>
        /// Apply the expectation state change
        /// </summary>
        /// <param name="localScope">The values of local variables</param>
        public override void Apply(Interpreter.InterpretationContext context)
        {
            base.Apply(context);

            PrevState = Expect.State;
        }

        /// <summary>
        /// Rollsback the changes performed during this event
        /// </summary>
        public override void RollBack()
        {
            base.RollBack();

            Expect.State = prevState;
        }
    }

    public class FailedExpectation : ExpectationStateChange
    {
        /// <summary>
        /// The log associated to this expectation state change
        /// </summary>
        private Utils.ElementLog elementLog;
        private Utils.ElementLog ElementLog
        {
            get { return elementLog; }
            set { elementLog = value; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="expect"></param>
        public FailedExpectation(Expect expect)
            : base(expect)
        {
            Message = "Failed expectation : " + Expect.Expectation.Name;
        }

        /// <summary>
        /// Apply the failed expectation
        /// </summary>
        /// <param name="localScope">The values of local variables</param>
        public override void Apply(Interpreter.InterpretationContext context)
        {
            base.Apply(context);

            Expect.State = Events.Expect.EventState.TimeOut;
            TimeLine.ActiveExpectations.Remove(Expect);

            ElementLog = Expect.Expectation.AddError(Message);
        }

        /// <summary>
        /// Rollsback the changes performed during this event
        /// </summary>
        public override void RollBack()
        {
            base.RollBack();

            TimeLine.ActiveExpectations.Add(Expect);
            Expect.Expectation.RemoveLog(ElementLog);
        }
    }


    public class ExpectationReached : ExpectationStateChange
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="expect"></param>
        public ExpectationReached(Expect expect)
            : base(expect)
        {
            Message = "Expectation reached : " + Expect.Expectation.Name;
        }

        /// <summary>
        /// Apply the reached expectation
        /// </summary>
        /// <param name="localScope">The values of local variables</param>
        public override void Apply(Interpreter.InterpretationContext context)
        {
            base.Apply(context);

            Expect.State = Events.Expect.EventState.Fullfilled;
            TimeLine.ActiveExpectations.Remove(Expect);
        }

        /// <summary>
        /// Rolls back the changes for this expectation
        /// </summary>
        public override void RollBack()
        {
            TimeLine.ActiveExpectations.Add(Expect);

            base.RollBack();
        }
    }
}
