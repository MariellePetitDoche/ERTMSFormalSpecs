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
import org.openetcs.dsl.expression.AndExpression;
import org.openetcs.dsl.expression.DashOperation;
import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.DoubleValue;
import org.openetcs.dsl.expression.EqualityExpression;
import org.openetcs.dsl.expression.ExpressionPackage;
import org.openetcs.dsl.expression.IntegerValue;
import org.openetcs.dsl.expression.Model;
import org.openetcs.dsl.expression.MultiStatement;
import org.openetcs.dsl.expression.OrExpression;
import org.openetcs.dsl.expression.PointOperation;
import org.openetcs.dsl.expression.PowOperation;
import org.openetcs.dsl.expression.SelfStatement;
import org.openetcs.dsl.expression.SingleStatement;
import org.openetcs.dsl.expression.StringValue;
import org.openetcs.dsl.services.ExpressionGrammarAccess;

@SuppressWarnings("all")
public class ExpressionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressionGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionPackage.AND_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_AndExpression(context, (AndExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DASH_OPERATION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_DashOperation(context, (DashOperation) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DESIGNATOR:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getDesignatorRule() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Designator(context, (Designator) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.DOUBLE_VALUE:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getTermRule() ||
				   context == grammarAccess.getUnaryExpressionRule()) {
					sequence_Term(context, (DoubleValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.EQUALITY_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_EqualityExpression(context, (EqualityExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.INTEGER_VALUE:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
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
			case ExpressionPackage.MULTI_STATEMENT:
				if(context == grammarAccess.getMultiStatementRule() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_MultiStatement(context, (MultiStatement) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.OR_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_OrExpression(context, (OrExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.POINT_OPERATION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PointOperation(context, (PointOperation) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.POW_OPERATION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule()) {
					sequence_PowOperation(context, (PowOperation) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SELF_STATEMENT:
				if(context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getSelfStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_SelfStatement(context, (SelfStatement) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SINGLE_STATEMENT:
				if(context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getSingleStatementRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_SingleStatement(context, (SingleStatement) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.STRING_VALUE:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0() ||
				   context == grammarAccess.getDashOperationRule() ||
				   context == grammarAccess.getDashOperationAccess().getDashOperationLeftAction_1_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getEqualityExpressionLeftAction_1_0() ||
				   context == grammarAccess.getEvaluationExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0() ||
				   context == grammarAccess.getPhraseRule() ||
				   context == grammarAccess.getPointOperationRule() ||
				   context == grammarAccess.getPointOperationAccess().getPointOperationLeftAction_1_0() ||
				   context == grammarAccess.getPowOperationRule() ||
				   context == grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
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
	 *     (left=AndExpression_AndExpression_1_0 op='AND' right=EqualityExpression)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.AND_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.AND_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.AND_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.AND_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.AND_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.AND_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExpressionAccess().getOpANDKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRightEqualityExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=DashOperation_DashOperation_1_0 (op='+' | op='-') right=PointOperation)
	 */
	protected void sequence_DashOperation(EObject context, DashOperation semanticObject) {
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
	 *         left=EqualityExpression_EqualityExpression_1_0 
	 *         (
	 *             op='==' | 
	 *             op='!=' | 
	 *             op='<=' | 
	 *             op='>=' | 
	 *             op='in' | 
	 *             op='not in'
	 *         ) 
	 *         right=DashOperation
	 *     )
	 */
	protected void sequence_EqualityExpression(EObject context, EqualityExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     phrase=Phrase
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.MODEL__PHRASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.MODEL__PHRASE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getModelAccess().getPhrasePhraseParserRuleCall_0(), semanticObject.getPhrase());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (desgnator=Designator expressions+=Expression*)
	 */
	protected void sequence_MultiStatement(EObject context, MultiStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=OrExpression_OrExpression_1_0 op='OR' right=AndExpression)
	 */
	protected void sequence_OrExpression(EObject context, OrExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.OR_EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.OR_EXPRESSION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.OR_EXPRESSION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.OR_EXPRESSION__OP));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.OR_EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.OR_EXPRESSION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrExpressionAccess().getOpORKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=PointOperation_PointOperation_1_0 (op='*' | op='/') right=PowOperation)
	 */
	protected void sequence_PointOperation(EObject context, PointOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PowOperation_PowOperation_1_0 op='^' right=PrimaryExpression)
	 */
	protected void sequence_PowOperation(EObject context, PowOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.POW_OPERATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.POW_OPERATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.POW_OPERATION__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.POW_OPERATION__OP));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.POW_OPERATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.POW_OPERATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPowOperationAccess().getPowOperationLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPowOperationAccess().getOpCircumflexAccentKeyword_1_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getPowOperationAccess().getRightPrimaryExpressionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=Expression
	 */
	protected void sequence_SelfStatement(EObject context, SelfStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.SELF_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.SELF_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelfStatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (desgnator=Designator expression=Expression)
	 */
	protected void sequence_SingleStatement(EObject context, SingleStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.SINGLE_STATEMENT__DESGNATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.SINGLE_STATEMENT__DESGNATOR));
			if(transientValues.isValueTransient(semanticObject, ExpressionPackage.Literals.SINGLE_STATEMENT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionPackage.Literals.SINGLE_STATEMENT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleStatementAccess().getDesgnatorDesignatorParserRuleCall_0_0(), semanticObject.getDesgnator());
		feeder.accept(grammarAccess.getSingleStatementAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
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
