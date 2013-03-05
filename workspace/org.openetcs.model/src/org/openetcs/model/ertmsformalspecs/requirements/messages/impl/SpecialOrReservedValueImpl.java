/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Mask;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Or Reserved Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.SpecialOrReservedValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecialOrReservedValueImpl extends EObjectImpl implements SpecialOrReservedValue {
	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected Mask mask;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected IMatch match;

	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected Meaning meaning;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected SingleValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialOrReservedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagesPackage.Literals.SPECIAL_OR_RESERVED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mask getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMask(Mask newMask, NotificationChain msgs) {
		Mask oldMask = mask;
		mask = newMask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK, oldMask, newMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(Mask newMask) {
		if (newMask != mask) {
			NotificationChain msgs = null;
			if (mask != null)
				msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK, null, msgs);
			if (newMask != null)
				msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK, null, msgs);
			msgs = basicSetMask(newMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK, newMask, newMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMatch getMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(IMatch newMatch, NotificationChain msgs) {
		IMatch oldMatch = match;
		match = newMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH, oldMatch, newMatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(IMatch newMatch) {
		if (newMatch != match) {
			NotificationChain msgs = null;
			if (match != null)
				msgs = ((InternalEObject)match).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH, null, msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH, null, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meaning getMeaning() {
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeaning(Meaning newMeaning, NotificationChain msgs) {
		Meaning oldMeaning = meaning;
		meaning = newMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING, oldMeaning, newMeaning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaning(Meaning newMeaning) {
		if (newMeaning != meaning) {
			NotificationChain msgs = null;
			if (meaning != null)
				msgs = ((InternalEObject)meaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING, null, msgs);
			if (newMeaning != null)
				msgs = ((InternalEObject)newMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING, null, msgs);
			msgs = basicSetMeaning(newMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING, newMeaning, newMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(SingleValue newValue, NotificationChain msgs) {
		SingleValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(SingleValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK:
				return basicSetMask(null, msgs);
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH:
				return basicSetMatch(null, msgs);
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING:
				return basicSetMeaning(null, msgs);
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE:
				return basicSetValue(null, msgs);
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
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK:
				return getMask();
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH:
				return getMatch();
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING:
				return getMeaning();
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE:
				return getValue();
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
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK:
				setMask((Mask)newValue);
				return;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH:
				setMatch((IMatch)newValue);
				return;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING:
				setMeaning((Meaning)newValue);
				return;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE:
				setValue((SingleValue)newValue);
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
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK:
				setMask((Mask)null);
				return;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH:
				setMatch((IMatch)null);
				return;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING:
				setMeaning((Meaning)null);
				return;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE:
				setValue((SingleValue)null);
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
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MASK:
				return mask != null;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MATCH:
				return match != null;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__MEANING:
				return meaning != null;
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecialOrReservedValueImpl
