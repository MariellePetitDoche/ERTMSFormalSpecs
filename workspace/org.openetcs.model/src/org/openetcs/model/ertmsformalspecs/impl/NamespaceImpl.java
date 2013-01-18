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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Namespace;
import org.openetcs.model.ertmsformalspecs.Procedure;
import org.openetcs.model.ertmsformalspecs.Variable;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.types.Type;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getParentDictionary <em>Parent Dictionary</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getSubNamespaces <em>Sub Namespaces</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getParentNamespace <em>Parent Namespace</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.NamespaceImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceImpl extends EObjectImpl implements Namespace {
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
	 * The cached value of the '{@link #getSubNamespaces() <em>Sub Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Namespace> subNamespaces;

	/**
	 * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedures()
	 * @generated
	 * @ordered
	 */
	protected EList<Procedure> procedures;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

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
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.NAMESPACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NAMESPACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dictionary getParentDictionary() {
		if (eContainerFeatureID() != ModelPackage.NAMESPACE__PARENT_DICTIONARY) return null;
		return (Dictionary)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDictionary(Dictionary newParentDictionary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentDictionary, ModelPackage.NAMESPACE__PARENT_DICTIONARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDictionary(Dictionary newParentDictionary) {
		if (newParentDictionary != eInternalContainer() || (eContainerFeatureID() != ModelPackage.NAMESPACE__PARENT_DICTIONARY && newParentDictionary != null)) {
			if (EcoreUtil.isAncestor(this, newParentDictionary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentDictionary != null)
				msgs = ((InternalEObject)newParentDictionary).eInverseAdd(this, ModelPackage.DICTIONARY__NAMESPACES, Dictionary.class, msgs);
			msgs = basicSetParentDictionary(newParentDictionary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NAMESPACE__PARENT_DICTIONARY, newParentDictionary, newParentDictionary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Namespace> getSubNamespaces() {
		if (subNamespaces == null) {
			subNamespaces = new EObjectContainmentWithInverseEList<Namespace>(Namespace.class, this, ModelPackage.NAMESPACE__SUB_NAMESPACES, ModelPackage.NAMESPACE__PARENT_NAMESPACE);
		}
		return subNamespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getParentNamespace() {
		if (eContainerFeatureID() != ModelPackage.NAMESPACE__PARENT_NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNamespace(Namespace newParentNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNamespace, ModelPackage.NAMESPACE__PARENT_NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNamespace(Namespace newParentNamespace) {
		if (newParentNamespace != eInternalContainer() || (eContainerFeatureID() != ModelPackage.NAMESPACE__PARENT_NAMESPACE && newParentNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newParentNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNamespace != null)
				msgs = ((InternalEObject)newParentNamespace).eInverseAdd(this, ModelPackage.NAMESPACE__SUB_NAMESPACES, Namespace.class, msgs);
			msgs = basicSetParentNamespace(newParentNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.NAMESPACE__PARENT_NAMESPACE, newParentNamespace, newParentNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getProcedures() {
		if (procedures == null) {
			procedures = new EObjectContainmentWithInverseEList<Procedure>(Procedure.class, this, ModelPackage.NAMESPACE__PROCEDURES, ModelPackage.PROCEDURE__PARENT_NAMESPACE);
		}
		return procedures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentWithInverseEList<Type>(Type.class, this, ModelPackage.NAMESPACE__TYPES, TypesPackage.TYPE__PARENT_NAMESPACE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, ModelPackage.NAMESPACE__VARIABLES, ModelPackage.VARIABLE__PARENT_NAMESPACE);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, ModelPackage.NAMESPACE__RULES);
		}
		return rules;
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
			case ModelPackage.NAMESPACE__PARENT_DICTIONARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentDictionary((Dictionary)otherEnd, msgs);
			case ModelPackage.NAMESPACE__SUB_NAMESPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubNamespaces()).basicAdd(otherEnd, msgs);
			case ModelPackage.NAMESPACE__PARENT_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentNamespace((Namespace)otherEnd, msgs);
			case ModelPackage.NAMESPACE__PROCEDURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProcedures()).basicAdd(otherEnd, msgs);
			case ModelPackage.NAMESPACE__TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypes()).basicAdd(otherEnd, msgs);
			case ModelPackage.NAMESPACE__VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariables()).basicAdd(otherEnd, msgs);
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
			case ModelPackage.NAMESPACE__PARENT_DICTIONARY:
				return basicSetParentDictionary(null, msgs);
			case ModelPackage.NAMESPACE__SUB_NAMESPACES:
				return ((InternalEList<?>)getSubNamespaces()).basicRemove(otherEnd, msgs);
			case ModelPackage.NAMESPACE__PARENT_NAMESPACE:
				return basicSetParentNamespace(null, msgs);
			case ModelPackage.NAMESPACE__PROCEDURES:
				return ((InternalEList<?>)getProcedures()).basicRemove(otherEnd, msgs);
			case ModelPackage.NAMESPACE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ModelPackage.NAMESPACE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ModelPackage.NAMESPACE__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.NAMESPACE__PARENT_DICTIONARY:
				return eInternalContainer().eInverseRemove(this, ModelPackage.DICTIONARY__NAMESPACES, Dictionary.class, msgs);
			case ModelPackage.NAMESPACE__PARENT_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.NAMESPACE__SUB_NAMESPACES, Namespace.class, msgs);
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
			case ModelPackage.NAMESPACE__NAME:
				return getName();
			case ModelPackage.NAMESPACE__PARENT_DICTIONARY:
				return getParentDictionary();
			case ModelPackage.NAMESPACE__SUB_NAMESPACES:
				return getSubNamespaces();
			case ModelPackage.NAMESPACE__PARENT_NAMESPACE:
				return getParentNamespace();
			case ModelPackage.NAMESPACE__PROCEDURES:
				return getProcedures();
			case ModelPackage.NAMESPACE__TYPES:
				return getTypes();
			case ModelPackage.NAMESPACE__VARIABLES:
				return getVariables();
			case ModelPackage.NAMESPACE__RULES:
				return getRules();
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
			case ModelPackage.NAMESPACE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.NAMESPACE__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)newValue);
				return;
			case ModelPackage.NAMESPACE__SUB_NAMESPACES:
				getSubNamespaces().clear();
				getSubNamespaces().addAll((Collection<? extends Namespace>)newValue);
				return;
			case ModelPackage.NAMESPACE__PARENT_NAMESPACE:
				setParentNamespace((Namespace)newValue);
				return;
			case ModelPackage.NAMESPACE__PROCEDURES:
				getProcedures().clear();
				getProcedures().addAll((Collection<? extends Procedure>)newValue);
				return;
			case ModelPackage.NAMESPACE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ModelPackage.NAMESPACE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ModelPackage.NAMESPACE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
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
			case ModelPackage.NAMESPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.NAMESPACE__PARENT_DICTIONARY:
				setParentDictionary((Dictionary)null);
				return;
			case ModelPackage.NAMESPACE__SUB_NAMESPACES:
				getSubNamespaces().clear();
				return;
			case ModelPackage.NAMESPACE__PARENT_NAMESPACE:
				setParentNamespace((Namespace)null);
				return;
			case ModelPackage.NAMESPACE__PROCEDURES:
				getProcedures().clear();
				return;
			case ModelPackage.NAMESPACE__TYPES:
				getTypes().clear();
				return;
			case ModelPackage.NAMESPACE__VARIABLES:
				getVariables().clear();
				return;
			case ModelPackage.NAMESPACE__RULES:
				getRules().clear();
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
			case ModelPackage.NAMESPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.NAMESPACE__PARENT_DICTIONARY:
				return getParentDictionary() != null;
			case ModelPackage.NAMESPACE__SUB_NAMESPACES:
				return subNamespaces != null && !subNamespaces.isEmpty();
			case ModelPackage.NAMESPACE__PARENT_NAMESPACE:
				return getParentNamespace() != null;
			case ModelPackage.NAMESPACE__PROCEDURES:
				return procedures != null && !procedures.isEmpty();
			case ModelPackage.NAMESPACE__TYPES:
				return types != null && !types.isEmpty();
			case ModelPackage.NAMESPACE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ModelPackage.NAMESPACE__RULES:
				return rules != null && !rules.isEmpty();
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

} //NamespaceImpl
