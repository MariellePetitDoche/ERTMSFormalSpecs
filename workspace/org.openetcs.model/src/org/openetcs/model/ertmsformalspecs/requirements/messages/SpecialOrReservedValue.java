/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Or Reserved Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMask <em>Mask</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMatch <em>Match</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getSpecialOrReservedValue()
 * @model
 * @generated
 */
public interface SpecialOrReservedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' containment reference.
	 * @see #setMask(Mask)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getSpecialOrReservedValue_Mask()
	 * @model containment="true"
	 * @generated
	 */
	Mask getMask();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMask <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' containment reference.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(Mask value);

	/**
	 * Returns the value of the '<em><b>Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match</em>' containment reference.
	 * @see #setMatch(IMatch)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getSpecialOrReservedValue_Match()
	 * @model containment="true"
	 * @generated
	 */
	IMatch getMatch();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMatch <em>Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match</em>' containment reference.
	 * @see #getMatch()
	 * @generated
	 */
	void setMatch(IMatch value);

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' containment reference.
	 * @see #setMeaning(Meaning)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getSpecialOrReservedValue_Meaning()
	 * @model containment="true"
	 * @generated
	 */
	Meaning getMeaning();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMeaning <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' containment reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(Meaning value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(SingleValue)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getSpecialOrReservedValue_Value()
	 * @model containment="true"
	 * @generated
	 */
	SingleValue getValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(SingleValue value);

} // SpecialOrReservedValue
