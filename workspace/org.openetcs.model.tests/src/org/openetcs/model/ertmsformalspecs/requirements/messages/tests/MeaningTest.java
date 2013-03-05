/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Meaning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeaningTest extends TestCase {

	/**
	 * The fixture for this Meaning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Meaning fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeaningTest.class);
	}

	/**
	 * Constructs a new Meaning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeaningTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Meaning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Meaning fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Meaning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Meaning getFixture() {
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
		setFixture(MessagesFactory.eINSTANCE.createMeaning());
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

} //MeaningTest
