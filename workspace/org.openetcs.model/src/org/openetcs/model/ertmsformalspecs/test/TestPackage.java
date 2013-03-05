/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openetcs.model.ertmsformalspecs.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/ertmsformalspecs/test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.ertmsformalspecs.test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.FrameImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__COMMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__SUB_SEQUENCES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__PARENT_DICTIONARY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl <em>Sub Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getSubSequence()
	 * @generated
	 */
	int SUB_SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__COMMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Frame</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__PARENT_FRAME = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>DLRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__DLRBG = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__LEVEL = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__MODE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nid LRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__NID_LRBG = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>QDir LRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__QDIR_LRBG = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>QDir Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__QDIR_TRAIN = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>QDLRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__QDLRBG = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rbc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__RBC_ID = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Rbc Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__RBC_PHONE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Test Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE__TEST_CASES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Sub Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SEQUENCE_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl <em>Single Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getSingleTestCase()
	 * @generated
	 */
	int SINGLE_TEST_CASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__NAME = ModelPackage.REQ_RELATED__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__COMMENT = ModelPackage.REQ_RELATED__COMMENT;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__REQUIREMENTS = ModelPackage.REQ_RELATED__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__IMPLEMENTED = ModelPackage.REQ_RELATED__IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__VERIFIED = ModelPackage.REQ_RELATED__VERIFIED;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__NEEDS_REQUIREMENT = ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Parent Sub Sequence</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE = ModelPackage.REQ_RELATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__FEATURE = ModelPackage.REQ_RELATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__CASE = ModelPackage.REQ_RELATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE__STEPS = ModelPackage.REQ_RELATED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Single Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TEST_CASE_FEATURE_COUNT = ModelPackage.REQ_RELATED_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.StepImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Test Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARENT_TEST_CASE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tcs Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TCS_ORDER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DISTANCE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>User Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__USER_COMMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Io</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IO = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INTERFACE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Level In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LEVEL_IN = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Level Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LEVEL_OUT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Mode In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MODE_IN = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mode Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MODE_OUT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Translation Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TRANSLATION_REQUIRED = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TRANSLATED = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SUB_STEPS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__MESSAGES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl <em>Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getSubStep()
	 * @generated
	 */
	int SUB_STEP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STEP__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STEP__PARENT_STEP = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STEP__ACTIONS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expectations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STEP__EXPECTATIONS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Skip Engine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STEP__SKIP_ENGINE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Translation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STEP__PARENT_TRANSLATION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STEP_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl <em>Expectation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getExpectation()
	 * @generated
	 */
	int EXPECTATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Sub Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__PARENT_SUB_STEP = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__EXPRESSION = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__BLOCKING = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION__DEADLINE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Expectation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPECTATION_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestMessage()
	 * @generated
	 */
	int TEST_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE__PARENT_STEP = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE__ORDER = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE__FIELDS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Packets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE__PACKETS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MESSAGE_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.TestPacketImpl <em>Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPacketImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestPacket()
	 * @generated
	 */
	int TEST_PACKET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PACKET__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Message</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PACKET__PARENT_MESSAGE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PACKET__FIELDS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_PACKET_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestField()
	 * @generated
	 */
	int TEST_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Message</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD__PARENT_MESSAGE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Packet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD__PARENT_PACKET = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD__VARIABLE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD__VALUE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FIELD_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.StepIO <em>Step IO</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.StepIO
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepIO()
	 * @generated
	 */
	int STEP_IO = 9;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.StepInterface <em>Step Interface</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.StepInterface
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepInterface()
	 * @generated
	 */
	int STEP_INTERFACE = 10;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.StepLevel <em>Step Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.StepLevel
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepLevel()
	 * @generated
	 */
	int STEP_LEVEL = 11;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.StepMode <em>Step Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.StepMode
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepMode()
	 * @generated
	 */
	int STEP_MODE = 12;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.test.TestMessageType <em>Message Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessageType
	 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestMessageType()
	 * @generated
	 */
	int TEST_MESSAGE_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.Frame#getSubSequences <em>Sub Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Sequences</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Frame#getSubSequences()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_SubSequences();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.Frame#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Dictionary</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Frame#getParentDictionary()
	 * @see #getFrame()
	 * @generated
	 */
	EReference getFrame_ParentDictionary();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence <em>Sub Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Sequence</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence
	 * @generated
	 */
	EClass getSubSequence();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getParentFrame <em>Parent Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Frame</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getParentFrame()
	 * @see #getSubSequence()
	 * @generated
	 */
	EReference getSubSequence_ParentFrame();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getDLRBG <em>DLRBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DLRBG</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getDLRBG()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_DLRBG();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getLevel()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getMode()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getNidLRBG <em>Nid LRBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nid LRBG</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getNidLRBG()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_NidLRBG();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirLRBG <em>QDir LRBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QDir LRBG</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirLRBG()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_QDirLRBG();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirTrain <em>QDir Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QDir Train</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirTrain()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_QDirTrain();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDLRBG <em>QDLRBG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QDLRBG</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDLRBG()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_QDLRBG();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcId <em>Rbc Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rbc Id</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcId()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_RbcId();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcPhone <em>Rbc Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rbc Phone</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcPhone()
	 * @see #getSubSequence()
	 * @generated
	 */
	EAttribute getSubSequence_RbcPhone();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getTestCases <em>Test Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Cases</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubSequence#getTestCases()
	 * @see #getSubSequence()
	 * @generated
	 */
	EReference getSubSequence_TestCases();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase <em>Single Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Test Case</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SingleTestCase
	 * @generated
	 */
	EClass getSingleTestCase();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getParentSubSequence <em>Parent Sub Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Sub Sequence</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getParentSubSequence()
	 * @see #getSingleTestCase()
	 * @generated
	 */
	EReference getSingleTestCase_ParentSubSequence();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getFeature()
	 * @see #getSingleTestCase()
	 * @generated
	 */
	EAttribute getSingleTestCase_Feature();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getCase()
	 * @see #getSingleTestCase()
	 * @generated
	 */
	EAttribute getSingleTestCase_Case();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getSteps()
	 * @see #getSingleTestCase()
	 * @generated
	 */
	EReference getSingleTestCase_Steps();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.Step#getParentTestCase <em>Parent Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Test Case</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getParentTestCase()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ParentTestCase();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getTcsOrder <em>Tcs Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcs Order</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getTcsOrder()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_TcsOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getDistance()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getDescription()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getUserComment <em>User Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Comment</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getUserComment()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_UserComment();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getIo <em>Io</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getIo()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Io();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getInterface()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Interface();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getLevelIn <em>Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level In</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getLevelIn()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_LevelIn();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getLevelOut <em>Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Out</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getLevelOut()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_LevelOut();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getModeIn <em>Mode In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode In</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getModeIn()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_ModeIn();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#getModeOut <em>Mode Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode Out</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getModeOut()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_ModeOut();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#isTranslationRequired <em>Translation Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translation Required</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#isTranslationRequired()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_TranslationRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Step#isTranslated <em>Translated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translated</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#isTranslated()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Translated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.Step#getSubSteps <em>Sub Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Steps</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getSubSteps()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_SubSteps();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.Step#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Step#getMessages()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Messages();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.SubStep <em>Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Step</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep
	 * @generated
	 */
	EClass getSubStep();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentStep <em>Parent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Step</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getParentStep()
	 * @see #getSubStep()
	 * @generated
	 */
	EReference getSubStep_ParentStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getActions()
	 * @see #getSubStep()
	 * @generated
	 */
	EReference getSubStep_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getExpectations <em>Expectations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expectations</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getExpectations()
	 * @see #getSubStep()
	 * @generated
	 */
	EReference getSubStep_Expectations();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#isSkipEngine <em>Skip Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Engine</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#isSkipEngine()
	 * @see #getSubStep()
	 * @generated
	 */
	EAttribute getSubStep_SkipEngine();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentTranslation <em>Parent Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Translation</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getParentTranslation()
	 * @see #getSubStep()
	 * @generated
	 */
	EReference getSubStep_ParentTranslation();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.Expectation <em>Expectation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expectation</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Expectation
	 * @generated
	 */
	EClass getExpectation();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getParentSubStep <em>Parent Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Sub Step</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Expectation#getParentSubStep()
	 * @see #getExpectation()
	 * @generated
	 */
	EReference getExpectation_ParentSubStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Expectation#getExpression()
	 * @see #getExpectation()
	 * @generated
	 */
	EAttribute getExpectation_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#isBlocking <em>Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Expectation#isBlocking()
	 * @see #getExpectation()
	 * @generated
	 */
	EAttribute getExpectation_Blocking();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.Expectation#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.Expectation#getDeadline()
	 * @see #getExpectation()
	 * @generated
	 */
	EAttribute getExpectation_Deadline();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage
	 * @generated
	 */
	EClass getTestMessage();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getParentStep <em>Parent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Step</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage#getParentStep()
	 * @see #getTestMessage()
	 * @generated
	 */
	EReference getTestMessage_ParentStep();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage#getOrder()
	 * @see #getTestMessage()
	 * @generated
	 */
	EAttribute getTestMessage_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage#getFields()
	 * @see #getTestMessage()
	 * @generated
	 */
	EReference getTestMessage_Fields();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getPackets <em>Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packets</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage#getPackets()
	 * @see #getTestMessage()
	 * @generated
	 */
	EReference getTestMessage_Packets();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.TestPacket <em>Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPacket
	 * @generated
	 */
	EClass getTestPacket();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.TestPacket#getParentMessage <em>Parent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Message</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPacket#getParentMessage()
	 * @see #getTestPacket()
	 * @generated
	 */
	EReference getTestPacket_ParentMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.test.TestPacket#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPacket#getFields()
	 * @see #getTestPacket()
	 * @generated
	 */
	EReference getTestPacket_Fields();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.test.TestField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestField
	 * @generated
	 */
	EClass getTestField();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentMessage <em>Parent Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Message</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestField#getParentMessage()
	 * @see #getTestField()
	 * @generated
	 */
	EReference getTestField_ParentMessage();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getParentPacket <em>Parent Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Packet</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestField#getParentPacket()
	 * @see #getTestField()
	 * @generated
	 */
	EReference getTestField_ParentPacket();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestField#getVariable()
	 * @see #getTestField()
	 * @generated
	 */
	EAttribute getTestField_Variable();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.test.TestField#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestField#getValue()
	 * @see #getTestField()
	 * @generated
	 */
	EAttribute getTestField_Value();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.test.StepIO <em>Step IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step IO</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepIO
	 * @generated
	 */
	EEnum getStepIO();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.test.StepInterface <em>Step Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step Interface</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepInterface
	 * @generated
	 */
	EEnum getStepInterface();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.test.StepLevel <em>Step Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step Level</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepLevel
	 * @generated
	 */
	EEnum getStepLevel();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.test.StepMode <em>Step Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step Mode</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepMode
	 * @generated
	 */
	EEnum getStepMode();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.test.TestMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Type</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessageType
	 * @generated
	 */
	EEnum getTestMessageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.FrameImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>Sub Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__SUB_SEQUENCES = eINSTANCE.getFrame_SubSequences();

		/**
		 * The meta object literal for the '<em><b>Parent Dictionary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAME__PARENT_DICTIONARY = eINSTANCE.getFrame_ParentDictionary();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl <em>Sub Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getSubSequence()
		 * @generated
		 */
		EClass SUB_SEQUENCE = eINSTANCE.getSubSequence();

		/**
		 * The meta object literal for the '<em><b>Parent Frame</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SEQUENCE__PARENT_FRAME = eINSTANCE.getSubSequence_ParentFrame();

		/**
		 * The meta object literal for the '<em><b>DLRBG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__DLRBG = eINSTANCE.getSubSequence_DLRBG();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__LEVEL = eINSTANCE.getSubSequence_Level();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__MODE = eINSTANCE.getSubSequence_Mode();

		/**
		 * The meta object literal for the '<em><b>Nid LRBG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__NID_LRBG = eINSTANCE.getSubSequence_NidLRBG();

		/**
		 * The meta object literal for the '<em><b>QDir LRBG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__QDIR_LRBG = eINSTANCE.getSubSequence_QDirLRBG();

		/**
		 * The meta object literal for the '<em><b>QDir Train</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__QDIR_TRAIN = eINSTANCE.getSubSequence_QDirTrain();

		/**
		 * The meta object literal for the '<em><b>QDLRBG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__QDLRBG = eINSTANCE.getSubSequence_QDLRBG();

		/**
		 * The meta object literal for the '<em><b>Rbc Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__RBC_ID = eINSTANCE.getSubSequence_RbcId();

		/**
		 * The meta object literal for the '<em><b>Rbc Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SEQUENCE__RBC_PHONE = eINSTANCE.getSubSequence_RbcPhone();

		/**
		 * The meta object literal for the '<em><b>Test Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SEQUENCE__TEST_CASES = eINSTANCE.getSubSequence_TestCases();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl <em>Single Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.SingleTestCaseImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getSingleTestCase()
		 * @generated
		 */
		EClass SINGLE_TEST_CASE = eINSTANCE.getSingleTestCase();

		/**
		 * The meta object literal for the '<em><b>Parent Sub Sequence</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_TEST_CASE__PARENT_SUB_SEQUENCE = eINSTANCE.getSingleTestCase_ParentSubSequence();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TEST_CASE__FEATURE = eINSTANCE.getSingleTestCase_Feature();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TEST_CASE__CASE = eINSTANCE.getSingleTestCase_Case();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_TEST_CASE__STEPS = eINSTANCE.getSingleTestCase_Steps();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.StepImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Parent Test Case</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__PARENT_TEST_CASE = eINSTANCE.getStep_ParentTestCase();

		/**
		 * The meta object literal for the '<em><b>Tcs Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TCS_ORDER = eINSTANCE.getStep_TcsOrder();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__DISTANCE = eINSTANCE.getStep_Distance();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

		/**
		 * The meta object literal for the '<em><b>User Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__USER_COMMENT = eINSTANCE.getStep_UserComment();

		/**
		 * The meta object literal for the '<em><b>Io</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IO = eINSTANCE.getStep_Io();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__INTERFACE = eINSTANCE.getStep_Interface();

		/**
		 * The meta object literal for the '<em><b>Level In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__LEVEL_IN = eINSTANCE.getStep_LevelIn();

		/**
		 * The meta object literal for the '<em><b>Level Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__LEVEL_OUT = eINSTANCE.getStep_LevelOut();

		/**
		 * The meta object literal for the '<em><b>Mode In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__MODE_IN = eINSTANCE.getStep_ModeIn();

		/**
		 * The meta object literal for the '<em><b>Mode Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__MODE_OUT = eINSTANCE.getStep_ModeOut();

		/**
		 * The meta object literal for the '<em><b>Translation Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TRANSLATION_REQUIRED = eINSTANCE.getStep_TranslationRequired();

		/**
		 * The meta object literal for the '<em><b>Translated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TRANSLATED = eINSTANCE.getStep_Translated();

		/**
		 * The meta object literal for the '<em><b>Sub Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SUB_STEPS = eINSTANCE.getStep_SubSteps();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__MESSAGES = eINSTANCE.getStep_Messages();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl <em>Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getSubStep()
		 * @generated
		 */
		EClass SUB_STEP = eINSTANCE.getSubStep();

		/**
		 * The meta object literal for the '<em><b>Parent Step</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STEP__PARENT_STEP = eINSTANCE.getSubStep_ParentStep();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STEP__ACTIONS = eINSTANCE.getSubStep_Actions();

		/**
		 * The meta object literal for the '<em><b>Expectations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STEP__EXPECTATIONS = eINSTANCE.getSubStep_Expectations();

		/**
		 * The meta object literal for the '<em><b>Skip Engine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_STEP__SKIP_ENGINE = eINSTANCE.getSubStep_SkipEngine();

		/**
		 * The meta object literal for the '<em><b>Parent Translation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STEP__PARENT_TRANSLATION = eINSTANCE.getSubStep_ParentTranslation();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl <em>Expectation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.ExpectationImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getExpectation()
		 * @generated
		 */
		EClass EXPECTATION = eINSTANCE.getExpectation();

		/**
		 * The meta object literal for the '<em><b>Parent Sub Step</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPECTATION__PARENT_SUB_STEP = eINSTANCE.getExpectation_ParentSubStep();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTATION__EXPRESSION = eINSTANCE.getExpectation_Expression();

		/**
		 * The meta object literal for the '<em><b>Blocking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTATION__BLOCKING = eINSTANCE.getExpectation_Blocking();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPECTATION__DEADLINE = eINSTANCE.getExpectation_Deadline();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestMessageImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestMessage()
		 * @generated
		 */
		EClass TEST_MESSAGE = eINSTANCE.getTestMessage();

		/**
		 * The meta object literal for the '<em><b>Parent Step</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MESSAGE__PARENT_STEP = eINSTANCE.getTestMessage_ParentStep();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_MESSAGE__ORDER = eINSTANCE.getTestMessage_Order();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MESSAGE__FIELDS = eINSTANCE.getTestMessage_Fields();

		/**
		 * The meta object literal for the '<em><b>Packets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_MESSAGE__PACKETS = eINSTANCE.getTestMessage_Packets();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.TestPacketImpl <em>Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPacketImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestPacket()
		 * @generated
		 */
		EClass TEST_PACKET = eINSTANCE.getTestPacket();

		/**
		 * The meta object literal for the '<em><b>Parent Message</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_PACKET__PARENT_MESSAGE = eINSTANCE.getTestPacket_ParentMessage();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_PACKET__FIELDS = eINSTANCE.getTestPacket_Fields();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestFieldImpl
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestField()
		 * @generated
		 */
		EClass TEST_FIELD = eINSTANCE.getTestField();

		/**
		 * The meta object literal for the '<em><b>Parent Message</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_FIELD__PARENT_MESSAGE = eINSTANCE.getTestField_ParentMessage();

		/**
		 * The meta object literal for the '<em><b>Parent Packet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_FIELD__PARENT_PACKET = eINSTANCE.getTestField_ParentPacket();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD__VARIABLE = eINSTANCE.getTestField_Variable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_FIELD__VALUE = eINSTANCE.getTestField_Value();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.StepIO <em>Step IO</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.StepIO
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepIO()
		 * @generated
		 */
		EEnum STEP_IO = eINSTANCE.getStepIO();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.StepInterface <em>Step Interface</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.StepInterface
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepInterface()
		 * @generated
		 */
		EEnum STEP_INTERFACE = eINSTANCE.getStepInterface();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.StepLevel <em>Step Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.StepLevel
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepLevel()
		 * @generated
		 */
		EEnum STEP_LEVEL = eINSTANCE.getStepLevel();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.StepMode <em>Step Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.StepMode
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getStepMode()
		 * @generated
		 */
		EEnum STEP_MODE = eINSTANCE.getStepMode();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.test.TestMessageType <em>Message Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.test.TestMessageType
		 * @see org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl#getTestMessageType()
		 * @generated
		 */
		EEnum TEST_MESSAGE_TYPE = eINSTANCE.getTestMessageType();

	}

} //TestPackage
