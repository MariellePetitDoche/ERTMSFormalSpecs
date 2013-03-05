/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.openetcs.model.ertmsformalspecs.ReqRelated;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getActions <em>Actions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getSubRules <em>Sub Rules</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getPreconditions <em>Preconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRuleCondition()
 * @model
 * @generated
 */
public interface RuleCondition extends NamedElement, ReqRelated {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.Action}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentRuleCondition <em>Parent Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRuleCondition_Actions()
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentRuleCondition
	 * @model opposite="parentRuleCondition" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Sub Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Rules</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRuleCondition_SubRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getSubRules();

	/**
	 * Returns the value of the '<em><b>Preconditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentRuleCondition <em>Parent Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preconditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preconditions</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRuleCondition_Preconditions()
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentRuleCondition
	 * @model opposite="parentRuleCondition" containment="true"
	 * @generated
	 */
	EList<PreCondition> getPreconditions();

} // RuleCondition
