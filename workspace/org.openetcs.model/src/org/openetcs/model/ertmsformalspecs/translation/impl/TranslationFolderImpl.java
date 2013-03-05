/**
 */
package org.openetcs.model.ertmsformalspecs.translation.impl;

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
import org.openetcs.model.ertmsformalspecs.translation.Translation;
import org.openetcs.model.ertmsformalspecs.translation.TranslationFolder;
import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TranslationFolderImpl extends EObjectImpl implements TranslationFolder {
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
	protected EList<TranslationFolder> subFolders;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected EList<Translation> translations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TranslationPackage.Literals.TRANSLATION_FOLDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.TRANSLATION_FOLDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TranslationFolder> getSubFolders() {
		if (subFolders == null) {
			subFolders = new EObjectContainmentWithInverseEList<TranslationFolder>(TranslationFolder.class, this, TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS, TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER);
		}
		return subFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationFolder getParentFolder() {
		if (eContainerFeatureID() != TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER) return null;
		return (TranslationFolder)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFolder(TranslationFolder newParentFolder, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFolder, TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFolder(TranslationFolder newParentFolder) {
		if (newParentFolder != eInternalContainer() || (eContainerFeatureID() != TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER && newParentFolder != null)) {
			if (EcoreUtil.isAncestor(this, newParentFolder))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFolder != null)
				msgs = ((InternalEObject)newParentFolder).eInverseAdd(this, TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS, TranslationFolder.class, msgs);
			msgs = basicSetParentFolder(newParentFolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER, newParentFolder, newParentFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Translation> getTranslations() {
		if (translations == null) {
			translations = new EObjectContainmentWithInverseEList<Translation>(Translation.class, this, TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS, TranslationPackage.TRANSLATION__PARENT_FOLDER);
		}
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getParentDictionary() {
		if (eContainerFeatureID() != TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY) return null;
		return (Dictionary)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDictionary(Dictionary newParentDictionary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentDictionary, TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDictionary(Dictionary newParentDictionary) {
		if (newParentDictionary != eInternalContainer() || (eContainerFeatureID() != TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY && newParentDictionary != null)) {
			if (EcoreUtil.isAncestor(this, newParentDictionary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentDictionary != null)
				msgs = ((InternalEObject)newParentDictionary).eInverseAdd(this, ModelPackage.DICTIONARY__TRANSLATIONS, Dictionary.class, msgs);
			msgs = basicSetParentDictionary(newParentDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY, newParentDictionary, newParentDictionary));
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
			case TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubFolders()).basicAdd(otherEnd, msgs);
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFolder((TranslationFolder)otherEnd, msgs);
			case TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTranslations()).basicAdd(otherEnd, msgs);
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY:
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
			case TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS:
				return ((InternalEList<?>)getSubFolders()).basicRemove(otherEnd, msgs);
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER:
				return basicSetParentFolder(null, msgs);
			case TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS:
				return ((InternalEList<?>)getTranslations()).basicRemove(otherEnd, msgs);
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY:
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
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER:
				return eInternalContainer().eInverseRemove(this, TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS, TranslationFolder.class, msgs);
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DICTIONARY__TRANSLATIONS, Dictionary.class, msgs);
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
			case TranslationPackage.TRANSLATION_FOLDER__NAME:
				return getName();
			case TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS:
				return getSubFolders();
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER:
				return getParentFolder();
			case TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS:
				return getTranslations();
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY:
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
			case TranslationPackage.TRANSLATION_FOLDER__NAME:
				setName((String)newValue);
				return;
			case TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				getSubFolders().addAll((Collection<? extends TranslationFolder>)newValue);
				return;
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER:
				setParentFolder((TranslationFolder)newValue);
				return;
			case TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS:
				getTranslations().clear();
				getTranslations().addAll((Collection<? extends Translation>)newValue);
				return;
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY:
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
			case TranslationPackage.TRANSLATION_FOLDER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS:
				getSubFolders().clear();
				return;
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER:
				setParentFolder((TranslationFolder)null);
				return;
			case TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS:
				getTranslations().clear();
				return;
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY:
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
			case TranslationPackage.TRANSLATION_FOLDER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TranslationPackage.TRANSLATION_FOLDER__SUB_FOLDERS:
				return subFolders != null && !subFolders.isEmpty();
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_FOLDER:
				return getParentFolder() != null;
			case TranslationPackage.TRANSLATION_FOLDER__TRANSLATIONS:
				return translations != null && !translations.isEmpty();
			case TranslationPackage.TRANSLATION_FOLDER__PARENT_DICTIONARY:
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

} //TranslationFolderImpl
