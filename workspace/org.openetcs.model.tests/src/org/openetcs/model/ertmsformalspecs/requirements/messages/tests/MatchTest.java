/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.requirements.messages.Match;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MatchTest extends TestCase {

	/**
	 * The fixture for this Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Match fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MatchTest.class);
	}

	/**
	 * Constructs a new Match test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Match fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Match getFixture() {
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
		setFixture(MessagesFactory.eINSTANCE.createMatch());
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

} //MatchTest
