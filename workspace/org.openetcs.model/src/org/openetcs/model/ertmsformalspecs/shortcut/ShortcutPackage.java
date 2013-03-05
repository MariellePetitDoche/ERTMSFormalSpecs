/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openetcs.model.ertmsformalspecs.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFactory
 * @model kind="package"
 * @generated
 */
public interface ShortcutPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shortcut";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/ertmsformalspecs/shortcut";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.ertmsformalspecs.shortcut";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShortcutPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutPackageImpl#getShortcutFolder()
	 * @generated
	 */
	int SHORTCUT_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FOLDER__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FOLDER__SUB_FOLDERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Folder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FOLDER__PARENT_FOLDER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shortcuts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FOLDER__SHORTCUTS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FOLDER__PARENT_DICTIONARY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FOLDER_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutImpl <em>Shortcut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutImpl
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutPackageImpl#getShortcut()
	 * @generated
	 */
	int SHORTCUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Folder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__PARENT_FOLDER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT__REF = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shortcut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORTCUT_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder
	 * @generated
	 */
	EClass getShortcutFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getSubFolders()
	 * @see #getShortcutFolder()
	 * @generated
	 */
	EReference getShortcutFolder_SubFolders();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Folder</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentFolder()
	 * @see #getShortcutFolder()
	 * @generated
	 */
	EReference getShortcutFolder_ParentFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getShortcuts <em>Shortcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shortcuts</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getShortcuts()
	 * @see #getShortcutFolder()
	 * @generated
	 */
	EReference getShortcutFolder_Shortcuts();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Dictionary</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder#getParentDictionary()
	 * @see #getShortcutFolder()
	 * @generated
	 */
	EReference getShortcutFolder_ParentDictionary();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut <em>Shortcut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shortcut</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.Shortcut
	 * @generated
	 */
	EClass getShortcut();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Folder</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getParentFolder()
	 * @see #getShortcut()
	 * @generated
	 */
	EReference getShortcut_ParentFolder();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.Shortcut#getRef()
	 * @see #getShortcut()
	 * @generated
	 */
	EReference getShortcut_Ref();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShortcutFactory getShortcutFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutFolderImpl
		 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutPackageImpl#getShortcutFolder()
		 * @generated
		 */
		EClass SHORTCUT_FOLDER = eINSTANCE.getShortcutFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT_FOLDER__SUB_FOLDERS = eINSTANCE.getShortcutFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Parent Folder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT_FOLDER__PARENT_FOLDER = eINSTANCE.getShortcutFolder_ParentFolder();

		/**
		 * The meta object literal for the '<em><b>Shortcuts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT_FOLDER__SHORTCUTS = eINSTANCE.getShortcutFolder_Shortcuts();

		/**
		 * The meta object literal for the '<em><b>Parent Dictionary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT_FOLDER__PARENT_DICTIONARY = eINSTANCE.getShortcutFolder_ParentDictionary();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutImpl <em>Shortcut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutImpl
		 * @see org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutPackageImpl#getShortcut()
		 * @generated
		 */
		EClass SHORTCUT = eINSTANCE.getShortcut();

		/**
		 * The meta object literal for the '<em><b>Parent Folder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT__PARENT_FOLDER = eINSTANCE.getShortcut_ParentFolder();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORTCUT__REF = eINSTANCE.getShortcut_Ref();

	}

} //ShortcutPackage
