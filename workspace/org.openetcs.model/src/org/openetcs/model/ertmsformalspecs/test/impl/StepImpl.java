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
import org.openetcs.model.ertmsformalspecs.test.SingleTestCase;
import org.openetcs.model.ertmsformalspecs.test.Step;
import org.openetcs.model.ertmsformalspecs.test.StepIO;
import org.openetcs.model.ertmsformalspecs.test.StepInterface;
import org.openetcs.model.ertmsformalspecs.test.StepLevel;
import org.openetcs.model.ertmsformalspecs.test.StepMode;
import org.openetcs.model.ertmsformalspecs.test.SubStep;
import org.openetcs.model.ertmsformalspecs.test.TestCase;
import org.openetcs.model.ertmsformalspecs.test.TestMessage;
import org.openetcs.model.ertmsformalspecs.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getParentTestCase <em>Parent Test Case</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getTcsOrder <em>Tcs Order</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getUserComment <em>User Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getIo <em>Io</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getLevelIn <em>Level In</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getLevelOut <em>Level Out</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getModeIn <em>Mode In</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getModeOut <em>Mode Out</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#isTranslationRequired <em>Translation Required</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#isTranslated <em>Translated</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.impl.StepImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepImpl extends EObjectImpl implements Step {
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
	 * The default value of the '{@link #getTcsOrder() <em>Tcs Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcsOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int TCS_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTcsOrder() <em>Tcs Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcsOrder()
	 * @generated
	 * @ordered
	 */
	protected int tcsOrder = TCS_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

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
	 * The default value of the '{@link #getUserComment() <em>User Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserComment()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserComment() <em>User Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserComment()
	 * @generated
	 * @ordered
	 */
	protected String userComment = USER_COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIo() <em>Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIo()
	 * @generated
	 * @ordered
	 */
	protected static final StepIO IO_EDEFAULT = StepIO.NA;

	/**
	 * The cached value of the '{@link #getIo() <em>Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIo()
	 * @generated
	 * @ordered
	 */
	protected StepIO io = IO_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected static final StepInterface INTERFACE_EDEFAULT = StepInterface.NA;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected StepInterface interface_ = INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelIn() <em>Level In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelIn()
	 * @generated
	 * @ordered
	 */
	protected static final StepLevel LEVEL_IN_EDEFAULT = StepLevel.NA;

	/**
	 * The cached value of the '{@link #getLevelIn() <em>Level In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelIn()
	 * @generated
	 * @ordered
	 */
	protected StepLevel levelIn = LEVEL_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelOut() <em>Level Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOut()
	 * @generated
	 * @ordered
	 */
	protected static final StepLevel LEVEL_OUT_EDEFAULT = StepLevel.NA;

	/**
	 * The cached value of the '{@link #getLevelOut() <em>Level Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOut()
	 * @generated
	 * @ordered
	 */
	protected StepLevel levelOut = LEVEL_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getModeIn() <em>Mode In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeIn()
	 * @generated
	 * @ordered
	 */
	protected static final StepMode MODE_IN_EDEFAULT = StepMode.NA;

	/**
	 * The cached value of the '{@link #getModeIn() <em>Mode In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeIn()
	 * @generated
	 * @ordered
	 */
	protected StepMode modeIn = MODE_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getModeOut() <em>Mode Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeOut()
	 * @generated
	 * @ordered
	 */
	protected static final StepMode MODE_OUT_EDEFAULT = StepMode.NA;

	/**
	 * The cached value of the '{@link #getModeOut() <em>Mode Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeOut()
	 * @generated
	 * @ordered
	 */
	protected StepMode modeOut = MODE_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isTranslationRequired() <em>Translation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslationRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATION_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTranslationRequired() <em>Translation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslationRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean translationRequired = TRANSLATION_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSLATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTranslated() <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTranslated()
	 * @generated
	 * @ordered
	 */
	protected boolean translated = TRANSLATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSteps() <em>Sub Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SubStep> subSteps;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<TestMessage> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleTestCase getParentTestCase() {
		if (eContainerFeatureID() != TestPackage.STEP__PARENT_TEST_CASE) return null;
		return (SingleTestCase)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentTestCase(SingleTestCase newParentTestCase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentTestCase, TestPackage.STEP__PARENT_TEST_CASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTestCase(SingleTestCase newParentTestCase) {
		if (newParentTestCase != eInternalContainer() || (eContainerFeatureID() != TestPackage.STEP__PARENT_TEST_CASE && newParentTestCase != null)) {
			if (EcoreUtil.isAncestor(this, newParentTestCase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentTestCase != null)
				msgs = ((InternalEObject)newParentTestCase).eInverseAdd(this, TestPackage.SINGLE_TEST_CASE__STEPS, SingleTestCase.class, msgs);
			msgs = basicSetParentTestCase(newParentTestCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__PARENT_TEST_CASE, newParentTestCase, newParentTestCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTcsOrder() {
		return tcsOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcsOrder(int newTcsOrder) {
		int oldTcsOrder = tcsOrder;
		tcsOrder = newTcsOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__TCS_ORDER, oldTcsOrder, tcsOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__DISTANCE, oldDistance, distance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserComment() {
		return userComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserComment(String newUserComment) {
		String oldUserComment = userComment;
		userComment = newUserComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__USER_COMMENT, oldUserComment, userComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepIO getIo() {
		return io;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIo(StepIO newIo) {
		StepIO oldIo = io;
		io = newIo == null ? IO_EDEFAULT : newIo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__IO, oldIo, io));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepInterface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(StepInterface newInterface) {
		StepInterface oldInterface = interface_;
		interface_ = newInterface == null ? INTERFACE_EDEFAULT : newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepLevel getLevelIn() {
		return levelIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelIn(StepLevel newLevelIn) {
		StepLevel oldLevelIn = levelIn;
		levelIn = newLevelIn == null ? LEVEL_IN_EDEFAULT : newLevelIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__LEVEL_IN, oldLevelIn, levelIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepLevel getLevelOut() {
		return levelOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelOut(StepLevel newLevelOut) {
		StepLevel oldLevelOut = levelOut;
		levelOut = newLevelOut == null ? LEVEL_OUT_EDEFAULT : newLevelOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__LEVEL_OUT, oldLevelOut, levelOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepMode getModeIn() {
		return modeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeIn(StepMode newModeIn) {
		StepMode oldModeIn = modeIn;
		modeIn = newModeIn == null ? MODE_IN_EDEFAULT : newModeIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__MODE_IN, oldModeIn, modeIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepMode getModeOut() {
		return modeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeOut(StepMode newModeOut) {
		StepMode oldModeOut = modeOut;
		modeOut = newModeOut == null ? MODE_OUT_EDEFAULT : newModeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__MODE_OUT, oldModeOut, modeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTranslationRequired() {
		return translationRequired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslationRequired(boolean newTranslationRequired) {
		boolean oldTranslationRequired = translationRequired;
		translationRequired = newTranslationRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__TRANSLATION_REQUIRED, oldTranslationRequired, translationRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTranslated() {
		return translated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslated(boolean newTranslated) {
		boolean oldTranslated = translated;
		translated = newTranslated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.STEP__TRANSLATED, oldTranslated, translated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubStep> getSubSteps() {
		if (subSteps == null) {
			subSteps = new EObjectContainmentWithInverseEList<SubStep>(SubStep.class, this, TestPackage.STEP__SUB_STEPS, TestPackage.SUB_STEP__PARENT_STEP);
		}
		return subSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestMessage> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentWithInverseEList<TestMessage>(TestMessage.class, this, TestPackage.STEP__MESSAGES, TestPackage.TEST_MESSAGE__PARENT_STEP);
		}
		return messages;
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
			case TestPackage.STEP__PARENT_TEST_CASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentTestCase((SingleTestCase)otherEnd, msgs);
			case TestPackage.STEP__SUB_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubSteps()).basicAdd(otherEnd, msgs);
			case TestPackage.STEP__MESSAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessages()).basicAdd(otherEnd, msgs);
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
			case TestPackage.STEP__PARENT_TEST_CASE:
				return basicSetParentTestCase(null, msgs);
			case TestPackage.STEP__SUB_STEPS:
				return ((InternalEList<?>)getSubSteps()).basicRemove(otherEnd, msgs);
			case TestPackage.STEP__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
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
			case TestPackage.STEP__PARENT_TEST_CASE:
				return eInternalContainer().eInverseRemove(this, TestPackage.SINGLE_TEST_CASE__STEPS, SingleTestCase.class, msgs);
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
			case TestPackage.STEP__NAME:
				return getName();
			case TestPackage.STEP__COMMENT:
				return getComment();
			case TestPackage.STEP__PARENT_TEST_CASE:
				return getParentTestCase();
			case TestPackage.STEP__TCS_ORDER:
				return getTcsOrder();
			case TestPackage.STEP__DISTANCE:
				return getDistance();
			case TestPackage.STEP__DESCRIPTION:
				return getDescription();
			case TestPackage.STEP__USER_COMMENT:
				return getUserComment();
			case TestPackage.STEP__IO:
				return getIo();
			case TestPackage.STEP__INTERFACE:
				return getInterface();
			case TestPackage.STEP__LEVEL_IN:
				return getLevelIn();
			case TestPackage.STEP__LEVEL_OUT:
				return getLevelOut();
			case TestPackage.STEP__MODE_IN:
				return getModeIn();
			case TestPackage.STEP__MODE_OUT:
				return getModeOut();
			case TestPackage.STEP__TRANSLATION_REQUIRED:
				return isTranslationRequired();
			case TestPackage.STEP__TRANSLATED:
				return isTranslated();
			case TestPackage.STEP__SUB_STEPS:
				return getSubSteps();
			case TestPackage.STEP__MESSAGES:
				return getMessages();
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
			case TestPackage.STEP__NAME:
				setName((String)newValue);
				return;
			case TestPackage.STEP__COMMENT:
				setComment((String)newValue);
				return;
			case TestPackage.STEP__PARENT_TEST_CASE:
				setParentTestCase((SingleTestCase)newValue);
				return;
			case TestPackage.STEP__TCS_ORDER:
				setTcsOrder((Integer)newValue);
				return;
			case TestPackage.STEP__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case TestPackage.STEP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TestPackage.STEP__USER_COMMENT:
				setUserComment((String)newValue);
				return;
			case TestPackage.STEP__IO:
				setIo((StepIO)newValue);
				return;
			case TestPackage.STEP__INTERFACE:
				setInterface((StepInterface)newValue);
				return;
			case TestPackage.STEP__LEVEL_IN:
				setLevelIn((StepLevel)newValue);
				return;
			case TestPackage.STEP__LEVEL_OUT:
				setLevelOut((StepLevel)newValue);
				return;
			case TestPackage.STEP__MODE_IN:
				setModeIn((StepMode)newValue);
				return;
			case TestPackage.STEP__MODE_OUT:
				setModeOut((StepMode)newValue);
				return;
			case TestPackage.STEP__TRANSLATION_REQUIRED:
				setTranslationRequired((Boolean)newValue);
				return;
			case TestPackage.STEP__TRANSLATED:
				setTranslated((Boolean)newValue);
				return;
			case TestPackage.STEP__SUB_STEPS:
				getSubSteps().clear();
				getSubSteps().addAll((Collection<? extends SubStep>)newValue);
				return;
			case TestPackage.STEP__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends TestMessage>)newValue);
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
			case TestPackage.STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestPackage.STEP__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TestPackage.STEP__PARENT_TEST_CASE:
				setParentTestCase((SingleTestCase)null);
				return;
			case TestPackage.STEP__TCS_ORDER:
				setTcsOrder(TCS_ORDER_EDEFAULT);
				return;
			case TestPackage.STEP__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case TestPackage.STEP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TestPackage.STEP__USER_COMMENT:
				setUserComment(USER_COMMENT_EDEFAULT);
				return;
			case TestPackage.STEP__IO:
				setIo(IO_EDEFAULT);
				return;
			case TestPackage.STEP__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case TestPackage.STEP__LEVEL_IN:
				setLevelIn(LEVEL_IN_EDEFAULT);
				return;
			case TestPackage.STEP__LEVEL_OUT:
				setLevelOut(LEVEL_OUT_EDEFAULT);
				return;
			case TestPackage.STEP__MODE_IN:
				setModeIn(MODE_IN_EDEFAULT);
				return;
			case TestPackage.STEP__MODE_OUT:
				setModeOut(MODE_OUT_EDEFAULT);
				return;
			case TestPackage.STEP__TRANSLATION_REQUIRED:
				setTranslationRequired(TRANSLATION_REQUIRED_EDEFAULT);
				return;
			case TestPackage.STEP__TRANSLATED:
				setTranslated(TRANSLATED_EDEFAULT);
				return;
			case TestPackage.STEP__SUB_STEPS:
				getSubSteps().clear();
				return;
			case TestPackage.STEP__MESSAGES:
				getMessages().clear();
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
			case TestPackage.STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestPackage.STEP__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case TestPackage.STEP__PARENT_TEST_CASE:
				return getParentTestCase() != null;
			case TestPackage.STEP__TCS_ORDER:
				return tcsOrder != TCS_ORDER_EDEFAULT;
			case TestPackage.STEP__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case TestPackage.STEP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TestPackage.STEP__USER_COMMENT:
				return USER_COMMENT_EDEFAULT == null ? userComment != null : !USER_COMMENT_EDEFAULT.equals(userComment);
			case TestPackage.STEP__IO:
				return io != IO_EDEFAULT;
			case TestPackage.STEP__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case TestPackage.STEP__LEVEL_IN:
				return levelIn != LEVEL_IN_EDEFAULT;
			case TestPackage.STEP__LEVEL_OUT:
				return levelOut != LEVEL_OUT_EDEFAULT;
			case TestPackage.STEP__MODE_IN:
				return modeIn != MODE_IN_EDEFAULT;
			case TestPackage.STEP__MODE_OUT:
				return modeOut != MODE_OUT_EDEFAULT;
			case TestPackage.STEP__TRANSLATION_REQUIRED:
				return translationRequired != TRANSLATION_REQUIRED_EDEFAULT;
			case TestPackage.STEP__TRANSLATED:
				return translated != TRANSLATED_EDEFAULT;
			case TestPackage.STEP__SUB_STEPS:
				return subSteps != null && !subSteps.isEmpty();
			case TestPackage.STEP__MESSAGES:
				return messages != null && !messages.isEmpty();
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
				case TestPackage.STEP__COMMENT: return ModelPackage.COMMENTED_ELEMENT__COMMENT;
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
				case ModelPackage.COMMENTED_ELEMENT__COMMENT: return TestPackage.STEP__COMMENT;
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
		result.append(", tcsOrder: ");
		result.append(tcsOrder);
		result.append(", distance: ");
		result.append(distance);
		result.append(", description: ");
		result.append(description);
		result.append(", userComment: ");
		result.append(userComment);
		result.append(", io: ");
		result.append(io);
		result.append(", interface: ");
		result.append(interface_);
		result.append(", levelIn: ");
		result.append(levelIn);
		result.append(", levelOut: ");
		result.append(levelOut);
		result.append(", modeIn: ");
		result.append(modeIn);
		result.append(", modeOut: ");
		result.append(modeOut);
		result.append(", translationRequired: ");
		result.append(translationRequired);
		result.append(", translated: ");
		result.append(translated);
		result.append(')');
		return result.toString();
	}

} //StepImpl
