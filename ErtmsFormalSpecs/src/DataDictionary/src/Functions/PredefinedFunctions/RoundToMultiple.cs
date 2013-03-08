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


namespace DataDictionary.Functions.PredefinedFunctions
{
    /// <summary>
    /// Creates a new function which rounds a value to a multiple of a certain value
    /// </summary>
    public class RoundToMultiple : PredefinedFunction
    {
        /// <summary>
        /// The value to be rounded
        /// </summary>
        public Parameter Value { get; private set; }

        /// <summary>
        /// The multiple
        /// </summary>
        public Parameter Multiple { get; private set; }

        /// <summary>
        /// The return type of the function
        /// </summary>
        public override DataDictionary.Types.Type ReturnType
        {
            get { return EFSSystem.DoubleType; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        public RoundToMultiple(EFSSystem efsSystem)
            : base(efsSystem, "RoundToMultiple")
        {
            Value = (Parameter)Generated.acceptor.getFactory().createParameter();
            Value.Name = "Value";
            Value.Type = EFSSystem.DoubleType;
            Value.setFather(this);
            FormalParameters.Add(Value);

            Multiple = (Parameter)Generated.acceptor.getFactory().createParameter();
            Multiple.Name = "Multiple";
            Multiple.Type = EFSSystem.DoubleType;
            Multiple.setFather(this);
            FormalParameters.Add(Multiple);
        }

        /// <summary>
        /// Provides the value of the function
        /// </summary>
        /// <param name="instance">the instance on which the function is evaluated</param>
        /// <param name="actuals">the actual parameters values</param>
        /// <returns>The value for the function application</returns>
        public override Values.IValue Evaluate(Interpreter.InterpretationContext context, Dictionary<Variables.IVariable, Values.IValue> actuals)
        {
            Values.IValue retVal = null;

            context.LocalScope.PushContext();
            AssignParameters(context, actuals);

            Values.DoubleValue value = context.findOnStack(Value).Value as Values.DoubleValue;
            Values.DoubleValue multiple = context.findOnStack(Multiple).Value as Values.DoubleValue;
            if (value != null && multiple != null)
            {
                double res = Math.Floor(value.Val);
                while (res > 0 && res % multiple.Val != 0)
                {
                    res--;
                }
                retVal = new Values.DoubleValue(ReturnType, res);
            }

            context.LocalScope.PopContext();

            return retVal;
        }
    }
}
