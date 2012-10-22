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
using System.Collections;
using System.Collections.Generic;
using System.Linq;


namespace DataDictionary.Tests.Translations
{
    public class Translation : Generated.Translation, ICommentable
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public Translation()
            : base()
        {
        }

        /// <summary>
        /// Provides the name of the translation
        /// </summary>
        public override string Name
        {
            get
            {
                string retVal = base.Name;

                if (Utils.Utils.isEmpty(retVal) && countSourceTexts() > 0)
                {
                    retVal = getSourceTexts(0).Name;
                }

                return retVal;
            }
            set
            {
                base.Name = value;
            }
        }

        public string Comment
        {
            get { return getComment(); }
            set { setComment(value); }
        }

        /// <summary>
        /// Provides the source texts for this dictionary
        /// </summary>
        public System.Collections.ArrayList SourceTexts
        {
            get
            {
                if (allSourceTexts() == null)
                {
                    setAllSourceTexts(new System.Collections.ArrayList());
                }
                return allSourceTexts();
            }
            set
            {
                setAllSourceTexts(value);
            }
        }

        /// <summary>
        /// Provides the sub-steps for this dictionary
        /// </summary>
        public System.Collections.ArrayList SubSteps
        {
            get
            {
                if (allSubSteps() == null)
                {
                    setAllSubSteps(new System.Collections.ArrayList());
                }
                return allSubSteps();
            }
            set
            {
                setAllSubSteps(value);
            }
        }

        /// <summary>
        /// The explanation of this translation, as RTF pseudo code
        /// </summary>
        /// <returns></returns>
        public string getExplain()
        {
            string retVal = "";

            string indent = "";

            if (SourceTexts.Count > 0)
            {
                if (SourceTexts.Count == 1)
                {
                    retVal = retVal + "Source text\n";
                }
                else
                {
                    retVal = retVal + "Source texts\n";
                }
                indent = "  ";
                foreach (DataDictionary.Tests.Translations.SourceText text in SourceTexts)
                {
                    retVal = retVal + indent + text.Name + "\n";
                }
                indent = "";
                if (SourceTexts.Count == 1)
                {
                    retVal = retVal + "Is translated as\n";
                }
                else
                {
                    retVal = retVal + "Are translated as\n";
                }
            }

            foreach (SubStep subStep in SubSteps)
            {
                retVal = retVal + subStep.getExplain();
            }

            return retVal;
        }

        /// <summary>
        /// The enclosing translation dictionary
        /// </summary>
        public Tests.Translations.TranslationDictionary TranslationDictionary
        {
            get { return Enclosing as Tests.Translations.TranslationDictionary; }
        }

