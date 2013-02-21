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
using System;

namespace DataDictionary.Rules
{
    public class PreCondition : Generated.PreCondition, Utils.IPreCondition, TextualExplain
    {
        /// <summary>
        /// The precondition expression
        /// </summary>
        public string Expression
        {
            get
            {
                return Condition;
            }
            set
            {
                Condition = value;
            }
        }

        /// <summary>
        /// The precondition display name
        /// </summary>
        public override string Name
        {
            get { return Expression; }
            set { }
        }

        /// <summary>
        /// The precondition condition
        /// </summary>
        public string Condition
        {
            get { return getCondition(); }
            set
            {
                setCondition(value);
                expressionTree = null;
            }
        }

        /// <summary>
        /// Provides the expression tree associated to this action's expression
        /// </summary>
        private Interpreter.Expression expressionTree;
        public Interpreter.Expression ExpressionTree
        {
            get
            {
                try
                {
                    if (expressionTree == null)
                    {
                        Interpreter.Parser parser = new Interpreter.Parser(EFSSystem);
                        expressionTree = parser.Expression(this, Expression);
                    }
                }
                catch (Exception e)
                {
                    AddException(e);
                }

                return expressionTree;
            }
            set
            {
                Expression = ExpressionTree.ToString();
            }
        }

        public override string ExpressionText
        {
            get
            {
                string retVal = Condition;
                if (retVal == null)
                {
                    retVal = "";
                }
                return retVal;
            }
            set { Condition = value; }
        }

        /// <summary>
        /// The enclosing rule, if any
        /// </summary>
        public Rule Rule
        {
            get { return Enclosing as Rule; }
        }

        /// <summary>
        /// The enclosing rule condition, if any
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
        /// Finds the enclosing function
        /// </summary>
        public Functions.Function EnclosingFunction
        {
            get { return Utils.EnclosingFinder<Functions.Function>.find(this); }
        }

        /// <summary>
        /// Finds the enclosing namespace
        /// </summary>
        public Types.NameSpace NameSpace
        {
            get { return EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// The enclosing translation, if any
        /// </summary>
        public Tests.Translations.Translation Translation
        {
            get { return Enclosing as Tests.Translations.Translation; }
        }

        /// <summary>
        /// The enclosing test step
        /// </summary>
        public Functions.Case Case
        {
            get { return Enclosing as Functions.Case; }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                System.Collections.ArrayList retVal = null;

                if (RuleCondition != null)
                {
                    retVal = RuleCondition.PreConditions;
                }
                else if (Case != null)
                {
                    retVal = Case.PreConditions;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Indicates whether this preCondition reads the variable
        /// </summary>
        /// <param name="variable"></param>
        /// <returns></returns>
        public bool Reads(Variables.IVariable variable)
        {
            bool retVal = false;

            if (ExpressionTree != null)
            {
                foreach (Types.ITypedElement el in ExpressionTree.GetVariables())
                {
                    if (el == variable)
                    {
                        retVal = true;
                        break;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Finds the variable checked by the precondition
        /// </summary>
        /// <returns></returns>
        public string findVariable()
        {
            string[] words = Condition.Split(' ');
            if (words.Length > 0)
            {
                return words[0];
            }
            return null;
        }

        /// <summary>
        /// Finds the operator checked by the precondition
        /// </summary>
        /// <returns></returns>
        public string findOperator()
        {
            string[] words = Condition.Split(' ');
            if (words.Length > 1)
            {
                return words[1];
            }
            return null;
        }

        /// <summary>
        /// Finds the operator checked by the precondition
        /// </summary>
        /// <returns></returns>
        public string findValue()
        {
            string[] words = Condition.Split(' ');
            if (words.Length > 2)
            {
                return words[2];
            }
            return null;
        }

        /// <summary>
        /// Explains the pre Condition
        /// </summary>
        /// <returns></returns>
        public string getExplain(int level)
        {
            string retVal = Expression.ToString();

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>

        /// <param name="explainSubElements">Precises if we need to explain the sub elements (if any)</param>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0);

            return TextualExplainUtilities.Encapsule(retVal);
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
