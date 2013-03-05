/**
 */
package org.openetcs.model.ertmsformalspecs.types.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openetcs.model.ertmsformalspecs.types.EnumValue;
import org.openetcs.model.ertmsformalspecs.types.Enumeration;
import org.openetcs.model.ertmsformalspecs.types.Range;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.EnumValueImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.EnumValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.EnumValueImpl#getParentEnumeration <em>Parent Enumeration</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.EnumValueImpl#getParentRange <em>Parent Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumValueImpl extends EObjectImpl implements EnumValue {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUM_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_VALUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getParentEnumeration() {
		if (eContainerFeatureID() != TypesPackage.ENUM_VALUE__PARENT_ENUMERATION) return null;
		return (Enumeration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEnumeration(Enumeration newParentEnumeration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentEnumeration, TypesPackage.ENUM_VALUE__PARENT_ENUMERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEnumeration(Enumeration newParentEnumeration) {
		if (newParentEnumeration != eInternalContainer() || (eContainerFeatureID() != TypesPackage.ENUM_VALUE__PARENT_ENUMERATION && newParentEnumeration != null)) {
			if (EcoreUtil.isAncestor(this, newParentEnumeration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentEnumeration != null)
				msgs = ((InternalEObject)newParentEnumeration).eInverseAdd(this, TypesPackage.ENUMERATION__VALUES, Enumeration.class, msgs);
			msgs = basicSetParentEnumeration(newParentEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_VALUE__PARENT_ENUMERATION, newParentEnumeration, newParentEnumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getParentRange() {
		if (eContainerFeatureID() != TypesPackage.ENUM_VALUE__PARENT_RANGE) return null;
		return (Range)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRange(Range newParentRange, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRange, TypesPackage.ENUM_VALUE__PARENT_RANGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRange(Range newParentRange) {
		if (newParentRange != eInternalContainer() || (eContainerFeatureID() != TypesPackage.ENUM_VALUE__PARENT_RANGE && newParentRange != null)) {
			if (EcoreUtil.isAncestor(this, newParentRange))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRange != null)
				msgs = ((InternalEObject)newParentRange).eInverseAdd(this, TypesPackage.RANGE__SPECIAL_VALUES, Range.class, msgs);
			msgs = basicSetParentRange(newParentRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUM_VALUE__PARENT_RANGE, newParentRange, newParentRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.ENUM_VALUE__PARENT_ENUMERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentEnumeration((Enumeration)otherEnd, msgs);
			case TypesPackage.ENUM_VALUE__PARENT_RANGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRange((Range)otherEnd, msgs);
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
			case TypesPackage.ENUM_VALUE__PARENT_ENUMERATION:
				return basicSetParentEnumeration(null, msgs);
			case TypesPackage.ENUM_VALUE__PARENT_RANGE:
				return basicSetParentRange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TypesPackage.ENUM_VALUE__PARENT_ENUMERATION:
				return eInternalContainer().eInverseRemove(this, TypesPackage.ENUMERATION__VALUES, Enumeration.class, msgs);
			case TypesPackage.ENUM_VALUE__PARENT_RANGE:
				return eInternalContainer().eInverseRemove(this, TypesPackage.RANGE__SPECIAL_VALUES, Range.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.ENUM_VALUE__NAME:
				return getName();
			case TypesPackage.ENUM_VALUE__VALUE:
				return getValue();
			case TypesPackage.ENUM_VALUE__PARENT_ENUMERATION:
				return getParentEnumeration();
			case TypesPackage.ENUM_VALUE__PARENT_RANGE:
				return getParentRange();
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
			case TypesPackage.ENUM_VALUE__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.ENUM_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case TypesPackage.ENUM_VALUE__PARENT_ENUMERATION:
				setParentEnumeration((Enumeration)newValue);
				return;
			case TypesPackage.ENUM_VALUE__PARENT_RANGE:
				setParentRange((Range)newValue);
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
			case TypesPackage.ENUM_VALUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesPackage.ENUM_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case TypesPackage.ENUM_VALUE__PARENT_ENUMERATION:
				setParentEnumeration((Enumeration)null);
				return;
			case TypesPackage.ENUM_VALUE__PARENT_RANGE:
				setParentRange((Range)null);
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
			case TypesPackage.ENUM_VALUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesPackage.ENUM_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case TypesPackage.ENUM_VALUE__PARENT_ENUMERATION:
				return getParentEnumeration() != null;
			case TypesPackage.ENUM_VALUE__PARENT_RANGE:
				return getParentRange() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EnumValueImpl
