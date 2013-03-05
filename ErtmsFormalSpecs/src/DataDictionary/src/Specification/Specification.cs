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
    public class Specification : Generated.Specification, Utils.IFinder
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public Specification()
            : base()
        {
            Utils.FinderRepository.INSTANCE.Register(this);
        }

        /// <summary>
        /// The version of the specification
        /// </summary>
        public string Version
        {
            get { return getVersion(); }
            set { setVersion(value); }
        }

        /// <summary>
        /// The chapters
        /// </summary>
        public System.Collections.ArrayList Chapters
        {
            get
            {
                if (allChapters() == null)
                {
                    setAllChapters(new System.Collections.ArrayList());
                }
                return allChapters();
            }
        }

        /// <summary>
        /// The cache
        /// </summary>
        public System.Collections.Generic.Dictionary<String, Paragraph> TheCache = new Dictionary<string, Paragraph>();

        /// <summary>
        /// Clears the caches
        /// </summary>
        public void ClearCache()
        {
            TheCache.Clear();
        }

        /// <summary>
        /// Looks for the specific paragraph in the specification
        /// </summary>
        /// <param name="id"></param>
        /// <returns></returns>
        public Paragraph FindParagraph(String id)
        {
            if (!TheCache.ContainsKey(id))
            {
                Paragraph tmp = null;

                foreach (Chapter chapter in Chapters)
                {
                    tmp = chapter.findParagraph(id);
                    if (tmp != null)
                    {
                        break;
                    }
                }

                if (tmp != null)
                {
                    TheCache[id] = tmp;
                }
                else
                {
                    return null;
                }
            }

            return TheCache[id];
        }


        /// <summary>
        /// Looks for the specific chapter in this specification
        /// </summary>
        /// <param name="id">Id of the chapter to find</param>
        /// <returns></returns>
        public Chapter FindChapter(String id)
        {
            Chapter retVal = null;

            foreach (Chapter chapter in Chapters)
            {

                if (chapter.getId() == id)
                {
                    retVal = chapter;
                    break;
                }
            }

            return retVal;

        }

        /// <summary>
        /// Looks for specific paragraphs in the specification, whose number begins with the Id provided
        /// </summary>
        /// <param name="id"></param>
        /// <param name="retVal">the list to fill with the corresponding paragraphs</param>
        public void SubParagraphs(String id, List<Paragraph> retVal)
        {
            foreach (Chapter chapter in Chapters)
            {
                chapter.SubParagraphs(id, retVal);
            }
        }

        /**
         * Looks for the specific paragraphs in the specification
         */
        public List<Paragraph> FindParagraphs(List<string> refs)
        {
            List<Paragraph> retVal = new List<Paragraph>();

            foreach (string reference in refs)
            {
                Paragraph p = FindParagraph(reference);
                if (p != null)
                {
                    retVal.Add(p);
                }
            }

            return retVal;
        }

        /// <summary>
        /// Provides the list of all paragraphs
        /// </summary>
        /// <returns></returns>
        public List<string> ParagraphList()
        {
            List<string> retVal = new List<string>();

            foreach (Chapter chapter in Chapters)
            {
                foreach (Paragraph paragraph in chapter.Paragraphs)
                {
                    retVal.Add(paragraph.getId());
                }
            }

            return retVal;
        }


        /// <summary>
        /// Provides the paragraphs that require an implementation
        /// </summary>
        public ICollection<Paragraph> ApplicableParagraphs
        {
            get
            {
                ICollection<Paragraph> retVal = new HashSet<Paragraph>();

                foreach (Chapter c in Chapters)
                {
                    foreach (Paragraph p in c.applicableParagraphs())
                    {
                        retVal.Add(p);
                    }
                }

                return retVal;
            }
        }


        /// <summary>
        /// Provides the paragraphs that are marked as specification issues
        /// </summary>
        public ICollection<Paragraph> SpecIssues
        {
            get
            {
                ICollection<Paragraph> retVal = new HashSet<Paragraph>();

                foreach (Chapter c in Chapters)
                {
                    foreach (Paragraph p in c.applicableParagraphs())
                    {
                        if (p.getSpecIssue() == true)
                        {
                            retVal.Add(p);
                        }
                    }
                }

                return retVal;
            }
        }

        /// <summary>
        /// Provides the paragraphs from the chapter Design Choices
        /// </summary>
        public ICollection<Paragraph> DesignChoices
        {
            get
            {
                ICollection<Paragraph> retVal = new HashSet<Paragraph>();

                foreach (Chapter c in Chapters)
                {
                    if (c.Name.Equals("Chapter A1"))
                    {
                        foreach (Paragraph p in c.applicableParagraphs())
                        {
                            retVal.Add(p);
                        }
                        break;
                    }
                }

                return retVal;
            }
        }

        public List<Paragraph> AllParagraphs
        {
            get
            {
                List<Paragraph> retVal = new List<Paragraph>();

                foreach (Chapter chapter in Chapters)
                {
                    chapter.AddAllParagraphs(retVal);
                }

                return retVal;
            }
        }

        private class NotImplementedVisitor : Generated.Visitor
        {
            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (paragraph.getImplementationStatus() == Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_NA)
                {
                    paragraph.AddInfo("Not implemented");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Indicates which requirement has been not implemented
        /// </summary>
        public void CheckImplementation()
        {
            Dictionary.ClearMessages();
            NotImplementedVisitor visitor = new NotImplementedVisitor();
            visitor.visit(this);
        }

        private class NotReviewedVisitor : Generated.Visitor
        {
            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (!paragraph.getReviewed())
                {
                    paragraph.AddInfo("Not reviewed");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Indicates which requirement has been not reviewed 
        /// </summary>
        public void CheckReview()
        {
            Dictionary.ClearMessages();
            NotReviewedVisitor visitor = new NotReviewedVisitor();
            visitor.visit(this);
        }



        /// <summary>
        /// If a chapter has a type spec, it is placed into a paragraph
        /// </summary>
        public void ManageTypeSpecs()
        {
            foreach (Chapter chapter in Chapters)
            {
                foreach (TypeSpec typeSpec in chapter.TypeSpecs)
                {
                    if (typeSpec.getReference() != null)  // the type spec has an Id that will be used for the new paragraph
                    {
                        string[] fullId = typeSpec.getReference().Split('.');
                        string currentId = fullId[0];

                        Chapter chap = FindChapter(currentId);  // we search the chapter of this type spec
                        if (chap == null)
                        {
                            chap = (DataDictionary.Specification.Chapter)DataDictionary.Generated.acceptor.getFactory().createChapter();
                            chap.setId(currentId);
                        }

                        if (fullId.Length > 1)
                        {
                            Paragraph temp, enclosingParagraph, currentParagraph = null;
                            currentId += "." + fullId[1];
                            temp = FindParagraph(currentId);
                            if (temp == null)
                            {
                                currentParagraph = (DataDictionary.Specification.Paragraph)DataDictionary.Generated.acceptor.getFactory().createParagraph();
                                currentParagraph.FullId = currentId;
                                chap.appendParagraphs(currentParagraph);
                            }
                            else
                            {
                                currentParagraph = temp;
                            }

                            for (int i = 2; i < fullId.Length; i++)
                            {
                                currentId += "." + fullId[i];
                                enclosingParagraph = currentParagraph;
                                temp = FindParagraph(currentId);

                                if (temp != null)
                                {
                                    currentParagraph = temp;
                                }
                                else
                                {
                                    currentParagraph = (DataDictionary.Specification.Paragraph)DataDictionary.Generated.acceptor.getFactory().createParagraph();
                                    currentParagraph.FullId = currentId;
                                    currentParagraph.setType(DataDictionary.Generated.acceptor.Paragraph_type.aDEFINITION);
                                    currentParagraph.Text = "";
                                    enclosingParagraph.appendParagraphs(currentParagraph);
                                }
                            }

                            currentParagraph.AddTypeSpec(typeSpec);

                        }
                    }
                }

                chapter.TypeSpecs = null;
            }
        }

        private class ApplicableParagraphsVisitor : Generated.Visitor
        {
            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (paragraph.isApplicable())
                {
                    paragraph.AddInfo("Applicable paragraph");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        private class NonApplicableParagraphsVisitor : Generated.Visitor
        {
            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (!paragraph.isApplicable())
                {
                    paragraph.AddInfo("Non applicable paragraph");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        private class SpecIssuesParagraphsVisitor : Generated.Visitor
        {
            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (paragraph.getSpecIssue())
                {
                    paragraph.AddInfo("This paragraph has an issue");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        public void CheckApplicable()
        {
            Dictionary.ClearMessages();
            ApplicableParagraphsVisitor visitor = new ApplicableParagraphsVisitor();
            visitor.visit(this);
        }

        public void CheckNonApplicable()
        {
            Dictionary.ClearMessages();
            NonApplicableParagraphsVisitor visitor = new NonApplicableParagraphsVisitor();
            visitor.visit(this);
        }

        public void CheckSpecIssues()
        {
            Dictionary.ClearMessages();
            SpecIssuesParagraphsVisitor visitor = new SpecIssuesParagraphsVisitor();
            visitor.visit(this);
        }


        private class MoreInfoParagraphsVisitor : Generated.Visitor
        {
            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (paragraph.getMoreInfoRequired())
                {
                    paragraph.AddInfo("More info is required");
                }

                base.visit(obj, visitSubNodes);
            }
        }

        public void CheckMoreInfo()
        {
            Dictionary.ClearMessages();
            MoreInfoParagraphsVisitor visitor = new MoreInfoParagraphsVisitor();
            visitor.visit(this);
        }

        /// <summary>
        /// Provides the paragraph which are implemented but where no functional test is present
        /// </summary>
        private class ImplementedWithNoFunctionalTestVisitor : Generated.Visitor
        {
            /// <summary>
            /// Provides all ReqReferences
            /// </summary>
            private class AllReferences : Generated.Visitor
            {
                /// <summary>
                /// Provides the list of references found
                /// </summary>
                public List<ReqRef> References { get; private set; }

                /// <summary>
                /// Constructor
                /// </summary>
                public AllReferences()
                {
                    References = new List<ReqRef>();
                }

                public override void visit(Generated.ReqRef obj, bool visitSubNodes)
                {
                    References.Add((ReqRef)obj);

                    base.visit(obj, visitSubNodes);
                }

                /// <summary>
                /// The set of paragraph which have a functional test defined
                /// </summary>
                public HashSet<Paragraph> TestedParagraphs { get; private set; }

                /// <summary>
                /// Set up the TestedParagraphs cache
                /// </summary>
                /// <param name="dictionary">Initialises this class according to the dictionary provided</param>
                public void Initialize(Dictionary dictionary)
                {
                    foreach (Tests.Frame frame in dictionary.Tests)
                    {
                        visit(frame);
                    }

                    TestedParagraphs = new HashSet<Paragraph>();
                    foreach (ReqRef reqRef in References)
                    {
                        Paragraph paragraph = reqRef.Paragraph;
                        if (paragraph != null)
                        {
                            TestedParagraphs.Add(paragraph);
                        }
                    }
                }
            }

            /// <summary>
            /// Provides references to all functional tests
            /// </summary>
            private AllReferences FunctionalTests { get; set; }

            /// <summary>
            /// Constructor
            /// </summary>
            public ImplementedWithNoFunctionalTestVisitor(Specification specification)
            {
                FunctionalTests = new AllReferences();
                foreach (DataDictionary.Dictionary dictionary in EFSSystem.INSTANCE.Dictionaries)
                {
                    FunctionalTests.Initialize(dictionary);
                }
            }

            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (paragraph.getImplementationStatus() == Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_Implemented)
                {
                    if (!FunctionalTests.TestedParagraphs.Contains(paragraph))
                    {
                        paragraph.AddInfo("Paragraph is implemented but has no associated functional test");
                    }
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Mark paragraphs that are implemented, but where there is no test to validate this implementation
        /// </summary>
        public void CheckImplementedWithNoFunctionalTest()
        {
            Dictionary.ClearMessages();
            ImplementedWithNoFunctionalTestVisitor visitor = new ImplementedWithNoFunctionalTestVisitor(this);
            visitor.visit(this);
        }

        /// <summary>
        /// Provides the paragraph which are not marked as implemented but where implementation exists
        /// </summary>
        private class NotImplementedButImplementationExistsVisitor : Generated.Visitor
        {

            /// <summary>
            /// Provides all ReqReferences
            /// </summary>
            private class AllReferences : Generated.Visitor
            {
                /// <summary>
                /// Provides the list of references found
                /// </summary>
                public List<ReqRef> References { get; private set; }

                /// <summary>
                /// Constructor
                /// </summary>
                public AllReferences()
                {
                    References = new List<ReqRef>();
                }

                public override void visit(Generated.ReqRef obj, bool visitSubNodes)
                {
                    References.Add((ReqRef)obj);

                    base.visit(obj, visitSubNodes);
                }

                /// <summary>
                /// Do not visit test frames
                /// </summary>
                /// <param name="obj"></param>
                /// <param name="visitSubNodes"></param>
                public override void visit(Generated.Frame obj, bool visitSubNodes)
                {
                }

                /// <summary>
                /// The set of paragraph which have are implemented
                /// </summary>
                public HashSet<Paragraph> ImplementedParagraphs { get; private set; }

                /// <summary>
                /// Set up the TestedParagraphs cache
                /// </summary>
                /// <param name="dictionary">Initialises this class according to the dictionary provided</param>
                public void Initialize(Dictionary dictionary)
                {
                    visit(dictionary);

                    ImplementedParagraphs = new HashSet<Paragraph>();
                    foreach (ReqRef reqRef in References)
                    {
                        Paragraph paragraph = reqRef.Paragraph;
                        if (paragraph != null)
                        {
                            ImplementedParagraphs.Add(paragraph);
                        }
                    }
                }
            }

            /// <summary>
            /// Provides references to all implementations
            /// </summary>
            private AllReferences Implementations { get; set; }

            /// <summary>
            /// Constructor
            /// </summary>
            public NotImplementedButImplementationExistsVisitor(Specification specification)
            {
                Implementations = new AllReferences();
                foreach (DataDictionary.Dictionary dictionary in EFSSystem.INSTANCE.Dictionaries)
                {
                    Implementations.Initialize(dictionary);
                }
            }

            public override void visit(Generated.Paragraph obj, bool visitSubNodes)
            {
                DataDictionary.Specification.Paragraph paragraph = (DataDictionary.Specification.Paragraph)obj;

                if (paragraph.getImplementationStatus() != Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_Implemented)
                {
                    if (Implementations.ImplementedParagraphs.Contains(paragraph))
                    {
                        paragraph.AddInfo("Paragraph is not marked as implemented but has implementations related to it");
                    }
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Mark paragraphs where implementation exists, but that are not marked as implemented
        /// </summary>
        public void CheckNotImplementedButImplementationExists()
        {
            Dictionary.ClearMessages();
            NotImplementedButImplementationExistsVisitor visitor = new NotImplementedButImplementationExistsVisitor(this);
            visitor.visit(this);
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            {
                Chapter item = element as Chapter;
                if (item != null)
                {
                    appendChapters(item);
                }
            }
        }

    }
}