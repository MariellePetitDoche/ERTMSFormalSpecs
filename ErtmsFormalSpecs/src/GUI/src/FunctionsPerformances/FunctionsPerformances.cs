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
using System.Windows.Forms;

namespace GUI.FunctionsPerformances
{
    public partial class FunctionsPerformances : Form
    {
        /// <summary>
        /// The EFS System for which this view is built
        /// </summary>
        private DataDictionary.EFSSystem EFSSystem { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public FunctionsPerformances()
        {
            InitializeComponent();
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        public FunctionsPerformances(DataDictionary.EFSSystem efsSystem)
        {
            EFSSystem = efsSystem;
            InitializeComponent();
            Refresh();
        }

        /// <summary>
        /// Provides the functions that consumed most of the time
        /// </summary>
        private class GetSlowest : DataDictionary.Generated.Visitor
        {
            /// <summary>
            /// The list of functions
            /// </summary>
            private List<DataDictionary.Functions.Function> Functions { get; set; }

            public GetSlowest(DataDictionary.EFSSystem efsSystem)
            {
                Functions = new List<DataDictionary.Functions.Function>();
                foreach (DataDictionary.Dictionary dictionary in efsSystem.Dictionaries)
                {
                    visit(dictionary, true);
                }
            }

            public override void visit(DataDictionary.Generated.Function obj, bool visitSubNodes)
            {
                DataDictionary.Functions.Function function = obj as DataDictionary.Functions.Function;

                Functions.Add(function);
            }

            private int Comparer(DataDictionary.Functions.Function f1, DataDictionary.Functions.Function f2)
            {
                if (f1.ExecutionTimeInMilli < f2.ExecutionTimeInMilli)
                {
                    return 1;
                }
                else if (f1.ExecutionTimeInMilli > f2.ExecutionTimeInMilli)
                {
                    return -1;
                }

                return 0;
            }

            /// <summary>
            /// Provides the functions associated with their descending execution time
            /// </summary>
            /// <returns></returns>
            public List<DataDictionary.Functions.Function> getFunctionsDesc()
            {
                List<DataDictionary.Functions.Function> retVal = Functions;

                retVal.Sort(new Comparison<DataDictionary.Functions.Function>(Comparer));

                return retVal;
            }
        }

        private class DisplayObject
        {
            private DataDictionary.Functions.Function Function { get; set; }

            public DisplayObject(DataDictionary.Functions.Function function)
            {
                Function = function;
            }

            public String FunctionName { get { return Function.FullName; } }

            public long ExecutionTime { get { return Function.ExecutionTimeInMilli; } }

            public int ExecutionCount { get { return Function.ExecutionCount; } }

            public int Average
            {
                get
                {
                    if (ExecutionCount > 0)
                    {
                        return (int)(ExecutionTime / ExecutionCount);
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        }

        public override void Refresh()
        {
            if (EFSSystem != null && dataGridView != null)
            {
                GetSlowest getter = new GetSlowest(EFSSystem);
                List<DataDictionary.Functions.Function> functions = getter.getFunctionsDesc();
                List<DisplayObject> source = new List<DisplayObject>();
                foreach (DataDictionary.Functions.Function function in functions)
                {
                    source.Add(new DisplayObject(function));
                }
                dataGridView.DataSource = source;
            }

            base.Refresh();
        }
    }
}