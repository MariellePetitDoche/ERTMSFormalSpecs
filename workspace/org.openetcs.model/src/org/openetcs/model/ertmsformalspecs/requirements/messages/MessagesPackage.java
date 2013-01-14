/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage;

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
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory
 * @model kind="package"
 * @generated
 */
public interface MessagesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "messages";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/model/requirements/messages";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.model.requirements.messages";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MessagesPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl <em>Type Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getTypeSpec()
	 * @generated
	 */
	int TYPE_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__BASELINE = RequirementsPackage.BASE_LINED_ELEMENT__BASELINE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__ID = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__SHORT_DESCRIPTION = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__DESCRIPTION = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__LENGTH = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__MINIMUM_VALUE = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__MAXIMUM_VALUE = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resolution Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__RESOLUTION_FORMULA = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ertms Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__ERTMS_TYPE = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__VALUE = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reference Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__REFERENCE_PARAGRAPH = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC__VERSION = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Type Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SPEC_FEATURE_COUNT = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Value
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.CharValueImpl <em>Char Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.CharValueImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getCharValue()
	 * @generated
	 */
	int CHAR_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_VALUE__ENCODING = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Char Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeValueImpl <em>Type Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeValueImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getTypeValue()
	 * @generated
	 */
	int TYPE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Resolution Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VALUE__RESOLUTION_FORMULA = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Special Or Reserved Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.ResolutionFormulaImpl <em>Resolution Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.ResolutionFormulaImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getResolutionFormula()
	 * @generated
	 */
	int RESOLUTION_FORMULA = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FORMULA__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FORMULA__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Resolution Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_FORMULA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl <em>Special Or Reserved Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getSpecialOrReservedValue()
	 * @generated
	 */
	int SPECIAL_OR_RESERVED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_OR_RESERVED_VALUE__MASK = 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_OR_RESERVED_VALUE__MATCH = 1;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_OR_RESERVED_VALUE__MEANING = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_OR_RESERVED_VALUE__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Special Or Reserved Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_OR_RESERVED_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SingleValueImpl <em>Single Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SingleValueImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getSingleValue()
	 * @generated
	 */
	int SINGLE_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__UNITS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Single Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MaskImpl <em>Mask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MaskImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMask()
	 * @generated
	 */
	int MASK = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Mask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch <em>IMatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getIMatch()
	 * @generated
	 */
	int IMATCH = 8;

	/**
	 * The number of structural features of the '<em>IMatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMATCH_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__VALUE = IMATCH_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = IMATCH_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchRangeImpl <em>Match Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchRangeImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMatchRange()
	 * @generated
	 */
	int MATCH_RANGE = 10;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_RANGE__MINIMUM = IMATCH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_RANGE__MAXIMUM = IMATCH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Match Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_RANGE_FEATURE_COUNT = IMATCH_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MeaningImpl <em>Meaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MeaningImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMeaning()
	 * @generated
	 */
	int MEANING = 11;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__BASELINE = RequirementsPackage.BASE_LINED_ELEMENT__BASELINE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__TYPE = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__VALUE = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING_FEATURE_COUNT = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 12;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BASELINE = RequirementsPackage.BASE_LINED_ELEMENT__BASELINE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__VARIABLES = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__MEDIA = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 13;

	/**
	 * The feature id for the '<em><b>Balise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__BALISE = 0;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__LOOP = 1;

	/**
	 * The feature id for the '<em><b>Rbc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__RBC = 2;

	/**
	 * The feature id for the '<em><b>Riu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__RIU = 3;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl <em>Message Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMessageVariable()
	 * @generated
	 */
	int MESSAGE_VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VARIABLE__BASELINE = RequirementsPackage.BASE_LINED_ELEMENT__BASELINE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VARIABLE__NAME = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VARIABLE__LENGTH = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VARIABLE__COMMENT = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VARIABLE__SUB_VARIABLES = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Variable</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VARIABLE__PARENT_VARIABLE = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Message Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_VARIABLE_FEATURE_COUNT = RequirementsPackage.BASE_LINED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType <em>EErtms Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getEErtmsType()
	 * @generated
	 */
	int EERTMS_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit <em>Resolution Formula Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getResolutionFormulaUnit()
	 * @generated
	 */
	int RESOLUTION_FORMULA_UNIT = 16;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue <em>Resolution Formula Value</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getResolutionFormulaValue()
	 * @generated
	 */
	int RESOLUTION_FORMULA_VALUE = 17;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType <em>EMeaning Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getEMeaningType()
	 * @generated
	 */
	int EMEANING_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Spec</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec
	 * @generated
	 */
	EClass getTypeSpec();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getId()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getShortDescription()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getDescription()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getLength()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMinimumValue <em>Minimum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMinimumValue()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_MinimumValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMaximumValue <em>Maximum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMaximumValue()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_MaximumValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getResolutionFormula <em>Resolution Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution Formula</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getResolutionFormula()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_ResolutionFormula();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getErtmsType <em>Ertms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ertms Type</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getErtmsType()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EAttribute getTypeSpec_ErtmsType();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getValue()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EReference getTypeSpec_Value();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getReferenceParagraph <em>Reference Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Paragraph</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getReferenceParagraph()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EReference getTypeSpec_ReferenceParagraph();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Version</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getVersion()
	 * @see #getTypeSpec()
	 * @generated
	 */
	EReference getTypeSpec_Version();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue <em>Char Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue
	 * @generated
	 */
	EClass getCharValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue#getEncoding()
	 * @see #getCharValue()
	 * @generated
	 */
	EAttribute getCharValue_Encoding();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue <em>Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue
	 * @generated
	 */
	EClass getTypeValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue#getResolutionFormula <em>Resolution Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution Formula</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue#getResolutionFormula()
	 * @see #getTypeValue()
	 * @generated
	 */
	EReference getTypeValue_ResolutionFormula();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue#getSpecialOrReservedValues <em>Special Or Reserved Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Special Or Reserved Values</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue#getSpecialOrReservedValues()
	 * @see #getTypeValue()
	 * @generated
	 */
	EReference getTypeValue_SpecialOrReservedValues();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula <em>Resolution Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Formula</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula
	 * @generated
	 */
	EClass getResolutionFormula();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getUnit()
	 * @see #getResolutionFormula()
	 * @generated
	 */
	EAttribute getResolutionFormula_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula#getValue()
	 * @see #getResolutionFormula()
	 * @generated
	 */
	EAttribute getResolutionFormula_Value();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue <em>Special Or Reserved Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Or Reserved Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue
	 * @generated
	 */
	EClass getSpecialOrReservedValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mask</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMask()
	 * @see #getSpecialOrReservedValue()
	 * @generated
	 */
	EReference getSpecialOrReservedValue_Mask();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Match</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMatch()
	 * @see #getSpecialOrReservedValue()
	 * @generated
	 */
	EReference getSpecialOrReservedValue_Match();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meaning</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getMeaning()
	 * @see #getSpecialOrReservedValue()
	 * @generated
	 */
	EReference getSpecialOrReservedValue_Meaning();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue#getValue()
	 * @see #getSpecialOrReservedValue()
	 * @generated
	 */
	EReference getSpecialOrReservedValue_Value();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue
	 * @generated
	 */
	EClass getSingleValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue#getUnits()
	 * @see #getSingleValue()
	 * @generated
	 */
	EAttribute getSingleValue_Units();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue#getValue()
	 * @see #getSingleValue()
	 * @generated
	 */
	EAttribute getSingleValue_Value();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Mask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mask</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Mask
	 * @generated
	 */
	EClass getMask();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Mask#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Mask#getValue()
	 * @see #getMask()
	 * @generated
	 */
	EAttribute getMask_Value();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch <em>IMatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMatch</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch
	 * @generated
	 */
	EClass getIMatch();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Match#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Match#getValue()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Value();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange <em>Match Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match Range</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange
	 * @generated
	 */
	EClass getMatchRange();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMinimum()
	 * @see #getMatchRange()
	 * @generated
	 */
	EAttribute getMatchRange_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange#getMaximum()
	 * @see #getMatchRange()
	 * @generated
	 */
	EAttribute getMatchRange_Maximum();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meaning</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning
	 * @generated
	 */
	EClass getMeaning();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getType()
	 * @see #getMeaning()
	 * @generated
	 */
	EAttribute getMeaning_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning#getValue()
	 * @see #getMeaning()
	 * @generated
	 */
	EAttribute getMeaning_Value();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getDescription()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getVariables()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Media</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Message#getMedia()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Media();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isBalise <em>Balise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balise</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isBalise()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Balise();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isLoop()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Loop();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isRbc <em>Rbc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rbc</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isRbc()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Rbc();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isRiu <em>Riu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Riu</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Media#isRiu()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Riu();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable <em>Message Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Variable</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable
	 * @generated
	 */
	EClass getMessageVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getName()
	 * @see #getMessageVariable()
	 * @generated
	 */
	EAttribute getMessageVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getLength()
	 * @see #getMessageVariable()
	 * @generated
	 */
	EAttribute getMessageVariable_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getComment()
	 * @see #getMessageVariable()
	 * @generated
	 */
	EAttribute getMessageVariable_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getSubVariables <em>Sub Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Variables</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getSubVariables()
	 * @see #getMessageVariable()
	 * @generated
	 */
	EReference getMessageVariable_SubVariables();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getParentVariable <em>Parent Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Variable</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable#getParentVariable()
	 * @see #getMessageVariable()
	 * @generated
	 */
	EReference getMessageVariable_ParentVariable();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType <em>EErtms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EErtms Type</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType
	 * @generated
	 */
	EEnum getEErtmsType();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit <em>Resolution Formula Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution Formula Unit</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit
	 * @generated
	 */
	EEnum getResolutionFormulaUnit();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue <em>Resolution Formula Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution Formula Value</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue
	 * @generated
	 */
	EEnum getResolutionFormulaValue();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType <em>EMeaning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EMeaning Type</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType
	 * @generated
	 */
	EEnum getEMeaningType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MessagesFactory getMessagesFactory();

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
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl <em>Type Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeSpecImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getTypeSpec()
		 * @generated
		 */
		EClass TYPE_SPEC = eINSTANCE.getTypeSpec();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__ID = eINSTANCE.getTypeSpec_Id();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__SHORT_DESCRIPTION = eINSTANCE.getTypeSpec_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__DESCRIPTION = eINSTANCE.getTypeSpec_Description();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__LENGTH = eINSTANCE.getTypeSpec_Length();

		/**
		 * The meta object literal for the '<em><b>Minimum Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__MINIMUM_VALUE = eINSTANCE.getTypeSpec_MinimumValue();

		/**
		 * The meta object literal for the '<em><b>Maximum Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__MAXIMUM_VALUE = eINSTANCE.getTypeSpec_MaximumValue();

		/**
		 * The meta object literal for the '<em><b>Resolution Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__RESOLUTION_FORMULA = eINSTANCE.getTypeSpec_ResolutionFormula();

		/**
		 * The meta object literal for the '<em><b>Ertms Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_SPEC__ERTMS_TYPE = eINSTANCE.getTypeSpec_ErtmsType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SPEC__VALUE = eINSTANCE.getTypeSpec_Value();

		/**
		 * The meta object literal for the '<em><b>Reference Paragraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SPEC__REFERENCE_PARAGRAPH = eINSTANCE.getTypeSpec_ReferenceParagraph();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SPEC__VERSION = eINSTANCE.getTypeSpec_Version();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Value
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.CharValueImpl <em>Char Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.CharValueImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getCharValue()
		 * @generated
		 */
		EClass CHAR_VALUE = eINSTANCE.getCharValue();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_VALUE__ENCODING = eINSTANCE.getCharValue_Encoding();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeValueImpl <em>Type Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.TypeValueImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getTypeValue()
		 * @generated
		 */
		EClass TYPE_VALUE = eINSTANCE.getTypeValue();

		/**
		 * The meta object literal for the '<em><b>Resolution Formula</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_VALUE__RESOLUTION_FORMULA = eINSTANCE.getTypeValue_ResolutionFormula();

		/**
		 * The meta object literal for the '<em><b>Special Or Reserved Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_VALUE__SPECIAL_OR_RESERVED_VALUES = eINSTANCE.getTypeValue_SpecialOrReservedValues();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.ResolutionFormulaImpl <em>Resolution Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.ResolutionFormulaImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getResolutionFormula()
		 * @generated
		 */
		EClass RESOLUTION_FORMULA = eINSTANCE.getResolutionFormula();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLUTION_FORMULA__UNIT = eINSTANCE.getResolutionFormula_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLUTION_FORMULA__VALUE = eINSTANCE.getResolutionFormula_Value();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl <em>Special Or Reserved Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getSpecialOrReservedValue()
		 * @generated
		 */
		EClass SPECIAL_OR_RESERVED_VALUE = eINSTANCE.getSpecialOrReservedValue();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_OR_RESERVED_VALUE__MASK = eINSTANCE.getSpecialOrReservedValue_Mask();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_OR_RESERVED_VALUE__MATCH = eINSTANCE.getSpecialOrReservedValue_Match();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_OR_RESERVED_VALUE__MEANING = eINSTANCE.getSpecialOrReservedValue_Meaning();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_OR_RESERVED_VALUE__VALUE = eINSTANCE.getSpecialOrReservedValue_Value();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SingleValueImpl <em>Single Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SingleValueImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getSingleValue()
		 * @generated
		 */
		EClass SINGLE_VALUE = eINSTANCE.getSingleValue();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VALUE__UNITS = eINSTANCE.getSingleValue_Units();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_VALUE__VALUE = eINSTANCE.getSingleValue_Value();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MaskImpl <em>Mask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MaskImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMask()
		 * @generated
		 */
		EClass MASK = eINSTANCE.getMask();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASK__VALUE = eINSTANCE.getMask_Value();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch <em>IMatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getIMatch()
		 * @generated
		 */
		EClass IMATCH = eINSTANCE.getIMatch();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__VALUE = eINSTANCE.getMatch_Value();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchRangeImpl <em>Match Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MatchRangeImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMatchRange()
		 * @generated
		 */
		EClass MATCH_RANGE = eINSTANCE.getMatchRange();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_RANGE__MINIMUM = eINSTANCE.getMatchRange_Minimum();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH_RANGE__MAXIMUM = eINSTANCE.getMatchRange_Maximum();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MeaningImpl <em>Meaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MeaningImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMeaning()
		 * @generated
		 */
		EClass MEANING = eINSTANCE.getMeaning();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEANING__TYPE = eINSTANCE.getMeaning_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEANING__VALUE = eINSTANCE.getMeaning_Value();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__DESCRIPTION = eINSTANCE.getMessage_Description();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__VARIABLES = eINSTANCE.getMessage_Variables();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__MEDIA = eINSTANCE.getMessage_Media();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>Balise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__BALISE = eINSTANCE.getMedia_Balise();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__LOOP = eINSTANCE.getMedia_Loop();

		/**
		 * The meta object literal for the '<em><b>Rbc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__RBC = eINSTANCE.getMedia_Rbc();

		/**
		 * The meta object literal for the '<em><b>Riu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__RIU = eINSTANCE.getMedia_Riu();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl <em>Message Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getMessageVariable()
		 * @generated
		 */
		EClass MESSAGE_VARIABLE = eINSTANCE.getMessageVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_VARIABLE__NAME = eINSTANCE.getMessageVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_VARIABLE__LENGTH = eINSTANCE.getMessageVariable_Length();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_VARIABLE__COMMENT = eINSTANCE.getMessageVariable_Comment();

		/**
		 * The meta object literal for the '<em><b>Sub Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_VARIABLE__SUB_VARIABLES = eINSTANCE.getMessageVariable_SubVariables();

		/**
		 * The meta object literal for the '<em><b>Parent Variable</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_VARIABLE__PARENT_VARIABLE = eINSTANCE.getMessageVariable_ParentVariable();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType <em>EErtms Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getEErtmsType()
		 * @generated
		 */
		EEnum EERTMS_TYPE = eINSTANCE.getEErtmsType();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit <em>Resolution Formula Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getResolutionFormulaUnit()
		 * @generated
		 */
		EEnum RESOLUTION_FORMULA_UNIT = eINSTANCE.getResolutionFormulaUnit();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue <em>Resolution Formula Value</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getResolutionFormulaValue()
		 * @generated
		 */
		EEnum RESOLUTION_FORMULA_VALUE = eINSTANCE.getResolutionFormulaValue();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType <em>EMeaning Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType
		 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessagesPackageImpl#getEMeaningType()
		 * @generated
		 */
		EEnum EMEANING_TYPE = eINSTANCE.getEMeaningType();

	}

} //MessagesPackage
