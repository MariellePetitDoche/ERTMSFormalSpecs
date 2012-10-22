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
        public void PushContext()
        {
            StackIndex.Add(Values.Count);
        }

        /// <summary>
        /// Removes the last context from the symbol table
        /// </summary>
        public void PopContext()
        {
            int index = StackIndex.Last();
            StackIndex.RemoveAt(StackIndex.Count - 1);

            Values.RemoveRange(index, Values.Count - index);
        }

        /// <summary>
        /// Stores the variable in this symbol table
        /// </summary>
        /// <param name="name"></param>
        /// <param name="value"></param>
        public void setVariable(Variables.IVariable variable)
        {
            Values.Add(variable);
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
                Parameter param = Values[i] as Parameter;
                if (param != null)
                {
                    if (param.Value is Values.PlaceHolder)
                    {
                        // Insert if no other parameter with the same name is present in the result
                        bool found = false;
                        foreach (Parameter param2 in retVal)
                        {
                            found = String.Equals(param.Name, param2.Name);
                            if (found)
                            {
                                break;
                            }
                        }

                        if (!found)
                        {
                            retVal.Add(param);
                        }
                    }
                }
            }

            return retVal;
        }
    }
}
