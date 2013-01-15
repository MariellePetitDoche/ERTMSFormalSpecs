/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>requirements</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsTests extends TestSuite {

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
		TestSuite suite = new RequirementsTests("requirements Tests");
		suite.addTestSuite(SpecificationTest.class);
		suite.addTestSuite(FunctionalBlockTest.class);
		suite.addTestSuite(ParagraphTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsTests(String name) {
		super(name);
	}

} //RequirementsTests
