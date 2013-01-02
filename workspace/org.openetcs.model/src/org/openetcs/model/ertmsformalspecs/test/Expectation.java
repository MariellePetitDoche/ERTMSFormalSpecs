/**
 */
package org.openetcs.model.ertmsformalspecs.test;

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
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getValue <em>Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#isBlocking <em>Blocking</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getDeadline <em>Deadline</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation()
 * @model
 * @generated
 */
public interface Expectation extends EObject {
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
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getExpectation_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

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
