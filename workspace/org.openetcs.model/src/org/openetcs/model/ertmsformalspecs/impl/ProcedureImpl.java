/**
 */
package org.openetcs.model.ertmsformalspecs.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Namespace;
import org.openetcs.model.ertmsformalspecs.Parameter;
import org.openetcs.model.ertmsformalspecs.Procedure;
import org.openetcs.model.ertmsformalspecs.ReferencesParagraph;
import org.openetcs.model.ertmsformalspecs.ReqRef;
import org.openetcs.model.ertmsformalspecs.ReqRelated;
import org.openetcs.model.ertmsformalspecs.StateMachine;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.types.Structure;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#isImplemented <em>Implemented</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#isNeedsRequirement <em>Needs Requirement</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getParentStructure <em>Parent Structure</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.ProcedureImpl#getParentNamespace <em>Parent Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends EObjectImpl implements Procedure {
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
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getStateMachine() <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateMachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine stateMachine;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PROCEDURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqRef> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<ReqRef>(ReqRef.class, this, ModelPackage.PROCEDURE__REQUIREMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__IMPLEMENTED, oldImplemented, implemented));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__VERIFIED, oldVerified, verified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__NEEDS_REQUIREMENT, oldNeedsRequirement, needsRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<Parameter>(Parameter.class, this, ModelPackage.PROCEDURE__PARAMETERS, ModelPackage.PARAMETER__PARENT_PROCEDURE);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getStateMachine() {
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(StateMachine newStateMachine, NotificationChain msgs) {
		StateMachine oldStateMachine = stateMachine;
		stateMachine = newStateMachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__STATE_MACHINE, oldStateMachine, newStateMachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(StateMachine newStateMachine) {
		if (newStateMachine != stateMachine) {
			NotificationChain msgs = null;
			if (stateMachine != null)
				msgs = ((InternalEObject)stateMachine).eInverseRemove(this, ModelPackage.STATE_MACHINE__PARENT_PROCEDURE, StateMachine.class, msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, ModelPackage.STATE_MACHINE__PARENT_PROCEDURE, StateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, ModelPackage.PROCEDURE__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getParentStructure() {
		if (eContainerFeatureID() != ModelPackage.PROCEDURE__PARENT_STRUCTURE) return null;
		return (Structure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStructure(Structure newParentStructure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStructure, ModelPackage.PROCEDURE__PARENT_STRUCTURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStructure(Structure newParentStructure) {
		if (newParentStructure != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PROCEDURE__PARENT_STRUCTURE && newParentStructure != null)) {
			if (EcoreUtil.isAncestor(this, newParentStructure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStructure != null)
				msgs = ((InternalEObject)newParentStructure).eInverseAdd(this, TypesPackage.STRUCTURE__PROCEDURES, Structure.class, msgs);
			msgs = basicSetParentStructure(newParentStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__PARENT_STRUCTURE, newParentStructure, newParentStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getParentNamespace() {
		if (eContainerFeatureID() != ModelPackage.PROCEDURE__PARENT_NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNamespace(Namespace newParentNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNamespace, ModelPackage.PROCEDURE__PARENT_NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNamespace(Namespace newParentNamespace) {
		if (newParentNamespace != eInternalContainer() || (eContainerFeatureID() != ModelPackage.PROCEDURE__PARENT_NAMESPACE && newParentNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newParentNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNamespace != null)
				msgs = ((InternalEObject)newParentNamespace).eInverseAdd(this, ModelPackage.NAMESPACE__PROCEDURES, Namespace.class, msgs);
			msgs = basicSetParentNamespace(newParentNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PROCEDURE__PARENT_NAMESPACE, newParentNamespace, newParentNamespace));
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
			case ModelPackage.PROCEDURE__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
			case ModelPackage.PROCEDURE__STATE_MACHINE:
				if (stateMachine != null)
					msgs = ((InternalEObject)stateMachine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PROCEDURE__STATE_MACHINE, null, msgs);
				return basicSetStateMachine((StateMachine)otherEnd, msgs);
			case ModelPackage.PROCEDURE__PARENT_STRUCTURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStructure((Structure)otherEnd, msgs);
			case ModelPackage.PROCEDURE__PARENT_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNamespace((Namespace)otherEnd, msgs);
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
			case ModelPackage.PROCEDURE__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case ModelPackage.PROCEDURE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ModelPackage.PROCEDURE__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case ModelPackage.PROCEDURE__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case ModelPackage.PROCEDURE__PARENT_STRUCTURE:
				return basicSetParentStructure(null, msgs);
			case ModelPackage.PROCEDURE__PARENT_NAMESPACE:
				return basicSetParentNamespace(null, msgs);
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
			case ModelPackage.PROCEDURE__PARENT_STRUCTURE:
				return eInternalContainer().eInverseRemove(this, TypesPackage.STRUCTURE__PROCEDURES, Structure.class, msgs);
			case ModelPackage.PROCEDURE__PARENT_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.NAMESPACE__PROCEDURES, Namespace.class, msgs);
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
			case ModelPackage.PROCEDURE__NAME:
				return getName();
			case ModelPackage.PROCEDURE__COMMENT:
				return getComment();
			case ModelPackage.PROCEDURE__REQUIREMENTS:
				return getRequirements();
			case ModelPackage.PROCEDURE__IMPLEMENTED:
				return isImplemented();
			case ModelPackage.PROCEDURE__VERIFIED:
				return isVerified();
			case ModelPackage.PROCEDURE__NEEDS_REQUIREMENT:
				return isNeedsRequirement();
			case ModelPackage.PROCEDURE__PARAMETERS:
				return getParameters();
			case ModelPackage.PROCEDURE__STATE_MACHINE:
				return getStateMachine();
			case ModelPackage.PROCEDURE__RULES:
				return getRules();
			case ModelPackage.PROCEDURE__PARENT_STRUCTURE:
				return getParentStructure();
			case ModelPackage.PROCEDURE__PARENT_NAMESPACE:
				return getParentNamespace();
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
			case ModelPackage.PROCEDURE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PROCEDURE__COMMENT:
				setComment((String)newValue);
				return;
			case ModelPackage.PROCEDURE__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ReqRef>)newValue);
				return;
			case ModelPackage.PROCEDURE__IMPLEMENTED:
				setImplemented((Boolean)newValue);
				return;
			case ModelPackage.PROCEDURE__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case ModelPackage.PROCEDURE__NEEDS_REQUIREMENT:
				setNeedsRequirement((Boolean)newValue);
				return;
			case ModelPackage.PROCEDURE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ModelPackage.PROCEDURE__STATE_MACHINE:
				setStateMachine((StateMachine)newValue);
				return;
			case ModelPackage.PROCEDURE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case ModelPackage.PROCEDURE__PARENT_STRUCTURE:
				setParentStructure((Structure)newValue);
				return;
			case ModelPackage.PROCEDURE__PARENT_NAMESPACE:
				setParentNamespace((Namespace)newValue);
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
			case ModelPackage.PROCEDURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PROCEDURE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ModelPackage.PROCEDURE__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ModelPackage.PROCEDURE__IMPLEMENTED:
				setImplemented(IMPLEMENTED_EDEFAULT);
				return;
			case ModelPackage.PROCEDURE__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case ModelPackage.PROCEDURE__NEEDS_REQUIREMENT:
				setNeedsRequirement(NEEDS_REQUIREMENT_EDEFAULT);
				return;
			case ModelPackage.PROCEDURE__PARAMETERS:
				getParameters().clear();
				return;
			case ModelPackage.PROCEDURE__STATE_MACHINE:
				setStateMachine((StateMachine)null);
				return;
			case ModelPackage.PROCEDURE__RULES:
				getRules().clear();
				return;
			case ModelPackage.PROCEDURE__PARENT_STRUCTURE:
				setParentStructure((Structure)null);
				return;
			case ModelPackage.PROCEDURE__PARENT_NAMESPACE:
				setParentNamespace((Namespace)null);
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
			case ModelPackage.PROCEDURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PROCEDURE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ModelPackage.PROCEDURE__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ModelPackage.PROCEDURE__IMPLEMENTED:
				return implemented != IMPLEMENTED_EDEFAULT;
			case ModelPackage.PROCEDURE__VERIFIED:
				return verified != VERIFIED_EDEFAULT;
			case ModelPackage.PROCEDURE__NEEDS_REQUIREMENT:
				return needsRequirement != NEEDS_REQUIREMENT_EDEFAULT;
			case ModelPackage.PROCEDURE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ModelPackage.PROCEDURE__STATE_MACHINE:
				return stateMachine != null;
			case ModelPackage.PROCEDURE__RULES:
				return rules != null && !rules.isEmpty();
			case ModelPackage.PROCEDURE__PARENT_STRUCTURE:
				return getParentStructure() != null;
			case ModelPackage.PROCEDURE__PARENT_NAMESPACE:
				return getParentNamespace() != null;
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
				case ModelPackage.PROCEDURE__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (derivedFeatureID) {
				case ModelPackage.PROCEDURE__REQUIREMENTS: return ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (derivedFeatureID) {
				case ModelPackage.PROCEDURE__IMPLEMENTED: return ModelPackage.REQ_RELATED__IMPLEMENTED;
				case ModelPackage.PROCEDURE__VERIFIED: return ModelPackage.REQ_RELATED__VERIFIED;
				case ModelPackage.PROCEDURE__NEEDS_REQUIREMENT: return ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT;
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
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return ModelPackage.PROCEDURE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (baseFeatureID) {
				case ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS: return ModelPackage.PROCEDURE__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (baseFeatureID) {
				case ModelPackage.REQ_RELATED__IMPLEMENTED: return ModelPackage.PROCEDURE__IMPLEMENTED;
				case ModelPackage.REQ_RELATED__VERIFIED: return ModelPackage.PROCEDURE__VERIFIED;
				case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT: return ModelPackage.PROCEDURE__NEEDS_REQUIREMENT;
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

} //ProcedureImpl
