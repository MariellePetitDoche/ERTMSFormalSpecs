/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.tests;

import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsFactory;
import org.openetcs.model.ertmsformalspecs.tests.CommentedElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Information</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessInformationTest extends CommentedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessInformationTest.class);
	}

	/**
	 * Constructs a new Process Information test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Information test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessInformation getFixture() {
		return (ProcessInformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RequirementsFactory.eINSTANCE.createProcessInformation());
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

} //ProcessInformationTest
