/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.types.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Procedure#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Procedure#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Procedure#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentNamespace <em>Parent Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getProcedure()
 * @model
 * @generated
 */
public interface Procedure extends NamedElement, ReqRelated {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentProcedure <em>Parent Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getProcedure_Parameters()
	 * @see org.openetcs.model.ertmsformalspecs.Parameter#getParentProcedure
	 * @model opposite="parentProcedure" containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentProcedure <em>Parent Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' containment reference.
	 * @see #setStateMachine(StateMachine)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getProcedure_StateMachine()
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getParentProcedure
	 * @model opposite="parentProcedure" containment="true"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Procedure#getStateMachine <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' containment reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getProcedure_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Parent Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Structure#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Structure</em>' container reference.
	 * @see #setParentStructure(Structure)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getProcedure_ParentStructure()
	 * @see org.openetcs.model.ertmsformalspecs.types.Structure#getProcedures
	 * @model opposite="procedures" transient="false"
	 * @generated
	 */
	Structure getParentStructure();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentStructure <em>Parent Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Structure</em>' container reference.
	 * @see #getParentStructure()
	 * @generated
	 */
	void setParentStructure(Structure value);

	/**
	 * Returns the value of the '<em><b>Parent Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Namespace#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Namespace</em>' container reference.
	 * @see #setParentNamespace(Namespace)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getProcedure_ParentNamespace()
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getProcedures
	 * @model opposite="procedures" transient="false"
	 * @generated
	 */
	Namespace getParentNamespace();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentNamespace <em>Parent Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Namespace</em>' container reference.
	 * @see #getParentNamespace()
	 * @generated
	 */
	void setParentNamespace(Namespace value);

} // Procedure
