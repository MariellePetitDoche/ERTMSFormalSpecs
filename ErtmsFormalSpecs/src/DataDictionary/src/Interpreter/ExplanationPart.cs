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
namespace DataDictionary.Interpreter
{
    /// <summary>
    /// Part of the explanation of an evaluation
    /// </summary>
    public class ExplanationPart
    {
        /// <summary>
        /// The explanation message
        /// </summary>
        private string _message;
        public string Message
        {
            get
            {
                if (_message == null && Change != null)
                {
                    if (Change.NewValue != null)
                    {
                        _message = Change.Variable.FullName + " <- " + Change.NewValue.FullName;
                    }
                    else
                    {
                        _message += Change.Variable.FullName + " <- <cannot evaluate value>";
                    }
                }
                return _message;
            }
            set
            {
                _message = value;
            }
        }

        /// <summary>
        /// The list of sub explanations
        /// </summary>
        public List<ExplanationPart> SubExplanations { get; private set; }

        /// <summary>
        /// The model element for which the explanation is created
        /// </summary>
        public ModelElement Element { get; private set; }

        /// <summary>
        /// The (optional) change for which this explanation part is created
        /// </summary>
        public DataDictionary.Rules.Change Change { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="element">The element for which this explanation part is created</param>
        public ExplanationPart(ModelElement element)
        {
            Element = element;
            Message = "<No explanation yet>";
            SubExplanations = new List<ExplanationPart>();
        }

        /// <summary>
        /// Constructor for an explanation, based on a change
        /// </summary>
        /// <param name="element">The element for which this explanation part is created</param>
        /// <param name="change">The change performed</param>
        public ExplanationPart(ModelElement element, DataDictionary.Rules.Change change)
        {
            Element = element;
            Change = change;
            SubExplanations = new List<ExplanationPart>();
        }

        public override string ToString()
        {
            string retVal = Message;

            foreach (ExplanationPart part in SubExplanations)
            {
                retVal += "\n" + part.ToString();
            }

            return retVal;
        }

    }
}
