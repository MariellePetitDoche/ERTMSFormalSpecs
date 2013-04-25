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
    public class InsertStatement : Statement
    {
        /// <summary>
        /// The value to insert 
        /// </summary>
        public Expression Value { get; private set; }

        /// <summary>
        /// The list on which the value should be inserted
        /// </summary>
        public Expression ListExpression { get; private set; }

        /// <summary>
        /// The element which should belong to the list to be replaced when the list is full
        /// </summary>
        public Expression ReplaceElement { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        /// <param name="call">The corresponding function call designator</param>
        /// <param name="parameters">The expressions used to compute the parameters</param>
        public InsertStatement(ModelElement root, Expression value, Expression listExpression, Expression replaceElement)
            : base(root)
        {
            Value = value;
            Value.Enclosing = this;

            ListExpression = listExpression;
            ListExpression.Enclosing = this;

            if (replaceElement != null)
            {
                ReplaceElement = replaceElement;
                ReplaceElement.Enclosing = this;
            }
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
                Value.SemanticAnalysis(instance);
                ListExpression.SemanticAnalysis(instance, Filter.IsLeftSide);
                if (ReplaceElement != null)
                {
                    ReplaceElement.SemanticAnalysis(instance);
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
            retVal.AddRange(Value.GetVariables());
            retVal.AddRange(ListExpression.GetVariables());
        }

        /// <summary>
        /// Provides the statement which modifies the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>null if no statement modifies the element</returns>
        public override VariableUpdateStatement Modifies(Types.ITypedElement variable)
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
        /// Checks the statement for semantical errors
        /// </summary>
        public override void CheckStatement()
        {
            Value.checkExpression();

            Types.Collection targetListType = ListExpression.GetExpressionType() as Types.Collection;
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
                Root.AddError("Cannot determine collection type of " + ListExpression);
            }

            if (ReplaceElement != null)
            {
                Types.Type replaceElementType = ReplaceElement.GetExpressionType();
                if (replaceElementType != null)
                {
                    if (targetListType.Type != null)
                    {
                        if (replaceElementType != targetListType.Type)
                        {
                            Root.AddError("The replace element type (" + replaceElementType.FullName + ") does not correspond to the list type (" + targetListType.Type.FullName + ")");
                        }
                    }
                    else
                    {
                        Root.AddError("Cannot determine list element's type for " + targetListType.FullName);
                    }
                }
                else
                {
                    Root.AddError("Cannot determine replacement element type");
                }
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
                    Values.IValue value = Value.GetValue(context);
                    if (value != null)
                    {
                        Values.ListValue newListValue = new Values.ListValue(listValue);
                        int index = newListValue.Val.IndexOf(EFSSystem.EmptyValue);
                        if (index >= 0)
                        {
                            newListValue.Val[index] = value;
                        }
                        else
                        {
                            // List is full, try to remove an element before inserting the new element
                            if (ReplaceElement != null)
                            {
                                Values.IValue removeValue = ReplaceElement.GetValue(context);
                                index = newListValue.Val.IndexOf(removeValue);
                                if (index >= 0)
                                {
                                    newListValue.Val[index] = value;
                                }
                                else
                                {
                                    Root.AddError("Cannot remove replacing element " + removeValue.Name);
                                }
                            }
                            else
                            {
                                Root.AddError("Cannot add new element in list value : list is full");
                            }
                        }

                        Rules.Change change = new Rules.Change(variable, variable.Value, newListValue);
                        retVal.Add(change);
                        explanation.SubExplanations.Add(new ExplanationPart(Root, change));
                    }
                    else
                    {
                        Root.AddError("Cannot find value for " + Value.ToString());
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
            return "INSERT " + Value.ToString() + " IN " + ListExpression.ToString();
        }
    }
}
