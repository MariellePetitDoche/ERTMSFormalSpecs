/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;
import org.openetcs.model.ertmsformalspecs.requirements.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ScopeImpl#isOnBoardUnit <em>On Board Unit</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ScopeImpl#isTrackSide <em>Track Side</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ScopeImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends EObjectImpl implements Scope {
	/**
	 * The default value of the '{@link #isOnBoardUnit() <em>On Board Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnBoardUnit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_BOARD_UNIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnBoardUnit() <em>On Board Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnBoardUnit()
	 * @generated
	 * @ordered
	 */
	protected boolean onBoardUnit = ON_BOARD_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrackSide() <em>Track Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackSide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACK_SIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrackSide() <em>Track Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackSide()
	 * @generated
	 * @ordered
	 */
	protected boolean trackSide = TRACK_SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementsPackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnBoardUnit() {
		return onBoardUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnBoardUnit(boolean newOnBoardUnit) {
		boolean oldOnBoardUnit = onBoardUnit;
		onBoardUnit = newOnBoardUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SCOPE__ON_BOARD_UNIT, oldOnBoardUnit, onBoardUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrackSide() {
		return trackSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackSide(boolean newTrackSide) {
		boolean oldTrackSide = trackSide;
		trackSide = newTrackSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SCOPE__TRACK_SIDE, oldTrackSide, trackSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RequirementsPackage.SCOPE__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementsPackage.SCOPE__ON_BOARD_UNIT:
				return isOnBoardUnit();
			case RequirementsPackage.SCOPE__TRACK_SIDE:
				return isTrackSide();
			case RequirementsPackage.SCOPE__OPTIONAL:
				return isOptional();
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
			case RequirementsPackage.SCOPE__ON_BOARD_UNIT:
				setOnBoardUnit((Boolean)newValue);
				return;
			case RequirementsPackage.SCOPE__TRACK_SIDE:
				setTrackSide((Boolean)newValue);
				return;
			case RequirementsPackage.SCOPE__OPTIONAL:
				setOptional((Boolean)newValue);
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
			case RequirementsPackage.SCOPE__ON_BOARD_UNIT:
				setOnBoardUnit(ON_BOARD_UNIT_EDEFAULT);
				return;
			case RequirementsPackage.SCOPE__TRACK_SIDE:
				setTrackSide(TRACK_SIDE_EDEFAULT);
				return;
			case RequirementsPackage.SCOPE__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case RequirementsPackage.SCOPE__ON_BOARD_UNIT:
				return onBoardUnit != ON_BOARD_UNIT_EDEFAULT;
			case RequirementsPackage.SCOPE__TRACK_SIDE:
				return trackSide != TRACK_SIDE_EDEFAULT;
			case RequirementsPackage.SCOPE__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
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
		result.append(" (onBoardUnit: ");
		result.append(onBoardUnit);
		result.append(", trackSide: ");
		result.append(trackSide);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
