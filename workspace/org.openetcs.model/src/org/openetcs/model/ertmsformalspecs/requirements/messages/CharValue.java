/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Char Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue#getEncoding <em>Encoding</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getCharValue()
 * @model
 * @generated
 */
public interface CharValue extends Value {
	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getCharValue_Encoding()
	 * @model
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

} // CharValue
