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
    /// Creates a new function which provides a list of targets from a graph
    /// </summary>
    public class Targets : PredefinedFunction
    {
        /// <summary>
        /// The MRSP function
        /// </summary>
        public Parameter Targets1 { get; private set; }

        /// <summary>
        /// The MA function
        /// </summary>
        public Parameter Targets2 { get; private set; }

        /// <summary>
        /// The SR function
        /// </summary>
        public Parameter Targets3 { get; private set; }

        /// <summary>
        /// The return type of the function
        /// </summary>
        public override DataDictionary.Types.Type ReturnType
        {
            get { return EFSSystem.findType(OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Kernel.SpeedAndDistanceMonitoring.TargetSupervision"), "Kernel.SpeedAndDistanceMonitoring.TargetSupervision.Targets"); }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        public Targets(EFSSystem efsSystem)
            : base(efsSystem, "TARGETS")
        {
            Targets1 = (Parameter)Generated.acceptor.getFactory().createParameter();
            Targets1.Name = "Targets1";
            Targets1.Type = EFSSystem.AnyType;
            Targets1.setFather(this);
            FormalParameters.Add(Targets1);

            Targets2 = (Parameter)Generated.acceptor.getFactory().createParameter();
            Targets2.Name = "Targets2";
            Targets2.Type = EFSSystem.AnyType;
            Targets2.setFather(this);
            FormalParameters.Add(Targets2);

            Targets3 = (Parameter)Generated.acceptor.getFactory().createParameter();
            Targets3.Name = "Targets3";
            Targets3.Type = EFSSystem.AnyType;
            Targets3.setFather(this);
            FormalParameters.Add(Targets3);
        }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="context">The evaluation context</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        public override void additionalChecks(ModelElement root, Interpreter.InterpretationContext context, Dictionary<string, Interpreter.Expression> actualParameters)
        {
            CheckFunctionalParameter(root, context, actualParameters[Targets1.Name], 1);
            CheckFunctionalParameter(root, context, actualParameters[Targets2.Name], 1);
            CheckFunctionalParameter(root, context, actualParameters[Targets3.Name], 1);

            Function function1 = actualParameters[Targets1.Name].GetExpressionType() as Function;
            Function function2 = actualParameters[Targets2.Name].GetExpressionType() as Function;
            Function function3 = actualParameters[Targets3.Name].GetExpressionType() as Function;

            if (function1 != null && function2 != null && function3 != null)
            {
                if (function1.ReturnType != function2.ReturnType || function2.ReturnType != function3.ReturnType)
                {
                    root.AddError("The types of functions provided are not the same");
                }
            }
        }

        /// <summary>
        /// Provides the value of the function
        /// </summary>
        /// <param name="instance">the instance on which the function is evaluated</param>
        /// <param name="actuals">the actual parameters values</param>
        /// <returns>The value for the function application</returns>
        public override Values.IValue Evaluate(Interpreter.InterpretationContext context, Dictionary<Variables.Actual, Values.IValue> actuals)
        {
            Values.IValue retVal = null;

            int token = context.LocalScope.PushContext();
            AssignParameters(context, actuals);

            Types.Collection collectionType = (Types.Collection)EFSSystem.findType(OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Kernel.SpeedAndDistanceMonitoring.TargetSupervision"), "Kernel.SpeedAndDistanceMonitoring.TargetSupervision.Targets");
            Values.ListValue collection = new Values.ListValue(collectionType, new List<Values.IValue>());

            // compute targets from the MRSP
            Function function1 = context.findOnStack(Targets1).Value as Functions.Function;
            if (function1 != null && !function1.Name.Equals("EMPTY"))
            {
                Graph graph1 = createGraphForValue(context, function1);
                ComputeTargets(graph1.Function, collection);
            }

            // compute targets from the MA
            Function function2 = context.findOnStack(Targets2).Value as Functions.Function;
            if (function2 != null && !function2.Name.Equals("EMPTY"))
            {
                Graph graph2 = createGraphForValue(context, function2);
                ComputeTargets(graph2.Function, collection);
            }

            // compute targets from the SR
            Function function3 = context.findOnStack(Targets3).Value as Functions.Function;
            if (function3 != null && !function3.Name.Equals("EMPTY"))
            {
                Graph graph3 = createGraphForValue(context, function3);
                ComputeTargets(graph3.Function, collection);
            }

            context.LocalScope.PopContext(token);

            retVal = collection;
            return retVal;
        }

        /// <summary>
        /// Coputes targets from the function and adds them to the collection
        /// </summary>
        /// <param name="function">Function containing targets</param>
        /// <param name="collection">Collection to be filled with targets</param>
        private void ComputeTargets(Function function, Values.ListValue collection)
        {
            if (function != null)
            {
                Graph graph = function.Graph;
                if (graph != null && graph.Segments.Count > 1)
                {
                    double prevSpeed = Double.MaxValue;
                    for (int i = 1; i < graph.Segments.Count; i++)
                    {
                        Graph.Segment s = graph.Segments[i];
                        Types.Structure structureType = (Types.Structure)EFSSystem.findType(OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Kernel.SpeedAndDistanceMonitoring.TargetSupervision"), "Kernel.SpeedAndDistanceMonitoring.TargetSupervision.Target");
                        Values.StructureValue value = new Values.StructureValue(structureType, structureType.NameSpace);

                        Variables.Variable speed = (Variables.Variable)DataDictionary.Generated.acceptor.getFactory().createVariable();
                        speed.Type = EFSSystem.findType(OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Default.BaseTypes"), "Default.BaseTypes.Speed");
                        speed.Name = "Speed";
                        speed.Mode = Generated.acceptor.VariableModeEnumType.aInternal;
                        speed.Default = "0.0";
                        speed.Enclosing = value;
                        speed.Value = new Values.DoubleValue(EFSSystem.DoubleType, s.Val(s.Start));
                        value.set(speed);

                        Variables.Variable location = (Variables.Variable)DataDictionary.Generated.acceptor.getFactory().createVariable();
                        location.Type = EFSSystem.findType(OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Default.BaseTypes"), "Default.BaseTypes.Distance");
                        location.Name = "Location";
                        location.Mode = Generated.acceptor.VariableModeEnumType.aInternal;
                        location.Default = "0.0";
                        location.Enclosing = value;
                        location.Value = new Values.DoubleValue(EFSSystem.DoubleType, s.Start);
                        value.set(location);

                        Variables.Variable length = (Variables.Variable)DataDictionary.Generated.acceptor.getFactory().createVariable();
                        length.Type = EFSSystem.findType(OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Default.BaseTypes"), "Default.BaseTypes.Length");
                        length.Name = "Length";
                        length.Mode = Generated.acceptor.VariableModeEnumType.aInternal;
                        length.Default = "0.0";
                        length.Enclosing = value;
                        length.Value = new Values.DoubleValue(EFSSystem.DoubleType, s.End);
                        value.set(length);

                        if (s.Val(s.Start) < prevSpeed)
                        {
                            collection.Val.Add(value);
                        }
                        prevSpeed = s.Val(s.Start);
                    }
                }
            }
        }
    }
}
