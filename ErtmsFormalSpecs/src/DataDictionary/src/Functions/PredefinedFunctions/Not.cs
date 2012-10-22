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

namespace DataDictionary.Functions.PredefinedFunctions
{
    /// <summary>
    /// Negates a boolean
    /// </summary>
    public class Not : PredefinedFunction
    {
        /// <summary>
        /// The value which is checked
        /// </summary>
        public Parameter Value { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        /// <param name="name">the name of the cast function</param>
        public Not(EFSSystem efsSystem)
            : base(efsSystem, "NOT")
        {
            Value = (Parameter)Generated.acceptor.getFactory().createParameter();
            Value.Name = "Value";
            Value.Type = EFSSystem.BoolType;
            Value.setFather(this);
            FormalParameters.Add(Value);
        }

        /// <summary>
        /// The return type of the available function
        /// </summary>
        public override Types.Type ReturnType
        {
            get { return EFSSystem.BoolType; }
        }

        /// <summary>
        /// Provides the value of the function
        /// </summary>
        /// <param name="instance">the instance on which the function is evaluated</param>
        /// <param name="actuals">the actual parameters values</param>
        /// <param name="localScope">the values of local variables</param>
        /// <returns>The value for the function application</returns>
        public override Values.IValue Evaluate(Interpreter.InterpretationContext context, Dictionary<string, Values.IValue> actuals)
        {
            Values.IValue retVal = null;

            context.LocalScope.PushContext();
            AssignParameters(context, actuals);
            Values.BoolValue val = Value.Value as Values.BoolValue;
            if (val != null)
            {
                if (val.Val)
                {
                    retVal = EFSSystem.BoolType.False;
                }
                else
                {
                    retVal = EFSSystem.BoolType.True;
                }
            }
            context.LocalScope.PopContext();

            return retVal;
        }
    }
}
