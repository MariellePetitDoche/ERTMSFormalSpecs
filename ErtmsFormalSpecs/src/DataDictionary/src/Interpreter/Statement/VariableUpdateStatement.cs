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
    public class VariableUpdateStatement : Statement
    {
        /// <summary>
        /// The designator which identifies the variable to update
        /// </summary>
        public Expression VariableIdentification { get; private set; }

        /// <summary>
        /// The expression expressing the value to set
        /// </summary>
        public Expression Expression { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        public VariableUpdateStatement(ModelElement root, Expression variableIdentification, Expression expression)
            : base(root)
        {
            VariableIdentification = variableIdentification;
            VariableIdentification.Enclosing = this;

            Expression = expression;
            Expression.Enclosing = this;
        }

        /// <summary>
        /// Performs the semantic analysis of the statement
        /// </summary>
        /// <param name="context"></param>
        public override void SemanticalAnalysis(InterpretationContext context)
        {
            base.SemanticalAnalysis(context);

            VariableIdentification.SemanticAnalysis(context, false);
            Expression.SemanticAnalysis(context, false);
        }

        /// <summary>
        /// Provides the target of this update statement
        /// </summary>
        public Types.ITypedElement Target
        {
            get
            {
                Types.ITypedElement retVal = null;

                bool prev = ModelElement.PerformLog;
                ModelElement.PerformLog = false;
                try
                {
                    retVal = VariableIdentification.GetTypedElement(new Interpreter.InterpretationContext(Root));
                }
                finally
                {
                    ModelElement.PerformLog = prev;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the statement which modifies the element
        /// </summary>
        /// <param name="element"></param>
        /// <returns>null if no statement modifies the element</returns>
        public override VariableUpdateStatement Modifies(Types.ITypedElement element)
        {
            VariableUpdateStatement retVal = null;

            if (element == Target)
            {
                retVal = this;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the list of update statements induced by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void UpdateStatements(List<VariableUpdateStatement> retVal)
        {
            retVal.Add(this);
        }

        /// <summary>
        /// Indicates whether this statement reads the element
        /// </summary>
        /// <param name="element"></param>
        /// <returns></returns>
        public override bool Reads(Types.ITypedElement element)
        {
            bool retVal = false;

            foreach (Types.ITypedElement el in Expression.Elements())
            {
                if (el == element)
                {
                    retVal = true;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the list of elements read by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void ReadElements(List<Types.ITypedElement> retVal)
        {
            Expression.Elements(new Interpreter.InterpretationContext(Root), retVal);
        }

        /// <summary>
        /// Checks the statement for semantical errors
        /// </summary>
        public override void CheckStatement()
        {
            InterpretationContext context = new InterpretationContext(Root);

            Variables.IProcedure procedure = Utils.EnclosingFinder<Variables.IProcedure>.find(Root);
            if (procedure != null)
            {
                foreach (Parameter parameter in procedure.FormalParameters)
                {
                    context.LocalScope.setVariable(parameter);
                }
            }

            Types.ITypedElement target = VariableIdentification.GetTypedElement(context);
            if (target != null)
            {
                if (target is Parameter)
                {
                    Root.AddError("Cannot assign procedure parameter, use a function instead");
                }
            }
            else
            {
                Root.AddError("Cannot find target " + VariableIdentification.ToString());
            }

            if (Expression != null)
            {
                Expression.checkExpression(context);

                Types.Type type = Expression.getExpressionType();
                if (type != null)
                {
                    if (target != null)
                    {
                        if (target.Type != null)
                        {
                            if (!target.Type.Match(type))
                            {
                                UnaryExpression unaryExpression = Expression as UnaryExpression;
                                if (unaryExpression != null && unaryExpression.Term.LiteralValue != null)
                                {
                                    if (target.Type.getValue(unaryExpression.ToString()) == null)
                                    {
                                        Root.AddError("Expression " + Expression.ToString() + " does not fit in variable " + VariableIdentification.ToString());
                                    }
                                }
                                else
                                {
                                    Root.AddError("Expression [" + Expression.ToString() + "] type (" + type.FullName + ") does not match variable [" + VariableIdentification.ToString() + "] type (" + target.Type.FullName + ")");
                                }
                            }
                        }
                        else
                        {
                            Root.AddError("Cannot determine variable type");
                        }
                    }
                }
                else
                {
                    Root.AddError("Cannot determine expression type (3) for " + Expression.ToString());
                }
            }
        }

        /// <summary>
        /// Provides the changes performed by this statement
        /// </summary>
        /// <param name="context">The context used to evaluate the changes</param>
        /// <param name="retVal">the list to fill with changes</param>
        /// <param name="explanation">The explanation structure</param>
        public override void GetChanges(Interpreter.InterpretationContext context, List<Rules.Change> retVal, ExplanationPart explanation)
        {
            Variables.IVariable var = VariableIdentification.GetVariable(context);
            if (var != null)
            {
                Values.IValue value = Expression.GetValue(context);
                if (value != null)
                {
                    value = value.RightSide(var, true);
                }
                Rules.Change change = new Rules.Change(var, var.Value, value);
                change.Apply();
                retVal.Add(change);
                explanation.SubExplanations.Add(new ExplanationPart(change));
            }
            else
            {
                AddError("Cannot find variable " + VariableIdentification.ToString());
            }
        }

        public override string ToString()
        {
            return VariableIdentification.ToString() + " <- " + Expression.ToString();
        }
    }
}
