/*
* generated by Xtext
*/
grammar InternalExpression;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.openetcs.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.openetcs.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.openetcs.dsl.services.ExpressionGrammarAccess;

}

@parser::members {

 	private ExpressionGrammarAccess grammarAccess;
 	
    public InternalExpressionParser(TokenStream input, ExpressionGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected ExpressionGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0()); 
	    }
		lv_phrase_0_0=rulePhrase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		set(
       			$current, 
       			"phrase",
        		lv_phrase_0_0, 
        		"Phrase");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getFQNRule()); } 
	 iv_ruleFQN=ruleFQN 
	 { $current=$iv_ruleFQN.current.getText(); }  
	 EOF 
;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRulePhrase
entryRulePhrase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPhraseRule()); }
	 iv_rulePhrase=rulePhrase 
	 { $current=$iv_rulePhrase.current; } 
	 EOF 
;

// Rule Phrase
rulePhrase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPhraseAccess().getExpressionParserRuleCall_0()); 
    }
    this_Expression_0=ruleExpression
    { 
        $current = $this_Expression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPhraseAccess().getStatementParserRuleCall_1()); 
    }
    this_Statement_1=ruleStatement
    { 
        $current = $this_Statement_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getEvaluationExpressionParserRuleCall()); 
    }
    this_EvaluationExpression_0=ruleEvaluationExpression
    { 
        $current = $this_EvaluationExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleEvaluationExpression
entryRuleEvaluationExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEvaluationExpressionRule()); }
	 iv_ruleEvaluationExpression=ruleEvaluationExpression 
	 { $current=$iv_ruleEvaluationExpression.current; } 
	 EOF 
;

// Rule EvaluationExpression
ruleEvaluationExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getEvaluationExpressionAccess().getOrExpressionParserRuleCall()); 
    }
    this_OrExpression_0=ruleOrExpression
    { 
        $current = $this_OrExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	 iv_ruleStatement=ruleStatement 
	 { $current=$iv_ruleStatement.current; } 
	 EOF 
;

// Rule Statement
ruleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getSingleStatementParserRuleCall_0()); 
    }
    this_SingleStatement_0=ruleSingleStatement
    { 
        $current = $this_SingleStatement_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getSelfStatementParserRuleCall_1()); 
    }
    this_SelfStatement_1=ruleSelfStatement
    { 
        $current = $this_SelfStatement_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getStatementAccess().getMultiStatementParserRuleCall_2()); 
    }
    this_MultiStatement_2=ruleMultiStatement
    { 
        $current = $this_MultiStatement_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSingleStatement
entryRuleSingleStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleStatementRule()); }
	 iv_ruleSingleStatement=ruleSingleStatement 
	 { $current=$iv_ruleSingleStatement.current; } 
	 EOF 
;

// Rule SingleStatement
ruleSingleStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
	    }
		lv_desgnator_0_0=ruleDesignator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleStatementRule());
	        }
       		set(
       			$current, 
       			"desgnator",
        		lv_desgnator_0_0, 
        		"Designator");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='<-' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSingleStatementAccess().getLessThanSignHyphenMinusKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleStatementRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleSelfStatement
entryRuleSelfStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSelfStatementRule()); }
	 iv_ruleSelfStatement=ruleSelfStatement 
	 { $current=$iv_ruleSelfStatement.current; } 
	 EOF 
;

// Rule SelfStatement
ruleSelfStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='CurrentState' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSelfStatementAccess().getCurrentStateKeyword_0());
    }
	otherlv_1='<-' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSelfStatementAccess().getLessThanSignHyphenMinusKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSelfStatementRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleMultiStatement
entryRuleMultiStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiStatementRule()); }
	 iv_ruleMultiStatement=ruleMultiStatement 
	 { $current=$iv_ruleMultiStatement.current; } 
	 EOF 
;

// Rule MultiStatement
ruleMultiStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getMultiStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0()); 
	    }
		lv_desgnator_0_0=ruleDesignator		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiStatementRule());
	        }
       		set(
       			$current, 
       			"desgnator",
        		lv_desgnator_0_0, 
        		"Designator");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMultiStatementAccess().getExpressionsExpressionParserRuleCall_2_0()); 
	    }
		lv_expressions_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultiStatementRule());
	        }
       		add(
       			$current, 
       			"expressions",
        		lv_expressions_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3());
    }
)
;





// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	 iv_ruleOrExpression=ruleOrExpression 
	 { $current=$iv_ruleOrExpression.current; } 
	 EOF 
;

// Rule OrExpression
ruleOrExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
    }
    this_AndExpression_0=ruleAndExpression
    { 
        $current = $this_AndExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            $current);
    }
)(
(
		lv_op_2_0=	'OR' 
    {
        newLeafNode(lv_op_2_0, grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOrExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_0, "OR");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleAndExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"AndExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	 iv_ruleAndExpression=ruleAndExpression 
	 { $current=$iv_ruleAndExpression.current; } 
	 EOF 
;

// Rule AndExpression
ruleAndExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityExpressionParserRuleCall_0()); 
    }
    this_EqualityExpression_0=ruleEqualityExpression
    { 
        $current = $this_EqualityExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            $current);
    }
)(
(
		lv_op_2_0=	'AND' 
    {
        newLeafNode(lv_op_2_0, grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAndExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_0, "AND");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleEqualityExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"EqualityExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleEqualityExpression
entryRuleEqualityExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEqualityExpressionRule()); }
	 iv_ruleEqualityExpression=ruleEqualityExpression 
	 { $current=$iv_ruleEqualityExpression.current; } 
	 EOF 
;

// Rule EqualityExpression
ruleEqualityExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getDashOperationParserRuleCall_0()); 
    }
    this_DashOperation_0=ruleDashOperation
    { 
        $current = $this_DashOperation_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_op_2_1=	'==' 
    {
        newLeafNode(lv_op_2_1, grammarAccess.getEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_1, null);
	    }

    |		lv_op_2_2=	'!=' 
    {
        newLeafNode(lv_op_2_2, grammarAccess.getEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_2, null);
	    }

    |		lv_op_2_3=	'<=' 
    {
        newLeafNode(lv_op_2_3, grammarAccess.getEqualityExpressionAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_3, null);
	    }

    |		lv_op_2_4=	'>=' 
    {
        newLeafNode(lv_op_2_4, grammarAccess.getEqualityExpressionAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_4, null);
	    }

    |		lv_op_2_5=	'in' 
    {
        newLeafNode(lv_op_2_5, grammarAccess.getEqualityExpressionAccess().getOpInKeyword_1_1_0_4());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_5, null);
	    }

    |		lv_op_2_6=	'not in' 
    {
        newLeafNode(lv_op_2_6, grammarAccess.getEqualityExpressionAccess().getOpNotInKeyword_1_1_0_5());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityExpressionRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_6, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightDashOperationParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleDashOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"DashOperation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleDashOperation
entryRuleDashOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDashOperationRule()); }
	 iv_ruleDashOperation=ruleDashOperation 
	 { $current=$iv_ruleDashOperation.current; } 
	 EOF 
;

// Rule DashOperation
ruleDashOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getDashOperationAccess().getPointOperationParserRuleCall_0()); 
    }
    this_PointOperation_0=rulePointOperation
    { 
        $current = $this_PointOperation_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_op_2_1=	'+' 
    {
        newLeafNode(lv_op_2_1, grammarAccess.getDashOperationAccess().getOpPlusSignKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDashOperationRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_1, null);
	    }

    |		lv_op_2_2=	'-' 
    {
        newLeafNode(lv_op_2_2, grammarAccess.getDashOperationAccess().getOpHyphenMinusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDashOperationRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getDashOperationAccess().getRightPointOperationParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePointOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDashOperationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"PointOperation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePointOperation
entryRulePointOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPointOperationRule()); }
	 iv_rulePointOperation=rulePointOperation 
	 { $current=$iv_rulePointOperation.current; } 
	 EOF 
;

// Rule PointOperation
rulePointOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPointOperationAccess().getPowOperationParserRuleCall_0()); 
    }
    this_PowOperation_0=rulePowOperation
    { 
        $current = $this_PowOperation_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_op_2_1=	'*' 
    {
        newLeafNode(lv_op_2_1, grammarAccess.getPointOperationAccess().getOpAsteriskKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPointOperationRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_1, null);
	    }

    |		lv_op_2_2=	'/' 
    {
        newLeafNode(lv_op_2_2, grammarAccess.getPointOperationAccess().getOpSolidusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPointOperationRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPointOperationAccess().getRightPowOperationParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePowOperation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPointOperationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"PowOperation");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePowOperation
entryRulePowOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPowOperationRule()); }
	 iv_rulePowOperation=rulePowOperation 
	 { $current=$iv_rulePowOperation.current; } 
	 EOF 
