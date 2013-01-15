/**
 */
package org.openetcs.model.ertmsformalspecs.test.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.test.TestFactory;
import org.openetcs.model.ertmsformalspecs.test.TestPacket;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPacketTest extends TestCase {

	/**
	 * The fixture for this Packet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPacket fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestPacketTest.class);
	}

	/**
	 * Constructs a new Packet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestPacketTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Packet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TestPacket fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Packet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestPacket getFixture() {
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
		setFixture(TestFactory.eINSTANCE.createTestPacket());
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

} //TestPacketTest
