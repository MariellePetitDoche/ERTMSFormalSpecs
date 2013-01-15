/**
 */
package org.openetcs.model.ertmsformalspecs.behaviour.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.behaviour.Action;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.PreCondition;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#getSubRules <em>Sub Rules</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#getPreconditions <em>Preconditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleConditionImpl extends EObjectImpl implements RuleCondition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getSubRules() <em>Sub Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> subRules;

	/**
	 * The cached value of the '{@link #getPreconditions() <em>Preconditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreconditions()
	 * @generated
	 * @ordered
	 */
	protected EList<PreCondition> preconditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.RULE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE_CONDITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, BehaviourPackage.RULE_CONDITION__ACTIONS, BehaviourPackage.ACTION__PARENT_RULE_CONDITION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getSubRules() {
		if (subRules == null) {
			subRules = new EObjectContainmentEList<Rule>(Rule.class, this, BehaviourPackage.RULE_CONDITION__SUB_RULES);
		}
		return subRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreCondition> getPreconditions() {
		if (preconditions == null) {
			preconditions = new EObjectContainmentWithInverseEList<PreCondition>(PreCondition.class, this, BehaviourPackage.RULE_CONDITION__PRECONDITIONS, BehaviourPackage.PRE_CONDITION__PARENT_RULE_CONDITION);
		}
		return preconditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.RULE_CONDITION__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case BehaviourPackage.RULE_CONDITION__PRECONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPreconditions()).basicAdd(otherEnd, msgs);
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
			case BehaviourPackage.RULE_CONDITION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.RULE_CONDITION__SUB_RULES:
				return ((InternalEList<?>)getSubRules()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.RULE_CONDITION__PRECONDITIONS:
				return ((InternalEList<?>)getPreconditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourPackage.RULE_CONDITION__NAME:
				return getName();
			case BehaviourPackage.RULE_CONDITION__ACTIONS:
				return getActions();
			case BehaviourPackage.RULE_CONDITION__SUB_RULES:
				return getSubRules();
			case BehaviourPackage.RULE_CONDITION__PRECONDITIONS:
				return getPreconditions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviourPackage.RULE_CONDITION__NAME:
				setName((String)newValue);
				return;
			case BehaviourPackage.RULE_CONDITION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case BehaviourPackage.RULE_CONDITION__SUB_RULES:
				getSubRules().clear();
				getSubRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case BehaviourPackage.RULE_CONDITION__PRECONDITIONS:
				getPreconditions().clear();
				getPreconditions().addAll((Collection<? extends PreCondition>)newValue);
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
			case BehaviourPackage.RULE_CONDITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviourPackage.RULE_CONDITION__ACTIONS:
				getActions().clear();
				return;
			case BehaviourPackage.RULE_CONDITION__SUB_RULES:
				getSubRules().clear();
				return;
			case BehaviourPackage.RULE_CONDITION__PRECONDITIONS:
				getPreconditions().clear();
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
			case BehaviourPackage.RULE_CONDITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviourPackage.RULE_CONDITION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BehaviourPackage.RULE_CONDITION__SUB_RULES:
				return subRules != null && !subRules.isEmpty();
			case BehaviourPackage.RULE_CONDITION__PRECONDITIONS:
				return preconditions != null && !preconditions.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RuleConditionImpl
