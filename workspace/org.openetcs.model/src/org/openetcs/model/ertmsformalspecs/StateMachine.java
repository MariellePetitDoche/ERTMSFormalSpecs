/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.StateMachine#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.StateMachine#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentState <em>Parent State</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentProcedure <em>Parent Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends Type {
	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see #setInitialState(String)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getStateMachine_InitialState()
	 * @model
	 * @generated
	 */
	String getInitialState();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' attribute.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.State}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.State#getParentStateMachine <em>Parent State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getStateMachine_States()
	 * @see org.openetcs.model.ertmsformalspecs.State#getParentStateMachine
	 * @model opposite="parentStateMachine" containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.Rule}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentStateMachine <em>Parent State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getStateMachine_Rules()
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentStateMachine
	 * @model opposite="parentStateMachine" containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Parent State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.State#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent State</em>' container reference.
	 * @see #setParentState(State)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getStateMachine_ParentState()
	 * @see org.openetcs.model.ertmsformalspecs.State#getStateMachine
	 * @model opposite="stateMachine" transient="false"
	 * @generated
	 */
	State getParentState();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentState <em>Parent State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State</em>' container reference.
	 * @see #getParentState()
	 * @generated
	 */
	void setParentState(State value);

	/**
	 * Returns the value of the '<em><b>Parent Procedure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Procedure#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Procedure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Procedure</em>' container reference.
	 * @see #setParentProcedure(Procedure)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getStateMachine_ParentProcedure()
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getStateMachine
	 * @model opposite="stateMachine" transient="false"
	 * @generated
	 */
	Procedure getParentProcedure();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentProcedure <em>Parent Procedure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Procedure</em>' container reference.
	 * @see #getParentProcedure()
	 * @generated
	 */
	void setParentProcedure(Procedure value);

} // StateMachine
