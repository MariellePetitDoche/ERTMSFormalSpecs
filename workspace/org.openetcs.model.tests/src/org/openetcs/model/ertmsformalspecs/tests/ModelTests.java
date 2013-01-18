/**
 */
package org.openetcs.model.ertmsformalspecs.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ertmsformalspecs</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTests extends TestSuite {

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
		TestSuite suite = new ModelTests("ertmsformalspecs Tests");
		suite.addTestSuite(DictionaryTest.class);
		suite.addTestSuite(BaseLineTest.class);
		suite.addTestSuite(NamespaceTest.class);
		suite.addTestSuite(ProcedureTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(StateMachineTest.class);
		suite.addTestSuite(StateTest.class);
		suite.addTestSuite(VariableTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelTests(String name) {
		super(name);
	}

} //ModelTests
