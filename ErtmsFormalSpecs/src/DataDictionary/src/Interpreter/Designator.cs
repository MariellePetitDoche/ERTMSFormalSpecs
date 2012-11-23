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

    public class Designator : InterpreterTreeNode, IReference
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
            ReturnValue retVal = new ReturnValue(this);

            if (context.GlobalFind)
            {
                retVal.Add(null, context.LocalScope.getVariable(Image));
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
                    FillBySubdeclarator(retVal, subDeclarator);
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
                } while (instance != null && !(instance is Variables.Variable) && !(instance is Variables.Procedure));
            }

            if (context.GlobalFind)
            {
                retVal.Add(null, EFSSystem.getPredefinedItem(Image));

                // Find in the enclosing items
                // Except the enclosing dictionary since dictionaries are handled in a later step
                ModelElement current = Root;
                while (current != null)
                {
                    Utils.ISubDeclarator subDeclarator = current as Utils.ISubDeclarator;
                    if (subDeclarator != null && !(subDeclarator is Dictionary))
                    {
                        FillBySubdeclarator(retVal, subDeclarator);
                    }

                    current = current.Enclosing as ModelElement;
                }

                // Find in the dictionaries declared in the system
                foreach (Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    FillBySubdeclarator(retVal, dictionary);

                    Types.NameSpace defaultNameSpace = dictionary.findNameSpace("Default");
                    if (defaultNameSpace != null)
                    {
                        FillBySubdeclarator(retVal, defaultNameSpace);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Fills the retVal result set according to the subDeclarator class provided as parameter
        /// </summary>
        /// <param name="retVal"></param>
        /// <param name="subDeclarator"></param>
        private void FillBySubdeclarator(ReturnValue retVal, Utils.ISubDeclarator subDeclarator)
        {
            List<Utils.INamable> tmp = new List<Utils.INamable>();
            subDeclarator.find(Image, tmp);
            foreach (Utils.INamable namable in tmp)
            {
                retVal.Add(this, namable);
            }
        }

        /// <summary>
        /// Sets the element referenced by this Deref expression
        /// </summary>
        /// <param name="reference"></param>
        /// <returns></returns>
        public bool setReference(Utils.INamable reference)
        {
            bool retVal = false;

            Variables.IVariable variable = reference as Variables.IVariable;
            if (variable == null)
            {
                // We do not want to hard code reference to variables since they can belong to a structure, 
                // or be variables available on the stack.
                Ref = reference;
                retVal = true;
            }

            return retVal;
        }

        /// <summary>
        /// The model element referenced by this designator.
        /// This value can be null. In that case, reference should be done by dereferencing each argument of the Deref expression
        /// </summary>
        public INamable Ref { get; private set; }

        /// <summary>
        /// Indicates whether the semantic analysis has been performed
        /// </summary>
        protected bool SemanticAnalysisDone { get; private set; }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="context"></param>
        /// <paraparam name="type">Indicates whether we are looking for a type or a value</paraparam>
        public bool SemanticAnalysis(InterpretationContext context, bool type)
        {
            bool retVal = !SemanticAnalysisDone;

            if (!SemanticAnalysisDone)
            {
                SemanticAnalysisDone = true;

                ReturnValue tmp = getReferences(context, type);
                if (tmp.IsUnique)
                {
                    setReference(tmp.Values[0].Value);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the element referenced by this designator, given the enclosing element
        /// </summary>
        /// <param name="enclosing"></param>
        /// <returns></returns>
        public INamable getReference(InterpretationContext context, INamable enclosing, bool type)
        {
            INamable retVal = null;

            if (enclosing == null)
            {
                if (context.GlobalFind)
                {
                    retVal = context.LocalScope.getVariable(Image);
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
                        INamable tmp = getReferenceBySubDeclarator(subDeclarator, type);
                        if (tmp != null)
                        {
                            if (retVal == null)
                            {
                                retVal = tmp;
                            }
                            else
                            {
                                AddError("Too many references for " + Image);
                            }
                        }
                    }

                    instance = enclosingSubDeclarator(instance);
                }

                if (retVal == null)
                {
                    AddError("No definition of " + Image + " found");
                }
            }
            else
            {
                ISubDeclarator subDeclarator = enclosing as ISubDeclarator;
                if (subDeclarator != null)
                {
                    retVal = getReferenceBySubDeclarator(subDeclarator, type);
                }
                else
                {
                    AddError(subDeclarator.ToString() + " cannot declare " + Image);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the enclosing sub declarator
        /// </summary>
        /// <param name="instance"></param>
        /// <returns></returns>
        private Utils.INamable enclosingSubDeclarator(Utils.INamable instance)
        {
            Utils.INamable retVal = instance;

            do
            {
                Utils.IEnclosed enclosed = retVal as Utils.IEnclosed;
                if (enclosed != null)
                {
                    retVal = enclosed.Enclosing as Utils.INamable;
                }
                else
                {
                    retVal = null;
                }
            } while (retVal != null && !(retVal is Utils.ISubDeclarator));

            return retVal;
        }

        /// <summary>
        /// Provides the reference for this subdeclarator
        /// </summary>
        /// <param name="retVal"></param>   
        /// <param name="subDeclarator"></param>
        /// <returns></returns>
        private INamable getReferenceBySubDeclarator(ISubDeclarator subDeclarator, bool type)
        {
            INamable retVal = null;

            List<INamable> tmp;
            if (subDeclarator.DeclaredElements.TryGetValue(Image, out tmp))
            {
                List<INamable> tmp2 = new List<INamable>();
                foreach (INamable namable in tmp)
                {
                    if (!ReturnValue.filterOut(!type, type, namable))
                    {
                        bool found = false;
                        foreach (INamable other in tmp2)
                        {
                            if (namable == other)
                            {
                                found = true;
                                break;
                            }
                        }

                        if (!found)
                        {
                            tmp2.Add(namable);
                        }
                    }
                    Types.Type theType = namable as Types.Type;
                }

                if (tmp2.Count == 1)
                {
                    retVal = tmp2[0];
                }
            }

            return retVal;
        }

        public INamable GetValue(InterpretationContext context, INamable enclosing)
        {
            INamable retVal = null;
            if (Ref != null)
            {
                retVal = Ref;
            }
            else
            {
                retVal = getReference(context, enclosing, false);
            }

            return retVal;
        }

        public override string ToString()
        {
            return Image;
        }
    }
}
