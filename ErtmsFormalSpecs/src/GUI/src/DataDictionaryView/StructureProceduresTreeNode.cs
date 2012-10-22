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
using System.Linq;
using System.Text;
using System.ComponentModel;
using System.Windows.Forms;
using GUI.DataDictionaryView;


namespace GUI.DataDictionaryView
{
    public class StructureProceduresTreeNode : DataTreeNode<DataDictionary.Types.Structure>
    {
        private class ItemEditor : Editor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public ItemEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="item"></param>
        public StructureProceduresTreeNode(DataDictionary.Types.Structure item)
            : base("Procedures", item)
        {
            foreach (DataDictionary.Types.StructureProcedure procedure in item.Procedures)
            {
                Nodes.Add(new StructureProcedureTreeNode(procedure));
            }
            ImageIndex = 1;
            SelectedImageIndex = 1;
            SortSubNodes();
        }

        /// <summary>
        /// Creates the editor for this tree node
        /// </summary>
        /// <returns></returns>
        protected override Editor createEditor()
        {
            return new ItemEditor();
        }

        public void AddProcedureHandler(object sender, EventArgs args)
        {
            DataDictionary.Types.StructureProcedure procedure = (DataDictionary.Types.StructureProcedure)DataDictionary.Generated.acceptor.getFactory().createStructureProcedure();
            procedure.Name = "<Procedure" + (GetNodeCount(false) + 1) + ">";
            AddProcedure(procedure);
        }

        /// <summary>
        /// Adds a procedure to the model 
        /// </summary>
        /// <param name="procedure"></param>
        public void AddProcedure(DataDictionary.Types.StructureProcedure procedure)
        {
            Item.appendProcedures(procedure);
            Nodes.Add(new StructureProcedureTreeNode(procedure));
            SortSubNodes();
        }

        public void AddCustomHandler(object sender, EventArgs args)
        {
            CustomProcedure customProcedure = new CustomProcedure("Procedure", CreateCustomProcedure);
            customProcedure.ShowDialog();
        }


        /// <summary>
        /// Creates a customized DMI procedure from the given procedure config
        /// </summary>
        /// <param name="aConfig">Procedure config</param>
        public void CreateCustomProcedure(CustomProcedure.DMIProcedureConfig aConfig)
        {
            switch (aConfig.Type)
            {
                case (CustomProcedure.CustomProcedureType.DMI_In):
                    {
                        AddDMIInProcedure(aConfig);
                        break;
                    }
                case (CustomProcedure.CustomProcedureType.DMI_Out):
                    {
                        AddDMIOutProcedure(aConfig);
                        break;
                    }
                default:
                    {
                        break;
                    }
            }
        }


