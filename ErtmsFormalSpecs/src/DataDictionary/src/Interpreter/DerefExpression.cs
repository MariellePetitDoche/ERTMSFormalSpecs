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
using System;
using System.Collections.Generic;
using Utils;

namespace DataDictionary.Interpreter
{
    public class DerefExpression : Expression, IReference
    {
        /// <summary>
        /// Desig elements of this designator
        /// </summary>
        public List<Expression> Arguments { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="left"></param>
        /// <param name="op"></param>
        /// <param name="right"></param>
        public DerefExpression(ModelElement root, List<Expression> arguments)
            : base(root)
        {
            Arguments = arguments;

            foreach (Expression expr in Arguments)
            {
                expr.Enclosing = this;
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
        /// Provides the ICallable referenced by this 
        /// </summary>
        public ICallable Called { get; private set; }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="context"></param>
        /// <paraparam name="type">Indicates whether we are looking for a type or a value</paraparam>
        public override bool SemanticAnalysis(InterpretationContext context, bool type)
        {
            bool retVal = base.SemanticAnalysis(context, type);

            if (retVal)
            {
                Ref = null;
                Called = null;

                ReturnValue tmp = Arguments[0].InnerGetTypedElement(context);
                if (tmp.IsEmpty)
                {
                    type = true;
                    tmp.Add(this, Arguments[0].getExpressionType(context));
                }
                if (!tmp.IsEmpty)
                {
                    for (int i = 1; i < Arguments.Count; i++)
                    {
                        ReturnValue tmp2 = tmp;
                        tmp = new ReturnValue(Arguments[i]);

                        foreach (ReturnValueElement elem in tmp2.Values)
                        {
                            InterpretationContext ctxt = new InterpretationContext(context, elem.Value, false);
                            tmp.Merge(Arguments[i], elem, Arguments[i].InnerGetTypedElement(ctxt));
                        }

                        if (tmp.IsEmpty)
                        {
                            AddError("Cannot find " + Arguments[i].ToString() + " in " + Arguments[i - 1].ToString());
                        }
                    }
                }
                else
                {
                    AddError("Cannot evaluate " + Arguments[0].ToString());
                }

                // Keep references to called elements
                foreach (ReturnValueElement element in tmp.Values)
                {
                    ICallable callable = element.Value as ICallable;
                    if (callable != null)
                    {
                        if (Called == null)
                        {
                            Called = callable;
                        }
                        else
                        {
                            AddError("Two different elements can be called by designator " + ToString());
                        }
                    }
                }

                tmp.filterTypeOrValue(!type, type);
                if (tmp.IsUnique)
                {
                    // Try to set Ref for this deref expression, 
                    if (!setReference(tmp.Values[0].Value))
                    {
                        // If setting Ref is not possible, disambiguate as much arguments as possible of the Deref expression
                        ReturnValueElement current = tmp.Values[0];

                        bool referenceSet = false;
                        while (current != null && !referenceSet)
                        {
                            IReference reference = current.Node as IReference;
                            if (reference != null)
                            {
                                referenceSet = reference.setReference(current.Value);
                            }
                            current = current.PreviousElement;
                        }
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the typed element associated to this Expression 
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="localScope">The local scope used to compute the value of this expression</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override ReturnValue InnerGetTypedElement(InterpretationContext context)
        {
            ReturnValue retVal = Arguments[0].InnerGetTypedElement(context);
            if (!retVal.IsEmpty)
            {
                for (int i = 1; i < Arguments.Count; i++)
                {
                    ReturnValue tmp = retVal;
                    retVal = new ReturnValue(Arguments[i]);

                    foreach (ReturnValueElement elem in tmp.Values)
                    {
                        InterpretationContext ctxt = new InterpretationContext(context, elem.Value, false);
                        retVal.Merge(Arguments[i], elem, Arguments[i].InnerGetTypedElement(ctxt));
                    }

                    if (retVal.IsEmpty)
                    {
                        AddError("Cannot find " + Arguments[i].ToString() + " in " + Arguments[i - 1].ToString());
                    }
                }
            }
            else
            {
                AddError("Cannot evaluate " + Arguments[0].ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Provides the value associated to this Term
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override INamable InnerGetValue(InterpretationContext context)
        {
            INamable retVal = null;
            if (Ref != null)
            {
                retVal = Ref;
            }
            else
            {
                retVal = Arguments[0].InnerGetValue(context);
                if (retVal != null)
                {
                    for (int i = 1; i < Arguments.Count; i++)
                    {
                        InterpretationContext ctxt = new InterpretationContext(context, retVal, false);
                        retVal = Arguments[i].InnerGetValue(ctxt);

                        if (retVal == null)
                        {
                            AddError("Cannot find " + Arguments[i].ToString() + " in " + Arguments[i - 1].ToString());
                        }
                    }
                }
                else
                {
                    AddError("Cannot evaluate " + Arguments[0].ToString());
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the typed element referenced by this . expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        public Types.ITypedElement getTypedElement(InterpretationContext context)
        {
            Types.ITypedElement retVal = InnerGetValue(context) as Types.ITypedElement;

            return retVal;
        }

        /// <summary>
        /// Dereferences a namable
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        private Utils.INamable deref(Utils.INamable namable)
        {
            Utils.INamable retVal = namable;

            Functions.Function function = namable as Functions.Function;
            if (function != null)
            {
                retVal = function.Type;
            }

            return retVal;
        }

        /// <summary>
        /// Provides the type of the expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override ReturnValue getExpressionTypes(InterpretationContext context)
        {
            ReturnValue retVal = Arguments[0].getExpressionTypes(context);
            if (!retVal.IsEmpty)
            {
                for (int i = 1; i < Arguments.Count; i++)
                {
                    ReturnValue tmp = retVal;
                    retVal = new ReturnValue(tmp.Node);

                    foreach (ReturnValueElement elem in tmp.Values)
                    {
                        InterpretationContext ctxt = new InterpretationContext(context, elem.Value, false);
                        retVal.Merge(this, elem, Arguments[i].getExpressionTypes(ctxt));
                    }

                    if (retVal.IsEmpty)
                    {
                        AddError("Cannot find " + Arguments[i].ToString() + " in " + Arguments[i - 1].ToString());
                    }
                }
            }
            else
            {
                AddError("Cannot evaluate " + Arguments[0].ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Provides the callable that is called by this expression
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public override ICallable getCalled(InterpretationContext context)
        {
            if (Called == null)
            {
                AddError("Cannot evaluate call to " + ToString());
            }
            return Called;
        }

        /// <summary>
        /// Fills the list of element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext ctxt, List<Types.ITypedElement> elements)
        {
            Types.ITypedElement element = getTypedElement(ctxt);
            if (element != null)
            {
                elements.Add(element);
            }
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            Values.IValue value = InnerGetValue(new InterpretationContext(Root)) as Values.IValue;
            if (value != null)
            {
                retVal.Add(value);
            }
        }

        /// <summary>
        /// Updates the expression text
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public override Expression Update(Values.IValue source, Values.IValue target)
        {
            Expression retVal = this;

            if (ToString().CompareTo(source.LiteralName) == 0)
            {
                Parser parser = new Parser(EFSSystem);
                retVal = parser.Expression(Root, target.LiteralName);
                if (retVal == null)
                {
                    retVal = this;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the string representation of the binary expression
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            string retVal = "";

            bool first = true;
            foreach (Expression expr in Arguments)
            {
                if (!first)
                {
                    retVal += ".";
                }
                retVal += expr.ToString();

                first = false;
            }

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        /// <param name="context">The interpretation context</param>
        public override void checkExpression(InterpretationContext context)
        {
            Arguments[0].checkExpression(context);

            checkRightPart(context, 1);
        }

        /// <summary>
        /// Checks the right part of the expression, based on the interpretation context for the left part
        /// </summary>
        /// <param name="context"></param>
        /// <param name="i"></param>
        private void checkRightPart(InterpretationContext context, int i)
        {
            ReturnValue lType = Arguments[i - 1].getExpressionTypes(context);
            if (!lType.IsEmpty)
            {
                foreach (ReturnValueElement elem in lType.Values)
                {
                    InterpretationContext ctxt = new InterpretationContext(context, deref(elem.Value), false);
                    Arguments[i].checkExpression(ctxt);
                    if (i < Arguments.Count - 1)
                    {
                        checkRightPart(ctxt, i + 1);
                    }
                }
            }
            else
            {
                // TODO: handle this. Errors can occur, but the problem lies when there are errors in all branches
                // Shall be avoided by a decent type analysis
                // AddError("Cannot determine reference of " + Arguments[i - 1].ToString());
            }
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            Functions.Graph retVal = null;

            retVal = Functions.Graph.createGraph(GetValue(context));

            if (retVal == null)
            {
                throw new Exception("Cannot create graph for " + ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public override Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter)
        {
            Functions.Graph retVal = null;

            retVal = Functions.Graph.createGraph(GetValue(context));

            if (retVal == null)
            {
                throw new Exception("Cannot create graph for " + ToString());
            }

            return retVal;
        }


        /// <summary>
        /// Provides the surface of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the surface</param>
        /// <param name="xParam">The X axis of this surface</param>
        /// <param name="yParam">The Y axis of this surface</param>
        /// <returns>The surface which corresponds to this expression</returns>
        public override Functions.Surface createSurface(Interpreter.InterpretationContext context, Parameter xParam, Parameter yParam)
        {
            Functions.Surface retVal = null;

            retVal = Functions.Surface.createSurface(GetValue(context), xParam, yParam);

            if (retVal == null)
            {
                throw new Exception("Cannot create surface for " + ToString());
            }

            retVal.XParameter = xParam;
            retVal.YParameter = yParam;

            return retVal;
        }

    }
}
