/**
 */
package org.openetcs.model.ertmsformalspecs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Related</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isImplemented <em>Implemented</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isNeedsRequirement <em>Needs Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getReqRelated()
 * @model abstract="true"
 * @generated
 */
public interface ReqRelated extends ReferencesParagraph {
	/**
	 * Returns the value of the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented</em>' attribute.
	 * @see #setImplemented(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getReqRelated_Implemented()
	 * @model
	 * @generated
	 */
	boolean isImplemented();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isImplemented <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented</em>' attribute.
	 * @see #isImplemented()
	 * @generated
	 */
	void setImplemented(boolean value);

	/**
	 * Returns the value of the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified</em>' attribute.
	 * @see #setVerified(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getReqRelated_Verified()
	 * @model
	 * @generated
	 */
	boolean isVerified();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isVerified <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' attribute.
	 * @see #isVerified()
	 * @generated
	 */
	void setVerified(boolean value);

	/**
	 * Returns the value of the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Requirement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Requirement</em>' attribute.
	 * @see #setNeedsRequirement(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getReqRelated_NeedsRequirement()
	 * @model
	 * @generated
	 */
	boolean isNeedsRequirement();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isNeedsRequirement <em>Needs Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Requirement</em>' attribute.
	 * @see #isNeedsRequirement()
	 * @generated
	 */
	void setNeedsRequirement(boolean value);

} // ReqRelated
