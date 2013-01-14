/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openetcs.model.ertmsformalspecs.impl.CommentedElementImpl;
import org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus;
import org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl#isReviewed <em>Reviewed</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl#getImplementationStatus <em>Implementation Status</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl#isMoreInfoRequired <em>More Info Required</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl#isSpecIssue <em>Spec Issue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessInformationImpl extends CommentedElementImpl implements ProcessInformation {
	/**
	 * The default value of the '{@link #isReviewed() <em>Reviewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReviewed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REVIEWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReviewed() <em>Reviewed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReviewed()
	 * @generated
	 * @ordered
	 */
	protected boolean reviewed = REVIEWED_EDEFAULT;

	/**
	 * The default value of the '{@link #getImplementationStatus() <em>Implementation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final EImplementationStatus IMPLEMENTATION_STATUS_EDEFAULT = EImplementationStatus.NA;

	/**
	 * The cached value of the '{@link #getImplementationStatus() <em>Implementation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatus()
	 * @generated
	 * @ordered
	 */
	protected EImplementationStatus implementationStatus = IMPLEMENTATION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #isMoreInfoRequired() <em>More Info Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoreInfoRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MORE_INFO_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoreInfoRequired() <em>More Info Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoreInfoRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean moreInfoRequired = MORE_INFO_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpecIssue() <em>Spec Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpecIssue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPEC_ISSUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpecIssue() <em>Spec Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpecIssue()
	 * @generated
	 * @ordered
	 */
	protected boolean specIssue = SPEC_ISSUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.PROCESS_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReviewed() {
		return reviewed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReviewed(boolean newReviewed) {
		boolean oldReviewed = reviewed;
		reviewed = newReviewed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PROCESS_INFORMATION__REVIEWED, oldReviewed, reviewed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EImplementationStatus getImplementationStatus() {
		return implementationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationStatus(EImplementationStatus newImplementationStatus) {
		EImplementationStatus oldImplementationStatus = implementationStatus;
		implementationStatus = newImplementationStatus == null ? IMPLEMENTATION_STATUS_EDEFAULT : newImplementationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PROCESS_INFORMATION__IMPLEMENTATION_STATUS, oldImplementationStatus, implementationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoreInfoRequired() {
		return moreInfoRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoreInfoRequired(boolean newMoreInfoRequired) {
		boolean oldMoreInfoRequired = moreInfoRequired;
		moreInfoRequired = newMoreInfoRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PROCESS_INFORMATION__MORE_INFO_REQUIRED, oldMoreInfoRequired, moreInfoRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpecIssue() {
		return specIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecIssue(boolean newSpecIssue) {
		boolean oldSpecIssue = specIssue;
		specIssue = newSpecIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.PROCESS_INFORMATION__SPEC_ISSUE, oldSpecIssue, specIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.PROCESS_INFORMATION__REVIEWED:
				return isReviewed();
			case RequirementsPackage.PROCESS_INFORMATION__IMPLEMENTATION_STATUS:
				return getImplementationStatus();
			case RequirementsPackage.PROCESS_INFORMATION__MORE_INFO_REQUIRED:
				return isMoreInfoRequired();
			case RequirementsPackage.PROCESS_INFORMATION__SPEC_ISSUE:
				return isSpecIssue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequirementsPackage.PROCESS_INFORMATION__REVIEWED:
				setReviewed((Boolean)newValue);
				return;
			case RequirementsPackage.PROCESS_INFORMATION__IMPLEMENTATION_STATUS:
				setImplementationStatus((EImplementationStatus)newValue);
				return;
			case RequirementsPackage.PROCESS_INFORMATION__MORE_INFO_REQUIRED:
				setMoreInfoRequired((Boolean)newValue);
				return;
			case RequirementsPackage.PROCESS_INFORMATION__SPEC_ISSUE:
				setSpecIssue((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequirementsPackage.PROCESS_INFORMATION__REVIEWED:
				setReviewed(REVIEWED_EDEFAULT);
				return;
			case RequirementsPackage.PROCESS_INFORMATION__IMPLEMENTATION_STATUS:
				setImplementationStatus(IMPLEMENTATION_STATUS_EDEFAULT);
				return;
			case RequirementsPackage.PROCESS_INFORMATION__MORE_INFO_REQUIRED:
				setMoreInfoRequired(MORE_INFO_REQUIRED_EDEFAULT);
				return;
			case RequirementsPackage.PROCESS_INFORMATION__SPEC_ISSUE:
				setSpecIssue(SPEC_ISSUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequirementsPackage.PROCESS_INFORMATION__REVIEWED:
				return reviewed != REVIEWED_EDEFAULT;
			case RequirementsPackage.PROCESS_INFORMATION__IMPLEMENTATION_STATUS:
				return implementationStatus != IMPLEMENTATION_STATUS_EDEFAULT;
			case RequirementsPackage.PROCESS_INFORMATION__MORE_INFO_REQUIRED:
				return moreInfoRequired != MORE_INFO_REQUIRED_EDEFAULT;
			case RequirementsPackage.PROCESS_INFORMATION__SPEC_ISSUE:
				return specIssue != SPEC_ISSUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (reviewed: ");
		result.append(reviewed);
		result.append(", implementationStatus: ");
		result.append(implementationStatus);
		result.append(", moreInfoRequired: ");
		result.append(moreInfoRequired);
		result.append(", specIssue: ");
		result.append(specIssue);
		result.append(')');
		return result.toString();
	}

} //ProcessInformationImpl
