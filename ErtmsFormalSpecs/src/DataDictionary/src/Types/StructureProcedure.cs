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

namespace DataDictionary.Types
{
    public class StructureProcedure : Generated.StructureProcedure, ITypedElement, Utils.ISubDeclarator, Variables.IProcedure, TextualExplain
    {

        /// <summary>
        /// Indicates if this StructureProcedure contains implemented sub-elements
        /// </summary>
        public override bool ImplementationPartiallyCompleted
        {
            get
            {
                if (getImplemented() || StateMachine.ImplementationPartiallyCompleted)
                {
                    return true;
                }
                foreach (DataDictionary.Rules.Rule rule in Rules)
                {
                    if (rule.ImplementationPartiallyCompleted)
                    {
                        return true;
                    }
                }

                return false;
            }
        }

        /// <summary>
        /// The current state of the structure procedure
        /// HaCK : fake element, which is not used to actually store any value
        /// </summary>
        private Variables.Variable currentState;
        public Variables.Variable CurrentState
        {
            get
            {
                if (currentState == null && StateMachine.States.Count > 0)
                {
                    currentState = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
                    currentState.Name = "CurrentState";
                    currentState.Value = null;
                    currentState.Type = StateMachine;
                    currentState.Mode = Generated.acceptor.VariableModeEnumType.aInternal;
                    currentState.setFather(this);
                }

                return currentState;
            }
        }

        public NameSpace NameSpace
        {
            get { return EnclosingNameSpaceFinder.find(this); }
        }

        /// <summary>
        /// Provides the type name of the structure procedure
        /// </summary>
        public string TypeName
        {
            get { return StateMachine.Name; }
        }

        /// <summary>
        /// Provides the type related to the element which stores the current procedure state
        /// </summary>
        public Type Type
        {
            get { return StateMachine; }
            set { }
        }

        /// <summary>
        /// The state machine this procedure must follow
        /// </summary>
        public Types.StateMachine StateMachine
        {
            get
            {
                if (getStateMachine() == null)
                {
                    setStateMachine(DataDictionary.Generated.acceptor.getFactory().createStateMachine());
                }
                return (Types.StateMachine)getStateMachine();
            }
            set
            {
                value.setFather(this);
                setStateMachine(value);
            }
        }

        /// <summary>
        /// The rules declared in this structure procedure
        /// </summary>
        public System.Collections.ArrayList Rules
        {
            get
            {
                if (allRules() == null)
                {
                    setAllRules(new System.Collections.ArrayList());
                }
                return allRules();
            }
            set
            {
                setAllRules(value);
            }
        }

        /// <summary>
        /// Parameters of the structure procedure
        /// </summary>
        public System.Collections.ArrayList FormalParameters
        {
            get
            {
                if (allParameters() == null)
                    setAllParameters(new System.Collections.ArrayList());
                return allParameters();
            }
            set { setAllParameters(value); }
        }


        /// <summary>
        /// Provides the formal parameter whose name corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Parameter getFormalParameter(string name)
        {
            Parameter retVal = null;

            foreach (Parameter parameter in FormalParameters)
            {
                if (parameter.Name.CompareTo(name) == 0)
                {
                    retVal = parameter;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// The procedure return type
        /// </summary>
        public Types.Type ReturnType
        {
            get { return EFSSystem.NoType; }
        }

        /// <summary>
        /// The enclosing structure
        /// </summary>
        public Structure Structure
        {
            get { return (Structure)getFather(); }
        }

        /// <summary>
        /// Provides the enclosing structure
        /// </summary>
        public override object Enclosing
        {
            get
            {
                return Structure;
            }
            set
            {
                base.Enclosing = value;
            }
        }

        /// <summary>
        /// Provides the mode of the variable
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode
        {
            get { return DataDictionary.Generated.acceptor.VariableModeEnumType.aInternal; }
        }

        /// <summary>
        /// The enclosing collection
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return Structure.Procedures; }
        }


        /// <summary>
        /// Provides all the states available through this state
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = StateMachine.DeclaredElements;

                Utils.ISubDeclaratorUtils.AppendNamable(retVal, CurrentState);
                foreach (Parameter parameter in FormalParameters)
                {
                    Utils.ISubDeclaratorUtils.AppendNamable(retVal, parameter);
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
            StateMachine.find(name, retVal);

            if (CurrentState != null)
            {
                if (CurrentState.Name.CompareTo(name) == 0)
                {
                    retVal.Add(CurrentState);
                }
            }

            foreach (Parameter item in FormalParameters)
            {
                if (item.Name.CompareTo(name) == 0)
                {
                    retVal.Add(item);
                    break;
                }
            }
        }

        /// <summary>
        /// The default value
        /// </summary>
        public string Default
        {
            get { return StateMachine.getDefault(); }
            set { StateMachine.setDefault(value); }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Parameter item = element as Parameter;
                if (item != null)
                {
                    appendParameters(item);
                }
            }
            {
                Rules.Rule item = element as Rules.Rule;
                if (item != null)
                {
                    appendRules(item);
                }
            }

            base.AddModelElement(element);
        }

        /// <summary>
        /// Perform additional checks based on the parameter types
        /// </summary>
        /// <param name="root">The element on which the errors should be reported</param>
        /// <param name="context">The evaluation context</param>
        /// <param name="actualParameters">The parameters applied to this function call</param>
        public virtual void additionalChecks(ModelElement root, Dictionary<string, Interpreter.Expression> actualParameters)
        {
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel, bool getExplain)
        {
            string retVal = "";

            retVal =
                  TextualExplainUtilities.Pad("{\\cf11 // " + TextualExplainUtilities.Iterate('-', 6 + Name.Length) + "}\\cf1\\par", indentLevel)
                + TextualExplainUtilities.Pad("{PROCEDURE " + Name + "(", indentLevel);

            foreach (Parameter parameter in FormalParameters)
            {
                retVal = retVal + TextualExplainUtilities.Pad(parameter.Name + ":" + parameter.TypeName, indentLevel + 2);
            }
            retVal = retVal + ")}\\par";

            foreach (Rules.Rule rule in Rules)
            {
                retVal += "\\par" + rule.getExplain(indentLevel + 2, true);
            }

            if (StateMachine.States.Count > 0)
            {
                retVal += TextualExplainUtilities.Pad("\\par{\\cf11 // The temporal behaviour of this procedure is defined by a state machine}\\cf1\\par", indentLevel + 2);
            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0, true);

            return TextualExplainUtilities.Encapsule(retVal);
        }
    }
}
