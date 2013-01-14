/**
 */
package org.openetcs.model.ertmsformalspecs.customization.tests;

import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.customization.CustomizationFactory;
import org.openetcs.model.ertmsformalspecs.customization.RuleDisabling;
import org.openetcs.model.ertmsformalspecs.tests.ReqRelatedTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rule Disabling</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleDisablingTest extends ReqRelatedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RuleDisablingTest.class);
	}

	/**
	 * Constructs a new Rule Disabling test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleDisablingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rule Disabling test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RuleDisabling getFixture() {
		return (RuleDisabling)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CustomizationFactory.eINSTANCE.createRuleDisabling());
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

} //RuleDisablingTest
