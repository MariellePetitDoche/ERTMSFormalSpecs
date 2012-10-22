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

namespace DataDictionary.Rules
{
    /// <summary>
    /// Records a change event
    /// </summary>
    public class Change
    {
        /// <summary>
        /// Indicates whether the change has already been applied
        /// </summary>
        public bool Applied { get; private set; }

        /// <summary>
        /// The variable affected by the change
        /// </summary>
        public Variables.IVariable Variable { get; private set; }

        /// <summary>
        /// The value the variable had before the change
        /// </summary>
        public Values.IValue PreviousValue { get; private set; }

        /// <summary>
        /// The new value affected by the change
        /// </summary>
        public Values.IValue NewValue { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="variable"></param>
        /// <param name="previousValue"></param>
        /// <param name="newValue"></param>
        public Change(Variables.IVariable variable, Values.IValue previousValue, Values.IValue newValue)
        {
            Variable = variable;
            PreviousValue = previousValue;
            NewValue = newValue;
            Applied = false;
        }

        /// <summary>
        /// Applies the change if it has not yet been applied
        /// </summary>
        public void Apply()
        {
            if (!Applied)
            {
                Variable.Value = NewValue;
                Applied = true;
            }
        }

        /// <summary>
        /// Rolls back the change
        /// </summary>
        public void UnApply()
        {
            if (Applied)
            {
                Variable.Value = PreviousValue;
                Applied = false;
            }
        }
    }
}
