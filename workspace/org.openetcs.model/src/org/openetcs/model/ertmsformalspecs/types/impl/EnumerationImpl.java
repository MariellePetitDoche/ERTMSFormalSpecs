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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.types.EnumValue;
import org.openetcs.model.ertmsformalspecs.types.Enumeration;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.EnumerationImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.EnumerationImpl#getSubEnumerations <em>Sub Enumerations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.types.impl.EnumerationImpl#getParentEnumeration <em>Parent Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends TypeImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValue> values;

	/**
	 * The cached value of the '{@link #getSubEnumerations() <em>Sub Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> subEnumerations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentWithInverseEList<EnumValue>(EnumValue.class, this, TypesPackage.ENUMERATION__VALUES, TypesPackage.ENUM_VALUE__PARENT_ENUMERATION);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getSubEnumerations() {
		if (subEnumerations == null) {
			subEnumerations = new EObjectContainmentWithInverseEList<Enumeration>(Enumeration.class, this, TypesPackage.ENUMERATION__SUB_ENUMERATIONS, TypesPackage.ENUMERATION__PARENT_ENUMERATION);
		}
		return subEnumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getParentEnumeration() {
		if (eContainerFeatureID() != TypesPackage.ENUMERATION__PARENT_ENUMERATION) return null;
		return (Enumeration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentEnumeration(Enumeration newParentEnumeration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentEnumeration, TypesPackage.ENUMERATION__PARENT_ENUMERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentEnumeration(Enumeration newParentEnumeration) {
		if (newParentEnumeration != eInternalContainer() || (eContainerFeatureID() != TypesPackage.ENUMERATION__PARENT_ENUMERATION && newParentEnumeration != null)) {
			if (EcoreUtil.isAncestor(this, newParentEnumeration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentEnumeration != null)
				msgs = ((InternalEObject)newParentEnumeration).eInverseAdd(this, TypesPackage.ENUMERATION__SUB_ENUMERATIONS, Enumeration.class, msgs);
			msgs = basicSetParentEnumeration(newParentEnumeration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ENUMERATION__PARENT_ENUMERATION, newParentEnumeration, newParentEnumeration));
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
			case TypesPackage.ENUMERATION__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATION__SUB_ENUMERATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubEnumerations()).basicAdd(otherEnd, msgs);
			case TypesPackage.ENUMERATION__PARENT_ENUMERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentEnumeration((Enumeration)otherEnd, msgs);
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
			case TypesPackage.ENUMERATION__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATION__SUB_ENUMERATIONS:
				return ((InternalEList<?>)getSubEnumerations()).basicRemove(otherEnd, msgs);
			case TypesPackage.ENUMERATION__PARENT_ENUMERATION:
				return basicSetParentEnumeration(null, msgs);
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
			case TypesPackage.ENUMERATION__PARENT_ENUMERATION:
				return eInternalContainer().eInverseRemove(this, TypesPackage.ENUMERATION__SUB_ENUMERATIONS, Enumeration.class, msgs);
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
			case TypesPackage.ENUMERATION__VALUES:
				return getValues();
			case TypesPackage.ENUMERATION__SUB_ENUMERATIONS:
				return getSubEnumerations();
			case TypesPackage.ENUMERATION__PARENT_ENUMERATION:
				return getParentEnumeration();
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
			case TypesPackage.ENUMERATION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends EnumValue>)newValue);
				return;
			case TypesPackage.ENUMERATION__SUB_ENUMERATIONS:
				getSubEnumerations().clear();
				getSubEnumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case TypesPackage.ENUMERATION__PARENT_ENUMERATION:
				setParentEnumeration((Enumeration)newValue);
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
			case TypesPackage.ENUMERATION__VALUES:
				getValues().clear();
				return;
			case TypesPackage.ENUMERATION__SUB_ENUMERATIONS:
				getSubEnumerations().clear();
				return;
			case TypesPackage.ENUMERATION__PARENT_ENUMERATION:
				setParentEnumeration((Enumeration)null);
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
			case TypesPackage.ENUMERATION__VALUES:
				return values != null && !values.isEmpty();
			case TypesPackage.ENUMERATION__SUB_ENUMERATIONS:
				return subEnumerations != null && !subEnumerations.isEmpty();
			case TypesPackage.ENUMERATION__PARENT_ENUMERATION:
				return getParentEnumeration() != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationImpl
