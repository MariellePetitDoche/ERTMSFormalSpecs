/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

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
 * @see org.openetcs.model.ertmsformalspecs.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ertmsformalspecs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/ertmsformalspecs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.ertmsformalspecs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.NamedElement
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl <em>Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getDictionary()
	 * @generated
	 */
	int DICTIONARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__SPECIFICATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__NAMESPACES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__TESTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rule Disablings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__RULE_DISABLINGS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__TRANSLATIONS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Shortcuts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY__SHORTCUTS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTIONARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.CommentedElementImpl <em>Commented Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.CommentedElementImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getCommentedElement()
	 * @generated
	 */
	int COMMENTED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTED_ELEMENT__COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Commented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.BaselinesImpl <em>Baselines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.BaselinesImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getBaselines()
	 * @generated
	 */
	int BASELINES = 3;

	/**
	 * The feature id for the '<em><b>Available Baselines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINES__AVAILABLE_BASELINES = 0;

	/**
	 * The number of structural features of the '<em>Baselines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.BaseLineImpl <em>Base Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.BaseLineImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getBaseLine()
	 * @generated
	 */
	int BASE_LINE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_LINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Base Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_LINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PARENT_DICTIONARY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SUB_NAMESPACES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PARENT_NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__PROCEDURES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__RULES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl <em>Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getProcedure()
	 * @generated
	 */
	int PROCEDURE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__IMPLEMENTED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__VERIFIED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__NEEDS_REQUIREMENT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__STATE_MACHINE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__RULES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Structure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARENT_STRUCTURE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Parent Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE__PARENT_NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.ParameterImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Procedure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARENT_PROCEDURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARENT_FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.ReferencesParagraphImpl <em>References Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.ReferencesParagraphImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getReferencesParagraph()
	 * @generated
	 */
	int REFERENCES_PARAGRAPH = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_PARAGRAPH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_PARAGRAPH__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_PARAGRAPH__REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>References Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_PARAGRAPH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.ReqRefImpl <em>Req Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.ReqRefImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getReqRef()
	 * @generated
	 */
	int REQ_REF = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_REF__COMMENT = COMMENTED_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_REF__PARAGRAPH = COMMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Req Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_REF_FEATURE_COUNT = COMMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl <em>Req Related</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getReqRelated()
	 * @generated
	 */
	int REQ_RELATED = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_RELATED__NAME = REFERENCES_PARAGRAPH__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_RELATED__COMMENT = REFERENCES_PARAGRAPH__COMMENT;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_RELATED__REQUIREMENTS = REFERENCES_PARAGRAPH__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_RELATED__IMPLEMENTED = REFERENCES_PARAGRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_RELATED__VERIFIED = REFERENCES_PARAGRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_RELATED__NEEDS_REQUIREMENT = REFERENCES_PARAGRAPH_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Req Related</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQ_RELATED_FEATURE_COUNT = REFERENCES_PARAGRAPH_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = TypesPackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__COMMENT = TypesPackage.TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REQUIREMENTS = TypesPackage.TYPE__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__IMPLEMENTED = TypesPackage.TYPE__IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__VERIFIED = TypesPackage.TYPE__VERIFIED;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NEEDS_REQUIREMENT = TypesPackage.TYPE__NEEDS_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__DEFAULT_VALUE = TypesPackage.TYPE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Parent Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PARENT_NAMESPACE = TypesPackage.TYPE__PARENT_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__INITIAL_STATE = TypesPackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__STATES = TypesPackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__RULES = TypesPackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PARENT_STATE = TypesPackage.TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Procedure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__PARENT_PROCEDURE = TypesPackage.TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = TypesPackage.TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.StateImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getState()
	 * @generated
	 */
	int STATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = REQ_RELATED__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__COMMENT = REQ_RELATED__COMMENT;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REQUIREMENTS = REQ_RELATED__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IMPLEMENTED = REQ_RELATED__IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VERIFIED = REQ_RELATED__VERIFIED;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NEEDS_REQUIREMENT = REQ_RELATED__NEEDS_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Parent State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT_STATE_MACHINE = REQ_RELATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STATE_MACHINE = REQ_RELATED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__WIDTH = REQ_RELATED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HEIGHT = REQ_RELATED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__X = REQ_RELATED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__Y = REQ_RELATED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = REQ_RELATED_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.DefaultValueElementImpl <em>Default Value Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.DefaultValueElementImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getDefaultValueElement()
	 * @generated
	 */
	int DEFAULT_VALUE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_ELEMENT__DEFAULT_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Default Value Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.VariableModeElementImpl <em>Variable Mode Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.VariableModeElementImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getVariableModeElement()
	 * @generated
	 */
	int VARIABLE_MODE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Variable Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODE_ELEMENT__VARIABLE_MODE = 0;

	/**
	 * The number of structural features of the '<em>Variable Mode Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_MODE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.VariableImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__COMMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IMPLEMENTED = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VERIFIED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NEEDS_REQUIREMENT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_NAME = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variable Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE_MODE = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PARENT_NAMESPACE = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Sub Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SUB_VARIABLES = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parent Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PARENT_VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.impl.FunctionalBlocksImpl <em>Functional Blocks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.impl.FunctionalBlocksImpl
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getFunctionalBlocks()
	 * @generated
	 */
	int FUNCTIONAL_BLOCKS = 16;

	/**
	 * The feature id for the '<em><b>Available Functional Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS = 0;

	/**
	 * The number of structural features of the '<em>Functional Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_BLOCKS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.VariableMode <em>Variable Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.VariableMode
	 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getVariableMode()
	 * @generated
	 */
	int VARIABLE_MODE = 17;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.Dictionary <em>Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dictionary</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary
	 * @generated
	 */
	EClass getDictionary();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getSpecification()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Specification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getNamespaces()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Namespaces();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getTests()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Tests();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getRuleDisablings <em>Rule Disablings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule Disablings</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getRuleDisablings()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_RuleDisablings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translations</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getTranslations()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Translations();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getShortcuts <em>Shortcuts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shortcuts</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getShortcuts()
	 * @see #getDictionary()
	 * @generated
	 */
	EReference getDictionary_Shortcuts();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.CommentedElement <em>Commented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commented Element</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.CommentedElement
	 * @generated
	 */
	EClass getCommentedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.CommentedElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.CommentedElement#getComment()
	 * @see #getCommentedElement()
	 * @generated
	 */
	EAttribute getCommentedElement_Comment();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.Baselines <em>Baselines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baselines</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Baselines
	 * @generated
	 */
	EClass getBaselines();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Baselines#getAvailableBaselines <em>Available Baselines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Baselines</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Baselines#getAvailableBaselines()
	 * @see #getBaselines()
	 * @generated
	 */
	EReference getBaselines_AvailableBaselines();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.BaseLine <em>Base Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Line</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.BaseLine
	 * @generated
	 */
	EClass getBaseLine();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Dictionary</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getParentDictionary()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ParentDictionary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Namespace#getSubNamespaces <em>Sub Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Namespaces</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getSubNamespaces()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_SubNamespaces();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.Namespace#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Namespace</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getParentNamespace()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_ParentNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Namespace#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedures</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getProcedures()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Procedures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Namespace#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getTypes()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Namespace#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getVariables()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Namespace#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Namespace#getRules()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_Rules();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.Procedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Procedure
	 * @generated
	 */
	EClass getProcedure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getParameters()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.Procedure#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Machine</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getStateMachine()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_StateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Procedure#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getRules()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_Rules();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentStructure <em>Parent Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Structure</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getParentStructure()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ParentStructure();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.Procedure#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Namespace</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Procedure#getParentNamespace()
	 * @see #getProcedure()
	 * @generated
	 */
	EReference getProcedure_ParentNamespace();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentProcedure <em>Parent Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Procedure</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Parameter#getParentProcedure()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParentProcedure();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.Parameter#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Parameter#getTypeName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TypeName();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.Parameter#getParentFunction <em>Parent Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Function</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Parameter#getParentFunction()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_ParentFunction();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.ReferencesParagraph <em>References Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References Paragraph</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReferencesParagraph
	 * @generated
	 */
	EClass getReferencesParagraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.ReferencesParagraph#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReferencesParagraph#getRequirements()
	 * @see #getReferencesParagraph()
	 * @generated
	 */
	EReference getReferencesParagraph_Requirements();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.ReqRef <em>Req Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Ref</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReqRef
	 * @generated
	 */
	EClass getReqRef();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.ReqRef#getParagraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Paragraph</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReqRef#getParagraph()
	 * @see #getReqRef()
	 * @generated
	 */
	EReference getReqRef_Paragraph();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.ReqRelated <em>Req Related</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Req Related</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReqRelated
	 * @generated
	 */
	EClass getReqRelated();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isImplemented <em>Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implemented</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReqRelated#isImplemented()
	 * @see #getReqRelated()
	 * @generated
	 */
	EAttribute getReqRelated_Implemented();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isVerified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verified</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReqRelated#isVerified()
	 * @see #getReqRelated()
	 * @generated
	 */
	EAttribute getReqRelated_Verified();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.ReqRelated#isNeedsRequirement <em>Needs Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Requirement</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.ReqRelated#isNeedsRequirement()
	 * @see #getReqRelated()
	 * @generated
	 */
	EAttribute getReqRelated_NeedsRequirement();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial State</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getInitialState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EAttribute getStateMachine_InitialState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getStates()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_States();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getRules()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Rules();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getParentState()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ParentState();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentProcedure <em>Parent Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Procedure</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getParentProcedure()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_ParentProcedure();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.State#getParentStateMachine <em>Parent State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State Machine</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.State#getParentStateMachine()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ParentStateMachine();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.State#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>State Machine</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.State#getStateMachine()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StateMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.State#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.State#getWidth()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.State#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.State#getHeight()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.State#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.State#getX()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_X();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.State#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.State#getY()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Y();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.DefaultValueElement <em>Default Value Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value Element</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.DefaultValueElement
	 * @generated
	 */
	EClass getDefaultValueElement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.DefaultValueElement#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.DefaultValueElement#getDefaultValue()
	 * @see #getDefaultValueElement()
	 * @generated
	 */
	EAttribute getDefaultValueElement_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.VariableModeElement <em>Variable Mode Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Mode Element</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.VariableModeElement
	 * @generated
	 */
	EClass getVariableModeElement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.VariableModeElement#getVariableMode <em>Variable Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Mode</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.VariableModeElement#getVariableMode()
	 * @see #getVariableModeElement()
	 * @generated
	 */
	EAttribute getVariableModeElement_VariableMode();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.Variable#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Namespace</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Variable#getParentNamespace()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ParentNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.Variable#getSubVariables <em>Sub Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Variables</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Variable#getSubVariables()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_SubVariables();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.Variable#getParentVariable <em>Parent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Variable</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.Variable#getParentVariable()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_ParentVariable();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.FunctionalBlocks <em>Functional Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Blocks</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.FunctionalBlocks
	 * @generated
	 */
	EClass getFunctionalBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.FunctionalBlocks#getAvailableFunctionalBlocks <em>Available Functional Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Functional Blocks</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.FunctionalBlocks#getAvailableFunctionalBlocks()
	 * @see #getFunctionalBlocks()
	 * @generated
	 */
	EReference getFunctionalBlocks_AvailableFunctionalBlocks();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.VariableMode <em>Variable Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Mode</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.VariableMode
	 * @generated
	 */
	EEnum getVariableMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl <em>Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.DictionaryImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getDictionary()
		 * @generated
		 */
		EClass DICTIONARY = eINSTANCE.getDictionary();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__SPECIFICATION = eINSTANCE.getDictionary_Specification();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__NAMESPACES = eINSTANCE.getDictionary_Namespaces();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__TESTS = eINSTANCE.getDictionary_Tests();

		/**
		 * The meta object literal for the '<em><b>Rule Disablings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__RULE_DISABLINGS = eINSTANCE.getDictionary_RuleDisablings();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__TRANSLATIONS = eINSTANCE.getDictionary_Translations();

		/**
		 * The meta object literal for the '<em><b>Shortcuts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTIONARY__SHORTCUTS = eINSTANCE.getDictionary_Shortcuts();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.NamedElement
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.CommentedElementImpl <em>Commented Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.CommentedElementImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getCommentedElement()
		 * @generated
		 */
		EClass COMMENTED_ELEMENT = eINSTANCE.getCommentedElement();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTED_ELEMENT__COMMENT = eINSTANCE.getCommentedElement_Comment();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.BaselinesImpl <em>Baselines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.BaselinesImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getBaselines()
		 * @generated
		 */
		EClass BASELINES = eINSTANCE.getBaselines();

		/**
		 * The meta object literal for the '<em><b>Available Baselines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASELINES__AVAILABLE_BASELINES = eINSTANCE.getBaselines_AvailableBaselines();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.BaseLineImpl <em>Base Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.BaseLineImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getBaseLine()
		 * @generated
		 */
		EClass BASE_LINE = eINSTANCE.getBaseLine();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Parent Dictionary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PARENT_DICTIONARY = eINSTANCE.getNamespace_ParentDictionary();

		/**
		 * The meta object literal for the '<em><b>Sub Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__SUB_NAMESPACES = eINSTANCE.getNamespace_SubNamespaces();

		/**
		 * The meta object literal for the '<em><b>Parent Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PARENT_NAMESPACE = eINSTANCE.getNamespace_ParentNamespace();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__PROCEDURES = eINSTANCE.getNamespace_Procedures();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__TYPES = eINSTANCE.getNamespace_Types();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__VARIABLES = eINSTANCE.getNamespace_Variables();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__RULES = eINSTANCE.getNamespace_Rules();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl <em>Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getProcedure()
		 * @generated
		 */
		EClass PROCEDURE = eINSTANCE.getProcedure();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__PARAMETERS = eINSTANCE.getProcedure_Parameters();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__STATE_MACHINE = eINSTANCE.getProcedure_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__RULES = eINSTANCE.getProcedure_Rules();

		/**
		 * The meta object literal for the '<em><b>Parent Structure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__PARENT_STRUCTURE = eINSTANCE.getProcedure_ParentStructure();

		/**
		 * The meta object literal for the '<em><b>Parent Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCEDURE__PARENT_NAMESPACE = eINSTANCE.getProcedure_ParentNamespace();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.ParameterImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parent Procedure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARENT_PROCEDURE = eINSTANCE.getParameter_ParentProcedure();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE_NAME = eINSTANCE.getParameter_TypeName();

		/**
		 * The meta object literal for the '<em><b>Parent Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__PARENT_FUNCTION = eINSTANCE.getParameter_ParentFunction();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.ReferencesParagraphImpl <em>References Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.ReferencesParagraphImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getReferencesParagraph()
		 * @generated
		 */
		EClass REFERENCES_PARAGRAPH = eINSTANCE.getReferencesParagraph();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_PARAGRAPH__REQUIREMENTS = eINSTANCE.getReferencesParagraph_Requirements();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.ReqRefImpl <em>Req Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.ReqRefImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getReqRef()
		 * @generated
		 */
		EClass REQ_REF = eINSTANCE.getReqRef();

		/**
		 * The meta object literal for the '<em><b>Paragraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQ_REF__PARAGRAPH = eINSTANCE.getReqRef_Paragraph();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl <em>Req Related</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getReqRelated()
		 * @generated
		 */
		EClass REQ_RELATED = eINSTANCE.getReqRelated();

		/**
		 * The meta object literal for the '<em><b>Implemented</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_RELATED__IMPLEMENTED = eINSTANCE.getReqRelated_Implemented();

		/**
		 * The meta object literal for the '<em><b>Verified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_RELATED__VERIFIED = eINSTANCE.getReqRelated_Verified();

		/**
		 * The meta object literal for the '<em><b>Needs Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQ_RELATED__NEEDS_REQUIREMENT = eINSTANCE.getReqRelated_NeedsRequirement();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_MACHINE__INITIAL_STATE = eINSTANCE.getStateMachine_InitialState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__STATES = eINSTANCE.getStateMachine_States();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__RULES = eINSTANCE.getStateMachine_Rules();

		/**
		 * The meta object literal for the '<em><b>Parent State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__PARENT_STATE = eINSTANCE.getStateMachine_ParentState();

		/**
		 * The meta object literal for the '<em><b>Parent Procedure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__PARENT_PROCEDURE = eINSTANCE.getStateMachine_ParentProcedure();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.StateImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Parent State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__PARENT_STATE_MACHINE = eINSTANCE.getState_ParentStateMachine();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STATE_MACHINE = eINSTANCE.getState_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__WIDTH = eINSTANCE.getState_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__HEIGHT = eINSTANCE.getState_Height();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__X = eINSTANCE.getState_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__Y = eINSTANCE.getState_Y();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.DefaultValueElementImpl <em>Default Value Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.DefaultValueElementImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getDefaultValueElement()
		 * @generated
		 */
		EClass DEFAULT_VALUE_ELEMENT = eINSTANCE.getDefaultValueElement();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_VALUE_ELEMENT__DEFAULT_VALUE = eINSTANCE.getDefaultValueElement_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.VariableModeElementImpl <em>Variable Mode Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.VariableModeElementImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getVariableModeElement()
		 * @generated
		 */
		EClass VARIABLE_MODE_ELEMENT = eINSTANCE.getVariableModeElement();

		/**
		 * The meta object literal for the '<em><b>Variable Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_MODE_ELEMENT__VARIABLE_MODE = eINSTANCE.getVariableModeElement_VariableMode();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.VariableImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Parent Namespace</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PARENT_NAMESPACE = eINSTANCE.getVariable_ParentNamespace();

		/**
		 * The meta object literal for the '<em><b>Sub Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__SUB_VARIABLES = eINSTANCE.getVariable_SubVariables();

		/**
		 * The meta object literal for the '<em><b>Parent Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PARENT_VARIABLE = eINSTANCE.getVariable_ParentVariable();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.impl.FunctionalBlocksImpl <em>Functional Blocks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.impl.FunctionalBlocksImpl
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getFunctionalBlocks()
		 * @generated
		 */
		EClass FUNCTIONAL_BLOCKS = eINSTANCE.getFunctionalBlocks();

		/**
		 * The meta object literal for the '<em><b>Available Functional Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_BLOCKS__AVAILABLE_FUNCTIONAL_BLOCKS = eINSTANCE.getFunctionalBlocks_AvailableFunctionalBlocks();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.VariableMode <em>Variable Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.VariableMode
		 * @see org.openetcs.model.ertmsformalspecs.impl.ModelPackageImpl#getVariableMode()
		 * @generated
		 */
		EEnum VARIABLE_MODE = eINSTANCE.getVariableMode();

	}

} //ModelPackage
