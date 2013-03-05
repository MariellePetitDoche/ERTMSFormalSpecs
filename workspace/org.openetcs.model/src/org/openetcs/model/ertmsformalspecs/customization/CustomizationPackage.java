/**
 */
package org.openetcs.model.ertmsformalspecs.customization;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.openetcs.model.ertmsformalspecs.customization.CustomizationFactory
 * @model kind="package"
 * @generated
 */
public interface CustomizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "customization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/ertmsformalspecs/customization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.ertmsformalspecs.customization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomizationPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.customization.impl.CustomizationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.customization.impl.RuleDisablingImpl <em>Rule Disabling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.customization.impl.RuleDisablingImpl
	 * @see org.openetcs.model.ertmsformalspecs.customization.impl.CustomizationPackageImpl#getRuleDisabling()
	 * @generated
	 */
	int RULE_DISABLING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__NAME = ModelPackage.REQ_RELATED__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__COMMENT = ModelPackage.REQ_RELATED__COMMENT;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__REQUIREMENTS = ModelPackage.REQ_RELATED__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__IMPLEMENTED = ModelPackage.REQ_RELATED__IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__VERIFIED = ModelPackage.REQ_RELATED__VERIFIED;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__NEEDS_REQUIREMENT = ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__RULE = ModelPackage.REQ_RELATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Dictionary</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING__PARENT_DICTIONARY = ModelPackage.REQ_RELATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule Disabling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_DISABLING_FEATURE_COUNT = ModelPackage.REQ_RELATED_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling <em>Rule Disabling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Disabling</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.customization.RuleDisabling
	 * @generated
	 */
	EClass getRuleDisabling();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getRule()
	 * @see #getRuleDisabling()
	 * @generated
	 */
	EReference getRuleDisabling_Rule();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getParentDictionary <em>Parent Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Dictionary</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getParentDictionary()
	 * @see #getRuleDisabling()
	 * @generated
	 */
	EReference getRuleDisabling_ParentDictionary();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomizationFactory getCustomizationFactory();

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
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.customization.impl.RuleDisablingImpl <em>Rule Disabling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.customization.impl.RuleDisablingImpl
		 * @see org.openetcs.model.ertmsformalspecs.customization.impl.CustomizationPackageImpl#getRuleDisabling()
		 * @generated
		 */
		EClass RULE_DISABLING = eINSTANCE.getRuleDisabling();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DISABLING__RULE = eINSTANCE.getRuleDisabling_Rule();

		/**
		 * The meta object literal for the '<em><b>Parent Dictionary</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_DISABLING__PARENT_DICTIONARY = eINSTANCE.getRuleDisabling_ParentDictionary();

	}

} //CustomizationPackage
