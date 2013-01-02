/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

import org.openetcs.model.ertmsformalspecs.CommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isReviewed <em>Reviewed</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#getImplementationStatus <em>Implementation Status</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isMoreInfoRequired <em>More Info Required</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isSpecIssue <em>Spec Issue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getProcessInformation()
 * @model
 * @generated
 */
public interface ProcessInformation extends CommentedElement {
	/**
	 * Returns the value of the '<em><b>Reviewed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reviewed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewed</em>' attribute.
	 * @see #setReviewed(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getProcessInformation_Reviewed()
	 * @model
	 * @generated
	 */
	boolean isReviewed();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isReviewed <em>Reviewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reviewed</em>' attribute.
	 * @see #isReviewed()
	 * @generated
	 */
	void setReviewed(boolean value);

	/**
	 * Returns the value of the '<em><b>Implementation Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Status</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus
	 * @see #setImplementationStatus(EImplementationStatus)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getProcessInformation_ImplementationStatus()
	 * @model
	 * @generated
	 */
	EImplementationStatus getImplementationStatus();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#getImplementationStatus <em>Implementation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Status</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus
	 * @see #getImplementationStatus()
	 * @generated
	 */
	void setImplementationStatus(EImplementationStatus value);

	/**
	 * Returns the value of the '<em><b>More Info Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>More Info Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>More Info Required</em>' attribute.
	 * @see #setMoreInfoRequired(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getProcessInformation_MoreInfoRequired()
	 * @model
	 * @generated
	 */
	boolean isMoreInfoRequired();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isMoreInfoRequired <em>More Info Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>More Info Required</em>' attribute.
	 * @see #isMoreInfoRequired()
	 * @generated
	 */
	void setMoreInfoRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Spec Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Issue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Issue</em>' attribute.
	 * @see #setSpecIssue(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getProcessInformation_SpecIssue()
	 * @model
	 * @generated
	 */
	boolean isSpecIssue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isSpecIssue <em>Spec Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Issue</em>' attribute.
	 * @see #isSpecIssue()
	 * @generated
	 */
	void setSpecIssue(boolean value);

} // ProcessInformation
