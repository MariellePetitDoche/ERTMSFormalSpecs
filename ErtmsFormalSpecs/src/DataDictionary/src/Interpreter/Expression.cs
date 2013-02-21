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
namespace DataDictionary.Interpreter
{
    using System;
    using System.Collections.Generic;

    /// <summary>
    /// Stores the association between a interpreter tree node and a value
    /// </summary>
    public class ReturnValueElement
    {
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
        public ReturnValueElement(Utils.INamable value, ReturnValueElement previous = null)
        {
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
        /// <param name="value">The value to add</param>
        /// <param name="previous">The previous element in the chain</param>
        public void Add(Utils.INamable value, ReturnValueElement previous = null)
        {
            if (value != null)
            {
                bool found = false;
                foreach (ReturnValueElement elem in Values)
                {
                    if (elem.Value == value)
                    {
                        found = true;
                        break;
                    }
                }

                if (!found)
                {
                    Values.Add(new ReturnValueElement(value, previous));
                }
            }
        }

        /// <summary>
        /// Merges the other return value with this one
        /// </summary>
        /// <param name="previous">The previous ReturnValueElement which lead to this ReturnValueElement</param>
        /// <param name="other">The other return value to merge with</param>
        public void Merge(ReturnValueElement previous, ReturnValue other)
        {
            foreach (ReturnValueElement elem in other.Values)
            {
                Add(elem.Value, previous);
            }
        }

        public override string ToString()
        {
            string retVal = null;

            if (Values.Count > 0)
            {
                foreach (ReturnValueElement elem in Values)
                {
                    if (retVal != null)
                    {
                        retVal = retVal + ", ";
                    }
                    else
                    {
                        retVal = "";
                    }

                    Values.IValue value = elem.Value as Values.IValue;
                    if (value != null)
                    {
                        retVal = retVal + value.LiteralName;
                    }
                    else
                    {
                        retVal = retVal + "<unknown value>";
                    }
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
        public static bool filterOut(bool filterOutTypes, bool filterOutValues, Utils.INamable value)
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
        /// Filters out value according to predicate
        /// </summary>
        /// <param name="accept"></param>
        public void filter(Filter.AcceptableChoice accept)
        {
            List<ReturnValueElement> tmp = new List<ReturnValueElement>();

            foreach (ReturnValueElement element in Values)
            {
                if (accept(element.Value))
                {
                    tmp.Add(element);
                }
            }

            Values = tmp;
        }

        /// <summary>
        /// The empty return value
        /// </summary>
        public static ReturnValue Empty = new ReturnValue();
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
        /// Constructor
        /// </summary>
        /// <param name="instance">The instance on which interpretation should be performed</param>
        public InterpretationContext()
        {
            LocalScope = new SymbolTable();
            Instance = null;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="instance">The instance on which interpretation should be performed</param>
        public InterpretationContext(Utils.INamable instance)
        {
            LocalScope = new SymbolTable();
            Instance = instance;
        }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="other">Copies the other interpretation context contents</param>
        public InterpretationContext(InterpretationContext other)
        {
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
            LocalScope = other.LocalScope;
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
        /// Provides the possible references for this expression (only available during semantic analysis)
        /// </summary>
        /// <param name="instance">the instance on which this element should be found.</param>
        /// <param name="expectation">the expectation on the element found</param>
        /// <returns></returns>
        public virtual ReturnValue getReferences(Utils.INamable instance, Filter.AcceptableChoice expectation)
        {
            return ReturnValue.Empty;
        }

        /// <summary>
        /// Provides the possible references types for this expression (used in semantic analysis)
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns></returns>
        public virtual ReturnValue getReferenceTypes(Utils.INamable instance, Filter.AcceptableChoice expectation)
        {
            ReturnValue retVal = new ReturnValue(this);

            SemanticAnalysis(instance, Filter.AllMatches);
            retVal.Add(GetExpressionType());

            return retVal;
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public virtual bool SemanticAnalysis(Utils.INamable instance, Filter.AcceptableChoice expectation)
        {
            bool retVal = !SemanticAnalysisDone;

            if (retVal)
            {
                SemanticAnalysisDone = true;
            }

            return retVal;
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <returns>True if semantic analysis should be continued</returns>
        public virtual bool SemanticAnalysis(Utils.INamable instance = null)
        {
            return SemanticAnalysis(instance, Filter.AllMatches);
        }

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public abstract Types.Type GetExpressionType();

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
                InterpretationContext context = new InterpretationContext();
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
        /// Provides the variable referenced by this expression, if any
        /// </summary>
        /// <param name="context">The context on which the variable must be found</param>
        /// <returns></returns>
        public virtual Variables.IVariable GetVariable(InterpretationContext context)
        {
            return null;
        }

        /// <summary>
        /// Provides the value of the namable provided as parameter
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        protected Values.IValue getValue(Utils.INamable namable)
        {
            Values.IValue retVal = null;

            Variables.IVariable variable = namable as Variables.IVariable;
            if (variable != null)
            {
                retVal = variable.Value;
            }
            else
            {
                retVal = namable as Values.IValue;
            }

            if (retVal == null)
            {
                AddError(ToString() + " does not refer to a value");
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public virtual Values.IValue GetValue(InterpretationContext context)
        {
            return null;
        }

        /// <summary>
        /// Provides the callable that is called by this expression
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public virtual ICallable getCalled(InterpretationContext context)
        {
            return null;
        }

        /// <summary>
        /// Fills the list provided with the element matching the filter provided
        /// </summary>
        /// <param name="retVal">The list to be filled with the element matching the condition expressed in the filter</param>
        /// <param name="filter">The filter to apply</param>
        public abstract void fill(List<Utils.INamable> retVal, Filter.AcceptableChoice filter);

        /// <summary>
        /// Provides the variables used by this expression
        /// </summary>
        public List<Variables.IVariable> GetVariables()
        {
            List<Variables.IVariable> retVal = new List<Variables.IVariable>();

            List<Utils.INamable> tmp = new List<Utils.INamable>();
            fill(tmp, Filter.IsVariable);

            foreach (Utils.INamable namable in tmp)
            {
                Variables.IVariable variable = namable as Variables.IVariable;
                if (variable != null)
                {
                    retVal.Add(variable);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the list of literals found in the expression
        /// </summary>
        public List<Values.IValue> GetLiterals()
        {
            List<Values.IValue> retVal = new List<Values.IValue>();

            List<Utils.INamable> tmp = new List<Utils.INamable>();
            fill(tmp, Filter.IsValue);

            foreach (Utils.INamable namable in tmp)
            {
                Values.IValue value = namable as Values.IValue;
                if (value != null)
                {
                    retVal.Add(value);
                }
            }

            return retVal;

        }

        /// <summary>
        /// Provides the expression text
        /// </summary>
        /// <returns></returns>
        public override abstract string ToString();

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public virtual void checkExpression()
        {
            GetType();
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public virtual Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            throw new Exception("Cannot create graph for " + ToString());
        }

        /// <summary>
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public virtual Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter)
        {
            throw new Exception("Cannot create graph for " + ToString());
        }


        /// <summary>
        /// Provides the surface of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the surface</param>
        /// <param name="xParam">The X axis of this surface</param>
        /// <param name="yParam">The Y axis of this surface</param>
        /// <returns>The surface which corresponds to this expression</returns>
        public virtual Functions.Surface createSurface(Interpreter.InterpretationContext context, Parameter xParam, Parameter yParam)
        {
            throw new Exception("Cannot create surface for " + ToString());
        }
    }

    /// <summary>
    /// Allows to reference a namable
    /// </summary>
    public interface IReference
    {
        /// <summary>
        /// Provides the referenced element 
        /// </summary>
        Utils.INamable Ref { get; }
    }
}