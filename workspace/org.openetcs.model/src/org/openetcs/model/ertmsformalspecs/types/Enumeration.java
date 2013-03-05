/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Enumeration#getValues <em>Values</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Enumeration#getSubEnumerations <em>Sub Enumerations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Enumeration#getParentEnumeration <em>Parent Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.types.EnumValue}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentEnumeration <em>Parent Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumeration_Values()
	 * @see org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentEnumeration
	 * @model opposite="parentEnumeration" containment="true"
	 * @generated
	 */
	EList<EnumValue> getValues();

	/**
	 * Returns the value of the '<em><b>Sub Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.types.Enumeration}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Enumeration#getParentEnumeration <em>Parent Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Enumerations</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumeration_SubEnumerations()
	 * @see org.openetcs.model.ertmsformalspecs.types.Enumeration#getParentEnumeration
	 * @model opposite="parentEnumeration" containment="true"
	 * @generated
	 */
	EList<Enumeration> getSubEnumerations();

	/**
	 * Returns the value of the '<em><b>Parent Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Enumeration#getSubEnumerations <em>Sub Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Enumeration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Enumeration</em>' container reference.
	 * @see #setParentEnumeration(Enumeration)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumeration_ParentEnumeration()
	 * @see org.openetcs.model.ertmsformalspecs.types.Enumeration#getSubEnumerations
	 * @model opposite="subEnumerations" transient="false"
	 * @generated
	 */
	Enumeration getParentEnumeration();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Enumeration#getParentEnumeration <em>Parent Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Enumeration</em>' container reference.
	 * @see #getParentEnumeration()
	 * @generated
	 */
	void setParentEnumeration(Enumeration value);

} // Enumeration
