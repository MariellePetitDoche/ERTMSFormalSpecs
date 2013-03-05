/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getLength <em>Length</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getSubVariables <em>Sub Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getParentVariable <em>Parent Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessageVariable()
 * @model
 * @generated
 */
public interface MessageVariable extends BaseLinedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessageVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessageVariable_Length()
	 * @model
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessageVariable_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Sub Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getParentVariable <em>Parent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Variables</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessageVariable_SubVariables()
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getParentVariable
	 * @model opposite="parentVariable" containment="true"
	 * @generated
	 */
	EList<MessageVariable> getSubVariables();

	/**
	 * Returns the value of the '<em><b>Parent Variable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getSubVariables <em>Sub Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Variable</em>' container reference.
	 * @see #setParentVariable(MessageVariable)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMessageVariable_ParentVariable()
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getSubVariables
	 * @model opposite="subVariables" transient="false"
	 * @generated
	 */
	MessageVariable getParentVariable();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getParentVariable <em>Parent Variable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Variable</em>' container reference.
	 * @see #getParentVariable()
	 * @generated
	 */
	void setParentVariable(MessageVariable value);

} // MessageVariable
