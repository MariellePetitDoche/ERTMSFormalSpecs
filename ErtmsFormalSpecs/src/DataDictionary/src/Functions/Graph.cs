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
using ErtmsSolutions.Etcs.Subset26.BrakingCurves;
using ErtmsSolutions.SiUnits;

namespace DataDictionary.Functions
{
    /// <summary>
    /// The graph of a function is the complete representation of the function based on its parameters. 
    /// In EVC, the graph of a function is represented as non interrupted sequence of polynoms of the third degree
    /// </summary>
    public class Graph
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);


        public class Segment : IComparable<Segment>
        {
            /// <summary>
            /// This class represents the expression val(x) = sqrt ( v0² + 2a ( d - d0 ) )
            /// </summary>
            public class Curve
            {
                /// <summary>
                /// Acceleration
                /// </summary>
                public double a { get; set; }

                /// <summary>
                /// Initial speed
                /// </summary>
                public double v0 { get; set; }

                /// <summary>
                /// Initial distance
                /// </summary>
                public double d0 { get; set; }

                /// <summary>
                /// Constructor
                /// </summary>
                public Curve()
                {
                    a = 0.0;
                    v0 = 0.0;
                    d0 = 0.0;
                }

                /// <summary>
                /// Constructor
                /// </summary>
                /// <param name="a">Acceleration</param>
                /// <param name="v0">Initial speed</param>
                /// <param name="d0">Initial distance</param>
                public Curve(double a, double v0, double d0)
                {
                    this.a = a;
                    this.v0 = v0;
                    this.d0 = d0;
                }

                /// <summary>
                /// Computes the expression value
                /// </summary>
                /// <param name="d">Distance</param>
                /// <returns></returns>
                public double Val(double d)
                {
                    double retVal;
                    if (isFlat(this))
                    {
                        retVal = v0;
                    }
                    else
                    {
                        retVal = MS_To_KmH(Math.Sqrt(KmH_To_MS(v0) * KmH_To_MS(v0) + 2 * a * (d - d0)));
                    }
                    return retVal;
                }

                /// <summary>
                /// Computes the value x corresponding to a given f(x)
                /// We apply the formula d = ( (v*v) - (V0*V0) ) / 2*A
                /// </summary>
                /// <param name="Y">Speed</param>
                /// <returns></returns>
                public double InverseVal(double Y)
                {
                    double retVal = double.MaxValue;
                    if (a != 0)
                    {
                        retVal = d0 + (KmH_To_MS(Y) * KmH_To_MS(Y) - KmH_To_MS(v0) * KmH_To_MS(v0)) / (2 * a);
                    }
                    return retVal;
                }

                /// <summary>
                /// Converts speed expressed in km/h to m/s
                /// </summary>
                /// <param name="val"></param>
                /// <returns></returns>
                private double KmH_To_MS(double val)
                {
                    return (val * 1000) / 3600;
                }

                /// <summary>
                /// Converts speed expressed in m/s to km/h
                /// </summary>
                /// <param name="val"></param>
                /// <returns></returns>
                private double MS_To_KmH(double val)
                {
                    return (val * 3600) / 1000;
                }

                /// <summary>
                /// Indicates if the current curve equals the other curve
                /// </summary>
                /// <param name="other"></param>
                /// <returns></returns>
                public bool Equals(Curve other)
                {
                    bool retVal = false;
                    if (other != null)
                    {
                        retVal = a == other.a && v0 == other.v0 && d0 == other.d0;
                    }
                    else
                    {
                        throw new Exception("Cannot add two non flat segments");
                    }
                    return retVal;
                }

                /// <summary>
                /// Indicates if the curve is flat
                /// </summary>
                /// <param name="c">A curve</param>
                /// <returns></returns>
                public static bool isFlat(Curve c)
                {
                    return c.a == 0;
                }

                /// <summary>
                /// The operation to perform on the curves
                /// </summary>
                /// <param name="c1">The first curve</param>
                /// <param name="c2">The second curve</param>
                /// <returns></returns>
                public delegate Curve Op(Curve c1, Curve c2);

                /// <summary>
                /// Selects and delegates an operation for the curves provided. 
                /// Does not apply the operation on null curves
                /// </summary>
                /// <param name="c1">The first curve</param>
                /// <param name="c2">The second curve</param>
                /// <param name="op">The operation to delegate</param>
                /// <returns>The resulting segment</returns>
                private static Curve SelectAndDelegateOperation(Curve c1, Curve c2, Op op)
                {
                    Curve retVal = null;

                    if (c1 != null)
                    {
                        if (c2 != null)
                        {
                            retVal = op(c1, c2);
                        }
                        else
                        {
                            retVal = c1;
                        }
                    }
                    else
                    {
                        retVal = c2;
                    }

                    return retVal;
                }

                /// <summary>
                /// Add curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                private static Curve __add(Curve c1, Curve c2)
                {
                    Curve retVal = null;
                    if (isFlat(c1) && isFlat(c2))
                    {
                        retVal = new Curve(0.0, c1.v0 + c2.v0, 0.0);
                    }
                    else
                    {
                        throw new Exception("Cannot add two non flat curves");
                    }
                    return retVal;
                }

                /// <summary>
                /// Adds curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                public static Curve Add(Curve c1, Curve c2)
                {
                    return SelectAndDelegateOperation(c1, c2, __add);
                }

                /// <summary>
                /// Substract curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                private static Curve __substract(Curve c1, Curve c2)
                {
                    Curve retVal = null;

                    if (isFlat(c1) && isFlat(c2))
                    {
                        retVal = new Curve(0, c1.v0 - c2.v0, 0);
                    }
                    else
                    {
                        throw new Exception("Cannot substract two non flat curves");
                    }

                    return retVal;
                }

                /// <summary>
                /// Substracts curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                public static Curve Substract(Curve c1, Curve c2)
                {
                    return SelectAndDelegateOperation(c1, c2, __substract);
                }

                /// <summary>
                /// Multiplies flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                private static Curve __mult(Curve c1, Curve c2)
                {
                    Curve retVal = null;

                    if (isFlat(c1) && isFlat(c2))
                    {
                        retVal = new Curve(0.0, c1.v0 * c2.v0, 0.0);
                    }
                    else
                    {
                        throw new Exception("Cannot apply * on non flat curves");
                    }

                    return retVal;
                }

                /// <summary>
                /// Multiplies flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                public static Curve Mult(Curve c1, Curve c2)
                {
                    return SelectAndDelegateOperation(c1, c2, __mult);
                }

                /// <summary>
                /// Divides flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                private static Curve __div(Curve c1, Curve c2)
                {
                    Curve retVal = null;

                    if (isFlat(c1) && isFlat(c2))
                    {
                        retVal = new Curve(0.0, c1.v0 / c2.v0, 0.0);
                    }
                    else
                    {
                        throw new Exception("Cannot apply / on non flat curves");
                    }

                    return retVal;
                }

                /// <summary>
                /// Divides flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                public static Curve Div(Curve c1, Curve c2)
                {
                    return SelectAndDelegateOperation(c1, c2, __div);
                }

                /// <summary>
                /// Provides the minimum of two flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                private static Curve __min(Curve c1, Curve c2)
                {
                    Curve retVal = null;

                    if (isFlat(c1) && isFlat(c1))
                    {
                        retVal = new Curve(0.0, Math.Min(c1.v0, c2.v0), 0.0);
                    }
                    else
                    {
                        throw new Exception("Cannot apply Min on non flat curves");
                    }

                    return retVal;
                }

                /// <summary>
                /// Provides the minimum of two flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                public static Curve Min(Curve c1, Curve c2)
                {
                    return SelectAndDelegateOperation(c1, c2, __min);
                }

                /// <summary>
                /// Provides the maximum of two flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                private static Curve __max(Curve c1, Curve c2)
                {
                    Curve retVal = null;

                    if (isFlat(c1) && isFlat(c2))
                    {
                        retVal = new Curve(0.0, Math.Max(c1.v0, c2.v0), 0.0);
                    }
                    else
                    {
                        throw new Exception("Cannot apply Max on non flat coefficients");
                    }

                    return retVal;
                }

                /// <summary>
                /// Provides the maximum of two flat curves
                /// </summary>
                /// <param name="c1">First curve</param>
                /// <param name="c2">Second curve</param>
                /// <returns></returns>
                public static Curve Max(Curve c1, Curve c2)
                {
                    return SelectAndDelegateOperation(c1, c2, __max);
                }

                /// <summary>
                /// Negates the values of the curve
                /// </summary>
                public void Negate()
                {
                    if (Curve.isFlat(this))
                    {
                        a = -a;
                        v0 = -v0;
                        d0 = -d0;
                    }
                }
            }

            /// <summary>
            /// The start of the segment
            /// </summary>
            public double Start { get; set; }

            /// <summary>
            /// The end of the segment
            /// </summary>
            public double End { get; set; }

            /// <summary>
            /// The expression associated to the segment
            /// </summary>
            public Curve Expression { get; set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="start">The start of the segment</param>
            /// <param name="end">The end of the segment</param>
            /// <param name="a">Acceleration</param>
            /// <param name="v0">Initial speed</param>
            /// <param name="d0">Initial distance</param>
            public Segment(double start, double end, Curve c)
            {
                Start = start;
                End = end;
                Expression = new Curve(c.a, c.v0, c.d0);
            }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="start">Copy of the other segment</param>
            public Segment(Segment other)
            {
                Start = other.Start;
                End = other.End;
                Expression = other.Expression;
            }

            /// <summary>
            /// Indicates whether the value of x belongs to the segment
            /// </summary>
            /// <param name="x"></param>
            /// <returns></returns>
            public bool Contains(double x)
            {
                return x >= Start && x < End;
            }

            /// <summary>
            /// Computes the value associated to this segment for the value of d
            /// </summary>
            /// <param name="d">Distance</param>
            /// <returns></returns>
            public double Val(double d)
            {
                double retVal = 0;

                if (Contains(d))
                {
                    retVal = Expression.Val(d);
                }

                return retVal;
            }

            /// <summary>
            /// Computes the value of x corresponding to a given f(x)
            /// </summary>
            /// <param name="Y">Speed</param>
            /// <returns></returns>
            public double IntersectsAt(double Y)
            {
                double retVal = double.MaxValue;
                if (Expression.a != 0.0)  // this is a curve
                {
                    retVal = Expression.InverseVal(Y);
                }
                else
                {
                    retVal = Start;  // this is a flat segment
                }
                return retVal;
            }

            /// <summary>
            /// Compares the current segment to an other segment
            /// </summary>
            /// <param name="other"></param>
            /// <returns></returns>
            public int CompareTo(Segment other)
            {
                int retVal = 0;

                if (Start < other.Start)
                {
                    retVal = -1;
                }
                else if (Start > other.Start)
                {
                    retVal = 1;
                }
                else
                {
                    // Same start, compare the ends
                    if (End < other.End)
                    {
                        retVal = -1;
                    }
                    else if (End > other.End)
                    {
                        retVal = 1;
                    }
                }

                return retVal;
            }

            /// <summary>
            /// Indicates whether two segments are equal
            /// </summary>
            /// <param name="other"></param>
            /// <returns></returns>
            public bool Same(Segment other)
            {
                bool retVal;

                retVal = Start == other.Start && End == other.End && Expression.Equals(other.Expression);

                return retVal;
            }

            /// <summary>
            /// Redeuces the size of this segment according to the acceptable boudaries provided
            /// </summary>
            /// <param name="boundaries"></param>
            /// <returns></returns>
            public List<Segment> Reduce(List<Segment> boundaries)
            {
                List<Segment> retVal = new List<Segment>();

                foreach (Segment other in boundaries)
                {
                    double start = Math.Max(Start, other.Start); ;
                    double end = Math.Min(End, other.End);
                    if (start <= end)
                    {
                        Segment newSegment = new Segment(this);
                        newSegment.Start = start;
                        newSegment.End = end;
                        retVal.Add(newSegment);
                    }
                }

                return retVal;
            }

            public override string ToString()
            {
                string retVal;

                if (Start == 0 && End == double.MaxValue)
                {
                    retVal = "Always ";
                }
                else
                {
                    retVal = "[" + Start + ", " + End + "]: ";
                }

                if (Curve.isFlat(Expression))
                {
                    retVal = retVal + Expression.v0;
                }
                else
                {
                    retVal = retVal + " curve";
                }

                return retVal;
            }
        }

        /// <summary>
        /// The segments associated to this graph
        /// </summary>
        public System.Collections.Generic.List<Segment> Segments { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public Graph()
        {
            Segments = new List<Segment>();
        }

        /// <summary>
        /// Adds a new segment in the ordered list of segments
        /// </summary>
        /// <param name="segment">The segment to add</param>
        public void addSegment(Segment segment)
        {
            // Recompute segment bounds according to existing segments
            foreach (Segment otherSegment in Segments)
            {
                if (otherSegment.Start <= segment.Start && otherSegment.End > segment.End)
                {
                    segment.Start = 0;
                    segment.End = 0;
                }

                if (otherSegment.Start <= segment.Start && otherSegment.End > segment.Start)
                {
                    segment.Start = otherSegment.End;
                }

                if (otherSegment.Start <= segment.End && otherSegment.End > segment.End)
                {
                    segment.End = otherSegment.Start;
                }
            }

            if (segment.Start < segment.End)
            {
                // Add the segment in the ordered list of segments
                // According to first phase, we know that there is no overlap of segments
                int i = 0;
                while (i < Segments.Count)
                {
                    if (Segments[i].Start >= segment.End)
                    {
                        Segments.Insert(i, segment);
                        segment = null;
                        break;
                    }
                    i = i + 1;
                }

                if (segment != null)
                {
                    Segments.Add(segment);
                }
            }
            else if (segment.Start > segment.End)
            {
                throw new Exception("Invalid segment starting at " + segment.Start + " and ending at " + segment.End);
            }
        }

        /// <summary>
        /// Computes the value of the function for a given x value
        /// </summary>
        /// <param name="x"></param>
        /// <returns></returns>
        public double Val(double x)
        {
            double retVal = 0;

            foreach (Segment segment in Segments)
            {
                if (segment.Contains(x))
                {
                    retVal = segment.Val(x);
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the last X value where there is some interest to show the graph
        /// </summary>
        /// <returns></returns>
        public double ExpectedEndX()
        {
            double retVal = 0;

            double totalSegmentSize = 0;
            int segmentCount = 0;
            foreach (Segment segment in Segments)
            {
                double start = segment.Start;
                double end = segment.End;

                if (end == double.MaxValue)
                {
                    if (totalSegmentSize != 0 && segmentCount != 0)
                    {
                        retVal = Math.Floor(start + totalSegmentSize / segmentCount) + 1.0;
                    }
                    else
                    {
                        retVal = start + 1000;
                    }
                }
                totalSegmentSize = totalSegmentSize + (end - start);
                segmentCount = segmentCount + 1;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the flat speed / distance curve for this graph
        /// </summary>
        /// <returns></returns>
        public FlatSpeedDistanceCurve FlatSpeedDistanceCurve()
        {
            return FlatSpeedDistanceCurve(double.MaxValue);
        }

        /// <summary>
        /// Provides the flat speed / distance curve for this graph
        /// </summary>
        /// <param name="expectedEnd">the last X value</param>
        /// <returns></returns>
        public FlatSpeedDistanceCurve FlatSpeedDistanceCurve(double expectedEnd)
        {
            FlatSpeedDistanceCurve curve = new FlatSpeedDistanceCurve();

            foreach (Segment segment in Segments)
            {
                double start = segment.Start;
                double end = segment.End;

                if (end == double.MaxValue)
                {
                    end = expectedEnd;
                }

                curve.Add(
                    new SiDistance(segment.Start, SiDistance_SubUnits.Meter),
                    new SiDistance(end, SiDistance_SubUnits.Meter),
                    new SiSpeed(segment.Expression.v0, SiSpeed_SubUnits.KiloMeter_per_Hour));
            }

            return curve;
        }

        /// <summary>
        /// Provides the quadratic speed / distance curve for this graph
        /// </summary>
        /// <returns></returns>
        public QuadraticSpeedDistanceCurve QuadraticSpeedDistanceCurve()
        {
            return QuadraticSpeedDistanceCurve(double.MaxValue);
        }

        /// <summary>
        /// Provides the quadratic speed / distance curve for this graph
        /// </summary>
        /// <param name="expectedEnd">the last X value</param>
        /// <returns></returns>
        public QuadraticSpeedDistanceCurve QuadraticSpeedDistanceCurve(double expectedEnd)
        {
            QuadraticSpeedDistanceCurve curve = new QuadraticSpeedDistanceCurve();

            foreach (Segment segment in Segments)
            {
                double start = segment.Start;
                double end = segment.End;

                if (end == double.MaxValue)
                {
                    end = expectedEnd;
                }

                curve.Add(
                    new SiDistance(segment.Start, SiDistance_SubUnits.Meter),
                    new SiDistance(end, SiDistance_SubUnits.Meter),
                    new SiAcceleration(segment.Expression.a, SiAcceleration_SubUnits.Meter_per_SecondSquare),
                    new SiSpeed(segment.Expression.v0, SiSpeed_SubUnits.KiloMeter_per_Hour),
                    new SiDistance(segment.Expression.d0, SiDistance_SubUnits.Meter));
            }

            return curve;
        }

        /// <summary>
        /// Provides the flat acceleration / speed curve for this graph
        /// </summary>
        /// <param name="expectedEnd">The expected end for the curve</param>
        /// <returns></returns>
        public FlatAccelerationSpeedCurve FlatAccelerationSpeedCurve(double expectedEnd)
        {
            FlatAccelerationSpeedCurve curve = new FlatAccelerationSpeedCurve();

            double totalSegmentSize = 0;
            int segmentCount = 0;
            foreach (Segment segment in Segments)
            {
                double start = segment.Start;
                if (start <= expectedEnd)
                {
                    double end = Math.Min(segment.End, expectedEnd);

                    totalSegmentSize = totalSegmentSize + (end - start);
                    segmentCount = segmentCount + 1;

                    curve.Add(
                        new SiSpeed(segment.Start, SiSpeed_SubUnits.KiloMeter_per_Hour),
                        new SiSpeed(end, SiSpeed_SubUnits.KiloMeter_per_Hour),
                        new SiAcceleration(-segment.Expression.v0, SiAcceleration_SubUnits.Meter_per_SecondSquare));  // decelerations are negative
                }
            }

            return curve;
        }

        /// <summary>
        /// Provides the function associated to this graph
        /// </summary>
        private Function function;
        public Function Function
        {
            get
            {
                if (function == null)
                {
                    // Create a function associated to this graph
                    function = (Function)Generated.acceptor.getFactory().createFunction();
                    function.Name = "GraphRelatedFunction";
                    function.ReturnType = EFSSystem.INSTANCE.DoubleType;
                    function.Graph = this;

                    Parameter parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
                    parameter.Name = "X";
                    parameter.Type = EFSSystem.INSTANCE.DoubleType;
                    function.appendParameters(parameter);
                }

                return function;
            }
            set
            {
                function = value;
            }
        }

        /// <summary>
        /// Provides the graph associated to the namable
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public static Graph createGraph(Utils.INamable namable, Parameter parameter)
        {
            Graph retVal = null;

            Functions.Function function = namable as Functions.Function;
            if (function != null)
            {
                retVal = function.createGraphForParameter(new Interpreter.InterpretationContext(), parameter);
            }

            if (retVal == null)
            {
                Values.IValue value = namable as Values.IValue;
                if (value != null)
                {
                    retVal = createGraph(Function.getDoubleValue(value), parameter);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Creates a graph for a single constant value
        /// </summary>
        /// <param name="retVal"></param>
        /// <param name="value"></param>
        /// <returns></returns>
        public static Graph createGraph(double value, Parameter parameter = null)
        {
            Graph retVal = new Functions.Graph();

            Functions.Graph.Segment segment = new Functions.Graph.Segment(0, double.MaxValue, new Segment.Curve());
            segment.Expression.v0 = value;
            retVal.addSegment(segment);

            return retVal;
        }

        /// <summary>
        /// Reduces the graph to the boundaries provided as parameter
        /// </summary>
        /// <param name="boundaries"></param>
        /// <returns>The reduced graph</returns>
        public void Reduce(List<Segment> boundaries)
        {
            List<Segment> tmp = new List<Segment>();

            foreach (Segment segment in Segments)
            {
                foreach (Segment newSegment in segment.Reduce(boundaries))
                {
                    tmp.Add(newSegment);
                }
            }

            Segments = tmp;
        }

        /// <summary>
        /// Merges a graph within this one
        /// </summary>
        /// <param name="subGraph"></param>
        public void Merge(Graph subGraph)
        {
            List<Segment> toProcess = new List<Segment>(subGraph.Segments);
            List<Segment> toAdd = new List<Segment>();

            while (toProcess.Count > 0)
            {
                Segment segment = toProcess[0];
                toProcess.Remove(segment);

                // Reduce this segment according to the existing segments
                foreach (Segment existingSegment in Segments)
                {
                    if (existingSegment.Start <= segment.Start)
                    {
                        if (existingSegment.End < segment.End)
                        {
                            // The existing segment reduces the start of this segment
                            segment.Start = Math.Max(segment.Start, existingSegment.End);
                        }
                        else
                        {
                            // This segment is completely overriden by the existing segment;
                            segment = null;
                            break;
                        }
                    }
                    else
                    {
                        // existingSegment.Start >= segment.Start
                        if (existingSegment.Start < segment.End)
                        {
                            if (existingSegment.End < segment.End)
                            {
                                // This segment splits the current segment in two.
                                Segment newSegment = new Segment(existingSegment.End, segment.End, segment.Expression);
                                toProcess.Insert(0, newSegment);
                            }
                            segment.End = existingSegment.Start;
                        }
                        else
                        {
                            // the existing segment does not impact this segment                            
                        }
                    }
                }

                if (segment != null)
                {
                    if (segment.Start < segment.End)
                    {
                        toAdd.Add(segment);
                    }
                }
            }

            Segments.AddRange(toAdd);
            Segments.Sort();
        }

        /// <summary>
        /// Indicates whether this graph corresponds to a flat curve or to a quadratic curve
        /// </summary>
        /// <returns></returns>
        public bool IsFlat()
        {
            bool retVal = true;

            foreach (Segment segment in Segments)
            {
                retVal = segment.Expression.a == 0;
                if (!retVal)
                {
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Performs an operation based on two graphs
        /// </summary>
        /// <param name="first">the first graph</param>
        /// <param name="second">the second graph</param>
        /// <param name="operation">the operation to perform on these graphs</param>
        /// <returns>the new graph</returns>
        private static Graph CombineTwoGraphs(Graph first, Graph second, Segment.Curve.Op operation)
        {
            Graph retVal = new Graph();

            int i = 0;
            int j = 0;

            double start = 0;
            while (i < first.Segments.Count && j < second.Segments.Count)
            {
                Segment segment_i = first.Segments[i];
                Segment segment_j = second.Segments[j];


                double end;
                if (segment_i.End < segment_j.End)
                {
                    end = segment_i.End;
                    i = i + 1;
                }
                else
                {
                    end = segment_j.End;
                    j = j + 1;
                }

                Segment.Curve val = operation(segment_i.Expression, segment_j.Expression);
                retVal.addSegment(new Segment(start, end, val));
                start = end;
            }

            while (i < first.Segments.Count)
            {
                Segment segment_i = first.Segments[i];

                Segment.Curve val = operation(segment_i.Expression, null);
                retVal.addSegment(new Segment(start, segment_i.End, val));

                start = segment_i.End;
                i = i + 1;
            }

            while (j < second.Segments.Count)
            {
                Segment segment_j = second.Segments[j];

                Segment.Curve val = operation(null, segment_j.Expression);
                retVal.addSegment(new Segment(start, segment_j.End, val));

                start = segment_j.End;
                j = j + 1;
            }

            retVal.MergeDuplicates();

            return retVal;
        }


        /// <summary>
        /// Merges duplicate segments of a graph
        /// </summary>
        private void MergeDuplicates()
        {
            int i = 0;
            while (i < Segments.Count - 1)
            {
                if (Segments[i].Expression.Equals(Segments[i + 1].Expression))
                {
                    Segments[i].End = Segments[i + 1].End;
                    Segments.Remove(Segments[i + 1]);
                }
                else
                {
                    i++;
                }
            }
        }


        /// <summary>
        /// Adds a graph to this graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns>the new graph</returns>
        public Graph AddGraph(Graph other)
        {
            return CombineTwoGraphs(this, other, Segment.Curve.Add);
        }

        /// <summary>
        /// Substract a graph from this graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns>the new graph</returns>
        public Graph SubstractGraph(Graph other)
        {
            return CombineTwoGraphs(this, other, Segment.Curve.Substract);
        }

        /// <summary>
        /// Multiply this graph values of another graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns>the new graph</returns>
        public Graph MultGraph(Graph other)
        {
            return CombineTwoGraphs(this, other, Segment.Curve.Mult);
        }

        /// <summary>
        /// Divides this graph values by values of another graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns>the new graph</returns>
        public Graph DivGraph(Graph other)
        {
            return CombineTwoGraphs(this, other, Segment.Curve.Div);
        }

        /// <summary>
        /// Provides the graph of the minimal value between this graph and another graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public Graph Min(Graph other)
        {
            return CombineTwoGraphs(this, other, Segment.Curve.Min);
        }

        /// <summary>
        /// Provides the graph of the maximum value between this graph and another graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public Graph Max(Graph other)
        {
            return CombineTwoGraphs(this, other, Segment.Curve.Max);
        }

        /// <summary>
        /// Negates a graph
        /// </summary>
        public void Negate()
        {
            foreach (Segment segment in Segments)
            {
                segment.Expression.Negate();
            }
        }

        /// <summary>
        /// Crops the graph by removing the segments which are before the given position.
        /// </summary>
        /// <param name="position"></param>
        /// <returns></returns>
        public Graph Crop(double position)
        {
            Graph retVal = new Graph();

            foreach (Segment segment in Segments)
            {
                if (segment.End >= position)
                {
                    Segment newSegment = new Segment(segment);
                    newSegment.Start = Math.Max(0, newSegment.Start - position);
                    newSegment.End = newSegment.End - position;
                    retVal.addSegment(newSegment);
                }
            }

            return retVal;
        }

        /// <summary>
        /// In a flat graph, replaces one value with another one
        /// </summary>
        /// <param name="value">The value to find</param>
        /// <param name="newValue">The value which replaces the value found</param>
        /// <returns></returns>
        public Graph Replace(double value, double newValue)
        {
            Graph retVal = new Graph();

            if (IsFlat())
            {
                foreach (Segment segment in Segments)
                {
                    Segment newSegment = new Segment(segment);

                    if (newSegment.Expression.v0 == value)
                    {
                        newSegment.Expression.v0 = newValue;
                    }
                    retVal.addSegment(newSegment);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the segments of the graph which satisfy the operator with the value provided 
        /// </summary>
        /// <param name="Operator">The operator to apply</param>
        /// <param name="value">The value to compare with the values of the graph</param>
        /// <returns></returns>
        public List<Segment> GetSegments(Interpreter.BinaryExpression.OPERATOR Operator, double value)
        {
            List<Segment> retVal = new List<Segment>();

            foreach (Segment segment in Segments)
            {
                if (Segment.Curve.isFlat(segment.Expression))
                {
                    switch (Operator)
                    {
                        case Interpreter.BinaryExpression.OPERATOR.GREATER:
                            if (segment.Expression.v0 > value)
                            {
                                retVal.Add(segment);
                            }
                            break;

                        case Interpreter.BinaryExpression.OPERATOR.GREATER_OR_EQUAL:
                            if (segment.Expression.v0 >= value)
                            {
                                retVal.Add(segment);
                            }
                            break;

                        case Interpreter.BinaryExpression.OPERATOR.LESS_OR_EQUAL:
                            if (segment.Expression.v0 <= value)
                            {
                                retVal.Add(segment);
                            }
                            break;

                        case Interpreter.BinaryExpression.OPERATOR.LESS:
                            if (segment.Expression.v0 < value)
                            {
                                retVal.Add(segment);
                            }
                            break;

                        case Interpreter.BinaryExpression.OPERATOR.EQUAL:
                            if (segment.Expression.v0 == value)
                            {
                                retVal.Add(segment);
                            }
                            break;

                        default:
                            throw new Exception("Invalid operator " + Operator + " for segment comparison");
                    }
                }
                else
                {
                    throw new Exception("Non flat segments cannot be checked for " + Operator + " against " + value.ToString());
                }
            }

            return retVal;
        }

        /// <summary>
        /// Creates the graph of the function on which the increment function has been added
        /// </summary>
        /// <param name="context">the context used to evaluate the function</param>
        /// <param name="increment">The increment function do add</param>
        /// <returns></returns>
        public Graph AddIncrement(Interpreter.InterpretationContext context, Functions.Function increment)
        {
            Graph retVal = new Graph();

            if (IsFlat() && increment.FormalParameters.Count == 1)
            {
                Parameter parameter = (Parameter)increment.FormalParameters[0];
                foreach (Segment segment in Segments)
                {
                    Dictionary<string, Values.IValue> actuals = new Dictionary<string, Values.IValue>();
                    actuals[parameter.Name] = new Values.DoubleValue(increment.EFSSystem.DoubleType, segment.Expression.v0);
                    Values.IValue result = increment.Evaluate(context, actuals);
                    Segment newSegment = new Segment(segment);
                    newSegment.Expression.v0 = segment.Expression.v0 + Function.getDoubleValue(result);
                    retVal.addSegment(newSegment);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Indicates if the graph is equal to another graph
        /// </summary>
        /// <param name="aGraph"></param>
        /// <returns></returns>
        public bool Equals(Graph aGraph)
        {
            bool retVal = Segments.Count == aGraph.Segments.Count;
            if (retVal)
            {
                for (int i = 0; i < Segments.Count && retVal; i++)
                {
                    if (!(Segments[i].Expression.Equals(aGraph.Segments[i].Expression)))
                    {
                        retVal = false;
                    }
                }
            }
            return retVal;
        }

        /// <summary>
        /// Provides the first X coordinate where the Y corresponds to the parameter.
        /// In other words, we need to find the first x for which f(x) = y where 
        ///   f(x) = sqtr ( v0*v0 - 2 a2 * ( d0 - x ) )
        /// </summary>
        /// <param name="Y">The y for which the x must be found</param>
        /// <returns></returns>
        public double SolutionX(double Y)
        {
            double retVal = double.MaxValue;
            double upY = double.MaxValue;
            double downY = double.MinValue;
            double upX = 0;
            double downX = 0;

            foreach (Segment segment in Segments)
            {
                double up = segment.Val(segment.Start);
                if (up < upY && up >= Y)
                {
                    upY = up;
                    upX = segment.Start;
                }
                double down = 0;
                if (segment.End < double.MaxValue)
                {
                    down = segment.Val(segment.End - 0.0001);
                    if (down > downY && down <= Y)
                    {
                        downY = down;
                        downX = segment.End;
                    }
                }
                if (up < down)
                {
                    double tmp = up;
                    up = down;
                    down = tmp;
                }

                if (Y <= up && Y >= down)
                {
                    retVal = segment.IntersectsAt(Y);
                    break;
                }
            }

            if (retVal == double.MaxValue)
            {
                if (upY != double.MaxValue && downY != double.MinValue)
                {
                    retVal = (upX + downX) / 2;
                }
                Log.ErrorFormat("Impossible to compute the solution X for the graph");
            }

            return retVal;
        }

        /// <summary>
        /// Indicates if this graph is equal to the other graph
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public bool Same(Graph other)
        {
            bool retVal = false;

            if (Segments.Count == other.Segments.Count)
            {
                retVal = true;
                for (int i = 0; i < Segments.Count && retVal; i++)
                {
                    retVal = Segments[i].Same(other.Segments[i]);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Extends the graph to a graph where the ranges are expressed on the X axis
        /// </summary>
        /// <returns></returns>
        public Surface ToSurfaceX()
        {
            Surface retVal = new Surface(null, null);

            foreach (Graph.Segment segment in Segments)
            {
                Graph graph = new Graph();
                graph.addSegment(new Segment(0, double.MaxValue, new Segment.Curve(0, segment.Expression.v0, 0)));
                Surface.Segment newSegment = new Surface.Segment(segment.Start, segment.End, graph);

                retVal.AddSegment(newSegment);
            }

            return retVal;
        }

        /// <summary>
        /// Extends the graph to a graph where the ranges are expressed on the Y axis
        /// </summary>
        /// <returns></returns>
        public Surface ToSurfaceY()
        {
            Surface retVal = new Surface(null, null);

            retVal.AddSegment(new Surface.Segment(0, double.MaxValue, this));

            return retVal;
        }

        public override string ToString()
        {
            String retVal = "{";

            bool first = true;
            foreach (Segment segment in Segments)
            {
                if (!first)
                {
                    retVal = retVal + ", ";
                }
                retVal = retVal + segment.ToString();
                first = false;
            }
            retVal = retVal + "}";

            return retVal;
        }
    }
}
