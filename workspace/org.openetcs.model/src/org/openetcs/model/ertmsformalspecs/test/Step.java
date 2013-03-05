/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getParentTestCase <em>Parent Test Case</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getTcsOrder <em>Tcs Order</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getUserComment <em>User Comment</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getIo <em>Io</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getLevelIn <em>Level In</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getLevelOut <em>Level Out</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getModeIn <em>Mode In</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getModeOut <em>Mode Out</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#isTranslationRequired <em>Translation Required</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#isTranslated <em>Translated</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getSubSteps <em>Sub Steps</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.Step#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep()
 * @model
 * @generated
 */
public interface Step extends NamedElement, CommentedElement {
	/**
	 * Returns the value of the '<em><b>Parent Test Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Test Case</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Test Case</em>' container reference.
	 * @see #setParentTestCase(SingleTestCase)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_ParentTestCase()
	 * @see org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getSteps
	 * @model opposite="steps" transient="false"
	 * @generated
	 */
	SingleTestCase getParentTestCase();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getParentTestCase <em>Parent Test Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Test Case</em>' container reference.
	 * @see #getParentTestCase()
	 * @generated
	 */
	void setParentTestCase(SingleTestCase value);

	/**
	 * Returns the value of the '<em><b>Tcs Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcs Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcs Order</em>' attribute.
	 * @see #setTcsOrder(int)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_TcsOrder()
	 * @model
	 * @generated
	 */
	int getTcsOrder();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getTcsOrder <em>Tcs Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcs Order</em>' attribute.
	 * @see #getTcsOrder()
	 * @generated
	 */
	void setTcsOrder(int value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_Distance()
	 * @model
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>User Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Comment</em>' attribute.
	 * @see #setUserComment(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_UserComment()
	 * @model
	 * @generated
	 */
	String getUserComment();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getUserComment <em>User Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Comment</em>' attribute.
	 * @see #getUserComment()
	 * @generated
	 */
	void setUserComment(String value);

	/**
	 * Returns the value of the '<em><b>Io</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.test.StepIO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepIO
	 * @see #setIo(StepIO)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_Io()
	 * @model
	 * @generated
	 */
	StepIO getIo();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getIo <em>Io</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepIO
	 * @see #getIo()
	 * @generated
	 */
	void setIo(StepIO value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.test.StepInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepInterface
	 * @see #setInterface(StepInterface)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_Interface()
	 * @model
	 * @generated
	 */
	StepInterface getInterface();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepInterface
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(StepInterface value);

	/**
	 * Returns the value of the '<em><b>Level In</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.test.StepLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level In</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepLevel
	 * @see #setLevelIn(StepLevel)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_LevelIn()
	 * @model
	 * @generated
	 */
	StepLevel getLevelIn();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getLevelIn <em>Level In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level In</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepLevel
	 * @see #getLevelIn()
	 * @generated
	 */
	void setLevelIn(StepLevel value);

	/**
	 * Returns the value of the '<em><b>Level Out</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.test.StepLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Out</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepLevel
	 * @see #setLevelOut(StepLevel)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_LevelOut()
	 * @model
	 * @generated
	 */
	StepLevel getLevelOut();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getLevelOut <em>Level Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Out</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepLevel
	 * @see #getLevelOut()
	 * @generated
	 */
	void setLevelOut(StepLevel value);

	/**
	 * Returns the value of the '<em><b>Mode In</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.test.StepMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode In</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepMode
	 * @see #setModeIn(StepMode)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_ModeIn()
	 * @model
	 * @generated
	 */
	StepMode getModeIn();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getModeIn <em>Mode In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode In</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepMode
	 * @see #getModeIn()
	 * @generated
	 */
	void setModeIn(StepMode value);

	/**
	 * Returns the value of the '<em><b>Mode Out</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.test.StepMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Out</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepMode
	 * @see #setModeOut(StepMode)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_ModeOut()
	 * @model
	 * @generated
	 */
	StepMode getModeOut();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#getModeOut <em>Mode Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Out</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.test.StepMode
	 * @see #getModeOut()
	 * @generated
	 */
	void setModeOut(StepMode value);

	/**
	 * Returns the value of the '<em><b>Translation Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation Required</em>' attribute.
	 * @see #setTranslationRequired(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_TranslationRequired()
	 * @model
	 * @generated
	 */
	boolean isTranslationRequired();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#isTranslationRequired <em>Translation Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Required</em>' attribute.
	 * @see #isTranslationRequired()
	 * @generated
	 */
	void setTranslationRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Translated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translated</em>' attribute.
	 * @see #setTranslated(boolean)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_Translated()
	 * @model
	 * @generated
	 */
	boolean isTranslated();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.Step#isTranslated <em>Translated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translated</em>' attribute.
	 * @see #isTranslated()
	 * @generated
	 */
	void setTranslated(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Steps</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.SubStep}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SubStep#getParentStep <em>Parent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Steps</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_SubSteps()
	 * @see org.openetcs.model.ertmsformalspecs.test.SubStep#getParentStep
	 * @model opposite="parentStep" containment="true"
	 * @generated
	 */
	EList<SubStep> getSubSteps();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.TestMessage}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.TestMessage#getParentStep <em>Parent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getStep_Messages()
	 * @see org.openetcs.model.ertmsformalspecs.test.TestMessage#getParentStep
	 * @model opposite="parentStep" containment="true"
	 * @generated
	 */
	EList<TestMessage> getMessages();

} // Step
