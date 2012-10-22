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
using System.Data;
using System.Data.OleDb;

namespace Importers
{
    public class TestImporter
    {
        /// <summary>
        /// The Logger
        /// </summary>
        protected static readonly log4net.ILog Log = log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod().DeclaringType);

        /// <summary>
        /// The path to the access database
        /// </summary>
        private string filePath;
        public string FilePath
        {
            get { return filePath; }
            private set
            {
                filePath = value.Replace("\\", "/");
            }
        }

        /// <summary>
        /// The password used to access the database, if any
        /// </summary>
        private string password;
        public string Password
        {
            get { return password; }
            private set { password = value; }
        }

        /// <summary>
        /// The connection to the database
        /// </summary>
        private OleDbConnection connection;
        public OleDbConnection Connection
        {
            get
            {
                if (connection == null)
                {
                    connection = new OleDbConnection();
                    connection.ConnectionString = "PROVIDER=Microsoft.Jet.OLEDB.4.0; Data Source=" + FilePath + ";Jet OLEDB:Database Password=" + Password + ";";
                    connection.Open();
                }
                return connection;
            }
            private set
            {
                if (connection != null)
                {
                    connection.Close();
                    connection.Dispose();
                }
                connection = value;
            }
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="filePath">The path to the file to import</param>
        /// <param name="password">The password used to access the database</param>
        public TestImporter(string filePath, string password)
        {
            FilePath = filePath;
            Password = password;
        }

        /// <summary>
        /// Imports the database into the corresponding frame by creating a new subsequence
        /// </summary>
        /// <param name="frame"></param>
        public void Import(DataDictionary.Tests.Frame frame)
        {
            try
            {
                importSubSequence(frame);
            }
            finally
            {
                Connection = null;
            }
        }

        /// <summary>
        /// Imports the subsequence stored in the database
        /// </summary>
        /// <param name="frame"></param>
        private void importSubSequence(DataDictionary.Tests.Frame frame)
        {
            string sql = "SELECT TestSequenceID, TestSequenceName FROM TSW_TestSequence";

            OleDbDataAdapter adapter = new OleDbDataAdapter(sql, Connection);
            DataSet dataSet = new DataSet();

            adapter.Fill(dataSet);

            if (dataSet.Tables.Count > 0)
            {
                foreach (DataRow dataRow in dataSet.Tables[0].Rows)
                {
                    int subSequenceID = (int)dataRow.ItemArray.GetValue(0);
                    string subSequenceName = (string)dataRow.ItemArray.GetValue(1);

                    DataDictionary.Tests.SubSequence newSubSequence = (DataDictionary.Tests.SubSequence)DataDictionary.Generated.acceptor.getFactory().createSubSequence();
                    newSubSequence.Name = subSequenceName;
                    importInitialValues(newSubSequence, subSequenceID);
                    importSteps(newSubSequence);

                    DataDictionary.Tests.SubSequence oldSubSequence = frame.findSubSequence(subSequenceName);
                    if (oldSubSequence != null)
                    {
                        int cnt = 0;
                        foreach (DataDictionary.Tests.TestCase oldTestCase in oldSubSequence.TestCases)
                        {
                            if (cnt < newSubSequence.TestCases.Count)
                            {
                                DataDictionary.Tests.TestCase newTestCase = newSubSequence.TestCases[cnt] as DataDictionary.Tests.TestCase;
                                if (newTestCase != null)
                                {
                                    if (oldTestCase.Name.Equals(newTestCase.Name))
                                    {
                                        newTestCase.Merge(oldTestCase);
                                    }
                                    else
                                    {
                                        throw new Exception(newTestCase.FullName + " is found instead of " + oldTestCase.FullName + " while importing sub-sequence " + newSubSequence.FullName);
                                    }
                                }
                            }
                            else
                            {
                                throw new Exception("The test case " + oldTestCase.FullName + " is not present in the new data base");
                            }
                            cnt++;
                        }

                        oldSubSequence.Delete();
                    }

                    frame.appendSubSequences(newSubSequence);
                }
            }
            else
            {
                Log.Error("Cannot find table TSW_TestSequence in database");
            }
        }

        /// <summary>
        /// Imports the subsequence stored in the database
        /// </summary>
        /// <param name="frame"></param>
        private void importInitialValues(DataDictionary.Tests.SubSequence subSequence, int subSequenceID)
        {
            // Level is a reserved word...
            string sql = "SELECT D_LRBG, TSW_TestSeqSCItl.Level, Mode, NID_LRBG, Q_DIRLRBG, Q_DIRTRAIN, Q_DLRBG, RBC_ID, RBCPhone FROM TSW_TestSeqSCItl WHERE TestSequenceID = " + subSequenceID;

            OleDbDataAdapter adapter = new OleDbDataAdapter(sql, Connection);
            DataSet dataSet = new DataSet();

            adapter.Fill(dataSet);
            if (dataSet.Tables.Count > 0)
            {
                foreach (DataRow dataRow in dataSet.Tables[0].Rows)
                {
                    int i = 0;
                    string D_LRBG = dataRow.ItemArray.GetValue(i++) as string;
                    string Level = dataRow.ItemArray.GetValue(i++) as string;
                    string Mode = dataRow.ItemArray.GetValue(i++) as string;
                    string NID_LRBG = dataRow.ItemArray.GetValue(i++) as string;
                    string Q_DIRLRBG = dataRow.ItemArray.GetValue(i++) as string;
                    string Q_DIRTRAIN = dataRow.ItemArray.GetValue(i++) as string;
                    string Q_DLRBG = dataRow.ItemArray.GetValue(i++) as string;
                    string RBC_ID = dataRow.ItemArray.GetValue(i++) as string;
                    string RBCPhone = dataRow.ItemArray.GetValue(i++) as string;

                    subSequence.setD_LRBG(D_LRBG);
                    subSequence.setLevel(Level);
                    subSequence.setMode(Mode);
                    subSequence.setNID_LRBG(NID_LRBG);
                    subSequence.setQ_DIRLRBG(Q_DIRLRBG);
                    subSequence.setQ_DIRTRAIN(Q_DIRTRAIN);
                    subSequence.setQ_DLRBG(Q_DLRBG);
                    subSequence.setRBC_ID(RBC_ID);
                    subSequence.setRBCPhone(RBCPhone);

                    DataDictionary.Tests.TestCase testCase = (DataDictionary.Tests.TestCase)DataDictionary.Generated.acceptor.getFactory().createTestCase();
                    testCase.Name = "Setup";
                    subSequence.appendTestCases(testCase);

                    DataDictionary.Tests.Step initializeTrainDataStep = (DataDictionary.Tests.Step)DataDictionary.Generated.acceptor.getFactory().createStep(); ;
                    initializeTrainDataStep.setTCS_Order(0);
                    initializeTrainDataStep.setDistance(0);
                    initializeTrainDataStep.setDescription("Initialize train data");
                    initializeTrainDataStep.setTranslationRequired(true);
                    testCase.appendSteps(initializeTrainDataStep);

                    DataDictionary.Tests.Step setupStep = (DataDictionary.Tests.Step)DataDictionary.Generated.acceptor.getFactory().createStep(); ;
                    setupStep.setTCS_Order(0);
                    setupStep.setDistance(0);
                    setupStep.setDescription("Setup test sequence");
                    setupStep.setTranslationRequired(true);
                    testCase.appendSteps(setupStep);

                    DataDictionary.Tests.Step manualSetupStep = (DataDictionary.Tests.Step)DataDictionary.Generated.acceptor.getFactory().createStep(); ;
                    manualSetupStep.setTCS_Order(0);
                    manualSetupStep.setDistance(0);
                    manualSetupStep.setDescription("Manual setup test sequence");
                    manualSetupStep.setTranslationRequired(true);
                    testCase.appendSteps(manualSetupStep);
                }
            }
            else
            {
                Log.Error("Cannot find entry in table TSW_TestSeqSCItl WHERE TestSequenceID = " + subSequenceID);
            }
        }

        /// <summary>
        /// Imports the steps in a sub sequence
        /// </summary>
        /// <param name="subSequence"></param>
        private void importSteps(DataDictionary.Tests.SubSequence subSequence)
        {
            string sql = "SELECT TCSOrder, Distance, FT_NUMBER, TC_NUMBER, ST_STEP, ST_DESCRIPTION, UserComment, ST_IO, ST_INTERFACE, ST_COMMENTS, TestLevelIn, TestLevelOut, TestModeIn, TestModeOut FROM TSW_TCStep ORDER BY TCSOrder";

            OleDbDataAdapter adapter = new OleDbDataAdapter(sql, Connection);
            DataSet dataSet = new DataSet();

            adapter.Fill(dataSet);
            if (dataSet.Tables.Count > 0)
            {
                DataDictionary.Tests.TestCase testCase = null;

                foreach (DataRow dataRow in dataSet.Tables[0].Rows)
                {
                    object[] items = dataRow.ItemArray;
                    int order = (int)items[0];
                    int distance = (int)items[1];
                    int feature = (int)items[2];
                    int testCaseNr = (int)items[3];
                    string stepType = items[4] as string;
                    string description = items[5] as string;
                    string userComment = items[6] as string;
                    string io = items[7] as string;
                    string intrface = items[8] as string;
                    string comment = items[9] as string;
                    string testLevelIn = items[10] as string;
                    string testLevelOut = items[11] as string;
                    string testModeIn = items[12] as string;
                    string testModeOut = items[13] as string;

                    // we do not want to import steps "Followed by" or "Preceded by"
                    if (io != null && stepType != null && !stepType.Equals("Followed by") && !stepType.Equals("Preceded by"))
                    {
                        if (testCase != null)
                        {
                            if (testCase.getFeature() != feature || testCase.getCase() != testCaseNr)
                            {
                                testCase = null;
                            }
                        }

                        if (testCase == null)
                        {
                            testCase = (DataDictionary.Tests.TestCase)DataDictionary.Generated.acceptor.getFactory().createTestCase();
                            testCase.Name = "Feature " + feature + " Test case " + testCaseNr;
                            testCase.setCase(testCaseNr);
                            testCase.setFeature(feature);
                            subSequence.appendTestCases(testCase);
                        }

                        DataDictionary.Tests.Step step = (DataDictionary.Tests.Step)DataDictionary.Generated.acceptor.getFactory().createStep();
                        step.Name = "Step " + order;
                        step.setTCS_Order(order);
                        step.setDistance(distance);
                        step.setDescription(description);
                        step.setUserComment(userComment);
                        step.setIO_AsString(io);
                        if (intrface != null)
                        {
                            step.setInterface_AsString(intrface);
                        }
                        step.setComment(comment);
                        if (testLevelIn != null)
                        {
                            step.setLevelIN_AsString(testLevelIn);
                        }
                        if (testLevelOut != null)
                        {
                            step.setLevelOUT_AsString(testLevelOut);
                        }
                        if (testModeIn != null)
                        {
                            step.setModeIN_AsString(testModeIn);
                        }
                        if (testModeOut != null)
                        {
                            step.setModeOUT_AsString(testModeOut);
                        }
                        step.setTranslationRequired(true);

                        importStepMessages(step);

                        testCase.appendSteps(step);
                    }
                }
            }
            else
            {
                Log.Error("Cannot find sub sequence table in database");
            }

        }


        /// <summary>
        /// Imports all the messages used by this step
        /// </summary>
        /// <param name="aStep"></param>
        private void importStepMessages(DataDictionary.Tests.Step aStep)
        {
            string sql = "SELECT TCSOrder, MessageOrder, MessageType, Var_Name, Var_Value FROM TSW_MessageHeader ORDER BY MessageOrder, Var_Row";

            OleDbDataAdapter adapter = new OleDbDataAdapter(sql, Connection);
            DataSet dataSet = new DataSet();

            adapter.Fill(dataSet);
            if (dataSet.Tables.Count > 0)
            {
                int messageNumber = 0;
                DataDictionary.Tests.DBElements.DBMessage message = null;
                int order = -1;
                foreach (DataRow dataRow in dataSet.Tables[0].Rows)
                {
                    object[] items = dataRow.ItemArray;
                    order = (int)items[0];
                    if (order == aStep.getTCS_Order())
                    {
                        short messageOrder = (short)items[1];
                        if (messageNumber != messageOrder)  // we create a new Message
                        {
                            if (messageNumber != 0)
                            {
                                aStep.AddMessage(message);
                                importPackets(message, order);
                            }
                            short messageTypeNumber = (short)items[2];
                            DataDictionary.Generated.acceptor.DBMessageType messageType = DataDictionary.Generated.acceptor.DBMessageType.defaultDBMessageType;
                            switch (messageTypeNumber)
                            {
                                case 0:
                                    messageType = DataDictionary.Generated.acceptor.DBMessageType.aEUROBALISE;
                                    break;
                                case 1:
                                    messageType = DataDictionary.Generated.acceptor.DBMessageType.aEUROLOOP;
                                    break;
                                case 2:
                                    messageType = DataDictionary.Generated.acceptor.DBMessageType.aEURORADIO;
                                    break;
                            }
                            message = (DataDictionary.Tests.DBElements.DBMessage)DataDictionary.Generated.acceptor.getFactory().createDBMessage();
                            message.MessageOrder = messageOrder;
                            message.MessageType = messageType;
                            messageNumber = messageOrder;
                        }
                        DataDictionary.Tests.DBElements.DBField field = (DataDictionary.Tests.DBElements.DBField)DataDictionary.Generated.acceptor.getFactory().createDBField();
                        string variable = items[3] as string;
                        if (variable != null)
                        {
                            field.Variable = variable;
                        }
                        string value = items[4] as string;
                        if (value != null)
                        {
                            field.Value = DataDictionary.Tests.Translations.Translation.format_decimal(value);
                        }
                        message.AddField(field);
                    }
                }
                if (message != null)
                {
                    aStep.AddMessage(message);
                    importPackets(message, aStep.getTCS_Order());
                }
            }
        }


        /// <summary>
        /// Impports all the packets for a given message
        /// </summary>
        /// <param name="aMessage"></param>
        private void importPackets(DataDictionary.Tests.DBElements.DBMessage aMessage, int TCS_order)
        {
            string sql = "SELECT TCSOrder, MessageOrder, Pac_ID, Var_Name, Var_Value FROM TSW_MessageBody ORDER BY MessageOrder, Var_Row";

            OleDbDataAdapter adapter = new OleDbDataAdapter(sql, Connection);
            DataSet dataSet = new DataSet();

            adapter.Fill(dataSet);

            int packetNumber = 0;
            DataDictionary.Tests.DBElements.DBPacket packet = (DataDictionary.Tests.DBElements.DBPacket)DataDictionary.Generated.acceptor.getFactory().createDBPacket();
            if (dataSet.Tables.Count > 0)
            {
                foreach (DataRow dataRow in dataSet.Tables[0].Rows)
                {
                    object[] items = dataRow.ItemArray;
                    int order = (int)items[0];
                    short messageOrder = (short)items[1];
                    if (order == TCS_order && messageOrder == aMessage.MessageOrder)
                    {
                        short pacId = (short)items[2];
                        if (packetNumber != pacId)
                        {
                            if (packetNumber != 0)
                            {
                                aMessage.AddPacket(packet);
                            }
                            packet = (DataDictionary.Tests.DBElements.DBPacket)DataDictionary.Generated.acceptor.getFactory().createDBPacket();
                            packetNumber = pacId;
                        }
                        DataDictionary.Tests.DBElements.DBField field = (DataDictionary.Tests.DBElements.DBField)DataDictionary.Generated.acceptor.getFactory().createDBField();
                        string variable = items[3] as string;
                        if (variable != null)
                        {
                            field.Variable = variable;
                        }
                        string value = items[4] as string;
                        if (value != null)
                        {
                            field.Value = DataDictionary.Tests.Translations.Translation.format_decimal(value);
                        }
                        packet.AddField(field);
                    }
                }
                if (packet != null)
                {
                    aMessage.AddPacket(packet);
                }
            }
        }
    }
}
