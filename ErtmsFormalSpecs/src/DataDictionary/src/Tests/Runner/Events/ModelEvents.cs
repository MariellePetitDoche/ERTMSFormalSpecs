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
    public abstract class ModelEvent
    {
        /// <summary>
        /// The event Id
        /// </summary>
        public string Id { get; set; }

        /// <summary>
        /// The message associated to this event
        /// </summary>
        public string Message { get; set; }

        /// <summary>
        /// The explanation about this model event
        /// </summary>
        public DataDictionary.Interpreter.ExplanationPart Explanation { get; set; }

        /// <summary>
        /// The event time
        /// </summary>
        public int Time { get; set; }

        /// <summary>
        /// The time line in which the model event sits
        /// </summary>
        public EventTimeLine TimeLine { get; set; }

        /// <summary>
        /// The instance on which this event occured
        /// </summary>
        public Utils.INamable Instance { get; private set; }

        /// <summary>
        /// The namespace associated to this event
        /// </summary>
        public abstract Types.NameSpace NameSpace { get; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="id"></param>
        public ModelEvent(string id, Utils.INamable instance)
        {
            Id = id;
            Message = id;
            Instance = instance;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="id"></param>
        /// <param name="message"></param>
        public ModelEvent(string id, string message)
        {
            Id = id;
            Message = message;
        }

        /// <summary>
        /// Indicates that the changes have been computed
        /// </summary>
        private bool changesComputed = false;

        /// <summary>
        /// Computes the changes related to this event
        /// </summary>
        /// <param name="apply">Indicates that the changes should be applied directly</param>
        /// <returns>True if changes should be computed</returns>
        public virtual bool ComputeChanges(bool apply)
        {
            bool retVal = !changesComputed;

            changesComputed = true;

            return retVal;
        }

        /// <summary>
        /// Applies the changes related to this event
        /// </summary>
        public virtual void Apply()
        {
            if (!changesComputed)
            {
                ComputeChanges(false);
            }
        }

        /// <summary>
        /// Rollsback the changes performed during this event
        /// </summary>
        public virtual void RollBack()
        {
            // By default, nothing to rollback
        }

        /// <summary>
        /// Displays informations related to this model event
        /// </summary>
        public override string ToString()
        {
            return Time.ToString() + ": " + Message;
        }
    }
}
