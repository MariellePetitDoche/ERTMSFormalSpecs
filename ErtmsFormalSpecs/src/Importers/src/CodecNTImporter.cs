using System;
using System.Collections.Generic;

using ErtmsSolutions.CodecNT;

namespace Importers
{
    public class CodecNTImporter
    {
        /// <summary>
        /// The file name which holds the codecNT definition
        /// </summary>
        public string FileName { get; private set; }

        /// <summary>
        /// The message definitions stored in the codecNT file
        /// </summary>
        private MessageDefinitions messageDefinitions;
        public MessageDefinitions MessageDefinitions
        {
            get
            {
                if (messageDefinitions == null)
                {
                    messageDefinitions = MessageDefinitions.Load(FileName, new LoaderContext(null));
                }

                return messageDefinitions;
            }
        }

        /// <summary>
        /// Constructor.
        /// Creates an importer for CodecNT for the file referenced by the file name
        /// </summary>
        /// <param name="fileName"></param>
        public CodecNTImporter(string fileName)
        {
            FileName = fileName;
        }

        /// <summary>
        /// Import the file in the corresponding nameSpace
        /// </summary>
        /// <param name="nameSpace"></param>
        public void Import(DataDictionary.Types.NameSpace nameSpace)
        {
            foreach (KeyValuePair<string, ErtmsSolutions.CodecNT.Type> pair in MessageDefinitions.types)
            {
                AppendType(nameSpace, pair.Key, pair.Value);
            }

            foreach (KeyValuePair<string, ErtmsSolutions.CodecNT.FieldGroup> pair in MessageDefinitions.field_groups)
            {
                AppendFieldGroup(nameSpace, pair.Key, pair.Value);
            }

            /* Do not append the Get function */
            if (false)
            {
                DataDictionary.Types.NameSpace packet = GetNameSpaceBasedOnName(nameSpace, "PACKET");
                DataDictionary.Types.NameSpace packet_track_to_train = GetNameSpaceBasedOnName(packet, "TRACK_TO_TRAIN");
                foreach (DataDictionary.Types.Structure structure in packet_track_to_train.Structures)
                {
                    AppendGetFunction(packet_track_to_train, structure, "NID_PACKET", "BaseTypes.IdentityNumber");
                }
            }
        }

        /// <summary>
        /// Provides 2^exp.
        /// (Computed trivially, but perf is not the issue)
        /// </summary>
        /// <param name="exp"></param>
        /// <returns></returns>
        private Decimal twoPow(long exp)
        {
            Decimal retVal = 1;

            for (long i = 0; i < exp; i++)
            {
                retVal = retVal * 2;
            }

            return retVal;
        }

        /// <summary>
        /// Provides EFS type associated to this CodecNT type
        /// </summary>
        /// <param name="type"></param>
        /// <returns>null is no EFS type could be found</returns>
        private string EFSType(ErtmsSolutions.CodecNT.Type type)
        {
            string retVal = null;

            if (type.ertms_type == ErtmsValueType.acceleration)
            {
                retVal = "MessageTypes.Acceleration";
            }
            else if (type.ertms_type == ErtmsValueType.distance)
            {
                retVal = "MessageTypes.Distance";
            }
            else if (type.ertms_type == ErtmsValueType.gradient)
            {
                retVal = "MessageTypes.Gradient";
            }
            else if (type.ertms_type == ErtmsValueType.length)
            {
                retVal = "MessageTypes.Length";
            }
            else if (type.ertms_type == ErtmsValueType.number)
            {
                retVal = "BaseTypes.Number";
            }
            else if (type.ertms_type == ErtmsValueType.time_or_date)
            {
                retVal = "MessageTypes.Time";
            }
            else if (type.ertms_type == ErtmsValueType.speed)
            {
                retVal = "MessageTypes.Speed";
            }
            else if (type.ertms_type == ErtmsValueType.text)
            {
                retVal = "String";
            }

            return retVal;
        }


