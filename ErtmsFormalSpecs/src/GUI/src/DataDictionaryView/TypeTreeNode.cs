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

namespace GUI.DataDictionaryView
{
    public abstract class TypeTreeNode<T> : ReqRelatedTreeNode<T>
        where T : DataDictionary.Types.Type
    {
        /// <summary>
        /// The editor for message variables
        /// </summary>
        protected class TypeEditor : ReqRelatedEditor
        {
            /// <summary>
            /// Constructor
            /// </summary>
            public TypeEditor()
                : base()
            {
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="name"></param>
        /// <param name="item"></param>
        protected TypeTreeNode(T item, string name = null, bool isFolder = false)
            : base(item, name, isFolder)
        {
        }
    }
}
