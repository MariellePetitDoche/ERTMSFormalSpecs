/**
 */
package org.openetcs.model.ertmsformalspecs.test.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openetcs.model.ertmsformalspecs.ModelPackage;

import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;

import org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl;

import org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage;

import org.openetcs.model.ertmsformalspecs.customization.impl.CustomizationPackageImpl;

import org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl;

import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;

import org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl;

import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;

import org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl;

import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage;

import org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutPackageImpl;

import org.openetcs.model.ertmsformalspecs.test.Expectation;
import org.openetcs.model.ertmsformalspecs.test.Frame;
import org.openetcs.model.ertmsformalspecs.test.Step;
import org.openetcs.model.ertmsformalspecs.test.StepIO;
import org.openetcs.model.ertmsformalspecs.test.StepInterface;
import org.openetcs.model.ertmsformalspecs.test.StepLevel;
import org.openetcs.model.ertmsformalspecs.test.StepMode;
import org.openetcs.model.ertmsformalspecs.test.SubSequence;
import org.openetcs.model.ertmsformalspecs.test.SubStep;
import org.openetcs.model.ertmsformalspecs.test.TestCase;
import org.openetcs.model.ertmsformalspecs.test.TestFactory;
import org.openetcs.model.ertmsformalspecs.test.TestField;
import org.openetcs.model.ertmsformalspecs.test.TestMessage;
import org.openetcs.model.ertmsformalspecs.test.TestMessageType;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.test.TestPacket;

import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;

import org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl;

import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

