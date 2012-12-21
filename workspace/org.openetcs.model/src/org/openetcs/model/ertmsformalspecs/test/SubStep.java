/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openetcs.model.ertmsformalspecs.behaviour.Action;

import org.openetcs.model.ertmsformalspecs.translation.Translation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getActions <em>Actions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getExpectations <em>Expectations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubStep#isSkipEngine <em>Skip Engine</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentTranslation <em>Parent Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubStep()
 * @model
 * @generated
 */
public interface SubStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Step</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.Step#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Step</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Step</em>' container reference.
	 * @see #setParentStep(Step)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubStep_ParentStep()
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getSubSteps
	 * @model opposite="subSteps" transient="false"
	 * @generated
	 */
	Step getParentStep();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentStep <em>Parent Step</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Step</em>' container reference.
	 * @see #getParentStep()
	 * @generated
	 */
	void setParentStep(Step value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.behaviour.Action}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentSubStep <em>Parent Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubStep_Actions()
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentSubStep
	 * @model opposite="parentSubStep" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Expectations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.Expectation}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getParentSubStep <em>Parent Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expectations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expectations</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubStep_Expectations()
	 * @see org.openetcs.model.ertmsformalspecs.test.Expectation#getParentSubStep
	 * @model opposite="parentSubStep" containment="true"
	 * @generated
	 */
	EList<Expectation> getExpectations();

	/**
	 * Returns the value of the '<em><b>Skip Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Engine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Engine</em>' attribute.
	 * @see #setSkipEngine(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubStep_SkipEngine()
	 * @model
	 * @generated
	 */
	boolean isSkipEngine();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#isSkipEngine <em>Skip Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Engine</em>' attribute.
	 * @see #isSkipEngine()
	 * @generated
	 */
	void setSkipEngine(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Translation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.translation.Translation#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Translation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Translation</em>' container reference.
	 * @see #setParentTranslation(Translation)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubStep_ParentTranslation()
	 * @see org.openetcs.model.ertmsformalspecs.translation.Translation#getSubSteps
	 * @model opposite="subSteps" transient="false"
	 * @generated
	 */
	Translation getParentTranslation();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentTranslation <em>Parent Translation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Translation</em>' container reference.
	 * @see #getParentTranslation()
	 * @generated
	 */
	void setParentTranslation(Translation value);

} // SubStep
