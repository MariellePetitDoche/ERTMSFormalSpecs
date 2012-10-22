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
using System.Text.RegularExpressions;

using DataDictionary.Types;
using DataDictionary.Tests.Runner.Events;

namespace GUI.TestRunnerView.TimeLineControl
{
    public class FilterConfiguration
    {
        /// <summary>
        /// Keep expectation events
        /// </summary>
        public bool Expect { get; set; }

        /// <summary>
        /// Keep rule activations
        /// </summary>
        public bool RuleFired { get; set; }

        /// <summary>
        /// Keep variable updates
        /// </summary>
        public bool VariableUpdate { get; set; }

        /// <summary>
        /// Namespace that should be kept
        /// </summary>
        public List<NameSpace> NameSpaces { get; private set; }

        /// <summary>
        /// The regular expression used for filtering
        /// </summary>
        public string RegExp { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public FilterConfiguration()
        {
            Expect = true;
            RuleFired = true;
            VariableUpdate = true;
            NameSpaces = new List<NameSpace>();
        }

        /// <summary>
        /// Indicates that an event should be shown
        /// </summary>
        /// <param name="evt"></param>
        /// <returns></returns>
        public bool VisibleEvent(ModelEvent evt)
        {
            bool retVal = true;

            // Check event type
            retVal = retVal && (!(evt is Expect) || Expect);
            retVal = retVal && (!(evt is RuleFired) || RuleFired);
            retVal = retVal && (!(evt is VariableUpdate) || VariableUpdate);

            // Check event namespace
            if (retVal)
            {
                if (evt.NameSpace != null)
                {
                    retVal = NameSpaces.Contains(evt.NameSpace);
                }
            }

            // Keep messages that match the regular expression
            if (!Utils.Utils.isEmpty(RegExp))
            {
                Regex regularExpression = new Regex(RegExp);
                retVal = retVal || regularExpression.IsMatch(evt.Message);
            }

            // Ignore those internal events
            retVal = retVal && (!(evt is ExpectationStateChange));
            retVal = retVal && (!(evt is SubStepActivated));

            return retVal;
        }

    }
}
