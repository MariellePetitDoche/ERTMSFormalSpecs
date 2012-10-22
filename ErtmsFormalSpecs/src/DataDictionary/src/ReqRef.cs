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

namespace DataDictionary
{
    public class ReqRef : Generated.ReqRef, ICommentable
    {
        /// <summary>
        /// The paragraph name of this trace
        /// </summary>
        public override string Name
        {
            get { return getId(); }
            set { setId(value); }
        }

        /// <summary>
        /// Provides the comment related to this requirement reference
        /// </summary>
        public string Comment
        {
            get
            {
                string retVal = getComment();
                if (retVal == null)
                {
                    retVal = "";
                }
                return retVal;
            }
            set { setComment(value); }
        }

        /// <summary>
        /// The specification document
        /// </summary>
        public Specification.Specification Specifications
        {
            get { return Dictionary.Specifications; }
        }

        /// <summary>
        /// The implementation of this trace
        /// </summary>
        public Utils.IModelElement Model
        {
            get { return Enclosing as Utils.IModelElement; }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                if (Model is DataDictionary.ReqRelated)
                {
                    DataDictionary.ReqRelated reqRelated = Model as DataDictionary.ReqRelated;
                    if (reqRelated != null)
                    {
                        return reqRelated.Requirements;
                    }
                }
                else if (Model is Specification.Paragraph)
                {
                    Specification.Paragraph paragraph = Model as Specification.Paragraph;
                    if (paragraph != null)
                    {
                        return paragraph.Requirements;
                    }
                }
                return null;
            }
        }

        /// <summary>
        /// The corresponding specification paragraph
        /// </summary>
        public Specification.Paragraph Paragraph
        {
            get
            {
                return Specifications.FindParagraph(getId());
            }
        }

        /// <summary>
        /// HaCK : this performes the same thing as Paragraph.ExpressionText
        /// because when selecting a ReqRef in the req references of a paragraph, 
        /// this updates the paragraph text box => updates the paragraph text... 
        /// </summary>
        public override string ExpressionText
        {
            get
            {
                if (Paragraph != null)
                {
                    return Paragraph.ExpressionText;
                }
                return "";
            }
        }


        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
        }

    }
}
