/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeValueImpl#getResolutionFormula <em>Resolution Formula</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeValueImpl#getSpecialOrReservedValues <em>Special Or Reserved Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeValueImpl extends EObjectImpl implements TypeValue {
	/**
	 * The cached value of the '{@link #getResolutionFormula() <em>Resolution Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionFormula()
	 * @generated
	 * @ordered
	 */
	protected ResolutionFormula resolutionFormula;

	/**
	 * The cached value of the '{@link #getSpecialOrReservedValues() <em>Special Or Reserved Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialOrReservedValues()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecialOrReservedValue> specialOrReservedValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagesPackage.Literals.TYPE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionFormula getResolutionFormula() {
		return resolutionFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolutionFormula(ResolutionFormula newResolutionFormula, NotificationChain msgs) {
		ResolutionFormula oldResolutionFormula = resolutionFormula;
		resolutionFormula = newResolutionFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA, oldResolutionFormula, newResolutionFormula);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionFormula(ResolutionFormula newResolutionFormula) {
		if (newResolutionFormula != resolutionFormula) {
			NotificationChain msgs = null;
			if (resolutionFormula != null)
				msgs = ((InternalEObject)resolutionFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA, null, msgs);
			if (newResolutionFormula != null)
				msgs = ((InternalEObject)newResolutionFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA, null, msgs);
			msgs = basicSetResolutionFormula(newResolutionFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA, newResolutionFormula, newResolutionFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialOrReservedValue> getSpecialOrReservedValues() {
		if (specialOrReservedValues == null) {
			specialOrReservedValues = new EObjectContainmentEList<SpecialOrReservedValue>(SpecialOrReservedValue.class, this, MessagesPackage.TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES);
		}
		return specialOrReservedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA:
				return basicSetResolutionFormula(null, msgs);
			case MessagesPackage.TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES:
				return ((InternalEList<?>)getSpecialOrReservedValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA:
				return getResolutionFormula();
			case MessagesPackage.TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES:
				return getSpecialOrReservedValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA:
				setResolutionFormula((ResolutionFormula)newValue);
				return;
			case MessagesPackage.TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES:
				getSpecialOrReservedValues().clear();
				getSpecialOrReservedValues().addAll((Collection<? extends SpecialOrReservedValue>)newValue);
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
			case MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA:
				setResolutionFormula((ResolutionFormula)null);
				return;
			case MessagesPackage.TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES:
				getSpecialOrReservedValues().clear();
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
			case MessagesPackage.TYPE_VALUE__RESOLUTION_FORMULA:
				return resolutionFormula != null;
			case MessagesPackage.TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES:
				return specialOrReservedValues != null && !specialOrReservedValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeValueImpl
