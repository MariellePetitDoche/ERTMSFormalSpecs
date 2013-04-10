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

namespace Utils
{
    public interface IEnclosed
    {
        /// <summary>
        /// The enclosing model element
        /// </summary>
        object Enclosing { get; }
    }

    /// <summary>
    /// Deletes this element from its enclosing node
    /// </summary>
    public interface IModelElement : IEnclosed, INamable, IComparable<IModelElement>
    {
        /// <summary>
        /// The sub elements of this model element
        /// </summary>
        System.Collections.ArrayList SubElements { get; }

        /// <summary>
        /// Provides the collection which holds this instance
        /// </summary>
        System.Collections.ArrayList EnclosingCollection { get; }

        /// <summary>
        /// Deletes the element from its enclosing node
        /// </summary>
        void Delete();

        /// <summary>
        /// The expression text data of this model element
        /// </summary>
        /// <param name="text"></param>
        string ExpressionText { get; set; }

        /// <summary>
        /// The messages logged on the model element
        /// </summary>
        List<ElementLog> Messages { get; }

        /// <summary>
        /// Indicates that at least one message of type levelEnum is attached to the element
        /// </summary>
        /// <param name="levelEnum"></param>
        /// <returns></returns>
        bool HasMessage(ElementLog.LevelEnum levelEnum);

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        void AddModelElement(IModelElement element);
    }

    public abstract class ModelElement : XmlBooster.XmlBBase, IModelElement
    {
        /// <summary>
        /// The Logger
        /// </summary>
        protected static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// The model element name
        /// </summary>
        public virtual string Name { get; set; }
        public virtual string FullName { get { return Name; } }

        /// <summary>
        /// The enclosing model element
        /// </summary>
        private object enclosing;
        public virtual object Enclosing
        {
            get
            {
                if (enclosing == null)
                {
                    return getFather();
                }
                return enclosing;
            }
            set
            {
                XmlBooster.IXmlBBase val = value as XmlBooster.IXmlBBase;
                if (val != null)
                {
                    setFather(val);
                }
                else
                {
                    enclosing = value;
                }
            }
        }


        /// <summary>
        /// The sub elements of this model element
        /// </summary>
        public System.Collections.ArrayList SubElements
        {
            get
            {
                System.Collections.ArrayList list = new System.Collections.ArrayList();

                subElements(list);

                return list;
            }
        }

        /// <summary>
        /// The comparer
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public virtual int CompareTo(IModelElement other)
        {
            if (Name != null)
            {
                return Name.CompareTo(other.Name);
            }
            else if (this == other)
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }

        /// <summary>
        /// The collection in which this model element lies
        /// </summary>
        public virtual System.Collections.ArrayList EnclosingCollection { get { return null; } }

        /// <summary>
        /// Deletes this model element from its enclosing collection
        /// </summary>
        public virtual void Delete()
        {
            if (EnclosingCollection != null)
            {
                EnclosingCollection.Remove(this);
            }
        }

        /// <summary>
        /// Inserts this element after the element provided as parameter
        /// </summary>
        /// <param name="other">The element after which this element should be inserted</param>
        public virtual void InsertAfter(ModelElement other)
        {
            setFather(other.getFather());
            if (other.EnclosingCollection != null)
            {
                int index = other.EnclosingCollection.IndexOf(other);
                if (index >= 0)
                {
                    other.EnclosingCollection.Insert(index + 1, this);
                }
                else
                {
                    other.EnclosingCollection.Insert(0, this);
                }
            }
        }

        /// <summary>
        /// The editable expression
        /// </summary>
        public virtual string ExpressionText
        {
            get { return null; }
            set { }
        }

        /// <summary>
        /// Logs associated to this model element
        /// </summary>
        private List<ElementLog> messages = new List<ElementLog>();
        public List<ElementLog> Messages
        {
            get { return messages; }
            private set { messages = value; }
        }

        /// <summary>
        /// Adds a new element log attached to this model element
        /// </summary>
        /// <param name="log"></param>
        protected virtual void AddElementLog(ElementLog log)
        {
            bool add = true;

            if (log.Level == ElementLog.LevelEnum.Error)
            {
                if (!log.FailedExpectation)  // if this is a failed expectation, this is not a model error
                {
                    ErrorCount += 1;
                }
                // System.Diagnostics.Debugger.Break();
            }
            foreach (ElementLog other in Messages)
            {
                if (other.CompareTo(log) == 0)
                {
                    add = false;
                }
            }

            if (add)
            {
                Messages.Add(log);
            }
        }

        /// <summary>
        /// Adds an exception associated to this model element
        /// </summary>
        /// <param name="exception"></param>
        /// <returns></returns>
        public ElementLog AddException(Exception exception)
        {
            ElementLog retVal = new ElementLog(ElementLog.LevelEnum.Error, "Exception raised : " + exception.Message + "\n\n" + exception.StackTrace);
            AddElementLog(retVal);
            return retVal;
        }

        /// <summary>
        /// Adds an error associated to this model element
        /// </summary>
        /// <param name="message"></param>
        /// <returns></returns>
        public ElementLog AddError(string message)
        {
            ElementLog retVal = new ElementLog(ElementLog.LevelEnum.Error, message);
            if (message.Contains("Failed expectation"))
            {
                retVal.FailedExpectation = true;
            }
            AddElementLog(retVal);
            return retVal;
        }

        /// <summary>
        /// Adds a warning associated to this model element
        /// </summary>
        /// <param name="message"></param>
        /// <returns></returns>
        public ElementLog AddWarning(string message)
        {
            ElementLog retVal = new ElementLog(ElementLog.LevelEnum.Warning, message);
            AddElementLog(retVal);
            return retVal;
        }

        /// <summary>
        /// Adds an informative message associated to this model element
        /// </summary>
        /// <param name="message"></param>
        /// <returns></returns>
        public ElementLog AddInfo(string message)
        {
            ElementLog retVal = new ElementLog(ElementLog.LevelEnum.Info, message);
            AddElementLog(retVal);
            return retVal;
        }

        /// <summary>
        /// Removes a log associated to a model element
        /// </summary>
        /// <param name="log"></param>
        public void RemoveLog(ElementLog log)
        {
            if (log != null)
            {
                Messages.Remove(log);
            }
        }

        /// <summary>
        /// Indicates that at least one message of type levelEnum is attached to the element
        /// </summary>
        /// <param name="levelEnum"></param>
        /// <returns></returns>
        public bool HasMessage(ElementLog.LevelEnum levelEnum)
        {
            bool retVal = false;

            foreach (ElementLog log in Messages)
            {
                if (log.Level == levelEnum)
                {
                    retVal = true;
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public virtual void AddModelElement(IModelElement element)
        {
        }

        /// <summary>
        /// Counts the number of errors raised
        /// </summary>
        public static int ErrorCount = 0;
    }
}
