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
using System.Collections;

namespace DataDictionary.Tests.DBElements
{
    public class DBMessage : Generated.DBMessage
    {
        /// <summary>
        /// Order of the message
        /// </summary>
        public int MessageOrder
        {
            get
            {
                return getMessageOrder();
            }
            set
            {
                setMessageOrder(value);
            }
        }

        /// <summary>
        /// Order of the message
        /// </summary>
        public Generated.acceptor.DBMessageType MessageType
        {
            get
            {
                return getMessageType();
            }
            set
            {
                setMessageType(value);
            }
        }

        /// <summary>
        /// Fields of the message
        /// </summary>
        public ArrayList Fields
        {
            get
            {
                return allFields();
            }
        }

        /// <summary>
        /// Packets of the message
        /// </summary>
        public ArrayList Packets
        {
            get
            {
                return allPackets();
            }
        }

        /// <summary>
        /// Adds a new field to message fields
        /// </summary>
        /// <param name="aField">A new field</param>
        public void AddField(DBField aField)
        {
            allFields().Add(aField);
        }

        /// <summary>
        /// Adds a new packet to message packets
        /// </summary>
        /// <param name="aField">A new packet</param>
        public void AddPacket(DBPacket aPacket)
        {
            allPackets().Add(aPacket);
        }
    }
}
