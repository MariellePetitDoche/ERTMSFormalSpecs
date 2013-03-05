/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meaning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getType <em>Type</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMeaning()
 * @model
 * @generated
 */
public interface Meaning extends BaseLinedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType
	 * @see #setType(EMeaningType)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMeaning_Type()
	 * @model
	 * @generated
	 */
	EMeaningType getType();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType
	 * @see #getType()
	 * @generated
	 */
	void setType(EMeaningType value);

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
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMeaning_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Meaning
