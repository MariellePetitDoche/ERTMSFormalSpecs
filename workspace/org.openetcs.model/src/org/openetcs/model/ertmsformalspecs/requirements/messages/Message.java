/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getMedia <em>Media</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends BaseLinedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessage_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessage_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(Media)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessage_Media()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Media getMedia();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(Media value);

} // Message
