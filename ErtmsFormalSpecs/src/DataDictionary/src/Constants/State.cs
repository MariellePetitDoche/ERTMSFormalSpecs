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

namespace DataDictionary.Constants
{
    public class State : Generated.State, Values.IValue, Utils.ISubDeclarator, TextualExplain
    {
        public string LiteralName
        {
            get
            {
                string retVal = Name;

                State stt = EnclosingState;
                while (stt != null)
                {
                    retVal = stt.Name + "." + retVal;
                    stt = stt.EnclosingState;
                }

                if (EnclosingProcedure != null)
                {
                    retVal = EnclosingProcedure.Name + "." + retVal;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the full name path to this element in the model structure
        /// </summary>
        public override string FullName
        {
            get
            {
                string retVal = Name;

                State stt = EnclosingState;
                while (stt != null)
                {
                    retVal = stt.Name + "." + retVal;
                    stt = stt.EnclosingState;
                }

                if (EnclosingProcedure != null)
                {
                    retVal = EnclosingProcedure.FullName + "." + retVal;
                }

                return retVal;
            }
        }

        /// <summary>
        /// The states available in this state
        /// </summary>
        public HashSet<Constants.State> AllStates
        {
            get { return StateFinder.INSTANCE.find(this); }
        }

        /// <summary>
        /// Finds a substate from this state
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Constants.State findSubState(string name)
        {
            return findSubState(name.Split('.'), 0);
        }

        /// <summary>
        /// Provides the state whose name matches the name provided
        /// </summary>
        /// <param name="index">the index in names to consider</param>
        /// <param name="names">the simple value names</param>
        public Constants.State findSubState(string[] names, int index)
        {
            Constants.State retVal = null;

            foreach (Constants.State state in StateMachine.States)
            {
                if (state.Name.CompareTo(names[index]) == 0)
                {
                    retVal = state;
                    if (index < names.Length - 1)
                    {
                        retVal = retVal.findSubState(names, index + 1);
                    }
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// The value type
        /// </summary>
        public Types.Type Type
        {
            get
            {
                Types.StateMachine retVal = StateMachine;

                while (retVal.EnclosingStateMachine != null)
                {
                    retVal = retVal.EnclosingStateMachine;
                }

                return retVal;
            }
            set { }
        }

        /// <summary>
        /// The sub state machine for this state
        /// </summary>
        public Types.StateMachine StateMachine
        {
            get
            {
                if (getStateMachine() == null)
                {
                    Types.StateMachine stateMachine = (Types.StateMachine)DataDictionary.Generated.acceptor.getFactory().createStateMachine();
                    stateMachine.setFather(this);
                    setStateMachine(stateMachine);
                }

                return (Types.StateMachine)getStateMachine();
            }
            set { setStateMachine(value); }
        }

        /// <summary>
        /// The width of the rectangle representing the state
        /// </summary>
        public int Width
        {
            get { return getWidth(); }
            set { setWidth(value); }
        }

        /// <summary>
        /// The height of the rectangle representing the state
        /// </summary>
        public int Height
        {
            get { return getHeight(); }
            set { setHeight(value); }
        }

        /// <summary>
        /// The X position of the rectangle representing the state
        /// </summary>
        public int X
        {
            get { return getX(); }
            set { setX(value); }
        }

        /// <summary>
        /// The Y position of the rectangle representing the state
        /// </summary>
        public int Y
        {
            get { return getY(); }
            set { setY(value); }
        }

        /// <summary>
        /// The enclosing state machine
        /// </summary>
        public Types.StateMachine EnclosingStateMachine
        {
            get { return Enclosing as Types.StateMachine; }
        }

        /// <summary>
        /// The enclosing procedure
        /// </summary>
        public Variables.Procedure EnclosingProcedure
        {
            get { return Utils.EnclosingFinder<Variables.Procedure>.find(this); }
        }

        /// <summary>
        /// The enclosing structure procedure
        /// </summary>
        public Types.StructureProcedure EnclosingStructureProcedure
        {
            get { return Utils.EnclosingFinder<Types.StructureProcedure>.find(this); }
        }

        /// <summary>
        /// The enclosing state, if any
        /// </summary>
        public State EnclosingState
        {
            get { return EnclosingStateMachine.getFather() as State; }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return EnclosingStateMachine.States; }
        }

        public void Constants(string scope, Dictionary<string, object> retVal)
        {
            string name = Utils.Utils.concat(scope, Name);

            retVal[name] = this;
            if (StateMachine != null)
            {
                StateMachine.Constants(name, retVal);
            }
        }

        /// <summary>
        /// Provides all the states available through this state
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                return StateMachine.DeclaredElements;
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
        }

        /// <summary>
        /// Creates a valid right side IValue, according to the target variable (left side)
        /// </summary>
        /// <param name="variable">The target variable</param>
        /// <param name="duplicate">Indicates that a duplication of the variable should be performed</param>
        /// <returns></returns>
        public virtual Values.IValue RightSide(Variables.IVariable variable, bool duplicate)
        {
            State retVal = this;

            while (retVal.StateMachine.AllValues.Count > 0)
            {
                retVal = (Constants.State)retVal.StateMachine.DefaultValue;
            }

            return retVal;
        }

        /// <summary>
        /// The namespace related to the typed element
        /// </summary>
        public Types.NameSpace NameSpace { get { return null; } }

        /// <summary>
        /// Provides the type name of the element
        /// </summary>
        public string TypeName { get { return Type.FullName; } }

        /// <summary>
        /// Provides the mode of the typed element
        /// </summary>
        public DataDictionary.Generated.acceptor.VariableModeEnumType Mode { get { return Generated.acceptor.VariableModeEnumType.aInternal; } }

        /// <summary>
        /// Provides the default value of the typed element
        /// </summary>
        public string Default { get { return this.FullName; } set { } }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
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
                  TextualExplainUtilities.Pad("{\\cf11 // " + TextualExplainUtilities.Iterate('*', 6 + Name.Length) + "}\\cf1\\par", indentLevel)
                + TextualExplainUtilities.Pad("{\\cf11 // State " + Name + "}\\cf1\\par", indentLevel)
                + TextualExplainUtilities.Pad("{\\cf11 // " + TextualExplainUtilities.Iterate('*', 6 + Name.Length) + "}\\cf1\\par", indentLevel);

            if (getExplain)
            {
                foreach (Rules.Rule rule in StateMachine.Rules)
                {

                    retVal += "\\par" + rule.getExplain(indentLevel, true);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the rule's behaviour
        /// </summary>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0, explainSubElements);

            return TextualExplainUtilities.Encapsule(retVal);
        }

        /// <summary>
        /// Duplicates this model element
        /// </summary>
        /// <returns></returns>
        public State duplicate()
        {
            State retVal = (State)Generated.acceptor.getFactory().createState();
            retVal.Name = Name;
            retVal.X = X;
            retVal.Y = Y;
            retVal.Width = Width;
            retVal.Height = Height;
            retVal.setFather(getFather());
            retVal.StateMachine = StateMachine.instanciate();
            return retVal;
        }
    }
}
