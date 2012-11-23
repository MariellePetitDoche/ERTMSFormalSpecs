using System;
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
    /// <summary>
    /// Stores the association between a interpreter tree node and a value
    /// </summary>
    public class ReturnValueElement
    {
        /// <summary>
        /// The tree node
        /// </summary>
        public InterpreterTreeNode Node { get; set; }

        /// <summary>
        /// The previous return value element in the 
        /// </summary>
        public ReturnValueElement PreviousElement { get; set; }

        /// <summary>
        /// The value
        /// </summary>
        public Utils.INamable Value { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="value"></param>
        /// <param name="previous"></param>
        /// <param name="node"></param>
        public ReturnValueElement(Utils.INamable value, ReturnValueElement previous = null, InterpreterTreeNode node = null)
        {
            Node = node;
            PreviousElement = previous;
            Value = value;
        }
    }

    /// <summary>
    /// The possible return values for InnerGetValue
    /// </summary>
    public class ReturnValue
    {
        /// <summary>
        /// The interpreter tree node on which these values are linked
        /// </summary>
        public InterpreterTreeNode Node { get; private set; }

        /// <summary>
        /// The values of this return value
        /// </summary>
        public List<ReturnValueElement> Values { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        public ReturnValue(InterpreterTreeNode node)
        {
            Node = node;
            Values = new List<ReturnValueElement>();
        }

        /// <summary>
        /// Constructor
        /// </summary>
        public ReturnValue()
        {
            Node = null;
            Values = new List<ReturnValueElement>();
        }

        /// <summary>
        /// Indicates if there is more than one value in the result set
        /// </summary>
        public bool IsAmbiguous { get { return Values.Count > 1; } }

        /// <summary>
        /// Indicates if there is only one value in the result set
        /// </summary>
        public bool IsUnique { get { return Values.Count == 1; } }

        /// <summary>
        /// Indicates if there is no more value in the result set
        /// </summary>
        public bool IsEmpty { get { return Values.Count == 0; } }

        /// <summary>
        /// Adds a new value in the set of return values
        /// </summary>
        /// <param name="value"></param>
        public void Add(Utils.INamable value)
        {
            Add(null, value);
        }

        /// <summary>
        /// Adds a new value in the set of return values
        /// </summary>
        /// <param name="value"></param>
        public void Add(InterpreterTreeNode node, Utils.INamable value)
        {
            bool found = false;
            foreach (ReturnValueElement element in Values)
            {
                if (element.Value == value)
                {
                    found = true;
                    break;
                }
            }

            if (!found)
            {
                Add(node, null, value);
            }
        }

        /// <summary>
        /// Adds a new value in the set of return values
        /// </summary>
        /// <param name="value"></param>
        public void Add(InterpreterTreeNode node, ReturnValueElement previous, Utils.INamable value)
        {
            if (value != null)
            {
                bool found = false;
                foreach (ReturnValueElement elem in Values)
                {
                    if (elem.Node == node && elem.Value == value)
                    {
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    Values.Add(new ReturnValueElement(value, previous, node));
                }
            }
        }

        /// <summary>
        /// Merges the other return value with this one
        /// </summary>
        /// <param name="other"></param>
        public void Merge(InterpreterTreeNode node, ReturnValueElement previous, ReturnValue other)
        {
            foreach (ReturnValueElement elem in other.Values)
            {
                Add(node, previous, elem.Value);
            }
        }

        public override string ToString()
        {
            string retVal = null;

            if (Values.Count > 0)
            {
                foreach (ReturnValueElement elem in Values)
                {
                    Values.IValue value = elem.Value as Values.IValue;
                    if (retVal != null)
                    {
                        retVal = retVal + ", ";
                    }
                    else
                    {
                        retVal = "";
                    }
                    retVal = retVal + value.LiteralName;
                }
            }
            else
            {
                retVal = "<nothing>";
            }

            return retVal;
        }

        /// <summary>
        /// Indicates whether the value should be filtered out depending on the filter value flag or filter type flag
        /// </summary>
        /// <param name="filterOutTypes"></param>
        /// <param name="filterOutValues"></param>
        /// <param name="value"></param>
        /// <returns></returns>
        public static bool filterOut(bool filterOutTypes, bool filterOutValues, INamable value)
        {
            bool retVal = false;

            Types.Type theType = value as Types.Type;
            Types.StructureElement theElement = value as Types.StructureElement;
            bool isType = theType != null || theElement != null;

            Values.IValue theValue = value as Values.IValue;
            Parameter theParameter = value as Parameter;
            bool isValue = theValue != null || theParameter != null;
            if (isType && isValue)
            {
                // Element is both a type and a value. Keep it.
            }
            else
            {
                if (filterOutTypes && isType)
                {
                    retVal = true;
                }

                // fiterOutValues => isValue
                if (filterOutValues && isValue)
                {
                    retVal = true;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Filters out types or values according to parameters
        /// </summary>
        /// <param name="filterOutTypes"></param>
        /// <param name="filterOutValues"></param>
        public void filterTypeOrValue(bool filterOutTypes, bool filterOutValues)
        {
            List<ReturnValueElement> tmp = new List<ReturnValueElement>();

            foreach (ReturnValueElement element in Values)
            {
                if (!filterOut(filterOutTypes, filterOutValues, element.Value))
                {
                    tmp.Add(element);
                }
            }

            Values = tmp;
        }
    }

    /// <summary>
    /// An interpretation context 
    /// </summary>
    public class InterpretationContext
    {
        /// <summary>
        /// The instance on which the expression is checked
        /// </summary>
        public Utils.INamable Instance { get; set; }

        /// <summary>
        /// The local scope for interpretation
        /// </summary>
        public SymbolTable LocalScope { get; private set; }

        /// <summary>
        /// Indicates wether the lookup for identifiers shoud be performed globally or locally
        /// </summary>
        public bool GlobalFind { get; set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="instance">The instance on which interpretation should be performed</param>
        public InterpretationContext(Utils.INamable instance)
        {
            GlobalFind = true;
            LocalScope = new SymbolTable();
            Instance = instance;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="other">Copies the other interpretation context contents</param>
        public InterpretationContext(InterpretationContext other)
        {
            GlobalFind = other.GlobalFind;
            LocalScope = other.LocalScope;
            Instance = other.Instance;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="other">Copies the other interpretation context contents</param>
        /// <param name="globalFind">Override the values of GlobalFind</param>
        public InterpretationContext(InterpretationContext other, bool globalFind)
        {
            GlobalFind = globalFind;
            LocalScope = other.LocalScope;
            Instance = other.Instance;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="other">Copies the other interpretation context contents</param>
        /// <param name="instance">The evaluation instance</param>
        public InterpretationContext(InterpretationContext other, Utils.INamable instance)
        {
            GlobalFind = other.GlobalFind;
            LocalScope = other.LocalScope;
            Instance = instance;
        }


        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="other">Copies the other interpretation context contents</param>
        /// <param name="instance">The evaluation instance</param>
        /// <param name="globalFind">Override the values of GlobalFind</param>
        public InterpretationContext(InterpretationContext other, Utils.INamable instance, bool globalFind)
        {
            GlobalFind = globalFind;
            LocalScope = other.LocalScope;
            Instance = instance;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="instance">The evaluation instance</param>
        /// <param name="localScope">the local scope</param>
        /// <param name="globalFind">Override the values of GlobalFind</param>
        public InterpretationContext(Utils.INamable instance, SymbolTable localScope, bool globalFind)
        {
            GlobalFind = globalFind;
            LocalScope = localScope;
            Instance = instance;
        }

        /// <summary>
        /// Provides the list of parameters whose value is a placeholder
        /// </summary>
        /// <returns></returns>
        public List<Parameter> PlaceHolders()
        {
            return LocalScope.PlaceHolders();
        }
    }


    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
     * The grammar is following:                                     *
     * Expression0      -> Expression1 Expression0Cont               *
     * Expression0Cont  -> OR Expression1 Expression0Cont            *
     * Expression0Cont  -> Epsilon                                   *
     * Expression1      -> Expression2 Expression1Cont               *
     * Expression1Cont  -> AND Expression2 Expression1Cont           *
     * Expression1Cont  -> Epsilon                                   *
     * Expression2      -> Expression3 Expression2Cont               *
     * Expression2Cont  -> {+, -} Expression3 Expression2Cont        *
     * Expression2Cont  -> Epsilon                                   *
     * Expression3      -> Expression4 Expression3Cont               *
     * Expression3Cont  -> {*, /} Expression4 Expression3Cont        *
     * Expression3Cont  -> Epsilon                                   *
     * Expression4      -> Expression5 Expression4Cont               *
     * Expression4Cont  -> {^} Expression5 Expression4Cont           *
     * Expression4Cont  -> Epsilon                                   *
     * Expression5      -> Term {+, -}                               *
     * Term             -> Literal                                   *
     * Term             -> Desig                                     *
     * Term             -> Desig (arg1, ...)                         *
     * Term             -> (Expression0)                             *
     *                                                               *
     * =>                                                            *
     * Expression_i     -> Expression_i+1 Expression_iCont           *
     * Expression_iCont -> {op_i+1} Expression_i+1 Expression_iCont  *
     * Expression_iCont -> Epsilon                                   *
     * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

    public abstract class Expression : InterpreterTreeNode
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root">The root for which this expression should be evaluated</param>
        public Expression(ModelElement root)
            : base(root)
        {
        }

        /// <summary>
        /// Indicates whether the semantic analysis has been performed for this expression
        /// </summary>
        protected bool SemanticAnalysisDone { get; private set; }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="context"></param>
        /// <paraparam name="type">Indicates whether we are looking for a type or a value</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public virtual bool SemanticAnalysis(InterpretationContext context, bool type)
        {
            bool retVal = !SemanticAnalysisDone;

            SemanticAnalysisDone = true;

            return retVal;
        }

        /// <summary>
        /// Provides the typed element associated to this Expression 
        /// </summary>
        /// <param name="context">The context on which the typed element must be found</param>
        /// <returns></returns>
        public abstract ReturnValue InnerGetTypedElement(InterpretationContext context);

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public virtual Types.Type GetType(InterpretationContext context)
        {
            return GetTypedElement(context).Type;
        }

        /// <summary>
        /// Provides the typed element referenced by this expression, if any
        /// </summary>
        /// <param name="context">The context on which the typed element must be found</param>
        /// <returns></returns>
        public Types.ITypedElement GetTypedElement(InterpretationContext context)
        {
            Types.ITypedElement retVal = null;

            foreach (ReturnValueElement elem in InnerGetTypedElement(context).Values)
            {
                retVal = elem.Value as Types.ITypedElement;
                if (retVal != null)
                {
                    break;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Indicates that all the steps related to the evaluation of the expression should be provided
        /// </summary>
        protected static bool explain = false;

        /// <summary>
        /// The part of the explanation that is being explained
        /// </summary>
        protected static ExplanationPart currentExplanation;

        /// <summary>
        /// Setups the explanation
        /// </summary>
        /// <param name="previous">The previous explanation to store</param>
        /// <returns>The previous explanation (the one for which this is setup)</returns>
        protected ExplanationPart SetupExplanation()
        {
            ExplanationPart retVal = currentExplanation;

            if (explain)
            {
                ExplanationPart part = new ExplanationPart();
                currentExplanation.SubExplanations.Add(part);
                currentExplanation = part;
            }

            return retVal;
        }

        /// <summary>
        /// Completes the explanation
        /// </summary>
        /// <param name="message">the message to set to the current explanation</param>
        /// <param name="previous">the explanation for which this one is created</param>
        protected void CompleteExplanation(ExplanationPart previous, string message)
        {
            currentExplanation.Message = message;
            currentExplanation = previous;
        }

        /// <summary>
        /// Provides all the steps used to get the value of the expression
        /// </summary>
        /// <returns></returns>
        public ExplanationPart Explain()
        {
            ExplanationPart retVal = new ExplanationPart();
            currentExplanation = retVal;

            try
            {
                explain = true;
                InterpretationContext context = new InterpretationContext(Root);
                Values.IValue value = GetValue(context);
                if (value != null)
                {
                    retVal.Message = ToString() + " = " + value.LiteralName;
                }
                else
                {
                    retVal.Message = "Cannot evaluate value for " + ToString();
                }
            }
            finally
            {
                explain = false;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public abstract INamable InnerGetValue(InterpretationContext context);

        /// <summary>
        /// Provides the variable referenced by this expression, if any
        /// </summary>
        /// <param name="context">The context on which the variable must be found</param>
        /// <returns></returns>
        public Variables.IVariable GetVariable(InterpretationContext context)
        {
            SemanticAnalysis(context, false);
            Variables.IVariable retVal = InnerGetValue(context) as Variables.IVariable;

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public Values.IValue GetValue(InterpretationContext context)
        {
            Values.IValue retVal = null;

            SemanticAnalysis(context, false);
            INamable namable = InnerGetValue(context);
            retVal = namable as Values.IValue;
            if (retVal == null)
            {
                Variables.IVariable variable = namable as Variables.IVariable;
                if (variable != null)
                {
                    retVal = variable.Value;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the callable that is called by this expression
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public virtual ICallable getCalled(InterpretationContext context)
        {
            return GetValue(context) as ICallable;
        }

        /// <summary>
        /// Fills the list of element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public abstract void Elements(InterpretationContext context, List<Types.ITypedElement> elements);

        /// <summary>
        /// Provides the variables used by this expression
        /// </summary>
        public List<Types.ITypedElement> Elements()
        {
            List<Types.ITypedElement> retVal = new List<Types.ITypedElement>();

            bool prev = ModelElement.PerformLog;
            ModelElement.PerformLog = false;
            try
            {
                Elements(new InterpretationContext(Root), retVal);
            }
            finally
            {
                ModelElement.PerformLog = prev;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the expression text
        /// </summary>
        /// <returns></returns>
        public override abstract string ToString();

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public abstract void fillLiterals(List<Values.IValue> retVal);

        /// <summary>
        /// Provides the list of literals found in the expression
        /// </summary>
        public List<Values.IValue> Literals
        {
            get
            {
                List<Values.IValue> retVal = new List<Values.IValue>();

                bool prev = ModelElement.PerformLog;
                ModelElement.PerformLog = false;
                try
                {

                    fillLiterals(retVal);
                }
                finally
                {
                    ModelElement.PerformLog = prev;
                }
                return retVal;
            }
        }

        /// <summary>
        /// Updates the expression by replacing source by target
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public abstract Expression Update(Values.IValue source, Values.IValue target);

        /// <summary>
        /// Provides the type of the expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public abstract ReturnValue getExpressionTypes(InterpretationContext context);


        /// <summary>
        /// Provides the expression type
        /// </summary>
        /// <returns></returns>
        public Types.Type getExpressionType()
        {
            return getExpressionType(new InterpretationContext(Root));
        }

        /// <summary>
        /// Provides the expression type
        /// </summary>
        /// <param name="raiseErrors">Indicates whether errors should be raised while trying to get the expression type<param>
        /// <returns></returns>
        public Types.Type getExpressionType(bool raiseErrors)
        {
            Types.Type retVal = null;

            if (!raiseErrors)
            {
                bool backup = ModelElement.PerformLog;
                try
                {
                    ModelElement.PerformLog = false;

                    retVal = getExpressionType(new InterpretationContext(Root));
                }
                finally
                {
                    ModelElement.PerformLog = backup;
                }
            }
            else
            {
                retVal = getExpressionType(new InterpretationContext(Root));
            }

            return retVal;
        }

        /// <summary>
        /// Provides the expression type
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public Types.Type getExpressionType(InterpretationContext context)
        {
            Types.Type retVal = null;

            foreach (ReturnValueElement elem in getExpressionTypes(context).Values)
            {
                Types.Type type = elem.Value as Types.Type;
                if (type != null)
                {
                    if (retVal == null)
                    {
                        retVal = type;
                        break;
                    }
                    else
                    {
                        AddError("Expression " + ToString() + " holds several types : " + retVal.FullName + " and  " + type.FullName);
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public virtual void checkExpression(InterpretationContext context)
        {
            getExpressionType(context);
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public abstract Functions.Graph createGraph(Interpreter.InterpretationContext context);

        /// <summary>
        /// Creates the graph associated to the called function, when the given parameter is the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public abstract Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter);

        /// <summary>
        /// Provides the surface of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the surface</param>
        /// <param name="xParam">The X axis of this surface</param>
        /// <param name="yParam">The Y axis of this surface</param>
        /// <returns>The surface which corresponds to this expression</returns>
        public abstract Functions.Surface createSurface(Interpreter.InterpretationContext context, Parameter xParam, Parameter yParam);
    }

    /// <summary>
    /// Allows to reference a namable
    /// </summary>
    public interface IReference
    {
        /// <summary>
        /// Sets the reference for this element. 
        /// </summary>
        /// <param name="reference"></param>
        /// <returns>If reference could be set</returns>
        bool setReference(Utils.INamable reference);

        /// <summary>
        /// Provides the referenced element 
        /// </summary>
        Utils.INamable Ref { get; }
    }
}