/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getParentSubStep <em>Parent Sub Step</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#isBlocking <em>Blocking</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getDeadline <em>Deadline</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation()
 * @model
 * @generated
 */
public interface Expectation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parent Sub Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getExpectations <em>Expectations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Sub Step</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sub Step</em>' container reference.
	 * @see #setParentSubStep(SubStep)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation_ParentSubStep()
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getExpectations
	 * @model opposite="expectations" transient="false"
	 * @generated
	 */
	SubStep getParentSubStep();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getParentSubStep <em>Parent Sub Step</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Sub Step</em>' container reference.
	 * @see #getParentSubStep()
	 * @generated
	 */
	void setParentSubStep(SubStep value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking</em>' attribute.
	 * @see #setBlocking(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation_Blocking()
	 * @model
	 * @generated
	 */
	boolean isBlocking();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#isBlocking <em>Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking</em>' attribute.
	 * @see #isBlocking()
	 * @generated
	 */
	void setBlocking(boolean value);

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #setDeadline(int)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation_Deadline()
	 * @model
	 * @generated
	 */
	int getDeadline();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(int value);

} // Expectation
