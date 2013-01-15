/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleValueTest extends TestCase {

	/**
	 * The fixture for this Single Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleValue fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleValueTest.class);
	}

	/**
	 * Constructs a new Single Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValueTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Single Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SingleValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Single Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleValue getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MessagesFactory.eINSTANCE.createSingleValue());
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

} //SingleValueTest
