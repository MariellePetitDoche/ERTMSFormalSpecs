/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Media;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl#isBalise <em>Balise</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl#isLoop <em>Loop</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl#isRbc <em>Rbc</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.impl.MediaImpl#isRiu <em>Riu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaImpl extends EObjectImpl implements Media {
	/**
	 * The default value of the '{@link #isBalise() <em>Balise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BALISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBalise() <em>Balise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBalise()
	 * @generated
	 * @ordered
	 */
	protected boolean balise = BALISE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected boolean loop = LOOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isRbc() <em>Rbc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRbc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RBC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRbc() <em>Rbc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRbc()
	 * @generated
	 * @ordered
	 */
	protected boolean rbc = RBC_EDEFAULT;

	/**
	 * The default value of the '{@link #isRiu() <em>Riu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRiu()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RIU_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRiu() <em>Riu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRiu()
	 * @generated
	 * @ordered
	 */
	protected boolean riu = RIU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MessagesPackage.Literals.MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBalise() {
		return balise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalise(boolean newBalise) {
		boolean oldBalise = balise;
		balise = newBalise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MEDIA__BALISE, oldBalise, balise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(boolean newLoop) {
		boolean oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MEDIA__LOOP, oldLoop, loop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRbc() {
		return rbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRbc(boolean newRbc) {
		boolean oldRbc = rbc;
		rbc = newRbc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MEDIA__RBC, oldRbc, rbc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRiu() {
		return riu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiu(boolean newRiu) {
		boolean oldRiu = riu;
		riu = newRiu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MessagesPackage.MEDIA__RIU, oldRiu, riu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MessagesPackage.MEDIA__BALISE:
				return isBalise();
			case MessagesPackage.MEDIA__LOOP:
				return isLoop();
			case MessagesPackage.MEDIA__RBC:
				return isRbc();
			case MessagesPackage.MEDIA__RIU:
				return isRiu();
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
			case MessagesPackage.MEDIA__BALISE:
				setBalise((Boolean)newValue);
				return;
			case MessagesPackage.MEDIA__LOOP:
				setLoop((Boolean)newValue);
				return;
			case MessagesPackage.MEDIA__RBC:
				setRbc((Boolean)newValue);
				return;
			case MessagesPackage.MEDIA__RIU:
				setRiu((Boolean)newValue);
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
			case MessagesPackage.MEDIA__BALISE:
				setBalise(BALISE_EDEFAULT);
				return;
			case MessagesPackage.MEDIA__LOOP:
				setLoop(LOOP_EDEFAULT);
				return;
			case MessagesPackage.MEDIA__RBC:
				setRbc(RBC_EDEFAULT);
				return;
			case MessagesPackage.MEDIA__RIU:
				setRiu(RIU_EDEFAULT);
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
			case MessagesPackage.MEDIA__BALISE:
				return balise != BALISE_EDEFAULT;
			case MessagesPackage.MEDIA__LOOP:
				return loop != LOOP_EDEFAULT;
			case MessagesPackage.MEDIA__RBC:
				return rbc != RBC_EDEFAULT;
			case MessagesPackage.MEDIA__RIU:
				return riu != RIU_EDEFAULT;
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
		result.append(" (balise: ");
		result.append(balise);
		result.append(", loop: ");
		result.append(loop);
		result.append(", rbc: ");
		result.append(rbc);
		result.append(", riu: ");
		result.append(riu);
		result.append(')');
		return result.toString();
	}

} //MediaImpl
