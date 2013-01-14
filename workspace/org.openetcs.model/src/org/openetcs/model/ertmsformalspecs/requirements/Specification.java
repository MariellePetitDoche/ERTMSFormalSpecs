/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Specification#getParagraphs <em>Paragraphs</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Specification#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends NamedElement, BaseLinedElement {
	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentSpecification <em>Parent Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getSpecification_Paragraphs()
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentSpecification
	 * @model opposite="parentSpecification" containment="true"
	 * @generated
	 */
	EList<Paragraph> getParagraphs();

	/**
	 * Returns the value of the '<em><b>Parent Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Dictionary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #setParentDictionary(Dictionary)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getSpecification_ParentDictionary()
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getSpecification
	 * @model opposite="specification" transient="false"
	 * @generated
	 */
	Dictionary getParentDictionary();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Specification#getParentDictionary <em>Parent Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #getParentDictionary()
	 * @generated
	 */
	void setParentDictionary(Dictionary value);

} // Specification
