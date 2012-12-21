/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Variable#getParentNamespace <em>Parent Namespace</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Variable#getSubVariables <em>Sub Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Variable#getParentVariable <em>Parent Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement, ReqRelated, TypedElement, DefaultValueElement, VariableModeElement {
	/**
	 * Returns the value of the '<em><b>Parent Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Namespace#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Namespace</em>' container reference.
	 * @see #setParentNamespace(Namespace)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getVariable_ParentNamespace()
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getVariables
	 * @model opposite="variables" transient="false"
	 * @generated
	 */
	Namespace getParentNamespace();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Variable#getParentNamespace <em>Parent Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Namespace</em>' container reference.
	 * @see #getParentNamespace()
	 * @generated
	 */
	void setParentNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Sub Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Variables</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getVariable_SubVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getSubVariables();

	/**
	 * Returns the value of the '<em><b>Parent Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Variable</em>' reference.
	 * @see #setParentVariable(Variable)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getVariable_ParentVariable()
	 * @model
	 * @generated
	 */
	Variable getParentVariable();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Variable#getParentVariable <em>Parent Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Variable</em>' reference.
	 * @see #getParentVariable()
	 * @generated
	 */
	void setParentVariable(Variable value);

} // Variable
