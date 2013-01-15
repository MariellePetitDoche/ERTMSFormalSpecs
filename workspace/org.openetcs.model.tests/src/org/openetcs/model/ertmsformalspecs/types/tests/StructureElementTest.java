/**
 */
package org.openetcs.model.ertmsformalspecs.types.tests;

import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.tests.ReqRelatedTest;
import org.openetcs.model.ertmsformalspecs.types.StructureElement;
import org.openetcs.model.ertmsformalspecs.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structure Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureElementTest extends ReqRelatedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructureElementTest.class);
	}

	/**
	 * Constructs a new Structure Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structure Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StructureElement getFixture() {
		return (StructureElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createStructureElement());
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

} //StructureElementTest
