/**
 */
package org.openetcs.model.ertmsformalspecs.translation.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>translation</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TranslationTests extends TestSuite {

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
		TestSuite suite = new TranslationTests("translation Tests");
		suite.addTestSuite(TranslationFolderTest.class);
		suite.addTestSuite(TranslationTest.class);
		suite.addTestSuite(SourceTextTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationTests(String name) {
		super(name);
	}

} //TranslationTests
