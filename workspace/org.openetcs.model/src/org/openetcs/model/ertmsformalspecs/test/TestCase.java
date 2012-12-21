/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.common.util.EList;

import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestCase#getParentSubSequence <em>Parent Sub Sequence</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestCase#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestCase#getCase <em>Case</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.TestCase#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends NamedElement, CommentedElement {
	/**
	 * Returns the value of the '<em><b>Parent Sub Sequence</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Sub Sequence</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sub Sequence</em>' container reference.
	 * @see #setParentSubSequence(SubSequence)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestCase_ParentSubSequence()
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getTestCases
	 * @model opposite="testCases" transient="false"
	 * @generated
	 */
	SubSequence getParentSubSequence();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestCase#getParentSubSequence <em>Parent Sub Sequence</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Sub Sequence</em>' container reference.
	 * @see #getParentSubSequence()
	 * @generated
	 */
	void setParentSubSequence(SubSequence value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' attribute.
	 * @see #setFeature(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestCase_Feature()
	 * @model
	 * @generated
	 */
	String getFeature();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestCase#getFeature <em>Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' attribute.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(String value);

	/**
	 * Returns the value of the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' attribute.
	 * @see #setCase(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestCase_Case()
	 * @model
	 * @generated
	 */
	String getCase();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.TestCase#getCase <em>Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' attribute.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.Step}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.Step#getParentTestCase <em>Parent Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getTestCase_Steps()
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getParentTestCase
	 * @model opposite="parentTestCase" containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // TestCase
