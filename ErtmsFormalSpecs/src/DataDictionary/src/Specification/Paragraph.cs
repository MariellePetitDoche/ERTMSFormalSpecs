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
    public class Paragraph : Generated.Paragraph, IComparable<Utils.IModelElement>, ICommentable
    {
        private static int A = Char.ConvertToUtf32("a", 0);

        private int[] id;
        public int[] Id
        {
            get
            {
                if (id == null)
                {
                    string[] levels = getId().Split('.');
                    id = new int[levels.Length];
                    for (int i = 0; i < levels.Length; i++)
                    {
                        try
                        {
                            id[i] = Int16.Parse(levels[i]);
                        }
                        catch (FormatException excp)
                        {
                            id[i] = 0;
                            for (int j = 0; j < levels[i].Length; j++)
                            {
                                if (Char.IsLetterOrDigit(levels[i][j]))
                                {
                                    if (Char.IsDigit(levels[i][j]))
                                    {
                                        id[i] = id[i] * 10 + Char.Parse(levels[i][j] + "");
                                    }
                                    else
                                    {
                                        int v = (Char.ConvertToUtf32(Char.ToLower(levels[i][j]) + "", 0) - A);
                                        id[i] = id[i] * 100 + v;
                                    }
                                }
                            }
                        }
                    }
                }
                return id;
            }
        }

        public string FullId
        {
            get { return getId(); }
            set { setId(value); }
        }

        /// <summary>
        /// The maximum size of the text to be displayed
        /// </summary>
        private static int MAX_TEXT_LENGTH = 50;
        private static bool STRIP_LONG_TEXT = false;

        /// <summary>
        /// The paragraph name
        /// </summary>
        public override string Name
        {
            get
            {
                string retVal = FullId;

                if (Generated.acceptor.Paragraph_type.aTITLE == getType())
                {
                    retVal = retVal + " " + getText();
                }
                else
                {
                    string textStart = getText();
                    if (STRIP_LONG_TEXT && textStart.Length > MAX_TEXT_LENGTH)
                    {
                        textStart = textStart.Substring(0, MAX_TEXT_LENGTH) + "...";
                    }
                    retVal = retVal + " " + textStart;
                }

                return retVal;
            }
            set { }
        }

        /// <summary>
        /// Allow to edit the paragraph text in the ExpressionText richttextbox
        /// </summary>
        public override string ExpressionText
        {
            get { return Text; }
            set { Text = value; }
        }

        /// <summary>
        /// The paragraph text
        /// </summary>
        public string Text
        {
            get
            {
                string retVal = getText();

                if (retVal.Length == 0)
                {
                    if (getMessage() != null)
                    {
                        Message msg = getMessage() as Message;
                        retVal += msg.Text;
                    }
                    if (allTypeSpecs() != null)
                    {
                        foreach (TypeSpec aTypeSpec in allTypeSpecs())
                        {
                            if (aTypeSpec.getShort_description() == null && getName() != null)
                            {
                                aTypeSpec.setShort_description(getName());
                            }
                            retVal += aTypeSpec.Text;
                        }
                    }
                }

                return retVal;
            }
            set { setText(value); }
        }

        public override System.Collections.ArrayList EnclosingCollection
        {
            get
            {
                System.Collections.ArrayList retVal = null;
                if (EnclosingParagraph != null)
                {
                    retVal = EnclosingParagraph.SubParagraphs;
                }
                else
                {
                    Chapter chapter = getFather() as Chapter;
                    if (chapter != null)
                    {
                        retVal = chapter.Paragraphs;
                    }
                }
                return retVal;
            }
        }

        public Paragraph EnclosingParagraph
        {
            get { return getFather() as Paragraph; }
        }

        private DataDictionary.Generated.acceptor.Paragraph_scope subParagraphsScope = Generated.acceptor.Paragraph_scope.defaultParagraph_scope;
        public DataDictionary.Generated.acceptor.Paragraph_scope SubParagraphsScope
        {
            get
            {
                if (subParagraphsScope == Generated.acceptor.Paragraph_scope.defaultParagraph_scope)
                    subParagraphsScope = computeSubParagraphsScope();
                return subParagraphsScope;
            }
        }

        public void SetType(DataDictionary.Generated.acceptor.Paragraph_type Type)
        {
            setType(Type);
            switch (Type)
            {
                case Generated.acceptor.Paragraph_type.aREQUIREMENT:
                    setImplementationStatus(Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_NA);
                    break;
                default:
                    setImplementationStatus(Generated.acceptor.SPEC_IMPLEMENTED_ENUM.Impl_NotImplementable);
                    break;
            }
        }

        /**
         * Looks for a specific paragraph in this paragraph
         */
        public Paragraph FindParagraph(String id)
        {
            Paragraph retVal = null;

            if (getId().CompareTo(id) == 0)
            {
                retVal = this;
            }
            else
            {
                foreach (Paragraph sub in this.SubParagraphs)
                {
                    retVal = sub.FindParagraph(id);
                    if (retVal != null)
                    {
                        break;
                    }
                }
            }

            return retVal;
        }

        /// <summary>
        /// The sub paragraphs of this paragraph
        /// </summary>
        public string GetNewSubParagraphId()
        {
            string retVal = this.FullId + ".1";
            if (SubParagraphs.Count > 0)
            {
                Paragraph lastParagraph = SubParagraphs[SubParagraphs.Count - 1] as Paragraph;
                int[] ids = lastParagraph.Id;
                int lastId = ids[ids.Length - 1];
                retVal = this.FullId + "." + (lastId + 1).ToString();
                //int lastId = lastParagraph.FullId.Split(".");  Item.FullId + "." + (Item.SubParagraphs.Count + 1).ToString()
            }
            return retVal;
        }

        /// <summary>
        /// The sub paragraphs of this paragraph
        /// </summary>
        public System.Collections.ArrayList SubParagraphs
        {
            get
            {
                if (allParagraphs() == null)
                {
                    setAllParagraphs(new System.Collections.ArrayList());
                }
                return allParagraphs();
            }
            set { setAllParagraphs(value); }
        }

        /// <summary>
        /// The type specs of this paragraph
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
            set { setAllTypeSpecs(value); }
        }

        /// <summary>
        /// Adds a type spec to a paragraph
        /// </summary>
        /// <param name="aTypeSpec">The type spec to add</param>
        public void AddTypeSpec(TypeSpec aTypeSpec)
        {
            TypeSpecs.Add(aTypeSpec);
        }

        public override int CompareTo(Utils.IModelElement other)
        {
            int retVal = 0;

            if (other is Paragraph)
            {
                Paragraph otherParagraph = other as Paragraph;

                int[] levels = Id;
                int[] otherLevels = otherParagraph.Id;

                int i = 0;
                while (i < levels.Length && i < otherLevels.Length && retVal == 0)
                {
                    if (levels[i] < otherLevels[i])
                    {
                        retVal = -1;
                    }
                    else
                    {
                        if (levels[i] > otherLevels[i])
                        {
                            retVal = 1;
                        }
                    }
                    i = i + 1;
                }

                if (retVal == 0)
                {
                    if (i < levels.Length)
                    {
                        retVal = -1;
                    }
                    else if (i < otherLevels.Length)
                    {
                        retVal = 1;
                    }
                }
            }
            else
            {
                retVal = base.CompareTo(other);
            }

            return retVal;
        }

        /// <summary>
        /// The paragraph level. 
        ///   1.1 is level 2, ...
        /// </summary>
        public int Level
        {
            get
            {
                return getId().Split('.').Length;
            }
        }

        /**
         * Indicates that the paragraph need an implementation
         */
        public bool isApplicable()
        {
            bool retVal;
            retVal = getType() == Generated.acceptor.Paragraph_type.aREQUIREMENT;
            retVal = retVal && (getScope() == Generated.acceptor.Paragraph_scope.aOBU ||
                                getScope() == Generated.acceptor.Paragraph_scope.aOBU_AND_TRACK);
            return retVal;
        }

        /// <summary>
        /// Restructures the name of this paragraph
        /// </summary>
        public void RestructureName()
        {
            if (EnclosingParagraph != null)
            {
                setId(getId().Substring(EnclosingParagraph.FullId.Length + 1));
            }
            foreach (Paragraph paragraph in SubParagraphs)
            {
                paragraph.RestructureName();
            }
        }

        /// <summary>
        /// Finds all req ref to this paragraph
        /// </summary>
        private class ReqRefFinder : Generated.Visitor
        {
            /// <summary>
            /// Provides the paragraph currently looked for
            /// </summary>
            private Paragraph paragraph;
            public Paragraph Paragraph
            {
                get { return paragraph; }
                private set { paragraph = value; }
            }

            /// <summary>
            /// Provides the req refs which implement this paragraph 
            /// </summary>
            private List<ReqRef> implementations;
            public List<ReqRef> Implementations
            {
                get { return implementations; }
                private set { implementations = value; }
            }

            /// <summary>
            /// Constructor
            /// </summary>
            /// <param name="paragraph"></param>
            public ReqRefFinder(Paragraph paragraph)
            {
                Paragraph = paragraph;
                Implementations = new List<ReqRef>();
            }

            public override void visit(Generated.ReqRef obj, bool visitSubNodes)
            {
                ReqRef reqRef = (ReqRef)obj;

                if (reqRef.Paragraph == Paragraph)
                {
                    Implementations.Add(reqRef);
                }

                base.visit(obj, visitSubNodes);
            }
        }

        /// <summary>
        /// Provides the list of references to this paragraph
        /// </summary>
        public List<ReqRef> Implementations
        {
            get
            {
                ReqRefFinder finder = new ReqRefFinder(this);
                finder.visit(Dictionary);
                return finder.Implementations;
            }
        }

        /// <summary>
        /// Fills the collection of paragraphs with this paragraph, and the sub paragraphs
        /// </summary>
        /// <param name="retVal"></param>
        public void FillCollection(List<Paragraph> retVal)
        {
            retVal.Add(this);
            foreach (Paragraph subParagraph in SubParagraphs)
            {
                subParagraph.FillCollection(retVal);
            }
        }

        /// <summary>
        /// Changes the type of the paragraph if the paragraph type is the original type
        /// </summary>
        /// <param name="originalType">The type of the paragraph which should be matched</param>
        /// <param name="targetType">When the originalType is matched, the new type to set</param>
        public void ChangeType(Generated.acceptor.Paragraph_type originalType, Generated.acceptor.Paragraph_type targetType)
        {
            // If the type is matched, change the type
            if (getType() == originalType)
            {
                setType(targetType);
            }

            // Recursively apply this procedure on sub paragraphs
            foreach (Paragraph paragraph in SubParagraphs)
            {
                paragraph.ChangeType(originalType, targetType);
            }
        }

        /// <summary>
        /// Worker for get sub paragraphs
        /// </summary>
        /// <param name="retVal"></param>
        private void getSubParagraphs(List<Paragraph> retVal)
        {
            foreach (Paragraph p in SubParagraphs)
            {
                retVal.Add(p);
                p.getSubParagraphs(retVal);
            }
        }

        /// <summary>
        /// Provides all sub paragraphs of this paragraph
        /// </summary>
        /// <returns></returns>
        public List<Paragraph> getSubParagraphs()
        {
            List<Paragraph> retVal = new List<Paragraph>();

            getSubParagraphs(retVal);

            return retVal;
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

        /// <summary>
        /// Computes the scope of the sub-paragraphs
        /// </summary>
        /// <returns></returns>
        private DataDictionary.Generated.acceptor.Paragraph_scope computeSubParagraphsScope()
        {
            DataDictionary.Generated.acceptor.Paragraph_scope result = getScope();

            foreach (Paragraph paragraph in SubParagraphs)
            {
                switch (paragraph.SubParagraphsScope)
                {
                    case Generated.acceptor.Paragraph_scope.aOBU_AND_TRACK:
                        return Generated.acceptor.Paragraph_scope.aOBU_AND_TRACK;
                    case Generated.acceptor.Paragraph_scope.aOBU:
                        if (result == Generated.acceptor.Paragraph_scope.aTRACK)
                            return Generated.acceptor.Paragraph_scope.aOBU_AND_TRACK;
                        else
                            result = Generated.acceptor.Paragraph_scope.aOBU;
                        break;
                    case Generated.acceptor.Paragraph_scope.aTRACK:
                        if (result == Generated.acceptor.Paragraph_scope.aOBU)
                            return Generated.acceptor.Paragraph_scope.aOBU_AND_TRACK;
                        else
                            result = Generated.acceptor.Paragraph_scope.aTRACK;
                        break;
                }
            }

            return result;
        }
    }
}
