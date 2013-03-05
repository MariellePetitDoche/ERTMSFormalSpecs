/**
 */
package org.openetcs.model.ertmsformalspecs.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.behaviour.tests.BehaviourTests;
import org.openetcs.model.ertmsformalspecs.customization.tests.CustomizationTests;
import org.openetcs.model.ertmsformalspecs.requirements.tests.RequirementsTests;
import org.openetcs.model.ertmsformalspecs.shortcut.tests.ShortcutTests;
import org.openetcs.model.ertmsformalspecs.test.tests.TestTests;
import org.openetcs.model.ertmsformalspecs.translation.tests.TranslationTests;
import org.openetcs.model.ertmsformalspecs.types.tests.TypesTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Model</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelAllTests extends TestSuite {

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
		TestSuite suite = new ModelAllTests("Model Tests");
		suite.addTest(ModelTests.suite());
		suite.addTest(RequirementsTests.suite());
		suite.addTest(TypesTests.suite());
		suite.addTest(CustomizationTests.suite());
		suite.addTest(BehaviourTests.suite());
		suite.addTest(TestTests.suite());
		suite.addTest(TranslationTests.suite());
		suite.addTest(ShortcutTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAllTests(String name) {
		super(name);
	}

} //ModelAllTests
