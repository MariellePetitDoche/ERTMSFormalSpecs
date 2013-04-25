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
namespace DataDictionary
{
    using System;
    using System.Collections.Generic;

    /// <summary>
    /// A complete system, along with all dictionaries
    /// </summary>
    public class EFSSystem : Utils.IModelElement, Utils.ISubDeclarator
    {
        /// <summary>
        /// The dictionaries used in the system
        /// </summary>
        public List<DataDictionary.Dictionary> Dictionaries { get; private set; }

        /// <summary>
        /// The runner currently set for the system
        /// </summary>
        public Tests.Runner.Runner Runner { get; set; }

        /// <summary>
        /// Indicates wheter the model should be recompiled (after a change or a load)
        /// </summary>
        public bool ShouldRebuild { get; set; }

        /// <summary>
        /// Indicates wheter the model should be saved (after a change)
        /// </summary>
        public bool ShouldSave { get; set; }

        /// <summary>
        /// Listener to model changes
        /// </summary>
        public class NamableChangeListener : XmlBooster.IListener<DataDictionary.Generated.Namable>
        {
            /// <summary>
            /// The system for which this listener listens
            /// </summary>
            private EFSSystem System { get; set; }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="system"></param>
            public NamableChangeListener(EFSSystem system)
            {
                System = system;
            }

            #region Listens to namable changes
            public void HandleChangeEvent(DataDictionary.Generated.Namable sender)
            {
                System.ShouldRebuild = true;
                System.ShouldSave = true;
            }

            public void HandleChangeEvent(XmlBooster.Lock aLock, DataDictionary.Generated.Namable sender)
            {
                HandleChangeEvent(sender);
            }
            #endregion
        }

        /// <summary>
        /// Constructor
        /// </summary>
        public EFSSystem()
        {
            Dictionaries = new List<Dictionary>();

            DataDictionary.Generated.acceptor.setFactory(new DataDictionary.ObjectFactory());

            Generated.ControllersManager.NamableController.ActivateNotification();
            Generated.ControllersManager.NamableController.Listeners.Insert(0, new NamableChangeListener(this));
        }

        /// <summary>
        /// Adds a new dictionary in the system
        /// </summary>
        /// <param name="dictionary"></param>
        public void AddDictionary(Dictionary dictionary)
        {
            if (dictionary != null)
            {
                dictionary.Enclosing = this;
                Dictionaries.Add(dictionary);
            }
        }

        /// <summary>
        /// The enclosing model element
        /// </summary>
        public object Enclosing { get { return null; } }

        /// <summary>
        /// The EFS System name
        /// </summary>
        public string Name
        {
            get { return "System"; }
            set { }
        }

        public string FullName
        {
            get { return Name; }
        }

        /// <summary>
        /// The sub elements of this model element
        /// </summary>
        public System.Collections.ArrayList SubElements
        {
            get
            {
                System.Collections.ArrayList retVal = new System.Collections.ArrayList();

                foreach (DataDictionary.Dictionary dictionary in Dictionaries)
                {
                    retVal.Add(dictionary);
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the collection which holds this instance
        /// </summary>
        public System.Collections.ArrayList EnclosingCollection { get { return null; } }

        /// <summary>
        /// Deletes the element from its enclosing node
        /// </summary>
        public void Delete()
        {
        }

        /// <summary>
        /// The expression text data of this model element
        /// </summary>
        /// <param name="text"></param>
        public string ExpressionText
        {
            get { return null; }
            set { }
        }

        /// <summary>
        /// The messages logged on the model element
        /// </summary>
        public List<Utils.ElementLog> Messages
        {
            get { return new List<Utils.ElementLog>(); }
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="other"></param>
        /// <returns></returns>
        public int CompareTo(Utils.IModelElement other)
        {
            if (other == this)
            {
                return 0;
            }

            return -1;
        }

        /// --------------------------------------------------
        ///   PREDEFINED ITEMS
        /// --------------------------------------------------
        /// 
        /// <summary>
        /// The predefined empty value
        /// </summary>
        private Values.EmptyValue emptyValue;
        public Values.EmptyValue EmptyValue
        {
            get
            {
                if (emptyValue == null)
                {
                    emptyValue = new Values.EmptyValue(this);
                }
                return emptyValue;
            }
        }

        /// <summary>
        /// The predefined any type
        /// </summary>
        private Types.AnyType anyType;
        public Types.AnyType AnyType
        {
            get
            {
                if (anyType == null)
                {
                    anyType = new Types.AnyType(this);
                }
                return anyType;
            }
        }

        /// <summary>
        /// The predefined no type
        /// </summary>
        private Types.NoType noType;
        public Types.NoType NoType
        {
            get
            {
                if (noType == null)
                {
                    noType = new Types.NoType(this);
                }
                return noType;
            }
        }

        /// <summary>
        /// The predefined bool type
        /// </summary>
        private Types.BoolType boolType;
        public Types.BoolType BoolType
        {
            get
            {
                if (boolType == null)
                {
                    boolType = new Types.BoolType(this);
                }
                return boolType;
            }
        }

        /// <summary>
        /// The predefined integer type
        /// </summary>
        private Types.IntegerType integerType;
        public Types.IntegerType IntegerType
        {
            get
            {
                if (integerType == null)
                {
                    integerType = new Types.IntegerType(this);
                }
                return integerType;
            }
        }

        /// <summary>
        /// The predefined double type
        /// </summary>
        private Types.DoubleType doubleType;
        public Types.DoubleType DoubleType
        {
            get
            {
                if (doubleType == null)
                {
                    doubleType = new Types.DoubleType(this);
                }
                return doubleType;
            }
        }

        /// <summary>
        /// The predefined string type
        /// </summary>
        private Types.StringType stringType;
        public Types.StringType StringType
        {
            get
            {
                if (stringType == null)
                {
                    stringType = new Types.StringType(this);
                }
                return stringType;
            }
        }

        /// <summary>
        /// The predefined function double to double type
        /// </summary>
        private Types.FunctionDoubleToDouble functionDoubleToDoubleType;
        public Types.FunctionDoubleToDouble FunctionDoubleToDoubleType
        {
            get
            {
                if (functionDoubleToDoubleType == null)
                {
                    functionDoubleToDoubleType = new Types.FunctionDoubleToDouble(this);
                }
                return functionDoubleToDoubleType;
            }
        }

        /// <summary>
        /// The generic collection type
        /// </summary>
        /// <returns></returns>
        private Types.Collection genericCollection;
        public Types.Collection GenericCollection
        {
            get
            {
                if (genericCollection == null)
                {
                    genericCollection = new Types.GenericCollection(this);
                }

                return genericCollection;
            }
        }

        /// <summary>
        /// The predefined types
        /// </summary>
        private Dictionary<String, Types.Type> predefinedTypes;
        public Dictionary<String, Types.Type> PredefinedTypes
        {
            get
            {
                if (predefinedTypes == null)
                {
                    PredefinedTypes = new Dictionary<String, Types.Type>();
                    PredefinedTypes[BoolType.Name] = BoolType;
                    PredefinedTypes[IntegerType.Name] = IntegerType;
                    PredefinedTypes[DoubleType.Name] = DoubleType;
                    PredefinedTypes[StringType.Name] = StringType;
                    PredefinedTypes[FunctionDoubleToDoubleType.Name] = FunctionDoubleToDoubleType;
                }
                return predefinedTypes;
            }
            set { predefinedTypes = value; }
        }

        /// <summary>
        /// Gets the boolean value which corresponds to the bool provided
        /// </summary>
        /// <param name="val"></param>
        /// <returns></returns>
        public Values.IValue GetBoolean(bool val)
        {
            if (val)
            {
                return BoolType.True;
            }
            else
            {
                return BoolType.False;
            }
        }

        /// <summary>
        /// The predefined allocate function
        /// </summary>
        private Functions.PredefinedFunctions.Allocate allocatePredefinedFunction;
        public Functions.PredefinedFunctions.Allocate AllocatePredefinedFunction
        {
            get
            {
                if (allocatePredefinedFunction == null)
                {
                    allocatePredefinedFunction = new Functions.PredefinedFunctions.Allocate(this);
                }
                return allocatePredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined available function
        /// </summary>
        private Functions.PredefinedFunctions.Available availablePredefinedFunction;
        public Functions.PredefinedFunctions.Available AvailablePredefinedFunction
        {
            get
            {
                if (availablePredefinedFunction == null)
                {
                    availablePredefinedFunction = new Functions.PredefinedFunctions.Available(this);
                }
                return availablePredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined not function
        /// </summary>
        private Functions.PredefinedFunctions.Not notPredefinedFunction;
        public Functions.PredefinedFunctions.Not NotPredefinedFunction
        {
            get
            {
                if (notPredefinedFunction == null)
                {
                    notPredefinedFunction = new Functions.PredefinedFunctions.Not(this);
                }
                return notPredefinedFunction;
            }
        }


        /// <summary>
        /// The predefined min function
        /// </summary>
        private Functions.PredefinedFunctions.Min minPredefinedFunction;
        public Functions.PredefinedFunctions.Min MinPredefinedFunction
        {
            get
            {
                if (minPredefinedFunction == null)
                {
                    minPredefinedFunction = new Functions.PredefinedFunctions.Min(this);
                }
                return minPredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined MinSurface function
        /// </summary>
        private Functions.PredefinedFunctions.MinSurface minSurfacePredefinedFunction;
        public Functions.PredefinedFunctions.MinSurface MinSurfacePredefinedFunction
        {
            get
            {
                if (minSurfacePredefinedFunction == null)
                {
                    minSurfacePredefinedFunction = new Functions.PredefinedFunctions.MinSurface(this);
                }
                return minSurfacePredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined max function
        /// </summary>
        private Functions.PredefinedFunctions.Max maxPredefinedFunction;
        public Functions.PredefinedFunctions.Max MaxPredefinedFunction
        {
            get
            {
                if (maxPredefinedFunction == null)
                {
                    maxPredefinedFunction = new Functions.PredefinedFunctions.Max(this);
                }
                return maxPredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined targets function
        /// </summary>
        private Functions.PredefinedFunctions.Targets targetsPredefinedFunction;
        public Functions.PredefinedFunctions.Targets TargetsPredefinedFunction
        {
            get
            {
                if (targetsPredefinedFunction == null)
                {
                    targetsPredefinedFunction = new Functions.PredefinedFunctions.Targets(this);
                }
                return targetsPredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined RoundToMultiple function
        /// </summary>
        private Functions.PredefinedFunctions.RoundToMultiple roundToMultiplePredefinedFunction;
        public Functions.PredefinedFunctions.RoundToMultiple RoundToMultiplePredefinedFunction
        {
            get
            {
                if (roundToMultiplePredefinedFunction == null)
                {
                    roundToMultiplePredefinedFunction = new Functions.PredefinedFunctions.RoundToMultiple(this);
                }
                return roundToMultiplePredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined deceleration profile function
        /// </summary>
        private Functions.PredefinedFunctions.DecelerationProfile decelerationProfilePredefinedFunction;
        public Functions.PredefinedFunctions.DecelerationProfile DecelerationProfilePredefinedFunction
        {
            get
            {
                if (decelerationProfilePredefinedFunction == null)
                {
                    decelerationProfilePredefinedFunction = new Functions.PredefinedFunctions.DecelerationProfile(this);
                }
                return decelerationProfilePredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined before function
        /// </summary>
        private Functions.PredefinedFunctions.Before beforePredefinedFunction;
        public Functions.PredefinedFunctions.Before BeforePredefinedFunction
        {
            get
            {
                if (beforePredefinedFunction == null)
                {
                    beforePredefinedFunction = new Functions.PredefinedFunctions.Before(this);
                }
                return beforePredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined AddIncrement function
        /// </summary>
        private Functions.PredefinedFunctions.AddIncrement addIncrementPredefinedFunction;
        public Functions.PredefinedFunctions.AddIncrement AddIncrementPredefinedFunction
        {
            get
            {
                if (addIncrementPredefinedFunction == null)
                {
                    addIncrementPredefinedFunction = new Functions.PredefinedFunctions.AddIncrement(this);
                }
                return addIncrementPredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined override function
        /// </summary>
        private Functions.PredefinedFunctions.Override overridePredefinedFunction;
        public Functions.PredefinedFunctions.Override OverridePredefinedFunction
        {
            get
            {
                if (overridePredefinedFunction == null)
                {
                    overridePredefinedFunction = new Functions.PredefinedFunctions.Override(this);
                }
                return overridePredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined DistanceForSpeed function
        /// </summary>
        private Functions.PredefinedFunctions.DistanceForSpeed distanceForSpeedPredefinedFunction;
        public Functions.PredefinedFunctions.DistanceForSpeed DistanceForSpeedPredefinedFunction
        {
            get
            {
                if (distanceForSpeedPredefinedFunction == null)
                {
                    distanceForSpeedPredefinedFunction = new Functions.PredefinedFunctions.DistanceForSpeed(this);
                }
                return distanceForSpeedPredefinedFunction;
            }
        }

        /// <summary>
        /// The predefined IntersectAt function
        /// </summary>
        private Functions.PredefinedFunctions.IntersectAt intersectAtFunction;
        public Functions.PredefinedFunctions.IntersectAt IntersectAtFunction
        {
            get
            {
                if (intersectAtFunction == null)
                {
                    intersectAtFunction = new Functions.PredefinedFunctions.IntersectAt(this);
                }
                return intersectAtFunction;
            }
        }

        /// <summary>
        /// The predefined functions
        /// </summary>
        private Dictionary<String, Functions.PredefinedFunctions.PredefinedFunction> predefinedFunctions;
        public Dictionary<String, Functions.PredefinedFunctions.PredefinedFunction> PredefinedFunctions
        {
            get
            {
                if (predefinedFunctions == null)
                {
                    predefinedFunctions = new Dictionary<String, Functions.PredefinedFunctions.PredefinedFunction>();
                    predefinedFunctions[AvailablePredefinedFunction.Name] = AvailablePredefinedFunction;
                    predefinedFunctions[AllocatePredefinedFunction.Name] = AllocatePredefinedFunction;
                    predefinedFunctions[NotPredefinedFunction.Name] = NotPredefinedFunction;
                    predefinedFunctions[MinPredefinedFunction.Name] = MinPredefinedFunction;
                    predefinedFunctions[MinSurfacePredefinedFunction.Name] = MinSurfacePredefinedFunction;
                    predefinedFunctions[MaxPredefinedFunction.Name] = MaxPredefinedFunction;
                    predefinedFunctions[TargetsPredefinedFunction.Name] = TargetsPredefinedFunction;
                    predefinedFunctions[RoundToMultiplePredefinedFunction.Name] = RoundToMultiplePredefinedFunction;
                    predefinedFunctions[DecelerationProfilePredefinedFunction.Name] = DecelerationProfilePredefinedFunction;
                    predefinedFunctions[BeforePredefinedFunction.Name] = BeforePredefinedFunction;
                    predefinedFunctions[AddIncrementPredefinedFunction.Name] = AddIncrementPredefinedFunction;
                    predefinedFunctions[OverridePredefinedFunction.Name] = OverridePredefinedFunction;
                    predefinedFunctions[DistanceForSpeedPredefinedFunction.Name] = DistanceForSpeedPredefinedFunction;
                    predefinedFunctions[IntersectAtFunction.Name] = IntersectAtFunction;
                }
                return predefinedFunctions;
            }
            set { predefinedFunctions = value; }
        }


        /// <summary>
        /// All predefined items in the system
        /// </summary>
        private Dictionary<string, Utils.INamable> predefinedItems;
        public Dictionary<string, Utils.INamable> PredefinedItems
        {
            get
            {
                if (predefinedItems == null)
                {
                    predefinedItems = new Dictionary<string, Utils.INamable>();

                    foreach (KeyValuePair<String, Functions.PredefinedFunctions.PredefinedFunction> pair in PredefinedFunctions)
                    {
                        predefinedItems.Add(pair.Key, pair.Value);
                    }
                    foreach (KeyValuePair<String, Types.Type> pair in PredefinedTypes)
                    {
                        predefinedItems.Add(pair.Key, pair.Value);
                        Types.IEnumerateValues enumerator = pair.Value as Types.IEnumerateValues;
                        if (enumerator != null)
                        {
                            Dictionary<string, object> constants = new Dictionary<string, object>();
                            enumerator.Constants("", constants);
                            foreach (KeyValuePair<String, object> pair2 in constants)
                            {
                                if (pair2.Value is Utils.INamable)
                                {
                                    predefinedItems.Add(pair2.Key, (Utils.INamable)pair2.Value);
                                }
                            }
                        }
                    }

                    PredefinedItems.Add(EmptyValue.Name, EmptyValue);
                }

                return predefinedItems;
            }
            set
            {
                predefinedItems = value;
            }
        }
        /// <summary>
        /// Provides the predefined item, based on its name
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Utils.INamable getPredefinedItem(string name)
        {
            Utils.INamable namable = null;

            PredefinedItems.TryGetValue(name, out namable);

            return namable;
        }

        /// <summary>
        /// Indicates that at least one message of type levelEnum is attached to the element
        /// </summary>
        /// <param name="levelEnum"></param>
        /// <returns></returns>
        public bool HasMessage(Utils.ElementLog.LevelEnum levelEnum)
        {
            bool retVal = false;

            return retVal;
        }

        /// <summary>
        /// Provides the list of declared elements in this Dictionary
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                Dictionary<string, List<Utils.INamable>> retVal = new Dictionary<string, List<Utils.INamable>>();

                Utils.ISubDeclaratorUtils.AppendNamable(retVal, EmptyValue);
                foreach (Types.Type type in PredefinedTypes.Values)
                {
                    Utils.ISubDeclaratorUtils.AppendNamable(retVal, type);
                }
                foreach (Functions.PredefinedFunctions.PredefinedFunction function in PredefinedFunctions.Values)
                {
                    Utils.ISubDeclaratorUtils.AppendNamable(retVal, function);
                }

                return retVal;
            }
        }

        /// <summary>
        /// Finds all namable which match the full name provided
        /// </summary>
        /// <param name="fullname">The full name used to search the namable</param>
        public Utils.INamable findByFullName(string fullname)
        {
            Utils.INamable retVal = null;

            foreach (Dictionary dictionary in Dictionaries)
            {
                retVal = dictionary.findByFullName(fullname);
                if (retVal != null)
                {
                    // TODO : only finds the first occurence of the namable in all opened dictionaries.
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            if (name.CompareTo(EmptyValue.Name) == 0)
            {
                retVal.Add(EmptyValue);
            }
            foreach (Types.Type item in PredefinedTypes.Values)
            {
                if (item.Name.CompareTo(name) == 0)
                {
                    retVal.Add(item);
                    break;
                }
            }
            foreach (Functions.PredefinedFunctions.PredefinedFunction item in PredefinedFunctions.Values)
            {
                if (item.Name.CompareTo(name) == 0)
                {
                    retVal.Add(item);
                    break;
                }
            }
        }

        /// <summary>
        /// Provides the type associated to the name
        /// </summary>
        /// <param name="nameSpace"></param>
        /// <param name="name"></param>
        /// <returns></returns>
        public Types.Type findType(Types.NameSpace nameSpace, string name)
        {
            Types.Type retVal = null;

            if (name != null)
            {
                foreach (Dictionary dictionary in Dictionaries)
                {
                    retVal = dictionary.findType(nameSpace, name);
                    if (retVal != null)
                    {
                        break;
                    }
                }

                if (retVal == null)
                {
                    PredefinedTypes.TryGetValue(name, out retVal);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Finds a rule according to its full name
        /// </summary>
        /// <param name="fullName"></param>
        /// <returns></returns>
        public Rules.Rule findRule(string fullName)
        {
            Rules.Rule retVal = null;

            foreach (Dictionary dictionary in Dictionaries)
            {
                retVal = dictionary.findRule(fullName);
                if (retVal != null)
                {
                    break;
                }
            }

            return retVal;
        }


        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public void AddModelElement(Utils.IModelElement element)
        {
            {
                Dictionary item = element as Dictionary;
                if (item != null)
                {
                    Dictionaries.Add(item);
                }
            }
        }

        /// <summary>
        /// Indicates whether a rule is disabled
        /// </summary>
        /// <param name="rule"></param>
        /// <returns></returns>
        public bool isDisabled(Rules.Rule rule)
        {
            bool retVal = false;

            foreach (Dictionary dictionary in Dictionaries)
            {
                retVal = dictionary.Disabled(rule);
                if (retVal)
                {
                    break;
                }
            }

            return retVal;
        }


        /// <summary>
        /// The evaluator for this dictionary
        /// </summary>
        private Interpreter.Parser parser;
        public Interpreter.Parser Parser
        {
            get
            {
                if (parser == null)
                {
                    parser = new Interpreter.Parser(this);
                }
                return parser;
            }
        }

        /// <summary>
        /// Parses the statement provided
        /// </summary>
        /// <param name="root">the root element for which this statement is created</param>
        /// <param name="expression"></param>
        /// <returns></returns>
        public Interpreter.Statement.Statement ParseStatement(ModelElement root, string expression)
        {
            try
            {
                return Parser.Statement(root, expression);
            }
            catch (Interpreter.ParseErrorException exception)
            {
                root.AddException(exception);
                return null;
            }
        }

        /// <summary>
        /// The EFS System instance
        /// </summary>
        private static EFSSystem instance = null;
        public static EFSSystem INSTANCE
        {
            get
            {
                if (instance == null)
                {
                    instance = new EFSSystem();
                }
                return instance;
            }
        }

    }
}
