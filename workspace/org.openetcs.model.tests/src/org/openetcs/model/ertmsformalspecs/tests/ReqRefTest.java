/**
 */
package org.openetcs.model.ertmsformalspecs.tests;

import junit.textui.TestRunner;

import org.openetcs.model.ertmsformalspecs.ModelFactory;
import org.openetcs.model.ertmsformalspecs.ReqRef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Req Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqRefTest extends CommentedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReqRefTest.class);
	}

	/**
	 * Constructs a new Req Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Req Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ReqRef getFixture() {
		return (ReqRef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createReqRef());
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

} //ReqRefTest
