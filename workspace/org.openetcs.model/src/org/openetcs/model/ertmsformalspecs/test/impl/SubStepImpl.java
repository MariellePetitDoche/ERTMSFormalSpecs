/**
 */
package org.openetcs.model.ertmsformalspecs.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.behaviour.Action;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;
import org.openetcs.model.ertmsformalspecs.test.Expectation;
import org.openetcs.model.ertmsformalspecs.test.Step;
import org.openetcs.model.ertmsformalspecs.test.SubStep;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;
import org.openetcs.model.ertmsformalspecs.translation.Translation;
import org.openetcs.model.ertmsformalspecs.translation.TranslationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl#getExpectations <em>Expectations</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl#isSkipEngine <em>Skip Engine</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubStepImpl#getParentTranslation <em>Parent Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubStepImpl extends EObjectImpl implements SubStep {
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
	 * The cached value of the '{@link #getExpectations() <em>Expectations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectations()
	 * @generated
	 * @ordered
	 */
	protected EList<Expectation> expectations;

	/**
	 * The default value of the '{@link #isSkipEngine() <em>Skip Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipEngine()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SKIP_ENGINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSkipEngine() <em>Skip Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSkipEngine()
	 * @generated
	 * @ordered
	 */
	protected boolean skipEngine = SKIP_ENGINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.SUB_STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getParentStep() {
		if (eContainerFeatureID() != TestPackage.SUB_STEP__PARENT_STEP) return null;
		return (Step)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentStep(Step newParentStep, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentStep, TestPackage.SUB_STEP__PARENT_STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStep(Step newParentStep) {
		if (newParentStep != eInternalContainer() || (eContainerFeatureID() != TestPackage.SUB_STEP__PARENT_STEP && newParentStep != null)) {
			if (EcoreUtil.isAncestor(this, newParentStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentStep != null)
				msgs = ((InternalEObject)newParentStep).eInverseAdd(this, TestPackage.STEP__SUB_STEPS, Step.class, msgs);
			msgs = basicSetParentStep(newParentStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_STEP__PARENT_STEP, newParentStep, newParentStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, TestPackage.SUB_STEP__ACTIONS, BehaviourPackage.ACTION__PARENT_SUB_STEP);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expectation> getExpectations() {
		if (expectations == null) {
			expectations = new EObjectContainmentWithInverseEList<Expectation>(Expectation.class, this, TestPackage.SUB_STEP__EXPECTATIONS, TestPackage.EXPECTATION__PARENT_SUB_STEP);
		}
		return expectations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSkipEngine() {
		return skipEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipEngine(boolean newSkipEngine) {
		boolean oldSkipEngine = skipEngine;
		skipEngine = newSkipEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_STEP__SKIP_ENGINE, oldSkipEngine, skipEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation getParentTranslation() {
		if (eContainerFeatureID() != TestPackage.SUB_STEP__PARENT_TRANSLATION) return null;
		return (Translation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentTranslation(Translation newParentTranslation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentTranslation, TestPackage.SUB_STEP__PARENT_TRANSLATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTranslation(Translation newParentTranslation) {
		if (newParentTranslation != eInternalContainer() || (eContainerFeatureID() != TestPackage.SUB_STEP__PARENT_TRANSLATION && newParentTranslation != null)) {
			if (EcoreUtil.isAncestor(this, newParentTranslation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentTranslation != null)
				msgs = ((InternalEObject)newParentTranslation).eInverseAdd(this, TranslationPackage.TRANSLATION__SUB_STEPS, Translation.class, msgs);
			msgs = basicSetParentTranslation(newParentTranslation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_STEP__PARENT_TRANSLATION, newParentTranslation, newParentTranslation));
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
			case TestPackage.SUB_STEP__PARENT_STEP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentStep((Step)otherEnd, msgs);
			case TestPackage.SUB_STEP__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
			case TestPackage.SUB_STEP__EXPECTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExpectations()).basicAdd(otherEnd, msgs);
			case TestPackage.SUB_STEP__PARENT_TRANSLATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentTranslation((Translation)otherEnd, msgs);
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
			case TestPackage.SUB_STEP__PARENT_STEP:
				return basicSetParentStep(null, msgs);
			case TestPackage.SUB_STEP__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case TestPackage.SUB_STEP__EXPECTATIONS:
				return ((InternalEList<?>)getExpectations()).basicRemove(otherEnd, msgs);
			case TestPackage.SUB_STEP__PARENT_TRANSLATION:
				return basicSetParentTranslation(null, msgs);
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
			case TestPackage.SUB_STEP__PARENT_STEP:
				return eInternalContainer().eInverseRemove(this, TestPackage.STEP__SUB_STEPS, Step.class, msgs);
			case TestPackage.SUB_STEP__PARENT_TRANSLATION:
				return eInternalContainer().eInverseRemove(this, TranslationPackage.TRANSLATION__SUB_STEPS, Translation.class, msgs);
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
			case TestPackage.SUB_STEP__NAME:
				return getName();
			case TestPackage.SUB_STEP__PARENT_STEP:
				return getParentStep();
			case TestPackage.SUB_STEP__ACTIONS:
				return getActions();
			case TestPackage.SUB_STEP__EXPECTATIONS:
				return getExpectations();
			case TestPackage.SUB_STEP__SKIP_ENGINE:
				return isSkipEngine();
			case TestPackage.SUB_STEP__PARENT_TRANSLATION:
				return getParentTranslation();
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
			case TestPackage.SUB_STEP__NAME:
				setName((String)newValue);
				return;
			case TestPackage.SUB_STEP__PARENT_STEP:
				setParentStep((Step)newValue);
				return;
			case TestPackage.SUB_STEP__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case TestPackage.SUB_STEP__EXPECTATIONS:
				getExpectations().clear();
				getExpectations().addAll((Collection<? extends Expectation>)newValue);
				return;
			case TestPackage.SUB_STEP__SKIP_ENGINE:
				setSkipEngine((Boolean)newValue);
				return;
			case TestPackage.SUB_STEP__PARENT_TRANSLATION:
				setParentTranslation((Translation)newValue);
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
			case TestPackage.SUB_STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.SUB_STEP__PARENT_STEP:
				setParentStep((Step)null);
				return;
			case TestPackage.SUB_STEP__ACTIONS:
				getActions().clear();
				return;
			case TestPackage.SUB_STEP__EXPECTATIONS:
				getExpectations().clear();
				return;
			case TestPackage.SUB_STEP__SKIP_ENGINE:
				setSkipEngine(SKIP_ENGINE_EDEFAULT);
				return;
			case TestPackage.SUB_STEP__PARENT_TRANSLATION:
				setParentTranslation((Translation)null);
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
			case TestPackage.SUB_STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.SUB_STEP__PARENT_STEP:
				return getParentStep() != null;
			case TestPackage.SUB_STEP__ACTIONS:
				return actions != null && !actions.isEmpty();
			case TestPackage.SUB_STEP__EXPECTATIONS:
				return expectations != null && !expectations.isEmpty();
			case TestPackage.SUB_STEP__SKIP_ENGINE:
				return skipEngine != SKIP_ENGINE_EDEFAULT;
			case TestPackage.SUB_STEP__PARENT_TRANSLATION:
				return getParentTranslation() != null;
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
		result.append(", skipEngine: ");
		result.append(skipEngine);
		result.append(')');
		return result.toString();
	}

} //SubStepImpl
