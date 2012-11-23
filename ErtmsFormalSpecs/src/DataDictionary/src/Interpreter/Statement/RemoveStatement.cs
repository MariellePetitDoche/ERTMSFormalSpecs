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
    public class RemoveStatement : Statement
    {
        /// <summary>
        /// The condition which should be true on the element to be removed
        /// </summary>
        public Expression Condition { get; private set; }

        /// <summary>
        /// The list on which the value should be removed
        /// </summary>
        public Expression ListExpression { get; private set; }

        /// <summary>
        /// Indicates which element should be removed
        /// </summary>
        public enum PositionEnum { First, Last, All };

        /// <summary>
        /// The remove position
        /// </summary>
        public PositionEnum Position { get; private set; }

        /// <summary>
        /// The iterator variable
        /// </summary>
        public Variables.Variable IteratorVariable { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root element for which this element is built</param>
        /// <param name="condition">The corresponding function call designator</param>
        /// <param name="position">The position in which the element should be removed</param>
        /// <param name="listExpression">The expressions used to compute the parameters</param>
        public RemoveStatement(ModelElement root, Expression condition, PositionEnum position, Expression listExpression)
            : base(root)
        {
            Condition = condition;
            if (condition != null)
            {
                condition.Enclosing = this;
            }

            Position = position;

            ListExpression = listExpression;
            ListExpression.Enclosing = this;

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

            if (Condition != null)
            {
                Condition.Elements(context, retVal);
            }

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

            Types.ITypedElement targetList = ListExpression.GetTypedElement(context);
            if (targetList == null)
            {
                Root.AddError("Cannot find target list");
            }

            if (Condition != null)
            {
                context.LocalScope.setVariable(IteratorVariable);
                Condition.checkExpression(context);
                Types.BoolType conditionType = Condition.getExpressionType(context) as Types.BoolType;
                if (conditionType == null)
                {
                    Root.AddError("Condition does not evaluates to boolean");
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
                    Values.ListValue newListValue = new Values.ListValue(listValue.CollectionType, new List<Values.IValue>());

                    context.LocalScope.PushContext();
                    context.LocalScope.setVariable(IteratorVariable);

                    int index = 0;
                    if (Position == PositionEnum.Last)
                    {
                        index = listValue.Val.Count - 1;
                    }

                    // Remove the element while required to do so
                    while (index >= 0 && index < listValue.Val.Count)
                    {
                        Values.IValue value = listValue.Val[index];
                        index = nextIndex(index);

                        if (value == EFSSystem.EmptyValue)
                        {
                            InsertInResult(newListValue, value);
                        }
                        else
                        {
                            IteratorVariable.Value = value;
                            if (conditionSatisfied(context))
                            {
                                if (Position != PositionEnum.All)
                                {
                                    break;
                                }
                            }
                            else
                            {
                                InsertInResult(newListValue, value);
                            }
                        }
                    }

                    // Complete the list
                    while (index >= 0 && index < listValue.Val.Count)
                    {
                        Values.IValue value = listValue.Val[index];

                        InsertInResult(newListValue, value);
                        index = nextIndex(index);
                    }

                    // Fill the gap
                    while (newListValue.Val.Count < listValue.Val.Count)
                    {
                        newListValue.Val.Add(EFSSystem.EmptyValue);
                    }

                    Rules.Change change = new Rules.Change(variable, variable.Value, newListValue);
                    retVal.Add(change);
                    explanation.SubExplanations.Add(new ExplanationPart(change));

                    context.LocalScope.PopContext();
                }
            }
        }

        /// <summary>
        /// Provides the next index of a given index
        /// </summary>
        /// <param name="index"></param>
        /// <returns></returns>
        private int nextIndex(int index)
        {
            if (Position == PositionEnum.Last)
            {
                index = index - 1;
            }
            else
            {
                index = index + 1;
            }
            return index;
        }

        /// <summary>
        /// Inserts a value in the result set
        /// </summary>
        /// <param name="newListValue"></param>
        /// <param name="value"></param>
        private void InsertInResult(Values.ListValue newListValue, Values.IValue value)
        {
            if (Position == PositionEnum.Last)
            {
                newListValue.Val.Insert(0, value);
            }
            else
            {
                newListValue.Val.Add(value);
            }
        }

        public override string ToString()
        {
            string retVal = "REMOVE ";

            switch (Position)
            {
                case PositionEnum.First:
                    retVal += "FIRST ";
                    break;

                case PositionEnum.Last:
                    retVal += "LAST ";
                    break;

                case PositionEnum.All:
                    retVal += "ALL ";
                    break;
            }

            if (Condition != null)
            {
                retVal += Condition.ToString();

            }
            retVal += " IN " + ListExpression.ToString();

            return retVal;
        }
    }
}