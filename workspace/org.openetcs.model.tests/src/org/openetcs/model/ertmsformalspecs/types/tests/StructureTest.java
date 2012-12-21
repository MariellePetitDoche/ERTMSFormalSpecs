/**
 */
package org.openetcs.model.ertmsformalspecs.types.tests;

import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.types.Structure;
import org.openetcs.model.ertmsformalspecs.types.TypesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureTest extends TypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StructureTest.class);
	}

	/**
	 * Constructs a new Structure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Structure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Structure getFixture() {
		return (Structure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypesFactory.eINSTANCE.createStructure());
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

} //StructureTest
