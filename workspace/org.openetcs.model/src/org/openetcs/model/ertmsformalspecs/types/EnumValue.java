/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getValue <em>Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentEnumeration <em>Parent Enumeration</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentRange <em>Parent Range</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Parent Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Enumeration#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Enumeration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Enumeration</em>' container reference.
	 * @see #setParentEnumeration(Enumeration)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumValue_ParentEnumeration()
	 * @see org.openetcs.model.ertmsformalspecs.types.Enumeration#getValues
	 * @model opposite="values" transient="false"
	 * @generated
	 */
	Enumeration getParentEnumeration();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentEnumeration <em>Parent Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Enumeration</em>' container reference.
	 * @see #getParentEnumeration()
	 * @generated
	 */
	void setParentEnumeration(Enumeration value);

	/**
	 * Returns the value of the '<em><b>Parent Range</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.Range#getSpecialValues <em>Special Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Range</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Range</em>' container reference.
	 * @see #setParentRange(Range)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getEnumValue_ParentRange()
	 * @see org.openetcs.model.ertmsformalspecs.types.Range#getSpecialValues
	 * @model opposite="specialValues" transient="false"
	 * @generated
	 */
	Range getParentRange();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentRange <em>Parent Range</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Range</em>' container reference.
	 * @see #getParentRange()
	 * @generated
	 */
	void setParentRange(Range value);

} // EnumValue
