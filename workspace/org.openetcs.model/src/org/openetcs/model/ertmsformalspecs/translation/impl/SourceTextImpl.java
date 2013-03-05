/**
 */
package org.openetcs.model.ertmsformalspecs.translation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openetcs.model.ertmsformalspecs.translation.SourceText;
import org.openetcs.model.ertmsformalspecs.translation.Translation;
import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.SourceTextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.SourceTextImpl#getParentTranslation <em>Parent Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceTextImpl extends EObjectImpl implements SourceText {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TranslationPackage.Literals.SOURCE_TEXT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.SOURCE_TEXT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation getParentTranslation() {
		if (eContainerFeatureID() != TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION) return null;
		return (Translation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentTranslation(Translation newParentTranslation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentTranslation, TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTranslation(Translation newParentTranslation) {
		if (newParentTranslation != eInternalContainer() || (eContainerFeatureID() != TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION && newParentTranslation != null)) {
			if (EcoreUtil.isAncestor(this, newParentTranslation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentTranslation != null)
				msgs = ((InternalEObject)newParentTranslation).eInverseAdd(this, TranslationPackage.TRANSLATION__SOURCES, Translation.class, msgs);
			msgs = basicSetParentTranslation(newParentTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION, newParentTranslation, newParentTranslation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentTranslation((Translation)otherEnd, msgs);
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
			case TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION:
				return basicSetParentTranslation(null, msgs);
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
			case TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION:
				return eInternalContainer().eInverseRemove(this, TranslationPackage.TRANSLATION__SOURCES, Translation.class, msgs);
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
			case TranslationPackage.SOURCE_TEXT__NAME:
				return getName();
			case TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION:
				return getParentTranslation();
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
			case TranslationPackage.SOURCE_TEXT__NAME:
				setName((String)newValue);
				return;
			case TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION:
				setParentTranslation((Translation)newValue);
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
			case TranslationPackage.SOURCE_TEXT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION:
				setParentTranslation((Translation)null);
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
			case TranslationPackage.SOURCE_TEXT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TranslationPackage.SOURCE_TEXT__PARENT_TRANSLATION:
				return getParentTranslation() != null;
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
		result.append(')');
		return result.toString();
	}

} //SourceTextImpl
