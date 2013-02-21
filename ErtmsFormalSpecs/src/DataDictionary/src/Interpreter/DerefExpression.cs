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
        /// The model element referenced by this designator.
        /// </summary>
        public INamable Ref { get; private set; }

        /// <summary>
        /// Provides the ICallable referenced by this 
        /// </summary>
        public ICallable Called
        {
            get
            {
                return Ref as ICallable;
            }
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(Utils.INamable instance, AcceptableChoice expectation)
        {
            bool retVal = base.SemanticAnalysis(instance, expectation);

            if (retVal)
            {
                Ref = null;

                ReturnValue tmp = Arguments[0].getReferences(null, AllMatches);
                if (tmp.IsEmpty)
                {
                    tmp = Arguments[0].getReferenceTypes(instance, AllMatches);
                }

                if (!tmp.IsEmpty)
                {
                    for (int i = 1; i < Arguments.Count; i++)
                    {
                        ReturnValue tmp2 = tmp;
                        tmp = new ReturnValue(Arguments[i]);

                        foreach (ReturnValueElement elem in tmp2.Values)
                        {
                            tmp.Merge(elem, Arguments[i].getReferences(elem.Value, AllMatches));
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

                tmp.filter(expectation);
                if (tmp.IsUnique)
                {
                    // Unique element has been found. Reference it and perform the semantic analysis 
                    // on all dereferenced expression, now that the context is known for each expression
                    Ref = tmp.Values[0].Value;

                    ReturnValueElement current = tmp.Values[0];
                    for (int i = Arguments.Count - 1; i > 0; i--)
                    {
                        current = current.PreviousElement;
                        Arguments[i].SemanticAnalysis(current.Value);
                    }
                    Arguments[0].SemanticAnalysis(null);
                }
                else
                {
                    // Several interpretation possible for this deref expression is not allowed
                    AddError("Expression " + ToString() + " may have several interpretations " + tmp.ToString() + ", please disambiguate");
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the type of this expression
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <returns></returns>
        public override Types.Type GetExpressionType()
        {
            Types.Type retVal = Ref as Types.Type;

            if (retVal == null)
            {
                Types.ITypedElement typedElement = Ref as Types.ITypedElement;
                if (typedElement != null)
                {
                    retVal = typedElement.Type;
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the variable referenced by this expression, if any
        /// </summary>
        /// <param name="context">The context on which the variable must be found</param>
        /// <returns></returns>
        public override Variables.IVariable GetVariable(InterpretationContext context)
        {
            INamable current = null;

            InterpretationContext ctxt = new InterpretationContext(context);
            for (int i = 0; i < Arguments.Count; i++)
            {
                if (current != null)
                {
                    // Current can be null on several loop iterations when the referenced element
                    // does not references a variable (for instance, when it references a namespace)
                    ctxt.Instance = current;
                }
                current = Arguments[i].GetVariable(context);
            }

            return current as Variables.IVariable;
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="context">The context on which the value must be found</param>
        /// <returns></returns>
        public override Values.IValue GetValue(InterpretationContext context)
        {
            INamable current = null;

            InterpretationContext ctxt = new InterpretationContext(context);
            for (int i = 0; i < Arguments.Count; i++)
            {
                if (current != null)
                {
                    ctxt.Instance = current;
                }
                current = Arguments[i].GetValue(ctxt);
            }

            return current as Values.IValue;
        }

        /// <summary>
        /// Provides the callable that is called by this expression
        /// </summary>
        /// <param name="namable"></param>
        /// <returns></returns>
        public override ICallable getCalled(InterpretationContext context)
        {
            ICallable retVal = Called;

            if (retVal == null)
            {
                AddError("Cannot evaluate call to " + ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list of variables used by this expression
        /// </summary>
        /// <context></context>
        /// <param name="variables"></param>
        public override void FillVariables(InterpretationContext ctxt, List<Variables.IVariable> variables)
        {
            if (Ref != null)
            {
                Variables.IVariable variable = Ref as Variables.IVariable;
                if (variable != null)
                {
                    variables.Add(variable);
                }
            }
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            if (Ref != null)
            {
                Values.IValue value = Ref as Values.IValue;
                if (value != null)
                {
                    retVal.Add(value);
                }
            }
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
        public override void checkExpression()
        {
            base.checkExpression();
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
