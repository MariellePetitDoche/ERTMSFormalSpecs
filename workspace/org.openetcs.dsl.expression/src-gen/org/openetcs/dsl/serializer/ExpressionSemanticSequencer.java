package org.openetcs.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.openetcs.dsl.expression.And;
import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.DoubleValue;
import org.openetcs.dsl.expression.Equality;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.IntegerValue;
import org.openetcs.dsl.expression.Model;
import org.openetcs.dsl.expression.Or;
import org.openetcs.dsl.expression.StringValue;
import org.openetcs.dsl.services.ExpressionGrammarAccess;

@SuppressWarnings("all")
public class ExpressionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressionGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionPackage.AND:
				if(context == grammarAccess.getAndRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DESIGNATOR:
				if(context == grammarAccess.getDesignatorRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Designator(context, (Designator) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DOUBLE_VALUE:
				if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Term(context, (DoubleValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.EQUALITY:
				if(context == grammarAccess.getEqualityRule()) {
					sequence_Equality(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.INTEGER_VALUE:
				if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Term(context, (IntegerValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.OR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.STRING_VALUE:
				if(context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Term(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Equality right=Equality?)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[EObject|ID]
	 */
	protected void sequence_Designator(EObject context, Designator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.DESIGNATOR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.DESIGNATOR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDesignatorAccess().getValueEObjectIDTerminalRuleCall_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=PrimaryExpression 
	 *         (
	 *             right=PrimaryExpression | 
	 *             right=PrimaryExpression | 
	 *             right=PrimaryExpression | 
	 *             right=PrimaryExpression | 
	 *             right=PrimaryExpression | 
	 *             right=PrimaryExpression
	 *         )?
	 *     )
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.MODEL__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.MODEL__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getExpressionExpressionParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=And right=And?)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DOUBLE
	 */
	protected void sequence_Term(EObject context, DoubleValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.DOUBLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.DOUBLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermAccess().getValueDOUBLETerminalRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Term(EObject context, IntegerValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.INTEGER_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.INTEGER_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermAccess().getValueINTTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Term(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.STRING_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTermAccess().getValueSTRINGTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
}
