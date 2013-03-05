/**
 */
package org.openetcs.model.ertmsformalspecs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.ReqRelated;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Related</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl#isImplemented <em>Implemented</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl#isNeedsRequirement <em>Needs Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ReqRelatedImpl extends ReferencesParagraphImpl implements ReqRelated {
	/**
	 * The default value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplemented()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLEMENTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplemented()
	 * @generated
	 * @ordered
	 */
	protected boolean implemented = IMPLEMENTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerified()
	 * @generated
	 * @ordered
	 */
	protected boolean verified = VERIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsRequirement() <em>Needs Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_REQUIREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsRequirement() <em>Needs Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsRequirement()
	 * @generated
	 * @ordered
	 */
	protected boolean needsRequirement = NEEDS_REQUIREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqRelatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.REQ_RELATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplemented() {
		return implemented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplemented(boolean newImplemented) {
		boolean oldImplemented = implemented;
		implemented = newImplemented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQ_RELATED__IMPLEMENTED, oldImplemented, implemented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerified() {
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerified(boolean newVerified) {
		boolean oldVerified = verified;
		verified = newVerified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQ_RELATED__VERIFIED, oldVerified, verified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsRequirement() {
		return needsRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsRequirement(boolean newNeedsRequirement) {
		boolean oldNeedsRequirement = needsRequirement;
		needsRequirement = newNeedsRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT, oldNeedsRequirement, needsRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.REQ_RELATED__IMPLEMENTED:
				return isImplemented();
			case ModelPackage.REQ_RELATED__VERIFIED:
				return isVerified();
			case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT:
				return isNeedsRequirement();
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
			case ModelPackage.REQ_RELATED__IMPLEMENTED:
				setImplemented((Boolean)newValue);
				return;
			case ModelPackage.REQ_RELATED__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT:
				setNeedsRequirement((Boolean)newValue);
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
			case ModelPackage.REQ_RELATED__IMPLEMENTED:
				setImplemented(IMPLEMENTED_EDEFAULT);
				return;
			case ModelPackage.REQ_RELATED__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT:
				setNeedsRequirement(NEEDS_REQUIREMENT_EDEFAULT);
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
			case ModelPackage.REQ_RELATED__IMPLEMENTED:
				return implemented != IMPLEMENTED_EDEFAULT;
			case ModelPackage.REQ_RELATED__VERIFIED:
				return verified != VERIFIED_EDEFAULT;
			case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT:
				return needsRequirement != NEEDS_REQUIREMENT_EDEFAULT;
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
		result.append(" (implemented: ");
		result.append(implemented);
		result.append(", verified: ");
		result.append(verified);
		result.append(", needsRequirement: ");
		result.append(needsRequirement);
		result.append(')');
		return result.toString();
	}

} //ReqRelatedImpl
