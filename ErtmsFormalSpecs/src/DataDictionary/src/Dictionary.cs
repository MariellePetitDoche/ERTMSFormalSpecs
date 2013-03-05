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

namespace DataDictionary
{
    public class Dictionary : Generated.Dictionary, Utils.ISubDeclarator, Utils.IFinder
    {
        /// <summary>
        /// The file path associated to the dictionary
        /// </summary>
        private string filePath;
        public string FilePath
        {
            get { return filePath; }
            set { filePath = value; }
        }

        /// <summary>
        /// Saves the dictionary according to its filename
        /// </summary>
        public void save()
        {
            save(FilePath);
        }

        /// <summary>
        /// The treenode name of the dictionary
        /// </summary>
        public override string Name
        {
            get
            {
                string retVal = FilePath;

                int index = retVal.LastIndexOf('\\');
                if (index > 0)
                {
                    retVal = retVal.Substring(index + 1);
                }

                index = retVal.LastIndexOf('.');
                if (index > 0)
                {
                    retVal = retVal.Substring(0, index);
                }

                return retVal;
            }
            set { }
        }

        /// <summary>
        /// Provides the list of declared elements in this Dictionary
        /// </summary>
        private Dictionary<string, List<Utils.INamable>> declaredElements;
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                if (declaredElements == null)
                {
                    declaredElements = new Dictionary<string, List<Utils.INamable>>();

                    foreach (Types.NameSpace nameSpace in NameSpaces)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, nameSpace);
                    }
                }

                return declaredElements;
            }
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            List<Utils.INamable> namables;
            if (DeclaredElements.TryGetValue(name, out namables))
            {
                foreach (Utils.INamable namable in namables)
                {
                    retVal.Add(namable);
                }
            }
        }

        /// <summary>
        /// Finds all namable which match the full name provided
        /// </summary>
        /// <param name="fullname">The full name used to search the namable</param>
        public Utils.INamable findByFullName(string fullname)
        {
            return OverallNamableFinder.INSTANCE.findByName(this, fullname);
        }

        /// <summary>
        /// The specifications related to this rule set
        /// </summary>
        public Specification.Specification Specifications
        {
            get { return (DataDictionary.Specification.Specification)getSpecification(); }
            set { setSpecification(value); }
        }

        /// <summary>
        /// The rule disablings related to this rule set
        /// </summary>
        public System.Collections.ArrayList RuleDisablings
        {
            get
            {
                if (allRuleDisablings() == null)
                {
                    setAllRuleDisablings(new System.Collections.ArrayList());
                }
                return allRuleDisablings();
            }
        }

        /// <summary>
        /// The test frames
        /// </summary>
        public System.Collections.ArrayList Tests
        {
            get
            {
                if (allTests() == null)
                {
                    setAllTests(new System.Collections.ArrayList());
                }
                return allTests();
            }
        }

        /// <summary>
        /// Associates the types with their full name
        /// </summary>
        private Dictionary<string, Types.Type> definedTypes;
        public Dictionary<string, Types.Type> DefinedTypes
        {
            get
            {
                if (definedTypes == null)
                {
                    definedTypes = new Dictionary<string, Types.Type>();

                    foreach (Types.Type type in EFSSystem.PredefinedTypes.Values)
                    {
                        definedTypes.Add(type.FullName, type);
                    }

                    foreach (Types.Type type in TypeFinder.INSTANCE.find(this))
                    {
                        // Ignore state machines which have no substate
                        if (type is Types.StateMachine)
                        {
                            Types.StateMachine stateMachine = type as Types.StateMachine;

                            // Ignore state machines which have no substate
                            if (stateMachine.States.Count > 0)
                            {
                                // Ignore state machines which are not root state machines
                                if (stateMachine.EnclosingState == null)
                                {
                                    definedTypes[type.FullName] = type;
                                }
                            }
                        }
                        else
                        {
                            definedTypes[type.FullName] = type;
                        }
                    }
                }

                return definedTypes;
            }
        }

        /// <summary>
        /// Associates the types with their full name
        /// </summary>
        private Dictionary<Rules.Rule, Rules.RuleDisabling> cachedRuleDisablings;
        public Dictionary<Rules.Rule, Rules.RuleDisabling> CachedRuleDisablings
        {
            get
            {
                if (cachedRuleDisablings == null)
                {
                    cachedRuleDisablings = new Dictionary<Rules.Rule, Rules.RuleDisabling>();

                    foreach (Rules.RuleDisabling ruleDisabling in RuleDisablings)
                    {
                        Rules.Rule disabledRule = EFSSystem.findRule(ruleDisabling.getRule());
                        if (disabledRule != null)
                        {
                            cachedRuleDisablings.Add(disabledRule, ruleDisabling);
                        }
                        else
                        {
                            ruleDisabling.AddError("Cannot find corresponding rule");
                        }
                    }
                }

                return cachedRuleDisablings;
            }
        }

        /// <summary>
        /// Clears the caches of this dictionary
        /// </summary>
        public void ClearCache()
        {
            definedTypes = null;
            cachedRuleDisablings = null;
            declaredElements = null;
            cache.Clear();
        }

        /// <summary>
        /// The cache for types / namespace + name
        /// </summary>
        private Dictionary<Types.NameSpace, Dictionary<string, Types.Type>> cache = new Dictionary<Types.NameSpace, Dictionary<string, Types.Type>>();

        /// <summary>
        /// Provides the type associated to the name
        /// </summary>
        /// <param name="nameSpace">the namespace in which the name should be found</param>
        /// <param name="name"></param>
        /// <returns></returns>
        public Types.Type findType(Types.NameSpace nameSpace, string name)
        {
            Types.Type retVal = null;

            if (name != null)
            {
                if (nameSpace != null)
                {
                    if (!cache.ContainsKey(nameSpace))
                    {
                        cache[nameSpace] = new Dictionary<string, Types.Type>();
                    }
                    Dictionary<string, Types.Type> subCache = cache[nameSpace];

                    if (!subCache.ContainsKey(name))
                    {
                        Types.Type tmp = null;

                        if (!Utils.Utils.isEmpty(name))
                        {
                            tmp = nameSpace.findTypeByName(name);

                            if (tmp == null)
                            {
                                if (DefinedTypes.ContainsKey(name))
                                {
                                    tmp = DefinedTypes[name];
                                }
                            }

                            if (tmp == null && DefinedTypes.ContainsKey("Default." + name))
                            {
                                tmp = DefinedTypes["Default." + name];
                            }
                        }

                        if (tmp == null)
                        {
                            Log.Error("Cannot find type named " + name);
                        }

                        subCache[name] = tmp;
                    }

                    retVal = subCache[name];
                }
                else
                {
                    if (DefinedTypes.ContainsKey(name))
                    {
                        retVal = DefinedTypes[name];
                    }
                    else if (DefinedTypes.ContainsKey("Default." + name))
                    {
                        retVal = DefinedTypes["Default." + name];
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the namespace whose name matches the name provided
        /// </summary>
        public Types.NameSpace findNameSpace(string name)
        {
            Types.NameSpace retVal = (Types.NameSpace)Utils.INamableUtils.findByName(name, NameSpaces);

            return retVal;
        }

        /// <summary>
        /// Provides the rule according to its fullname
        /// </summary>
        /// <param name="fullName"></param>
        /// <returns></returns>
        public Rules.Rule findRule(string fullName)
        {
            Rules.Rule retVal = null;

            foreach (Rules.Rule rule in AllRules)
            {
                if (rule.FullName.CompareTo(fullName) == 0)
                {
                    retVal = rule;
                    break;
                }
            }

            return retVal;
        }


        /// <summary>
        /// Constructor
        /// </summary>
        public Dictionary()
            : base()
        {
            Utils.FinderRepository.INSTANCE.Register(this);
        }

        /// <summary>
        /// Provides the namespaces defined in this dictionary
        /// </summary>
        public System.Collections.ArrayList NameSpaces
        {
            get
            {
                if (allNameSpaces() == null)
                {
                    setAllNameSpaces(new System.Collections.ArrayList());
                }
                return allNameSpaces();
            }
        }


        /// <summary>
        /// Provides the set of paragraphs implemented by this set of rules
        /// </summary>
        /// <returns></returns>
        public HashSet<Specification.Paragraph> ImplementedParagraphs
        {
            get
            {
                return ImplementedParagraphsFinder.INSTANCE.find(this);
            }
        }

        /// <summary>
        /// Recursively provides the rules stored in this dictionary
        /// </summary>
        /// <returns></returns>
        public HashSet<Rules.Rule> AllRules
        {
            get { return RuleFinder.INSTANCE.find(this); }
        }

        /// <summary>
        /// Recursively provides the req related stored in this dictionary
        /// </summary>
        /// <returns></returns>
        public HashSet<ReqRelated> AllReqRelated
        {
            get { return ReqRelatedFinder.INSTANCE.find(this); }
        }

        /// <summary>
        /// Recursively provides the req related stored in this dictionary
        /// </summary>
        /// <returns></returns>
        public HashSet<ReqRelated> ImplementedReqRelated
        {
            get
            {
                HashSet<ReqRelated> retVal = new HashSet<ReqRelated>();

                foreach (ReqRelated reqRelated in AllReqRelated)
                {
                    if (reqRelated.getImplemented())
                    {
                        retVal.Add(reqRelated);
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// Recursively provides the rules stored in this dictionary
        /// </summary>
        /// <returns></returns>
        public HashSet<Rules.Rule> ImplementedRules
        {
            get
            {
                HashSet<Rules.Rule> retVal = new HashSet<Rules.Rule>();

                foreach (Rules.Rule rule in AllRules)
                {
                    if (rule.getImplemented())
                    {
                        retVal.Add(rule);
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// Checks the rules stored in the dictionary
        /// </summary>
        public void CheckRules()
        {
            ClearMessages();
            RuleCheckerVisitor visitor = new RuleCheckerVisitor(this);
            visitor.visit(this, true);
        }

        private class UnimplementedItemVisitor : Generated.Visitor
        {
            public override void visit(Generated.ReqRelated obj, bool visitSubNodes)
            {
                DataDictionary.ReqRelated reqRelated = (DataDictionary.ReqRelated)obj;

                if (!reqRelated.getImplemented())
                {
                    reqRelated.AddInfo("Implementation not complete");
                }

                base.visit(obj, visitSubNodes);
            }
        }



        /// <summary>
        /// Marks all unimplemented test cases stored in the dictionary
        /// </summary>
        public void MarkUnimplementedTests()
        {
            ClearMessages();
            UnimplementedTestVisitor visitor = new UnimplementedTestVisitor();
            visitor.visit(this, true);
        }

        private class UnimplementedTestVisitor : Generated.Visitor
        {
            public override void visit(Generated.TestCase obj, bool visitSubNodes)
            {
                DataDictionary.Tests.TestCase testCase = (DataDictionary.Tests.TestCase)obj;
                if (!testCase.getImplemented())
                {
                    testCase.AddInfo("Unimplemented test case");
                }
                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Marks all unimplemented test cases stored in the dictionary
        /// </summary>
        public void MarkNotTranslatedTests()
        {
            ClearMessages();
            NotTranslatedTestVisitor visitor = new NotTranslatedTestVisitor();
            visitor.visit(this, true);
        }

        private class NotTranslatedTestVisitor : Generated.Visitor
        {
            public override void visit(Generated.Step obj, bool visitSubNodes)
            {
                DataDictionary.Tests.Step step = (DataDictionary.Tests.Step)obj;
                if (step.getTranslationRequired() && !step.getTranslated())
                {
                    step.AddInfo("Not translated step");
                }
                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Marks all unimplemented test cases stored in the dictionary
        /// </summary>
        public void MarkNotImplementedTranslations()
        {
            ClearMessages();
            NotImplementedTranslationVisitor visitor = new NotImplementedTranslationVisitor();
            visitor.visit(this, true);
        }

        private class NotImplementedTranslationVisitor : Generated.Visitor
        {
            public override void visit(Generated.Translation obj, bool visitSubNodes)
            {
                DataDictionary.Tests.Translations.Translation translation = (DataDictionary.Tests.Translations.Translation)obj;
                if (!translation.getImplemented())
                {
                    translation.AddInfo("Not implemented translation");
                }
                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Marks all unimplemented rules stored in the dictionary
        /// </summary>
        public void MarkUnimplementedItems()
        {
            ClearMessages();
            UnimplementedItemVisitor visitor = new UnimplementedItemVisitor();
            visitor.visit(this, true);
        }

        private class NotVerifiedRuleVisitor : Generated.Visitor
        {
            public override void visit(Generated.Rule obj, bool visitSubNodes)
            {
                DataDictionary.Rules.Rule rule = (DataDictionary.Rules.Rule)obj;

                if (!rule.getVerified())
                {
                    rule.AddInfo("Rule not verified");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Marks all not verified rules stored in the dictionary
        /// </summary>
        public void MarkNotVerifiedRules()
        {
            ClearMessages();
            NotVerifiedRuleVisitor visitor = new NotVerifiedRuleVisitor();
            visitor.visit(this, true);
        }

        /// <summary>
        /// Clears all marks related to model elements
        /// </summary>
        private class ClearMarksVisitor : Generated.Visitor
        {
            public override void visit(XmlBooster.IXmlBBase obj, bool visitSubNodes)
            {
                Utils.IModelElement element = obj as Utils.IModelElement;

                if (element != null)
                {
                    element.Messages.Clear();
                }
            }
        }


        public void ExportFunctionalBlocks()
        {

        }


        /// <summary>
        /// Creates a dictionary with pairs paragraph - list of its implementations
        /// </summary>
        private class ParagraphReqRefFinder : Generated.Visitor
        {
            private Dictionary<DataDictionary.Specification.Paragraph, List<ReqRef>> paragraphsReqRefs;
            public Dictionary<DataDictionary.Specification.Paragraph, List<ReqRef>> ParagraphsReqRefs
            {
                get
                {
                    if (paragraphsReqRefs == null)
                    {
                        paragraphsReqRefs = new Dictionary<Specification.Paragraph, List<ReqRef>>();
                    }
                    return paragraphsReqRefs;
                }
            }

            public override void visit(XmlBooster.IXmlBBase obj, bool visitSubNodes)
            {
                ReqRef reqRef = obj as ReqRef;
                if (reqRef != null)
                {
                    if (reqRef.Paragraph != null)
                    {
                        if (!ParagraphsReqRefs.ContainsKey(reqRef.Paragraph))
                        {
                            ParagraphsReqRefs.Add(reqRef.Paragraph, new List<ReqRef>());
                        }
                        paragraphsReqRefs[reqRef.Paragraph].Add(reqRef);
                    }
                }
            }
        }

        public Dictionary<DataDictionary.Specification.Paragraph, List<ReqRef>> ParagraphsReqRefs
        {
            get
            {
                ParagraphReqRefFinder visitor = new ParagraphReqRefFinder();
                visitor.visit(this, true);
                return visitor.ParagraphsReqRefs;
            }
        }

        /// <summary>
        /// Clear all marks
        /// </summary>
        public void ClearMessages()
        {
            ClearMarksVisitor visitor = new ClearMarksVisitor();
            visitor.visit(this, true);
        }

        /// <summary>
        /// Executes the test cases for this test sequence
        /// </summary>
        /// <param name="runner">The runner used to execute the tests</param>
        /// <returns>the number of failed test frames</returns>
        public int ExecuteAllTests()
        {
            int retVal = 0;

            foreach (DataDictionary.Tests.Frame frame in Tests)
            {
                int failedFrames = frame.ExecuteAllTests();
                if (failedFrames > 0)
                {
                    retVal += 1;
                }
            }

            return retVal;
        }

        /// <summary>
        /// The sub sequences of this data dictionary
        /// </summary>
        public List<Tests.SubSequence> SubSequences
        {
            get
            {
                List<Tests.SubSequence> retVal = new List<Tests.SubSequence>();

                foreach (Tests.Frame frame in Tests)
                {
                    frame.FillSubSequences(retVal);
                }
                retVal.Sort();

                return retVal;
            }
        }

        /// <summary>
        /// Finds a test case whose name corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Tests.SubSequence findSubSequence(string name)
        {
            return (Tests.SubSequence)Utils.INamableUtils.findByName(name, SubSequences);
        }

        /// <summary>
        /// Provides the frame which corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Tests.Frame findFrame(string name)
        {
            return (Tests.Frame)Utils.INamableUtils.findByName(name, Tests);
        }

        /// <summary>
        /// The translation dictionary.
        /// </summary>
        public Tests.Translations.TranslationDictionary TranslationDictionary
        {
            get
            {
                if (getTranslationDictionary() == null)
                {
                    setTranslationDictionary(Generated.acceptor.getFactory().createTranslationDictionary());
                }

                return (Tests.Translations.TranslationDictionary)getTranslationDictionary();
            }
        }

        /// <summary>
        /// The translation dictionary.
        /// </summary>
        public Shortcuts.ShortcutDictionary ShortcutsDictionary
        {
            get
            {
                if (getShortcutDictionary() == null)
                {
                    Shortcuts.ShortcutDictionary dictionary = (Shortcuts.ShortcutDictionary)Generated.acceptor.getFactory().createShortcutDictionary();
                    dictionary.Name = Name;
                    setShortcutDictionary(dictionary);

                }

                return (Shortcuts.ShortcutDictionary)getShortcutDictionary();
            }
        }

        /// <summary>
        /// Adds a new rule disabling in this dictionary
        /// </summary>
        /// <param name="rule"></param>
        public void AppendRuleDisabling(Rules.Rule rule)
        {
            Rules.RuleDisabling disabling = (Rules.RuleDisabling)Generated.acceptor.getFactory().createRuleDisabling();

            disabling.Name = rule.Name;
            disabling.setRule(rule.FullName);
            appendRuleDisablings(disabling);
        }

        /// <summary>
        /// Indicates whether a rule is disabled in a dictionary
        /// </summary>
        /// <param name="rule"></param>
        /// <returns></returns>
        public bool Disabled(Rules.Rule rule)
        {
            bool retVal = CachedRuleDisablings.ContainsKey(rule);

            return retVal;
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Types.NameSpace item = element as Types.NameSpace;
                if (item != null)
                {
                    appendNameSpaces(item);
                }
            }
            {
                Rules.RuleDisabling item = element as Rules.RuleDisabling;
                if (item != null)
                {
                    appendRuleDisablings(item);
                }
            }
            {
                Tests.Frame item = element as Tests.Frame;
                if (item != null)
                {
                    appendTests(item);
                }
            }
        }
    }
}
