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
using ErtmsSolutions.Etcs.Subset26.BrakingCurves;
using ErtmsSolutions.SiUnits;

namespace DataDictionary.Functions.PredefinedFunctions
{
    /// <summary>
    /// Creates a new function which describes the maximum value of two functions
    /// </summary>
    public class DecelerationProfile : FunctionOnGraph
    {
        /// <summary>
        /// The MRSP 
        /// </summary>
        public Parameter SpeedRestrictions { get; private set; }

        /// <summary>
        /// The deceleration factor
        /// </summary>
        public Parameter DecelerationFactor { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        /// <param name="name">the name of the cast function</param>
        public DecelerationProfile(EFSSystem efsSystem)
            : base(efsSystem, "DecelerationProfile")
        {
            SpeedRestrictions = (Parameter)Generated.acceptor.getFactory().createParameter();
            SpeedRestrictions.Name = "SpeedRestrictions";
            SpeedRestrictions.Type = EFSSystem.AnyType;
            SpeedRestrictions.setFather(this);
            FormalParameters.Add(SpeedRestrictions);

            DecelerationFactor = (Parameter)Generated.acceptor.getFactory().createParameter();
            DecelerationFactor.Name = "DecelerationFactor";
            DecelerationFactor.Type = EFSSystem.AnyType;
            DecelerationFactor.setFather(this);
            FormalParameters.Add(DecelerationFactor);
        }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="context">The evaluation context</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        public override void additionalChecks(ModelElement root, Interpreter.InterpretationContext context, Dictionary<string, Interpreter.Expression> actualParameters)
        {
            CheckFunctionalParameter(root, context, actualParameters[SpeedRestrictions.Name], 1);
            CheckFunctionalParameter(root, context, actualParameters[DecelerationFactor.Name], 2);
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Graph createGraph(Interpreter.InterpretationContext context, Parameter parameter)
        {
            Graph retVal = null;

            Graph MRSPGraph = null;

            Function speedRestriction = SpeedRestrictions.Value as Function;
            if (speedRestriction != null)
            {
                Parameter p = (Parameter)speedRestriction.FormalParameters[0];

                context.LocalScope.PushContext();
                context.LocalScope.setGraphParameter(p);
                MRSPGraph = createGraphForValue(context, SpeedRestrictions.Value, p);
                context.LocalScope.PopContext();
            }

            if (MRSPGraph != null)
            {
                Surface DecelerationSurface = createSurfaceForValue(context, DecelerationFactor.Value);
                if (DecelerationSurface != null)
                {
                    FlatSpeedDistanceCurve MRSPCurve = MRSPGraph.FlatSpeedDistanceCurve(MRSPGraph.ExpectedEndX());
                    AccelerationSpeedDistanceSurface accelerationSurface = DecelerationSurface.createAccelerationSpeedDistanceSurface(double.MaxValue, double.MaxValue);
                    QuadraticSpeedDistanceCurve BrakingCurve = EtcsBrakingCurveBuilder.Build_A_Safe_Backward(accelerationSurface, MRSPCurve);

                    if (BrakingCurve != null)
                    {
                        retVal = new Graph();

                        // TODO : Remove the distinction between linear curves and quadratic curves
                        bool isLinear = true;
                        for (int i = 0; i < BrakingCurve.SegmentCount; i++)
                        {
                            QuadraticCurveSegment segment = BrakingCurve[i];
                            if (segment.A.ToUnits() != 0.0 || segment.V0.ToUnits() != 0.0)
                            {
                                isLinear = false;
                                break;
                            }
                        }

                        for (int i = 0; i < BrakingCurve.SegmentCount; i++)
                        {
                            QuadraticCurveSegment segment = BrakingCurve[i];

                            Graph.Segment newSegment;
                            if (isLinear)
                            {
                                newSegment = new Graph.Segment(
                                    segment.X.X0.ToUnits(),
                                    segment.X.X1.ToUnits(),
                                    new Graph.Segment.Curve(0.0, segment.V0.ToSubUnits(SiSpeed_SubUnits.KiloMeter_per_Hour), 0.0));
                            }
                            else
                            {
                                newSegment = new Graph.Segment(
                                    segment.X.X0.ToUnits(),
                                    segment.X.X1.ToUnits(),
                                    new Graph.Segment.Curve(
                                        segment.A.ToSubUnits(SiAcceleration_SubUnits.Meter_per_SecondSquare),
                                        segment.V0.ToSubUnits(SiSpeed_SubUnits.KiloMeter_per_Hour),
                                        segment.D0.ToSubUnits(SiDistance_SubUnits.Meter)
                                        )
                                    );
                            }
                            retVal.addSegment(newSegment);
                        }
                    }
                }
                else
                {
                    Log.Error("Cannot create surface for " + DecelerationFactor.ToString());
                }
            }
            else
            {
                Log.Error("Cannot create graph for " + SpeedRestrictions.ToString());
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
        public override Values.IValue Evaluate(Interpreter.InterpretationContext context, Dictionary<string, Values.IValue> actuals)
        {
            Values.IValue retVal = null;

            context.LocalScope.PushContext();
            AssignParameters(context, actuals);

            Function function = (Function)Generated.acceptor.getFactory().createFunction();
            function.Name = "DecelerationProfile ( SpeedRestrictions => " + getName(SpeedRestrictions) + ", DecelerationFactor => " + getName(DecelerationFactor) + ")";
            function.Enclosing = EFSSystem;
            Parameter parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
            parameter.Name = "X";
            parameter.Type = EFSSystem.DoubleType;
            function.appendParameters(parameter);
            function.ReturnType = EFSSystem.DoubleType;
            function.Graph = createGraph(context, parameter);

            retVal = function;
            context.LocalScope.PopContext();

            return retVal;
        }
    }
}