        /// <summary>
        /// Creates fields that are common to DMI IN and OUT procedures
        /// </summary>
        /// <param name="aProcedure">New procedure</param>
        /// <param name="aConfig">Procedure config</param>
        /// <returns></returns>
        public StructureProcedureTreeNode AddDMIProcedure(DataDictionary.Types.StructureProcedure aProcedure, CustomProcedure.DMIProcedureConfig aConfig)
        {
            aProcedure.Name = aConfig.ProcedureName;
            aProcedure.NeedsRequirement = true;

            Item.appendProcedures(aProcedure);
            StructureProcedureTreeNode retVal = new StructureProcedureTreeNode(aProcedure);
            Nodes.Add(retVal);


            /* White cells: not available */
            DataDictionary.Constants.State initialState = CreateState("NotAvailable", 230, 20, 140, 50);
            StateTreeNode notAvailableStateTreeNode = retVal.stateMachine.AddState(initialState);

            DataDictionary.Constants.State notAvailableInitialState = CreateState("InitialState", 40, 50, 100, 50);
            notAvailableStateTreeNode.StateMachine.AddState(notAvailableInitialState);

            DataDictionary.Constants.State notAvailableIdleState = CreateState("Idle", 300, 50, 100, 50);
            notAvailableStateTreeNode.StateMachine.AddState(notAvailableIdleState);

            string notAvailableInitialStateName = initialState.Name + "." + notAvailableInitialState.Name;
            string notAvailableFinalStateName = initialState.Name + "." + notAvailableIdleState.Name;
            notAvailableStateTreeNode.StateMachine.AddRule(CreateUpdateVariableRule(aConfig, notAvailableInitialStateName, notAvailableFinalStateName, "Boolean.False"));
            initialState.StateMachine.InitialState = notAvailableInitialState.Name;
            aProcedure.StateMachine.InitialState = initialState.Name;


            /* Grey cells: availability and meaning defined by national system */
            DataDictionary.Constants.State NSState = CreateState("NationalSystemAvailability", 50, 120, 140, 50);
            StateTreeNode nsStateTreeNode = retVal.stateMachine.AddState(NSState);

            DataDictionary.Constants.State nsInitialState = CreateState("InitialState", 40, 50, 100, 50);
            nsStateTreeNode.StateMachine.AddState(nsInitialState);

            DataDictionary.Constants.State nsIdleState = CreateState("Idle", 300, 50, 100, 50);
            nsStateTreeNode.StateMachine.AddState(nsIdleState);

            string nsInitialStateName = NSState.Name + "." + nsInitialState.Name;
            string nsFinalStateName = NSState.Name + "." + nsIdleState.Name;
            nsStateTreeNode.StateMachine.AddRule(CreateUpdateVariableRule(aConfig, nsInitialStateName, nsFinalStateName, "Boolean.False"));
            NSState.StateMachine.InitialState = nsInitialState.Name;


            /* Not applicable: this concerns the modes SF and IS in which the DMI inputs and ouptups cannot be determined */
            DataDictionary.Constants.State notApplicableState = CreateState("NotApplicable", 410, 120, 140, 50);
            StateTreeNode notApplicableStateTreeNode = retVal.stateMachine.AddState(notApplicableState);

            DataDictionary.Constants.State notApplicableInitialState = CreateState("InitialState", 40, 50, 100, 50);
            notApplicableStateTreeNode.StateMachine.AddState(notApplicableInitialState);

            DataDictionary.Constants.State notApplicableIdleState = CreateState("Idle", 300, 50, 100, 50);
            notApplicableStateTreeNode.StateMachine.AddState(notApplicableIdleState);

            string notApplicableInitialStateName = notApplicableState.Name + "." + notApplicableInitialState.Name;
            string notApplicableFinalStateName = notApplicableState.Name + "." + notApplicableIdleState.Name;
            notApplicableStateTreeNode.StateMachine.AddRule(CreateUpdateVariableRule(aConfig, notApplicableInitialStateName, notApplicableFinalStateName, "Boolean.False"));
            notApplicableState.StateMachine.InitialState = notApplicableInitialState.Name;

            return retVal;
        }


