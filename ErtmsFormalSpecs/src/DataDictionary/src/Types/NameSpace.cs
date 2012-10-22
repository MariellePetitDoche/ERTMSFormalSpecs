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

namespace DataDictionary.Types
{
    public class NameSpace : Generated.NameSpace, Utils.ISubDeclarator, Utils.IFinder
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public NameSpace()
            : base()
        {
            Utils.FinderRepository.INSTANCE.Register(this);
        }

        /// <summary>
        /// The sub namespaces
        /// </summary>
        public System.Collections.ArrayList SubNameSpaces
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
        /// The ranges types
        /// </summary>
        public System.Collections.ArrayList Ranges
        {
            get
            {
                if (allRanges() == null)
                {
                    setAllRanges(new System.Collections.ArrayList());
                }
                return allRanges();
            }
        }

        /// <summary>
        /// The enumeration types
        /// </summary>
        public System.Collections.ArrayList Enumerations
        {
            get
            {
                if (allEnumerations() == null)
                {
                    setAllEnumerations(new System.Collections.ArrayList());
                }
                return allEnumerations();
            }
        }

        /// <summary>
        /// The structure types
        /// </summary>
        public System.Collections.ArrayList Structures
        {
            get
            {
                if (allStructures() == null)
                {
                    setAllStructures(new System.Collections.ArrayList());
                }
                return allStructures();
            }
        }

        /// <summary>
        /// The collection types
        /// </summary>
        public System.Collections.ArrayList Collections
        {
            get
            {
                if (allCollections() == null)
                {
                    setAllCollections(new System.Collections.ArrayList());
                }
                return allCollections();
            }
        }

        /// <summary>
        /// The functions declared in the namespace
        /// </summary>
        public System.Collections.ArrayList Functions
        {
            get
            {
                if (allFunctions() == null)
                {
                    setAllFunctions(new System.Collections.ArrayList());
                }
                return allFunctions();
            }
        }

        /// <summary>
        /// The procedures declared in the namespace
        /// </summary>
        public System.Collections.ArrayList Procedures
        {
            get
            {
                if (allProcedures() == null)
                {
                    setAllProcedures(new System.Collections.ArrayList());
                }
                return allProcedures();
            }
        }

        /// <summary>
        /// The variables declared in the namespace
        /// </summary>
        public System.Collections.ArrayList Variables
        {
            get
            {
                if (allVariables() == null)
                {
                    setAllVariables(new System.Collections.ArrayList());
                }
                return allVariables();
            }
        }

        /// <summary>
        /// The rules declared in the namespace
        /// </summary>
        public System.Collections.ArrayList Rules
        {
            get
            {
                if (allRules() == null)
                {
                    setAllRules(new System.Collections.ArrayList());
                }
                return allRules();
            }
        }

        /// <summary>
        /// Clears the caches
        /// </summary>
        public void ClearCache()
        {
            cachedVariables = null;
            types = null;
            declaredElements = null;
        }

        /// <summary>
        /// Provides all the values available through this namespace
        /// </summary>
        private List<Variables.IVariable> cachedVariables;
        public List<Variables.IVariable> AllVariables
        {
            get
            {
                if (cachedVariables == null)
                {
                    cachedVariables = new List<Variables.IVariable>();

                    foreach (Variables.IVariable value in Variables)
                    {
                        cachedVariables.Add(value);
                    }
                }

                return cachedVariables;
            }
        }
        /// <summary>
        /// Provides all the types available through this namespace
        /// </summary>
        private List<Types.Type> types;
        public List<Types.Type> Types
        {
            get
            {
                if (types == null)
                {
                    types = new List<Types.Type>();

                    foreach (Range range in Ranges)
                    {
                        types.Add(range);
                    }
                    foreach (Enum enumeration in Enumerations)
                    {
                        types.Add(enumeration);
                    }
                    foreach (Structure structure in Structures)
                    {
                        types.Add(structure);
                    }
                    foreach (Collection collection in Collections)
                    {
                        types.Add(collection);
                    }
                }

                return types;
            }
        }

