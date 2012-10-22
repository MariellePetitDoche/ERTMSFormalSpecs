// ------------------------------------------------------------------------------
// -- Copyright RainCode
// -- All rights reserved
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

namespace XmlBooster
{
    public class Lock
    {
        private bool locked = false;

        /// <summary>
        /// Constructor
        /// </summary>
        public Lock()
        {
        }

        /// <summary>
        /// Gets the corresponding lock
        /// </summary>
        /// <returns>false if the lock is already locked</returns>
        public bool GetLock()
        {
            bool retVal = !locked;

            if (!locked)
            {
                locked = true;
            }

            return retVal;
        }

        /// <summary>
        /// Unlocks the lock
        /// </summary>
        public void UnLock()
        {
            locked = false;
        }
    }

    /// <summary>
    /// Listens to a specific event
    /// </summary>
    /// <typeparam name="T"></typeparam>
    public interface IListener<T>
        where T : class
    {
        /// <summary>
        /// Handles the change event
        /// </summary>
        /// <param name="sender"></param>
        void HandleChangeEvent(T sender);

        /// <summary>
        /// Handles a change event
        /// </summary>
        /// <param name="aLock"></param>
        /// <param name="sender"></param>
        void HandleChangeEvent(Lock aLock, T sender);
    }

    /// <summary>
    /// Listens to a specific event
    /// </summary>
    /// <typeparam name="T"></typeparam>
    public abstract class Listener<T> : IListener<T>
        where T : class
    {
        /// <summary>
        /// Handles the change event
        /// </summary>
        /// <param name="sender"></param>
        public abstract void HandleChangeEvent(T sender);

        /// <summary>
        /// Handles a change event
        /// </summary>
        /// <param name="aLock"></param>
        /// <param name="sender"></param>
        public void HandleChangeEvent(Lock aLock, T sender)
        {
            HandleChangeEvent(this, aLock, sender);
        }

        /// <summary>
        /// Handles a change event
        /// </summary>
        /// <param name="listener"></param>
        /// <param name="aLock"></param>
        /// <param name="sender"></param>
        public static void HandleChangeEvent(IListener<T> listener, Lock aLock, T sender)
        {
            if (aLock == null)
            {
                listener.HandleChangeEvent(sender);
            }
            else
            {
                if (aLock.GetLock())
                {
                    try
                    {
                        listener.HandleChangeEvent(sender);
                    }
                    finally
                    {
                        aLock.UnLock();
                    }
                }
            }
        }
    }

    /// <summary>
    /// A model element controller
    /// </summary>
    /// <typeparam name="T"></typeparam>
    /// <typeparam name="Listener"></typeparam>
    public class Controller<T, Listener>
        where T : class
        where Listener : IListener<T>
    {
        /// <summary>
        /// Indicates that notifications should be sent to the listeners
        /// </summary>
        private bool notify = true;

        /// <summary>
        /// Activates the notifications to the listeners
        /// </summary>
        public void ActivateNotification()
        {
            notify = true;
        }

        /// <summary>
        /// Deactivates the notifications to the listeners
        /// </summary>
        public void DesactivateNotification()
        {
            notify = false;
        }

        /// <summary>
        /// The listeners
        /// </summary>
        private List<IListener<T>> listeners = new List<IListener<T>>();
        public List<IListener<T>> Listeners
        {
            get { return listeners; }
        }

        /// <summary>
        /// Alerts all listeners that a change occured
        /// </summary>
        /// <param name="aLock"></param>
        /// <param name="sender"></param>
        public void alertChange(Lock aLock, T sender)
        {
            if (notify)
            {
                foreach (IListener<T> listener in Listeners)
                {
                    listener.HandleChangeEvent(aLock, sender);
                }
            }
        }
    }
}

