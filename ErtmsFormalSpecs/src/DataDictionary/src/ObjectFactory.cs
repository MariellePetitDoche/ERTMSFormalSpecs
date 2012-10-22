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
    public class ObjectFactory : Generated.Factory
    {
        public override Generated.Dictionary createDictionary()
        {
            return new Dictionary();
        }

        public override Generated.ReqRef createReqRef()
        {
            return new ReqRef();
        }

        public override Generated.RuleDisabling createRuleDisabling()
        {
            return new Rules.RuleDisabling();
        }

        public override Generated.NameSpace createNameSpace()
        {
            return new Types.NameSpace();
        }

        public override Generated.Type createType()
        {
            return new Types.Type();
        }

        public override Generated.Enum createEnum()
        {
            return new Types.Enum();
        }

        public override Generated.EnumValue createEnumValue()
        {
            return new Constants.EnumValue();
        }

        public override Generated.Range createRange()
        {
            return new Types.Range();
        }

        public override Generated.Structure createStructure()
        {
            return new Types.Structure(); ;
        }

        public override Generated.Collection createCollection()
        {
            return new Types.Collection();
        }

        public override Generated.StructureElement createStructureElement()
        {
            return new Types.StructureElement();
        }

        public override Generated.StructureProcedure createStructureProcedure()
        {
            return new Types.StructureProcedure();
        }

        public override Generated.Function createFunction()
        {
            return new Functions.Function();
        }

        public override Generated.Parameter createParameter()
        {
            return new Parameter();
        }

        public override Generated.Case createCase()
        {
            return new Functions.Case();
        }

        public override Generated.Procedure createProcedure()
        {
            return new Variables.Procedure();
        }

        public override Generated.StateMachine createStateMachine()
        {
            return new Types.StateMachine();
        }

        public override Generated.State createState()
        {
            return new Constants.State();
        }

        public override Generated.Variable createVariable()
        {
            return new Variables.Variable();
        }

        public override Generated.Rule createRule()
        {
            Rules.Rule retVal = new Rules.Rule();
            retVal.setPriority(Generated.acceptor.RulePriority.aProcessing);
            return retVal;
        }

        public override Generated.RuleCondition createRuleCondition()
        {
            Rules.RuleCondition retVal = new Rules.RuleCondition();
            return retVal;
        }

        public override Generated.PreCondition createPreCondition()
        {
            return new Rules.PreCondition();
        }

        public override Generated.Action createAction()
        {
            return new Rules.Action();
        }

        public override Generated.Frame createFrame()
        {
            return new Tests.Frame();
        }

        public override Generated.SubSequence createSubSequence()
        {
            return new Tests.SubSequence();
        }

        public override Generated.TestCase createTestCase()
        {
            return new Tests.TestCase();
        }

        public override Generated.Step createStep()
        {
            return new Tests.Step();
        }

        public override Generated.SubStep createSubStep()
        {
            return new Tests.SubStep();
        }

        public override Generated.Expectation createExpectation()
        {
            return new Tests.Expectation();
        }

        public override Generated.DBMessage createDBMessage()
        {
            return new Tests.DBElements.DBMessage();
        }

        public override Generated.DBPacket createDBPacket()
        {
            return new Tests.DBElements.DBPacket();
        }

        public override Generated.DBField createDBField()
        {
            return new Tests.DBElements.DBField();
        }

        public override Generated.Specification createSpecification()
        {
            return new Specification.Specification();
        }

        public override Generated.Chapter createChapter()
        {
            return new Specification.Chapter();
        }

        public override Generated.Paragraph createParagraph()
        {
            return new Specification.Paragraph();
        }

        public override Generated.Message createMessage()
        {
            return new Specification.Message();
        }

        public override Generated.MsgVariable createMsgVariable()
        {
            return new Specification.MsgVariable();
        }

        public override Generated.TypeSpec createTypeSpec()
        {
            return new Specification.TypeSpec();
        }

        public override Generated.Values createValues()
        {
            return new Specification.Values();
        }

        public override Generated.special_or_reserved_values createspecial_or_reserved_values()
        {
            return new Specification.SpecialOrReservedValues();
        }

        public override Generated.special_or_reserved_value createspecial_or_reserved_value()
        {
            return new Specification.SpecialOrReservedValue();
        }

        public override Generated.mask createmask()
        {
            return new Specification.Mask();
        }

        public override Generated.match creatematch()
        {
            return new Specification.Match();
        }

        public override Generated.meaning createmeaning()
        {
            return new Specification.Meaning();
        }

        public override Generated.match_range creatematch_range()
        {
            return new Specification.MatchRange();
        }

        public override Generated.resolution_formula createresolution_formula()
        {
            return new Specification.ResolutionFormula();
        }

        public override Generated.value createvalue()
        {
            return new Specification.Value();
        }

        public override Generated.char_value createchar_value()
        {
            return new Specification.CharValue();
        }

        public override Generated.ParagraphRevision createParagraphRevision()
        {
            return new Specification.ParagraphRevision();
        }

        public override Generated.TranslationDictionary createTranslationDictionary()
        {
            return new Tests.Translations.TranslationDictionary();
        }

        public override Generated.Folder createFolder()
        {
            return new Tests.Translations.Folder();
        }

        public override Generated.Translation createTranslation()
        {
            return new Tests.Translations.Translation();
        }

        public override Generated.SourceText createSourceText()
        {
            return new Tests.Translations.SourceText();
        }

        public override Generated.ShortcutDictionary createShortcutDictionary()
        {
            return new Shortcuts.ShortcutDictionary();
        }

        public override Generated.ShortcutFolder createShortcutFolder()
        {
            return new Shortcuts.ShortcutFolder();
        }

        public override Generated.Shortcut createShortcut()
        {
            return new Shortcuts.Shortcut();
        }
    }
}
