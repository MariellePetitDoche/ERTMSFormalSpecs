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
    public class ApplyStatement : Statement, Utils.ISubDeclarator
    {
        /// <summary>
        /// The procedure to call
        /// </summary>
        public ProcedureCallStatement Call { get; private set; }

        /// <summary>
        /// The list on which the procedure should be called
        /// </summary>
        public Expression ListExpression { get; private set; }

        /// <summary>
        /// The iterator variable
        /// </summary>
        public Variables.Variable IteratorVariable { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        /// <param name="call">The corresponding function call designator</param>
        /// <param name="parameters">The expressions used to compute the parameters</param>
        public ApplyStatement(ModelElement root, ProcedureCallStatement call, Expression listExpression)
            : base(root)
        {
            Call = call;
            Call.Enclosing = this;

            ListExpression = listExpression;
            ListExpression.Enclosing = this;

            IteratorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            IteratorVariable.Enclosing = this;
            IteratorVariable.Name = "X";
        }

        /// <summary>
        /// Performs the semantic analysis of the statement
        /// </summary>
        /// <param name="context"></param>
        /// <returns>true if semantical analysis should be performed</returns>
        public override bool SemanticalAnalysis(InterpretationContext context)
        {
            bool retVal = base.SemanticalAnalysis(context);

            if (retVal)
            {
                ListExpression.SemanticAnalysis(context);
                Types.Collection collectionType = ListExpression.GetExpressionType() as Types.Collection;
                if (collectionType != null)
                {
                    IteratorVariable.Type = collectionType.Type;
                }

                context.LocalScope.PushContext();
                context.LocalScope.setVariable(IteratorVariable);
                Call.SemanticalAnalysis(context);
                context.LocalScope.PopContext();
            }

            return retVal;
        }

        /// <summary>
        /// The elements declared by this declarator
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = new Dictionary<string, List<Utils.INamable>>();

                Utils.ISubDeclaratorUtils.AppendNamable(retVal, IteratorVariable);

                return retVal;
            }
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            if (IteratorVariable.Name.CompareTo(name) == 0)
            {
                retVal.Add(IteratorVariable);
            }
        }

        /// <summary>
        /// Provides the statement which modifies the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>null if no statement modifies the element</returns>
        public override VariableUpdateStatement Modifies(Variables.IVariable variable)
        {
            VariableUpdateStatement retVal = Call.Modifies(variable);

            return retVal;
        }

        /// <summary>
        /// Provides the list of update statements induced by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void UpdateStatements(List<VariableUpdateStatement> retVal)
        {
            Call.UpdateStatements(retVal);
        }

        /// <summary>
        /// Provides the list of elements read by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void ReadElements(List<Variables.IVariable> retVal)
        {
            Call.ReadElements(retVal);
        }

        /// <summary>
        /// Checks the statement for semantical errors
        /// </summary>
        public override void CheckStatement()
        {
            InterpretationContext context = new InterpretationContext(Root);
            Types.Collection listExpressionType = ListExpression.GetExpressionType() as Types.Collection;
            if (listExpressionType == null)
            {
                Root.AddError("Target does not references a list variable");
            }

            context.LocalScope.setVariable(IteratorVariable);
            Call.CheckStatement(context);
        }

        /// <summary>
        /// Provides the changes performed by this statement
        /// </summary>
        /// <param name="instance">The instance on which the expression should be evaluated</param>
        /// <param name="retVal">the list to fill with changes</param>
        public override void GetChanges(InterpretationContext context, List<Rules.Change> retVal, ExplanationPart explanation)
        {
            Values.ListValue listValues = ListExpression.GetValue(context) as Values.ListValue;
            if (listValues != null)
            {
                context.LocalScope.PushContext();
                context.LocalScope.setVariable(IteratorVariable);
                foreach (Values.IValue value in listValues.Val)
                {
                    if (value != EFSSystem.EmptyValue)
                    {
                        IteratorVariable.Value = value;
                        Call.GetChanges(context, retVal, explanation);
                    }
                }
                context.LocalScope.PopContext();
            }
            else
            {
                Root.AddError("List expression does not evaluate to a list value");
            }
        }

        public override string ToString()
        {
            return "APPLY " + Call.ToString() + " ON " + ListExpression.ToString();
        }
    }
}
