/**
 */
package org.openetcs.model.ertmsformalspecs.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.types.EnumValue;
import org.openetcs.model.ertmsformalspecs.types.Precision;
import org.openetcs.model.ertmsformalspecs.types.Range;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.RangeImpl#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.RangeImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.RangeImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.RangeImpl#getSpecialValues <em>Special Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeImpl extends TypeImpl implements Range {
	/**
	 * The default value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumValue() <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumValue()
	 * @generated
	 * @ordered
	 */
	protected String minimumValue = MINIMUM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected String maximumValue = MAXIMUM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Precision PRECISION_EDEFAULT = Precision.INTEGER_PRECISION;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected Precision precision = PRECISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialValues() <em>Special Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValue> specialValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumValue() {
		return minimumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumValue(String newMinimumValue) {
		String oldMinimumValue = minimumValue;
		minimumValue = newMinimumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RANGE__MINIMUM_VALUE, oldMinimumValue, minimumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumValue() {
		return maximumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumValue(String newMaximumValue) {
		String oldMaximumValue = maximumValue;
		maximumValue = newMaximumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RANGE__MAXIMUM_VALUE, oldMaximumValue, maximumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Precision getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(Precision newPrecision) {
		Precision oldPrecision = precision;
		precision = newPrecision == null ? PRECISION_EDEFAULT : newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.RANGE__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumValue> getSpecialValues() {
		if (specialValues == null) {
			specialValues = new EObjectContainmentWithInverseEList<EnumValue>(EnumValue.class, this, TypesPackage.RANGE__SPECIAL_VALUES, TypesPackage.ENUM_VALUE__PARENT_RANGE);
		}
		return specialValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.RANGE__SPECIAL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecialValues()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.RANGE__SPECIAL_VALUES:
				return ((InternalEList<?>)getSpecialValues()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.RANGE__MINIMUM_VALUE:
				return getMinimumValue();
			case TypesPackage.RANGE__MAXIMUM_VALUE:
				return getMaximumValue();
			case TypesPackage.RANGE__PRECISION:
				return getPrecision();
			case TypesPackage.RANGE__SPECIAL_VALUES:
				return getSpecialValues();
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
			case TypesPackage.RANGE__MINIMUM_VALUE:
				setMinimumValue((String)newValue);
				return;
			case TypesPackage.RANGE__MAXIMUM_VALUE:
				setMaximumValue((String)newValue);
				return;
			case TypesPackage.RANGE__PRECISION:
				setPrecision((Precision)newValue);
				return;
			case TypesPackage.RANGE__SPECIAL_VALUES:
				getSpecialValues().clear();
				getSpecialValues().addAll((Collection<? extends EnumValue>)newValue);
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
			case TypesPackage.RANGE__MINIMUM_VALUE:
				setMinimumValue(MINIMUM_VALUE_EDEFAULT);
				return;
			case TypesPackage.RANGE__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
				return;
			case TypesPackage.RANGE__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case TypesPackage.RANGE__SPECIAL_VALUES:
				getSpecialValues().clear();
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
			case TypesPackage.RANGE__MINIMUM_VALUE:
				return MINIMUM_VALUE_EDEFAULT == null ? minimumValue != null : !MINIMUM_VALUE_EDEFAULT.equals(minimumValue);
			case TypesPackage.RANGE__MAXIMUM_VALUE:
				return MAXIMUM_VALUE_EDEFAULT == null ? maximumValue != null : !MAXIMUM_VALUE_EDEFAULT.equals(maximumValue);
			case TypesPackage.RANGE__PRECISION:
				return precision != PRECISION_EDEFAULT;
			case TypesPackage.RANGE__SPECIAL_VALUES:
				return specialValues != null && !specialValues.isEmpty();
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
		result.append(" (minimumValue: ");
		result.append(minimumValue);
		result.append(", maximumValue: ");
		result.append(maximumValue);
		result.append(", precision: ");
		result.append(precision);
		result.append(')');
		return result.toString();
	}

} //RangeImpl
