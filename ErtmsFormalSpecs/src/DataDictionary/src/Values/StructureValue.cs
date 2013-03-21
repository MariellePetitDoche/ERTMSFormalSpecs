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

namespace DataDictionary.Values
{
    public class StructureValue : BaseValue<Types.Structure, Dictionary<string, Utils.INamable>>, Utils.ISubDeclarator
    {
        /// <summary>
        /// Provides the type as a structure
        /// </summary>
        public Types.Structure Structure
        {
            get { return Type as Types.Structure; }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="structure"></param>
        public StructureValue(Types.Structure structure, Utils.INamable enclosing)
            : base(structure, new Dictionary<string, Utils.INamable>())
        {
            Enclosing = structure;

            foreach (Types.StructureElement element in Structure.Elements)
            {
                Variables.Variable variable = (Variables.Variable)DataDictionary.Generated.acceptor.getFactory().createVariable();
                if (element.Type != null)
                {
                    variable.Type = element.Type;
                }
                variable.Name = element.Name;
                variable.Mode = element.Mode;
                variable.Default = element.Default;
                variable.Enclosing = enclosing;
                variable.Enclosing = this;
                set(variable);
            }

            foreach (Types.StructureProcedure procedure in Structure.Procedures)
            {
                Variables.Procedure proc = (Variables.Procedure)DataDictionary.Generated.acceptor.getFactory().createProcedure();
                proc.StateMachine = procedure.instanciateStateMachine();
                proc.Rules = procedure.Rules;
                proc.Name = procedure.Name;
                proc.Default = procedure.Default;
                foreach (Parameter parameter in procedure.FormalParameters)
                {
                    Parameter p2 = (Parameter)DataDictionary.Generated.acceptor.getFactory().createParameter();
                    p2.Name = parameter.Name;
                    p2.Type = parameter.Type;
                    proc.appendParameters(p2);
                }
                proc.Enclosing = this;
                set(proc);
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="structure"></param>
        public StructureValue(StructureValue other)
            : base(other.Structure, new Dictionary<string, Utils.INamable>())
        {
            Enclosing = other.Structure;

            foreach (KeyValuePair<string, Utils.INamable> pair in other.Val)
            {
                Variables.Variable variable = pair.Value as Variables.Variable;
                if (variable != null)
                {
                    Variables.Variable var2 = (Variables.Variable)DataDictionary.Generated.acceptor.getFactory().createVariable();
                    var2.Type = variable.Type;
                    var2.Name = variable.Name;
                    var2.Mode = variable.Mode;
                    var2.Default = variable.Default;
                    var2.Enclosing = this;
                    if (variable.Value != null)
                    {
                        var2.Value = variable.Value.RightSide(var2, true);
                    }
                    else
                    {
                        var2.Value = null;
                    }
                    set(var2);
                }

                Variables.Procedure procedure = pair.Value as Variables.Procedure;
                if (procedure != null)
                {
                    Variables.Procedure proc2 = (Variables.Procedure)DataDictionary.Generated.acceptor.getFactory().createProcedure();
                    proc2.StateMachine = procedure.StateMachine;
                    proc2.Rules = procedure.Rules;
                    proc2.Name = procedure.Name;
                    proc2.Default = procedure.Default;
                    foreach (Parameter parameter in procedure.FormalParameters)
                    {
                        Parameter p2 = (Parameter)DataDictionary.Generated.acceptor.getFactory().createParameter();
                        p2.Name = parameter.Name;
                        p2.Type = parameter.Type;
                        proc2.appendParameters(p2);
                    }
                    proc2.Enclosing = this;
                    if (procedure.CurrentState != null)
                    {
                        proc2.CurrentState.Value = procedure.CurrentState.Value;
                    }
                    set(proc2);
                }
            }
        }

        /// <summary>
        /// Sets the value of a given association
        /// </summary>
        /// <param name="name"></param>
        /// <param name="val"></param>
        public void set(Variables.IVariable variable)
        {
            if (Val.ContainsKey(variable.Name))
            {
                Variables.IVariable var = Val[variable.Name] as Variables.IVariable;
                if (var != null)
                {
                    var.Value = variable.Value;
                }
            }
            else
            {
                Val.Add(variable.Name, variable);
            }
        }

        /// <summary>
        /// Sets the value of a given association
        /// </summary>
        /// <param name="name"></param>
        /// <param name="val"></param>
        public void set(Variables.Procedure procedure)
        {
            if (Val.ContainsKey(procedure.Name))
            {
                Variables.Procedure proc = Val[procedure.Name] as Variables.Procedure;

                if (proc != null)
                {
                    proc.CurrentState.Value = procedure.CurrentState.Value;
                }
            }
            else
            {
                Val.Add(procedure.Name, procedure);
            }
        }

        /// <summary>
        /// Gets the value associated to a name
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Variables.IVariable getVariable(string name)
        {
            Variables.IVariable retVal = null;

            if (Val.ContainsKey(name))
            {
                retVal = Val[name] as Variables.IVariable;
            }

            return retVal;
        }

        /// <summary>
        /// Gets the value associated to a name
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Variables.IProcedure getProcedure(string name)
        {
            Variables.IProcedure retVal = null;

            if (Val.ContainsKey(name))
            {
                retVal = Val[name] as Variables.IProcedure;
            }

            return retVal;
        }

        /// <summary>
        /// The elements declared by this declarator
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = new Dictionary<string, List<Utils.INamable>>();

                foreach (Utils.INamable namable in Val.Values)
                {
                    Utils.ISubDeclaratorUtils.AppendNamable(retVal, namable);
                }

                return retVal;
            }
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            Utils.INamable namable = null;

            if (Val.TryGetValue(name, out namable))
            {
                retVal.Add(namable);
            }
        }

        public override string Name
        {
            get
            {
                string retVal = Type.FullName + "\n{\n";

                bool first = true;
                foreach (object tmp in Val.Values)
                {
                    if (!first)
                    {
                        retVal += ", \n";
                    }
                    Variables.Variable variable = tmp as Variables.Variable;
                    if (variable != null && variable.Value != null)
                    {
                        retVal += "    " + variable.Name + " => " + variable.Value.FullName;
                    }

                    Variables.Procedure procedure = tmp as Variables.Procedure;
                    if (procedure != null && procedure.CurrentState != null && procedure.CurrentState.Value != null)
                    {
                        retVal += procedure.Name + " => " + procedure.CurrentState.Value.FullName;
                    }

                    first = false;
                }
                retVal += "\n}";

                return retVal;
            }
            set { }
        }

        /// <summary>
        /// The sub variables of this structure
        /// </summary>
        private Dictionary<string, Variables.IVariable> subVariables;
        public Dictionary<string, Variables.IVariable> SubVariables
        {
            get
            {
                if (subVariables == null)
                {
                    subVariables = new Dictionary<string, Variables.IVariable>();

                    foreach (KeyValuePair<string, Utils.INamable> kp in Val)
                    {
                        Variables.IVariable var = kp.Value as Variables.IVariable;

                        if (var != null)
                        {
                            subVariables.Add(kp.Key, var);
                        }
                    }
                }

                return subVariables;
            }
        }

        /// <summary>
        /// The sub variables of this structure
        /// </summary>
        private Dictionary<string, Variables.IProcedure> procedures;
        public Dictionary<string, Variables.IProcedure> Procedures
        {
            get
            {
                if (procedures == null)
                {
                    procedures = new Dictionary<string, Variables.IProcedure>();

                    foreach (KeyValuePair<string, Utils.INamable> kp in Val)
                    {
                        Variables.IProcedure proc = kp.Value as Variables.IProcedure;

                        if (proc != null)
                        {
                            procedures.Add(kp.Key, proc);
                        }
                    }
                }

                return procedures;
            }
        }

        /// <summary>
        /// Creates a valid right side IValue, according to the target variable (left side)
        /// </summary>
        /// <param name="variable">The target variable</param>
        /// <param name="duplicate">Indicates that a duplication of the variable should be performed</param>
        /// <returns></returns>
        public override Values.IValue RightSide(Variables.IVariable variable, bool duplicate)
        {
            StructureValue retVal = this;

            if (duplicate)
            {
                retVal = new StructureValue(retVal);
            }
            retVal.Enclosing = variable;

            return retVal;
        }
    }
}