        /// <summary>
        /// Creates a customized DMI IN Procedure from a given procedure config
        /// </summary>
        /// <param name="aConfig">Procedure config</param>
        public void AddDMIInProcedure(CustomProcedure.DMIProcedureConfig aConfig)
        {
            DataDictionary.Types.StructureProcedure aProcedure = (DataDictionary.Types.StructureProcedure)DataDictionary.Generated.acceptor.getFactory().createStructureProcedure();
            StructureProcedureTreeNode aProcedureTreeNode = AddDMIProcedure(aProcedure, aConfig);

            /* Active: for a DMI output, this means that the output information shall be shown to the driver
             * when the ERTMS/ETCS onboard equipment is in the mode indicated in the column */
            DataDictionary.Constants.State activeState = CreateState("Active", 50, 230, 140, 50);
            StateTreeNode activeStateTreeNode = aProcedureTreeNode.stateMachine.AddState(activeState);

            DataDictionary.Constants.State activeInitialState = CreateState("InitialState", 40, 50, 100, 50);
            activeStateTreeNode.StateMachine.AddState(activeInitialState);

            DataDictionary.Constants.State activeSendState = CreateState("Send", 300, 50, 100, 50);
            activeStateTreeNode.StateMachine.AddState(activeSendState);

            string activeInitialStateName = activeState.Name + "." + activeInitialState.Name;
            string activeFinalStateName = activeState.Name + "." + activeSendState.Name;
            activeStateTreeNode.StateMachine.AddRule(CreateUpdateVariableRule(aConfig, activeInitialStateName, activeFinalStateName, "Boolean.True"));
            activeState.StateMachine.InitialState = activeInitialState.Name;


            /* Available: this means that the input/output shall become active only if another condition(s) is (are) fulfilled */
            DataDictionary.Constants.State availableState = CreateState("Available", 410, 230, 140, 50);
            StateTreeNode availableStateTreeNode = aProcedureTreeNode.stateMachine.AddState(availableState);

            DataDictionary.Constants.State availableIdleState = CreateState("Idle", 40, 50, 100, 50);
            availableStateTreeNode.StateMachine.AddState(availableIdleState);

            DataDictionary.Constants.State availableSendState = CreateState("Send", 300, 50, 100, 50);
            availableStateTreeNode.StateMachine.AddState(availableSendState);

            DataDictionary.Constants.State availableResponseState = CreateState("Response", 170, 170, 100, 50);
            availableStateTreeNode.StateMachine.AddState(availableResponseState);

            string availableInitialStateName = availableState.Name + "." + availableIdleState.Name;
            string availableFinalStateName = availableState.Name + "." + availableSendState.Name;
            availableStateTreeNode.StateMachine.AddRule(CreateRequestActivatedVariableRule(aConfig, availableInitialStateName, availableFinalStateName, aConfig.VariableRequestName, "Boolean.True", false));

            availableInitialStateName = availableState.Name + "." + availableSendState.Name;
            availableFinalStateName = availableState.Name + "." + availableResponseState.Name;
            availableStateTreeNode.StateMachine.AddRule(CreateResponseReceivedVariableRule(aConfig, availableInitialStateName, availableFinalStateName));

            availableInitialStateName = availableState.Name + "." + availableResponseState.Name;
            availableFinalStateName = availableState.Name + "." + availableIdleState.Name;
            availableStateTreeNode.StateMachine.AddRule(CreateRequestDisabledVariableRule(aConfig, availableInitialStateName, availableFinalStateName, aConfig.VariableRequestName));
            availableState.StateMachine.InitialState = availableIdleState.Name;

            SortSubNodes();
        }


        /// <summary>
        /// Creates a customized DMI OUT procedure from a given procedure config
        /// </summary>
        /// <param name="aConfig">Procedure config</param>
        public void AddDMIOutProcedure(CustomProcedure.DMIProcedureConfig aConfig)
        {
            DataDictionary.Types.StructureProcedure aProcedure = (DataDictionary.Types.StructureProcedure)DataDictionary.Generated.acceptor.getFactory().createStructureProcedure();
            StructureProcedureTreeNode aProcedureTreeNode = AddDMIProcedure(aProcedure, aConfig);

            /* Active: for a DMI output, this means that the output information shall be shown to the driver
             * when the ERTMS/ETCS onboard equipment is in the mode indicated in the column */
            DataDictionary.Constants.State activeState = CreateState("Active", 50, 230, 140, 50);
            StateTreeNode activeStateTreeNode = aProcedureTreeNode.stateMachine.AddState(activeState);

            DataDictionary.Constants.State activeInitialState = CreateState("InitialState", 40, 50, 100, 50);
            activeStateTreeNode.StateMachine.AddState(activeInitialState);

            DataDictionary.Constants.State activeSendState = CreateState("Send", 300, 50, 100, 50);
            activeStateTreeNode.StateMachine.AddState(activeSendState);

            string activeInitialStateName = activeState.Name + "." + activeInitialState.Name;
            string activeFinalStateName = activeState.Name + "." + activeSendState.Name;
            activeStateTreeNode.StateMachine.AddRule(CreateUpdateVariableRule(aConfig, activeInitialStateName, activeFinalStateName, "Boolean.True"));
            activeState.StateMachine.InitialState = activeInitialState.Name;
            activeState.StateMachine.InitialState = activeSendState.Name;


            /* Available: this means that the input/output shall become active only if another condition(s) is (are) fulfilled */
            DataDictionary.Constants.State availableState = CreateState("Available", 410, 230, 140, 50);
            StateTreeNode availableStateTreeNode = aProcedureTreeNode.stateMachine.AddState(availableState);

            DataDictionary.Constants.State availableIdleState = CreateState("Idle", 40, 50, 100, 50);
            availableStateTreeNode.StateMachine.AddState(availableIdleState);

            DataDictionary.Constants.State availableSendState = CreateState("Send", 300, 50, 100, 50);
            availableStateTreeNode.StateMachine.AddState(availableSendState);

            string availableInitialStateName = availableState.Name + "." + availableIdleState.Name;
            string availableFinalStateName = availableState.Name + "." + availableSendState.Name;
            availableStateTreeNode.StateMachine.AddRule(CreateRequestActivatedVariableRule(aConfig, availableInitialStateName, availableFinalStateName, aConfig.VariableRequestName, "Boolean.True", true));

            availableInitialStateName = availableState.Name + "." + availableSendState.Name;
            availableFinalStateName = availableState.Name + "." + availableIdleState.Name;
            availableStateTreeNode.StateMachine.AddRule(CreateRequestActivatedVariableRule(aConfig, availableInitialStateName, availableFinalStateName, aConfig.VariableRequestDisabledName, "Boolean.False", true));
            availableState.StateMachine.InitialState = availableIdleState.Name;

            SortSubNodes();
        }


