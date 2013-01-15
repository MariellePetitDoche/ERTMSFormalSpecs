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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Procedure;
import org.openetcs.model.ertmsformalspecs.State;
import org.openetcs.model.ertmsformalspecs.StateMachine;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl#getParentState <em>Parent State</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.StateMachineImpl#getParentProcedure <em>Parent Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateMachineImpl extends ReqRelatedImpl implements StateMachine {
	/**
	 * The default value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected String initialState = INITIAL_STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

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
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialState(String newInitialState) {
		String oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STATE_MACHINE__INITIAL_STATE, oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<State>(State.class, this, ModelPackage.STATE_MACHINE__STATES, ModelPackage.STATE__PARENT_STATE_MACHINE);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentWithInverseEList<Rule>(Rule.class, this, ModelPackage.STATE_MACHINE__RULES, BehaviourPackage.RULE__PARENT_STATE_MACHINE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getParentState() {
		if (eContainerFeatureID() != ModelPackage.STATE_MACHINE__PARENT_STATE) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentState(State newParentState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentState, ModelPackage.STATE_MACHINE__PARENT_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentState(State newParentState) {
		if (newParentState != eInternalContainer() || (eContainerFeatureID() != ModelPackage.STATE_MACHINE__PARENT_STATE && newParentState != null)) {
			if (EcoreUtil.isAncestor(this, newParentState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentState != null)
				msgs = ((InternalEObject)newParentState).eInverseAdd(this, ModelPackage.STATE__STATE_MACHINE, State.class, msgs);
			msgs = basicSetParentState(newParentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STATE_MACHINE__PARENT_STATE, newParentState, newParentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getParentProcedure() {
		if (eContainerFeatureID() != ModelPackage.STATE_MACHINE__PARENT_PROCEDURE) return null;
		return (Procedure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentProcedure(Procedure newParentProcedure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentProcedure, ModelPackage.STATE_MACHINE__PARENT_PROCEDURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentProcedure(Procedure newParentProcedure) {
		if (newParentProcedure != eInternalContainer() || (eContainerFeatureID() != ModelPackage.STATE_MACHINE__PARENT_PROCEDURE && newParentProcedure != null)) {
			if (EcoreUtil.isAncestor(this, newParentProcedure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentProcedure != null)
				msgs = ((InternalEObject)newParentProcedure).eInverseAdd(this, ModelPackage.PROCEDURE__STATE_MACHINE, Procedure.class, msgs);
			msgs = basicSetParentProcedure(newParentProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.STATE_MACHINE__PARENT_PROCEDURE, newParentProcedure, newParentProcedure));
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
			case ModelPackage.STATE_MACHINE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
			case ModelPackage.STATE_MACHINE__RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
			case ModelPackage.STATE_MACHINE__PARENT_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentState((State)otherEnd, msgs);
			case ModelPackage.STATE_MACHINE__PARENT_PROCEDURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentProcedure((Procedure)otherEnd, msgs);
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
			case ModelPackage.STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ModelPackage.STATE_MACHINE__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case ModelPackage.STATE_MACHINE__PARENT_STATE:
				return basicSetParentState(null, msgs);
			case ModelPackage.STATE_MACHINE__PARENT_PROCEDURE:
				return basicSetParentProcedure(null, msgs);
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
			case ModelPackage.STATE_MACHINE__PARENT_STATE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.STATE__STATE_MACHINE, State.class, msgs);
			case ModelPackage.STATE_MACHINE__PARENT_PROCEDURE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.PROCEDURE__STATE_MACHINE, Procedure.class, msgs);
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
			case ModelPackage.STATE_MACHINE__INITIAL_STATE:
				return getInitialState();
			case ModelPackage.STATE_MACHINE__STATES:
				return getStates();
			case ModelPackage.STATE_MACHINE__RULES:
				return getRules();
			case ModelPackage.STATE_MACHINE__PARENT_STATE:
				return getParentState();
			case ModelPackage.STATE_MACHINE__PARENT_PROCEDURE:
				return getParentProcedure();
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
			case ModelPackage.STATE_MACHINE__INITIAL_STATE:
				setInitialState((String)newValue);
				return;
			case ModelPackage.STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ModelPackage.STATE_MACHINE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case ModelPackage.STATE_MACHINE__PARENT_STATE:
				setParentState((State)newValue);
				return;
			case ModelPackage.STATE_MACHINE__PARENT_PROCEDURE:
				setParentProcedure((Procedure)newValue);
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
			case ModelPackage.STATE_MACHINE__INITIAL_STATE:
				setInitialState(INITIAL_STATE_EDEFAULT);
				return;
			case ModelPackage.STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case ModelPackage.STATE_MACHINE__RULES:
				getRules().clear();
				return;
			case ModelPackage.STATE_MACHINE__PARENT_STATE:
				setParentState((State)null);
				return;
			case ModelPackage.STATE_MACHINE__PARENT_PROCEDURE:
				setParentProcedure((Procedure)null);
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
			case ModelPackage.STATE_MACHINE__INITIAL_STATE:
				return INITIAL_STATE_EDEFAULT == null ? initialState != null : !INITIAL_STATE_EDEFAULT.equals(initialState);
			case ModelPackage.STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case ModelPackage.STATE_MACHINE__RULES:
				return rules != null && !rules.isEmpty();
			case ModelPackage.STATE_MACHINE__PARENT_STATE:
				return getParentState() != null;
			case ModelPackage.STATE_MACHINE__PARENT_PROCEDURE:
				return getParentProcedure() != null;
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
		result.append(" (initialState: ");
		result.append(initialState);
		result.append(')');
		return result.toString();
	}

} //StateMachineImpl
