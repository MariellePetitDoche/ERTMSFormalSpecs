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

namespace DataDictionary.Functions.PredefinedFunctions
{
    /// <summary>
    /// Creates a new function which describes the minimal value of two surfaces
    /// </summary>
    public abstract class FunctionOnSurface : PredefinedFunction
    {
        /// <summary>
        /// The return type of this function
        /// </summary>
        public Function Returns { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        /// <param name="name">the name of the function</param>
        public FunctionOnSurface(EFSSystem efsSystem, string name)
            : base(efsSystem, name)
        {
            Returns = (Function)Generated.acceptor.getFactory().createFunction();
            Returns.Name = Name + "ReturnType";
            Returns.ReturnType = EFSSystem.DoubleType;
            Returns.setFather(this);

            Parameter returnTypeParam1 = (Parameter)Generated.acceptor.getFactory().createParameter();
            returnTypeParam1.Name = Name + "ReturnTypeParam1";
            returnTypeParam1.Type = EFSSystem.DoubleType;
            returnTypeParam1.setFather(Returns);
            Returns.appendParameters(returnTypeParam1);

            Parameter returnTypeParam2 = (Parameter)Generated.acceptor.getFactory().createParameter();
            returnTypeParam2.Name = Name + "ReturnTypeParam2";
            returnTypeParam2.Type = EFSSystem.DoubleType;
            returnTypeParam2.setFather(Returns);
            Returns.appendParameters(returnTypeParam2);
        }

        /// <summary>
        /// The return type of the available function
        /// </summary>
        public override Types.Type ReturnType
        {
            get { return Returns; }
        }
    }
}