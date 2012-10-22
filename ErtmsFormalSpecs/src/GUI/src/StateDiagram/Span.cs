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
using System.Linq;
using System.Text;
using System.Drawing;

namespace GUI.StateDiagram
{
    public class Span
    {
        /// <summary>
        /// The two bounds which define the span
        /// Hyp : LowBound <= HighBound
        /// </summary>
        public int LowBound { get; set; }
        public int HighBound { get; set; }

        /// <summary>
        /// Provides the center of the span
        /// </summary>
        public int Center
        {
            get { return (HighBound - LowBound) / 2; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="b1"></param>
        /// <param name="b2"></param>
        public Span(int b1, int b2)
        {
            if (b1 < b2)
            {
                LowBound = b1;
                HighBound = b2;
            }
            else
            {
                LowBound = b2;
                HighBound = b1;
            }
        }

        /// <summary>
        /// Provides the intersection of two spans
        /// </summary>
        /// <param name="span1"></param>
        /// <param name="span2"></param>
        /// <returns></returns>
        public static Span Intersection(Span span1, Span span2)
        {
            Span retVal = null;

            if (span1.LowBound > span2.LowBound)
            {
                Span tmp = span1;
                span1 = span2;
                span2 = tmp;
            }
            // span1.LowBound <= span2.LowBound

            if (span1.HighBound < span2.LowBound)
            {
                retVal = null;
            }
            else
            {
                // span1.LowBound < span2.LowBound and span1.HighBound >= span2.LowBound
                int LowBound = span2.LowBound;

                int HighBound;
                if (span1.HighBound > span2.HighBound)
                {
                    HighBound = span2.HighBound;
                }
                else
                {
                    HighBound = span1.HighBound;
                }

                retVal = new Span(LowBound, HighBound);
            }

            return retVal;
        }

        /// <summary>
        /// Provides the union of two spans
        /// </summary>
        /// <param name="span1"></param>
        /// <param name="span2"></param>
        /// <returns></returns>
        public static Span Union(Span span1, Span span2)
        {
            Span retVal = null;

            if (span1.LowBound > span2.LowBound)
            {
                Span tmp = span1;
                span1 = span2;
                span2 = tmp;
            }
            // span1.LowBound <= span2.LowBound

            if (span1.HighBound < span2.LowBound)
            {
                retVal = null;
            }
            else
            {
                // span1.LowBound < span2.LowBound and span1.HighBound >= span2.LowBound
                int LowBound = span1.LowBound;

                int HighBound;
                if (span1.HighBound > span2.HighBound)
                {
                    HighBound = span1.HighBound;
                }
                else
                {
                    HighBound = span2.HighBound;
                }

                retVal = new Span(LowBound, HighBound);
            }

            return retVal;
        }

    }
}
