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
    public class BaseFinder<T> : Generated.Visitor, Utils.IFinder
        where T : class
    {
        /// <summary>
        /// Constructor
        /// </summary>
        protected BaseFinder()
        {
            Utils.FinderRepository.INSTANCE.Register(this);
        }

        /// <summary>
        /// Stored the result of previous searches
        /// </summary>
        private Dictionary<XmlBooster.IXmlBBase, HashSet<T>> TheCache = new Dictionary<XmlBooster.IXmlBBase, HashSet<T>>();

        /// <summary>
        /// The set currently being filled 
        /// </summary>
        protected HashSet<T> currentSet;

        /// <summary>
        /// Finds the elements requested
        /// </summary>
        /// <param name="root"></param>
        /// <returns></returns>
        public HashSet<T> find(XmlBooster.IXmlBBase root)
        {
            if (!TheCache.ContainsKey(root))
            {
                currentSet = new HashSet<T>();
                visit(root, false);
                dispatch(root, true);
                TheCache[root] = currentSet;
            }

            return TheCache[root];
        }

        public override void visit(Generated.Dictionary obj, bool visitSubNodes)
        {
            currentSet = new HashSet<T>();

            base.visit(obj, visitSubNodes);
        }

        /// <summary>
        /// Clears the cache
        /// </summary>
        public virtual void ClearCache()
        {
            TheCache.Clear();
        }
    }

    /// <summary>
    /// A finder for elements in the model, not in specification nor in tests
    /// </summary>
    /// <typeparam name="T"></typeparam>
    public class ModelFinder<T> : BaseFinder<T>
        where T : class
    {
        public override void visit(Generated.Specification obj, bool subNodes)
        {
            // Optimization : no model element can be found here => no call to base
        }

        public override void visit(Generated.Frame obj, bool subNodes)
        {
            // Optimization : no model element can be found here => no call to base
        }

        public override void visit(Generated.TranslationDictionary obj, bool subNodes)
        {
            // Optimization : no model element can be found here => no call to base
        }
    }

    /// <summary>
    /// Finds all types
    /// </summary>
    public class TypeFinder : ModelFinder<Types.Type>
    {
        /// <summary>
        /// Constructor
        /// </summary>
        private TypeFinder()
            : base()
        {
        }

        /// <summary>
        /// The instance
        /// </summary>
        public static TypeFinder INSTANCE = new TypeFinder();

        public override void visit(Generated.Type obj, bool subNodes)
        {
            currentSet.Add((Types.Type)obj);
            base.visit(obj, subNodes);
        }
    }

    /// <summary>
    /// Finds all states
    /// </summary>
    public class StateFinder : ModelFinder<Constants.State>
    {
        /// <summary>
        /// Constructor
        /// </summary>
        private StateFinder()
            : base()
        {
        }

        /// <summary>
        /// The instance
        /// </summary>
        public static StateFinder INSTANCE = new StateFinder();

        public override void visit(Generated.State obj, bool visitSubNodes)
        {
            currentSet.Add((Constants.State)obj);
            base.visit(obj, visitSubNodes);
        }
    }

    /// <summary>
    /// Finds all req related
    /// </summary>
    public class ReqRelatedFinder : ModelFinder<ReqRelated>
    {
        /// <summary>
        /// Constructor
        /// </summary>
        private ReqRelatedFinder()
            : base()
        {
        }

        /// <summary>
        /// The instance
        /// </summary>
        public static ReqRelatedFinder INSTANCE = new ReqRelatedFinder();

        public override void visit(Generated.ReqRelated obj, bool visitSubNodes)
        {
            currentSet.Add((ReqRelated)obj);
            base.visit(obj, visitSubNodes);
        }
    }

    /// <summary>
    /// Finds all rules
    /// </summary>
    public class RuleFinder : ModelFinder<Rules.Rule>
    {
        /// <summary>
        /// Constructor
        /// </summary>
        private RuleFinder()
            : base()
        {
        }

        /// <summary>
        /// The instance
        /// </summary>
        public static RuleFinder INSTANCE = new RuleFinder();

        public override void visit(Generated.Rule obj, bool visitSubNodes)
        {
            currentSet.Add((Rules.Rule)obj);
            base.visit(obj, visitSubNodes);
        }
    }

    /// <summary>
    /// Finds all states
    /// </summary>
    public class ImplementedParagraphsFinder : ModelFinder<Specification.Paragraph>
    {
        /// <summary>
        /// Constructor
        /// </summary>
        private ImplementedParagraphsFinder()
            : base()
        {
        }

        /// <summary>
        /// The instance
        /// </summary>
        public static ImplementedParagraphsFinder INSTANCE = new ImplementedParagraphsFinder();

        /// <summary>
        /// Setup the paragraph cache
        /// </summary>
        /// <param name="obj"></param>
        /// <param name="visitSubNodes"></param>
        public override void visit(Generated.Dictionary obj, bool visitSubNodes)
        {
            paragraphCache = new Dictionary<Specification.Paragraph, HashSet<ReqRef>>();

            base.visit(obj, visitSubNodes);
        }

        public override void visit(Generated.ReqRef obj, bool visitSubNodes)
        {
            ReqRef req = (ReqRef)obj;
            Specification.Paragraph paragraph = req.Paragraph;
            if (paragraph != null && paragraph.getImplementationStatus() == Generated.acceptor.SPEC_IMPLEMENTED_ENUM.aImplemented)
            {
                currentSet.Add(paragraph);

                // Keep track of this req ref
                if (!paragraphCache.ContainsKey(paragraph))
                {
                    paragraphCache[paragraph] = new HashSet<ReqRef>();
                }
                paragraphCache[paragraph].Add(req);
            }
            base.visit(obj, visitSubNodes);
        }

        /// <summary>
        /// The cache
        /// </summary>
        private Dictionary<Specification.Paragraph, HashSet<ReqRef>> paragraphCache = null;

        /// <summary>
        /// Provides the list of refs which reference this paragraph
        /// </summary>
        /// <param name="paragraph"></param>
        /// <returns></returns>
        public HashSet<ReqRef> findRefs(Specification.Paragraph paragraph)
        {
            HashSet<ReqRef> retVal = null;

            if (paragraphCache == null)
            {
                visit(paragraph.Dictionary, true);
            }

            if (paragraphCache.ContainsKey(paragraph))
            {
                retVal = paragraphCache[paragraph];
            }
            else
            {
                retVal = new HashSet<ReqRef>();
            }

            return retVal;
        }

        /// <summary>
        /// Clears the cache
        /// </summary>
        public override void ClearCache()
        {
            base.ClearCache();

            paragraphCache = null;
        }
    }

    /// <summary>
    /// Finds the enclosing namespace
    /// </summary>
    public class EnclosingNameSpaceFinder : Utils.EnclosingFinder<Types.NameSpace>
    {
    }

    /// <summary>
    /// Finds the Namable in the dictionary, based on the name provided
    /// </summary>
    public class OverallNamableFinder : Utils.OverallFinder<Namable>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallNamableFinder INSTANCE = new OverallNamableFinder();
    }

    /// <summary>
    /// Finds the Namespaces in the dictionary, based on the name provided
    /// </summary>
    public class OverallNameSpaceFinder : Utils.OverallFinder<Types.NameSpace>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallNameSpaceFinder INSTANCE = new OverallNameSpaceFinder();
    }

    /// <summary>
    /// Finds the Types in the dictionary, based on the name provided
    /// </summary>
    public class OverallTypeFinder : Utils.OverallFinder<Types.Type>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallTypeFinder INSTANCE = new OverallTypeFinder();
    }

    /// <summary>
    /// Finds the ITypedElement in the dictionary, based on the name provided
    /// </summary>
    public class OverallTypedElementFinder : Utils.OverallFinder<Types.ITypedElement>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallTypedElementFinder INSTANCE = new OverallTypedElementFinder();
    }

    /// <summary>
    /// Finds the IVariable in the dictionary, based on the name provided
    /// </summary>
    public class OverallVariableFinder : Utils.OverallFinder<Variables.IVariable>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallVariableFinder INSTANCE = new OverallVariableFinder();
    }

    /// <summary>
    /// Finds the IValue in the dictionary, based on the name provided
    /// </summary>
    public class OverallValueFinder : Utils.OverallFinder<Values.IValue>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallValueFinder INSTANCE = new OverallValueFinder();
    }

    /// <summary>
    /// Finds the State in the dictionary, based on the name provided
    /// </summary>
    public class OverallStateFinder : Utils.OverallFinder<Constants.State>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallStateFinder INSTANCE = new OverallStateFinder();
    }

    /// <summary>
    /// Finds the State in the dictionary, based on the name provided
    /// </summary>
    public class OverallStructureFinder : Utils.OverallFinder<Types.Structure>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallStructureFinder INSTANCE = new OverallStructureFinder();
    }

    /// <summary>
    /// Finds the Function in the dictionary, based on the name provided
    /// </summary>
    public class OverallFunctionFinder : Utils.OverallFinder<Functions.Function>
    {
        /// <summary>
        /// A static instance used to execute this finder
        /// </summary>
        public static OverallFunctionFinder INSTANCE = new OverallFunctionFinder();
    }
}


