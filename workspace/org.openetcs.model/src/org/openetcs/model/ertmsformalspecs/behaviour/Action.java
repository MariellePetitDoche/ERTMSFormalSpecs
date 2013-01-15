/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour;

import org.eclipse.emf.ecore.EObject;
import org.openetcs.model.ertmsformalspecs.test.SubStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentRuleCondition <em>Parent Rule Condition</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentSubStep <em>Parent Sub Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getAction_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Parent Rule Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Rule Condition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Rule Condition</em>' container reference.
	 * @see #setParentRuleCondition(RuleCondition)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getAction_ParentRuleCondition()
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	RuleCondition getParentRuleCondition();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentRuleCondition <em>Parent Rule Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Rule Condition</em>' container reference.
	 * @see #getParentRuleCondition()
	 * @generated
	 */
	void setParentRuleCondition(RuleCondition value);

	/**
	 * Returns the value of the '<em><b>Parent Sub Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Sub Step</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sub Step</em>' container reference.
	 * @see #setParentSubStep(SubStep)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getAction_ParentSubStep()
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	SubStep getParentSubStep();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentSubStep <em>Parent Sub Step</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Sub Step</em>' container reference.
	 * @see #getParentSubStep()
	 * @generated
	 */
	void setParentSubStep(SubStep value);

} // Action
