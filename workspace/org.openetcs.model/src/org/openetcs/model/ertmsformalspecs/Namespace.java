/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentDictionary <em>Parent Dictionary</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Namespace#getSubNamespaces <em>Sub Namespaces</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentNamespace <em>Parent Namespace</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Namespace#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Namespace#getTypes <em>Types</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Namespace#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.Namespace#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Dictionary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #setParentDictionary(Dictionary)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace_ParentDictionary()
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getNamespaces
	 * @model opposite="namespaces" transient="false"
	 * @generated
	 */
	Dictionary getParentDictionary();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentDictionary <em>Parent Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #getParentDictionary()
	 * @generated
	 */
	void setParentDictionary(Dictionary value);

	/**
	 * Returns the value of the '<em><b>Sub Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Namespace}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Namespaces</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace_SubNamespaces()
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getParentNamespace
	 * @model opposite="parentNamespace" containment="true"
	 * @generated
	 */
	EList<Namespace> getSubNamespaces();

	/**
	 * Returns the value of the '<em><b>Parent Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Namespace#getSubNamespaces <em>Sub Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Namespace</em>' container reference.
	 * @see #setParentNamespace(Namespace)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace_ParentNamespace()
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getSubNamespaces
	 * @model opposite="subNamespaces" transient="false"
	 * @generated
	 */
	Namespace getParentNamespace();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentNamespace <em>Parent Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Namespace</em>' container reference.
	 * @see #getParentNamespace()
	 * @generated
	 */
	void setParentNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Procedure}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace_Procedures()
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getParentNamespace
	 * @model opposite="parentNamespace" containment="true"
	 * @generated
	 */
	EList<Procedure> getProcedures();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.types.Type}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Type#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace_Types()
	 * @see org.openetcs.model.ertmsformalspecs.types.Type#getParentNamespace
	 * @model opposite="parentNamespace" containment="true"
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.Variable}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Variable#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace_Variables()
	 * @see org.openetcs.model.ertmsformalspecs.Variable#getParentNamespace
	 * @model opposite="parentNamespace" containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

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
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getNamespace_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Namespace
