/**
 */
package org.openetcs.model.ertmsformalspecs.test.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>test</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TestTests("test Tests");
		suite.addTestSuite(FrameTest.class);
		suite.addTestSuite(SubSequenceTest.class);
		suite.addTestSuite(SingleTestCaseTest.class);
		suite.addTestSuite(StepTest.class);
		suite.addTestSuite(SubStepTest.class);
		suite.addTestSuite(ExpectationTest.class);
		suite.addTestSuite(TestMessageTest.class);
		suite.addTestSuite(TestPacketTest.class);
		suite.addTestSuite(TestFieldTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestTests(String name) {
		super(name);
	}

} //TestTests
