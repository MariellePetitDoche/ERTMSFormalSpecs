/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

import org.eclipse.emf.common.util.EList;
import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.NamedElement;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Message;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Paragraph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getType <em>Type</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getScope <em>Scope</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getProcessInfo <em>Process Info</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getId <em>Id</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getText <em>Text</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getFunctionalBlock <em>Functional Block</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentSpecification <em>Parent Specification</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getSubParagraphs <em>Sub Paragraphs</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentParagraph <em>Parent Paragraph</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getTypeSpec <em>Type Spec</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getMessage <em>Message</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph()
 * @model
 * @generated
 */
public interface Paragraph extends NamedElement, BaseLinedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.requirements.EParagraphType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EParagraphType
	 * @see #setType(EParagraphType)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_Type()
	 * @model
	 * @generated
	 */
	EParagraphType getType();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.EParagraphType
	 * @see #getType()
	 * @generated
	 */
	void setType(EParagraphType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_Scope()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Process Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Info</em>' containment reference.
	 * @see #setProcessInfo(ProcessInformation)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_ProcessInfo()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProcessInformation getProcessInfo();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getProcessInfo <em>Process Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Info</em>' containment reference.
	 * @see #getProcessInfo()
	 * @generated
	 */
	void setProcessInfo(ProcessInformation value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Functional Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Block</em>' reference.
	 * @see #setFunctionalBlock(FunctionalBlock)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_FunctionalBlock()
	 * @model
	 * @generated
	 */
	FunctionalBlock getFunctionalBlock();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getFunctionalBlock <em>Functional Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Block</em>' reference.
	 * @see #getFunctionalBlock()
	 * @generated
	 */
	void setFunctionalBlock(FunctionalBlock value);

	/**
	 * Returns the value of the '<em><b>Parent Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.requirements.Specification#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Specification</em>' container reference.
	 * @see #setParentSpecification(Specification)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_ParentSpecification()
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Specification#getParagraphs
	 * @model opposite="paragraphs" transient="false"
	 * @generated
	 */
	Specification getParentSpecification();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentSpecification <em>Parent Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Specification</em>' container reference.
	 * @see #getParentSpecification()
	 * @generated
	 */
	void setParentSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Sub Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph}.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentParagraph <em>Parent Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Paragraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Paragraphs</em>' containment reference list.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_SubParagraphs()
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentParagraph
	 * @model opposite="parentParagraph" containment="true"
	 * @generated
	 */
	EList<Paragraph> getSubParagraphs();

	/**
	 * Returns the value of the '<em><b>Parent Paragraph</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getSubParagraphs <em>Sub Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Paragraph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Paragraph</em>' container reference.
	 * @see #setParentParagraph(Paragraph)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_ParentParagraph()
	 * @see org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getSubParagraphs
	 * @model opposite="subParagraphs" transient="false"
	 * @generated
	 */
	Paragraph getParentParagraph();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getParentParagraph <em>Parent Paragraph</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Paragraph</em>' container reference.
	 * @see #getParentParagraph()
	 * @generated
	 */
	void setParentParagraph(Paragraph value);

	/**
	 * Returns the value of the '<em><b>Type Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Spec</em>' containment reference.
	 * @see #setTypeSpec(TypeSpec)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_TypeSpec()
	 * @model containment="true"
	 * @generated
	 */
	TypeSpec getTypeSpec();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getTypeSpec <em>Type Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Spec</em>' containment reference.
	 * @see #getTypeSpec()
	 * @generated
	 */
	void setTypeSpec(TypeSpec value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_Message()
	 * @model containment="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getMessage <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' reference.
	 * @see #setVersion(BaseLine)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getParagraph_Version()
	 * @model
	 * @generated
	 */
	BaseLine getVersion();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.Paragraph#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BaseLine value);

} // Paragraph
