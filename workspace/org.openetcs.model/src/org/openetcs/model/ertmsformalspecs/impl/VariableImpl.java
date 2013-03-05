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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.DefaultValueElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Namespace;
import org.openetcs.model.ertmsformalspecs.ReferencesParagraph;
import org.openetcs.model.ertmsformalspecs.ReqRef;
import org.openetcs.model.ertmsformalspecs.ReqRelated;
import org.openetcs.model.ertmsformalspecs.Variable;
import org.openetcs.model.ertmsformalspecs.VariableMode;
import org.openetcs.model.ertmsformalspecs.VariableModeElement;
import org.openetcs.model.ertmsformalspecs.types.TypedElement;
import org.openetcs.model.ertmsformalspecs.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#isImplemented <em>Implemented</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#isVerified <em>Verified</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#isNeedsRequirement <em>Needs Requirement</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getVariableMode <em>Variable Mode</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getParentNamespace <em>Parent Namespace</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getSubVariables <em>Sub Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.impl.VariableImpl#getParentVariable <em>Parent Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends EObjectImpl implements Variable {
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
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableMode() <em>Variable Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableMode()
	 * @generated
	 * @ordered
	 */
	protected static final VariableMode VARIABLE_MODE_EDEFAULT = VariableMode.INCOMING;

	/**
	 * The cached value of the '{@link #getVariableMode() <em>Variable Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableMode()
	 * @generated
	 * @ordered
	 */
	protected VariableMode variableMode = VARIABLE_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubVariables() <em>Sub Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> subVariables;

	/**
	 * The cached value of the '{@link #getParentVariable() <em>Parent Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable parentVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqRef> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<ReqRef>(ReqRef.class, this, ModelPackage.VARIABLE__REQUIREMENTS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__IMPLEMENTED, oldImplemented, implemented));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__VERIFIED, oldVerified, verified));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__NEEDS_REQUIREMENT, oldNeedsRequirement, needsRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableMode getVariableMode() {
		return variableMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableMode(VariableMode newVariableMode) {
		VariableMode oldVariableMode = variableMode;
		variableMode = newVariableMode == null ? VARIABLE_MODE_EDEFAULT : newVariableMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__VARIABLE_MODE, oldVariableMode, variableMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getParentNamespace() {
		if (eContainerFeatureID() != ModelPackage.VARIABLE__PARENT_NAMESPACE) return null;
		return (Namespace)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNamespace(Namespace newParentNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentNamespace, ModelPackage.VARIABLE__PARENT_NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNamespace(Namespace newParentNamespace) {
		if (newParentNamespace != eInternalContainer() || (eContainerFeatureID() != ModelPackage.VARIABLE__PARENT_NAMESPACE && newParentNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newParentNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentNamespace != null)
				msgs = ((InternalEObject)newParentNamespace).eInverseAdd(this, ModelPackage.NAMESPACE__VARIABLES, Namespace.class, msgs);
			msgs = basicSetParentNamespace(newParentNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__PARENT_NAMESPACE, newParentNamespace, newParentNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getSubVariables() {
		if (subVariables == null) {
			subVariables = new EObjectContainmentEList<Variable>(Variable.class, this, ModelPackage.VARIABLE__SUB_VARIABLES);
		}
		return subVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getParentVariable() {
		if (parentVariable != null && parentVariable.eIsProxy()) {
			InternalEObject oldParentVariable = (InternalEObject)parentVariable;
			parentVariable = (Variable)eResolveProxy(oldParentVariable);
			if (parentVariable != oldParentVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.VARIABLE__PARENT_VARIABLE, oldParentVariable, parentVariable));
			}
		}
		return parentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetParentVariable() {
		return parentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentVariable(Variable newParentVariable) {
		Variable oldParentVariable = parentVariable;
		parentVariable = newParentVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.VARIABLE__PARENT_VARIABLE, oldParentVariable, parentVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.VARIABLE__PARENT_NAMESPACE:
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
			case ModelPackage.VARIABLE__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case ModelPackage.VARIABLE__PARENT_NAMESPACE:
				return basicSetParentNamespace(null, msgs);
			case ModelPackage.VARIABLE__SUB_VARIABLES:
				return ((InternalEList<?>)getSubVariables()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.VARIABLE__PARENT_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, ModelPackage.NAMESPACE__VARIABLES, Namespace.class, msgs);
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
			case ModelPackage.VARIABLE__NAME:
				return getName();
			case ModelPackage.VARIABLE__COMMENT:
				return getComment();
			case ModelPackage.VARIABLE__REQUIREMENTS:
				return getRequirements();
			case ModelPackage.VARIABLE__IMPLEMENTED:
				return isImplemented();
			case ModelPackage.VARIABLE__VERIFIED:
				return isVerified();
			case ModelPackage.VARIABLE__NEEDS_REQUIREMENT:
				return isNeedsRequirement();
			case ModelPackage.VARIABLE__TYPE_NAME:
				return getTypeName();
			case ModelPackage.VARIABLE__DEFAULT_VALUE:
				return getDefaultValue();
			case ModelPackage.VARIABLE__VARIABLE_MODE:
				return getVariableMode();
			case ModelPackage.VARIABLE__PARENT_NAMESPACE:
				return getParentNamespace();
			case ModelPackage.VARIABLE__SUB_VARIABLES:
				return getSubVariables();
			case ModelPackage.VARIABLE__PARENT_VARIABLE:
				if (resolve) return getParentVariable();
				return basicGetParentVariable();
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
			case ModelPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.VARIABLE__COMMENT:
				setComment((String)newValue);
				return;
			case ModelPackage.VARIABLE__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ReqRef>)newValue);
				return;
			case ModelPackage.VARIABLE__IMPLEMENTED:
				setImplemented((Boolean)newValue);
				return;
			case ModelPackage.VARIABLE__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case ModelPackage.VARIABLE__NEEDS_REQUIREMENT:
				setNeedsRequirement((Boolean)newValue);
				return;
			case ModelPackage.VARIABLE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ModelPackage.VARIABLE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case ModelPackage.VARIABLE__VARIABLE_MODE:
				setVariableMode((VariableMode)newValue);
				return;
			case ModelPackage.VARIABLE__PARENT_NAMESPACE:
				setParentNamespace((Namespace)newValue);
				return;
			case ModelPackage.VARIABLE__SUB_VARIABLES:
				getSubVariables().clear();
				getSubVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ModelPackage.VARIABLE__PARENT_VARIABLE:
				setParentVariable((Variable)newValue);
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
			case ModelPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ModelPackage.VARIABLE__IMPLEMENTED:
				setImplemented(IMPLEMENTED_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__NEEDS_REQUIREMENT:
				setNeedsRequirement(NEEDS_REQUIREMENT_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__VARIABLE_MODE:
				setVariableMode(VARIABLE_MODE_EDEFAULT);
				return;
			case ModelPackage.VARIABLE__PARENT_NAMESPACE:
				setParentNamespace((Namespace)null);
				return;
			case ModelPackage.VARIABLE__SUB_VARIABLES:
				getSubVariables().clear();
				return;
			case ModelPackage.VARIABLE__PARENT_VARIABLE:
				setParentVariable((Variable)null);
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
			case ModelPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.VARIABLE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ModelPackage.VARIABLE__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ModelPackage.VARIABLE__IMPLEMENTED:
				return implemented != IMPLEMENTED_EDEFAULT;
			case ModelPackage.VARIABLE__VERIFIED:
				return verified != VERIFIED_EDEFAULT;
			case ModelPackage.VARIABLE__NEEDS_REQUIREMENT:
				return needsRequirement != NEEDS_REQUIREMENT_EDEFAULT;
			case ModelPackage.VARIABLE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ModelPackage.VARIABLE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case ModelPackage.VARIABLE__VARIABLE_MODE:
				return variableMode != VARIABLE_MODE_EDEFAULT;
			case ModelPackage.VARIABLE__PARENT_NAMESPACE:
				return getParentNamespace() != null;
			case ModelPackage.VARIABLE__SUB_VARIABLES:
				return subVariables != null && !subVariables.isEmpty();
			case ModelPackage.VARIABLE__PARENT_VARIABLE:
				return parentVariable != null;
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
				case ModelPackage.VARIABLE__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (derivedFeatureID) {
				case ModelPackage.VARIABLE__REQUIREMENTS: return ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (derivedFeatureID) {
				case ModelPackage.VARIABLE__IMPLEMENTED: return ModelPackage.REQ_RELATED__IMPLEMENTED;
				case ModelPackage.VARIABLE__VERIFIED: return ModelPackage.REQ_RELATED__VERIFIED;
				case ModelPackage.VARIABLE__NEEDS_REQUIREMENT: return ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.VARIABLE__TYPE_NAME: return TypesPackage.TYPED_ELEMENT__TYPE_NAME;
				default: return -1;
			}
		}
		if (baseClass == DefaultValueElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.VARIABLE__DEFAULT_VALUE: return ModelPackage.DEFAULT_VALUE_ELEMENT__DEFAULT_VALUE;
				default: return -1;
			}
		}
		if (baseClass == VariableModeElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.VARIABLE__VARIABLE_MODE: return ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE;
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
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return ModelPackage.VARIABLE__COMMENT;
				default: return -1;
			}
		}
		if (baseClass == ReferencesParagraph.class) {
			switch (baseFeatureID) {
				case ModelPackage.REFERENCES_PARAGRAPH__REQUIREMENTS: return ModelPackage.VARIABLE__REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ReqRelated.class) {
			switch (baseFeatureID) {
				case ModelPackage.REQ_RELATED__IMPLEMENTED: return ModelPackage.VARIABLE__IMPLEMENTED;
				case ModelPackage.REQ_RELATED__VERIFIED: return ModelPackage.VARIABLE__VERIFIED;
				case ModelPackage.REQ_RELATED__NEEDS_REQUIREMENT: return ModelPackage.VARIABLE__NEEDS_REQUIREMENT;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case TypesPackage.TYPED_ELEMENT__TYPE_NAME: return ModelPackage.VARIABLE__TYPE_NAME;
				default: return -1;
			}
		}
		if (baseClass == DefaultValueElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.DEFAULT_VALUE_ELEMENT__DEFAULT_VALUE: return ModelPackage.VARIABLE__DEFAULT_VALUE;
				default: return -1;
			}
		}
		if (baseClass == VariableModeElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.VARIABLE_MODE_ELEMENT__VARIABLE_MODE: return ModelPackage.VARIABLE__VARIABLE_MODE;
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
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", variableMode: ");
		result.append(variableMode);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
