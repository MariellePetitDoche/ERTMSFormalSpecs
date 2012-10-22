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

namespace GUI.RulePerformances
{
    public partial class RulesPerformances : Form
    {
        /// <summary>
        /// The EFS System for which this view is built
        /// </summary>
        private DataDictionary.EFSSystem EFSSystem { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public RulesPerformances()
        {
            InitializeComponent();
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="efsSystem"></param>
        public RulesPerformances(DataDictionary.EFSSystem efsSystem)
        {
            EFSSystem = efsSystem;
            InitializeComponent();
            Refresh();
        }

        /// <summary>
        /// Provides the rules that consumed most of the time
        /// </summary>
        private class GetSlowest : DataDictionary.Generated.Visitor
        {
            /// <summary>
            /// The list of rules
            /// </summary>
            private List<DataDictionary.Rules.Rule> Rules { get; set; }

            public GetSlowest(DataDictionary.EFSSystem efsSystem)
            {
                Rules = new List<DataDictionary.Rules.Rule>();
                foreach (DataDictionary.Dictionary dictionary in efsSystem.Dictionaries)
                {
                    visit(dictionary, true);
                }
            }

            public override void visit(DataDictionary.Generated.Rule obj, bool visitSubNodes)
            {
                DataDictionary.Rules.Rule rule = obj as DataDictionary.Rules.Rule;

                Rules.Add(rule);
            }

            private int Comparer(DataDictionary.Rules.Rule r1, DataDictionary.Rules.Rule r2)
            {
                if (r1.ExecutionTimeInMilli < r2.ExecutionTimeInMilli)
                {
                    return 1;
                }
                else if (r1.ExecutionTimeInMilli > r2.ExecutionTimeInMilli)
                {
                    return -1;
                }

                return 0;
            }

            /// <summary>
            /// Provides the rules associated with their descending execution time
            /// </summary>
            /// <returns></returns>
            public List<DataDictionary.Rules.Rule> getRulesDesc()
            {
                List<DataDictionary.Rules.Rule> retVal = Rules;

                retVal.Sort(new Comparison<DataDictionary.Rules.Rule>(Comparer));

                return retVal;
            }
        }

        private class DisplayObject
        {
            private DataDictionary.Rules.Rule Rule { get; set; }

            public DisplayObject(DataDictionary.Rules.Rule rule)
            {
                Rule = rule;
            }

            public String RuleName { get { return Rule.FullName; } }

            public long ExecutionTime { get { return Rule.ExecutionTimeInMilli; } }

            public int ExecutionCount { get { return Rule.ExecutionCount; } }

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
                List<DataDictionary.Rules.Rule> rules = getter.getRulesDesc();
                List<DisplayObject> source = new List<DisplayObject>();
                foreach (DataDictionary.Rules.Rule rule in rules)
                {
                    source.Add(new DisplayObject(rule));
                }
                dataGridView.DataSource = source;
            }

            base.Refresh();
        }
    }
}