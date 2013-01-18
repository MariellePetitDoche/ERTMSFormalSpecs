/**
 */
package org.openetcs.model.ertmsformalspecs.test.tests;

import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.test.SingleTestCase;
import org.openetcs.model.ertmsformalspecs.test.TestFactory;

import org.openetcs.model.ertmsformalspecs.tests.ReqRelatedTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Test Case</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleTestCaseTest extends ReqRelatedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleTestCaseTest.class);
	}

	/**
	 * Constructs a new Single Test Case test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleTestCaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Test Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleTestCase getFixture() {
		return (SingleTestCase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TestFactory.eINSTANCE.createSingleTestCase());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SingleTestCaseTest
