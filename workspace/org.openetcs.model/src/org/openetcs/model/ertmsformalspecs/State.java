/**
 */
package org.openetcs.model.ertmsformalspecs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.State#getParentStateMachine <em>Parent State Machine</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.State#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.State#getWidth <em>Width</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.State#getHeight <em>Height</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.State#getX <em>X</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.State#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getState()
 * @model
 * @generated
 */
public interface State extends ReqRelated {
	/**
	 * Returns the value of the '<em><b>Parent State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent State Machine</em>' container reference.
	 * @see #setParentStateMachine(StateMachine)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getState_ParentStateMachine()
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	StateMachine getParentStateMachine();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.State#getParentStateMachine <em>Parent State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent State Machine</em>' container reference.
	 * @see #getParentStateMachine()
	 * @generated
	 */
	void setParentStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.StateMachine#getParentState <em>Parent State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' containment reference.
	 * @see #setStateMachine(StateMachine)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getState_StateMachine()
	 * @see org.openetcs.model.ertmsformalspecs.StateMachine#getParentState
	 * @model opposite="parentState" containment="true"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.State#getStateMachine <em>State Machine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' containment reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getState_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.State#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getState_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.State#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getState_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.State#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getState_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.State#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

} // State
