/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.openetcs.model.ertmsformalspecs.Namespace;
import org.openetcs.model.ertmsformalspecs.ReqRelated;
import org.openetcs.model.ertmsformalspecs.StateMachine;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentStateMachine <em>Parent State Machine</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentNamespace <em>Parent Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends NamedElement, ReqRelated {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.behaviour.Priority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Priority
	 * @see #setPriority(Priority)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRule_Priority()
	 * @model
	 * @generated
	 */
	Priority getPriority();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Priority
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Priority value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRule_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleCondition> getConditions();

	/**
	 * Returns the value of the '<em><b>Parent State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent State Machine</em>' container reference.
	 * @see #setParentStateMachine(StateMachine)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRule_ParentStateMachine()
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getRules
	 * @model opposite="rules" transient="false"
	 * @generated
	 */
	StateMachine getParentStateMachine();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentStateMachine <em>Parent State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State Machine</em>' container reference.
	 * @see #getParentStateMachine()
	 * @generated
	 */
	void setParentStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Parent Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Namespace</em>' reference.
	 * @see #setParentNamespace(Namespace)
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage#getRule_ParentNamespace()
	 * @model
	 * @generated
	 */
	Namespace getParentNamespace();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentNamespace <em>Parent Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Namespace</em>' reference.
	 * @see #getParentNamespace()
	 * @generated
	 */
	void setParentNamespace(Namespace value);

} // Rule