        /// <summary>
        /// Creates a new state
        /// </summary>
        /// <param name="stateName">State name</param>
        /// <param name="x">X position</param>
        /// <param name="y">Y position</param>
        /// <param name="width">Width</param>
        /// <param name="height">Height</param>
        /// <returns></returns>
        private DataDictionary.Constants.State CreateState(string stateName, int x, int y, int width, int height)
        {
            DataDictionary.Constants.State retVal = (DataDictionary.Constants.State)DataDictionary.Generated.acceptor.getFactory().createState();
            retVal.Name = stateName;
            retVal.X = x;
            retVal.Y = y;
            retVal.Width = width;
            retVal.Height = height;
            return retVal;
        }


        /// <summary>
        /// Creates a rule that updates a output variable with a given value
        /// </summary>
        /// <param name="aConfig">Procedure config</param>
        /// <param name="initialStateName">Name of the initial state</param>
        /// <param name="finalStateName">Name of the final state</param>
        /// <param name="updateValue">New value for the variable</param>
        /// <returns></returns>
        private DataDictionary.Rules.Rule CreateUpdateVariableRule(CustomProcedure.DMIProcedureConfig aConfig, string initialStateName, string finalStateName, string updateValue)
        {
            DataDictionary.Rules.Rule retVal = (DataDictionary.Rules.Rule)DataDictionary.Generated.acceptor.getFactory().createRule();
            retVal.Name = "UpdateVariable";

            DataDictionary.Rules.RuleCondition condition = (DataDictionary.Rules.RuleCondition)DataDictionary.Generated.acceptor.getFactory().createRuleCondition();
            retVal.appendConditions(condition);

            DataDictionary.Rules.PreCondition aPreCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            aPreCondition.ExpressionText = "Current State in " + initialStateName;
            condition.appendPreConditions(aPreCondition);

            DataDictionary.Rules.Action transitionAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            transitionAction.ExpressionText = "CurrentState <- " + finalStateName;
            condition.appendActions(transitionAction);

            DataDictionary.Rules.Action updateAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            string variableName = "";
            if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_In)
            {
                variableName = "InputInformation." + aConfig.VariableOutName;
            }
            else if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_Out)
            {
                variableName = "OutputInformation." + aConfig.VariableOutName;
            }
            updateAction.ExpressionText = variableName + " <- " + updateValue;
            condition.appendActions(updateAction);

