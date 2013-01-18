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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.ReferencesParagraph;
import org.openetcs.model.ertmsformalspecs.ReqRef;
import org.openetcs.model.ertmsformalspecs.ReqRelated;
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
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#isImplemented <em>Implemented</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleConditionImpl#isNeedsRequirement <em>Needs Requirement</em>}</li>
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
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<ReqRef> requirements;

	/**
	 * The default value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplemented()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPLEMENTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplemented() <em>Implemented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplemented()
	 * @generated
	 * @ordered
	 */
	protected boolean implemented = IMPLEMENTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerified()
	 * @generated
	 * @ordered
	 */
	protected boolean verified = VERIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #isNeedsRequirement() <em>Needs Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEEDS_REQUIREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNeedsRequirement() <em>Needs Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNeedsRequirement()
	 * @generated
	 * @ordered
	 */
	protected boolean needsRequirement = NEEDS_REQUIREMENT_EDEFAULT;

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
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE_CONDITION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqRef> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<ReqRef>(ReqRef.class, this, BehaviourPackage.RULE_CONDITION__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImplemented() {
		return implemented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplemented(boolean newImplemented) {
		boolean oldImplemented = implemented;
		implemented = newImplemented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE_CONDITION__IMPLEMENTED, oldImplemented, implemented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerified() {
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerified(boolean newVerified) {
		boolean oldVerified = verified;
		verified = newVerified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE_CONDITION__VERIFIED, oldVerified, verified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsRequirement() {
		return needsRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsRequirement(boolean newNeedsRequirement) {
		boolean oldNeedsRequirement = needsRequirement;
		needsRequirement = newNeedsRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE_CONDITION__NEEDS_REQUIREMENT, oldNeedsRequirement, needsRequirement));
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
			case BehaviourPackage.RULE_CONDITION__COMMENT:
				return getComment();
			case BehaviourPackage.RULE_CONDITION__REQUIREMENTS:
				return getRequirements();
			case BehaviourPackage.RULE_CONDITION__IMPLEMENTED:
				return isImplemented();
			case BehaviourPackage.RULE_CONDITION__VERIFIED:
				return isVerified();
			case BehaviourPackage.RULE_CONDITION__NEEDS_REQUIREMENT:
				return isNeedsRequirement();
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
			case BehaviourPackage.RULE_CONDITION__COMMENT:
				setComment((String)newValue);
				return;
			case BehaviourPackage.RULE_CONDITION__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ReqRef>)newValue);
				return;
			case BehaviourPackage.RULE_CONDITION__IMPLEMENTED:
				setImplemented((Boolean)newValue);
				return;
			case BehaviourPackage.RULE_CONDITION__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case BehaviourPackage.RULE_CONDITION__NEEDS_REQUIREMENT:
				setNeedsRequirement((Boolean)newValue);
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
			case BehaviourPackage.RULE_CONDITION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BehaviourPackage.RULE_CONDITION__REQUIREMENTS:
				getRequirements().clear();
				return;
			case BehaviourPackage.RULE_CONDITION__IMPLEMENTED:
				setImplemented(IMPLEMENTED_EDEFAULT);
				return;
			case BehaviourPackage.RULE_CONDITION__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case BehaviourPackage.RULE_CONDITION__NEEDS_REQUIREMENT:
				setNeedsRequirement(NEEDS_REQUIREMENT_EDEFAULT);
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
			case BehaviourPackage.RULE_CONDITION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BehaviourPackage.RULE_CONDITION__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case BehaviourPackage.RULE_CONDITION__IMPLEMENTED:
				return implemented != IMPLEMENTED_EDEFAULT;
			case BehaviourPackage.RULE_CONDITION__VERIFIED:
				return verified != VERIFIED_EDEFAULT;
			case BehaviourPackage.RULE_CONDITION__NEEDS_REQUIREMENT:
				return needsRequirement != NEEDS_REQUIREMENT_EDEFAULT;
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CommentedElement.class) {
			switch (derivedFeatureID) {
				case BehaviourPackage.RULE_CONDITION__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (derivedFeatureID) {
				case BehaviourPackage.RULE_CONDITION__REQUIREMENTS: return ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (derivedFeatureID) {
				case BehaviourPackage.RULE_CONDITION__IMPLEMENTED: return ModelPackage.REQ_RELATED__IMPLEMENTED;
				case BehaviourPackage.RULE_CONDITION__VERIFIED: return ModelPackage.REQ_RELATED__VERIFIED;
				case BehaviourPackage.RULE_CONDITION__NEEDS_REQUIREMENT: return ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CommentedElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return BehaviourPackage.RULE_CONDITION__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (baseFeatureID) {
				case ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS: return BehaviourPackage.RULE_CONDITION__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (baseFeatureID) {
				case ModelPackage.REQ_RELATED__IMPLEMENTED: return BehaviourPackage.RULE_CONDITION__IMPLEMENTED;
				case ModelPackage.REQ_RELATED__VERIFIED: return BehaviourPackage.RULE_CONDITION__VERIFIED;
				case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT: return BehaviourPackage.RULE_CONDITION__NEEDS_REQUIREMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", comment: ");
		result.append(comment);
		result.append(", implemented: ");
		result.append(implemented);
		result.append(", verified: ");
		result.append(verified);
		result.append(", needsRequirement: ");
		result.append(needsRequirement);
		result.append(')');
		return result.toString();
	}

} //RuleConditionImpl
