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
    public class StructExpression : Expression
    {
        /// <summary>
        /// The structure instanciated by this structure expression
        /// </summary>
        public Expression Structure { get; private set; }

        /// <summary>
        /// The associations name <-> Expression that is used to initialize this structure
        /// </summary>
        public Dictionary<string, Expression> Associations { get; private set; }

        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="root"></param>
        public StructExpression(ModelElement root, Expression structure, Dictionary<string, Expression> associations)
            : base(root)
        {
            Structure = structure;
            Associations = associations;
        }

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
                foreach (Expression expr in Associations.Values)
                {
                    expr.SemanticAnalysis(context, false);
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
            return new ReturnValue();
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="localScope">The local scope used to compute the value of this expression</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override INamable InnerGetValue(InterpretationContext context)
        {
            Values.StructureValue retVal = null;

            Types.Structure structureType = Structure.getExpressionType(context) as Types.Structure;
            if (structureType != null)
            {
                retVal = new Values.StructureValue(structureType);

                foreach (KeyValuePair<string, Expression> pair in Associations)
                {
                    Values.IValue val = pair.Value.GetValue(new InterpretationContext(context, Root, true));
                    Variables.Variable var = (Variables.Variable)Generated.acceptor.getFactory().createVariable();
                    var.Name = pair.Key;
                    var.Value = val;
                    var.Enclosing = retVal;
                    retVal.set(var);
                }
            }
            else
            {
                AddError("Cannot determine structure type for " + ToString());
            }

            return retVal;
        }

        /// <summary>
        /// Fills the list of element used by this expression
        /// </summary>
        /// <param name="elements"></param>
        public override void Elements(InterpretationContext context, List<Types.ITypedElement> elements)
        {
            foreach (Expression expression in Associations.Values)
            {
                expression.Elements(context, elements);
            }
        }

        /// <summary>
        /// Provides the expression text
        /// </summary>
        /// <returns></returns>
        public override string ToString()
        {
            return ToString(0);
        }

        /// <summary>
        /// Provides the indented expression text
        /// </summary>
        /// <param name="indentLevel"></param>
        /// <returns></returns>
        private string ToString(int indentLevel)
        {
            string retVal = Structure.ToString();
            string indentAccolade = "";
            for (int i = 0; i < indentLevel; i++)
            {
                indentAccolade += "    ";
            }
            string indentText = indentAccolade + "    ";
            bool first = true;
            retVal = retVal + "\n" + indentAccolade + "{";
            foreach (KeyValuePair<string, Expression> pair in Associations)
            {
                if (first)
                {
                    retVal = retVal + "\n" + indentText;
                    first = false;
                }
                else
                {
                    retVal = retVal + ",\n" + indentText;
                }
                StructExpression expression = pair.Value as StructExpression;
                if (expression != null)
                {
                    retVal = retVal + pair.Key + " => " + expression.ToString(indentLevel + 1);
                }
                else
                {
                    retVal = retVal + pair.Key + " => " + pair.Value.ToString();
                }
            }
            retVal = retVal + "\n" + indentAccolade + "}";

            return retVal;
        }

        /// <summary>
        /// Fills the list of literals with the literals found in this expression and sub expressions
        /// </summary>
        /// <param name="retVal"></param>
        public override void fillLiterals(List<Values.IValue> retVal)
        {
            foreach (Expression expression in Associations.Values)
            {
                fillLiterals(retVal);
            }
        }

        /// <summary>
        /// Updates the expression by replacing source by target
        /// </summary>
        /// <param name="source"></param>
        /// <param name="target"></param>
        public override Expression Update(Values.IValue source, Values.IValue target)
        {
            Dictionary<string, Expression> newAssociations = new Dictionary<string, Expression>();

            foreach (KeyValuePair<string, Expression> pair in Associations)
            {
                newAssociations[pair.Key] = Update(source, target);
            }
            Associations = newAssociations;

            return this;
        }

        /// <summary>
        /// Provides the type of the expression
        /// </summary>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override ReturnValue getExpressionTypes(InterpretationContext context)
        {
            ReturnValue retVal = new ReturnValue(this);

            retVal.Add(null, Structure.getExpressionType(context));

            return retVal;
        }

        /// <summary>
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression(InterpretationContext context)
        {
            Types.Structure structureType = Structure.getExpressionType(context) as Types.Structure;
            if (structureType != null)
            {
                foreach (KeyValuePair<string, Expression> pair in Associations)
                {
                    string name = pair.Key;
                    Expression expression = pair.Value;

                    List<Utils.INamable> targets = new List<Utils.INamable>();
                    structureType.find(name, targets);
                    if (targets.Count > 0)
                    {
                        expression.checkExpression(context);
                        Types.Type type = expression.getExpressionType(context);
                        if (type != null)
                        {
                            foreach (Utils.INamable namable in targets)
                            {
                                Types.ITypedElement element = namable as Types.ITypedElement;
                                if (element != null && element.Type != null)
                                {
                                    if (!element.Type.Match(type))
                                    {
                                        AddError("Expression " + expression.ToString() + " type (" + type.FullName + ") does not match the target element " + element.Name + " type (" + element.Type.FullName + ")");
                                    }
                                }
                            }
                        }
                        else
                        {
                            AddError("Expression " + expression.ToString() + " type cannot be found");
                        }
                    }
                    else
                    {
                        Root.AddError("Cannot find " + name + " in structure " + Structure.ToString());
                    }
                }
            }
            else
            {
                AddError("Cannot find structure type " + Structure.ToString());
            }
        }

        /// <summary>
        /// Provides the graph of this function if it has been statically defined
        /// </summary>
        /// <param name="context">the context used to create the graph</param>
        /// <returns></returns>
        public override Functions.Graph createGraph(Interpreter.InterpretationContext context)
        {
            throw new Exception("Cannot create graph for " + ToString());
        }

        /// <summary>
        /// Creates the graph associated to this expression, when the given parameter ranges over the X axis
        /// </summary>
        /// <param name="context">The interpretation context</param>
        /// <param name="parameter">The parameters of *the enclosing function* for which the graph should be created</param>
        /// <returns></returns>
        public override Functions.Graph createGraphForParameter(InterpretationContext context, Parameter parameter)
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
        public override Functions.Surface createSurface(Interpreter.InterpretationContext context, Parameter xParam, Parameter yParam)
        {
            throw new Exception("Cannot create surface for " + ToString());
        }
    }
}
