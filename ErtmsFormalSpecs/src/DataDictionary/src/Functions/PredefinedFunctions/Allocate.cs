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
    /// Allocates an element in a collection
    /// </summary>
    public class Allocate : PredefinedFunction
    {
        /// <summary>
        /// The value which is checked
        /// </summary>
        public Parameter Collection { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public Allocate(EFSSystem efsSystem)
            : base(efsSystem, "Allocate")
        {
            Collection = (Parameter)Generated.acceptor.getFactory().createParameter();
            Collection.Name = "Collection";
            Collection.Type = EFSSystem.GenericCollection;
            Collection.setFather(this);
            FormalParameters.Add(Collection);
        }

        /// <summary>
        /// The return type of the available function
        /// </summary>
        public override Types.Type ReturnType
        {
            get { return EFSSystem.AnyType; }
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

            Values.ListValue value = context.findOnStack(Collection) as Values.ListValue;
            if (value != null)
            {
                Types.Collection collectionType = value.Type as Types.Collection;
                if (collectionType != null && collectionType.Type != null)
                {
                    Types.Type elementType = collectionType.Type;

                    int i = 0;
                    while (i < value.Val.Count && value.Val[i] != EFSSystem.EmptyValue)
                    {
                        i += 1;
                    }

                    if (i < value.Val.Count)
                    {
                        retVal = elementType.DefaultValue;
                        value.Val[i] = retVal;
                    }
                    else
                    {
                        AddError("Cannot allocate element in list : list full");
                    }
                }
            }
            context.LocalScope.PopContext();

            return retVal;
        }
    }
}