        /// <summary>
        /// Provides EFS type associated to this CodecNT type
        /// </summary>
        /// <param name="type"></param>
        /// <returns>null is no EFS type could be found</returns>
        private string DefaultValue(ErtmsSolutions.CodecNT.Type type)
        {
            string retVal = null;

            if (type.ertms_type == ErtmsValueType.acceleration)
            {
                retVal = "0";
            }
            else if (type.ertms_type == ErtmsValueType.distance)
            {
                retVal = "0";
            }
            else if (type.ertms_type == ErtmsValueType.gradient)
            {
                retVal = "0";
            }
            else if (type.ertms_type == ErtmsValueType.length)
            {
                retVal = "0";
            }
            else if (type.ertms_type == ErtmsValueType.number)
            {
                retVal = "0";
            }
            else if (type.ertms_type == ErtmsValueType.identity_number)
            {
                retVal = "0";
            }
            else if (type.ertms_type == ErtmsValueType.speed)
            {
                retVal = "0";
            }
            else if (type.ertms_type == ErtmsValueType.text)
            {
                retVal = "''";
            }

            return retVal;
        }

        /// <summary>
        /// Appends the corresponding type to the name space
        /// </summary>
        /// <param name="nameSpace">The namespace in which the type must be added</param>
        /// <param name="name">the name of the type</param>
        /// <param name="type">the type to convert</param>
        private DataDictionary.Types.Type AppendType(DataDictionary.Types.NameSpace nameSpace, string name, ErtmsSolutions.CodecNT.Type type)
        {
            DataDictionary.Types.Type retVal = null;

            if (EFSType(type) == null)
            {
                if (type.value is UiValue)
                {
                    UiValue uiValue = type.value as UiValue;

                    List<DataDictionary.Constants.EnumValue> values = getSpecialValues(uiValue.special_or_reserved_values);

                    Decimal maxValue = twoPow(type.length) - 1;
                    if (IsEnumeration(values, maxValue))
                    {
                        DataDictionary.Types.Enum enumeration = (DataDictionary.Types.Enum)DataDictionary.Generated.acceptor.getFactory().createEnum();
                        enumeration.Name = type.id;
                        enumeration.Default = values[0].Name;
                        foreach (DataDictionary.Constants.EnumValue value in values)
                        {
                            enumeration.appendValues(value);
                        }

                        nameSpace.appendEnumerations(enumeration);
                        retVal = enumeration;
                    }
                    else
                    {
                        DataDictionary.Types.Range range = (DataDictionary.Types.Range)DataDictionary.Generated.acceptor.getFactory().createRange();
                        range.Name = type.id;

                        double factor = 1.0;

                        System.Globalization.CultureInfo info = System.Globalization.CultureInfo.InvariantCulture;
                        ResolutionFormula resolutionFormula = uiValue.resolution_formula;
                        if (resolutionFormula != null && resolutionFormula.Value != null)
                        {
                            factor = double.Parse(resolutionFormula.Value, info);

                            // In that case the precision is integer
                            range.setPrecision(DataDictionary.Generated.acceptor.PrecisionEnum.aIntegerPrecision);
                            range.MinValue = "0";
                            range.MaxValue = "" + maxValue;
                            range.Default = "0";
                        }

                        else
                        {
                            if (Math.Round(factor) == factor)
                            {
                                // Integer precision
                                range.setPrecision(DataDictionary.Generated.acceptor.PrecisionEnum.aIntegerPrecision);
                                range.MinValue = "0";
                                range.MaxValue = "" + maxValue * new Decimal(factor);
                                range.Default = "0";
                            }
                            else
                            {
                                // Double precision
                                range.setPrecision(DataDictionary.Generated.acceptor.PrecisionEnum.aDoublePrecision);
                                range.MinValue = "0.0";
                                range.MaxValue = (maxValue * new Decimal(factor)).ToString(info);
                                range.Default = "0.0";
                            }
                        }

                        foreach (DataDictionary.Constants.EnumValue value in values)
                        {
                            range.appendSpecialValues(value);
                        }

                        nameSpace.appendRanges(range);
                        retVal = range;
                    }
                }
                else if (type.value is CharValue)
                {
                    CharValue charValue = type.value as CharValue;

                    // Nothing to do : translated into string
                }
                else if (type.value is BcdValue)
                {
                    BcdValue bcdValue = type.value as BcdValue;

                    DataDictionary.Types.Range range = (DataDictionary.Types.Range)DataDictionary.Generated.acceptor.getFactory().createRange();
                    range.Name = type.id;
                    range.MinValue = "0";
                    range.MaxValue = "" + (twoPow(type.length) - 1);
                    range.Default = "0";

                    nameSpace.appendRanges(range);
                    retVal = range;
                }

                if (retVal != null)
                {
                    retVal.Comment = type.short_description;
                    if (type.description != null)
                    {
                        retVal.Comment = retVal.Comment + "\n" + type.description;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the special values based on the special_or_reserved_values information
        /// </summary>
        /// <param name="special_or_reserved_values"></param>
        /// <returns></returns>
        private List<DataDictionary.Constants.EnumValue> getSpecialValues(SpecialOrReservedValue[] special_or_reserved_values)
        {
            List<DataDictionary.Constants.EnumValue> retVal = new List<DataDictionary.Constants.EnumValue>();

            if (special_or_reserved_values != null)
            {
                foreach (SpecialOrReservedValue value in special_or_reserved_values)
                {
                    if (value.match is MatchRange)
                    {
                        // Skip
                    }
                    else
                    {
                        DataDictionary.Constants.EnumValue enumValue = (DataDictionary.Constants.EnumValue)DataDictionary.Generated.acceptor.getFactory().createEnumValue();
                        if (value.match is string)
                        {
                            enumValue.Name = FormatIdentifier(value.meaning.value);
                            enumValue.setValue((string)value.match);
                        }
                        OrderedInsert(enumValue, retVal);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Indicates whether the list of enum values cover the complete range 0..maxValue.
        /// In that case, this is an enumeration
        /// Otherwise, this is a range
        /// </summary>
        /// <param name="values"></param>
        /// <param name="maxValue"></param>
        /// <returns></returns>
        private bool IsEnumeration(List<DataDictionary.Constants.EnumValue> values, Decimal maxValue)
        {
            Decimal current = 0;

            foreach (DataDictionary.Constants.EnumValue val in values)
            {
                long v1 = long.Parse(val.getValue());
                if (v1 != current)
                {
                    break;
                }
                current += 1;
            }

            return current == maxValue + 1;
        }

        /// <summary>
        /// Inserts the enum value using the correct order (by value)
        /// </summary>
        /// <param name="enumValue"></param>
        /// <param name="values"></param>
        private void OrderedInsert(DataDictionary.Constants.EnumValue enumValue, List<DataDictionary.Constants.EnumValue> values)
        {
            int i = 0;
            foreach (DataDictionary.Constants.EnumValue val in values)
            {
                long v1 = long.Parse(val.getValue());
                long v2 = long.Parse(enumValue.getValue());
                if (v1 > v2)
                {
                    break;
                }
                i = i + 1;
            }

            values.Insert(i, enumValue);
        }

        /// <summary>
        /// Formats an identifier
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        private string FormatIdentifier(string id)
        {
            string retVal = id;

            if (retVal != null)
            {
                char[] tmp = retVal.ToCharArray();

                for (int i = 0; i < tmp.Length; i++)
                {
                    if (!Char.IsLetterOrDigit(tmp[i]))
                    {
                        tmp[i] = '_';
                    }
                }

                retVal = new String(tmp);

                if (retVal.Length > 0)
                {
                    if (!Char.IsLetter(retVal[0]))
                    {
                        retVal = retVal + "C_";
                    }

                    while (retVal.EndsWith("_"))
                    {
                        retVal = retVal.Substring(0, retVal.Length - 1);
                    }
                }
            }

            if (!Char.IsLetter(retVal[0]))
            {
                retVal = "_" + retVal;
            }

            return retVal;
        }

        /// <summary>
        /// Appends a new field group in the namespace
        /// </summary>
        /// <param name="nameSpace">The namespace in which the field group should be added</param>
        /// <param name="name">The name of the field group</param>
        /// <param name="fieldGroup">The field group to append</param>
        private void AppendFieldGroup(DataDictionary.Types.NameSpace nameSpace, string name, FieldGroup fieldGroup)
        {
            DataDictionary.Types.NameSpace enclosingNameSpace = GetNameSpaceBasedOnName(nameSpace, name);

            // create a structure for the field group
            DataDictionary.Types.Structure structure = (DataDictionary.Types.Structure)DataDictionary.Generated.acceptor.getFactory().createStructure();
            structure.Name = "Message";
            structure.Comment = fieldGroup.description;
            enclosingNameSpace.appendStructures(structure);

            numberOfSubStructures = 1;
            numberOfCollections = 1;
            RenameDuplicates(fieldGroup.field_sequence.Items);
            foreach (object obj in fieldGroup.field_sequence.Items)
            {
                AppendField(obj, structure, fieldGroup.discriminant_value.ToString());
            }

            // Handles root elements
            if (!Utils.Utils.isEmpty(fieldGroup.main))
            {
                DataDictionary.Variables.Variable variable = (DataDictionary.Variables.Variable)DataDictionary.Generated.acceptor.getFactory().createVariable();
                variable.Name = fieldGroup.main;
                variable.setTypeName(structure.FullName);
                variable.Mode = DataDictionary.Generated.acceptor.VariableModeEnumType.aInOut;
                nameSpace.appendVariables(variable);
            }
        }


        /// <summary>
        /// If there is several objects having the same name, their names are modified
        /// </summary>
        /// <param name="items"></param>
        private void RenameDuplicates(object[] items)
        {
            foreach (object obj1 in items)
            {
                if (obj1 is Field)
                {
                    Field field1 = obj1 as Field;
                    int cnt = 0;
                    foreach (object obj2 in items)
                    {
                        if (obj2 is Field)
                        {
                            Field field2 = obj2 as Field;
                            if (field1 != field2 && field1.Name().Equals(field2.Name()))
                            {
                                cnt++;
                                field2.name = field2.name + "_" + cnt;
                            }
                        }
                    }
                    if (cnt > 0) // duplicates were found
                    {
                        field1.name = field1.name + "_" + 0;
                    }
                }
            }
        }

        /// <summary>
        /// Provides the type name according to the string provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        private string getTypeName(string name)
        {
            string retVal = name;

            retVal = retVal.Replace('/', '.');

            return retVal;
        }

        /// <summary>
        /// The number of subStructures created in the current structure
        /// </summary>
        int numberOfSubStructures = 1;

        /// <summary>
        /// The number of collections created in the current structure
        /// </summary>
        int numberOfCollections = 1;

        /// <summary>
        /// Appends the corresponding field in the structure, according to its type
        /// </summary>
        /// <param name="obj">The object which represents the field</param>
        /// <param name="structure">The structure which should contain the field</param>
        private void AppendField(object obj, DataDictionary.Types.Structure structure, string defaultValue)
        {
            if (obj is Field)
            {
                Field field = obj as Field;

                DataDictionary.Types.StructureElement element = (DataDictionary.Types.StructureElement)DataDictionary.Generated.acceptor.getFactory().createStructureElement();
                element.Name = field.name;
                element.TypeName = EFSType(field.type_definition);
                if (element.TypeName == null)
                {
                    element.TypeName = getTypeName(field.type);
                }
                element.setMode(DataDictionary.Generated.acceptor.VariableModeEnumType.aInOut);
                if (field.name.Equals("NID_PACKET"))
                {
                    element.Default = defaultValue;
                }
                else
                {
                    element.Default = DefaultValue(field.type_definition);
                }

                structure.appendElements(element);
            }
            else if (obj is LoopFieldSequence)
            {
                LoopFieldSequence loopFieldSequence = obj as LoopFieldSequence;


                // Create a structure for the elements enclosed in the loop field
                DataDictionary.Types.Structure subStructure = (DataDictionary.Types.Structure)DataDictionary.Generated.acceptor.getFactory().createStructure();
                subStructure.Name = "SubStructure" + numberOfSubStructures;
                numberOfSubStructures += 1;
                structure.NameSpace.appendStructures(subStructure);

                RenameDuplicates(loopFieldSequence.Items);
                foreach (object obj2 in loopFieldSequence.Items)
                {
                    AppendField(obj2, subStructure, "");
                }

                // Create the collection type for the sequence
                DataDictionary.Types.Collection collection = (DataDictionary.Types.Collection)DataDictionary.Generated.acceptor.getFactory().createCollection();
                collection.Name = "Collection" + numberOfCollections;
                collection.setTypeName(subStructure.Name);
                collection.setDefault("[]");
                structure.NameSpace.appendCollections(collection);

                // Create the field in the strcuture which shall hold the collection
                DataDictionary.Types.StructureElement element = (DataDictionary.Types.StructureElement)DataDictionary.Generated.acceptor.getFactory().createStructureElement();
                element.Name = "Sequence" + numberOfCollections;
                element.TypeName = collection.Name;
                element.setMode(DataDictionary.Generated.acceptor.VariableModeEnumType.aInOut);
                structure.appendElements(element);
                numberOfCollections += 1;
            }
            else if (obj is ConditionalFieldSequence)
            {
                ConditionalFieldSequence conditionalFieldSequence = obj as ConditionalFieldSequence;

                RenameDuplicates(conditionalFieldSequence.content);
                foreach (object obj2 in conditionalFieldSequence.content)
                {
                    AppendField(obj2, structure, "");
                }
            }
            else if (obj is FieldGroupReference)
            {
                FieldGroupReference fieldGroupReference = obj as FieldGroupReference;

                DataDictionary.Types.StructureElement element = (DataDictionary.Types.StructureElement)DataDictionary.Generated.acceptor.getFactory().createStructureElement();
                element.Name = fieldGroupReference.name;
                if (Utils.Utils.isEmpty(element.Name))
                {
                    string[] names = fieldGroupReference.@ref.Split('/');
                    element.Name = names[names.Length - 1];
                }
                element.setMode(DataDictionary.Generated.acceptor.VariableModeEnumType.aInOut);
                element.TypeName = getTypeName(fieldGroupReference.@ref) + ".Message";
                element.Default = "EMPTY";

                structure.appendElements(element);
            }
            else if (obj is Choice)
            {
                Choice choice = obj as Choice;

                RenameDuplicates(choice.field_group_reference);
                foreach (FieldGroupReference obj2 in choice.field_group_reference)
                {
                    AppendField(obj2, structure, "");
                }
            }
        }

        /// <summary>
        /// Creates the corresponding name spaces required for the name provided. 
        /// A name space is created/found for each name separated by '/'
        /// </summary>
        /// <param name="enclosingNameSpace">The enclosing name space used to create sub namespaces</param>
        /// <param name="name">The name to consider</param>
        /// <returns></returns>
        private DataDictionary.Types.NameSpace GetNameSpaceBasedOnName(DataDictionary.Types.NameSpace enclosingNameSpace, string name)
        {
            DataDictionary.Types.NameSpace retVal = enclosingNameSpace;

            string[] names = name.Split('/');
            for (int i = 0; i < names.Length; i++)
            {
                DataDictionary.Types.NameSpace current = retVal.findNameSpaceByName(names[i]);
                if (current == null)
                {
                    current = (DataDictionary.Types.NameSpace)DataDictionary.Generated.acceptor.getFactory().createNameSpace();
                    current.Name = names[i];
                    retVal.appendNameSpaces(current);
                }

                retVal = current;
            }

            return retVal;
        }

        /// <summary>
        /// Creates a function which gets the field named "fieldName" from one of the subfield of the structure provided as parameter
        /// </summary>
        /// <param name="nameSpace">The namespace in which the function should be created</param>
        /// <param name="structure">The structure which should be looked for</param>
        /// <param name="subField">The name of the subfield to look for</param>
        /// <param name="returnType">The function return type</param>
        private void AppendGetFunction(DataDictionary.Types.NameSpace nameSpace, DataDictionary.Types.Structure structure, string subField, string returnType)
        {
            DataDictionary.Functions.Function getFunction = (DataDictionary.Functions.Function)DataDictionary.Generated.acceptor.getFactory().createFunction();
            getFunction.Name = subField;
            getFunction.setTypeName(returnType);

            DataDictionary.Parameter param = (DataDictionary.Parameter)DataDictionary.Generated.acceptor.getFactory().createParameter();
            param.Name = "msg";
            param.TypeName = structure.Name;
            getFunction.appendParameters(param);

            foreach (DataDictionary.Types.StructureElement element in structure.Elements)
            {
                DataDictionary.Functions.Case cas = (DataDictionary.Functions.Case)DataDictionary.Generated.acceptor.getFactory().createCase();
                DataDictionary.Rules.PreCondition condition = (DataDictionary.Rules.PreCondition)DataDictionary.Generated.acceptor.getFactory().createPreCondition();
                condition.Expression = "msg." + element.Name + " != EMPTY";

                cas.appendPreConditions(condition);
                cas.ExpressionText = "msg." + element.Name + "." + subField;

                getFunction.appendCases(cas);
            }

            nameSpace.appendFunctions(getFunction);
        }

    }
}
