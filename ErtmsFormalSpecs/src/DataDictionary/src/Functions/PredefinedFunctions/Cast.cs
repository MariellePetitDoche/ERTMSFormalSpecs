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
    public class Cast : PredefinedFunction
    {
        /// <summary>
        /// The range type for which the cast is performed
        /// </summary>
        public Types.Range Range { get; private set; }

        /// <summary>
        /// The value which is casted
        /// </summary>
        public Parameter Value { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        /// <param name="name">the name of the cast function</param>
        public Cast(Types.Range range)
            : base(range.EFSSystem, range.Name)
        {
            Range = range;

            Value = (Parameter)Generated.acceptor.getFactory().createParameter();
            Value.Name = "Value";
            Value.Type = EFSSystem.AnyType;
            Value.setFather(this);
            FormalParameters.Add(Value);
        }

        /// <summary>
        /// The return type of the cast function
        /// </summary>
        public override Types.Type ReturnType
        {
            get { return Range; }
        }

        /// <summary>
        /// Provides the value of the function
        /// </summary>
        /// <param name="instance">the instance on which the function is evaluated</param>
        /// <param name="actuals">the actual parameters values</param>
        /// <param name="localScope">the values of local variables</param>
        /// <returns>The value for the function application</returns>
        public override Values.IValue Evaluate(Interpreter.InterpretationContext context, Dictionary<Variables.IVariable, Values.IValue> actuals)
        {
            Values.IValue retVal = null;

            context.LocalScope.PushContext();
            AssignParameters(context, actuals);
            retVal = Range.convert(context.findOnStack(Value).Value);
            context.LocalScope.PopContext();

            return retVal;
        }

        public override Graph createGraph(Interpreter.InterpretationContext context, Parameter parameter)
        {
            return Functions.Graph.createGraph(Functions.Function.getDoubleValue(context.findOnStack(Value).Value), parameter);
        }
    }
}
