/**
 */
package org.openetcs.model.ertmsformalspecs.customization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl;
import org.openetcs.model.ertmsformalspecs.customization.CustomizationFactory;
import org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage;
import org.openetcs.model.ertmsformalspecs.customization.RuleDisabling;
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
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;
import org.openetcs.model.ertmsformalspecs.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomizationPackageImpl extends EPackageImpl implements CustomizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleDisablingEClass = null;

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
	 * @see org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CustomizationPackageImpl() {
		super(eNS_URI, CustomizationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CustomizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CustomizationPackage init() {
		if (isInited) return (CustomizationPackage)EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI);

		// Obtain or create and register package
		CustomizationPackageImpl theCustomizationPackage = (CustomizationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomizationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomizationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		MessagesPackageImpl theMessagesPackage = (MessagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) instanceof MessagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) : MessagesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		TranslationPackageImpl theTranslationPackage = (TranslationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) instanceof TranslationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) : TranslationPackage.eINSTANCE);
		ShortcutPackageImpl theShortcutPackage = (ShortcutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) instanceof ShortcutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) : ShortcutPackage.eINSTANCE);

		// Create package meta-data objects
		theCustomizationPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theMessagesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theTranslationPackage.createPackageContents();
		theShortcutPackage.createPackageContents();

		// Initialize created meta-data
		theCustomizationPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theMessagesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theTranslationPackage.initializePackageContents();
		theShortcutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCustomizationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CustomizationPackage.eNS_URI, theCustomizationPackage);
		return theCustomizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleDisabling() {
		return ruleDisablingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDisabling_Rule() {
		return (EReference)ruleDisablingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleDisabling_ParentDictionary() {
		return (EReference)ruleDisablingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomizationFactory getCustomizationFactory() {
		return (CustomizationFactory)getEFactoryInstance();
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
		ruleDisablingEClass = createEClass(RULE_DISABLING);
		createEReference(ruleDisablingEClass, RULE_DISABLING__RULE);
		createEReference(ruleDisablingEClass, RULE_DISABLING__PARENT_DICTIONARY);
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
		ruleDisablingEClass.getESuperTypes().add(theModelPackage.getReqRelated());

		// Initialize classes and features; add operations and parameters
		initEClass(ruleDisablingEClass, RuleDisabling.class, "RuleDisabling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleDisabling_Rule(), theBehaviourPackage.getRule(), null, "rule", null, 1, 1, RuleDisabling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleDisabling_ParentDictionary(), theModelPackage.getDictionary(), theModelPackage.getDictionary_RuleDisablings(), "parentDictionary", null, 0, 1, RuleDisabling.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CustomizationPackageImpl
