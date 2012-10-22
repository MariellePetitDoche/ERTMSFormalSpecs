using System;
using System.Collections.Generic;
using System.Text;

namespace DataDictionary.Constants
{
    public class StateMachine : Generated.StateMachine
    {
        /// <summary>
        /// The states 
        /// </summary>
        public System.Collections.ArrayList States
        {
            get
            {
                if (allStates() == null)
                {
                    setAllStates(new System.Collections.ArrayList());
                }
                return allStates();
            }
        }

        /// <summary>
        /// The state machine initial state
        /// </summary>
        public string InitialState
        {
            get { return getInitialState(); }
            set { setInitialState(value); }
        }

        /// <summary>
        /// Provides the state according to the substates provided
        /// </summary>
        /// <param name="image"></param>
        /// <param name="subStates"></param>
        /// <param name="index"></param>
        /// <returns></returns>
        private State InnerFindState(string[] subStates, int index)
        {
            State retVal = (State) Utils.INamableUtils.findByName(subStates[index], States);;

            if (index < subStates.Length - 1)
            {
                StateMachine stateMachine = retVal.StateMachine;
                if ( stateMachine != null )
                {
                    retVal = stateMachine.InnerFindState(subStates, index + 1);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the state which corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public State findState(string name)
        {
            State retVal = InnerFindState(name.Split('.'), 0);

            if (retVal == null)
            {
                Log.Error("Cannot find state " + name);
            }

            return retVal;
        }


        public State EnclosingState
        {
            get { return Enclosing as State; }
        }

        public Constants.Procedure EnclosingProcedure
        {
            get { return Enclosing as Constants.Procedure; }
        }

        public override void Delete()
        {
            if (EnclosingState != null)
            {
                EnclosingState.StateMachine = null;
            }

            if (EnclosingProcedure != null)
            {
                EnclosingProcedure.StateMachine = null;
            }
        }

        public void Constants(Dictionary<string, object> retVal)
        {
            foreach (State state in this.States)
            {
                state.Constants(retVal);
            }
        }
    }
}
