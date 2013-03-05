/**
 */
package org.openetcs.model.ertmsformalspecs.translation;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFactory
 * @model kind="package"
 * @generated
 */
public interface TranslationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "translation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/ertmsformalspecs/translation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.ertmsformalspecs.translation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TranslationPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl
	 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl#getTranslationFolder()
	 * @generated
	 */
	int TRANSLATION_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FOLDER__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FOLDER__SUB_FOLDERS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Folder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FOLDER__PARENT_FOLDER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FOLDER__TRANSLATIONS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FOLDER__PARENT_DICTIONARY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FOLDER_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl
	 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__COMMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Folder</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__PARENT_FOLDER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SOURCES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__SUB_STEPS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__IMPLEMENTED = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.translation.impl.SourceTextImpl <em>Source Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.translation.impl.SourceTextImpl
	 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl#getSourceText()
	 * @generated
	 */
	int SOURCE_TEXT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TEXT__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Translation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TEXT__PARENT_TRANSLATION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TEXT_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder
	 * @generated
	 */
	EClass getTranslationFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Folders</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getSubFolders()
	 * @see #getTranslationFolder()
	 * @generated
	 */
	EReference getTranslationFolder_SubFolders();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Folder</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentFolder()
	 * @see #getTranslationFolder()
	 * @generated
	 */
	EReference getTranslationFolder_ParentFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translations</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getTranslations()
	 * @see #getTranslationFolder()
	 * @generated
	 */
	EReference getTranslationFolder_Translations();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Dictionary</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentDictionary()
	 * @see #getTranslationFolder()
	 * @generated
	 */
	EReference getTranslationFolder_ParentDictionary();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.translation.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Folder</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation#getParentFolder()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_ParentFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation#getSources()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation#getSubSteps()
	 * @see #getTranslation()
	 * @generated
	 */
	EReference getTranslation_SubSteps();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#isImplemented <em>Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implemented</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation#isImplemented()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Implemented();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.translation.SourceText <em>Source Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Text</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.SourceText
	 * @generated
	 */
	EClass getSourceText();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.translation.SourceText#getParentTranslation <em>Parent Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Translation</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.translation.SourceText#getParentTranslation()
	 * @see #getSourceText()
	 * @generated
	 */
	EReference getSourceText_ParentTranslation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TranslationFactory getTranslationFactory();

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
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationFolderImpl
		 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl#getTranslationFolder()
		 * @generated
		 */
		EClass TRANSLATION_FOLDER = eINSTANCE.getTranslationFolder();

		/**
		 * The meta object literal for the '<em><b>Sub Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_FOLDER__SUB_FOLDERS = eINSTANCE.getTranslationFolder_SubFolders();

		/**
		 * The meta object literal for the '<em><b>Parent Folder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_FOLDER__PARENT_FOLDER = eINSTANCE.getTranslationFolder_ParentFolder();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_FOLDER__TRANSLATIONS = eINSTANCE.getTranslationFolder_Translations();

		/**
		 * The meta object literal for the '<em><b>Parent Dictionary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION_FOLDER__PARENT_DICTIONARY = eINSTANCE.getTranslationFolder_ParentDictionary();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationImpl
		 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Parent Folder</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__PARENT_FOLDER = eINSTANCE.getTranslation_ParentFolder();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__SOURCES = eINSTANCE.getTranslation_Sources();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATION__SUB_STEPS = eINSTANCE.getTranslation_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__IMPLEMENTED = eINSTANCE.getTranslation_Implemented();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.translation.impl.SourceTextImpl <em>Source Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.translation.impl.SourceTextImpl
		 * @see org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl#getSourceText()
		 * @generated
		 */
		EClass SOURCE_TEXT = eINSTANCE.getSourceText();

		/**
		 * The meta object literal for the '<em><b>Parent Translation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_TEXT__PARENT_TRANSLATION = eINSTANCE.getSourceText_ParentTranslation();

	}

} //TranslationPackage