        /// <summary>
        /// Provides the enclosing collection
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                System.Collections.ArrayList retVal = null;
                Tests.Translations.TranslationDictionary dictionary = Enclosing as Tests.Translations.TranslationDictionary;
                if (dictionary != null)
                {
                    retVal = dictionary.Translations;
                }
                else
                {
                    Tests.Translations.Folder folder = Enclosing as Tests.Translations.Folder;
                    if (folder != null)
                    {
                        retVal = folder.Translations;
                    }
                }
                return retVal;
            }
        }


        /// <summary>
        /// Updates the step according to this translation
        /// </summary>
        /// <param name="step"></param>
        public void UpdateStep(Step step)
        {
            int subStepCounter = 1;
            foreach (SubStep subStep in SubSteps)
            {
                SubStep newSubStep = (SubStep)Generated.acceptor.getFactory().createSubStep();
                newSubStep.Name = "Sub-step" + subStepCounter;
                step.appendSubSteps(newSubStep);

                foreach (Rules.Action action in subStep.Actions)
                {
                    Rules.Action newAct = (Rules.Action)Generated.acceptor.getFactory().createAction();
                    action.copyTo(newAct);
                    newSubStep.appendActions(newAct);
                    Review(newAct);
                }

                foreach (Expectation expectation in subStep.Expectations)
                {
                    Expectation newExp = (Expectation)Generated.acceptor.getFactory().createExpectation();
                    expectation.copyTo(newExp);
                    newSubStep.appendExpectations(newExp);
                    Review(newExp);
                }

                subStepCounter++;
            }
        }

        /// <summary>
        /// Review the expressions associated to this expectation
        /// </summary>
        /// <param name="expectation"></param>
        private void Review(Expectation expectation)
        {
            expectation.Value = ReviewExpression(expectation.Step, expectation.Value);
        }

        /// <summary>
        /// Review the expressions associated to this action
        /// </summary>
        /// <param name="action"></param>
        private void Review(Rules.Action action)
        {
            action.Expression = ReviewExpression(action.Step, action.Expression);
        }

        /// <summary>
        /// Updates an expression according to translation rules
        /// </summary>
        /// <param name="step">the step in which the expression occurs</param>
        /// <param name="expression"></param>
        /// <returns>the updated string</returns>
        private string ReviewExpression(Step step, string expression)
        {
            string retVal = expression;

            if (expression.IndexOf('%') >= 0)
            {
                SubSequence subSequence = step.TestCase.SubSequence;

                retVal = retVal.Replace("%D_LRBG", format_decimal_as_str(subSequence.getD_LRBG()));
                retVal = retVal.Replace("%Level", format_level(subSequence.getLevel()));
                retVal = retVal.Replace("%Mode", format_mode(subSequence.getMode()));
                retVal = retVal.Replace("%NID_LRBG", format_decimal_as_str(subSequence.getNID_LRBG()));
                retVal = retVal.Replace("%Q_DIRLRBG", format_decimal_as_str(subSequence.getQ_DIRLRBG()));
                retVal = retVal.Replace("%Q_DIRTRAIN", format_decimal_as_str(subSequence.getQ_DIRTRAIN()));
                retVal = retVal.Replace("%Q_DLRBG", format_decimal_as_str(subSequence.getQ_DLRBG()));
                retVal = retVal.Replace("%RBC_ID", format_decimal_as_str(subSequence.getRBC_ID()));
                retVal = retVal.Replace("%RBCPhone", format_str(subSequence.getRBCPhone()));

                retVal = retVal.Replace("%Step_Distance", step.getDistance() + "");
                retVal = retVal.Replace("%Step_LevelIN", format_level(step.getLevelIN()));
                retVal = retVal.Replace("%Step_LevelOUT", format_level(step.getLevelOUT()));
                retVal = retVal.Replace("%Step_ModeIN", format_mode(step.getModeOUT()));
                retVal = retVal.Replace("%Step_ModeOUT", format_mode(step.getModeOUT()));
                for (int i = 0; i < step.StepMessages.Count; i++)
                {
                    DBElements.DBMessage message = step.StepMessages[i] as DBElements.DBMessage;
                    if (message != null)
                    {
                        retVal = retVal.Replace("%Step_Messages_" + i, format_message(message));
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Takes the string provided and returns the corresponding Mode enum
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        private string format_mode(string str)
        {
            string retVal = "";

            str = format_str(str);
            int val = format_decimal(str);
            if (val != -1)
            {
                switch (val)
                {
                    case 6:
                        retVal = "Mode.SB";
                        break;
                    default:
                        retVal = "Mode.Unknown";
                        break;
                }
            }
            else
            {
                retVal = "Mode." + str;
            }

            return retVal;
        }

        /// <summary>
        /// Takes the enum provided and returns the corresponding Mode enum
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        private string format_mode(Generated.acceptor.ST_MODE mode)
        {
            string retVal = "";

            switch (mode)
            {
                case Generated.acceptor.ST_MODE.aFS:
                    retVal = "Mode.FS";
                    break;
                case Generated.acceptor.ST_MODE.aIS:
                    retVal = "Mode.IS";
                    break;
                case Generated.acceptor.ST_MODE.aLS:
                    retVal = "Mode.LS";
                    break;
                case Generated.acceptor.ST_MODE.aNA:
                    retVal = "Mode.NA";
                    break;
                case Generated.acceptor.ST_MODE.aNL:
                    retVal = "Mode.NL";
                    break;
                case Generated.acceptor.ST_MODE.aNP:
                    retVal = "Mode.NP";
                    break;
                case Generated.acceptor.ST_MODE.aOS:
                    retVal = "Mode.OS";
                    break;
                case Generated.acceptor.ST_MODE.aPSH:
                    retVal = "Mode.PSH";
                    break;
                case Generated.acceptor.ST_MODE.aPT:
                    retVal = "Mode.PT";
                    break;
                case Generated.acceptor.ST_MODE.aRE:
                    retVal = "Mode.RE";
                    break;
                case Generated.acceptor.ST_MODE.aSB:
                    retVal = "Mode.SB";
                    break;
                case Generated.acceptor.ST_MODE.aSF:
                    retVal = "Mode.SF";
                    break;
                case Generated.acceptor.ST_MODE.aSH:
                    retVal = "Mode.SH";
                    break;
                case Generated.acceptor.ST_MODE.aSL:
                    retVal = "Mode.SL";
                    break;
                case Generated.acceptor.ST_MODE.aSN:
                    retVal = "Mode.SN";
                    break;
                case Generated.acceptor.ST_MODE.aSR:
                    retVal = "Mode.SR";
                    break;
                case Generated.acceptor.ST_MODE.aTR:
                    retVal = "Mode.TR";
                    break;
                case Generated.acceptor.ST_MODE.aUF:
                    retVal = "Mode.UF";
                    break;
                default:
                    retVal = "Mode.Unknown";
                    break;
            }

            return retVal;
        }

        /// <summary>
        /// Takes the message provided and returns the corresponding message value
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        private string format_message(DBElements.DBMessage message)
        {
            string retVal = "";
            switch (message.MessageType)
            {
                case Generated.acceptor.DBMessageType.aEUROBALISE:
                    retVal = format_eurobalise_message(message);
                    break;
                case Generated.acceptor.DBMessageType.aEUROLOOP:
                    retVal = format_euroloop_message(message);
                    break;
                case Generated.acceptor.DBMessageType.aEURORADIO:
                    retVal = format_euroradio_message(message);
                    break;
            }
            return retVal;
        }


        private string format_eurobalise_message(DBElements.DBMessage message)
        {
            DataDictionary.Types.NameSpace nameSpace = OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Messages");
            Types.Structure structureType = (Types.Structure)EFSSystem.findType(nameSpace, "Messages.EUROBALISE.Message");
            Values.StructureValue structure = new Values.StructureValue(structureType);

            int index = 0;
            FillStructure(nameSpace, message.Fields, ref index, structure); // fills the message fields


            // then we fill the packets
            KeyValuePair<string, Variables.IVariable> subSequencePair = structure.SubVariables.ElementAt(structure.SubVariables.Count - 1);
            Variables.IVariable subSequenceVariable = subSequencePair.Value;

            Types.Collection collectionType = (Types.Collection)EFSSystem.findType(nameSpace, "Messages.EUROBALISE.Collection1");
            Values.ListValue collection = new Values.ListValue(collectionType, new List<Values.IValue>());

            Types.Structure subStructure1Type = (Types.Structure)EFSSystem.findType(nameSpace, "Messages.EUROBALISE.SubStructure1");
            Values.StructureValue subStructure1 = new Values.StructureValue(subStructure1Type);

            Types.Structure packetStructure = (Types.Structure)EFSSystem.findType(nameSpace, "Messages.PACKET.TRACK_TO_TRAIN.Message");
            Values.StructureValue packetValue = new Values.StructureValue(packetStructure);

            // will contain the list of all packets of the message and then be added to the structure packetValue
            ArrayList subStructures = new ArrayList();

            foreach (DBElements.DBPacket packet in message.Packets)
            {
                Tests.DBElements.DBField nidPacketField = packet.Fields[0] as Tests.DBElements.DBField;

                if (nidPacketField.Value != 255)  // 255 means "end of information"
                {
                    Values.StructureValue subStructure = FindStructure(nidPacketField.Value);

                    index = 0;
                    FillStructure(nameSpace, packet.Fields, ref index, subStructure);

                    subStructures.Add(subStructure);
                }
            }

            // the collection of the message packets is copied to the structure packetValue
            int i = 0;
            foreach (KeyValuePair<string, Variables.IVariable> pair in packetValue.SubVariables)
            {
                if (i == subStructures.Count)
                {
                    break;
                }
                string variableName = pair.Key;
                Values.StructureValue structureValue = subStructures[i] as Values.StructureValue;
                if (structureValue.Structure.FullName.Contains(variableName))
                {
                    Variables.IVariable variable = pair.Value;
                    variable.Value = structureValue;
                    i++;
                }
            }

            subStructure1.SubVariables.ElementAt(0).Value.Value = packetValue;
            collection.Val.Add(subStructure1);
            subSequenceVariable.Value = collection;

            return structure.Name;
        }


        /// <summary>
        /// Finds the type of the structure corresponding to the provided NID_PACKET
        /// </summary>
        /// <param name="nameSpace">The namespace where the type has to be found</param>
        /// <param name="nidPacket">The id of the packet</param>
        /// <returns></returns>
        private Values.StructureValue FindStructure(int nidPacket)
        {
            Types.Structure structure = null;
            DataDictionary.Types.NameSpace nameSpace;

            if (nidPacket != 44)
            {
                nameSpace = OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Messages.PACKET.TRACK_TO_TRAIN");
                foreach (DataDictionary.Types.NameSpace subNameSpace in nameSpace.SubNameSpaces)
                {
                    Types.Structure structureType = (Types.Structure)EFSSystem.findType(subNameSpace, subNameSpace.FullName + ".Message");
                    Values.StructureValue structureValue = new Values.StructureValue(structureType);

                    foreach (KeyValuePair<string, Variables.IVariable> pair in structureValue.SubVariables)
                    {
                        string variableName = pair.Key;
                        if (variableName.Equals("NID_PACKET"))
                        {
                            Values.IntValue value = pair.Value.Value as Values.IntValue;
                            if (value.Val == nidPacket)
                            {
                                structure = structureType;
                            }
                        }
                        if (structure != null)
                        {
                            break;
                        }
                    }
                }
            }
            else
            {
                nameSpace = OverallNameSpaceFinder.INSTANCE.findByName(EFSSystem.Dictionaries[0], "Messages.PACKET.DATA_USED_BY_APPLICATIONS_OUTSIDE_THE_ERTMS_ETCS_SYSTEM");
                structure = (Types.Structure)EFSSystem.findType(nameSpace, nameSpace.FullName + ".Message");
            }

            Values.StructureValue retVal = null;
            if (structure != null)
            {
                retVal = new Values.StructureValue(structure);
            }

            return retVal;
        }


        /// <summary>
        /// Fills the given structure with the values provided from the database
        /// </summary>
        /// <param name="aNameSpace">Namespace of the structure</param>
        /// <param name="fields">Fields to be copied into the structure</param>
        /// <param name="index">Index (of fields list) from which we have to start copying</param>
        /// <param name="aStructure">The structure to be filled</param>
        private void FillStructure(Types.NameSpace aNameSpace, ArrayList fields, ref int index, Values.StructureValue aStructure)
        {
            int j = 0;
            for (int i = index; i < fields.Count; i++)
            {
                Tests.DBElements.DBField field = fields[i] as Tests.DBElements.DBField;

                KeyValuePair<string, Variables.IVariable> pair = aStructure.SubVariables.ElementAt(j);
                Variables.IVariable variable = pair.Value;

                if (variable.Name.StartsWith(field.Variable))  // we use StartsWith and not Equals because we can have N_ITER_1 and N_ITER
                {
                    if (variable.Type is Types.Enum)
                    {
                        Types.Enum type = variable.Type as Types.Enum;
                        foreach (DataDictionary.Constants.EnumValue enumValue in type.Values)
                        {
                            int value = Int32.Parse(enumValue.getValue());
                            if (value == field.Value)
                            {
                                variable.Value = enumValue;
                                j++;
                                break;
                            }
                        }
                    }
                    else if (variable.Type is Types.Range)
                    {
                        Types.Range type = variable.Type as Types.Range;
                        variable.Value = new Values.IntValue(type, (decimal)field.Value);
                        j++;
                    }
                    else
                    {
                        throw new Exception("Unhandled variable type");
                    }
                    if (field.Variable.Equals("N_ITER")) // we have to create a sequence
                    {
                        KeyValuePair<string, Variables.IVariable> sequencePair = aStructure.SubVariables.ElementAt(j);
                        Variables.IVariable sequenceVariable = sequencePair.Value;
                        Types.Collection collectionType = (Types.Collection)EFSSystem.findType(aNameSpace, sequenceVariable.TypeName);
                        Values.ListValue sequence = new Values.ListValue(collectionType, new List<Values.IValue>());

                        for (int k = 0; k < field.Value; k++)
                        {
                            Types.Structure structureType = (Types.Structure)EFSSystem.findType(aNameSpace, sequence.CollectionType.Type.FullName);
                            Values.StructureValue structureValue = new Values.StructureValue(structureType);
                            FillStructure(aNameSpace, fields, ref index, structureValue);
                            sequence.Val.Add(structureValue);
                        }
                        sequenceVariable.Value = sequence;
                        j++;
                    }
                }

                // if all the fields of the structue are filled, we terminated
                if (j == aStructure.SubVariables.Count)
                {
                    index = i;
                    break;
                }
            }
        }


        private string format_euroloop_message(DBElements.DBMessage message)
        {
            string retVal = "";
            return retVal;
        }


        private string format_euroradio_message(DBElements.DBMessage message)
        {
            string retVal = "";
            return retVal;
        }


        /// <summary>
        /// Takes the string provided and returns the corresponding Level enum
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        private string format_level(string str)
        {
            string retVal = "";

            switch (format_decimal(str))
            {
                case 0:
                    retVal = "Level.L0";
                    break;
                case 1:
                    retVal = "Level.L1";
                    break;
                case 2:
                    retVal = "Level.LSTR";
                    break;
                case 3:
                    retVal = "Level.L2";
                    break;
                case 4:
                    retVal = "Level.L3";
                    break;
                default:
                    retVal = "Level." + str;
                    break;
            }

            return retVal;
        }

        /// <summary>
        /// Takes the string provided and returns the corresponding Level enum
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        private string format_level(Generated.acceptor.ST_LEVEL level)
        {
            string retVal = "";

            switch (level)
            {
                case Generated.acceptor.ST_LEVEL.aL0:
                    retVal = "Level.L0";
                    break;
                case Generated.acceptor.ST_LEVEL.aL1:
                    retVal = "Level.L1";
                    break;
                case Generated.acceptor.ST_LEVEL.aLSTM:
                    retVal = "Level.LSTR";
                    break;
                case Generated.acceptor.ST_LEVEL.aL2:
                    retVal = "Level.L2";
                    break;
                case Generated.acceptor.ST_LEVEL.aL3:
                    retVal = "Level.L3";
                    break;
                default:
                    retVal = "Level.Unknown";
                    break;
            }

            return retVal;
        }

        /// <summary>
        /// Takes the string provided and returns the formatted string
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        public static string format_str(string str)
        {
            if (str == null)
            {
                str = "";
            }

            int i, j = 0;

            i = str.IndexOf("(");
            if (i >= 0)
            {
                j = str.IndexOf(")", i);
            }

            while (i >= 0 && j >= 0)
            {
                str = str.Substring(0, i) + str.Substring(j + 1);

                i = str.IndexOf("(");
                if (i >= 0)
                {
                    j = str.IndexOf(")", i);
                }
            }

            return str.Trim();
        }

        /// <summary>
        /// Takes the string provided and returns the corresponding decimal value
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        public static int format_decimal(string str)
        {
            int retVal = -1;

            str = format_str(str);
            if (str.EndsWith("d"))
            {
                str = str.Substring(0, str.Length - 1).Trim();
                try
                {
                    retVal = int.Parse(str);
                }
                catch (FormatException)
                {
                }
            }
            else if (str.EndsWith("b"))
            {
                str = str.Substring(0, str.Length - 1).Trim();
                char[] tmp = str.ToCharArray();
                retVal = 0;
                for (int i = 0; i < tmp.Length; i++)
                {
                    if (tmp[i] == '0')
                    {
                        retVal = retVal * 2;
                    }
                    else if (tmp[i] == '1')
                    {
                        retVal = retVal * 2 + 1;
                    }
                }
            }
            else
            {
                try
                {
                    retVal = int.Parse(str);
                }
                catch (FormatException)
                {
                }
            }

            return retVal;
        }

        /// <summary>
        /// Takes the string provided and returns the corresponding decimal value, as a string
        /// </summary>
        /// <param name="str"></param>
        /// <returns></returns>
        public static string format_decimal_as_str(string str)
        {
            return "" + format_decimal(str);
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            SubStep subStep = element as SubStep;
            if (subStep != null)
            {
                appendSubSteps(subStep);
            }
        }

    }
}
