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
using System.Linq;

namespace DataDictionary.Interpreter
{
    public class SymbolTable
    {
        /// <summary>
        /// The values stored in the symbol table
        /// </summary>
        private List<Variables.IVariable> Values { get; set; }

        /// <summary>
        /// Handles the stack
        /// </summary>
        private List<int> StackIndex { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public SymbolTable()
        {
            Values = new List<Variables.IVariable>();
            StackIndex = new List<int>();
        }

        /// <summary>
        /// Creates a new context in the symbol table
        /// </summary>
        /// <returns>The token required for pop context</rereturns>
        public int PushContext()
        {
            int retVal = Values.Count;

            StackIndex.Add(retVal);

            return retVal;
        }

        /// <summary>
        /// Removes the last context from the symbol table
        /// </summary>
        public void PopContext(int token)
        {
            while (Values.Count != token && Values.Count > 0)
            {
                int index = StackIndex.Last();
                StackIndex.RemoveAt(StackIndex.Count - 1);
                Values.RemoveRange(index, Values.Count - index);
            }
        }

        /// <summary>
        /// Stores the variable in this symbol table
        /// </summary>
        /// <param name="variable"></param>
        public void setVariable(Variables.IVariable variable)
        {
            if (variable == null)
            {
                System.Diagnostics.Debugger.Break();
            }

            Values.Add(variable);
        }

        /// <summary>
        /// Stores the variable in this symbol table with a specific value
        /// </summary>
        /// <param name="variable"></param>
        /// <param name="value"></param>
        public void setVariable(Variables.IVariable variable, Values.IValue value)
        {
            variable.Value = value;
            Values.Add(variable);
        }

        /// <summary>
        /// Stores the variable in this symbol table with a specific value
        /// </summary>
        /// <param name="parameter"></param>
        /// <param name="value"></param>
        public void setParameter(Parameter parameter, Values.IValue value)
        {
            Variables.IVariable actual = parameter.createActual();
            actual.Value = value;
            Values.Add(actual);
        }

        /// <summary>
        /// Stores a graph parameter in this symbol table
        /// </summary>
        /// <param name="xAxis"></param>
        public void setGraphParameter(Parameter xAxis)
        {
            setParameter(xAxis, new Values.PlaceHolder(xAxis.Type, 0));
        }

        /// <summary>
        /// Stores a surface set of parameters in this symbol table
        /// </summary>
        /// <param name="xAxis"></param>
        /// <param name="yAxis"></param>
        public void setSurfaceParameters(Parameter xAxis, Parameter yAxis)
        {
            setParameter(xAxis, new Values.PlaceHolder(xAxis.Type, 0));
            setParameter(yAxis, new Values.PlaceHolder(yAxis.Type, 1));
        }

        /// <summary>
        /// Provides the variable assocaited to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Variables.IVariable getVariable(string name)
        {
            Variables.IVariable retVal = null;

            for (int i = Values.Count - 1; i >= 0; i--)
            {
                Variables.IVariable element = Values[i];
                if (element.Name.CompareTo(name) == 0)
                {
                    retVal = element;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the list of parameter whose value is a place holder
        /// </summary>
        /// <returns></returns>
        public List<Parameter> PlaceHolders()
        {
            List<Parameter> retVal = new List<Parameter>();

            for (int i = Values.Count - 1; i >= 0; i--)
            {
                Variables.Actual actual = Values[i] as Variables.Actual;
                if (actual != null)
                {
                    if (actual.Value is Values.PlaceHolder)
                    {
                        // Insert if no other parameter with the same name is present in the result
                        bool found = false;
                        foreach (Parameter param2 in retVal)
                        {
                            if (param2 == actual.Parameter)
                            {
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                        {
                            retVal.Add(actual.Parameter);
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the actual variable which corresponds to this parameter on the stack
        /// </summary>
        /// <param name="parameter"></param>
        /// <returns></returns>
        public Variables.IVariable find(Parameter parameter)
        {
            Variables.IVariable retVal = null;

            for (int i = Values.Count - 1; i >= 0; i--)
            {
                Variables.IVariable var = Values[i];
                if (parameter.Name.Equals(var.Name))
                {
                    retVal = var;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the current stack index
        /// </summary>
        public int Index { get { return Values.Count; } }
    }
}
