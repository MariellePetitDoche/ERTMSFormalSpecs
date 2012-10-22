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

namespace Utils
{
    public abstract class ListenerHandler
    {
        /// <summary>
        /// A basic listener class
        /// </summary>
        public delegate void ChangeHandler();

        private ICollection<ChangeHandler> handlers = new HashSet<ChangeHandler>();

        /// <summary>
        /// Adds a new listener to this handler
        /// </summary>
        /// <param name="listener"></param>
        public void addListener(ChangeHandler listener)
        {
            handlers.Add(listener);
        }

        /// <summary>
        /// Removes a listener from this handler
        /// </summary>
        /// <param name="listerner"></param>
        public void removeListener(ChangeHandler listerner)
        {
            handlers.Remove(listerner);
        }

        /// <summary>
        /// Alerts all listeners that a change occured
        /// </summary>
        public void alertChanges()
        {
            foreach (ChangeHandler changeHandler in handlers)
            {
                changeHandler();
            }
        }
    }
}
