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
    /// Casts a value as a new value of range type 
    /// </summary>
    public class EmptyDoubleToDoubleFunction : PredefinedFunction
    {
        /// <summary>
        /// The parameter of the function
        /// </summary>
        public Parameter Value { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        /// <param name="name">the name of the cast function</param>
        public EmptyDoubleToDoubleFunction(EFSSystem efsSystem)
            : base(efsSystem, "EmptyDoubleToDoubleFunction")
        {
            Value = (Parameter)Generated.acceptor.getFactory().createParameter();
            Value.Name = "Value";
            Value.Type = EFSSystem.DoubleType;
            Value.setFather(this);
            FormalParameters.Add(Value);
        }

        /// <summary>
        /// The return type of the function
        /// </summary>
        public override Types.Type ReturnType
        {
            get { return EFSSystem.DoubleType; }
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
            return null;
        }

        public override Graph createGraph(Interpreter.InterpretationContext context)
        {
            return Functions.Graph.createGraph(Functions.Function.getDoubleValue(Value.Value));
        }
    }
}
