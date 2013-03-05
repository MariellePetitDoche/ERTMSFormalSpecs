/**
 */
package org.openetcs.model.ertmsformalspecs.customization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage;
import org.openetcs.model.ertmsformalspecs.customization.RuleDisabling;
import org.openetcs.model.ertmsformalspecs.impl.ReqRelatedImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Disabling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.customization.impl.RuleDisablingImpl#getRule <em>Rule</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.customization.impl.RuleDisablingImpl#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleDisablingImpl extends ReqRelatedImpl implements RuleDisabling {
	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected Rule rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleDisablingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomizationPackage.Literals.RULE_DISABLING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (rule != null && rule.eIsProxy()) {
			InternalEObject oldRule = (InternalEObject)rule;
			rule = (Rule)eResolveProxy(oldRule);
			if (rule != oldRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CustomizationPackage.RULE_DISABLING__RULE, oldRule, rule));
			}
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule basicGetRule() {
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		Rule oldRule = rule;
		rule = newRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomizationPackage.RULE_DISABLING__RULE, oldRule, rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getParentDictionary() {
		if (eContainerFeatureID() != CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY) return null;
		return (Dictionary)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDictionary(Dictionary newParentDictionary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentDictionary, CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDictionary(Dictionary newParentDictionary) {
		if (newParentDictionary != eInternalContainer() || (eContainerFeatureID() != CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY && newParentDictionary != null)) {
			if (EcoreUtil.isAncestor(this, newParentDictionary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentDictionary != null)
				msgs = ((InternalEObject)newParentDictionary).eInverseAdd(this, ModelPackage.DICTIONARY__RULE_DISABLINGS, Dictionary.class, msgs);
			msgs = basicSetParentDictionary(newParentDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY, newParentDictionary, newParentDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentDictionary((Dictionary)otherEnd, msgs);
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
			case CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY:
				return basicSetParentDictionary(null, msgs);
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
			case CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DICTIONARY__RULE_DISABLINGS, Dictionary.class, msgs);
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
			case CustomizationPackage.RULE_DISABLING__RULE:
				if (resolve) return getRule();
				return basicGetRule();
			case CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY:
				return getParentDictionary();
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
			case CustomizationPackage.RULE_DISABLING__RULE:
				setRule((Rule)newValue);
				return;
			case CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)newValue);
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
			case CustomizationPackage.RULE_DISABLING__RULE:
				setRule((Rule)null);
				return;
			case CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)null);
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
			case CustomizationPackage.RULE_DISABLING__RULE:
				return rule != null;
			case CustomizationPackage.RULE_DISABLING__PARENT_DICTIONARY:
				return getParentDictionary() != null;
		}
		return super.eIsSet(featureID);
	}

} //RuleDisablingImpl
