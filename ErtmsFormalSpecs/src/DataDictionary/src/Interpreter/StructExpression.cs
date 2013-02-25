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
            foreach (Expression expr in Associations.Values)
            {
                expr.Enclosing = this;
            }
        }

        /// <summary>
        /// Performs the semantic analysis of the expression
        /// </summary>
        /// <param name="instance">the reference instance on which this element should analysed</param>
        /// <paraparam name="expectation">Indicates the kind of element we are looking for</paraparam>
        /// <returns>True if semantic analysis should be continued</returns>
        public override bool SemanticAnalysis(Utils.INamable instance, Filter.AcceptableChoice expectation)
        {
            bool retVal = base.SemanticAnalysis(instance, expectation);

            if (retVal)
            {
                Structure.SemanticAnalysis(instance, Filter.IsStructure);
                foreach (Expression expr in Associations.Values)
                {
                    expr.SemanticAnalysis(instance, Filter.IsRightSide);
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
            return Structure.GetExpressionType();
        }

        /// <summary>
        /// Provides the value associated to this Expression
        /// </summary>
        /// <param name="instance">The instance on which the value is computed</param>
        /// <param name="localScope">The local scope used to compute the value of this expression</param>
        /// <param name="globalFind">Indicates that the search should be performed globally</param>
        /// <returns></returns>
        public override Values.IValue GetValue(InterpretationContext context)
        {
            Values.StructureValue retVal = null;

            Types.Structure structureType = Structure.GetExpressionType() as Types.Structure;
            if (structureType != null)
            {
                retVal = new Values.StructureValue(structureType);

                foreach (KeyValuePair<string, Expression> pair in Associations)
                {
                    Values.IValue val = pair.Value.GetValue(new InterpretationContext(context));
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
        /// Fills the list provided with the element matching the filter provided
        /// </summary>
        /// <param name="retVal">The list to be filled with the element matching the condition expressed in the filter</param>
        /// <param name="filter">The filter to apply</param>
        public override void fill(List<Utils.INamable> retVal, Filter.AcceptableChoice filter)
        {
            foreach (Expression expression in Associations.Values)
            {
                expression.fill(retVal, filter);
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
        /// Checks the expression and appends errors to the root tree node when inconsistencies are found
        /// </summary>
        public override void checkExpression()
        {
            Types.Structure structureType = Structure.GetExpressionType() as Types.Structure;
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
                        expression.checkExpression();
                        Types.Type type = expression.GetExpressionType();
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
    }
}
