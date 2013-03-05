/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestFactory eINSTANCE = org.openetcs.model.ertmsformalspecs.test.impl.TestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame</em>'.
	 * @generated
	 */
	Frame createFrame();

	/**
	 * Returns a new object of class '<em>Sub Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Sequence</em>'.
	 * @generated
	 */
	SubSequence createSubSequence();

	/**
	 * Returns a new object of class '<em>Single Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Test Case</em>'.
	 * @generated
	 */
	SingleTestCase createSingleTestCase();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Step</em>'.
	 * @generated
	 */
	SubStep createSubStep();

	/**
	 * Returns a new object of class '<em>Expectation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expectation</em>'.
	 * @generated
	 */
	Expectation createExpectation();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	TestMessage createTestMessage();

	/**
	 * Returns a new object of class '<em>Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet</em>'.
	 * @generated
	 */
	TestPacket createTestPacket();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	TestField createTestField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackage getTestPackage();

} //TestFactory
