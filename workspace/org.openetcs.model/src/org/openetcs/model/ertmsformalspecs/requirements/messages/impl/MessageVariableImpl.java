/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.impl;

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
import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl#getSubVariables <em>Sub Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageVariableImpl#getParentVariable <em>Parent Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageVariableImpl extends EObjectImpl implements MessageVariable {
	/**
	 * The cached value of the '{@link #getBaseline() <em>Baseline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected BaseLine baseline;

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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final String LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected String length = LENGTH_EDEFAULT;

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
	 * The cached value of the '{@link #getSubVariables() <em>Sub Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageVariable> subVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagesPackage.Literals.MESSAGE_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseLine getBaseline() {
		if (baseline != null && baseline.eIsProxy()) {
			InternalEObject oldBaseline = (InternalEObject)baseline;
			baseline = (BaseLine)eResolveProxy(oldBaseline);
			if (baseline != oldBaseline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MessagesPackage.MESSAGE_VARIABLE__BASELINE, oldBaseline, baseline));
			}
		}
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseLine basicGetBaseline() {
		return baseline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseline(BaseLine newBaseline) {
		BaseLine oldBaseline = baseline;
		baseline = newBaseline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE_VARIABLE__BASELINE, oldBaseline, baseline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(String newLength) {
		String oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE_VARIABLE__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE_VARIABLE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageVariable> getSubVariables() {
		if (subVariables == null) {
			subVariables = new EObjectContainmentWithInverseEList<MessageVariable>(MessageVariable.class, this, MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES, MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE);
		}
		return subVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVariable getParentVariable() {
		if (eContainerFeatureID() != MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE) return null;
		return (MessageVariable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentVariable(MessageVariable newParentVariable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentVariable, MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentVariable(MessageVariable newParentVariable) {
		if (newParentVariable != eInternalContainer() || (eContainerFeatureID() != MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE && newParentVariable != null)) {
			if (EcoreUtil.isAncestor(this, newParentVariable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentVariable != null)
				msgs = ((InternalEObject)newParentVariable).eInverseAdd(this, MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES, MessageVariable.class, msgs);
			msgs = basicSetParentVariable(newParentVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE, newParentVariable, newParentVariable));
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
			case MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubVariables()).basicAdd(otherEnd, msgs);
			case MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentVariable((MessageVariable)otherEnd, msgs);
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
			case MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES:
				return ((InternalEList<?>)getSubVariables()).basicRemove(otherEnd, msgs);
			case MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE:
				return basicSetParentVariable(null, msgs);
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
			case MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE:
				return eInternalContainer().eInverseRemove(this, MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES, MessageVariable.class, msgs);
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
			case MessagesPackage.MESSAGE_VARIABLE__BASELINE:
				if (resolve) return getBaseline();
				return basicGetBaseline();
			case MessagesPackage.MESSAGE_VARIABLE__NAME:
				return getName();
			case MessagesPackage.MESSAGE_VARIABLE__LENGTH:
				return getLength();
			case MessagesPackage.MESSAGE_VARIABLE__COMMENT:
				return getComment();
			case MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES:
				return getSubVariables();
			case MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE:
				return getParentVariable();
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
			case MessagesPackage.MESSAGE_VARIABLE__BASELINE:
				setBaseline((BaseLine)newValue);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__LENGTH:
				setLength((String)newValue);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__COMMENT:
				setComment((String)newValue);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES:
				getSubVariables().clear();
				getSubVariables().addAll((Collection<? extends MessageVariable>)newValue);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE:
				setParentVariable((MessageVariable)newValue);
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
			case MessagesPackage.MESSAGE_VARIABLE__BASELINE:
				setBaseline((BaseLine)null);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES:
				getSubVariables().clear();
				return;
			case MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE:
				setParentVariable((MessageVariable)null);
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
			case MessagesPackage.MESSAGE_VARIABLE__BASELINE:
				return baseline != null;
			case MessagesPackage.MESSAGE_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MessagesPackage.MESSAGE_VARIABLE__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case MessagesPackage.MESSAGE_VARIABLE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case MessagesPackage.MESSAGE_VARIABLE__SUB_VARIABLES:
				return subVariables != null && !subVariables.isEmpty();
			case MessagesPackage.MESSAGE_VARIABLE__PARENT_VARIABLE:
				return getParentVariable() != null;
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
		result.append(", length: ");
		result.append(length);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //MessageVariableImpl
