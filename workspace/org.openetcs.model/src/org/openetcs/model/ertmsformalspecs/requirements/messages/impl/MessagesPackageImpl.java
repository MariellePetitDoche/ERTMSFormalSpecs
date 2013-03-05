/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.impl;

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
import org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType;
import org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType;
import org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Mask;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Match;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Media;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Message;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Value;
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
public class MessagesPackageImpl extends EPackageImpl implements MessagesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialOrReservedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matchRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meaningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eErtmsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolutionFormulaUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolutionFormulaValueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eMeaningTypeEEnum = null;

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
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MessagesPackageImpl() {
		super(eNS_URI, MessagesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MessagesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MessagesPackage init() {
		if (isInited) return (MessagesPackage)EPackage.Registry.INSTANCE.getEPackage(MessagesPackage.eNS_URI);

		// Obtain or create and register package
		MessagesPackageImpl theMessagesPackage = (MessagesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MessagesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MessagesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		RequirementsPackageImpl theRequirementsPackage = (RequirementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) instanceof RequirementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI) : RequirementsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);
		CustomizationPackageImpl theCustomizationPackage = (CustomizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) instanceof CustomizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomizationPackage.eNS_URI) : CustomizationPackage.eINSTANCE);
		BehaviourPackageImpl theBehaviourPackage = (BehaviourPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) instanceof BehaviourPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourPackage.eNS_URI) : BehaviourPackage.eINSTANCE);
		TestPackageImpl theTestPackage = (TestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) instanceof TestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI) : TestPackage.eINSTANCE);
		TranslationPackageImpl theTranslationPackage = (TranslationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) instanceof TranslationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TranslationPackage.eNS_URI) : TranslationPackage.eINSTANCE);
		ShortcutPackageImpl theShortcutPackage = (ShortcutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) instanceof ShortcutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ShortcutPackage.eNS_URI) : ShortcutPackage.eINSTANCE);

		// Create package meta-data objects
		theMessagesPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theRequirementsPackage.createPackageContents();
		theTypesPackage.createPackageContents();
		theCustomizationPackage.createPackageContents();
		theBehaviourPackage.createPackageContents();
		theTestPackage.createPackageContents();
		theTranslationPackage.createPackageContents();
		theShortcutPackage.createPackageContents();

		// Initialize created meta-data
		theMessagesPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theRequirementsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();
		theCustomizationPackage.initializePackageContents();
		theBehaviourPackage.initializePackageContents();
		theTestPackage.initializePackageContents();
		theTranslationPackage.initializePackageContents();
		theShortcutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMessagesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MessagesPackage.eNS_URI, theMessagesPackage);
		return theMessagesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeSpec() {
		return typeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_Id() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_ShortDescription() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_Description() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_Length() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_MinimumValue() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_MaximumValue() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_ResolutionFormula() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeSpec_ErtmsType() {
		return (EAttribute)typeSpecEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeSpec_Value() {
		return (EReference)typeSpecEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeSpec_ReferenceParagraph() {
		return (EReference)typeSpecEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeSpec_Version() {
		return (EReference)typeSpecEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharValue() {
		return charValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharValue_Encoding() {
		return (EAttribute)charValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeValue() {
		return typeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeValue_ResolutionFormula() {
		return (EReference)typeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeValue_SpecialOrReservedValues() {
		return (EReference)typeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionFormula() {
		return resolutionFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionFormula_Unit() {
		return (EAttribute)resolutionFormulaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionFormula_Value() {
		return (EAttribute)resolutionFormulaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialOrReservedValue() {
		return specialOrReservedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialOrReservedValue_Mask() {
		return (EReference)specialOrReservedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialOrReservedValue_Match() {
		return (EReference)specialOrReservedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialOrReservedValue_Meaning() {
		return (EReference)specialOrReservedValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialOrReservedValue_Value() {
		return (EReference)specialOrReservedValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleValue() {
		return singleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleValue_Units() {
		return (EAttribute)singleValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleValue_Value() {
		return (EAttribute)singleValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMask() {
		return maskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMask_Value() {
		return (EAttribute)maskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMatch() {
		return iMatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatch() {
		return matchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatch_Value() {
		return (EAttribute)matchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatchRange() {
		return matchRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchRange_Minimum() {
		return (EAttribute)matchRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatchRange_Maximum() {
		return (EAttribute)matchRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeaning() {
		return meaningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeaning_Type() {
		return (EAttribute)meaningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeaning_Value() {
		return (EAttribute)meaningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Description() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Variables() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Media() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Balise() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Loop() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Rbc() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Riu() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageVariable() {
		return messageVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageVariable_Name() {
		return (EAttribute)messageVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageVariable_Length() {
		return (EAttribute)messageVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageVariable_Comment() {
		return (EAttribute)messageVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageVariable_SubVariables() {
		return (EReference)messageVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageVariable_ParentVariable() {
		return (EReference)messageVariableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEErtmsType() {
		return eErtmsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolutionFormulaUnit() {
		return resolutionFormulaUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolutionFormulaValue() {
		return resolutionFormulaValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEMeaningType() {
		return eMeaningTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesFactory getMessagesFactory() {
		return (MessagesFactory)getEFactoryInstance();
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
		typeSpecEClass = createEClass(TYPE_SPEC);
		createEAttribute(typeSpecEClass, TYPE_SPEC__ID);
		createEAttribute(typeSpecEClass, TYPE_SPEC__SHORT_DESCRIPTION);
		createEAttribute(typeSpecEClass, TYPE_SPEC__DESCRIPTION);
		createEAttribute(typeSpecEClass, TYPE_SPEC__LENGTH);
		createEAttribute(typeSpecEClass, TYPE_SPEC__MINIMUM_VALUE);
		createEAttribute(typeSpecEClass, TYPE_SPEC__MAXIMUM_VALUE);
		createEAttribute(typeSpecEClass, TYPE_SPEC__RESOLUTION_FORMULA);
		createEAttribute(typeSpecEClass, TYPE_SPEC__ERTMS_TYPE);
		createEReference(typeSpecEClass, TYPE_SPEC__VALUE);
		createEReference(typeSpecEClass, TYPE_SPEC__REFERENCE_PARAGRAPH);
		createEReference(typeSpecEClass, TYPE_SPEC__VERSION);

		valueEClass = createEClass(VALUE);

		charValueEClass = createEClass(CHAR_VALUE);
		createEAttribute(charValueEClass, CHAR_VALUE__ENCODING);

		typeValueEClass = createEClass(TYPE_VALUE);
		createEReference(typeValueEClass, TYPE_VALUE__RESOLUTION_FORMULA);
		createEReference(typeValueEClass, TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES);

		resolutionFormulaEClass = createEClass(RESOLUTION_FORMULA);
		createEAttribute(resolutionFormulaEClass, RESOLUTION_FORMULA__UNIT);
		createEAttribute(resolutionFormulaEClass, RESOLUTION_FORMULA__VALUE);

		specialOrReservedValueEClass = createEClass(SPECIAL_OR_RESERVED_VALUE);
		createEReference(specialOrReservedValueEClass, SPECIAL_OR_RESERVED_VALUE__MASK);
		createEReference(specialOrReservedValueEClass, SPECIAL_OR_RESERVED_VALUE__MATCH);
		createEReference(specialOrReservedValueEClass, SPECIAL_OR_RESERVED_VALUE__MEANING);
		createEReference(specialOrReservedValueEClass, SPECIAL_OR_RESERVED_VALUE__VALUE);

		singleValueEClass = createEClass(SINGLE_VALUE);
		createEAttribute(singleValueEClass, SINGLE_VALUE__UNITS);
		createEAttribute(singleValueEClass, SINGLE_VALUE__VALUE);

		maskEClass = createEClass(MASK);
		createEAttribute(maskEClass, MASK__VALUE);

		iMatchEClass = createEClass(IMATCH);

		matchEClass = createEClass(MATCH);
		createEAttribute(matchEClass, MATCH__VALUE);

		matchRangeEClass = createEClass(MATCH_RANGE);
		createEAttribute(matchRangeEClass, MATCH_RANGE__MINIMUM);
		createEAttribute(matchRangeEClass, MATCH_RANGE__MAXIMUM);

		meaningEClass = createEClass(MEANING);
		createEAttribute(meaningEClass, MEANING__TYPE);
		createEAttribute(meaningEClass, MEANING__VALUE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__DESCRIPTION);
		createEReference(messageEClass, MESSAGE__VARIABLES);
		createEReference(messageEClass, MESSAGE__MEDIA);

		mediaEClass = createEClass(MEDIA);
		createEAttribute(mediaEClass, MEDIA__BALISE);
		createEAttribute(mediaEClass, MEDIA__LOOP);
		createEAttribute(mediaEClass, MEDIA__RBC);
		createEAttribute(mediaEClass, MEDIA__RIU);

		messageVariableEClass = createEClass(MESSAGE_VARIABLE);
		createEAttribute(messageVariableEClass, MESSAGE_VARIABLE__NAME);
		createEAttribute(messageVariableEClass, MESSAGE_VARIABLE__LENGTH);
		createEAttribute(messageVariableEClass, MESSAGE_VARIABLE__COMMENT);
		createEReference(messageVariableEClass, MESSAGE_VARIABLE__SUB_VARIABLES);
		createEReference(messageVariableEClass, MESSAGE_VARIABLE__PARENT_VARIABLE);

		// Create enums
		eErtmsTypeEEnum = createEEnum(EERTMS_TYPE);
		resolutionFormulaUnitEEnum = createEEnum(RESOLUTION_FORMULA_UNIT);
		resolutionFormulaValueEEnum = createEEnum(RESOLUTION_FORMULA_VALUE);
		eMeaningTypeEEnum = createEEnum(EMEANING_TYPE);
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
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeSpecEClass.getESuperTypes().add(theRequirementsPackage.getBaseLinedElement());
		charValueEClass.getESuperTypes().add(this.getValue());
		typeValueEClass.getESuperTypes().add(this.getValue());
		matchEClass.getESuperTypes().add(this.getIMatch());
		matchRangeEClass.getESuperTypes().add(this.getIMatch());
		meaningEClass.getESuperTypes().add(theRequirementsPackage.getBaseLinedElement());
		messageEClass.getESuperTypes().add(theRequirementsPackage.getBaseLinedElement());
		messageVariableEClass.getESuperTypes().add(theRequirementsPackage.getBaseLinedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(typeSpecEClass, TypeSpec.class, "TypeSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeSpec_Id(), ecorePackage.getEString(), "id", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_ShortDescription(), ecorePackage.getEString(), "shortDescription", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_Description(), ecorePackage.getEString(), "description", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_Length(), ecorePackage.getEInt(), "length", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_MinimumValue(), ecorePackage.getEString(), "minimumValue", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_MaximumValue(), ecorePackage.getEString(), "maximumValue", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_ResolutionFormula(), ecorePackage.getEString(), "resolutionFormula", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeSpec_ErtmsType(), this.getEErtmsType(), "ertmsType", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeSpec_Value(), this.getValue(), null, "value", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeSpec_ReferenceParagraph(), theRequirementsPackage.getParagraph(), null, "referenceParagraph", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeSpec_Version(), theModelPackage.getBaseLine(), null, "version", null, 0, 1, TypeSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(charValueEClass, CharValue.class, "CharValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharValue_Encoding(), ecorePackage.getEString(), "encoding", null, 0, 1, CharValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeValueEClass, TypeValue.class, "TypeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeValue_ResolutionFormula(), this.getResolutionFormula(), null, "resolutionFormula", null, 0, 1, TypeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeValue_SpecialOrReservedValues(), this.getSpecialOrReservedValue(), null, "specialOrReservedValues", null, 0, -1, TypeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resolutionFormulaEClass, ResolutionFormula.class, "ResolutionFormula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResolutionFormula_Unit(), this.getResolutionFormulaUnit(), "unit", null, 0, 1, ResolutionFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResolutionFormula_Value(), this.getResolutionFormulaValue(), "value", null, 0, 1, ResolutionFormula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialOrReservedValueEClass, SpecialOrReservedValue.class, "SpecialOrReservedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialOrReservedValue_Mask(), this.getMask(), null, "mask", null, 0, 1, SpecialOrReservedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialOrReservedValue_Match(), this.getIMatch(), null, "match", null, 0, 1, SpecialOrReservedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialOrReservedValue_Meaning(), this.getMeaning(), null, "meaning", null, 0, 1, SpecialOrReservedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialOrReservedValue_Value(), this.getSingleValue(), null, "value", null, 0, 1, SpecialOrReservedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleValueEClass, SingleValue.class, "SingleValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSingleValue_Units(), ecorePackage.getEString(), "units", null, 0, 1, SingleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleValue_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SingleValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(maskEClass, Mask.class, "Mask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMask_Value(), ecorePackage.getEString(), "value", null, 0, 1, Mask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iMatchEClass, IMatch.class, "IMatch", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(matchEClass, Match.class, "Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatch_Value(), ecorePackage.getEString(), "value", null, 0, 1, Match.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matchRangeEClass, MatchRange.class, "MatchRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatchRange_Minimum(), ecorePackage.getEString(), "minimum", null, 0, 1, MatchRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatchRange_Maximum(), ecorePackage.getEString(), "maximum", null, 0, 1, MatchRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meaningEClass, Meaning.class, "Meaning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeaning_Type(), this.getEMeaningType(), "type", null, 0, 1, Meaning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeaning_Value(), ecorePackage.getEString(), "value", null, 0, 1, Meaning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Description(), ecorePackage.getEString(), "description", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Variables(), this.getMessageVariable(), null, "variables", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Media(), this.getMedia(), null, "media", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedia_Balise(), ecorePackage.getEBoolean(), "balise", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Loop(), ecorePackage.getEBoolean(), "loop", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Rbc(), ecorePackage.getEBoolean(), "rbc", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Riu(), ecorePackage.getEBoolean(), "riu", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageVariableEClass, MessageVariable.class, "MessageVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, MessageVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageVariable_Length(), ecorePackage.getEString(), "length", null, 0, 1, MessageVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessageVariable_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, MessageVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageVariable_SubVariables(), this.getMessageVariable(), this.getMessageVariable_ParentVariable(), "subVariables", null, 0, -1, MessageVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessageVariable_ParentVariable(), this.getMessageVariable(), this.getMessageVariable_SubVariables(), "parentVariable", null, 0, 1, MessageVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eErtmsTypeEEnum, EErtmsType.class, "EErtmsType");
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.NONE);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.DISTANCE);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.GRADIENT);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.LENGTH);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.MISCELLANEOUS);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.CLASS_NUMBER);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.IDENTITY_NUMBER);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.QUALIFIER);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.TIME_OR_DATE);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.SPEED);
		addEEnumLiteral(eErtmsTypeEEnum, EErtmsType.TEXT);

		initEEnum(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.class, "ResolutionFormulaUnit");
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.NONE);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.QSCALE);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.PERCENT);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.BYTE);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.BIT);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.TEXT_STRING_ELEMENT);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.A);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.S);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.M);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.MS);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.MS2);
		addEEnumLiteral(resolutionFormulaUnitEEnum, ResolutionFormulaUnit.KM_H);

		initEEnum(resolutionFormulaValueEEnum, ResolutionFormulaValue.class, "ResolutionFormulaValue");
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.NONE);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.X0_02);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.X0_05);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.X1);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.X5);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.X10);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.INTEGERS);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.NUMBER);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.NUMBERS);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.BINARY_CODED_DECIMAL);
		addEEnumLiteral(resolutionFormulaValueEEnum, ResolutionFormulaValue.BIT_SET);

		initEEnum(eMeaningTypeEEnum, EMeaningType.class, "EMeaningType");
		addEEnumLiteral(eMeaningTypeEEnum, EMeaningType.INVALID);
		addEEnumLiteral(eMeaningTypeEEnum, EMeaningType.ENUM);
		addEEnumLiteral(eMeaningTypeEEnum, EMeaningType.UNKNOWN);
		addEEnumLiteral(eMeaningTypeEEnum, EMeaningType.INFINITE);
	}

} //MessagesPackageImpl
