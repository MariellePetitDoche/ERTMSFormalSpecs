/**
 */
package org.openetcs.model.ertmsformalspecs.tests;

import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.ModelFactory;
import org.openetcs.model.ertmsformalspecs.StateMachine;
import org.openetcs.model.ertmsformalspecs.types.tests.TypeTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachineTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StateMachineTest.class);
	}

	/**
	 * Constructs a new State Machine test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this State Machine test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StateMachine getFixture() {
		return (StateMachine)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createStateMachine());
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

} //StateMachineTest
