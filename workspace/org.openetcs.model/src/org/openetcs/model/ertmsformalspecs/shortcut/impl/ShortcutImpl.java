/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.openetcs.model.ertmsformalspecs.shortcut.Shortcut;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shortcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutImpl#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShortcutImpl extends EObjectImpl implements Shortcut {
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
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected NamedElement ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortcutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShortcutPackage.Literals.SHORTCUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShortcutPackage.SHORTCUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutFolder getParentFolder() {
		if (eContainerFeatureID() != ShortcutPackage.SHORTCUT__PARENT_FOLDER) return null;
		return (ShortcutFolder)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFolder(ShortcutFolder newParentFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFolder, ShortcutPackage.SHORTCUT__PARENT_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFolder(ShortcutFolder newParentFolder) {
		if (newParentFolder != eInternalContainer() || (eContainerFeatureID() != ShortcutPackage.SHORTCUT__PARENT_FOLDER && newParentFolder != null)) {
			if (EcoreUtil.isAncestor(this, newParentFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFolder != null)
				msgs = ((InternalEObject)newParentFolder).eInverseAdd(this, ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS, ShortcutFolder.class, msgs);
			msgs = basicSetParentFolder(newParentFolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShortcutPackage.SHORTCUT__PARENT_FOLDER, newParentFolder, newParentFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (NamedElement)eResolveProxy(oldRef);
			if (ref != oldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShortcutPackage.SHORTCUT__REF, oldRef, ref));
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(NamedElement newRef) {
		NamedElement oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShortcutPackage.SHORTCUT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShortcutPackage.SHORTCUT__PARENT_FOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFolder((ShortcutFolder)otherEnd, msgs);
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
			case ShortcutPackage.SHORTCUT__PARENT_FOLDER:
				return basicSetParentFolder(null, msgs);
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
			case ShortcutPackage.SHORTCUT__PARENT_FOLDER:
				return eInternalContainer().eInverseRemove(this, ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS, ShortcutFolder.class, msgs);
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
			case ShortcutPackage.SHORTCUT__NAME:
				return getName();
			case ShortcutPackage.SHORTCUT__PARENT_FOLDER:
				return getParentFolder();
			case ShortcutPackage.SHORTCUT__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case ShortcutPackage.SHORTCUT__NAME:
				setName((String)newValue);
				return;
			case ShortcutPackage.SHORTCUT__PARENT_FOLDER:
				setParentFolder((ShortcutFolder)newValue);
				return;
			case ShortcutPackage.SHORTCUT__REF:
				setRef((NamedElement)newValue);
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
			case ShortcutPackage.SHORTCUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShortcutPackage.SHORTCUT__PARENT_FOLDER:
				setParentFolder((ShortcutFolder)null);
				return;
			case ShortcutPackage.SHORTCUT__REF:
				setRef((NamedElement)null);
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
			case ShortcutPackage.SHORTCUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShortcutPackage.SHORTCUT__PARENT_FOLDER:
				return getParentFolder() != null;
			case ShortcutPackage.SHORTCUT__REF:
				return ref != null;
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

} //ShortcutImpl
