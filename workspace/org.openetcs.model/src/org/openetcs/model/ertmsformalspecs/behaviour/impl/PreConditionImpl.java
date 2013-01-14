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
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.PreCondition;
import org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition;
import org.openetcs.model.ertmsformalspecs.types.Case;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.PreConditionImpl#getParentCase <em>Parent Case</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.PreConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.PreConditionImpl#getParentRuleCondition <em>Parent Rule Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreConditionImpl extends EObjectImpl implements PreCondition {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.PRE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case getParentCase() {
		if (eContainerFeatureID() != BehaviourPackage.PRE_CONDITION__PARENT_CASE) return null;
		return (Case)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCase(Case newParentCase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentCase, BehaviourPackage.PRE_CONDITION__PARENT_CASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCase(Case newParentCase) {
		if (newParentCase != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.PRE_CONDITION__PARENT_CASE && newParentCase != null)) {
			if (EcoreUtil.isAncestor(this, newParentCase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentCase != null)
				msgs = ((InternalEObject)newParentCase).eInverseAdd(this, TypesPackage.CASE__PRE_CONDITIONS, Case.class, msgs);
			msgs = basicSetParentCase(newParentCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.PRE_CONDITION__PARENT_CASE, newParentCase, newParentCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.PRE_CONDITION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleCondition getParentRuleCondition() {
		if (eContainerFeatureID() != BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION) return null;
		return (RuleCondition)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentRuleCondition(RuleCondition newParentRuleCondition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentRuleCondition, BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentRuleCondition(RuleCondition newParentRuleCondition) {
		if (newParentRuleCondition != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION && newParentRuleCondition != null)) {
			if (EcoreUtil.isAncestor(this, newParentRuleCondition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentRuleCondition != null)
				msgs = ((InternalEObject)newParentRuleCondition).eInverseAdd(this, BehaviourPackage.RULE_CONDITION__PRECONDITIONS, RuleCondition.class, msgs);
			msgs = basicSetParentRuleCondition(newParentRuleCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION, newParentRuleCondition, newParentRuleCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.PRE_CONDITION__PARENT_CASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentCase((Case)otherEnd, msgs);
			case BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentRuleCondition((RuleCondition)otherEnd, msgs);
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
			case BehaviourPackage.PRE_CONDITION__PARENT_CASE:
				return basicSetParentCase(null, msgs);
			case BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION:
				return basicSetParentRuleCondition(null, msgs);
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
			case BehaviourPackage.PRE_CONDITION__PARENT_CASE:
				return eInternalContainer().eInverseRemove(this, TypesPackage.CASE__PRE_CONDITIONS, Case.class, msgs);
			case BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION:
				return eInternalContainer().eInverseRemove(this, BehaviourPackage.RULE_CONDITION__PRECONDITIONS, RuleCondition.class, msgs);
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
			case BehaviourPackage.PRE_CONDITION__PARENT_CASE:
				return getParentCase();
			case BehaviourPackage.PRE_CONDITION__CONDITION:
				return getCondition();
			case BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION:
				return getParentRuleCondition();
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
			case BehaviourPackage.PRE_CONDITION__PARENT_CASE:
				setParentCase((Case)newValue);
				return;
			case BehaviourPackage.PRE_CONDITION__CONDITION:
				setCondition((String)newValue);
				return;
			case BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION:
				setParentRuleCondition((RuleCondition)newValue);
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
			case BehaviourPackage.PRE_CONDITION__PARENT_CASE:
				setParentCase((Case)null);
				return;
			case BehaviourPackage.PRE_CONDITION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION:
				setParentRuleCondition((RuleCondition)null);
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
			case BehaviourPackage.PRE_CONDITION__PARENT_CASE:
				return getParentCase() != null;
			case BehaviourPackage.PRE_CONDITION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION:
				return getParentRuleCondition() != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //PreConditionImpl
