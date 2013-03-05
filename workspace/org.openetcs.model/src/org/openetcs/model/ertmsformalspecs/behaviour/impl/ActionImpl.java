/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openetcs.model.ertmsformalspecs.behaviour.Action;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition;
import org.openetcs.model.ertmsformalspecs.test.SubStep;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.ActionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.ActionImpl#getParentRuleCondition <em>Parent Rule Condition</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.ActionImpl#getParentSubStep <em>Parent Sub Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends EObjectImpl implements Action {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.ACTION__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleCondition getParentRuleCondition() {
		if (eContainerFeatureID() != BehaviourPackage.ACTION__PARENT_RULE_CONDITION) return null;
		return (RuleCondition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRuleCondition(RuleCondition newParentRuleCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRuleCondition, BehaviourPackage.ACTION__PARENT_RULE_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRuleCondition(RuleCondition newParentRuleCondition) {
		if (newParentRuleCondition != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.ACTION__PARENT_RULE_CONDITION && newParentRuleCondition != null)) {
			if (EcoreUtil.isAncestor(this, newParentRuleCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRuleCondition != null)
				msgs = ((InternalEObject)newParentRuleCondition).eInverseAdd(this, BehaviourPackage.RULE_CONDITION__ACTIONS, RuleCondition.class, msgs);
			msgs = basicSetParentRuleCondition(newParentRuleCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.ACTION__PARENT_RULE_CONDITION, newParentRuleCondition, newParentRuleCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubStep getParentSubStep() {
		if (eContainerFeatureID() != BehaviourPackage.ACTION__PARENT_SUB_STEP) return null;
		return (SubStep)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSubStep(SubStep newParentSubStep, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSubStep, BehaviourPackage.ACTION__PARENT_SUB_STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSubStep(SubStep newParentSubStep) {
		if (newParentSubStep != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.ACTION__PARENT_SUB_STEP && newParentSubStep != null)) {
			if (EcoreUtil.isAncestor(this, newParentSubStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSubStep != null)
				msgs = ((InternalEObject)newParentSubStep).eInverseAdd(this, TestPackage.SUB_STEP__ACTIONS, SubStep.class, msgs);
			msgs = basicSetParentSubStep(newParentSubStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.ACTION__PARENT_SUB_STEP, newParentSubStep, newParentSubStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.ACTION__PARENT_RULE_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRuleCondition((RuleCondition)otherEnd, msgs);
			case BehaviourPackage.ACTION__PARENT_SUB_STEP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSubStep((SubStep)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.ACTION__PARENT_RULE_CONDITION:
				return basicSetParentRuleCondition(null, msgs);
			case BehaviourPackage.ACTION__PARENT_SUB_STEP:
				return basicSetParentSubStep(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BehaviourPackage.ACTION__PARENT_RULE_CONDITION:
				return eInternalContainer().eInverseRemove(this, BehaviourPackage.RULE_CONDITION__ACTIONS, RuleCondition.class, msgs);
			case BehaviourPackage.ACTION__PARENT_SUB_STEP:
				return eInternalContainer().eInverseRemove(this, TestPackage.SUB_STEP__ACTIONS, SubStep.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourPackage.ACTION__EXPRESSION:
				return getExpression();
			case BehaviourPackage.ACTION__PARENT_RULE_CONDITION:
				return getParentRuleCondition();
			case BehaviourPackage.ACTION__PARENT_SUB_STEP:
				return getParentSubStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourPackage.ACTION__EXPRESSION:
				setExpression((String)newValue);
				return;
			case BehaviourPackage.ACTION__PARENT_RULE_CONDITION:
				setParentRuleCondition((RuleCondition)newValue);
				return;
			case BehaviourPackage.ACTION__PARENT_SUB_STEP:
				setParentSubStep((SubStep)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviourPackage.ACTION__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case BehaviourPackage.ACTION__PARENT_RULE_CONDITION:
				setParentRuleCondition((RuleCondition)null);
				return;
			case BehaviourPackage.ACTION__PARENT_SUB_STEP:
				setParentSubStep((SubStep)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviourPackage.ACTION__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case BehaviourPackage.ACTION__PARENT_RULE_CONDITION:
				return getParentRuleCondition() != null;
			case BehaviourPackage.ACTION__PARENT_SUB_STEP:
				return getParentSubStep() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