        /// <summary>
        /// Provides all the types available through this namespace
        /// </summary>
        private Dictionary<string, List<Utils.INamable>> declaredElements;
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                if (declaredElements == null)
                {
                    declaredElements = new Dictionary<string, List<Utils.INamable>>();

                    foreach (NameSpace nameSpace in SubNameSpaces)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, nameSpace);
                    }

                    foreach (Types.Type type in Types)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, type);
                    }

                    foreach (Variables.IVariable variable in AllVariables)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, variable);
                    }

                    foreach (Variables.Procedure proc in Procedures)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, proc);
                    }

                    foreach (Functions.Function function in Functions)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, function);
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
            List<Utils.INamable> list;

            if (DeclaredElements.TryGetValue(name, out list))
            {
                retVal.AddRange(list);
            }
        }


        /// <summary>
        /// The types defined in this namespace, an the sub namespaces
        /// </summary>
        public HashSet<Type> DefinedTypes
        {
            get { return TypeFinder.INSTANCE.find(this); }
        }

        /// <summary>
        /// Provides the namespace which corresponds to the given name
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public NameSpace findNameSpaceByName(string name)
        {
            return (NameSpace)Utils.INamableUtils.findByName(name, SubNameSpaces);
        }

        /// <summary>
        /// Provides the type which corresponds to the given name
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public Type findTypeByName(string name)
        {
            return innerFindTypeByName(name, true);
        }

        /// <summary>
        /// Provides the type which corresponds to the given name
        /// </summary>
        /// <param name="name">the type name to find</param>
        /// <param name="findInEnclosingNameSpaces">indicates that the search must be performed in the enclosing namespaces</param>
        /// <returns></returns>
        private Type innerFindTypeByName(string name, bool findInEnclosingNameSpaces)
        {
            Type retVal = null;

            string[] names = name.Split('.');
            if (names.Length == 1)
            {
                retVal = (Type)Utils.INamableUtils.findByName(name, Types);
            }
            else
            {
                NameSpace nameSpace = (NameSpace)Utils.INamableUtils.findByName(names[0], SubNameSpaces);
                if (nameSpace != null)
                {
                    retVal = nameSpace.innerFindTypeByName(name.Substring(nameSpace.Name.Length + 1), false);
                }
            }

            if (retVal == null && findInEnclosingNameSpaces && EnclosingNameSpace != null)
            {
                retVal = EnclosingNameSpace.innerFindTypeByName(name, true);
            }

            return retVal;
        }

        /// <summary>
        /// The enclosing dictionary
        /// </summary>
        public Dictionary EnclosingDictionary
        {
            get { return Enclosing as Dictionary; }
        }

        /// <summary>
        /// The enclosing namespace
        /// </summary>
        public NameSpace EnclosingNameSpace
        {
            get { return Enclosing as NameSpace; }
        }

        /// <summary>
        /// The enclosing collection
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                System.Collections.ArrayList retVal = null;

                if (EnclosingNameSpace != null)
                {
                    retVal = EnclosingNameSpace.SubNameSpaces;
                }
                else if (EnclosingDictionary != null)
                {
                    retVal = EnclosingDictionary.NameSpaces;
                }

                return retVal;
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Range item = element as Range;
                if (item != null)
                {
                    appendRanges(item);
                }
            }
            {
                Enum item = element as Enum;
                if (item != null)
                {
                    appendEnumerations(item);
                }
            }
            {
                Structure item = element as Structure;
                if (item != null)
                {
                    appendStructures(item);
                }
            }
            {
                Collection item = element as Collection;
                if (item != null)
                {
                    appendCollections(item);
                }
            }
            {
                Functions.Function item = element as Functions.Function;
                if (item != null)
                {
                    appendFunctions(item);
                }
            }
            {
                Variables.Procedure item = element as Variables.Procedure;
                if (item != null)
                {
                    appendProcedures(item);
                }
            }
            {
                Rules.Rule item = element as Rules.Rule;
                if (item != null)
                {
                    appendRules(item);
                }
            }
            {
                Variables.Variable item = element as Variables.Variable;
                if (item != null)
                {
                    appendVariables(item);
                }
            }
        }
    }
}
