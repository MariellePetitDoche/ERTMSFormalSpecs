/**
 */
package org.openetcs.model.ertmsformalspecs.translation;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.openetcs.model.ertmsformalspecs.test.SubStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getParentFolder <em>Parent Folder</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getSources <em>Sources</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.Translation#isImplemented <em>Implemented</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslation()
 * @model
 * @generated
 */
public interface Translation extends NamedElement, CommentedElement {
	/**
	 * Returns the value of the '<em><b>Parent Folder</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Folder</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Folder</em>' container reference.
	 * @see #setParentFolder(TranslationFolder)
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslation_ParentFolder()
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationFolder#getTranslations
	 * @model opposite="translations" transient="false"
	 * @generated
	 */
	TranslationFolder getParentFolder();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getParentFolder <em>Parent Folder</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Folder</em>' container reference.
	 * @see #getParentFolder()
	 * @generated
	 */
	void setParentFolder(TranslationFolder value);

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.translation.SourceText}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.SourceText#getParentTranslation <em>Parent Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslation_Sources()
	 * @see org.openetcs.model.ertmsformalspecs.translation.SourceText#getParentTranslation
	 * @model opposite="parentTranslation" containment="true"
	 * @generated
	 */
	EList<SourceText> getSources();

	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.SubStep}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentTranslation <em>Parent Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslation_SubSteps()
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getParentTranslation
	 * @model opposite="parentTranslation" containment="true"
	 * @generated
	 */
	EList<SubStep> getSubSteps();

	/**
	 * Returns the value of the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implemented</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented</em>' attribute.
	 * @see #setImplemented(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getTranslation_Implemented()
	 * @model
	 * @generated
	 */
	boolean isImplemented();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#isImplemented <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implemented</em>' attribute.
	 * @see #isImplemented()
	 * @generated
	 */
	void setImplemented(boolean value);

} // Translation
