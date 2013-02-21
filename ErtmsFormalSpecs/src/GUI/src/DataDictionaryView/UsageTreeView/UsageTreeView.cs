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
namespace GUI.DataDictionaryView.UsageTreeView
{
    public class UsageTreeView : TypedTreeView<Utils.IModelElement>
    {
        protected override void BuildModel()
        {
            Nodes.Clear();

            if (false)
            {
                // This takes too much time. Do not do, for now.
                if (Root is DataDictionary.Types.ITypedElement)
                {
                    DataDictionary.Variables.IVariable variable = Root as DataDictionary.Variables.IVariable;
                    foreach (DataDictionary.Rules.RuleCondition ruleCondition in DataDictionary.Rules.Rule.RulesUsingThisElement(variable))
                    {
                        Nodes.Add(new RuleUsageTreeNode(ruleCondition));
                    }
                }
                else if (Root is DataDictionary.Types.Type)
                {
                    DataDictionary.Types.Type type = Root as DataDictionary.Types.Type;
                    foreach (DataDictionary.Types.ITypedElement element in DataDictionary.Types.Type.ElementsOfType(type))
                    {
                        Nodes.Add(new TypeUsageTreeNode(element));
                    }
                }
            }
        }
    }
}
