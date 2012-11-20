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
using System.Collections;


namespace DataDictionary.Tests
{
    public class Step : Generated.Step, ICommentable
    {
        public override string Name
        {
            get
            {
                string retVal = base.Name;

                if (getTCS_Order() != 0)
                {
                    retVal = "Step " + getTCS_Order() + ": " + getDescription();
                }
                else
                {
                    if (Utils.Utils.isEmpty(retVal))
                    {
                        retVal = getDescription();
                    }
                }

                return retVal;
            }
        }

        public string Comment
        {
            get { return getComment(); }
            set { setComment(value); }
        }


        public ArrayList SubSteps
        {
            get
            {
                if (allSubSteps() == null)
                {
                    setAllSubSteps(new ArrayList());
                }
                return allSubSteps();
            }
        }


        /// <summary>
        /// The messages associated to this step
        /// </summary>
        public System.Collections.ArrayList StepMessages
        {
            get
            {
                if (allMessages() == null)
                {
                    setAllMessages(new System.Collections.ArrayList());
                }
                return allMessages();
            }
        }

        /// <summary>
        /// The enclosing test case
        /// </summary>
        public TestCase TestCase
        {
            get { return Enclosing as TestCase; }
        }

        /// <summary>
        /// The collection which encloses this step
        /// </summary>
        public override ArrayList EnclosingCollection
        {
            get { return TestCase.Steps; }
        }

        /// <summary>
        /// The explanation of this step, as RTF pseudo code
        /// </summary>
        /// <returns></returns>
        public string getExplain()
        {
            string retVal = "";

            foreach (SubStep subStep in SubSteps)
            {
                retVal += subStep.getExplain();
            }

            return retVal;
        }

        /// <summary>
        /// Provides the sub sequence for this step
        /// </summary>
        public SubSequence SubSequence
        {
            get { return Utils.EnclosingFinder<SubSequence>.find(this); }
        }

        /// <summary>
        /// Indicates if this step contains some actions or expectations
        /// </summary>
        /// <returns></returns>
        public bool IsEmpty()
        {
            bool retVal = false;
            if (SubSteps.Count == 0)
            {
                retVal = true;
            }
            else
            {
                retVal = true;
                foreach (SubStep subStep in SubSteps)
                {
                    if (!subStep.IsEmpty())
                    {
                        retVal = false;
                        break;
                    }
                }
            }
            return retVal;
        }

        /// <summary>
        /// Translates the current step according to the translation dictionary
        /// Removes all preconditions, actions and expectations
        /// </summary>
        /// <param name="translationDictionary"></param>
        public void Translate(Translations.TranslationDictionary translationDictionary)
        {
            if (getTranslationRequired())
            {
                SubSteps.Clear();

                Translations.Translation translation = translationDictionary.findTranslation(getDescription());
                if (translation != null)
                {
                    translation.UpdateStep(this);
                    setTranslated(true);
                }
            }
        }

        /// <summary>
        /// Adds a model element in this model element
        /// </summary>
        /// <param name="copy"></param>
        public override void AddModelElement(Utils.IModelElement element)
        {
            SubStep item = element as SubStep;
            if (item != null)
            {
                appendSubSteps(item);
            }
        }


        /// <summary>
        /// Fills the actual step with information of another test case
        /// </summary>
        /// <param name="oldTestCase"></param>
        public void Merge(Step aStep)
        {
            setAllSubSteps(aStep.SubSteps);

            setComment(aStep.Comment);
            setTranslated(aStep.getTranslated());
            setTranslationRequired(aStep.getTranslationRequired());
        }

        /// <summary>
        /// Adds a new message
        /// </summary>
        /// <param name="message"></param>
        public void AddMessage(DBElements.DBMessage message)
        {
            allMessages().Add(message);
        }
    }
}
