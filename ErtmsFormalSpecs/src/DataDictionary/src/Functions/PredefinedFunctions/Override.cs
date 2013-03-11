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
    /// Combines two surfaces (functions like f(V,d) ) using the following formula
    ///    Combine ( f1, f2, default ) = 
    ///        f1 == default  => f2
    ///        otherwise      => f1
    /// </summary>
    public class Override : PredefinedFunction
    {
        /// <summary>
        /// The first function to combine 
        /// </summary>
        public Parameter DefaultFunction { get; private set; }

        /// <summary>
        /// The second function to combine
        /// </summary>
        public Parameter OverrideFunction { get; private set; }

        /// <summary>
        /// The return type of this function
        /// </summary>
        public Function Returns { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        /// <param name="name">the name of the cast function</param>
        public Override(EFSSystem efsSystem)
            : base(efsSystem, "Override")
        {
            DefaultFunction = (Parameter)Generated.acceptor.getFactory().createParameter();
            DefaultFunction.Name = "Default";
            DefaultFunction.Type = EFSSystem.AnyType;
            DefaultFunction.setFather(this);
            FormalParameters.Add(DefaultFunction);

            OverrideFunction = (Parameter)Generated.acceptor.getFactory().createParameter();
            OverrideFunction.Name = "Override";
            OverrideFunction.Type = EFSSystem.AnyType;
            OverrideFunction.setFather(this);
            FormalParameters.Add(OverrideFunction);

            Returns = (Function)Generated.acceptor.getFactory().createFunction();
            Returns.Name = "Override";
            Returns.ReturnType = EFSSystem.DoubleType;
            Returns.setFather(this);

            Parameter distanceParam = (Parameter)Generated.acceptor.getFactory().createParameter();
            distanceParam.Name = "Distance";
            distanceParam.Type = EFSSystem.DoubleType;
            distanceParam.setFather(Returns);
            Returns.appendParameters(distanceParam);

            Parameter speedParameter = (Parameter)Generated.acceptor.getFactory().createParameter();
            speedParameter.Name = "Speed";
            speedParameter.Type = EFSSystem.DoubleType;
            speedParameter.setFather(Returns);
            Returns.appendParameters(speedParameter);
        }

        /// <summary>
        /// The return type of the available function
        /// </summary>
        public override Types.Type ReturnType
        {
            get { return Returns; }
        }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="context">The evaluation context</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        public override void additionalChecks(ModelElement root, Interpreter.InterpretationContext context, Dictionary<string, Interpreter.Expression> actualParameters)
        {
            CheckFunctionalParameter(root, context, actualParameters[DefaultFunction.Name], 2);
            CheckFunctionalParameter(root, context, actualParameters[OverrideFunction.Name], 2);
        }

        /// <summary>
        /// Provides the surface of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the surface</param>
        /// <returns></returns>
        public override Surface createSurface(Interpreter.InterpretationContext context)
        {
            Surface retVal = null;

            Surface defaultSurface = createSurfaceForValue(context, context.findOnStack(DefaultFunction).Value);
            if (defaultSurface != null)
            {
                Surface overrideSurface = createSurfaceForValue(context, context.findOnStack(OverrideFunction).Value);
                if (overrideSurface != null)
                {
                    retVal = defaultSurface.Override(overrideSurface);
                }
                else
                {
                    Log.Error("Cannot create graph for OVERRIDE argument");
                }
            }
            else
            {
                Log.Error("Cannot create graph for DEFAULT argument");
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value of the function
        /// </summary>
        /// <param name="instance">the instance on which the function is evaluated</param>
        /// <param name="actuals">the actual parameters values</param>
        /// <param name="localScope">the values of local variables</param>
        /// <returns>The value for the function application</returns>
        public override Values.IValue Evaluate(Interpreter.InterpretationContext context, Dictionary<Variables.Actual, Values.IValue> actuals)
        {
            Values.IValue retVal = null;

            int token = context.LocalScope.PushContext();
            AssignParameters(context, actuals);

            Function function = (Function)Generated.acceptor.getFactory().createFunction();
            function.Name = "Override ( Default => " + getName(DefaultFunction) + ", Override => " + getName(OverrideFunction) + ")";
            function.Enclosing = EFSSystem;
            function.Surface = createSurface(context);

            Parameter parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
            parameter.Name = "X";
            parameter.Type = EFSSystem.DoubleType;
            function.appendParameters(parameter);

            parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
            parameter.Name = "Y";
            parameter.Type = EFSSystem.DoubleType;
            function.appendParameters(parameter);

            function.ReturnType = EFSSystem.DoubleType;

            retVal = function;
            context.LocalScope.PopContext(token);

            return retVal;
        }
    }
}
