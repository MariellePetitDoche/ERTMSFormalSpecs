/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage
 * @generated
 */
public interface MessagesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessagesFactory eINSTANCE = org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Spec</em>'.
	 * @generated
	 */
	TypeSpec createTypeSpec();

	/**
	 * Returns a new object of class '<em>Char Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Value</em>'.
	 * @generated
	 */
	CharValue createCharValue();

	/**
	 * Returns a new object of class '<em>Type Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Value</em>'.
	 * @generated
	 */
	TypeValue createTypeValue();

	/**
	 * Returns a new object of class '<em>Resolution Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolution Formula</em>'.
	 * @generated
	 */
	ResolutionFormula createResolutionFormula();

	/**
	 * Returns a new object of class '<em>Special Or Reserved Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special Or Reserved Value</em>'.
	 * @generated
	 */
	SpecialOrReservedValue createSpecialOrReservedValue();

	/**
	 * Returns a new object of class '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Value</em>'.
	 * @generated
	 */
	SingleValue createSingleValue();

	/**
	 * Returns a new object of class '<em>Mask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mask</em>'.
	 * @generated
	 */
	Mask createMask();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Match Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Range</em>'.
	 * @generated
	 */
	MatchRange createMatchRange();

	/**
	 * Returns a new object of class '<em>Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meaning</em>'.
	 * @generated
	 */
	Meaning createMeaning();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media</em>'.
	 * @generated
	 */
	Media createMedia();

	/**
	 * Returns a new object of class '<em>Message Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Variable</em>'.
	 * @generated
	 */
	MessageVariable createMessageVariable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MessagesPackage getMessagesPackage();

} //MessagesFactory
