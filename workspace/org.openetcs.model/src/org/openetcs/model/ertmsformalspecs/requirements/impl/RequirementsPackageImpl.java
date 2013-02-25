/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.impl;

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
import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;
import org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus;
import org.openetcs.model.ertmsformalspecs.requirements.EParagraphType;
import org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock;
import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;
import org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsFactory;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;
import org.openetcs.model.ertmsformalspecs.requirements.Scope;
import org.openetcs.model.ertmsformalspecs.requirements.Specification;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage;
import org.openetcs.model.ertmsformalspecs.shortcut.impl.ShortcutPackageImpl;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl;
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
public class RequirementsPackageImpl extends EPackageImpl implements RequirementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseLinedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eImplementationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eParagraphTypeEEnum = null;

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
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementsPackageImpl() {
		super(eNS_URI, RequirementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequirementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementsPackage init() {
		if (isInited) return (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);

		// Obtain or create and register package
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		MessagesPackageImpl theMessagesPackage = (MessagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) instanceof MessagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) : MessagesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		CustomizationPackageImpl theCustomizationPackage = (CustomizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) instanceof CustomizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) : CustomizationPackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		TranslationPackageImpl theTranslationPackage = (TranslationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) instanceof TranslationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) : TranslationPackage.eINSTANCE);
		ShortcutPackageImpl theShortcutPackage = (ShortcutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) instanceof ShortcutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) : ShortcutPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementsPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theMessagesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theCustomizationPackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theTranslationPackage.createPackageContents();
		theShortcutPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementsPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theMessagesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theCustomizationPackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theTranslationPackage.initializePackageContents();
		theShortcutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementsPackage.eNS_URI, theRequirementsPackage);
		return theRequirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Paragraphs() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_ParentDictionary() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseLinedElement() {
		return baseLinedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseLinedElement_Baseline() {
		return (EReference)baseLinedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalBlock() {
		return functionalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessInformation() {
		return processInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInformation_Reviewed() {
		return (EAttribute)processInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInformation_ImplementationStatus() {
		return (EAttribute)processInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInformation_MoreInfoRequired() {
		return (EAttribute)processInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessInformation_SpecIssue() {
		return (EAttribute)processInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScope_OnBoardUnit() {
		return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScope_TrackSide() {
		return (EAttribute)scopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScope_Optional() {
		return (EAttribute)scopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Type() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_Scope() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_ProcessInfo() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Id() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraph_Text() {
		return (EAttribute)paragraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_FunctionalBlock() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_ParentSpecification() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_SubParagraphs() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_ParentParagraph() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_TypeSpecs() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_Message() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParagraph_Version() {
		return (EReference)paragraphEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEImplementationStatus() {
		return eImplementationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEParagraphType() {
		return eParagraphTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsFactory getRequirementsFactory() {
		return (RequirementsFactory)getEFactoryInstance();
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
		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__PARAGRAPHS);
		createEReference(specificationEClass, SPECIFICATION__PARENT_DICTIONARY);

		baseLinedElementEClass = createEClass(BASE_LINED_ELEMENT);
		createEReference(baseLinedElementEClass, BASE_LINED_ELEMENT__BASELINE);

		functionalBlockEClass = createEClass(FUNCTIONAL_BLOCK);

		processInformationEClass = createEClass(PROCESS_INFORMATION);
		createEAttribute(processInformationEClass, PROCESS_INFORMATION__REVIEWED);
		createEAttribute(processInformationEClass, PROCESS_INFORMATION__IMPLEMENTATION_STATUS);
		createEAttribute(processInformationEClass, PROCESS_INFORMATION__MORE_INFO_REQUIRED);
		createEAttribute(processInformationEClass, PROCESS_INFORMATION__SPEC_ISSUE);

		scopeEClass = createEClass(SCOPE);
		createEAttribute(scopeEClass, SCOPE__ON_BOARD_UNIT);
		createEAttribute(scopeEClass, SCOPE__TRACK_SIDE);
		createEAttribute(scopeEClass, SCOPE__OPTIONAL);

		paragraphEClass = createEClass(PARAGRAPH);
		createEAttribute(paragraphEClass, PARAGRAPH__TYPE);
		createEReference(paragraphEClass, PARAGRAPH__SCOPE);
		createEReference(paragraphEClass, PARAGRAPH__PROCESS_INFO);
		createEAttribute(paragraphEClass, PARAGRAPH__ID);
		createEAttribute(paragraphEClass, PARAGRAPH__TEXT);
		createEReference(paragraphEClass, PARAGRAPH__FUNCTIONAL_BLOCK);
		createEReference(paragraphEClass, PARAGRAPH__PARENT_SPECIFICATION);
		createEReference(paragraphEClass, PARAGRAPH__SUB_PARAGRAPHS);
		createEReference(paragraphEClass, PARAGRAPH__PARENT_PARAGRAPH);
		createEReference(paragraphEClass, PARAGRAPH__TYPE_SPECS);
		createEReference(paragraphEClass, PARAGRAPH__MESSAGE);
		createEReference(paragraphEClass, PARAGRAPH__VERSION);

		// Create enums
		eImplementationStatusEEnum = createEEnum(EIMPLEMENTATION_STATUS);
		eParagraphTypeEEnum = createEEnum(EPARAGRAPH_TYPE);
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
		MessagesPackage theMessagesPackage = (MessagesPackage)EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMessagesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specificationEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		specificationEClass.getESuperTypes().add(this.getBaseLinedElement());
		functionalBlockEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		processInformationEClass.getESuperTypes().add(theModelPackage.getCommentedElement());
		paragraphEClass.getESuperTypes().add(theModelPackage.getReferencesParagraph());
		paragraphEClass.getESuperTypes().add(this.getBaseLinedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Paragraphs(), this.getParagraph(), this.getParagraph_ParentSpecification(), "paragraphs", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_ParentDictionary(), theModelPackage.getDictionary(), theModelPackage.getDictionary_Specification(), "parentDictionary", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseLinedElementEClass, BaseLinedElement.class, "BaseLinedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseLinedElement_Baseline(), theModelPackage.getBaseLine(), null, "baseline", null, 0, 1, BaseLinedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalBlockEClass, FunctionalBlock.class, "FunctionalBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processInformationEClass, ProcessInformation.class, "ProcessInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessInformation_Reviewed(), ecorePackage.getEBoolean(), "reviewed", null, 0, 1, ProcessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessInformation_ImplementationStatus(), this.getEImplementationStatus(), "implementationStatus", null, 0, 1, ProcessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessInformation_MoreInfoRequired(), ecorePackage.getEBoolean(), "moreInfoRequired", null, 0, 1, ProcessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessInformation_SpecIssue(), ecorePackage.getEBoolean(), "specIssue", null, 0, 1, ProcessInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScope_OnBoardUnit(), ecorePackage.getEBoolean(), "onBoardUnit", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScope_TrackSide(), ecorePackage.getEBoolean(), "trackSide", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScope_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraph_Type(), this.getEParagraphType(), "type", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_Scope(), this.getScope(), null, "scope", null, 1, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_ProcessInfo(), this.getProcessInformation(), null, "processInfo", null, 1, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Id(), ecorePackage.getEString(), "id", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraph_Text(), ecorePackage.getEString(), "text", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_FunctionalBlock(), this.getFunctionalBlock(), null, "functionalBlock", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_ParentSpecification(), this.getSpecification(), this.getSpecification_Paragraphs(), "parentSpecification", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_SubParagraphs(), this.getParagraph(), this.getParagraph_ParentParagraph(), "subParagraphs", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_ParentParagraph(), this.getParagraph(), this.getParagraph_SubParagraphs(), "parentParagraph", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_TypeSpecs(), theMessagesPackage.getTypeSpec(), null, "typeSpecs", null, 0, -1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_Message(), theMessagesPackage.getMessage(), null, "message", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParagraph_Version(), theModelPackage.getBaseLine(), null, "version", null, 0, 1, Paragraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eImplementationStatusEEnum, EImplementationStatus.class, "EImplementationStatus");
		addEEnumLiteral(eImplementationStatusEEnum, EImplementationStatus.NA);
		addEEnumLiteral(eImplementationStatusEEnum, EImplementationStatus.NOT_IMPLEMENTABLE);
		addEEnumLiteral(eImplementationStatusEEnum, EImplementationStatus.IMPLEMENTED);
		addEEnumLiteral(eImplementationStatusEEnum, EImplementationStatus.NEW_REVISION_AVAILABLE);

		initEEnum(eParagraphTypeEEnum, EParagraphType.class, "EParagraphType");
		addEEnumLiteral(eParagraphTypeEEnum, EParagraphType.TITLE);
		addEEnumLiteral(eParagraphTypeEEnum, EParagraphType.DEFINITION);
		addEEnumLiteral(eParagraphTypeEEnum, EParagraphType.NOTE);
		addEEnumLiteral(eParagraphTypeEEnum, EParagraphType.DELETED);
		addEEnumLiteral(eParagraphTypeEEnum, EParagraphType.REQUIREMENT);
		addEEnumLiteral(eParagraphTypeEEnum, EParagraphType.TABLE_HEADER);
		addEEnumLiteral(eParagraphTypeEEnum, EParagraphType.PROBLEM);
	}

} //RequirementsPackageImpl
