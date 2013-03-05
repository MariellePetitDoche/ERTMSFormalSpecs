/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue#getResolutionFormula <em>Resolution Formula</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue#getSpecialOrReservedValues <em>Special Or Reserved Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeValue()
 * @model
 * @generated
 */
public interface TypeValue extends Value {
	/**
	 * Returns the value of the '<em><b>Resolution Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Formula</em>' containment reference.
	 * @see #setResolutionFormula(ResolutionFormula)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeValue_ResolutionFormula()
	 * @model containment="true"
	 * @generated
	 */
	ResolutionFormula getResolutionFormula();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue#getResolutionFormula <em>Resolution Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Formula</em>' containment reference.
	 * @see #getResolutionFormula()
	 * @generated
	 */
	void setResolutionFormula(ResolutionFormula value);

	/**
	 * Returns the value of the '<em><b>Special Or Reserved Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Or Reserved Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Or Reserved Values</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeValue_SpecialOrReservedValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecialOrReservedValue> getSpecialOrReservedValues();

} // TypeValue
