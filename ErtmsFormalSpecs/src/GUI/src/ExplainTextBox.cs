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

namespace GUI
{
    public class ExplainTextBox : MyRichTextBox
    {
        /// <summary>
        /// Constructor
        /// </summary>
        public ExplainTextBox()
            : base(false)
        {
        }

        private Utils.IModelElement model;
        protected Utils.IModelElement Model
        {
            get { return model; }
            private set { model = value; }
        }

        /// <summary>
        /// Sets the model for this explain text box
        /// </summary>
        /// <param name="model"></param>
        public void SetModel(Utils.IModelElement model)
        {
            Model = model;
            RefreshData();
        }

        /// <summary>
        /// Refreshes the data
        /// </summary>
        public virtual void RefreshData()
        {
            Text = "";
        }
    }

    /// <summary>
    /// Explains a rule
    /// </summary>
    public class RuleExplainTextBox : ExplainTextBox
    {
        public override void RefreshData()
        {
            base.RefreshData();

            DataDictionary.TextualExplain explainable = Model as DataDictionary.TextualExplain;

            if (explainable != null)
            {
                string explanation = explainable.getExplain(true);

                if (explanation != null)
                {
                    Rtf = explanation;
                    Visible = true;
                }
                else
                {
                    Visible = false;
                }
            }
            else
            {
                Visible = false;
            }
        }
    }
}
