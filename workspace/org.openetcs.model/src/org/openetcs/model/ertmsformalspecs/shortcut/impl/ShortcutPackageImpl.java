/**
 */
package org.openetcs.model.ertmsformalspecs.shortcut.impl;

import org.eclipse.emf.ecore.EClass;
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
import org.openetcs.model.ertmsformalspecs.shortcut.Shortcut;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFactory;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder;
import org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage;
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
public class ShortcutPackageImpl extends EPackageImpl implements ShortcutPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortcutFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shortcutEClass = null;

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
	 * @see org.openetcs.model.ertmsformalspecs.shortcut.ShortcutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShortcutPackageImpl() {
		super(eNS_URI, ShortcutFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ShortcutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShortcutPackage init() {
		if (isInited) return (ShortcutPackage)EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI);

		// Obtain or create and register package
		ShortcutPackageImpl theShortcutPackage = (ShortcutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ShortcutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ShortcutPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		MessagesPackageImpl theMessagesPackage = (MessagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) instanceof MessagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI) : MessagesPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		CustomizationPackageImpl theCustomizationPackage = (CustomizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) instanceof CustomizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) : CustomizationPackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		TranslationPackageImpl theTranslationPackage = (TranslationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) instanceof TranslationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) : TranslationPackage.eINSTANCE);

		// Create package meta-data objects
		theShortcutPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theMessagesPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theCustomizationPackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theTranslationPackage.createPackageContents();

		// Initialize created meta-data
		theShortcutPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theMessagesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theCustomizationPackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theTranslationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShortcutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShortcutPackage.eNS_URI, theShortcutPackage);
		return theShortcutPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortcutFolder() {
		return shortcutFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortcutFolder_SubFolders() {
		return (EReference)shortcutFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortcutFolder_ParentFolder() {
		return (EReference)shortcutFolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortcutFolder_Shortcuts() {
		return (EReference)shortcutFolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortcutFolder_ParentDictionary() {
		return (EReference)shortcutFolderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShortcut() {
		return shortcutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortcut_ParentFolder() {
		return (EReference)shortcutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShortcut_Ref() {
		return (EReference)shortcutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShortcutFactory getShortcutFactory() {
		return (ShortcutFactory)getEFactoryInstance();
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
		shortcutFolderEClass = createEClass(SHORTCUT_FOLDER);
		createEReference(shortcutFolderEClass, SHORTCUT_FOLDER__SUB_FOLDERS);
		createEReference(shortcutFolderEClass, SHORTCUT_FOLDER__PARENT_FOLDER);
		createEReference(shortcutFolderEClass, SHORTCUT_FOLDER__SHORTCUTS);
		createEReference(shortcutFolderEClass, SHORTCUT_FOLDER__PARENT_DICTIONARY);

		shortcutEClass = createEClass(SHORTCUT);
		createEReference(shortcutEClass, SHORTCUT__PARENT_FOLDER);
		createEReference(shortcutEClass, SHORTCUT__REF);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		shortcutFolderEClass.getESuperTypes().add(theModelPackage.getNamedElement());
		shortcutEClass.getESuperTypes().add(theModelPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(shortcutFolderEClass, ShortcutFolder.class, "ShortcutFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortcutFolder_SubFolders(), this.getShortcutFolder(), this.getShortcutFolder_ParentFolder(), "subFolders", null, 0, -1, ShortcutFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortcutFolder_ParentFolder(), this.getShortcutFolder(), this.getShortcutFolder_SubFolders(), "parentFolder", null, 0, 1, ShortcutFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortcutFolder_Shortcuts(), this.getShortcut(), this.getShortcut_ParentFolder(), "shortcuts", null, 0, -1, ShortcutFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortcutFolder_ParentDictionary(), theModelPackage.getDictionary(), theModelPackage.getDictionary_Shortcuts(), "parentDictionary", null, 0, 1, ShortcutFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shortcutEClass, Shortcut.class, "Shortcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShortcut_ParentFolder(), this.getShortcutFolder(), this.getShortcutFolder_Shortcuts(), "parentFolder", null, 0, 1, Shortcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShortcut_Ref(), theModelPackage.getNamedElement(), null, "ref", null, 1, 1, Shortcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ShortcutPackageImpl
