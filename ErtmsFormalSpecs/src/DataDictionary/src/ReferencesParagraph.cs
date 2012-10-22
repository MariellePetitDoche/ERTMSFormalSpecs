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
    public class ReferencesParagraph : Generated.ReferencesParagraph, ICommentable
    {
        /// <summary>
        /// The requirements for this req related model element
        /// </summary>
        public System.Collections.ArrayList Requirements
        {
            get
            {
                if (allRequirements() == null)
                {
                    setAllRequirements(new System.Collections.ArrayList());
                }
                return allRequirements();
            }
        }

        /// <summary>
        /// Associates the comment text box with the comment
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
        /// Provides the set of paragraphs modeled by this req related
        /// </summary>
        public HashSet<Specification.Paragraph> ModeledParagraphs
        {
            get
            {
                HashSet<Specification.Paragraph> retVal = new HashSet<Specification.Paragraph>();
                ReferencesParagraph reqRelated = this;
                while (reqRelated != null)
                {
                    foreach (ReqRef reqRef in reqRelated.Requirements)
                    {
                        if (reqRef.Paragraph != null)
                        {
                            retVal.Add(reqRef.Paragraph);
                        }
                    }
                    reqRelated = Utils.EnclosingFinder<DataDictionary.ReqRelated>.find(reqRelated);
                }
                return retVal;
            }
        }


        /// <summary>
        /// Provides all the paragraphs associated to this req related
        /// </summary>
        /// <param name="paragraphs">The list of paragraphs to be filled</param>
        /// <returns></returns>
        public virtual void findRelatedParagraphsRecursively(List<Specification.Paragraph> paragraphs)
        {
            // Append the paragraphs related to the req refs of this req related
            foreach (ReqRef reqRef in Requirements)
            {
                Specification.Paragraph paragraph = reqRef.Paragraph;
                if (paragraph != null)
                {
                    if (!paragraphs.Contains(paragraph))
                    {
                        paragraphs.Add(paragraph);
                    }
                }
            }
        }

        /// <summary>
        /// Provides the requirements related to this rule
        /// </summary>
        /// <returns></returns>
        public string getRequirements()
        {
            string retVal = "";

            List<Specification.Paragraph> paragraphs = new List<Specification.Paragraph>();
            findRelatedParagraphsRecursively(paragraphs);
            foreach (Specification.Paragraph paragraph in paragraphs)
            {
                retVal = retVal + paragraph.FullId + ":" + paragraph.getText().Replace('\n', ' ') + "\n\n";
            }

            return retVal;
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            ReqRef reqRef = element as ReqRef;
            if (reqRef != null)
            {
                appendRequirements(reqRef);
            }
        }
    }
}
