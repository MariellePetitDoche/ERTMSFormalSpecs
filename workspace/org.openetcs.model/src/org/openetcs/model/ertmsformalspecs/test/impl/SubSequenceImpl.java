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

import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.ModelPackage;

import org.openetcs.model.ertmsformalspecs.test.Frame;
import org.openetcs.model.ertmsformalspecs.test.SubSequence;
import org.openetcs.model.ertmsformalspecs.test.TestCase;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getParentFrame <em>Parent Frame</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getDLRBG <em>DLRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getNidLRBG <em>Nid LRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getQDirLRBG <em>QDir LRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getQDirTrain <em>QDir Train</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getQDLRBG <em>QDLRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getRbcId <em>Rbc Id</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getRbcPhone <em>Rbc Phone</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.SubSequenceImpl#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubSequenceImpl extends EObjectImpl implements SubSequence {
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
	 * The default value of the '{@link #getDLRBG() <em>DLRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLRBG()
	 * @generated
	 * @ordered
	 */
	protected static final String DLRBG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDLRBG() <em>DLRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLRBG()
	 * @generated
	 * @ordered
	 */
	protected String dLRBG = DLRBG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNidLRBG() <em>Nid LRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNidLRBG()
	 * @generated
	 * @ordered
	 */
	protected static final String NID_LRBG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNidLRBG() <em>Nid LRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNidLRBG()
	 * @generated
	 * @ordered
	 */
	protected String nidLRBG = NID_LRBG_EDEFAULT;

	/**
	 * The default value of the '{@link #getQDirLRBG() <em>QDir LRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDirLRBG()
	 * @generated
	 * @ordered
	 */
	protected static final String QDIR_LRBG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQDirLRBG() <em>QDir LRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDirLRBG()
	 * @generated
	 * @ordered
	 */
	protected String qDirLRBG = QDIR_LRBG_EDEFAULT;

	/**
	 * The default value of the '{@link #getQDirTrain() <em>QDir Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDirTrain()
	 * @generated
	 * @ordered
	 */
	protected static final String QDIR_TRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQDirTrain() <em>QDir Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDirTrain()
	 * @generated
	 * @ordered
	 */
	protected String qDirTrain = QDIR_TRAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getQDLRBG() <em>QDLRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDLRBG()
	 * @generated
	 * @ordered
	 */
	protected static final String QDLRBG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQDLRBG() <em>QDLRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQDLRBG()
	 * @generated
	 * @ordered
	 */
	protected String qDLRBG = QDLRBG_EDEFAULT;

	/**
	 * The default value of the '{@link #getRbcId() <em>Rbc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbcId()
	 * @generated
	 * @ordered
	 */
	protected static final String RBC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRbcId() <em>Rbc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbcId()
	 * @generated
	 * @ordered
	 */
	protected String rbcId = RBC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRbcPhone() <em>Rbc Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbcPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String RBC_PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRbcPhone() <em>Rbc Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbcPhone()
	 * @generated
	 * @ordered
	 */
	protected String rbcPhone = RBC_PHONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTestCases() <em>Test Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCases()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.SUB_SEQUENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frame getParentFrame() {
		if (eContainerFeatureID() != TestPackage.SUB_SEQUENCE__PARENT_FRAME) return null;
		return (Frame)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentFrame(Frame newParentFrame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentFrame, TestPackage.SUB_SEQUENCE__PARENT_FRAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentFrame(Frame newParentFrame) {
		if (newParentFrame != eInternalContainer() || (eContainerFeatureID() != TestPackage.SUB_SEQUENCE__PARENT_FRAME && newParentFrame != null)) {
			if (EcoreUtil.isAncestor(this, newParentFrame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFrame != null)
				msgs = ((InternalEObject)newParentFrame).eInverseAdd(this, TestPackage.FRAME__SUB_SEQUENCES, Frame.class, msgs);
			msgs = basicSetParentFrame(newParentFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__PARENT_FRAME, newParentFrame, newParentFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDLRBG() {
		return dLRBG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLRBG(String newDLRBG) {
		String oldDLRBG = dLRBG;
		dLRBG = newDLRBG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__DLRBG, oldDLRBG, dLRBG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNidLRBG() {
		return nidLRBG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNidLRBG(String newNidLRBG) {
		String oldNidLRBG = nidLRBG;
		nidLRBG = newNidLRBG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__NID_LRBG, oldNidLRBG, nidLRBG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQDirLRBG() {
		return qDirLRBG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQDirLRBG(String newQDirLRBG) {
		String oldQDirLRBG = qDirLRBG;
		qDirLRBG = newQDirLRBG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__QDIR_LRBG, oldQDirLRBG, qDirLRBG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQDirTrain() {
		return qDirTrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQDirTrain(String newQDirTrain) {
		String oldQDirTrain = qDirTrain;
		qDirTrain = newQDirTrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__QDIR_TRAIN, oldQDirTrain, qDirTrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQDLRBG() {
		return qDLRBG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQDLRBG(String newQDLRBG) {
		String oldQDLRBG = qDLRBG;
		qDLRBG = newQDLRBG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__QDLRBG, oldQDLRBG, qDLRBG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRbcId() {
		return rbcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRbcId(String newRbcId) {
		String oldRbcId = rbcId;
		rbcId = newRbcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__RBC_ID, oldRbcId, rbcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRbcPhone() {
		return rbcPhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRbcPhone(String newRbcPhone) {
		String oldRbcPhone = rbcPhone;
		rbcPhone = newRbcPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.SUB_SEQUENCE__RBC_PHONE, oldRbcPhone, rbcPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestCases() {
		if (testCases == null) {
			testCases = new EObjectContainmentWithInverseEList<TestCase>(TestCase.class, this, TestPackage.SUB_SEQUENCE__TEST_CASES, TestPackage.TEST_CASE__PARENT_SUB_SEQUENCE);
		}
		return testCases;
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
			case TestPackage.SUB_SEQUENCE__PARENT_FRAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentFrame((Frame)otherEnd, msgs);
			case TestPackage.SUB_SEQUENCE__TEST_CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTestCases()).basicAdd(otherEnd, msgs);
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
			case TestPackage.SUB_SEQUENCE__PARENT_FRAME:
				return basicSetParentFrame(null, msgs);
			case TestPackage.SUB_SEQUENCE__TEST_CASES:
				return ((InternalEList<?>)getTestCases()).basicRemove(otherEnd, msgs);
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
			case TestPackage.SUB_SEQUENCE__PARENT_FRAME:
				return eInternalContainer().eInverseRemove(this, TestPackage.FRAME__SUB_SEQUENCES, Frame.class, msgs);
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
			case TestPackage.SUB_SEQUENCE__NAME:
				return getName();
			case TestPackage.SUB_SEQUENCE__COMMENT:
				return getComment();
			case TestPackage.SUB_SEQUENCE__PARENT_FRAME:
				return getParentFrame();
			case TestPackage.SUB_SEQUENCE__DLRBG:
				return getDLRBG();
			case TestPackage.SUB_SEQUENCE__LEVEL:
				return getLevel();
			case TestPackage.SUB_SEQUENCE__MODE:
				return getMode();
			case TestPackage.SUB_SEQUENCE__NID_LRBG:
				return getNidLRBG();
			case TestPackage.SUB_SEQUENCE__QDIR_LRBG:
				return getQDirLRBG();
			case TestPackage.SUB_SEQUENCE__QDIR_TRAIN:
				return getQDirTrain();
			case TestPackage.SUB_SEQUENCE__QDLRBG:
				return getQDLRBG();
			case TestPackage.SUB_SEQUENCE__RBC_ID:
				return getRbcId();
			case TestPackage.SUB_SEQUENCE__RBC_PHONE:
				return getRbcPhone();
			case TestPackage.SUB_SEQUENCE__TEST_CASES:
				return getTestCases();
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
			case TestPackage.SUB_SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__COMMENT:
				setComment((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__PARENT_FRAME:
				setParentFrame((Frame)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__DLRBG:
				setDLRBG((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__LEVEL:
				setLevel((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__MODE:
				setMode((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__NID_LRBG:
				setNidLRBG((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__QDIR_LRBG:
				setQDirLRBG((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__QDIR_TRAIN:
				setQDirTrain((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__QDLRBG:
				setQDLRBG((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__RBC_ID:
				setRbcId((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__RBC_PHONE:
				setRbcPhone((String)newValue);
				return;
			case TestPackage.SUB_SEQUENCE__TEST_CASES:
				getTestCases().clear();
				getTestCases().addAll((Collection<? extends TestCase>)newValue);
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
			case TestPackage.SUB_SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__PARENT_FRAME:
				setParentFrame((Frame)null);
				return;
			case TestPackage.SUB_SEQUENCE__DLRBG:
				setDLRBG(DLRBG_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__NID_LRBG:
				setNidLRBG(NID_LRBG_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__QDIR_LRBG:
				setQDirLRBG(QDIR_LRBG_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__QDIR_TRAIN:
				setQDirTrain(QDIR_TRAIN_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__QDLRBG:
				setQDLRBG(QDLRBG_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__RBC_ID:
				setRbcId(RBC_ID_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__RBC_PHONE:
				setRbcPhone(RBC_PHONE_EDEFAULT);
				return;
			case TestPackage.SUB_SEQUENCE__TEST_CASES:
				getTestCases().clear();
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
			case TestPackage.SUB_SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.SUB_SEQUENCE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TestPackage.SUB_SEQUENCE__PARENT_FRAME:
				return getParentFrame() != null;
			case TestPackage.SUB_SEQUENCE__DLRBG:
				return DLRBG_EDEFAULT == null ? dLRBG != null : !DLRBG_EDEFAULT.equals(dLRBG);
			case TestPackage.SUB_SEQUENCE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case TestPackage.SUB_SEQUENCE__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case TestPackage.SUB_SEQUENCE__NID_LRBG:
				return NID_LRBG_EDEFAULT == null ? nidLRBG != null : !NID_LRBG_EDEFAULT.equals(nidLRBG);
			case TestPackage.SUB_SEQUENCE__QDIR_LRBG:
				return QDIR_LRBG_EDEFAULT == null ? qDirLRBG != null : !QDIR_LRBG_EDEFAULT.equals(qDirLRBG);
			case TestPackage.SUB_SEQUENCE__QDIR_TRAIN:
				return QDIR_TRAIN_EDEFAULT == null ? qDirTrain != null : !QDIR_TRAIN_EDEFAULT.equals(qDirTrain);
			case TestPackage.SUB_SEQUENCE__QDLRBG:
				return QDLRBG_EDEFAULT == null ? qDLRBG != null : !QDLRBG_EDEFAULT.equals(qDLRBG);
			case TestPackage.SUB_SEQUENCE__RBC_ID:
				return RBC_ID_EDEFAULT == null ? rbcId != null : !RBC_ID_EDEFAULT.equals(rbcId);
			case TestPackage.SUB_SEQUENCE__RBC_PHONE:
				return RBC_PHONE_EDEFAULT == null ? rbcPhone != null : !RBC_PHONE_EDEFAULT.equals(rbcPhone);
			case TestPackage.SUB_SEQUENCE__TEST_CASES:
				return testCases != null && !testCases.isEmpty();
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
				case TestPackage.SUB_SEQUENCE__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
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
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return TestPackage.SUB_SEQUENCE__COMMENT;
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
		result.append(", dLRBG: ");
		result.append(dLRBG);
		result.append(", level: ");
		result.append(level);
		result.append(", mode: ");
		result.append(mode);
		result.append(", nidLRBG: ");
		result.append(nidLRBG);
		result.append(", qDirLRBG: ");
		result.append(qDirLRBG);
		result.append(", qDirTrain: ");
		result.append(qDirTrain);
		result.append(", qDLRBG: ");
		result.append(qDLRBG);
		result.append(", rbcId: ");
		result.append(rbcId);
		result.append(", rbcPhone: ");
		result.append(rbcPhone);
		result.append(')');
		return result.toString();
	}

} //SubSequenceImpl
