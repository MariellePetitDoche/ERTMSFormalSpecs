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
using System.Collections;
using DataDictionary;
using MigraDoc.DocumentObjectModel;
using MigraDoc.DocumentObjectModel.Tables;

namespace Report.Model
{
    public class ModelReport : ReportTools
    {
        private static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="document"></param>
        public ModelReport(Document document)
            : base(document)
        {
        }

        /// <summary>
        /// Counts the number of req related in a list which implementation is partially completed
        /// </summary>
        /// <param name="list"></param>
        /// <returns></returns>
        private int countDisplayedReqRelated(ArrayList list)
        {
            int retVal = 0;

            foreach (ReqRelated reqRelated in list)
            {
                if (reqRelated.ImplementationPartiallyCompleted)
                {
                    retVal += 1;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Creates a section for all the (implemented) ranges of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add details or simply enumerate the ranges</param>
        /// <returns></returns>
        public void CreateRangesSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails)
        {
            if (countDisplayedReqRelated(aNameSpace.Ranges) > 0)
            {
                AddSubParagraph("Ranges");
                foreach (DataDictionary.Types.Range range in aNameSpace.Ranges)
                {
                    if (range.ImplementationPartiallyCompleted)
                    {
                        if (addDetails)
                        {
                            AddSubParagraph(range.Name);
                            AddTable(new string[] { "Range " + range.Name }, new int[] { 30, 40, 70 });
                            if (range.Comment != "")
                            {
                                AddRow(range.Comment);
                            }
                            AddRow("Values", range.MinValue + ".." + range.MaxValue);
                            AddRow("Defaul value", range.Default);
                            AddRow("Precision", range.getPrecision_AsString());

                            if (range.SpecialValues.Count > 0)
                            {
                                AddRow("Special values", "Name", "Value");
                                Row firstRow = lastRow;
                                firstRow.Shading.Color = Colors.LightBlue;

                                foreach (DataDictionary.Constants.EnumValue value in range.SpecialValues)
                                {
                                    AddRow("", value.getValue().ToString(), value.Name);
                                    firstRow.Cells[0].MergeDown += 1;
                                }
                            }
                            CreateStatusTable(range);

                            CloseSubParagraph();
                        }
                        else
                        {
                            AddParagraph(range.Name + " (" + GetRequirementsAsString(range.Requirements) + ")");
                        }
                    }
                }
                CloseSubParagraph();
            }
        }

        /// <summary>
        /// Creates a section for all the (implemented) enums and sub-enums of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add details or simply enumerate the enums</param>
        /// <returns></returns>
        public void CreateEnumerationsSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails)
        {
            if (countDisplayedReqRelated(aNameSpace.Enumerations) > 0)
            {
                AddSubParagraph("Enumerations");
                foreach (DataDictionary.Types.Enum anEnum in aNameSpace.Enumerations)
                {
                    if (anEnum.ImplementationPartiallyCompleted == true)
                    {
                        AddEnumerationSection(anEnum, addDetails);
                    }
                }
                CloseSubParagraph();
            }
        }

        /// <summary>
        /// Creates a section for an (implemented) enum (or sub-enum of an enum)
        /// </summary>
        /// <param name="section">Section to which the new section will be added</param>
        /// <param name="anEnum">The enum to add</param>
        /// <param name="addDetails">Add details or simply enumerate the enums</param>
        private void AddEnumerationSection(DataDictionary.Types.Enum anEnum, bool addDetails)
        {
            if (addDetails)
            {
                AddSubParagraph(anEnum.Name);

                AddTable(new string[] { "Enumeration " + anEnum.Name }, new int[] { 40, 20, 80 });
                if (anEnum.Comment != "")
                {
                    AddRow(anEnum.Comment);
                }
                AddTableHeader("Name", "Value", "Comment");
                if (anEnum.Values.Count > 0)
                {
                    foreach (DataDictionary.Constants.EnumValue value in anEnum.Values)
                    {
                        if (value.getName().Equals(anEnum.Default))
                        {
                            AddRow(value.Name, value.getValue().ToString(), "Default value");
                        }
                        else
                        {
                            AddRow(value.Name, value.getValue().ToString(), "");
                        }
                    }
                }

                CreateStatusTable(anEnum);

                foreach (DataDictionary.Types.Enum subEnum in anEnum.SubEnums)
                {
                    if (subEnum.ImplementationPartiallyCompleted == true)
                    {
                        AddEnumerationSection(subEnum, addDetails);
                    }
                }
                CloseSubParagraph();
            }
            else
            {
                AddParagraph(anEnum.Name + " (" + GetRequirementsAsString(anEnum.Requirements) + ")");
            }
        }


        /// <summary>
        /// Creates a section for all the (implemented) structures of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add details or simply enumerate the structures</param>
        /// <returns></returns>
        public void CreateStructuresSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails)
        {
            if (countDisplayedReqRelated(aNameSpace.Structures) > 0)
            {
                AddSubParagraph("Structures");
                foreach (DataDictionary.Types.Structure structure in aNameSpace.Structures)
                {
                    if (structure.ImplementationPartiallyCompleted == true)
                    {
                        if (addDetails)
                        {
                            AddSubParagraph(structure.Name);
                            if (structure.Comment != "")
                            {
                                AddParagraph(structure.Comment);
                            }

                            AddTable(new string[] { "Structure " + structure.Name }, new int[] { 30, 20, 40, 50 });
                            AddTableHeader("Sub element name", "Mode", "Type", "Comment");
                            foreach (DataDictionary.Types.StructureElement element in structure.Elements)
                            {
                                AddRow(element.Name, element.getMode_AsString(), element.TypeName, element.Comment);
                            }

                            if (countDisplayedReqRelated(structure.Rules) > 0)
                            {
                                AddTableHeader("Rules");
                                foreach (DataDictionary.Rules.Rule rule in structure.Rules)
                                {
                                    AddRuleRow(rule, addDetails);
                                }
                            }

                            if (countDisplayedReqRelated(structure.Procedures) > 0)
                            {
                                AddSubParagraph("Procedures");
                                foreach (DataDictionary.Types.StructureProcedure procedure in structure.Procedures)
                                {
                                    if (procedure.ImplementationPartiallyCompleted == true)
                                    {
                                        AddSubParagraph(procedure.Name);
                                        CreateParameters("Procedure " + procedure.Name, procedure.Comment, procedure.FormalParameters, null);

                                        if (procedure.Rules.Count > 0)
                                        {
                                            AddTableHeader("Behaviour");
                                            foreach (DataDictionary.Rules.Rule rule in procedure.Rules)
                                            {
                                                AddRuleRow(rule, true);
                                            }
                                        }

                                        if (procedure.StateMachine != null && procedure.StateMachine.States.Count > 0)
                                        {
                                            if (procedure.StateMachine.ImplementationPartiallyCompleted)
                                            {
                                                AddSubParagraph("State machines of " + procedure.Name);
                                                AddStateMachineSection(procedure.StateMachine);
                                                CloseSubParagraph();
                                            }
                                        }
                                        CreateStatusTable(procedure);
                                        CloseSubParagraph();
                                    }
                                }
                                CloseSubParagraph();
                            }

                            CreateStatusTable(structure);
                            CloseSubParagraph();
                        }
                        else
                        {
                            AddParagraph(structure.Name + " (" + GetRequirementsAsString(structure.Requirements) + ")");
                        }
                    }
                }
                CloseSubParagraph();
            }
        }

