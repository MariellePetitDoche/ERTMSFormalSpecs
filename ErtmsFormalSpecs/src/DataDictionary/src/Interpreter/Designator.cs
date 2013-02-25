using System;
using System.Collections.Generic;
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
using Utils;

namespace DataDictionary.Interpreter
{
    public class Designator : InterpreterTreeNode, IReference
    {
        /// <summary>
        /// Provides the designator image
        /// </summary>
        public string Image { get; private set; }

        /// <summary>
        /// Indicates whether this designator references
        ///   - an element from the stack 
        ///   - an element from the model
        ///   - an element from the current instance
        /// </summary>
        public enum LocationEnum { NotDefined, Stack, Model, Instance };

        /// <summary>
        /// The location referenced by this designator
        /// </summary>
        public LocationEnum Location
        {
            get
            {
                LocationEnum retVal = LocationEnum.NotDefined;

                if (Ref != null)
                {
                    if (Ref is Variables.IVariable)
                    {
                        INamable current = INamableUtils.getEnclosing(Ref);
                        while (current != null && retVal == LocationEnum.NotDefined)
                        {
                            if ((current is Functions.Function) ||
                                (current is FunctionExpression) ||
                                (current is Variables.IProcedure) ||
                                (current is ListOperators.ListOperatorExpression) ||
                                (current is Statement.Statement) ||
                                (current is StabilizeExpression))
                            {
                                ISubDeclarator subDeclarator = current as ISubDeclarator;
                                if (ISubDeclaratorUtils.ContainsValue(subDeclarator.DeclaredElements, Ref))
                                {
                                    retVal = LocationEnum.Stack;
                                }
                            }

                            if ((current is Types.Structure) ||
                                (current is Types.StructureProcedure))
                            {
                                retVal = LocationEnum.Instance;
                            }

                            if (current is Types.NameSpace)
                            {
                                retVal = LocationEnum.Model;
                            }

                            current = INamableUtils.getEnclosing(current);
                        }
                    }
                    else if (Ref is Types.StructureElement)
                    {
                        retVal = LocationEnum.Instance;
                    }
                    else
                    {
                        retVal = LocationEnum.Model;
                    }
                }

                return retVal;
            }
        }

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
        /// Provides the possible references for this designator (only available during semantic analysis)
        /// </summary>
        /// <param name="instance">the instance on which this element should be found.</param>
        /// <param name="expectation">the expectation on the element found</param>
        /// <returns></returns>
        public ReturnValue getReferences(INamable instance, Filter.AcceptableChoice expectation)
        {
            ReturnValue retVal = new ReturnValue(this);

            if (instance == null)
            {
                // No enclosing instance. Try to first name of a . separated list of names
                //  . First in the enclosing expression
                InterpreterTreeNode current = this;
                while (current != null)
                {
                    ISubDeclarator subDeclarator = current as ISubDeclarator;
                    if (FillBySubdeclarator(subDeclarator, expectation, retVal) > 0)
                    {
                        current = null;
                    }
                    else
                    {
                        current = current.Enclosing;
                    }
                }

                // . In the predefined elements
                addReference(EFSSystem.getPredefinedItem(Image), expectation, retVal);

                // . In the enclosing items, except the enclosing dictionary since dictionaries are handled in a later step
                INamable currentNamable = Root;
                while (currentNamable != null)
                {
                    Utils.ISubDeclarator subDeclarator = currentNamable as Utils.ISubDeclarator;
                    if (subDeclarator != null && !(subDeclarator is Dictionary))
                    {
                        FillBySubdeclarator(subDeclarator, expectation, retVal);
                    }

                    currentNamable = enclosingSubDeclarator(currentNamable);
                }

                // . In the dictionaries declared in the system
                foreach (Dictionary dictionary in EFSSystem.Dictionaries)
                {
                    FillBySubdeclarator(dictionary, expectation, retVal);

                    Types.NameSpace defaultNameSpace = dictionary.findNameSpace("Default");
                    if (defaultNameSpace != null)
                    {
                        FillBySubdeclarator(defaultNameSpace, expectation, retVal);
                    }
                }
            }
            else
            {
                // The instance is provided, hence, this is not the first designator in the . separated list of designators
                if (instance is Types.ITypedElement && !(instance is Constants.State))
                {
                    // If the instance is a typed element, dereference it to its corresponding type
                    Types.ITypedElement element = instance as Types.ITypedElement;
                    instance = element.Type;
                }

                // Find the element in all enclosing sub declarators of the instance
                while (instance != null)
                {
                    Utils.ISubDeclarator subDeclarator = instance as Utils.ISubDeclarator;
                    if (FillBySubdeclarator(subDeclarator, expectation, retVal) > 0)
                    {
                        instance = null;
                    }
                    else
                    {
                        instance = enclosingSubDeclarator(instance);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Adds a reference which satisfies the provided expectation in the result set
        /// </summary>
        /// <param name="namable"></param>
        /// <param name="expectation"></param>
        /// <param name="resultSet"></param>
        private void addReference(INamable namable, Filter.AcceptableChoice expectation, ReturnValue resultSet)
        {
            if (namable != null)
            {
                if (expectation(namable))
                {
                    resultSet.Add(namable);
                }
            }
        }

        /// <summary>
        /// Fills the retVal result set according to the subDeclarator class provided as parameter
        /// </summary>
        /// <param name="subDeclarator">The subdeclarator used to get the image</param>
        /// <param name="expectation">The expectatino of the desired element</param>
        /// <param name="location">The location of the element found</param>
        /// <param name="values">The return value to update</param>
        /// <return>the number of elements added</return>
        private int FillBySubdeclarator(Utils.ISubDeclarator subDeclarator, Filter.AcceptableChoice expectation, ReturnValue values)
        {
            int retVal = 0;

            if (subDeclarator != null)
            {
                List<Utils.INamable> tmp = new List<Utils.INamable>();
                subDeclarator.find(Image, tmp);
                foreach (Utils.INamable namable in tmp)
                {
                    addReference(namable, expectation, values);
                    retVal += 1;
                }
            }

            return retVal;
        }

        /// <summary>
        /// The model element referenced by this designator.
        /// This value can be null. In that case, reference should be done by dereferencing each argument of the Deref expression
        /// </summary>
        public INamable Ref { get; private set; }

        /// <summary>
        /// Performs the semantic analysis of the term
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public void SemanticAnalysis(Utils.INamable instance, Filter.AcceptableChoice expectation)
        {
            ReturnValue tmp = getReferences(instance, expectation);
            tmp.filter(expectation);
            if (tmp.IsUnique)
            {
                Ref = tmp.Values[0].Value;
            }
        }

        /// <summary>
        /// Provides the element referenced by this designator, given the enclosing element
        /// </summary>
        /// <param name="enclosing"></param>
        /// <returns></returns>
        public INamable getReference(InterpretationContext context)
        {
            INamable retVal = null;

            switch (Location)
            {
                case LocationEnum.Stack:
                    retVal = context.LocalScope.getVariable(Image);

                    if (retVal == null)
                    {
                        AddError(Image + " not found on the stack");
                    }
                    break;

                case LocationEnum.Instance:
                    Utils.INamable instance = context.Instance;
                    while (instance != null)
                    {
                        ISubDeclarator subDeclarator = instance as ISubDeclarator;
                        if (subDeclarator != null)
                        {
                            INamable tmp = getReferenceBySubDeclarator(subDeclarator);
                            if (tmp != null)
                            {
                                if (retVal == null)
                                {
                                    retVal = tmp;
                                    instance = null;
                                }
                            }
                        }

                        instance = enclosingSubDeclarator(instance);
                    }

                    if (retVal == null)
                    {
                        AddError(Image + " not found in the current instance " + context.Instance.Name);
                    }
                    break;

                case LocationEnum.Model:
                    retVal = Ref;

                    if (retVal == null)
                    {
                        AddError(Image + " not found in the enclosing model");
                    }
                    break;

                case LocationEnum.NotDefined:
                    AddError("Semantic analysis not performed on " + ToString());
                    break;
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
        /// <param name="subDeclarator"></param>
        /// <returns></returns>
        private INamable getReferenceBySubDeclarator(ISubDeclarator subDeclarator)
        {
            INamable retVal = null;

            List<INamable> tmp;
            if (subDeclarator.DeclaredElements.TryGetValue(Image, out tmp))
            {
                // Remove duplicates
                List<INamable> tmp2 = new List<INamable>();
                foreach (INamable namable in tmp)
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

                // Provide the result, if it is unique
                if (tmp2.Count == 1)
                {
                    retVal = tmp2[0];
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the type designated by this designator
        /// </summary>
        /// <returns></returns>
        public Types.Type GetDesignatorType()
        {
            Types.Type retVal = null;

            if (Ref is Types.ITypedElement)
            {
                retVal = (Ref as Types.ITypedElement).Type;
            }
            else
            {
                retVal = Ref as Types.Type;
            }

            if (retVal == null)
            {
                AddError("Cannot determine typed element referenced by " + ToString());
            }

            return retVal;
        }

        public Variables.IVariable GetVariable(InterpretationContext context)
        {
            Variables.IVariable retVal = null;

            INamable reference = getReference(context);
            retVal = reference as Variables.IVariable;

            return retVal;
        }

        public Values.IValue GetValue(InterpretationContext context)
        {
            Values.IValue retVal = null;

            INamable reference = getReference(context);

            // Deref the reference, if required
            if (reference is Variables.IVariable)
            {
                retVal = (reference as Variables.IVariable).Value;
            }
            else
            {
                retVal = reference as Values.IValue;
            }

            return retVal;
        }

        public ICallable getCalled(InterpretationContext context)
        {
            ICallable retVal = getReference(context) as ICallable;

            if (retVal == null)
            {
                Types.Range range = GetDesignatorType() as Types.Range;
                if (range != null)
                {
                    retVal = range.CastFunction;
                }
            }

            return retVal;
        }

        public void checkExpression()
        {
            if (Location == LocationEnum.NotDefined)
            {
                throw new Exception("Cannot find location of " + ToString());
            }
        }

        public override string ToString()
        {
            return Image;
        }
    }
}
