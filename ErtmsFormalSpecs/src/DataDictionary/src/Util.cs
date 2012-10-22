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
using System.Collections.Generic;

using XmlBooster;

namespace DataDictionary
{
    public class Util
    {
        /// <summary>
        /// The Logger
        /// </summary>
        protected static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// Updates the dictionary contents
        /// </summary>
        private class Updater : Generated.Visitor
        {
            public override void visit(Generated.RuleCondition obj, bool visitSubNodes)
            {
                DataDictionary.Rules.RuleCondition ruleCondition = (DataDictionary.Rules.RuleCondition)obj;

                Constants.State enclosingState = Utils.EnclosingFinder<Constants.State>.find(ruleCondition);
                if (enclosingState != null)
                {
                    List<Rules.PreCondition> toBeRemoved = new List<Rules.PreCondition>();

                    foreach (Rules.PreCondition preCondition in ruleCondition.PreConditions)
                    {
                        Interpreter.BinaryExpression expression = preCondition.ExpressionTree as Interpreter.BinaryExpression;

                        if (expression != null && expression.Operation == Interpreter.BinaryExpression.OPERATOR.IN)
                        {
                            Interpreter.InterpretationContext context = new Interpreter.InterpretationContext(preCondition);
                            Variables.IVariable target = expression.Left.GetVariable(context);
                            if (target != null && "CurrentState".CompareTo(target.Name) == 0)
                            {
                                Constants.State state = expression.Right.GetValue(context) as Constants.State;
                                if (state != null && state == enclosingState)
                                {
                                    toBeRemoved.Add(preCondition);
                                }
                            }
                        }
                    }

                    foreach (Rules.PreCondition preCondition in toBeRemoved)
                    {
                        ruleCondition.PreConditions.Remove(preCondition);
                    }
                }

                base.visit(obj, visitSubNodes);
            }

            public override void visit(Generated.StateMachine obj, bool visitSubNodes)
            {
                Types.StateMachine stateMachine = (Types.StateMachine)obj;

                // Ensure that rules are located in their corresponding state to speed up state machine evaluation
                Constants.State targetState = null;
                Rules.PreCondition initialPreCondition = null;
                Rules.Rule ruleToMove = null;
                Rules.RuleCondition ruleCondition = null;

                Variables.IProcedure procedure = stateMachine.EnclosingProcedure;
                if (procedure == null)
                {
                    procedure = stateMachine.EnclosingStructureProcedure;
                }

                foreach (Rules.Rule rule in stateMachine.Rules)
                {
                    ruleToMove = rule;
                    if (rule.RuleConditions.Count == 1)
                    {
                        ruleCondition = (Rules.RuleCondition)rule.RuleConditions[0];
                        Interpreter.InterpretationContext context = new Interpreter.InterpretationContext(stateMachine);
                        foreach (Rules.PreCondition precondition in ruleCondition.PreConditions)
                        {
                            initialPreCondition = precondition;
                            Interpreter.BinaryExpression expression = precondition.ExpressionTree as Interpreter.BinaryExpression;
                            if (expression != null)
                            {
                                if (expression.Operation == Interpreter.BinaryExpression.OPERATOR.IN
                                    && expression.Left.GetTypedElement(context) == procedure.CurrentState)
                                {
                                    targetState = expression.Right.GetValue(context) as Constants.State;
                                    if (targetState != null)
                                    {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (targetState != null)
                    {
                        break;
                    }
                }

                // Move the rule within the target state
                if (targetState != null)
                {
                    stateMachine.removeRules(ruleToMove);
                    targetState.StateMachine.appendRules(ruleToMove);
                    ruleCondition.removePreConditions(initialPreCondition);
                }


                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Loads a dictionary according to the corresponding specifications
        /// </summary>
        /// <param name="filePath">The path of the file which holds the dictionary data</param>
        /// <param name="efsSystem">The system for which this dictionary is loaded</param>
        /// <returns></returns>
        public static Dictionary load(String filePath, EFSSystem efsSystem)
        {
            Dictionary retVal = null;

            DataDictionary.Generated.acceptor.setFactory(new DataDictionary.ObjectFactory());
            XmlBFileContext ctxt = new XmlBFileContext();
            ctxt.readFile(filePath);
            try
            {
                retVal = (Dictionary)Generated.acceptor.accept(ctxt);
                retVal.FilePath = filePath;
                efsSystem.AddDictionary(retVal);

                Updater updater = new Updater();
                updater.visit(retVal);
                retVal.Specifications.ManageTypeSpecs();
            }
            catch (XmlBooster.XmlBException excp)
            {
                Log.Error(ctxt.errorMessage());
            }

            return retVal;
        }

        /// <summary>
        /// Loads a specification
        /// </summary>
        /// <param name="fileName">The name of the file which holds the dictionary data</param>
        /// <param name="dictionary">The dictionary for which the specification is loaded</param>
        /// <returns></returns>
        public static Specification.Specification loadSpecification(String fileName, Dictionary dictionary)
        {
            Specification.Specification retVal = null;

            DataDictionary.Generated.acceptor.setFactory(new DataDictionary.ObjectFactory());
            XmlBFileContext ctxt = new XmlBFileContext();
            ctxt.readFile(fileName);
            try
            {
                retVal = (Specification.Specification)Generated.acceptor.accept(ctxt);
                dictionary.Specifications = retVal;
                retVal.setFather(dictionary);

                Updater updater = new Updater();
                updater.visit(retVal);
            }
            catch (XmlBooster.XmlBException excp)
            {
                Log.Error(ctxt.errorMessage());
            }

            return retVal;
        }

        public static Tests.Translations.TranslationDictionary loadTranslationDictionary(string fileName, DataDictionary.Dictionary dictionary)
        {
            Tests.Translations.TranslationDictionary retVal = null;

            XmlBFileContext ctxt = new XmlBFileContext();
            ctxt.readFile(fileName);
            try
            {
                retVal = Generated.acceptor.accept(ctxt) as Tests.Translations.TranslationDictionary;
                if (retVal != null)
                {
                    retVal.setFather(dictionary);
                }
            }
            catch (XmlBooster.XmlBException excp)
            {
                Log.Error(ctxt.errorMessage());
            }

            return retVal;
        }
    }
}
