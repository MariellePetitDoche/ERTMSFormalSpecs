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
        }

        /// <summary>
        /// Performs the semantic analysis of the statement
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(Utils.INamable instance)
        {
            bool retVal = base.SemanticAnalysis(instance);

            if (retVal)
            {
                ListExpression.SemanticAnalysis(instance);
                Types.Collection collectionType = ListExpression.GetExpressionType() as Types.Collection;
                if (collectionType != null)
                {
                    IteratorVariable.Type = collectionType.Type;
                }

                if (Condition != null)
                {
                    Condition.SemanticAnalysis(instance);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the list of elements read by this statement
        /// </summary>
        /// <param name="retVal">the list to fill</param>
        public override void ReadElements(List<Variables.IVariable> retVal)
        {
            retVal.AddRange(Value.GetVariables());
            retVal.AddRange(ListExpression.GetVariables());
        }

        /// <summary>
        /// Provides the statement which modifies the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>null if no statement modifies the element</returns>
        public override VariableUpdateStatement Modifies(Variables.IVariable variable)
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
                Values.BoolValue b = Condition.GetValue(context) as Values.BoolValue;
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

            Value.checkExpression();

            Values.IValue targetList = ListExpression.GetValue(context);
            if (targetList != null)
            {
                Types.Collection targetListType = targetList.Type as Types.Collection;
                if (targetListType != null)
                {
                    Types.Type elementType = Value.GetExpressionType();
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
                Condition.checkExpression();
                Types.BoolType conditionType = Condition.GetExpressionType() as Types.BoolType;
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

        public override string ToString()
        {
            return "REPLACE " + Condition.ToString() + " IN " + ListExpression.ToString() + " BY " + Value.ToString();
        }
    }
}
