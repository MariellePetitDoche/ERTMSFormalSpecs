/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Frame#getSubSequences <em>Sub Sequences</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Frame#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getFrame()
 * @model
 * @generated
 */
public interface Frame extends NamedElement, CommentedElement {
	/**
	 * Returns the value of the '<em><b>Sub Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.SubSequence}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getParentFrame <em>Parent Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Sequences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Sequences</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getFrame_SubSequences()
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getParentFrame
	 * @model opposite="parentFrame" containment="true"
	 * @generated
	 */
	EList<SubSequence> getSubSequences();

	/**
	 * Returns the value of the '<em><b>Parent Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Dictionary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #setParentDictionary(Dictionary)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getFrame_ParentDictionary()
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getTests
	 * @model opposite="tests" transient="false"
	 * @generated
	 */
	Dictionary getParentDictionary();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Frame#getParentDictionary <em>Parent Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #getParentDictionary()
	 * @generated
	 */
	void setParentDictionary(Dictionary value);

} // Frame
