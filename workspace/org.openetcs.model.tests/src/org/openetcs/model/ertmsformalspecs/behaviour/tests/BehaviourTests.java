/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>behaviour</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourTests extends TestSuite {

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
		TestSuite suite = new BehaviourTests("behaviour Tests");
		suite.addTestSuite(RuleTest.class);
		suite.addTestSuite(RuleConditionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourTests(String name) {
		super(name);
	}

} //BehaviourTests
