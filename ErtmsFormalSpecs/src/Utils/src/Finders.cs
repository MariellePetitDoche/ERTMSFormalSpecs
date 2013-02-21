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
    /// <summary>
    /// A finder utility class. 
    /// </summary>
    public interface IFinder
    {
        /// <summary>
        /// Used to clear the cache related to a single finder
        /// </summary>
        void ClearCache();
    }

    ///
    /// --------------------------------------------------------------------
    ///   Enclosing finder
    /// --------------------------------------------------------------------
    /// <summary>
    /// Finds in an enclosing element the element whose type matches T
    /// </summary>
    /// <typeparam name="T"></typeparam>
    public class EnclosingFinder<T> : IFinder
        where T : class
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public EnclosingFinder()
        {
            FinderRepository.INSTANCE.Register(this);
        }

        /// <summary>
        /// Finds an enclosing element whose type is T
        /// </summary>
        /// <param name="el"></param>
        /// <returns></returns>
        public static T find(IEnclosed el)
        {
            object current = el.Enclosing;

            while (current != null && !(current is T))
            {
                if (current is IEnclosed)
                {
                    current = ((IEnclosed)current).Enclosing;
                }
                else
                {
                    current = null;
                }
            }

            return current as T;
        }

        /// <summary>
        /// Clears the cache
        /// </summary>
        public void ClearCache()
        {
            // No cache
        }
    }

    ///
    /// --------------------------------------------------------------------
    ///  ISubDeclarator
    /// --------------------------------------------------------------------
    /// <summary>
    ///  An element which declares subthings. 
    ///  SubElements can be referenced using the dot notation
    /// </summary>
    public interface ISubDeclarator
    {
        /// <summary>
        /// The elements declared by this declarator
        /// </summary>
        Dictionary<string, List<INamable>> DeclaredElements { get; }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        void find(string name, List<INamable> retVal);
    }

    /// <summary>
    /// Utility class for sub declarators
    /// </summary>
    public class ISubDeclaratorUtils
    {
        /// <summary>
        /// Appends a namable in a dictionary
        /// </summary>
        /// <param name="dictionary"></param>
        /// <param name="namable"></param>
        public static void AppendNamable(Dictionary<string, List<INamable>> dictionary, INamable namable)
        {
            if (namable != null)
            {
                if (!Utils.isEmpty(namable.Name))
                {
                    if (!dictionary.ContainsKey(namable.Name))
                    {
                        dictionary[namable.Name] = new List<INamable>();
                    }
                    dictionary[namable.Name].Add(namable);
                }
            }
        }

        /// <summary>
        /// Appends a namable in a dictionary
        /// </summary>
        /// <param name="dictionary"></param>
        /// <param name="name"></param>
        /// <param name="namable"></param>
        public static void AppendNamable(Dictionary<string, List<INamable>> dictionary, string name, INamable namable)
        {
            if (namable != null)
            {
                if (!dictionary.ContainsKey(name))
                {
                    dictionary[name] = new List<INamable>();
                }
                dictionary[name].Add(namable);
            }
        }

        /// <summary>
        /// Appends the INamable which match the name provided in retVal from the dictionary
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public static void Find(Dictionary<string, List<INamable>> dictionary, string name, List<INamable> retVal)
        {
            List<INamable> tmp;
            if (dictionary.TryGetValue(name, out tmp))
            {
                retVal.AddRange(tmp);
            }
        }
    }

    ///
    /// --------------------------------------------------------------------
    ///  Overall finder
    /// --------------------------------------------------------------------
    /// <summary>
    /// A utility class used to find an instance based on the name provided
    /// </summary>
    /// <typeparam name="T"></typeparam>
    public class OverallFinder<T> : IFinder
        where T : class, INamable
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public OverallFinder()
        {
            FinderRepository.INSTANCE.Register(this);
        }

        /// <summary>
        /// The cache 
        /// </summary>
        private Dictionary<object, Dictionary<string, T>> cache = new Dictionary<object, Dictionary<string, T>>();

        /// <summary>
        /// Stores a value in the cache
        /// </summary>
        /// <param name="root"></param>
        /// <param name="name"></param>
        /// <param name="value"></param>
        private void storeInCache(object root, string name, T value)
        {
            if (!cache.ContainsKey(root))
            {
                cache[root] = new Dictionary<string, T>();
            }
            cache[root][name] = value;
        }

        /// <summary>
        /// Finds an element in the model based on its name
        /// </summary>
        /// <param name="root">the root where search need be conducted</param>
        /// <param name="name">The . separated name of the element</param>
        /// <returns></returns>
        public T findByName(object root, string name)
        {
            T retVal = null;

            if (name != null)
            {
                if (cache.ContainsKey(root))
                {
                    Dictionary<string, T> subCache = cache[root];

                    if (subCache.ContainsKey(name))
                    {
                        retVal = subCache[name];
                    }
                    else
                    {
                        retVal = findByName(root, name.Split('.'), 0, false);
                        storeInCache(root, name, retVal);
                    }
                }
                else
                {
                    retVal = findByName(root, name.Split('.'), 0, false);
                    storeInCache(root, name, retVal);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Finds an element in the model based on its decomposed name, where the index indicates which element have already been matched
        /// </summary>
        /// <param name="root">the root where search need be conducted</param>
        /// <param name="names">the decomposed name</param>
        /// <param name="index">the index where elements have already been matched</param>
        /// <param name="skipDefault">Indicates that the default namespace should not be considered as empty in the name</param>
        /// <returns></returns>
        private T findByName(object root, string[] names, int index, bool skipDefault)
        {
            T retVal = null;

            if (root != null)
            {
                if (root is ISubDeclarator && index < names.Length)
                {
                    ISubDeclarator declarator = root as ISubDeclarator;

                    // This is the last name to check and all names match. 
                    // Provide the first one with the correct type
                    List<INamable> values = new List<INamable>();
                    declarator.find(names[index], values);
                    foreach (INamable namable in values)
                    {
                        if (index == names.Length - 1)
                        {
                            retVal = namable as T;
                            if (retVal != null)
                            {
                                break;
                            }
                        }
                        else
                        {
                            retVal = findByName(namable, names, index + 1, skipDefault);
                            if (retVal != null)
                            {
                                break;
                            }
                        }
                    }

                    if (retVal == null && !skipDefault)
                    {
                        values.Clear();
                        declarator.find("Default", values);

                        foreach (INamable namable in values)
                        {
                            retVal = findByName(namable, names, index, true);
                            if (retVal != null)
                            {
                                break;
                            }
                        }
                    }
                }

                // Nothing has been found under this node, try with the enclosing node
                if (retVal == null && index == 0)
                {
                    if (root is IModelElement)
                    {
                        IModelElement elt = root as IModelElement;
                        if (elt.Enclosing != null)
                        {
                            retVal = findByName(elt.Enclosing, names, 0, skipDefault);
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the name of all values of type T
        /// </summary>
        /// <param name="scope">The scope to used when identifying the elements</param>
        /// <param name="root">The root element where search must be conducted</param>
        /// <param name="enclosing">Indicates that the enclosing model elements should be considered</param>
        /// <param name="retVal">The result, to be filled</param>
        /// <returns></returns>
        public void findAllValueNames(string scope, IModelElement root, bool enclosing, List<string> retVal)
        {
            foreach (string name in findAllValues(scope, root, enclosing).Keys)
            {
                retVal.Add(name);
            }
        }

        /// <summary>
        /// Provides all the values of type T along with their identification name
        /// </summary>
        /// <param name="scope">The scope to used when identifying the elements</param>
        /// <param name="root">The root element where search must be conducted</param>
        /// <param name="enclosing">Indicates that the enclosing model elements should be considered</param>
        /// <returns></returns>
        public Dictionary<string, T> findAllValues(string scope, object root, bool enclosing)
        {
            Dictionary<string, T> retVal = new Dictionary<string, T>();

            object current = root;
            if (enclosing)
            {
                while (current != null)
                {
                    innerFindAllValues(current, scope, retVal, 0);

                    if (current is IEnclosed)
                    {
                        current = ((IEnclosed)current).Enclosing;
                    }
                    else
                    {
                        current = null;
                    }
                }
            }
            else if (current != null)
            {
                innerFindAllValues(current, scope, retVal, 0);
            }

            return retVal;
        }

        /// <summary>
        /// The maximum depth the search must go (avoid infinite recursion)
        /// </summary>
        private static int MAX_DEPTH = 10;

        /// <summary>
        /// Provides all the values of type T along with their identification name
        /// </summary>
        /// <param name="root">The root element where search must be conducted</param>
        /// <param name="scope">The namespace where elements are declared</param>
        /// <param name="retVal">The result values</param>
        /// <param name="depth">The maximum depth in which the find must go</param>
        private void innerFindAllValues(object root, string scope, Dictionary<string, T> retVal, int depth)
        {
            if (root is ISubDeclarator)
            {
                ISubDeclarator subDeclarator = root as ISubDeclarator;
                foreach (KeyValuePair<string, List<INamable>> element in subDeclarator.DeclaredElements)
                {
                    string name = Utils.concat(scope, element.Key);

                    List<INamable> values = element.Value;
                    foreach (INamable value in values)
                    {
                        if (!retVal.ContainsKey(name) && value is T)
                        {
                            retVal[name] = value as T;
                        }
                        if (depth < MAX_DEPTH)
                        {
                            innerFindAllValues(value, name, retVal, depth + 1);
                        }
                    }
                }
            }
        }

        /// <summary>
        /// Clears the cache
        /// </summary>
        public void ClearCache()
        {
            cache.Clear();
        }
    }

    ///
    /// --------------------------------------------------------------------
    ///  Finder Repository
    /// --------------------------------------------------------------------
    /// <summary>
    /// Takes care of all finders
    /// </summary>
    public class FinderRepository
    {
        /// <summary>
        /// The registered finders
        /// </summary>
        private List<IFinder> finders = new List<IFinder>();

        /// <summary>
        /// Clears the cache of the registered finders
        /// </summary>
        public void ClearCache()
        {
            foreach (IFinder finder in finders)
            {
                finder.ClearCache();
            }
        }

        /// <summary>
        /// Registers a new finder
        /// </summary>
        /// <param name="finder"></param>
        public void Register(IFinder finder)
        {
            finders.Add(finder);
        }

        /// <summary>
        /// The finder repository instance
        /// </summary>
        public static FinderRepository INSTANCE = new FinderRepository();
    };
}
