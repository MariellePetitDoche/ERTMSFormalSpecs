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

namespace DataDictionary.Rules
{
    public class Action : Generated.Action
    {
        public override string Name
        {
            get { return Expression; }
            set { }
        }

        public string Expression
        {
            get { return getExpression(); }
            set
            {
                setExpression(value);
                statement = null;
            }
        }

        /// <summary>
        /// Provides the expression tree associated to this action's expression
        /// </summary>
        private Interpreter.Statement.Statement statement;

        public Interpreter.Statement.Statement Statement
        {
            get
            {
                if (statement == null)
                {
                    statement = EFSSystem.ParseStatement(this, Expression);
                }
                return statement;
            }
            set
            {
                Expression = Statement.ToString();
            }
        }

        public override string ExpressionText
        {
            get
            {
                string retVal = Expression;
                if (retVal == null)
                {
                    retVal = "";
                }
                return retVal;
            }
            set { Expression = value; }
        }

        /// <summary>
        /// The enclosing Rule, if any
        /// </summary>
        public Rule Rule
        {
            get { return Enclosing as Rule; }
        }

        /// <summary>
        /// The enclosing RuleCondition, if any
        /// </summary>
        public RuleCondition RuleCondition
        {
            get { return Enclosing as RuleCondition; }
        }

        /// <summary>
        /// Finds the enclosing structure
        /// </summary>
        public Types.Structure EnclosingStructure
        {
            get { return Utils.EnclosingFinder<Types.Structure>.find(this); }
        }

        /// <summary>
        /// Finds the enclosing namespace
        /// </summary>
        public Types.NameSpace NameSpace
        {
            get { return EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// The enclosing sub-step, if any
        /// </summary>
        public Tests.SubStep SubStep
        {
            get { return Enclosing as Tests.SubStep; }
        }

        /// <summary>
        /// The enclosing step, if any
        /// </summary>
        public Tests.Step Step
        {
            get { return SubStep.Step; }
        }

        /// <summary>
        /// The enclosing translation, if any
        /// </summary>
        public Tests.Translations.Translation Translation
        {
            get { return Enclosing as Tests.Translations.Translation; }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                System.Collections.ArrayList retVal = null;

                if (RuleCondition != null)
                {
                    retVal = RuleCondition.Actions;
                }
                else if (SubStep != null)
                {
                    retVal = SubStep.Actions;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the list of update statements induced by this action
        /// </summary>
        public List<Interpreter.Statement.VariableUpdateStatement> UpdateStatements
        {
            get
            {
                List<Interpreter.Statement.VariableUpdateStatement> retVal = new List<Interpreter.Statement.VariableUpdateStatement>();

                if (Statement != null)
                {
                    Statement.UpdateStatements(retVal);
                }
                else
                {
                    AddError("Cannot parse statement");
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the statement which modifies the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns>null if no statement modifies the element</returns>
        public Interpreter.Statement.VariableUpdateStatement Modifies(Types.ITypedElement variable)
        {
            if (Statement != null)
            {
                return Statement.Modifies(variable);
            }

            return null;
        }

        /// <summary>
        /// Indicates whether this action reads the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns></returns>
        public bool Reads(Types.ITypedElement variable)
        {
            if (Statement != null)
            {
                return Statement.Reads(variable);
            }

            return false;
        }

        /// <summary>
        /// Applies this action and creates a list of changes to be applied on the system
        /// </summary>
        /// <param name="instance">The instance on which this action should be evaluated</param>
        /// <param name="retVal">The list to fill with the changes</param>
        public void GetChanges(Interpreter.InterpretationContext context, List<Change> retVal, Interpreter.ExplanationPart explanation)
        {
            long start = System.Environment.TickCount;

            if (Statement != null)
            {
                Statement.GetChanges(context, retVal, explanation);
            }
            else
            {
                AddError("Invalid actions statement");
            }

            long stop = System.Environment.TickCount;
            long span = (stop - start);

            if (RuleCondition != null && RuleCondition.EnclosingRule != null)
            {
                // Rule execution execution time (as opposed to guard evaluation)
                RuleCondition.EnclosingRule.ExecutionTimeInMilli += span;
                RuleCondition.EnclosingRule.ExecutionCount += 1;
            }
        }

        /// <summary>
        /// Explains the pre Condition
        /// </summary>
        /// <returns></returns>
        public string getExplain()
        {
            string retVal = Expression;

            return retVal;
        }

        /// <summary>
        /// Indicates the name of the updated variable, if any
        /// </summary>
        /// <returns></returns>
        public string UpdatedVariable()
        {
            string retVal = null;

            Interpreter.Statement.VariableUpdateStatement update = Statement as Interpreter.Statement.VariableUpdateStatement;
            if (update != null)
            {
                retVal = update.VariableIdentification.ToString();
            }

            return retVal;
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
        }
    }
}