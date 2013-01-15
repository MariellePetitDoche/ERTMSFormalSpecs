/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour;

import org.eclipse.emf.ecore.EObject;
import org.openetcs.model.ertmsformalspecs.types.Case;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentCase <em>Parent Case</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentRuleCondition <em>Parent Rule Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getPreCondition()
 * @model
 * @generated
 */
public interface PreCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Case#getPreConditions <em>Pre Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Case</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Case</em>' container reference.
	 * @see #setParentCase(Case)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getPreCondition_ParentCase()
	 * @see org.openetcs.model.ertmsformalspecs.types.Case#getPreConditions
	 * @model opposite="preConditions" transient="false"
	 * @generated
	 */
	Case getParentCase();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentCase <em>Parent Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Case</em>' container reference.
	 * @see #getParentCase()
	 * @generated
	 */
	void setParentCase(Case value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getPreCondition_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Parent Rule Condition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Rule Condition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Rule Condition</em>' container reference.
	 * @see #setParentRuleCondition(RuleCondition)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getPreCondition_ParentRuleCondition()
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getPreconditions
	 * @model opposite="preconditions" transient="false"
	 * @generated
	 */
	RuleCondition getParentRuleCondition();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentRuleCondition <em>Parent Rule Condition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Rule Condition</em>' container reference.
	 * @see #getParentRuleCondition()
	 * @generated
	 */
	void setParentRuleCondition(RuleCondition value);

} // PreCondition