            return retVal;
        }


        /// <summary>
        /// Creates a rule for activate a request
        /// </summary>
        /// <param name="aConfig">Procedure config</param>
        /// <param name="initialStateName">Name of the initial state</param>
        /// <param name="finalStateName">Name of the final state</param>
        /// <param name="variableReqName">Name of the variable request</param>
        /// <param name="updateValue">New value of the variable</param>
        /// <param name="disableRequest">Indicates if the request has to be disabled</param>
        /// <returns></returns>
        private DataDictionary.Rules.Rule CreateRequestActivatedVariableRule(CustomProcedure.DMIProcedureConfig aConfig, string initialStateName, string finalStateName, string variableReqName, string updateValue, bool disableRequest)
        {
            DataDictionary.Rules.Rule retVal = (DataDictionary.Rules.Rule)DataDictionary.Generated.acceptor.getFactory().createRule();

            DataDictionary.Rules.RuleCondition condition = (DataDictionary.Rules.RuleCondition)DataDictionary.Generated.acceptor.getFactory().createRuleCondition();
            retVal.appendConditions(condition);

            if (updateValue.Equals("Boolean.False"))
            {
                retVal.Name = "DisableRequestActivated";
            }
            else
            {
                retVal.Name = "RequestActivated";
            }

            DataDictionary.Rules.PreCondition statePreCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition(); ;
            statePreCondition.ExpressionText = "CurrentState in " + initialStateName;
            condition.appendPreConditions(statePreCondition);

            DataDictionary.Rules.PreCondition requestPreCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition(); ;
            string variableName = "";
            if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_In)
            {
                variableName = "InputInformation." + variableReqName;
            }
            else if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_Out)
            {
                variableName = "OutputInformation." + variableReqName;
            }
            requestPreCondition.ExpressionText = variableName + " == Request.Request";
            condition.appendPreConditions(requestPreCondition);

            DataDictionary.Rules.Action transitionAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            transitionAction.ExpressionText = "CurrentState <- " + finalStateName;
            condition.appendActions(transitionAction);

            DataDictionary.Rules.Action updateAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            variableName = "";
            if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_In)
            {
                variableName = "InputInformation." + aConfig.VariableOutName;
            }
            else if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_Out)
            {
                variableName = "OutputInformation." + aConfig.VariableOutName;
            }
            updateAction.ExpressionText = variableName + " <- " + updateValue;
            condition.appendActions(updateAction);

            if (disableRequest)
            {
                DataDictionary.Rules.Action disableAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
                variableName = "";
                if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_In)
                {
                    variableName = "InputInformation." + variableReqName;
                }
                else if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_Out)
                {
                    variableName = "OutputInformation." + variableReqName;
                }
                disableAction.ExpressionText = variableName + " <- Request.Disabled";
                condition.appendActions(disableAction);
            }

            return retVal;
        }


        /// <summary>
        /// Creates a rule representing the reception of the response
        /// </summary>
        /// <param name="aConfig">Procedure config</param>
        /// <param name="initialStateName">Name of the initial state</param>
        /// <param name="finalStateName">Name of the final state</param>
        /// <returns></returns>
        private DataDictionary.Rules.Rule CreateResponseReceivedVariableRule(CustomProcedure.DMIProcedureConfig aConfig, string initialStateName, string finalStateName)
        {
            DataDictionary.Rules.Rule retVal = (DataDictionary.Rules.Rule)DataDictionary.Generated.acceptor.getFactory().createRule(); ;
            retVal.Name = "ResponseReceived";

            DataDictionary.Rules.RuleCondition condition = (DataDictionary.Rules.RuleCondition)DataDictionary.Generated.acceptor.getFactory().createRuleCondition(); ;
            retVal.appendConditions(condition);

            DataDictionary.Rules.PreCondition statePreCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            statePreCondition.ExpressionText = "CurrentState in " + initialStateName;
            condition.appendPreConditions(statePreCondition);

            DataDictionary.Rules.PreCondition requestPreCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            string variableName = "";
            if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_In)
            {
                variableName = "InputInformation." + aConfig.VariableInName;
            }
            else if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_Out)
            {
                variableName = "OutputInformation." + aConfig.VariableInName;
            }
            requestPreCondition.ExpressionText = variableName + " == Boolean.True";
            condition.appendPreConditions(requestPreCondition);

            DataDictionary.Rules.Action transitionAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            transitionAction.ExpressionText = "CurrentState <-" + finalStateName;
            condition.appendActions(transitionAction);

            DataDictionary.Rules.Action updateAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            variableName = "";
            if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_In)
            {
                variableName = "InputInformation." + aConfig.VariableRequestName;
            }
            else if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_Out)
            {
                variableName = "OutputInformation." + aConfig.VariableRequestName;
            }
            updateAction.ExpressionText = variableName + " <- Request.Response";
            condition.appendActions(updateAction);

            return retVal;
        }

        private DataDictionary.Rules.Rule CreateRequestDisabledVariableRule(CustomProcedure.DMIProcedureConfig aConfig, string initialStateName, string finalStateName, string variableRequestDisabledName)
        {
            DataDictionary.Rules.Rule retVal = (DataDictionary.Rules.Rule)DataDictionary.Generated.acceptor.getFactory().createRule();
            retVal.Name = "RequesDisabled";

            DataDictionary.Rules.RuleCondition condition = (DataDictionary.Rules.RuleCondition)DataDictionary.Generated.acceptor.getFactory().createRuleCondition();
            retVal.appendConditions(condition);

            DataDictionary.Rules.PreCondition statePreCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            statePreCondition.ExpressionText = "CurrentState in " + initialStateName;
            condition.appendPreConditions(statePreCondition);

            DataDictionary.Rules.PreCondition requestPreCondition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
            string variableName = "";
            if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_In)
            {
                variableName = "InputInformation." + variableRequestDisabledName;
            }
            else if (aConfig.Type == CustomProcedure.CustomProcedureType.DMI_Out)
            {
                variableName = "OutputInformation." + variableRequestDisabledName;
            }
            requestPreCondition.ExpressionText = variableName + " == Request.Disabled";
            condition.appendPreConditions(requestPreCondition);

            DataDictionary.Rules.Action transitionAction = (DataDictionary.Rules.Action)DataDictionary.Generated.acceptor.getFactory().createAction();
            transitionAction.ExpressionText = "CurrentState <- " + finalStateName;
            condition.appendActions(transitionAction);

            return retVal;
        }

        /// <summary>
        /// The menu items for this tree node
        /// </summary>
        /// <returns></returns>
        protected override List<MenuItem> GetMenuItems()
        {
            List<MenuItem> retVal = base.GetMenuItems();

            retVal.Add(new MenuItem("Add procedure", new EventHandler(AddProcedureHandler)));
            retVal.Add(new MenuItem("Add custom...", new EventHandler(AddCustomHandler)));
            retVal.Add(new MenuItem("-"));
            retVal.Add(new MenuItem("Delete", new EventHandler(DeleteHandler)));

            return retVal;
        }

        /// <summary>
        /// Accepts a new procedure
        /// </summary>
        /// <param name="SourceNode"></param>
        public override void AcceptDrop(BaseTreeNode SourceNode)
        {
            base.AcceptDrop(SourceNode);

            if (SourceNode is StructureProcedureTreeNode)
            {
                StructureProcedureTreeNode structureProcedureTreeNode = SourceNode as StructureProcedureTreeNode;
                DataDictionary.Types.StructureProcedure procedure = structureProcedureTreeNode.Item;

                structureProcedureTreeNode.Delete();
                AddProcedure(procedure);
            }
            else if (SourceNode is SpecificationView.ParagraphTreeNode)
            {
                SpecificationView.ParagraphTreeNode node = SourceNode as SpecificationView.ParagraphTreeNode;
                DataDictionary.Specification.Paragraph paragaph = node.Item;

                DataDictionary.Types.StructureProcedure procedure = (DataDictionary.Types.StructureProcedure)DataDictionary.Generated.acceptor.getFactory().createStructureProcedure();
                procedure.Name = paragaph.Name;

                DataDictionary.ReqRef reqRef = (DataDictionary.ReqRef)DataDictionary.Generated.acceptor.getFactory().createReqRef();
                reqRef.Name = paragaph.FullId;
                procedure.appendRequirements(reqRef);
                AddProcedure(procedure);
            }
        }

    }
}
