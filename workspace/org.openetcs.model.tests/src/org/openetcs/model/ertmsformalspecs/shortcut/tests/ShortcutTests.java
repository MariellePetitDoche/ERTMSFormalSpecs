/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>shortcut</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShortcutTests extends TestSuite {

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
		TestSuite suite = new ShortcutTests("shortcut Tests");
		suite.addTestSuite(ShortcutFolderTest.class);
		suite.addTestSuite(ShortcutTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutTests(String name) {
		super(name);
	}

} //ShortcutTests
