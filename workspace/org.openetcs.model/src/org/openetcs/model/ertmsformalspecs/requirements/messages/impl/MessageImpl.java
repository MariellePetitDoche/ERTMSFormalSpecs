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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Media;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Message;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MessageImpl#getMedia <em>Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends EObjectImpl implements Message {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageVariable> variables;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected Media media;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagesPackage.Literals.MESSAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MessagesPackage.MESSAGE__BASELINE, oldBaseline, baseline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE__BASELINE, oldBaseline, baseline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<MessageVariable>(MessageVariable.class, this, MessagesPackage.MESSAGE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media getMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedia(Media newMedia, NotificationChain msgs) {
		Media oldMedia = media;
		media = newMedia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE__MEDIA, oldMedia, newMedia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(Media newMedia) {
		if (newMedia != media) {
			NotificationChain msgs = null;
			if (media != null)
				msgs = ((InternalEObject)media).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.MESSAGE__MEDIA, null, msgs);
			if (newMedia != null)
				msgs = ((InternalEObject)newMedia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.MESSAGE__MEDIA, null, msgs);
			msgs = basicSetMedia(newMedia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MESSAGE__MEDIA, newMedia, newMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessagesPackage.MESSAGE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case MessagesPackage.MESSAGE__MEDIA:
				return basicSetMedia(null, msgs);
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
			case MessagesPackage.MESSAGE__BASELINE:
				if (resolve) return getBaseline();
				return basicGetBaseline();
			case MessagesPackage.MESSAGE__DESCRIPTION:
				return getDescription();
			case MessagesPackage.MESSAGE__VARIABLES:
				return getVariables();
			case MessagesPackage.MESSAGE__MEDIA:
				return getMedia();
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
			case MessagesPackage.MESSAGE__BASELINE:
				setBaseline((BaseLine)newValue);
				return;
			case MessagesPackage.MESSAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MessagesPackage.MESSAGE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends MessageVariable>)newValue);
				return;
			case MessagesPackage.MESSAGE__MEDIA:
				setMedia((Media)newValue);
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
			case MessagesPackage.MESSAGE__BASELINE:
				setBaseline((BaseLine)null);
				return;
			case MessagesPackage.MESSAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MessagesPackage.MESSAGE__VARIABLES:
				getVariables().clear();
				return;
			case MessagesPackage.MESSAGE__MEDIA:
				setMedia((Media)null);
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
			case MessagesPackage.MESSAGE__BASELINE:
				return baseline != null;
			case MessagesPackage.MESSAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MessagesPackage.MESSAGE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case MessagesPackage.MESSAGE__MEDIA:
				return media != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
