/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

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
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface RequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/ertmsformalspecs/requirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.ertmsformalspecs.requirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RequirementsPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__BASELINE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PARAGRAPHS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PARENT_DICTIONARY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement <em>Base Lined Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getBaseLinedElement()
	 * @generated
	 */
	int BASE_LINED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_LINED_ELEMENT__BASELINE = 0;

	/**
	 * The number of structural features of the '<em>Base Lined Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_LINED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.FunctionalBlockImpl <em>Functional Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.FunctionalBlockImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getFunctionalBlock()
	 * @generated
	 */
	int FUNCTIONAL_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_BLOCK__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Functional Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_BLOCK_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl <em>Process Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getProcessInformation()
	 * @generated
	 */
	int PROCESS_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFORMATION__COMMENT = ModelPackage.COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Reviewed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFORMATION__REVIEWED = ModelPackage.COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFORMATION__IMPLEMENTATION_STATUS = ModelPackage.COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>More Info Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFORMATION__MORE_INFO_REQUIRED = ModelPackage.COMMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spec Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFORMATION__SPEC_ISSUE = ModelPackage.COMMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Process Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_INFORMATION_FEATURE_COUNT = ModelPackage.COMMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.ScopeImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 4;

	/**
	 * The feature id for the '<em><b>On Board Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ON_BOARD_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Track Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TRACK_SIDE = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__OPTIONAL = 2;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 5;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__BASELINE = BASE_LINED_ELEMENT__BASELINE;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__COMMENT = BASE_LINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__NAME = BASE_LINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__REQUIREMENTS = BASE_LINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TYPE = BASE_LINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__SCOPE = BASE_LINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Process Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__PROCESS_INFO = BASE_LINED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__ID = BASE_LINED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT = BASE_LINED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Functional Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__FUNCTIONAL_BLOCK = BASE_LINED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parent Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__PARENT_SPECIFICATION = BASE_LINED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Sub Paragraphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__SUB_PARAGRAPHS = BASE_LINED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parent Paragraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__PARENT_PARAGRAPH = BASE_LINED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type Specs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TYPE_SPECS = BASE_LINED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__MESSAGE = BASE_LINED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__VERSION = BASE_LINED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = BASE_LINED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus <em>EImplementation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getEImplementationStatus()
	 * @generated
	 */
	int EIMPLEMENTATION_STATUS = 6;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.EParagraphType <em>EParagraph Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EParagraphType
	 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getEParagraphType()
	 * @generated
	 */
	int EPARAGRAPH_TYPE = 7;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.requirements.Specification#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paragraphs</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Specification#getParagraphs()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Paragraphs();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Specification#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Dictionary</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Specification#getParentDictionary()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_ParentDictionary();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement <em>Base Lined Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Lined Element</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement
	 * @generated
	 */
	EClass getBaseLinedElement();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baseline</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement#getBaseline()
	 * @see #getBaseLinedElement()
	 * @generated
	 */
	EReference getBaseLinedElement_Baseline();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock <em>Functional Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Block</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.FunctionalBlock
	 * @generated
	 */
	EClass getFunctionalBlock();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation <em>Process Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Information</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation
	 * @generated
	 */
	EClass getProcessInformation();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isReviewed <em>Reviewed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reviewed</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isReviewed()
	 * @see #getProcessInformation()
	 * @generated
	 */
	EAttribute getProcessInformation_Reviewed();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#getImplementationStatus <em>Implementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Status</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#getImplementationStatus()
	 * @see #getProcessInformation()
	 * @generated
	 */
	EAttribute getProcessInformation_ImplementationStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isMoreInfoRequired <em>More Info Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>More Info Required</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isMoreInfoRequired()
	 * @see #getProcessInformation()
	 * @generated
	 */
	EAttribute getProcessInformation_MoreInfoRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isSpecIssue <em>Spec Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec Issue</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.ProcessInformation#isSpecIssue()
	 * @see #getProcessInformation()
	 * @generated
	 */
	EAttribute getProcessInformation_SpecIssue();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isOnBoardUnit <em>On Board Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Board Unit</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Scope#isOnBoardUnit()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_OnBoardUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isTrackSide <em>Track Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Side</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Scope#isTrackSide()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_TrackSide();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.Scope#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Scope#isOptional()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Optional();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getType()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getScope()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getProcessInfo <em>Process Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Info</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getProcessInfo()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_ProcessInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getId()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getText()
	 * @see #getParagraph()
	 * @generated
	 */
	EAttribute getParagraph_Text();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getFunctionalBlock <em>Functional Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Functional Block</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getFunctionalBlock()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_FunctionalBlock();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentSpecification <em>Parent Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Specification</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentSpecification()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_ParentSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getSubParagraphs <em>Sub Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Paragraphs</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getSubParagraphs()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_SubParagraphs();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentParagraph <em>Parent Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Paragraph</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentParagraph()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_ParentParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getTypeSpecs <em>Type Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Specs</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getTypeSpecs()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_TypeSpecs();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getMessage()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Message();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getVersion()
	 * @see #getParagraph()
	 * @generated
	 */
	EReference getParagraph_Version();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus <em>EImplementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EImplementation Status</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus
	 * @generated
	 */
	EEnum getEImplementationStatus();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.requirements.EParagraphType <em>EParagraph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EParagraph Type</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EParagraphType
	 * @generated
	 */
	EEnum getEParagraphType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RequirementsFactory getRequirementsFactory();

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
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.SpecificationImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PARAGRAPHS = eINSTANCE.getSpecification_Paragraphs();

		/**
		 * The meta object literal for the '<em><b>Parent Dictionary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PARENT_DICTIONARY = eINSTANCE.getSpecification_ParentDictionary();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement <em>Base Lined Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getBaseLinedElement()
		 * @generated
		 */
		EClass BASE_LINED_ELEMENT = eINSTANCE.getBaseLinedElement();

		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_LINED_ELEMENT__BASELINE = eINSTANCE.getBaseLinedElement_Baseline();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.FunctionalBlockImpl <em>Functional Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.FunctionalBlockImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getFunctionalBlock()
		 * @generated
		 */
		EClass FUNCTIONAL_BLOCK = eINSTANCE.getFunctionalBlock();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl <em>Process Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.ProcessInformationImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getProcessInformation()
		 * @generated
		 */
		EClass PROCESS_INFORMATION = eINSTANCE.getProcessInformation();

		/**
		 * The meta object literal for the '<em><b>Reviewed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFORMATION__REVIEWED = eINSTANCE.getProcessInformation_Reviewed();

		/**
		 * The meta object literal for the '<em><b>Implementation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFORMATION__IMPLEMENTATION_STATUS = eINSTANCE.getProcessInformation_ImplementationStatus();

		/**
		 * The meta object literal for the '<em><b>More Info Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFORMATION__MORE_INFO_REQUIRED = eINSTANCE.getProcessInformation_MoreInfoRequired();

		/**
		 * The meta object literal for the '<em><b>Spec Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_INFORMATION__SPEC_ISSUE = eINSTANCE.getProcessInformation_SpecIssue();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.ScopeImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>On Board Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__ON_BOARD_UNIT = eINSTANCE.getScope_OnBoardUnit();

		/**
		 * The meta object literal for the '<em><b>Track Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__TRACK_SIDE = eINSTANCE.getScope_TrackSide();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__OPTIONAL = eINSTANCE.getScope_Optional();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.ParagraphImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TYPE = eINSTANCE.getParagraph_Type();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__SCOPE = eINSTANCE.getParagraph_Scope();

		/**
		 * The meta object literal for the '<em><b>Process Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__PROCESS_INFO = eINSTANCE.getParagraph_ProcessInfo();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__ID = eINSTANCE.getParagraph_Id();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH__TEXT = eINSTANCE.getParagraph_Text();

		/**
		 * The meta object literal for the '<em><b>Functional Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__FUNCTIONAL_BLOCK = eINSTANCE.getParagraph_FunctionalBlock();

		/**
		 * The meta object literal for the '<em><b>Parent Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__PARENT_SPECIFICATION = eINSTANCE.getParagraph_ParentSpecification();

		/**
		 * The meta object literal for the '<em><b>Sub Paragraphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__SUB_PARAGRAPHS = eINSTANCE.getParagraph_SubParagraphs();

		/**
		 * The meta object literal for the '<em><b>Parent Paragraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__PARENT_PARAGRAPH = eINSTANCE.getParagraph_ParentParagraph();

		/**
		 * The meta object literal for the '<em><b>Type Specs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__TYPE_SPECS = eINSTANCE.getParagraph_TypeSpecs();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__MESSAGE = eINSTANCE.getParagraph_Message();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAGRAPH__VERSION = eINSTANCE.getParagraph_Version();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus <em>EImplementation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getEImplementationStatus()
		 * @generated
		 */
		EEnum EIMPLEMENTATION_STATUS = eINSTANCE.getEImplementationStatus();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.EParagraphType <em>EParagraph Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.EParagraphType
		 * @see org.openetcs.model.ertmsformalspecs.requirements.impl.RequirementsPackageImpl#getEParagraphType()
		 * @generated
		 */
		EEnum EPARAGRAPH_TYPE = eINSTANCE.getEParagraphType();

	}

} //RequirementsPackage