        /// <summary>
        /// Creates a section for all the (implemented) collections of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add details or simply enumerate the collections</param>
        /// <returns></returns>
        public void CreateCollectionsSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails)
        {
            if (countDisplayedReqRelated(aNameSpace.Collections) > 0)
            {
                AddSubParagraph("Collections");
                foreach (DataDictionary.Types.Collection collection in aNameSpace.Collections)
                {
                    if (collection.ImplementationPartiallyCompleted == true)
                    {
                        if (addDetails)
                        {
                            AddSubParagraph(collection.Name);
                            AddTable(new string[] { "Collection " + collection.Name }, new int[] { 40, 100 });
                            if (collection.Comment != "")
                            {
                                AddRow(collection.Comment);
                            }
                            AddRow("Type", collection.getTypeName());
                            AddRow("Default value", collection.Default);
                            AddRow("Max size", collection.getMaxSize().ToString());
                            CreateStatusTable(collection);
                            CloseSubParagraph();
                        }
                        else
                        {
                            AddParagraph(collection.Name + " (" + GetRequirementsAsString(collection.Requirements) + ")");
                        }
                    }
                }
                CloseSubParagraph();
            }
        }

        /// <summary>
        /// Creates a section for all the (implemented) functions of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add details or simply enumerate the collections</param>
        /// <returns></returns>
        public void CreateFunctionsSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails)
        {
            if (countDisplayedReqRelated(aNameSpace.Functions) > 0)
            {
                AddSubParagraph("Functions");
                foreach (DataDictionary.Functions.Function function in aNameSpace.Functions)
                {
                    if (function.ImplementationPartiallyCompleted == true)
                    {
                        if (addDetails)
                        {
                            AddSubParagraph(function.Name);
                            CreateParameters("Function " + function.Name, function.Comment, function.FormalParameters, function.TypeName);

                            if (function.Cases.Count > 0)
                            {
                                AddTable(new string[] { "Behaviour" }, new int[] { 70, 70 });
                                AddTableHeader("Condition", "Value");
                                foreach (DataDictionary.Functions.Case cas in function.Cases)
                                {
                                    Row firstRow = null;
                                    foreach (DataDictionary.Rules.PreCondition preCondition in cas.PreConditions)
                                    {
                                        if (firstRow == null)
                                        {
                                            AddRow(preCondition.Condition, cas.Expression.ToString());
                                            firstRow = lastRow;
                                        }
                                        else
                                        {
                                            AddRow(preCondition.Condition);
                                            firstRow.Cells[1].MergeDown += 1;
                                        }
                                    }

                                    if (firstRow == null)
                                    {
                                        AddRow("", cas.Expression.ToString());
                                    }
                                }
                            }
                            CreateStatusTable(function);
                            CloseSubParagraph();
                        }
                        else
                        {
                            AddParagraph(function.Name + " (" + GetRequirementsAsString(function.Requirements) + ")");
                        }
                    }
                }
                CloseSubParagraph();
            }
        }

        /// <summary>
        /// Creates a section for all the (implemented) procedures of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add de tails or simply enumerate the procedures</param>
        /// <returns></returns>
        public void CreateProceduresSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails)
        {
            if (countDisplayedReqRelated(aNameSpace.Procedures) > 0)
            {
                AddSubParagraph("Procedures");

                foreach (DataDictionary.Variables.Procedure procedure in aNameSpace.Procedures)
                {
                    if (procedure.ImplementationPartiallyCompleted == true)
                    {
                        if (addDetails)
                        {
                            AddSubParagraph(procedure.Name);
                            CreateParameters("Procedure " + procedure.Name, procedure.Comment, procedure.FormalParameters, null);
                            if (procedure.Rules.Count > 0)
                            {
                                AddTableHeader("Behaviour");
                                foreach (DataDictionary.Rules.Rule rule in procedure.Rules)
                                {
                                    AddRuleRow(rule, true);
                                }
                            }

                            if (procedure.StateMachine != null && procedure.StateMachine.States.Count > 0)
                            {
                                if (procedure.StateMachine.ImplementationPartiallyCompleted)
                                {
                                    AddSubParagraph("State machines of " + procedure.Name);
                                    AddStateMachineSection(procedure.StateMachine);
                                    CloseSubParagraph();
                                }
                            }
                            CreateStatusTable(procedure);
                            CloseSubParagraph();
                        }
                        else
                        {
                            AddParagraph(procedure.Name + " (" + GetRequirementsAsString(procedure.Requirements) + ")");
                        }
                    }
                }
                CloseSubParagraph();
            }
        }


        /// <summary>
        /// Creates a section for an (implemented) state machine
        /// </summary>
        /// <param name="section">Section to which the new section will be added</param>
        /// <param name="aSM">The state machine</param>
        private void AddStateMachineSection(DataDictionary.Types.StateMachine aSM)
        {
            AddSubParagraph(aSM.FullName);

            AddTable(new string[] { "State machine " + aSM.FullName }, new int[] { 30, 30, 80 });
            AddRow(aSM.Comment);
            if (aSM.States.Count > 0)
            {
                AddRow("States", "Name", "Comment");
                Row firstRow = lastRow;
                firstRow.Shading.Color = Colors.LightBlue;

                foreach (DataDictionary.Constants.State state in aSM.States)
                {
                    string comment = "";
                    if (aSM.InitialState.Equals(state.Name))
                    {
                        comment = "Initial state";
                    }
                    AddRow("", state.Name, comment);
                    firstRow.Cells[0].MergeDown += 1;
                }
            }

            if (countDisplayedReqRelated(aSM.Rules) > 0)
            {
                AddTableHeader("Rules");
                foreach (DataDictionary.Rules.Rule rule in aSM.Rules)
                {
                    if (rule.ImplementationPartiallyCompleted == true)
                    {
                        AddRuleRow(rule, true);
                    }
                }
            }
            CreateStatusTable(aSM);
            CloseSubParagraph();

            foreach (DataDictionary.Constants.State state in aSM.States)
            {
                if (state.StateMachine != null)
                {
                    if (state.StateMachine.ImplementationPartiallyCompleted)
                    {
                        AddStateMachineSection(state.StateMachine);
                    }
                }
            }
        }

        /// <summary>
        /// Creates a section for all the (implemented) variables of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add details or simply enumerate the variables</param>
        /// <returns></returns>
        public void CreateVariablesSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails, bool inOutFilter)
        {

            if (countDisplayedReqRelated(aNameSpace.Variables) > 0)
            {
                AddSubParagraph("Variables");
                foreach (DataDictionary.Variables.Variable variable in aNameSpace.Variables)
                {
                    if (variable.ImplementationPartiallyCompleted == true)
                    {
                        if (!inOutFilter || (variable.Mode == DataDictionary.Generated.acceptor.VariableModeEnumType.aIncoming ||
                                             variable.Mode == DataDictionary.Generated.acceptor.VariableModeEnumType.aOutgoing ||
                                             variable.Mode == DataDictionary.Generated.acceptor.VariableModeEnumType.aInOut))
                        {
                            if (addDetails)
                            {
                                AddSubParagraph(variable.Name);
                                AddTable(new string[] { "Variable " + variable.Name }, new int[] { 40, 100 });
                                AddRow(variable.Comment);
                                AddRow("Type", variable.getTypeName());
                                AddRow("Default value", variable.Default);
                                AddRow("Mode", variable.getVariableMode_AsString());
                                CreateStatusTable(variable);
                                CloseSubParagraph();
                            }
                            else
                            {
                                AddParagraph(variable.Name + " (" + GetRequirementsAsString(variable.Requirements) + ")");
                            }
                        }
                    }
                }
                CloseSubParagraph();
            }
        }


        /// <summary>
        /// Creates a section for all the (implemented) rules of the given namespace
        /// </summary>
        /// <param name="aNameSpace">The namespace</param>
        /// <param name="addDetails">Add details or simply enumerate the rules</param>
        /// <returns></returns>
        public void CreateRulesSection(DataDictionary.Types.NameSpace aNameSpace, bool addDetails)
        {
            if (countDisplayedReqRelated(aNameSpace.Rules) > 0)
            {
                AddSubParagraph("Rules");
                foreach (DataDictionary.Rules.Rule rule in aNameSpace.Rules)
                {
                    if (rule.ImplementationPartiallyCompleted == true)
                    {
                        AddRuleSection(rule, addDetails);
                    }
                }
                CloseSubParagraph();
            }
        }

        /// <summary>
        /// Creates a section for an (implemented) rule (or sub-rule of a rule)
        /// </summary>
        /// <param name="section">Section to which the new section will be added</param>
        /// <param name="anEnum">The rule to add</param>
        /// <param name="addDetails">Add details or simply enumerate the enums</param>
        private void AddRuleSection(DataDictionary.Rules.Rule aRule, bool addDetails)
        {
            if (addDetails)
            {
                AddSubParagraph(aRule.Name);
                AddRuleRow(aRule, addDetails);
                CloseSubParagraph();
            }
            else
            {
                AddParagraph(aRule.Name + " (" + GetRequirementsAsString(aRule.Requirements) + ")");
            }

            foreach (DataDictionary.Rules.RuleCondition ruleCondition in aRule.RuleConditions)
            {
                foreach (DataDictionary.Rules.Rule subRule in ruleCondition.SubRules)
                {
                    if (subRule.ImplementationPartiallyCompleted == true)
                    {
                        AddRuleSection(subRule, addDetails);
                    }
                }
            }
        }

        /// <summary>
        /// Creates a section for an (implemented) rule (or sub-rule of a rule)
        /// </summary>
        /// <param name="section">Section to which the new section will be added</param>
        /// <param name="anEnum">The rule to add</param>
        /// <param name="addDetails">Add details or simply enumerate the enums</param>
        private void AddRuleRow(DataDictionary.Rules.Rule aRule, bool addDetails)
        {
            if (addDetails)
            {
                AddTableHeader("Rule " + aRule.Name);
                AddRow(aRule.Comment);
                AddRow("Activation priority", aRule.getPriority_AsString());
                AddRow(Utils.RTFConvertor.RTFToPlainText(aRule.getExplain(false)));
            }
            else
            {
                AddRow(aRule.Name + " (" + GetRequirementsAsString(aRule.Requirements) + ")");
            }

            foreach (DataDictionary.Rules.RuleCondition ruleCondition in aRule.RuleConditions)
            {
                foreach (DataDictionary.Rules.Rule subRule in ruleCondition.SubRules)
                {
                    AddRuleRow(subRule, addDetails);
                }
            }
        }


        /// <summary>
        /// Provides a string enumerating all the requirements of the given list of requirements
        /// </summary>
        /// <param name="requirements">List of requirements</param>
        /// <returns></returns>
        private static string GetRequirementsAsString(ArrayList requirements)
        {
            string retVal = "";
            if (requirements.Count > 0)
            {
                bool first = true;
                foreach (DataDictionary.ReqRef reqRef in requirements)
                {
                    if (first)
                    {
                        retVal += reqRef.Name;
                    }
                    else
                    {
                        retVal += ", " + reqRef.Name;
                    }
                    first = false;
                }
            }
            else
            {
                retVal += "No requirements related to this element";
            }
            return retVal;
        }


        /// <summary>
        /// Provides a list enumerating all the parameters of the given list of parameters
        /// </summary>
        /// <param name="parameters">The list of parameters</param>
        /// <returns></returns>
        private void CreateParameters(string name, string comment, ArrayList parameters, string returnValue)
        {
            AddTable(new string[] { name }, new int[] { 40, 80 });
            if (comment != "")
            {
                AddRow(comment);
            }
            if (parameters.Count > 0)
            {
                AddTableHeader("Parameters");
                AddTableHeader("Name", "Type");
                foreach (DataDictionary.Parameter parameter in parameters)
                {
                    AddRow(parameter.Name, parameter.getTypeName());
                }
            }
            if (returnValue != null)
            {
                AddTableHeader("Return value");
                AddRow(returnValue);
            }
        }

        /// <summary>
        /// Creates a containing the implementation/verification status and the
        /// requirements of a ReqRelated element
        /// </summary>
        /// <param name="aReqRelated">The ReqRelated element</param>
        /// <returns></returns>
        private void CreateStatusTable(ReqRelated aReqRelated)
        {
            AddTable(new string[] { "Modeling information" }, new int[] { 40, 30, 70 });

            string implemented = "not implemented";
            string verified = "not verified";
            if (aReqRelated.getImplemented())
            {
                implemented = "implemented";
            }
            if (aReqRelated.getVerified())
            {
                verified = "verified";
            }

            AddRow("Status", implemented, verified);
            AddRow("Requirements", GetRequirementsAsString(aReqRelated.Requirements));
        }
    }
}
