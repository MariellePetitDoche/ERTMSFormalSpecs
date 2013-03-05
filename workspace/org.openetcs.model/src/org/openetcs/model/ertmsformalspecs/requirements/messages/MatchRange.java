/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMaximum <em>Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMatchRange()
 * @model
 * @generated
 */
public interface MatchRange extends IMatch {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMatchRange_Minimum()
	 * @model
	 * @generated
	 */
	String getMinimum();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(String value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getMatchRange_Maximum()
	 * @model
	 * @generated
	 */
	String getMaximum();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(String value);

} // MatchRange
