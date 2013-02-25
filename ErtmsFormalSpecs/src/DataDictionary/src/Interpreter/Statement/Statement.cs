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

namespace DataDictionary.Interpreter.Statement
{
    public abstract class Statement : InterpreterTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        public Statement(ModelElement root)
            : base(root)
        {
        }

        /// <summary>
        /// Indicates whether the semantical analysis has already been performed
        /// </summary>
        protected bool SemanticalAnalysisDone { get; set; }

        /// <summary>
        /// Performs the semantic analysis of the statement
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <returns>true if semantical analysis should be performed</returns>
        public virtual bool SemanticAnalysis(Utils.INamable instance = null)
        {
            bool retVal = !SemanticalAnalysisDone;

            SemanticalAnalysisDone = true;

            return retVal;
        }

        /// <summary>
        /// Provides the type of this designator
        /// </summary>
        /// <returns></returns>
        public Types.Type getExpressionType()
        {
            Types.Type retVal = null;

            return retVal;
        }

        /// <summary>
        /// Checks the statement for semantical errors
        /// </summary>
        public abstract void CheckStatement();

        /// <summary>
        /// Provides the statement which modifies the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>null if no statement modifies the element</returns>
        public abstract VariableUpdateStatement Modifies(Types.ITypedElement variable);

        /// <summary>
        /// Provides the list of update statements induced by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public abstract void UpdateStatements(List<VariableUpdateStatement> retVal);

        /// <summary>
        /// Indicates whether this statement reads the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns></returns>
        public virtual bool Reads(Types.ITypedElement variable)
        {
            bool retVal = false;

            List<Types.ITypedElement> variablesRead = new List<Types.ITypedElement>();
            ReadElements(variablesRead);
            retVal = variablesRead.Contains(variable);

            return retVal;
        }

        /// <summary>
        /// Provides the list of variables read by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public abstract void ReadElements(List<Types.ITypedElement> retVal);

        /// <summary>
        /// Provides the changes performed by this statement
        /// </summary>
        /// <param name="context">The interpretation context used to perform evaluations</param>
        /// <param name="retVal">the list to fill with changes</param>
        /// <param name="explanation">The explanation for this change</param>
        public abstract void GetChanges(Interpreter.InterpretationContext context, List<Rules.Change> retVal, Interpreter.ExplanationPart explanation);
    }
}
