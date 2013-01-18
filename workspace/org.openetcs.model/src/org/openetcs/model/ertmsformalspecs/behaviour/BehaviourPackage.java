/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour;

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
 * @see org.openetcs.model.ertmsformalspecs.behaviour.BehaviourFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/openetcs/ertmsformalspecs/behaviour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.ertmsformalspecs.behaviour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourPackage eINSTANCE = org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__COMMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__REQUIREMENTS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IMPLEMENTED = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__VERIFIED = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NEEDS_REQUIREMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRIORITY = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITIONS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PARENT_STATE_MACHINE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Parent Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PARENT_NAMESPACE = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl <em>Rule Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getRuleCondition()
	 * @generated
	 */
	int RULE_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__NAME = ModelPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__COMMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__REQUIREMENTS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__IMPLEMENTED = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__VERIFIED = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Needs Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__NEEDS_REQUIREMENT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__ACTIONS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__SUB_RULES = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Preconditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION__PRECONDITIONS = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Rule Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_CONDITION_FEATURE_COUNT = ModelPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.PreConditionImpl
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Parent Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__PARENT_CASE = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Parent Rule Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__PARENT_RULE_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.ActionImpl
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Parent Rule Condition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARENT_RULE_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Parent Sub Step</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PARENT_SUB_STEP = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Priority
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 4;


	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Rule#getConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Conditions();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentStateMachine <em>Parent State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent State Machine</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentStateMachine()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ParentStateMachine();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentNamespace <em>Parent Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Namespace</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Rule#getParentNamespace()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ParentNamespace();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition <em>Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Condition</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition
	 * @generated
	 */
	EClass getRuleCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getActions()
	 * @see #getRuleCondition()
	 * @generated
	 */
	EReference getRuleCondition_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getSubRules <em>Sub Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Rules</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getSubRules()
	 * @see #getRuleCondition()
	 * @generated
	 */
	EReference getRuleCondition_SubRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getPreconditions <em>Preconditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preconditions</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition#getPreconditions()
	 * @see #getRuleCondition()
	 * @generated
	 */
	EReference getRuleCondition_Preconditions();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentCase <em>Parent Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Case</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentCase()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_ParentCase();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getCondition()
	 * @see #getPreCondition()
	 * @generated
	 */
	EAttribute getPreCondition_Condition();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentRuleCondition <em>Parent Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Rule Condition</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.PreCondition#getParentRuleCondition()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_ParentRuleCondition();

	/**
	 * Returns the meta object for class '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Action#getExpression()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Expression();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentRuleCondition <em>Parent Rule Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Rule Condition</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentRuleCondition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ParentRuleCondition();

	/**
	 * Returns the meta object for the container reference '{@link org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentSubStep <em>Parent Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Sub Step</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Action#getParentSubStep()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ParentSubStep();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.model.ertmsformalspecs.behaviour.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see org.openetcs.model.ertmsformalspecs.behaviour.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviourFactory getBehaviourFactory();

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
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PRIORITY = eINSTANCE.getRule_Priority();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITIONS = eINSTANCE.getRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Parent State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PARENT_STATE_MACHINE = eINSTANCE.getRule_ParentStateMachine();

		/**
		 * The meta object literal for the '<em><b>Parent Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PARENT_NAMESPACE = eINSTANCE.getRule_ParentNamespace();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl <em>Rule Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getRuleCondition()
		 * @generated
		 */
		EClass RULE_CONDITION = eINSTANCE.getRuleCondition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_CONDITION__ACTIONS = eINSTANCE.getRuleCondition_Actions();

		/**
		 * The meta object literal for the '<em><b>Sub Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_CONDITION__SUB_RULES = eINSTANCE.getRuleCondition_SubRules();

		/**
		 * The meta object literal for the '<em><b>Preconditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_CONDITION__PRECONDITIONS = eINSTANCE.getRuleCondition_Preconditions();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.PreConditionImpl
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>Parent Case</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__PARENT_CASE = eINSTANCE.getPreCondition_ParentCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONDITION__CONDITION = eINSTANCE.getPreCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Parent Rule Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__PARENT_RULE_CONDITION = eINSTANCE.getPreCondition_ParentRuleCondition();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.ActionImpl
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__EXPRESSION = eINSTANCE.getAction_Expression();

		/**
		 * The meta object literal for the '<em><b>Parent Rule Condition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARENT_RULE_CONDITION = eINSTANCE.getAction_ParentRuleCondition();

		/**
		 * The meta object literal for the '<em><b>Parent Sub Step</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__PARENT_SUB_STEP = eINSTANCE.getAction_ParentSubStep();

		/**
		 * The meta object literal for the '{@link org.openetcs.model.ertmsformalspecs.behaviour.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.Priority
		 * @see org.openetcs.model.ertmsformalspecs.behaviour.impl.BehaviourPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

	}

} //BehaviourPackage
