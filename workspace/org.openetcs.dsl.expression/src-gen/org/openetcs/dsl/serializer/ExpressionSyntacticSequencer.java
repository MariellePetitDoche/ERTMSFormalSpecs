package org.openetcs.dsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.openetcs.dsl.services.ExpressionGrammarAccess;

@SuppressWarnings("all")
public class ExpressionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ExpressionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__a;
	protected AbstractElementAlias match_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ExpressionGrammarAccess) access;
		match_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0()));
		match_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__p = new AlternativeAlias(true, false, new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_2_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__a.equals(syntax))
				emit_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__p.equals(syntax))
				emit_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('(' | 'NOT (')*
	 */
	protected void emit_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' | 'NOT (')+
	 */
	protected void emit_PrimaryExpression___LeftParenthesisKeyword_1_0_or_NOTKeyword_2_0__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
