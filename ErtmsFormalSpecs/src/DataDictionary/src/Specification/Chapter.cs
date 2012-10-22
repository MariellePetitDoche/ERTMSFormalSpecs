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

namespace DataDictionary.Specification
{
    public class Chapter : Generated.Chapter
    {
        /// <summary>
        /// The chapter name
        /// </summary>
        public override string Name
        {
            get { return "Chapter " + getId(); }
            set { }
        }

        /// <summary>
        /// The paragraphs
        /// </summary>
        public System.Collections.ArrayList Paragraphs
        {
            get
            {
                if (allParagraphs() == null)
                {
                    setAllParagraphs(new System.Collections.ArrayList());
                }
                return allParagraphs();
            }
            private set
            {
                setAllParagraphs(value);
            }
        }

        /// <summary>
        /// The type specs
        /// </summary>
        public System.Collections.ArrayList TypeSpecs
        {
            get
            {
                if (allTypeSpecs() == null)
                {
                    setAllTypeSpecs(new System.Collections.ArrayList());
                }
                return allTypeSpecs();
            }
            set
            {
                setAllTypeSpecs(value);
            }
        }

        /**
         * Looks for a specific paragraph in this chapter
         */
        public Paragraph findParagraph(String id)
        {
            Paragraph retVal = null;

            foreach (Paragraph paragraph in Paragraphs)
            {
                retVal = paragraph.FindParagraph(id);
                if (retVal != null)
                {
                    break;
                }
            }

            return retVal;
        }

        /**
         * Provides the paragraphs that require an implementation
         */
        public ICollection<Paragraph> applicableParagraphs()
        {
            ICollection<Paragraph> retVal = new HashSet<Paragraph>();

            foreach (Paragraph p in Paragraphs)
            {
                applicableParagraphs(p, retVal);
            }

            return retVal;
        }

        private void applicableParagraphs(Paragraph paragraph, ICollection<Paragraph> retVal)
        {
            if (paragraph.isApplicable())
            {
                retVal.Add(paragraph);
            }
            foreach (Paragraph p in paragraph.SubParagraphs)
            {
                applicableParagraphs(p, retVal);
            }
        }

        /// <summary>
        /// Provides the enclosing specification
        /// </summary>
        public Specification EnclosingSpecification
        {
            get { return Enclosing as Specification; }
        }

        /// <summary>
        /// Provides the enclosing collection
        /// </summary>
        public override System.Collections.ArrayList EnclosingCollection
        {
            get { return EnclosingSpecification.Chapters; }
        }

        /// <summary>
        /// The current index
        /// </summary>
        private static int index;

        /// <summary>
        /// Restructure the paragraph nodes
        /// </summary>
        public void RestructureParagraphs()
        {
            index = 0;
            Paragraphs = InnerRestructureParagraphs(this.Paragraphs, 2);
        }

        /// <summary>
        /// Restructure the paragraph nodes
        /// </summary>
        /// <param name="elements">The elements to be placed in the node</param>
        /// <param name="level">The current paragraph level</param>
        private static System.Collections.ArrayList InnerRestructureParagraphs(System.Collections.ArrayList elements, int level)
        {
            System.Collections.ArrayList retVal = new System.Collections.ArrayList();
            Paragraph current = null;

            while (index < elements.Count)
            {
                Paragraph paragraph = (Paragraph)elements[index];
                List<Paragraph> subNodes = new List<Paragraph>();

                if (paragraph.Level == level)
                {
                    index = index + 1;
                    if (current != null)
                    {
                        retVal.Add(current);
                    }
                    current = paragraph;
                }
                else if (paragraph.Level > level)
                {
                    if (current != null)
                    {
                        retVal.Add(current);
                        current.SubParagraphs = InnerRestructureParagraphs(elements, level + 1);
                        current = null;
                    }
                    else
                    {
                        retVal = InnerRestructureParagraphs(elements, level + 1);
                    }
                }
                else
                {
                    break;
                }
            }

            if (current != null)
            {
                retVal.Add(current);
            }
            return retVal;
        }

        /// <summary>
        /// Restructures the names of the paragraphs
        /// </summary>
        public void RestructureParagraphsNames()
        {
            foreach (Paragraph paragraph in Paragraphs)
            {
                paragraph.RestructureName();
            }
        }

        /// <summary>
        /// Looks for specific paragraphs in this chapter, whose number begins with the Id provided
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        internal void SubParagraphs(string id, List<Paragraph> retVal)
        {
            foreach (Paragraph paragraph in Paragraphs)
            {
                if (paragraph.getId() != null && paragraph.getId().StartsWith(id))
                {
                    retVal.Add(paragraph);
                }
            }
        }

        /// <summary>
        /// Adds all the paragraphs in the set provided as parameter
        /// </summary>
        /// <param name="retVal"></param>
        internal void AddAllParagraphs(List<Paragraph> retVal)
        {
            foreach (Paragraph paragraph in Paragraphs)
            {
                paragraph.FillCollection(retVal);
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Paragraph item = element as Paragraph;
                if (item != null)
                {
                    appendParagraphs(item);
                }
            }
        }

    }
}
