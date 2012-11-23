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
    public class ReplaceStatement : Statement
    {
        /// <summary>
        /// The value to replace 
        /// </summary>
        public Expression Value { get; private set; }

        /// <summary>
        /// The list on which the value should be inserted
        /// </summary>
        public Expression ListExpression { get; private set; }

        /// <summary>
        /// The condition which indicates which element should be replaced
        /// </summary>
        public Expression Condition { get; private set; }

        /// <summary>
        /// The iterator variable
        /// </summary>
        public Variables.Variable IteratorVariable { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        /// <param name="value">The value to insert in the list</param>
        /// <param name="listExpression">The list affected by the replace statement</param>
        /// <param name="condition">The condition which indicates the value to be replaced</param>
        public ReplaceStatement(ModelElement root, Expression value, Expression listExpression, Expression condition)
            : base(root)
        {
            Value = value;
            Value.Enclosing = this;

            ListExpression = listExpression;
            ListExpression.Enclosing = this;

            Condition = condition;
            Condition.Enclosing = this;

            IteratorVariable = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
            IteratorVariable.Enclosing = this;
            IteratorVariable.Name = "X";
            Types.Collection collectionType = ListExpression.getExpressionType() as Types.Collection;
            if (collectionType != null)
            {
                IteratorVariable.Type = collectionType.Type;
            }
        }

        /// <summary>
        /// Performs the semantic analysis of the statement
        /// </summary>
        /// <param name="context"></param>
        public override void SemanticalAnalysis(InterpretationContext context)
        {
            base.SemanticalAnalysis(context);

            ListExpression.SemanticAnalysis(context, false);
            if (Condition != null)
            {
                context.LocalScope.PushContext();
                context.LocalScope.setVariable(IteratorVariable);
                Condition.SemanticAnalysis(context, false);
                context.LocalScope.PopContext();
            }
        }

        /// <summary>
        /// Indicates whether this statement reads the element
        /// </summary>
        /// <param name="element"></param>
        /// <returns></returns>
        public override bool Reads(Types.ITypedElement element)
        {
            List<Types.ITypedElement> elements = new List<Types.ITypedElement>();
            ReadElements(elements);

            return elements.Contains(element);
        }


        /// <summary>
        /// Provides the list of elements read by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void ReadElements(List<Types.ITypedElement> retVal)
        {
            InterpretationContext context = new InterpretationContext(Root);

            Value.Elements(context, retVal);

            Types.ITypedElement elem = ListExpression.GetTypedElement(context);
            retVal.Add(elem);
        }

        /// <summary>
        /// Provides the statement which modifies the element
        /// </summary>
        /// <param name="element"></param>
        /// <returns>null if no statement modifies the element</returns>
        public override VariableUpdateStatement Modifies(Types.ITypedElement element)
        {
            VariableUpdateStatement retVal = null;

            return retVal;
        }

        /// <summary>
        /// Provides the list of update statements induced by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void UpdateStatements(List<VariableUpdateStatement> retVal)
        {
        }

        /// <summary>
        /// Indicates whether the condition is satisfied with the value provided
        /// Hyp : the value of the iterator variable has been assigned before
        /// </summary>
        /// <returns></returns>
        public bool conditionSatisfied(InterpretationContext context)
        {
            bool retVal = true;

            if (Condition != null)
            {
                InterpretationContext ctxt = new InterpretationContext(context, true);
                Values.BoolValue b = Condition.GetValue(ctxt) as Values.BoolValue;
                if (b == null)
                {
                    retVal = false;
                }
                else
                {
                    retVal = b.Val;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Checks the statement for semantical errors
        /// </summary>
        public override void CheckStatement()
        {
            InterpretationContext context = new InterpretationContext(Root);

            Value.checkExpression(context);

            Types.ITypedElement targetList = ListExpression.GetTypedElement(context);
            if (targetList != null)
            {
                Types.Collection targetListType = targetList.Type as Types.Collection;
                if (targetListType != null)
                {
                    Types.Type elementType = Value.getExpressionType(context);
                    if (elementType != targetListType.Type)
                    {
                        Root.AddError("Inserted element type does not corresponds to list type");
                    }
                }
                else
                {
                    Root.AddError("Target is not a collection");
                }

                context.LocalScope.setVariable(IteratorVariable);
                Condition.checkExpression(context);
                Types.BoolType conditionType = Condition.getExpressionType(context) as Types.BoolType;
                if (conditionType == null)
                {
                    Root.AddError("Condition does not evaluates to boolean");
                }

            }
            else
            {
                Root.AddError("Cannot find target list");
            }
        }

        /// <summary>
        /// Provides the changes performed by this statement
        /// </summary>
        /// <param name="instance">The instance on which the expression should be evaluated</param>
        /// <param name="retVal">the list to fill with changes</param>
        public override void GetChanges(InterpretationContext context, List<Rules.Change> retVal, ExplanationPart explanation)
        {
            Variables.IVariable variable = ListExpression.GetVariable(context);
            if (variable != null)
            {
                Values.ListValue listValue = variable.Value as Values.ListValue;
                if (listValue != null)
                {
                    Values.ListValue newListValue = new Values.ListValue(listValue);

                    int i = 0;
                    foreach (Values.IValue current in newListValue.Val)
                    {
                        IteratorVariable.Value = current;
                        if (conditionSatisfied(context))
                        {
                            break;
                        }
                        i += 1;
                    }

                    if (i < newListValue.Val.Count)
                    {
                        Values.IValue value = Value.GetValue(context);
                        if (value != null)
                        {
                            newListValue.Val[i] = value;
                            Rules.Change change = new Rules.Change(variable, variable.Value, newListValue);
                            retVal.Add(change);
                            explanation.SubExplanations.Add(new ExplanationPart(change));
                        }
                        else
                        {
                            Root.AddError("Cannot find value for " + Value.ToString());
                        }
                    }
                    else
                    {
                        Root.AddError("Cannot find value in " + ListExpression.ToString() + " which satisfies " + Condition.ToString());
                    }
                }
                else
                {
                    Root.AddError("Variable " + ListExpression.ToString() + " does not contain a list value");
                }
            }
            else
            {
                Root.AddError("Cannot find variable for " + ListExpression.ToString());
            }
        }

        public override string ToString()
        {
            return "REPLACE " + Condition.ToString() + " IN " + ListExpression.ToString() + " BY " + Value.ToString();
        }
    }
}
