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
using Utils;

namespace DataDictionary.Interpreter
{
    public class DesignatorCache : Utils.IFinder
    {
        /// <summary>
        /// Constrctor
        /// </summary>
        public DesignatorCache()
        {
        }

        /// <summary>
        /// The cache
        /// </summary>
        private Dictionary<Designator, Dictionary<ModelElement, Dictionary<string, ReturnValue>>> cache = new Dictionary<Designator, Dictionary<ModelElement, Dictionary<string, ReturnValue>>>();

        /// <summary>
        /// Clears the cache
        /// </summary>
        public void ClearCache()
        {
            cache = new Dictionary<Designator, Dictionary<ModelElement, Dictionary<string, ReturnValue>>>();
        }

        /// <summary>
        /// Gets the cached result
        /// </summary>
        /// <param name="designator"></param>
        /// <param name="root"></param>
        /// <param name="Image"></param>
        /// <returns></returns>
        public ReturnValue getReferences(Designator designator, ModelElement root, string Image)
        {
            ReturnValue retVal = null;

            Dictionary<ModelElement, Dictionary<string, ReturnValue>> c1;
            if (!cache.ContainsKey(designator))
            {
                cache[designator] = new Dictionary<ModelElement, Dictionary<string, ReturnValue>>();
            }
            c1 = cache[designator];

            Dictionary<string, ReturnValue> c2;
            if (!c1.ContainsKey(root))
            {
                c1[root] = new Dictionary<string, ReturnValue>();
            }
            c2 = c1[root];

            if (c2.ContainsKey(Image))
            {
                retVal = c2[Image];
            }

            return retVal;
        }

        /// <summary>
        /// Stores the cached value
        /// </summary>
        /// <param name="designator"></param>
        /// <param name="root"></param>
        /// <param name="Image"></param>
        /// <param name="returnValue"></param>
        public void storeReferences(Designator designator, ModelElement root, string Image, ReturnValue returnValue)
        {
            ReturnValue retVal = null;

            Dictionary<ModelElement, Dictionary<string, ReturnValue>> c1;
            if (!cache.ContainsKey(designator))
            {
                cache[designator] = new Dictionary<ModelElement, Dictionary<string, ReturnValue>>();
            }
            c1 = cache[designator];

            Dictionary<string, ReturnValue> c2;
            if (!c1.ContainsKey(root))
            {
                c1[root] = new Dictionary<string, ReturnValue>();
            }
            c2 = c1[root];

            c2[Image] = returnValue;
        }
    }

    public class Designator : InterpreterTreeNode
    {
        /// <summary>
        /// Provides the designator image
        /// </summary>
        public string Image { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="enclosing">the enclosing tree node</param>
        /// <param name="image">The designator image</param>
        public Designator(ModelElement root, string image)
            : base(root)
        {
            Image = image;
        }

        /// <summary>
        /// Provides the object referenced by this designator
        /// </summary>
        /// <param name="context">the context used to interpret the designator</param>
        /// <param name="type">Indicates that a type is expected</param>
        /// <returns>The list of objects which might be referenced by this designator, according to the context</returns>
        public ReturnValue getReferences(InterpretationContext context, bool type)
        {
            ReturnValue retVal = new ReturnValue();

            if (context.GlobalFind)
            {
                retVal.Add(context.LocalScope.getVariable(Image));
            }

            // Gets the instance on which the dereference should be performed
            Utils.INamable instance = context.Instance;
            if (type && instance is Types.ITypedElement)
            {
                Types.ITypedElement element = instance as Types.ITypedElement;

                instance = element.Type;
            }

            // Dereferences based on Image
            while (instance != null)
            {
                Utils.ISubDeclarator subDeclarator = instance as Utils.ISubDeclarator;
                if (subDeclarator != null)
                {
                    subDeclarator.find(Image, retVal.Values);
                }
                // Apply the same search on enclosing variable
                do
                {
                    Utils.IEnclosed enclosed = instance as Utils.IEnclosed;
                    if (enclosed != null)
                    {
                        instance = enclosed.Enclosing as Utils.INamable;
                    }
                    else
                    {
                        instance = null;
                    }
                } while (instance != null && !(instance is Variables.IVariable) && !(instance is Values.IValue) && !(instance is Variables.IProcedure));
            }

            if (context.GlobalFind)
            {
                retVal.Add(EFSSystem.getPredefinedItem(Image));

                // Find in the enclosing items
                // Except the enclosing dictionary since dictionaries are handled in a later step
                INamable current = Root;
                while (current != null)
                {
                    Utils.ISubDeclarator subDeclarator = current as Utils.ISubDeclarator;
                    if (subDeclarator != null && !(subDeclarator is Dictionary))
                    {
                        subDeclarator.find(Image, retVal.Values);
                    }

                    IEnclosed enclosed = current as IEnclosed;
                    if (enclosed != null)
                    {
                        current = enclosed.Enclosing as INamable;
                    }
                    else
                    {
                        current = null;
                    }
                }

                // Find in the dictionaries declared in the system
                foreach (Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    dictionary.find(Image, retVal.Values);

                    Types.NameSpace defaultNameSpace = dictionary.findNameSpace("Default");
                    if (defaultNameSpace != null)
                    {
                        defaultNameSpace.find(Image, retVal.Values);
                    }
                }
            }

            return retVal;
        }

        public override string ToString()
        {
            return Image;
        }
    }
}
