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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.ReferencesParagraph;
import org.openetcs.model.ertmsformalspecs.ReqRef;
import org.openetcs.model.ertmsformalspecs.ReqRelated;
import org.openetcs.model.ertmsformalspecs.StateMachine;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.Priority;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#isImplemented <em>Implemented</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#isNeedsRequirement <em>Needs Requirement</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.behaviour.impl.RuleImpl#getParentStateMachine <em>Parent State Machine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Priority PRIORITY_EDEFAULT = Priority.VERIFICATION;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Priority priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleCondition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqRef> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<ReqRef>(ReqRef.class, this, BehaviourPackage.RULE__REQUIREMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE__IMPLEMENTED, oldImplemented, implemented));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE__VERIFIED, oldVerified, verified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE__NEEDS_REQUIREMENT, oldNeedsRequirement, needsRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Priority getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Priority newPriority) {
		Priority oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<RuleCondition>(RuleCondition.class, this, BehaviourPackage.RULE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getParentStateMachine() {
		if (eContainerFeatureID() != BehaviourPackage.RULE__PARENT_STATE_MACHINE) return null;
		return (StateMachine)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStateMachine(StateMachine newParentStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStateMachine, BehaviourPackage.RULE__PARENT_STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStateMachine(StateMachine newParentStateMachine) {
		if (newParentStateMachine != eInternalContainer() || (eContainerFeatureID() != BehaviourPackage.RULE__PARENT_STATE_MACHINE && newParentStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newParentStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStateMachine != null)
				msgs = ((InternalEObject)newParentStateMachine).eInverseAdd(this, ModelPackage.STATE_MACHINE__RULES, StateMachine.class, msgs);
			msgs = basicSetParentStateMachine(newParentStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviourPackage.RULE__PARENT_STATE_MACHINE, newParentStateMachine, newParentStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviourPackage.RULE__PARENT_STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStateMachine((StateMachine)otherEnd, msgs);
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
			case BehaviourPackage.RULE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case BehaviourPackage.RULE__PARENT_STATE_MACHINE:
				return basicSetParentStateMachine(null, msgs);
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
			case BehaviourPackage.RULE__PARENT_STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.STATE_MACHINE__RULES, StateMachine.class, msgs);
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
			case BehaviourPackage.RULE__NAME:
				return getName();
			case BehaviourPackage.RULE__COMMENT:
				return getComment();
			case BehaviourPackage.RULE__REQUIREMENTS:
				return getRequirements();
			case BehaviourPackage.RULE__IMPLEMENTED:
				return isImplemented();
			case BehaviourPackage.RULE__VERIFIED:
				return isVerified();
			case BehaviourPackage.RULE__NEEDS_REQUIREMENT:
				return isNeedsRequirement();
			case BehaviourPackage.RULE__PRIORITY:
				return getPriority();
			case BehaviourPackage.RULE__CONDITIONS:
				return getConditions();
			case BehaviourPackage.RULE__PARENT_STATE_MACHINE:
				return getParentStateMachine();
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
			case BehaviourPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case BehaviourPackage.RULE__COMMENT:
				setComment((String)newValue);
				return;
			case BehaviourPackage.RULE__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ReqRef>)newValue);
				return;
			case BehaviourPackage.RULE__IMPLEMENTED:
				setImplemented((Boolean)newValue);
				return;
			case BehaviourPackage.RULE__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case BehaviourPackage.RULE__NEEDS_REQUIREMENT:
				setNeedsRequirement((Boolean)newValue);
				return;
			case BehaviourPackage.RULE__PRIORITY:
				setPriority((Priority)newValue);
				return;
			case BehaviourPackage.RULE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends RuleCondition>)newValue);
				return;
			case BehaviourPackage.RULE__PARENT_STATE_MACHINE:
				setParentStateMachine((StateMachine)newValue);
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
			case BehaviourPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BehaviourPackage.RULE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BehaviourPackage.RULE__REQUIREMENTS:
				getRequirements().clear();
				return;
			case BehaviourPackage.RULE__IMPLEMENTED:
				setImplemented(IMPLEMENTED_EDEFAULT);
				return;
			case BehaviourPackage.RULE__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case BehaviourPackage.RULE__NEEDS_REQUIREMENT:
				setNeedsRequirement(NEEDS_REQUIREMENT_EDEFAULT);
				return;
			case BehaviourPackage.RULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case BehaviourPackage.RULE__CONDITIONS:
				getConditions().clear();
				return;
			case BehaviourPackage.RULE__PARENT_STATE_MACHINE:
				setParentStateMachine((StateMachine)null);
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
			case BehaviourPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BehaviourPackage.RULE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case BehaviourPackage.RULE__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case BehaviourPackage.RULE__IMPLEMENTED:
				return implemented != IMPLEMENTED_EDEFAULT;
			case BehaviourPackage.RULE__VERIFIED:
				return verified != VERIFIED_EDEFAULT;
			case BehaviourPackage.RULE__NEEDS_REQUIREMENT:
				return needsRequirement != NEEDS_REQUIREMENT_EDEFAULT;
			case BehaviourPackage.RULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case BehaviourPackage.RULE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case BehaviourPackage.RULE__PARENT_STATE_MACHINE:
				return getParentStateMachine() != null;
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
				case BehaviourPackage.RULE__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (derivedFeatureID) {
				case BehaviourPackage.RULE__REQUIREMENTS: return ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (derivedFeatureID) {
				case BehaviourPackage.RULE__IMPLEMENTED: return ModelPackage.REQ_RELATED__IMPLEMENTED;
				case BehaviourPackage.RULE__VERIFIED: return ModelPackage.REQ_RELATED__VERIFIED;
				case BehaviourPackage.RULE__NEEDS_REQUIREMENT: return ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT;
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
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return BehaviourPackage.RULE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (baseFeatureID) {
				case ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS: return BehaviourPackage.RULE__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (baseFeatureID) {
				case ModelPackage.REQ_RELATED__IMPLEMENTED: return BehaviourPackage.RULE__IMPLEMENTED;
				case ModelPackage.REQ_RELATED__VERIFIED: return BehaviourPackage.RULE__VERIFIED;
				case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT: return BehaviourPackage.RULE__NEEDS_REQUIREMENT;
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
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
