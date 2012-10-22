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


namespace DataDictionary.Rules
{
    public class RuleDisabling : Generated.RuleDisabling
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public RuleDisabling()
        {
        }


        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
        }


        /// <summary>
        /// Provides the enclosing collection for this rule disabling
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                return Dictionary.allRuleDisablings();
            }
        }

    }
}
