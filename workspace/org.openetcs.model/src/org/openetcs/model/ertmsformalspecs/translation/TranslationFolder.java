/**
 */
package org.openetcs.model.ertmsformalspecs.translation;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getSubFolders <em>Sub Folders</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslationFolder()
 * @model
 * @generated
 */
public interface TranslationFolder extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Folders</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Folders</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslationFolder_SubFolders()
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentFolder
	 * @model opposite="parentFolder" containment="true"
	 * @generated
	 */
	EList<TranslationFolder> getSubFolders();

	/**
	 * Returns the value of the '<em><b>Parent Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getSubFolders <em>Sub Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Folder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Folder</em>' container reference.
	 * @see #setParentFolder(TranslationFolder)
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslationFolder_ParentFolder()
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getSubFolders
	 * @model opposite="subFolders" transient="false"
	 * @generated
	 */
	TranslationFolder getParentFolder();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentFolder <em>Parent Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Folder</em>' container reference.
	 * @see #getParentFolder()
	 * @generated
	 */
	void setParentFolder(TranslationFolder value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.translation.Translation}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getParentFolder <em>Parent Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslationFolder_Translations()
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation#getParentFolder
	 * @model opposite="parentFolder" containment="true"
	 * @generated
	 */
	EList<Translation> getTranslations();

	/**
	 * Returns the value of the '<em><b>Parent Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Dictionary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #setParentDictionary(Dictionary)
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslationFolder_ParentDictionary()
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getTranslations
	 * @model opposite="translations" transient="false"
	 * @generated
	 */
	Dictionary getParentDictionary();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getParentDictionary <em>Parent Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #getParentDictionary()
	 * @generated
	 */
	void setParentDictionary(Dictionary value);

} // TranslationFolder