;

// Rule PowOperation
rulePowOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPowOperationAccess().getPrimaryExpressionParserRuleCall_0()); 
    }
    this_PrimaryExpression_0=rulePrimaryExpression
    { 
        $current = $this_PrimaryExpression_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0(),
            $current);
    }
)(
(
		lv_op_2_0=	'^' 
    {
        newLeafNode(lv_op_2_0, grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPowOperationRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_0, "^");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePrimaryExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPowOperationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"PrimaryExpression");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	 iv_rulePrimaryExpression=rulePrimaryExpression 
	 { $current=$iv_rulePrimaryExpression.current; } 
	 EOF 
;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionParserRuleCall_0()); 
    }
    this_UnaryExpression_0=ruleUnaryExpression
    { 
        $current = $this_UnaryExpression_0.current; 
        afterParserOrEnumRuleCall();
    }

    |(	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
    }

    { 
        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_1_1()); 
    }
    this_EvaluationExpression_2=ruleEvaluationExpression
    { 
        $current = $this_EvaluationExpression_2.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
    }
)
    |(	otherlv_4='NOT (' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0());
    }

    { 
        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEvaluationExpressionParserRuleCall_2_1()); 
    }
    this_EvaluationExpression_5=ruleEvaluationExpression
    { 
        $current = $this_EvaluationExpression_5.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
    }
))
;





// Entry rule entryRuleUnaryExpression
entryRuleUnaryExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUnaryExpressionRule()); }
	 iv_ruleUnaryExpression=ruleUnaryExpression 
	 { $current=$iv_ruleUnaryExpression.current; } 
	 EOF 
;

// Rule UnaryExpression
ruleUnaryExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getTermParserRuleCall()); 
    }
    this_Term_0=ruleTerm
    { 
        $current = $this_Term_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleTerm
entryRuleTerm returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTermRule()); }
	 iv_ruleTerm=ruleTerm 
	 { $current=$iv_ruleTerm.current; } 
	 EOF 
;

// Rule Term
ruleTerm returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getTermAccess().getDesignatorParserRuleCall_0()); 
    }
    this_Designator_0=ruleDesignator
    { 
        $current = $this_Designator_0.current; 
        afterParserOrEnumRuleCall();
    }

    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTermAccess().getStringValueAction_1_0(),
            $current);
    }
)(
(
		lv_value_2_0=RULE_STRING
		{
			newLeafNode(lv_value_2_0, grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"STRING");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTermAccess().getIntegerValueAction_2_0(),
            $current);
    }
)(
(
		lv_value_4_0=RULE_INT
		{
			newLeafNode(lv_value_4_0, grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_4_0, 
        		"INT");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getTermAccess().getDoubleValueAction_3_0(),
            $current);
    }
)(
(
		lv_value_6_0=RULE_DOUBLE
		{
			newLeafNode(lv_value_6_0, grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTermRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_6_0, 
        		"DOUBLE");
	    }

)
)))
;





// Entry rule entryRuleDesignator
entryRuleDesignator returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDesignatorRule()); }
	 iv_ruleDesignator=ruleDesignator 
	 { $current=$iv_ruleDesignator.current; } 
	 EOF 
;

// Rule Designator
ruleDesignator returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDesignatorRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getDesignatorAccess().getValueEObjectCrossReference_0()); 
	    }
		ruleFQN		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)
;





RULE_DOUBLE : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


