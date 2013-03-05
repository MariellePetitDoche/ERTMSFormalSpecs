/**
 */
package org.openetcs.model.ertmsformalspecs.types.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>types</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesTests extends TestSuite {

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
		TestSuite suite = new TypesTests("types Tests");
		suite.addTestSuite(EnumerationTest.class);
		suite.addTestSuite(EnumValueTest.class);
		suite.addTestSuite(RangeTest.class);
		suite.addTestSuite(StructureTest.class);
		suite.addTestSuite(StructureElementTest.class);
		suite.addTestSuite(CollectionTest.class);
		suite.addTestSuite(FunctionTest.class);
		suite.addTestSuite(CaseTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesTests(String name) {
		super(name);
	}

} //TypesTests
