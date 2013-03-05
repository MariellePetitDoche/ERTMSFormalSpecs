/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Range#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Range#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Range#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.Range#getSpecialValues <em>Special Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends Type {
	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' attribute.
	 * @see #setMinimumValue(String)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getRange_MinimumValue()
	 * @model
	 * @generated
	 */
	String getMinimumValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Range#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' attribute.
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #setMaximumValue(String)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getRange_MaximumValue()
	 * @model
	 * @generated
	 */
	String getMaximumValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Range#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.types.Precision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.types.Precision
	 * @see #setPrecision(Precision)
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getRange_Precision()
	 * @model
	 * @generated
	 */
	Precision getPrecision();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.types.Range#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.types.Precision
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Precision value);

	/**
	 * Returns the value of the '<em><b>Special Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.types.EnumValue}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentRange <em>Parent Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Values</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getRange_SpecialValues()
	 * @see org.openetcs.model.ertmsformalspecs.types.EnumValue#getParentRange
	 * @model opposite="parentRange" containment="true"
	 * @generated
	 */
	EList<EnumValue> getSpecialValues();

} // Range
