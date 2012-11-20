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
    public class Surface
    {
        public class Segment : IComparable<Segment>
        {
            /// <summary>
            /// The start of the segment
            /// </summary>
            public double Start { get; set; }

            /// <summary>
            /// The end of the segment
            /// </summary>
            public double End { get; set; }

            /// <summary>
            /// The graph associated to this segment
            /// </summary>
            public Graph Graph { get; private set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="start">The start of the segment</param>
            /// <param name="end">The end of the segment</param>
            /// <param name="graph">the graph for this segment</param>
            public Segment(double start, double end, Graph graph)
            {
                Start = start;
                End = end;
                Graph = graph;
            }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="other">The other segment to copy</param>
            public Segment(Segment other)
            {
                Start = other.Start;
                End = other.End;
                Graph = other.Graph;
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
            /// Indicates whether the segment is empty
            /// </summary>
            /// <returns></returns>
            public bool Empty()
            {
                return Start >= End;
            }

            /// <summary>
            /// The operation to perform on the graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            public delegate Graph Op(Graph graph1, Graph graph2);

            /// <summary>
            /// Selects and delegates an operation for the coefficients provided. 
            /// Does not apply the operation on null coefficients
            /// </summary>
            /// <param name="coef1">The first coefficients</param>
            /// <param name="coef2">The second coefficients</param>
            /// <param name="op">The operation to delegate</param>
            /// <returns>The resulting coefficients</returns>
            private static Graph SelectAndDelegateOperation(Graph coef1, Graph coef2, Op op)
            {
                Graph retVal = null;

                if (coef1 != null)
                {
                    if (coef2 != null)
                    {
                        retVal = op(coef1, coef2);
                    }
                    else
                    {
                        retVal = coef1;
                    }
                }
                else
                {
                    retVal = coef2;
                }

                return retVal;
            }

            /// <summary>
            /// Adds graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            private static Graph __add(Graph graph1, Graph graph2)
            {
                return graph1.AddGraph(graph2);
            }

            /// <summary>
            /// Adds graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            public static Graph Add(Graph graph1, Graph graph2)
            {
                return SelectAndDelegateOperation(graph1, graph2, __add);
            }

            /// <summary>
            /// Substract graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            private static Graph __substract(Graph graph1, Graph graph2)
            {
                return graph1.SubstractGraph(graph2);
            }

            /// <summary>
            /// Substract graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            public static Graph Substract(Graph graph1, Graph graph2)
            {
                return SelectAndDelegateOperation(graph1, graph2, __substract);
            }

            /// <summary>
            /// Multiplies graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            private static Graph __mult(Graph graph1, Graph graph2)
            {
                return graph1.MultGraph(graph2);
            }

            /// <summary>
            /// Substract graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            public static Graph Mult(Graph graph1, Graph graph2)
            {
                return SelectAndDelegateOperation(graph1, graph2, __mult);
            }

            /// <summary>
            /// Divides graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            private static Graph __div(Graph graph1, Graph graph2)
            {
                return graph1.DivGraph(graph2);
            }

            /// <summary>
            /// Divides graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            public static Graph Divide(Graph graph1, Graph graph2)
            {
                return SelectAndDelegateOperation(graph1, graph2, __div);
            }

            /// <summary>
            /// Merges two graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            private static Graph __merge(Graph graph1, Graph graph2)
            {
                graph1.Merge(graph2);

                return graph1;
            }

            /// <summary>
            /// Merges two graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            public static Graph Merge(Graph graph1, Graph graph2)
            {
                return SelectAndDelegateOperation(graph1, graph2, __merge);
            }

            /// <summary>
            /// Redeuces the size of this segment according to the acceptable boudaries provided
            /// </summary>
            /// <param name="boundaries"></param>
            /// <returns></returns>
            public List<Segment> Reduce(List<Graph.Segment> boundaries)
            {
                List<Segment> retVal = new List<Segment>();

                foreach (Graph.Segment other in boundaries)
                {
                    double start = Math.Max(Start, other.Start);
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

            /// <summary>
            /// Combines two graphs
            /// </summary>
            /// <param name="graph1"></param>
            /// <param name="graph2"></param>
            /// <returns></returns>
            private static Graph __override(Graph graph1, Graph graph2)
            {
                Graph retVal = graph2;

                if (graph2 == null)
                {
                    retVal = graph1;
                }

                return retVal;
            }

            /// <summary>
            /// Combines two graphs
            /// </summary>
            /// <param name="graph1"></param>
            /// <param name="graph2"></param>
            /// <returns></returns>
            public static Graph Override(Graph graph1, Graph graph2)
            {
                return SelectAndDelegateOperation(graph1, graph2, __override);
            }

            /// <summary>
            /// Provides the minimum of two graphs
            /// </summary>
            /// <param name="graph1"></param>
            /// <param name="graph2"></param>
            /// <returns></returns>
            private static Graph __min(Graph graph1, Graph graph2)
            {
                return graph1.Min(graph2);
            }

            /// <summary>
            /// Adds graphs
            /// </summary>
            /// <param name="coef1"></param>
            /// <param name="coef2"></param>
            /// <returns></returns>
            public static Graph Min(Graph graph1, Graph graph2)
            {
                return SelectAndDelegateOperation(graph1, graph2, __min);
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

                retVal = retVal + Graph.ToString();

                return retVal;
            }

            /// <summary>
            /// Negates the values of the graph in this segment
            /// </summary>
            public void Negate()
            {
                Graph.Negate();
            }
        }

        /// <summary>
        /// The segments associated to this graph
        /// </summary>
        public System.Collections.Generic.List<Segment> Segments { get; private set; }

        /// <summary>
        /// The X axis for this surface 
        /// </summary>
        public Parameter XParameter { get; set; }

        /// <summary>
        /// The Y axis for this surface 
        /// </summary>
        public Parameter YParameter { get; set; }

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
                    function.Name = "SurfaceRelatedFunction";
                    function.ReturnType = EFSSystem.INSTANCE.DoubleType;
                    function.Surface = this;

                    Parameter parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
                    parameter.Name = "X";
                    parameter.Type = EFSSystem.INSTANCE.DoubleType;
                    function.appendParameters(parameter);
                    parameter = (Parameter)Generated.acceptor.getFactory().createParameter();
                    parameter.Name = "Y";
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
        /// Constructor
        /// </summary>
        /// <param name="Xaxis">The X axis for this surface</param>
        /// <param name="Yaxis">The Y axis for this surface</param>
        public Surface(Parameter Xaxis, Parameter Yaxis)
        {
            Segments = new List<Segment>();

            XParameter = Xaxis;
            YParameter = Yaxis;
        }

        /// <summary>
        /// Adds a new segment in the list of segments of this surface
        /// </summary>
        /// <param name="segment"></param>
        public void AddSegment(Segment segment)
        {
            foreach (Segment other in Segments)
            {
                if (segment.Start < other.Start)
                {
                    if (segment.End > other.End)
                    {
                        Segment s2 = new Segment(other.End, segment.End, segment.Graph);
                        AddSegment(s2);
                    }
                    segment.End = other.Start;
                }
                else
                {
                    // segment.Start > other.Start
                    if (segment.Start < other.End)
                    {
                        if (segment.End < other.End)
                        {
                            segment = null;
                            break;
                        }
                        segment.Start = Math.Min(segment.End, other.End);
                    }
                }
            }

            if (segment != null)
            {
                Segments.Add(segment);
            }
        }

        /// <summary>
        /// Creates the surface for the Acceleration based on speed and distance (A(V,d))
        /// </summary>
        /// <returns></returns>
        public AccelerationSpeedDistanceSurface createAccelerationSpeedDistanceSurface(double expectedEndX, double expectedEndY)
        {
            AccelerationSpeedDistanceSurface retVal = new AccelerationSpeedDistanceSurface();

            foreach (Segment segment in Segments)
            {
                Graph graph = segment.Graph;
                FlatAccelerationSpeedCurve acc = graph.FlatAccelerationSpeedCurve(expectedEndY);
                for (int i = 0; i < acc.SegmentCount; i++)
                {
                    double start = segment.Start;
                    double end = segment.End;
                    if (end == double.MaxValue)
                    {
                        end = expectedEndX;
                    }

                    ConstantCurveSegment<SiSpeed, SiAcceleration> seg = acc[i];
                    SurfaceTile tile = new SurfaceTile(
                        new SiDistance(start, SiDistance_SubUnits.Meter),
                        new SiDistance(end, SiDistance_SubUnits.Meter),
                        seg.X.X0,
                        seg.X.X1,
                        seg.Y
                    );
                    retVal.Tiles.Add(tile);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Merges a surface within this one, using the X axis as the merge orientation
        /// </summary>
        /// <param name="otherSurface"></param>
        public void MergeX(Surface otherSurface)
        {
            List<Segment> toProcess = new List<Segment>(otherSurface.Segments);
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
                            if (existingSegment.End > segment.Start)
                            {
                                // The existing segment reduces the start of this segment
                                segment.Start = existingSegment.End;
                            }
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
                                Segment newSegment = new Segment(existingSegment.End, segment.End, segment.Graph);
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
        /// Merges tow surfaces, using the Y axis as the merge orientation
        /// </summary>
        /// <param name="otherSurface"></param>
        public static Surface MergeY(Surface first, Surface second)
        {
            return CombineTwoSurfaces(first, second, Segment.Merge);
        }

        /// <summary>
        /// Creates a surface for an Ivalue provided
        /// </summary>
        /// <param name="xParam"></param>
        /// <param name="yParam"></param>
        /// <param name="iValue"></param>
        /// <returns></returns>
        public static Surface createSurface(Parameter xParam, Parameter yParam, Values.IValue iValue)
        {
            Surface retVal = null;

            if (retVal == null)
            {
                Functions.Function function = iValue as Function;
                if (function != null)
                {
                    retVal = function.Surface;
                    if (retVal == null)
                    {
                        Graph graph = function.Graph;
                        if (graph != null)
                        {
                            retVal = new Surface(xParam, yParam);
                            Segment segment = new Segment(0, double.MaxValue, graph);
                            retVal.AddSegment(segment);
                        }
                    }
                }
            }

            if (retVal == null)
            {
                retVal = new Surface(xParam, yParam);
                Segment segment = new Segment(0, double.MaxValue, Graph.createGraph(iValue));
                retVal.AddSegment(segment);
            }

            return retVal;
        }

        /// <summary>
        /// Performs an operation based on two surfaces.
        /// </summary>
        /// <param name="first">the first surface</param>
        /// <param name="second">the second surface</param>
        /// <param name="operation"the operation to perform on these graphs
        /// <returns>the new graph</returns>
        private static Surface CombineTwoSurfaces(Surface first, Surface second, Segment.Op operation)
        {
            Surface retVal = new Surface(first.XParameter, first.YParameter);
            if (retVal.XParameter == null)
            {
                retVal.XParameter = second.XParameter;
            }
            if (retVal.YParameter == null)
            {
                retVal.YParameter = second.YParameter;
            }

            int i = 0;
            int j = 0;

            double start = 0;
            while (i < first.Segments.Count && j < second.Segments.Count)
            {
                Segment segment_i = first.Segments[i];
                Segment segment_j = second.Segments[j];

                if (segment_i.Start != segment_j.Start && start <= segment_i.Start && start <= segment_j.Start)
                {
                    if (segment_i.Start < segment_j.Start)
                    {
                        // First consider segment_i where no segment_j is available
                        if (segment_i.End <= segment_j.Start)
                        {
                            // No overlap
                            Graph val = operation(segment_i.Graph, null);
                            retVal.AddSegment(new Segment(start, segment_i.End, val));
                            start = segment_i.End;
                            i = i + 1;
                        }
                        else
                        {
                            // Overlap between segment_i and segment_j, segment_i is before segment_j
                            Graph val = operation(segment_i.Graph, null);
                            retVal.AddSegment(new Segment(start, segment_j.Start, val));
                            start = segment_j.Start;
                        }
                    }
                    else
                    {
                        // First consider segment_j where no segment_i is available
                        if (segment_j.End <= segment_i.Start)
                        {
                            // No overlap
                            Graph val = operation(segment_j.Graph, null);
                            retVal.AddSegment(new Segment(start, segment_j.End, val));
                            start = segment_j.End;
                            j = j + 1;
                        }
                        else
                        {
                            // Overlap between segment_i and segment_j, segment_j is before segment_i
                            Graph val = operation(segment_j.Graph, null);
                            retVal.AddSegment(new Segment(start, segment_i.Start, val));
                            start = segment_i.Start;
                        }
                    }
                }
                else
                {
                    double end;
                    if (segment_i.End < segment_j.End)
                    {
                        end = segment_i.End;
                        i = i + 1;
                    }
                    else
                    {
                        if (segment_i.End == segment_j.End)
                        {
                            i = i + 1;
                        }
                        end = segment_j.End;
                        j = j + 1;
                    }
                    Graph val = operation(segment_i.Graph, segment_j.Graph);
                    retVal.AddSegment(new Segment(start, end, val));
                    start = end;
                }
            }

            while (i < first.Segments.Count)
            {
                Segment segment_i = first.Segments[i];

                Graph val = operation(segment_i.Graph, null);
                retVal.AddSegment(new Segment(start, segment_i.End, val));

                start = segment_i.End;
                i = i + 1;
            }

            while (j < second.Segments.Count)
            {
                Segment segment_j = second.Segments[j];

                Graph val = operation(null, segment_j.Graph);
                retVal.AddSegment(new Segment(start, segment_j.End, val));

                start = segment_j.End;
                j = j + 1;
            }

            retVal.MergeDuplicates();

            return retVal;
        }

        /// <summary>
        /// Merges duplicate segments of a surface
        /// </summary>
        private void MergeDuplicates()
        {
            int i = 0;
            while (i < Segments.Count - 1)
            {
                if (Segments[i].Graph.Equals(Segments[i + 1].Graph))
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
        /// Adds two surfaces
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public Surface AddSurface(Surface other)
        {
            return CombineTwoSurfaces(this, other, Segment.Add);
        }

        /// <summary>
        /// Substract two surfaces
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public Surface SubstractSurface(Surface other)
        {
            return CombineTwoSurfaces(this, other, Segment.Substract);
        }

        /// <summary>
        /// Multiplies two surfaces
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public Surface MultiplySurface(Surface other)
        {
            return CombineTwoSurfaces(this, other, Segment.Mult);
        }

        /// <summary>
        /// Divides two surfaces
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public Surface DivideSurface(Surface other)
        {
            return CombineTwoSurfaces(this, other, Segment.Divide);
        }

        /// <summary>
        /// Reduces the graph to the boundaries provided as parameter
        /// </summary>
        /// <param name="boundaries"></param>
        /// <returns>The reduced graph</returns>
        public void Reduce(List<Graph.Segment> boundaries)
        {
            List<Segment> tmp = new List<Segment>();

            int i = 0;
            while (i < Segments.Count)
            {
                Segment segment = Segments[i];
                foreach (Segment newSegment in segment.Reduce(boundaries))
                {
                    tmp.Add(newSegment);
                }
                i += 1;
            }

            Segments = tmp;
        }

        /// <summary>
        /// Combines two surfaces by replacing in this the value of second 
        /// on each segment of this == def
        /// </summary>
        /// <param name="second"></param>
        /// <param name="def"></param>
        /// <returns></returns>
        public Surface Override(Surface second)
        {
            return CombineTwoSurfaces(this, second, Segment.Override);
        }

        /// <summary>
        /// Selects the minimum surface
        /// </summary>
        /// <param name="second"></param>
        /// <param name="def"></param>
        /// <returns></returns>
        public Surface Min(Surface second)
        {
            return CombineTwoSurfaces(this, second, Segment.Min);
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

        public double ExpectedEndY()
        {
            double retVal = 0;

            foreach (Segment segment in Segments)
            {
                retVal = Math.Max(retVal, segment.Graph.ExpectedEndX());
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to the coordinates given
        /// </summary>
        /// <param name="x"></param>
        /// <param name="y"></param>
        /// <returns></returns>
        public double Val(double x, double y)
        {
            double retVal = 0.0;

            foreach (Segment segment in Segments)
            {
                if (x >= segment.Start && x < segment.End)
                {
                    retVal = segment.Graph.Val(y);
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Creates a surface for a single constant value
        /// </summary>
        /// <param name="retVal"></param>
        /// <param name="value"></param>
        /// <returns></returns>
        public static Surface createSurface(double value, Parameter xParam, Parameter yParam)
        {
            Surface retVal = new Surface(xParam, yParam);

            Segment segment = new Segment(0, double.MaxValue, Graph.createGraph(value));
            retVal.AddSegment(segment);

            return retVal;
        }

        /// <summary>
        /// Creates a surface for the value provided expression
        /// </summary>
        /// <param name="iValue"></param>
        /// <param name="xParam"></param>
        /// <param name="yParam"></param>
        /// <returns></returns>
        public static Surface createSurface(Values.IValue namable, Parameter xParam, Parameter yParam)
        {
            Surface retVal = null;

            if (retVal == null)
            {
                Functions.Function function = namable as Functions.Function;
                if (function != null)
                {
                    retVal = function.Surface;
                }
            }

            if (retVal == null)
            {
                Values.IValue value = namable as Values.IValue;
                if (value != null)
                {
                    retVal = createSurface(Function.getDoubleValue(value), xParam, yParam);
                }
            }

            return retVal;
        }

        public override string ToString()
        {
            String retVal = "<{";

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
            retVal = retVal + "}>";

            return retVal;
        }

        /// <summary>
        /// Negates the surface contents
        /// </summary>
        /// <returns></returns>
        public void Negate()
        {
            foreach (Segment segment in Segments)
            {
                segment.Negate();
            }
        }
    }
}
