/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.shortcut.Shortcut;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl#getShortcuts <em>Shortcuts</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShortcutFolderImpl extends EObjectImpl implements ShortcutFolder {
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
	 * The cached value of the '{@link #getSubFolders() <em>Sub Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<ShortcutFolder> subFolders;

	/**
	 * The cached value of the '{@link #getShortcuts() <em>Shortcuts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortcuts()
	 * @generated
	 * @ordered
	 */
	protected EList<Shortcut> shortcuts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShortcutFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShortcutPackage.Literals.SHORTCUT_FOLDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShortcutPackage.SHORTCUT_FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShortcutFolder> getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectContainmentWithInverseEList<ShortcutFolder>(ShortcutFolder.class, this, ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS, ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER);
		}
		return subFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutFolder getParentFolder() {
		if (eContainerFeatureID() != ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER) return null;
		return (ShortcutFolder)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFolder(ShortcutFolder newParentFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFolder, ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFolder(ShortcutFolder newParentFolder) {
		if (newParentFolder != eInternalContainer() || (eContainerFeatureID() != ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER && newParentFolder != null)) {
			if (EcoreUtil.isAncestor(this, newParentFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFolder != null)
				msgs = ((InternalEObject)newParentFolder).eInverseAdd(this, ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS, ShortcutFolder.class, msgs);
			msgs = basicSetParentFolder(newParentFolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER, newParentFolder, newParentFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shortcut> getShortcuts() {
		if (shortcuts == null) {
			shortcuts = new EObjectContainmentWithInverseEList<Shortcut>(Shortcut.class, this, ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS, ShortcutPackage.SHORTCUT__PARENT_FOLDER);
		}
		return shortcuts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getParentDictionary() {
		if (eContainerFeatureID() != ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY) return null;
		return (Dictionary)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDictionary(Dictionary newParentDictionary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentDictionary, ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDictionary(Dictionary newParentDictionary) {
		if (newParentDictionary != eInternalContainer() || (eContainerFeatureID() != ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY && newParentDictionary != null)) {
			if (EcoreUtil.isAncestor(this, newParentDictionary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentDictionary != null)
				msgs = ((InternalEObject)newParentDictionary).eInverseAdd(this, ModelPackage.DICTIONARY__SHORTCUTS, Dictionary.class, msgs);
			msgs = basicSetParentDictionary(newParentDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY, newParentDictionary, newParentDictionary));
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
			case ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubFolders()).basicAdd(otherEnd, msgs);
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFolder((ShortcutFolder)otherEnd, msgs);
			case ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getShortcuts()).basicAdd(otherEnd, msgs);
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentDictionary((Dictionary)otherEnd, msgs);
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
			case ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS:
				return ((InternalEList<?>)getSubFolders()).basicRemove(otherEnd, msgs);
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER:
				return basicSetParentFolder(null, msgs);
			case ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS:
				return ((InternalEList<?>)getShortcuts()).basicRemove(otherEnd, msgs);
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY:
				return basicSetParentDictionary(null, msgs);
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
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER:
				return eInternalContainer().eInverseRemove(this, ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS, ShortcutFolder.class, msgs);
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DICTIONARY__SHORTCUTS, Dictionary.class, msgs);
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
			case ShortcutPackage.SHORTCUT_FOLDER__NAME:
				return getName();
			case ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS:
				return getSubFolders();
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER:
				return getParentFolder();
			case ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS:
				return getShortcuts();
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY:
				return getParentDictionary();
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
			case ShortcutPackage.SHORTCUT_FOLDER__NAME:
				setName((String)newValue);
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				getSubFolders().addAll((Collection<? extends ShortcutFolder>)newValue);
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER:
				setParentFolder((ShortcutFolder)newValue);
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS:
				getShortcuts().clear();
				getShortcuts().addAll((Collection<? extends Shortcut>)newValue);
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)newValue);
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
			case ShortcutPackage.SHORTCUT_FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER:
				setParentFolder((ShortcutFolder)null);
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS:
				getShortcuts().clear();
				return;
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)null);
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
			case ShortcutPackage.SHORTCUT_FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShortcutPackage.SHORTCUT_FOLDER__SUB_FOLDERS:
				return subFolders != null && !subFolders.isEmpty();
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_FOLDER:
				return getParentFolder() != null;
			case ShortcutPackage.SHORTCUT_FOLDER__SHORTCUTS:
				return shortcuts != null && !shortcuts.isEmpty();
			case ShortcutPackage.SHORTCUT_FOLDER__PARENT_DICTIONARY:
				return getParentDictionary() != null;
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

} //ShortcutFolderImpl
