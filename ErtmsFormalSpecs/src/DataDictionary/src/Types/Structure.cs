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

namespace DataDictionary.Types
{
    public class Structure : Generated.Structure, Utils.ISubDeclarator, Utils.IFinder, DataDictionary.TextualExplain
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public Structure()
        {
            Utils.FinderRepository.INSTANCE.Register(this);
        }

        /// <summary>
        /// The structure elements 
        /// </summary>
        public System.Collections.ArrayList Elements
        {
            get
            {
                if (allElements() == null)
                {
                    setAllElements(new System.Collections.ArrayList());
                }
                return allElements();
            }
        }

        /// <summary>
        /// The structure procedures
        /// </summary>
        public System.Collections.ArrayList Procedures
        {
            get
            {
                if (allProcedures() == null)
                {
                    setAllProcedures(new System.Collections.ArrayList());
                }
                return allProcedures();
            }
        }

        public void ClearCache()
        {
            declaredElements = null;
        }

        /// <summary>
        /// Provides all the values that can be stored in this structure
        /// </summary>
        public Dictionary<string, List<Utils.INamable>> declaredElements;
        public Dictionary<string, List<Utils.INamable>> DeclaredElements
        {
            get
            {
                if (declaredElements == null)
                {
                    declaredElements = new Dictionary<string, List<Utils.INamable>>();

                    foreach (StructureElement element in Elements)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, element);
                    }

                    foreach (StructureProcedure procedure in Procedures)
                    {
                        Utils.ISubDeclaratorUtils.AppendNamable(declaredElements, procedure);
                    }
                }

                return declaredElements;
            }
        }


        /// <summary>
        /// Appends the INamable which match the name provided in retVal
        /// </summary>
        /// <param name="name"></param>
        /// <param name="retVal"></param>
        public void find(string name, List<Utils.INamable> retVal)
        {
            List<Utils.INamable> list;

            if (DeclaredElements.TryGetValue(name, out list))
            {
                retVal.AddRange(list);
            }
        }

        /// <summary>
        /// The structure rules
        /// </summary>
        public System.Collections.ArrayList Rules
        {
            get
            {
                if (allRules() == null)
                {
                    setAllRules(new System.Collections.ArrayList());
                }
                return allRules();
            }
        }

        /// <summary>
        /// Provides the structure element which corresponds to the name provided
        /// </summary>
        /// <param name="name"></param>
        /// <returns></returns>
        public StructureElement findStructureElement(string name)
        {
            return (StructureElement)Utils.INamableUtils.findByName(name, Elements);
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return NameSpace.Structures; }
        }

        /// <summary>
        /// Provides the default value for this structure
        /// </summary>
        public override Values.IValue DefaultValue
        {
            get
            {
                Values.StructureValue retVal = new Values.StructureValue(this);

                return retVal;
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                StructureElement item = element as StructureElement;
                if (item != null)
                {
                    appendElements(item);
                }
            }
            {
                StructureProcedure item = element as StructureProcedure;
                if (item != null)
                {
                    appendProcedures(item);
                }
            }
            {
                Rules.Rule item = element as Rules.Rule;
                if (item != null)
                {
                    appendRules(item);
                }
            }

            base.AddModelElement(element);
        }


        public override bool CompareForEquality(Values.IValue left, Values.IValue right)  // left == right
        {
            bool retVal = base.CompareForEquality(left, right);

            if (!retVal)
            {
                if (left.Type == right.Type)
                {
                    Values.StructureValue leftValue = left as Values.StructureValue;
                    Values.StructureValue rightValue = right as Values.StructureValue;

                    if (left != null && right != null)
                    {
                        retVal = true;

                        foreach (KeyValuePair<string, Variables.IVariable> pair in leftValue.SubVariables)
                        {
                            Variables.IVariable leftVar = pair.Value;
                            Variables.IVariable rightVar = rightValue.getVariable(pair.Key);

                            if (leftVar.Type != null)
                            {
                                retVal = leftVar.Type.CompareForEquality(leftVar.Value, rightVar.Value);
                                if (!retVal)
                                {
                                    break;
                                }
                            }
                        }
                    }
                }

            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the structure
        /// </summary>
        /// <param name="indentLevel">the number of white spaces to add at the beginning of each line</param>
        /// <returns></returns>
        public string getExplain(int indentLevel)
        {
            string retVal = "";

            retVal = TextualExplainUtilities.Pad("{STRUCTURE " + Name + "}", indentLevel);

            foreach (StructureElement element in Elements)
            {
                retVal += "\\par" + TextualExplainUtilities.Pad("{" + element.Name + " : " + element.TypeName + "}", indentLevel + 2);
            }

            foreach (StructureProcedure procedure in Procedures)
            {
                retVal += "\\par" + procedure.getExplain(indentLevel + 2, false);
            }

            return retVal;
        }

        /// <summary>
        /// Provides an explanation of the range
        /// </summary>
        /// <param name="explainSubElements">Precises if we need to explain the sub elements (if any)</param>
        /// <returns></returns>
        public string getExplain(bool explainSubElements)
        {
            string retVal = getExplain(0);

            return TextualExplainUtilities.Encapsule(retVal);
        }
    }
}
