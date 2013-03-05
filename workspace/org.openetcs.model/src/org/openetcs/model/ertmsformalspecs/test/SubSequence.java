/**
 */
package org.openetcs.model.ertmsformalspecs.test;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.CommentedElement;
import org.openetcs.model.ertmsformalspecs.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getParentFrame <em>Parent Frame</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getDLRBG <em>DLRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getLevel <em>Level</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getMode <em>Mode</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getNidLRBG <em>Nid LRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirLRBG <em>QDir LRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirTrain <em>QDir Train</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDLRBG <em>QDLRBG</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcId <em>Rbc Id</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcPhone <em>Rbc Phone</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getTestCases <em>Test Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence()
 * @model
 * @generated
 */
public interface SubSequence extends NamedElement, CommentedElement {
	/**
	 * Returns the value of the '<em><b>Parent Frame</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.Frame#getSubSequences <em>Sub Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Frame</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Frame</em>' container reference.
	 * @see #setParentFrame(Frame)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_ParentFrame()
	 * @see org.openetcs.model.ertmsformalspecs.test.Frame#getSubSequences
	 * @model opposite="subSequences" transient="false"
	 * @generated
	 */
	Frame getParentFrame();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getParentFrame <em>Parent Frame</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Frame</em>' container reference.
	 * @see #getParentFrame()
	 * @generated
	 */
	void setParentFrame(Frame value);

	/**
	 * Returns the value of the '<em><b>DLRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLRBG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLRBG</em>' attribute.
	 * @see #setDLRBG(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_DLRBG()
	 * @model
	 * @generated
	 */
	String getDLRBG();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getDLRBG <em>DLRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLRBG</em>' attribute.
	 * @see #getDLRBG()
	 * @generated
	 */
	void setDLRBG(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Nid LRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nid LRBG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nid LRBG</em>' attribute.
	 * @see #setNidLRBG(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_NidLRBG()
	 * @model
	 * @generated
	 */
	String getNidLRBG();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getNidLRBG <em>Nid LRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nid LRBG</em>' attribute.
	 * @see #getNidLRBG()
	 * @generated
	 */
	void setNidLRBG(String value);

	/**
	 * Returns the value of the '<em><b>QDir LRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QDir LRBG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QDir LRBG</em>' attribute.
	 * @see #setQDirLRBG(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_QDirLRBG()
	 * @model
	 * @generated
	 */
	String getQDirLRBG();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirLRBG <em>QDir LRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QDir LRBG</em>' attribute.
	 * @see #getQDirLRBG()
	 * @generated
	 */
	void setQDirLRBG(String value);

	/**
	 * Returns the value of the '<em><b>QDir Train</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QDir Train</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QDir Train</em>' attribute.
	 * @see #setQDirTrain(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_QDirTrain()
	 * @model
	 * @generated
	 */
	String getQDirTrain();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDirTrain <em>QDir Train</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QDir Train</em>' attribute.
	 * @see #getQDirTrain()
	 * @generated
	 */
	void setQDirTrain(String value);

	/**
	 * Returns the value of the '<em><b>QDLRBG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QDLRBG</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QDLRBG</em>' attribute.
	 * @see #setQDLRBG(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_QDLRBG()
	 * @model
	 * @generated
	 */
	String getQDLRBG();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getQDLRBG <em>QDLRBG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QDLRBG</em>' attribute.
	 * @see #getQDLRBG()
	 * @generated
	 */
	void setQDLRBG(String value);

	/**
	 * Returns the value of the '<em><b>Rbc Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rbc Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rbc Id</em>' attribute.
	 * @see #setRbcId(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_RbcId()
	 * @model
	 * @generated
	 */
	String getRbcId();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcId <em>Rbc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rbc Id</em>' attribute.
	 * @see #getRbcId()
	 * @generated
	 */
	void setRbcId(String value);

	/**
	 * Returns the value of the '<em><b>Rbc Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rbc Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rbc Phone</em>' attribute.
	 * @see #setRbcPhone(String)
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_RbcPhone()
	 * @model
	 * @generated
	 */
	String getRbcPhone();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.test.SubSequence#getRbcPhone <em>Rbc Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rbc Phone</em>' attribute.
	 * @see #getRbcPhone()
	 * @generated
	 */
	void setRbcPhone(String value);

	/**
	 * Returns the value of the '<em><b>Test Cases</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getParentSubSequence <em>Parent Sub Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Cases</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.test.TestPackage#getSubSequence_TestCases()
	 * @see org.openetcs.model.ertmsformalspecs.test.SingleTestCase#getParentSubSequence
	 * @model opposite="parentSubSequence" containment="true"
	 * @generated
	 */
	EList<SingleTestCase> getTestCases();

} // SubSequence
