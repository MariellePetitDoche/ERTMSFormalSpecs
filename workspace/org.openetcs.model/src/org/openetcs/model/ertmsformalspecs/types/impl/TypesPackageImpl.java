/**
 */
package org.openetcs.model.ertmsformalspecs.types.impl;

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
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.test.impl.TestPackageImpl;
import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;
import org.openetcs.model.ertmsformalspecs.translation.impl.TranslationPackageImpl;
import org.openetcs.model.ertmsformalspecs.types.Case;
import org.openetcs.model.ertmsformalspecs.types.Collection;
import org.openetcs.model.ertmsformalspecs.types.EnumValue;
import org.openetcs.model.ertmsformalspecs.types.Enumeration;
import org.openetcs.model.ertmsformalspecs.types.Function;
import org.openetcs.model.ertmsformalspecs.types.Precision;
import org.openetcs.model.ertmsformalspecs.types.Range;
import org.openetcs.model.ertmsformalspecs.types.Structure;
import org.openetcs.model.ertmsformalspecs.types.StructureElement;
import org.openetcs.model.ertmsformalspecs.types.Type;
import org.openetcs.model.ertmsformalspecs.types.TypedElement;
import org.openetcs.model.ertmsformalspecs.types.TypesFactory;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum precisionEEnum = null;

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
	 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		MessagesPackageImpl theMessagesPackage = (MessagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) instanceof MessagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) : MessagesPackage.eINSTANCE);
		CustomizationPackageImpl theCustomizationPackage = (CustomizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) instanceof CustomizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) : CustomizationPackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		TranslationPackageImpl theTranslationPackage = (TranslationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) instanceof TranslationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) : TranslationPackage.eINSTANCE);
		ShortcutPackageImpl theShortcutPackage = (ShortcutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) instanceof ShortcutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) : ShortcutPackage.eINSTANCE);

		// Create package meta-data objects
		theTypesPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theMessagesPackage.createPackageContents();
		theCustomizationPackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theTranslationPackage.createPackageContents();
		theShortcutPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theMessagesPackage.initializePackageContents();
		theCustomizationPackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theTranslationPackage.initializePackageContents();
		theShortcutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_ParentNamespace() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypedElement_TypeName() {
		return (EAttribute)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_Values() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_SubEnumerations() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_ParentEnumeration() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumValue_Value() {
		return (EAttribute)enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumValue_ParentEnumeration() {
		return (EReference)enumValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumValue_ParentRange() {
		return (EReference)enumValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_MinimumValue() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_MaximumValue() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Precision() {
		return (EAttribute)rangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRange_SpecialValues() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Elements() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Procedures() {
		return (EReference)structureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Rules() {
		return (EReference)structureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureElement() {
		return structureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollection_MaximumSize() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunction_Cases() {
		return (EReference)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_PreConditions() {
		return (EReference)caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCase_Expression() {
		return (EAttribute)caseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_ParentFunction() {
		return (EReference)caseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrecision() {
		return precisionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__PARENT_NAMESPACE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEAttribute(typedElementEClass, TYPED_ELEMENT__TYPE_NAME);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__VALUES);
		createEReference(enumerationEClass, ENUMERATION__SUB_ENUMERATIONS);
		createEReference(enumerationEClass, ENUMERATION__PARENT_ENUMERATION);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEAttribute(enumValueEClass, ENUM_VALUE__VALUE);
		createEReference(enumValueEClass, ENUM_VALUE__PARENT_ENUMERATION);
		createEReference(enumValueEClass, ENUM_VALUE__PARENT_RANGE);

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__MINIMUM_VALUE);
		createEAttribute(rangeEClass, RANGE__MAXIMUM_VALUE);
		createEAttribute(rangeEClass, RANGE__PRECISION);
		createEReference(rangeEClass, RANGE__SPECIAL_VALUES);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__ELEMENTS);
		createEReference(structureEClass, STRUCTURE__PROCEDURES);
		createEReference(structureEClass, STRUCTURE__RULES);

		structureElementEClass = createEClass(STRUCTURE_ELEMENT);

		collectionEClass = createEClass(COLLECTION);
		createEAttribute(collectionEClass, COLLECTION__MAXIMUM_SIZE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__PARAMETERS);
		createEReference(functionEClass, FUNCTION__CASES);

		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__PRE_CONDITIONS);
		createEAttribute(caseEClass, CASE__EXPRESSION);
		createEReference(caseEClass, CASE__PARENT_FUNCTION);

		// Create enums
		precisionEEnum = createEEnum(PRECISION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(theModelPackage.getReqRelated());
		typeEClass.getESuperTypes().add(theModelPackage.getDefaultValueElement());
		enumerationEClass.getESuperTypes().add(this.getType());
		enumValueEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		rangeEClass.getESuperTypes().add(this.getType());
		structureEClass.getESuperTypes().add(this.getType());
		structureElementEClass.getESuperTypes().add(theModelPackage.getReqRelated());
		structureElementEClass.getESuperTypes().add(this.getTypedElement());
		structureElementEClass.getESuperTypes().add(theModelPackage.getDefaultValueElement());
		structureElementEClass.getESuperTypes().add(theModelPackage.getVariableModeElement());
		collectionEClass.getESuperTypes().add(this.getType());
		collectionEClass.getESuperTypes().add(this.getTypedElement());
		functionEClass.getESuperTypes().add(this.getType());
		functionEClass.getESuperTypes().add(this.getTypedElement());
		caseEClass.getESuperTypes().add(theModelPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_ParentNamespace(), theModelPackage.getNamespace(), theModelPackage.getNamespace_Types(), "parentNamespace", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypedElement_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_Values(), this.getEnumValue(), this.getEnumValue_ParentEnumeration(), "values", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_SubEnumerations(), this.getEnumeration(), this.getEnumeration_ParentEnumeration(), "subEnumerations", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumeration_ParentEnumeration(), this.getEnumeration(), this.getEnumeration_SubEnumerations(), "parentEnumeration", null, 0, 1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumValue_ParentEnumeration(), this.getEnumeration(), this.getEnumeration_Values(), "parentEnumeration", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumValue_ParentRange(), this.getRange(), this.getRange_SpecialValues(), "parentRange", null, 0, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_MinimumValue(), ecorePackage.getEString(), "minimumValue", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_MaximumValue(), ecorePackage.getEString(), "maximumValue", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Precision(), this.getPrecision(), "precision", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRange_SpecialValues(), this.getEnumValue(), this.getEnumValue_ParentRange(), "specialValues", null, 0, -1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Elements(), this.getStructureElement(), null, "elements", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Procedures(), theModelPackage.getProcedure(), theModelPackage.getProcedure_ParentStructure(), "procedures", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructure_Rules(), theBehaviourPackage.getRule(), null, "rules", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureElementEClass, StructureElement.class, "StructureElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollection_MaximumSize(), ecorePackage.getEInt(), "maximumSize", null, 0, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_Parameters(), theModelPackage.getParameter(), theModelPackage.getParameter_ParentFunction(), "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Cases(), this.getCase(), this.getCase_ParentFunction(), "cases", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_PreConditions(), theBehaviourPackage.getPreCondition(), theBehaviourPackage.getPreCondition_ParentCase(), "preConditions", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase_Expression(), ecorePackage.getEString(), "expression", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCase_ParentFunction(), this.getFunction(), this.getFunction_Cases(), "parentFunction", null, 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(precisionEEnum, Precision.class, "Precision");
		addEEnumLiteral(precisionEEnum, Precision.INTEGER_PRECISION);
		addEEnumLiteral(precisionEEnum, Precision.DOUBLE_PRECISION);
	}

} //TypesPackageImpl
