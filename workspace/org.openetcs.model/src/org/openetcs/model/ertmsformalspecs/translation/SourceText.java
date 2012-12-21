/**
 */
package org.openetcs.model.ertmsformalspecs.translation;

import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.translation.SourceText#getParentTranslation <em>Parent Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getSourceText()
 * @model
 * @generated
 */
public interface SourceText extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Translation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Translation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Translation</em>' container reference.
	 * @see #setParentTranslation(Translation)
	 * @see org.openetcs.model.ertmsformalspecs.translation.TranslationPackage#getSourceText_ParentTranslation()
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation#getSources
	 * @model opposite="sources" transient="false"
	 * @generated
	 */
	Translation getParentTranslation();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.translation.SourceText#getParentTranslation <em>Parent Translation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Translation</em>' container reference.
	 * @see #getParentTranslation()
	 * @generated
	 */
	void setParentTranslation(Translation value);

} // SourceText
