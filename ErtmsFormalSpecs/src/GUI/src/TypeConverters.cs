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

namespace GUI
{
    /// <summary>
    /// Types converter. Provides the available types 
    /// </summary>
    public class TypesConverter : TypeConverter
    {
        public override bool GetStandardValuesSupported(ITypeDescriptorContext context)
        {
            return true;
        }

        public override bool GetStandardValuesExclusive(ITypeDescriptorContext context)
        {
            return true;
        }

        public StandardValuesCollection GetValues(Utils.IModelElement element)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();

            DataDictionary.Dictionary dictionary = Utils.EnclosingFinder<DataDictionary.Dictionary>.find(element);
            DataDictionary.Types.NameSpace nameSpace = DataDictionary.EnclosingNameSpaceFinder.find(element);

            List<string> retVal = new List<string>();
            if (nameSpace != null)
            {
                DataDictionary.OverallTypeFinder.INSTANCE.findAllValueNames("", nameSpace, true, retVal);
            }
            else
            {
                DataDictionary.OverallTypeFinder.INSTANCE.findAllValueNames("", dictionary, false, retVal);
            }
            retVal.Sort();

            foreach (string name in dictionary.EFSSystem.PredefinedTypes.Keys)
            {
                retVal.Add(name);
            }

            return new StandardValuesCollection(retVal);
        }
    }

    /// <summary>
    /// Values converter. Provides all possible values for a specific variable.
    /// </summary>
    public class ValuesConverter : TypeConverter
    {
        public override bool GetStandardValuesSupported(ITypeDescriptorContext context)
        {
            return true;
        }

        public override bool GetStandardValuesExclusive(ITypeDescriptorContext context)
        {
            return false;
        }

        public StandardValuesCollection GetValues(DataDictionary.Types.NameSpace nameSpace, DataDictionary.Types.Type type)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();

            List<string> retVal = new List<string>();
            if (type != null)
            {
                string prefix = type.FullName;
                if (nameSpace == type.NameSpace && nameSpace != null)
                {
                    prefix = prefix.Substring(nameSpace.FullName.Length + 1);
                }
                DataDictionary.OverallValueFinder.INSTANCE.findAllValueNames(prefix, type, false, retVal);
                retVal.Sort();
            }

            return new StandardValuesCollection(retVal);
        }
    }

    /// <summary>
    /// Provides the list of sub systems
    /// </summary>
    public class NameSpaceConverter : TypeConverter
    {
        public override bool GetStandardValuesSupported(ITypeDescriptorContext context)
        {
            return true; // display drop
        }

        public override bool GetStandardValuesExclusive(ITypeDescriptorContext context)
        {
            return true; // drop-down vs combo
        }

        public StandardValuesCollection GetValues(DataDictionary.Dictionary dictionary)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();

            List<string> retVal = new List<string>();
            DataDictionary.OverallNameSpaceFinder.INSTANCE.findAllValueNames("", dictionary, false, retVal);
            retVal.Sort();

            return new StandardValuesCollection(retVal);
        }
    }

    /// <summary>
    /// Provides the list of requirement paragraphs
    /// </summary>
    public class TracesConverter : TypeConverter
    {
        public override bool GetStandardValuesSupported(ITypeDescriptorContext context)
        {
            return true; // display drop
        }

        public override bool GetStandardValuesExclusive(ITypeDescriptorContext context)
        {
            return true; // drop-down vs combo
        }

        public StandardValuesCollection GetValues(DataDictionary.ReqRef req)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();

            List<string> retVal = new List<string>();

            if (req.Model is DataDictionary.Rules.Rule)
            {
                DataDictionary.Rules.Rule rule = req.Model as DataDictionary.Rules.Rule;
                foreach (DataDictionary.Specification.Paragraph paragraph in rule.ApplicableParagraphs)
                {
                    retVal.Add(paragraph.getId());
                }
            }
            else
            {
                foreach (string paragraph in req.Specifications.ParagraphList())
                {
                    retVal.Add(paragraph);
                }
            }

            return new StandardValuesCollection(retVal);
        }
    }

    /// <summary>
    /// Provides the list of operators
    /// </summary>
    public class StateTypeConverter : TypeConverter
    {
        public override bool GetStandardValuesSupported(ITypeDescriptorContext context)
        {
            return true; // display drop
        }

        public override bool GetStandardValuesExclusive(ITypeDescriptorContext context)
        {
            return true; // drop-down vs combo
        }

        public StandardValuesCollection GetValues(DataDictionary.Types.StateMachine StateMachine)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();

            List<string> retVal = new List<string>();
            foreach (DataDictionary.Constants.State subState in StateMachine.States)
            {
                retVal.Add(subState.Name);
            }
            retVal.Sort();

            return new StandardValuesCollection(retVal);
        }

        public StandardValuesCollection GetValues(DataDictionary.Constants.State State)
        {
            return GetValues(State.StateMachine);
        }
    }

    /// <summary>
    /// Provides the list of operators
    /// </summary>
    public class OperatorConverter : TypeConverter
    {
        public override bool GetStandardValuesSupported(ITypeDescriptorContext context)
        {
            return true; // display drop
        }

        public override bool GetStandardValuesExclusive(ITypeDescriptorContext context)
        {
            return true; // drop-down vs combo
        }

        public override StandardValuesCollection GetStandardValues(ITypeDescriptorContext context)
        {
            Utils.FinderRepository.INSTANCE.ClearCache();

            return new StandardValuesCollection(DataDictionary.Interpreter.BinaryExpression.OperatorsImages);
        }
    }
}
