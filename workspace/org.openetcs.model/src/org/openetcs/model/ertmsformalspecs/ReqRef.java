/**
 */
package org.openetcs.model.ertmsformalspecs;

import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.ReqRef#getParagraph <em>Paragraph</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.ReqRef#getParagraphId <em>Paragraph Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getReqRef()
 * @model
 * @generated
 */
public interface ReqRef extends CommentedElement {
	/**
	 * Returns the value of the '<em><b>Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph</em>' reference.
	 * @see #setParagraph(Paragraph)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getReqRef_Paragraph()
	 * @model required="true"
	 * @generated
	 */
	Paragraph getParagraph();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.ReqRef#getParagraph <em>Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph</em>' reference.
	 * @see #getParagraph()
	 * @generated
	 */
	void setParagraph(Paragraph value);

	/**
	 * Returns the value of the '<em><b>Paragraph Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraph Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraph Id</em>' attribute.
	 * @see #setParagraphId(String)
	 * @see org.openetcs.model.ertmsformalspecs.ModelPackage#getReqRef_ParagraphId()
	 * @model
	 * @generated
	 */
	String getParagraphId();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.ReqRef#getParagraphId <em>Paragraph Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paragraph Id</em>' attribute.
	 * @see #getParagraphId()
	 * @generated
	 */
	void setParagraphId(String value);

} // ReqRef