import org.openetcs.model.ertmsformalspecs.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepIOEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepInterfaceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testMessageTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackageImpl() {
		super(eNS_URI, TestFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		MessagesPackageImpl theMessagesPackage = (MessagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) instanceof MessagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) : MessagesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		CustomizationPackageImpl theCustomizationPackage = (CustomizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) instanceof CustomizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) : CustomizationPackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		TranslationPackageImpl theTranslationPackage = (TranslationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) instanceof TranslationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) : TranslationPackage.eINSTANCE);
		ShortcutPackageImpl theShortcutPackage = (ShortcutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) instanceof ShortcutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) : ShortcutPackage.eINSTANCE);

		// Create package meta-data objects
		theTestPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theMessagesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theCustomizationPackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theTranslationPackage.createPackageContents();
		theShortcutPackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theMessagesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theCustomizationPackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theTranslationPackage.initializePackageContents();
		theShortcutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
		return theTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrame() {
		return frameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_SubSequences() {
		return (EReference)frameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrame_ParentDictionary() {
		return (EReference)frameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSequence() {
		return subSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSequence_ParentFrame() {
		return (EReference)subSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_DLRBG() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_Level() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_Mode() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_NidLRBG() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_QDirLRBG() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_QDirTrain() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_QDLRBG() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_RbcId() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSequence_RbcPhone() {
		return (EAttribute)subSequenceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSequence_TestCases() {
		return (EReference)subSequenceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_ParentSubSequence() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_Feature() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestCase_Case() {
		return (EAttribute)testCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Steps() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_ParentTestCase() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_TcsOrder() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Distance() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Description() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_UserComment() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Io() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Interface() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_LevelIn() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_LevelOut() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_ModeIn() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_ModeOut() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_TranslationRequired() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Translated() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_SubSteps() {
		return (EReference)stepEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Messages() {
		return (EReference)stepEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubStep() {
		return subStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStep_ParentStep() {
		return (EReference)subStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStep_Actions() {
		return (EReference)subStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStep_Expectations() {
		return (EReference)subStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubStep_SkipEngine() {
		return (EAttribute)subStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubStep_ParentTranslation() {
		return (EReference)subStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectation() {
		return expectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpectation_ParentSubStep() {
		return (EReference)expectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectation_Variable() {
		return (EAttribute)expectationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectation_Value() {
		return (EAttribute)expectationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectation_Blocking() {
		return (EAttribute)expectationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpectation_Deadline() {
		return (EAttribute)expectationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestMessage() {
		return testMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestMessage_ParentStep() {
		return (EReference)testMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMessage_Order() {
		return (EAttribute)testMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestMessage_Fields() {
		return (EReference)testMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestMessage_Packets() {
		return (EReference)testMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestPacket() {
		return testPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestPacket_ParentMessage() {
		return (EReference)testPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestPacket_Fields() {
		return (EReference)testPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestField() {
		return testFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestField_ParentMessage() {
		return (EReference)testFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestField_ParentPacket() {
		return (EReference)testFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestField_Variable() {
		return (EAttribute)testFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestField_Value() {
		return (EAttribute)testFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepIO() {
		return stepIOEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepInterface() {
		return stepInterfaceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepLevel() {
		return stepLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepMode() {
		return stepModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestMessageType() {
		return testMessageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		frameEClass = createEClass(FRAME);
		createEReference(frameEClass, FRAME__SUB_SEQUENCES);
		createEReference(frameEClass, FRAME__PARENT_DICTIONARY);

		subSequenceEClass = createEClass(SUB_SEQUENCE);
		createEReference(subSequenceEClass, SUB_SEQUENCE__PARENT_FRAME);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__DLRBG);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__LEVEL);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__MODE);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__NID_LRBG);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__QDIR_LRBG);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__QDIR_TRAIN);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__QDLRBG);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__RBC_ID);
		createEAttribute(subSequenceEClass, SUB_SEQUENCE__RBC_PHONE);
		createEReference(subSequenceEClass, SUB_SEQUENCE__TEST_CASES);

		testCaseEClass = createEClass(TEST_CASE);
		createEReference(testCaseEClass, TEST_CASE__PARENT_SUB_SEQUENCE);
		createEAttribute(testCaseEClass, TEST_CASE__FEATURE);
		createEAttribute(testCaseEClass, TEST_CASE__CASE);
		createEReference(testCaseEClass, TEST_CASE__STEPS);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__PARENT_TEST_CASE);
		createEAttribute(stepEClass, STEP__TCS_ORDER);
		createEAttribute(stepEClass, STEP__DISTANCE);
		createEAttribute(stepEClass, STEP__DESCRIPTION);
		createEAttribute(stepEClass, STEP__USER_COMMENT);
		createEAttribute(stepEClass, STEP__IO);
		createEAttribute(stepEClass, STEP__INTERFACE);
		createEAttribute(stepEClass, STEP__LEVEL_IN);
		createEAttribute(stepEClass, STEP__LEVEL_OUT);
		createEAttribute(stepEClass, STEP__MODE_IN);
		createEAttribute(stepEClass, STEP__MODE_OUT);
		createEAttribute(stepEClass, STEP__TRANSLATION_REQUIRED);
		createEAttribute(stepEClass, STEP__TRANSLATED);
		createEReference(stepEClass, STEP__SUB_STEPS);
		createEReference(stepEClass, STEP__MESSAGES);

		subStepEClass = createEClass(SUB_STEP);
		createEReference(subStepEClass, SUB_STEP__PARENT_STEP);
		createEReference(subStepEClass, SUB_STEP__ACTIONS);
		createEReference(subStepEClass, SUB_STEP__EXPECTATIONS);
		createEAttribute(subStepEClass, SUB_STEP__SKIP_ENGINE);
		createEReference(subStepEClass, SUB_STEP__PARENT_TRANSLATION);

		expectationEClass = createEClass(EXPECTATION);
		createEReference(expectationEClass, EXPECTATION__PARENT_SUB_STEP);
		createEAttribute(expectationEClass, EXPECTATION__VARIABLE);
		createEAttribute(expectationEClass, EXPECTATION__VALUE);
		createEAttribute(expectationEClass, EXPECTATION__BLOCKING);
		createEAttribute(expectationEClass, EXPECTATION__DEADLINE);

		testMessageEClass = createEClass(TEST_MESSAGE);
		createEReference(testMessageEClass, TEST_MESSAGE__PARENT_STEP);
		createEAttribute(testMessageEClass, TEST_MESSAGE__ORDER);
		createEReference(testMessageEClass, TEST_MESSAGE__FIELDS);
		createEReference(testMessageEClass, TEST_MESSAGE__PACKETS);

		testPacketEClass = createEClass(TEST_PACKET);
		createEReference(testPacketEClass, TEST_PACKET__PARENT_MESSAGE);
		createEReference(testPacketEClass, TEST_PACKET__FIELDS);

		testFieldEClass = createEClass(TEST_FIELD);
		createEReference(testFieldEClass, TEST_FIELD__PARENT_MESSAGE);
		createEReference(testFieldEClass, TEST_FIELD__PARENT_PACKET);
		createEAttribute(testFieldEClass, TEST_FIELD__VARIABLE);
		createEAttribute(testFieldEClass, TEST_FIELD__VALUE);

		// Create enums
		stepIOEEnum = createEEnum(STEP_IO);
		stepInterfaceEEnum = createEEnum(STEP_INTERFACE);
		stepLevelEEnum = createEEnum(STEP_LEVEL);
		stepModeEEnum = createEEnum(STEP_MODE);
		testMessageTypeEEnum = createEEnum(TEST_MESSAGE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		BehaviourPackage theBehaviourPackage = (BehaviourPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI);
		TranslationPackage theTranslationPackage = (TranslationPackage)EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		frameEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		frameEClass.getESuperTypes().add(theModelPackage.getCommentedElement());
		subSequenceEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		subSequenceEClass.getESuperTypes().add(theModelPackage.getCommentedElement());
		testCaseEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		testCaseEClass.getESuperTypes().add(theModelPackage.getCommentedElement());
		stepEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		stepEClass.getESuperTypes().add(theModelPackage.getCommentedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(frameEClass, Frame.class, "Frame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrame_SubSequences(), this.getSubSequence(), this.getSubSequence_ParentFrame(), "subSequences", null, 0, -1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrame_ParentDictionary(), theModelPackage.getDictionary(), theModelPackage.getDictionary_Tests(), "parentDictionary", null, 0, 1, Frame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSequenceEClass, SubSequence.class, "SubSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubSequence_ParentFrame(), this.getFrame(), this.getFrame_SubSequences(), "parentFrame", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_DLRBG(), ecorePackage.getEString(), "dLRBG", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_Level(), ecorePackage.getEString(), "level", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_NidLRBG(), ecorePackage.getEString(), "nidLRBG", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_QDirLRBG(), ecorePackage.getEString(), "qDirLRBG", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_QDirTrain(), ecorePackage.getEString(), "qDirTrain", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_QDLRBG(), ecorePackage.getEString(), "qDLRBG", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_RbcId(), ecorePackage.getEString(), "rbcId", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSequence_RbcPhone(), ecorePackage.getEString(), "rbcPhone", null, 0, 1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSequence_TestCases(), this.getTestCase(), this.getTestCase_ParentSubSequence(), "testCases", null, 0, -1, SubSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestCase_ParentSubSequence(), this.getSubSequence(), this.getSubSequence_TestCases(), "parentSubSequence", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCase_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestCase_Case(), ecorePackage.getEString(), "case", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestCase_Steps(), this.getStep(), this.getStep_ParentTestCase(), "steps", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_ParentTestCase(), this.getTestCase(), this.getTestCase_Steps(), "parentTestCase", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_TcsOrder(), ecorePackage.getEInt(), "tcsOrder", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_UserComment(), ecorePackage.getEString(), "userComment", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Io(), this.getStepIO(), "io", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Interface(), this.getStepInterface(), "interface", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_LevelIn(), this.getStepLevel(), "levelIn", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_LevelOut(), this.getStepLevel(), "levelOut", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_ModeIn(), this.getStepMode(), "modeIn", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_ModeOut(), this.getStepMode(), "modeOut", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_TranslationRequired(), ecorePackage.getEBoolean(), "translationRequired", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Translated(), ecorePackage.getEBoolean(), "translated", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_SubSteps(), this.getSubStep(), this.getSubStep_ParentStep(), "subSteps", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Messages(), this.getTestMessage(), this.getTestMessage_ParentStep(), "messages", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subStepEClass, SubStep.class, "SubStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubStep_ParentStep(), this.getStep(), this.getStep_SubSteps(), "parentStep", null, 0, 1, SubStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStep_Actions(), theBehaviourPackage.getAction(), theBehaviourPackage.getAction_ParentSubStep(), "actions", null, 0, -1, SubStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStep_Expectations(), this.getExpectation(), this.getExpectation_ParentSubStep(), "expectations", null, 0, -1, SubStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubStep_SkipEngine(), ecorePackage.getEBoolean(), "skipEngine", null, 0, 1, SubStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubStep_ParentTranslation(), theTranslationPackage.getTranslation(), theTranslationPackage.getTranslation_SubSteps(), "parentTranslation", null, 0, 1, SubStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expectationEClass, Expectation.class, "Expectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpectation_ParentSubStep(), this.getSubStep(), this.getSubStep_Expectations(), "parentSubStep", null, 0, 1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpectation_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpectation_Value(), ecorePackage.getEString(), "value", null, 0, 1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpectation_Blocking(), ecorePackage.getEBoolean(), "blocking", null, 0, 1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpectation_Deadline(), ecorePackage.getEInt(), "deadline", null, 0, 1, Expectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testMessageEClass, TestMessage.class, "TestMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestMessage_ParentStep(), this.getStep(), this.getStep_Messages(), "parentStep", null, 0, 1, TestMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestMessage_Order(), ecorePackage.getEInt(), "order", null, 0, 1, TestMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestMessage_Fields(), this.getTestField(), this.getTestField_ParentMessage(), "fields", null, 0, -1, TestMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestMessage_Packets(), this.getTestPacket(), this.getTestPacket_ParentMessage(), "packets", null, 0, -1, TestMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testPacketEClass, TestPacket.class, "TestPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestPacket_ParentMessage(), this.getTestMessage(), this.getTestMessage_Packets(), "parentMessage", null, 0, 1, TestPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestPacket_Fields(), this.getTestField(), this.getTestField_ParentPacket(), "fields", null, 0, -1, TestPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testFieldEClass, TestField.class, "TestField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestField_ParentMessage(), this.getTestMessage(), this.getTestMessage_Fields(), "parentMessage", null, 0, 1, TestField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestField_ParentPacket(), this.getTestPacket(), this.getTestPacket_Fields(), "parentPacket", null, 0, 1, TestField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestField_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, TestField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestField_Value(), ecorePackage.getEInt(), "value", null, 0, 1, TestField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stepIOEEnum, StepIO.class, "StepIO");
		addEEnumLiteral(stepIOEEnum, StepIO.NA);
		addEEnumLiteral(stepIOEEnum, StepIO.IN);
		addEEnumLiteral(stepIOEEnum, StepIO.OUT);

		initEEnum(stepInterfaceEEnum, StepInterface.class, "StepInterface");
		addEEnumLiteral(stepInterfaceEEnum, StepInterface.NA);
		addEEnumLiteral(stepInterfaceEEnum, StepInterface.DMI);
		addEEnumLiteral(stepInterfaceEEnum, StepInterface.RTM);
		addEEnumLiteral(stepInterfaceEEnum, StepInterface.JRU);
		addEEnumLiteral(stepInterfaceEEnum, StepInterface.TIU);

		initEEnum(stepLevelEEnum, StepLevel.class, "StepLevel");
		addEEnumLiteral(stepLevelEEnum, StepLevel.NA);
		addEEnumLiteral(stepLevelEEnum, StepLevel.L0);
		addEEnumLiteral(stepLevelEEnum, StepLevel.L1);
		addEEnumLiteral(stepLevelEEnum, StepLevel.LSTM);
		addEEnumLiteral(stepLevelEEnum, StepLevel.L2);
		addEEnumLiteral(stepLevelEEnum, StepLevel.L3);

		initEEnum(stepModeEEnum, StepMode.class, "StepMode");
		addEEnumLiteral(stepModeEEnum, StepMode.NA);
		addEEnumLiteral(stepModeEEnum, StepMode.IS);
		addEEnumLiteral(stepModeEEnum, StepMode.NP);
		addEEnumLiteral(stepModeEEnum, StepMode.SF);
		addEEnumLiteral(stepModeEEnum, StepMode.SL);
		addEEnumLiteral(stepModeEEnum, StepMode.SB);
		addEEnumLiteral(stepModeEEnum, StepMode.SH);
		addEEnumLiteral(stepModeEEnum, StepMode.FS);
		addEEnumLiteral(stepModeEEnum, StepMode.UF);
		addEEnumLiteral(stepModeEEnum, StepMode.SR);
		addEEnumLiteral(stepModeEEnum, StepMode.OS);
		addEEnumLiteral(stepModeEEnum, StepMode.TR);
		addEEnumLiteral(stepModeEEnum, StepMode.PT);
		addEEnumLiteral(stepModeEEnum, StepMode.NL);
		addEEnumLiteral(stepModeEEnum, StepMode.SN);
		addEEnumLiteral(stepModeEEnum, StepMode.RE);
		addEEnumLiteral(stepModeEEnum, StepMode.LS);
		addEEnumLiteral(stepModeEEnum, StepMode.PSH);

		initEEnum(testMessageTypeEEnum, TestMessageType.class, "TestMessageType");
		addEEnumLiteral(testMessageTypeEEnum, TestMessageType.EUROBALISE);
		addEEnumLiteral(testMessageTypeEEnum, TestMessageType.EURORADIO);
		addEEnumLiteral(testMessageTypeEEnum, TestMessageType.EUROLOOP);
	}

} //TestPackageImpl
