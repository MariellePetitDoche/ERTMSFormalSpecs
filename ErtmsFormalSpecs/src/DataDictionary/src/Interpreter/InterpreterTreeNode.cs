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

namespace DataDictionary.Interpreter
{
    public class InterpreterTreeNode
    {
        /// <summary>
        /// Some logging facility
        /// </summary>
        static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// The root element for which this interpreter tree node is created
        /// </summary>
        public ModelElement Root { get; private set; }

        /// <summary>
        /// The enclosing interpreter tree node
        /// </summary>
        public InterpreterTreeNode Enclosing { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this interpreter tree node is created</param>
        /// <param name="enclosingNode">The enclosing expression node</param>
        public InterpreterTreeNode(ModelElement root)
        {
            Root = root;
        }

        /// <summary>
        /// The EFS System for which this interpreter tree node is created
        /// </summary>
        public EFSSystem EFSSystem { get { return Root.EFSSystem; } }

        /// <summary>
        /// The Dictionary for which this interpreter tree node is created
        /// </summary>
        public Dictionary Dictionary { get { return Root.Dictionary; } }

        /// <summary>
        /// Adds an error message to the root element
        /// </summary>
        /// <param name="message"></param>
        public void AddError(string message)
        {
            if (Root != null)
            {
                Root.AddError(message);
            }
        }

        /// <summary>
        /// Adds an error message to the root element
        /// </summary>
        /// <param name="message"></param>
        public void AddWarning(string message)
        {
            if (Root != null)
            {
                Root.AddWarning(message);
            }
        }

    }
}
