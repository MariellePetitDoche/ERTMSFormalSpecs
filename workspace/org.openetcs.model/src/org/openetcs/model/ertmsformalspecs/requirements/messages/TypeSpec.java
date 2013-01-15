/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import org.openetcs.model.ertmsformalspecs.BaseLine;
import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;
import org.openetcs.model.ertmsformalspecs.requirements.Paragraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getId <em>Id</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getLength <em>Length</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMinimumValue <em>Minimum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getResolutionFormula <em>Resolution Formula</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getErtmsType <em>Ertms Type</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getValue <em>Value</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getReferenceParagraph <em>Reference Paragraph</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec()
 * @model
 * @generated
 */
public interface TypeSpec extends BaseLinedElement {
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
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see #setShortDescription(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_ShortDescription()
	 * @model
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getShortDescription <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Description</em>' attribute.
	 * @see #getShortDescription()
	 * @generated
	 */
	void setShortDescription(String value);

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
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Minimum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Value</em>' attribute.
	 * @see #setMinimumValue(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_MinimumValue()
	 * @model
	 * @generated
	 */
	String getMinimumValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMinimumValue <em>Minimum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Value</em>' attribute.
	 * @see #getMinimumValue()
	 * @generated
	 */
	void setMinimumValue(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Value</em>' attribute.
	 * @see #setMaximumValue(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_MaximumValue()
	 * @model
	 * @generated
	 */
	String getMaximumValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getMaximumValue <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Value</em>' attribute.
	 * @see #getMaximumValue()
	 * @generated
	 */
	void setMaximumValue(String value);

	/**
	 * Returns the value of the '<em><b>Resolution Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Formula</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Formula</em>' attribute.
	 * @see #setResolutionFormula(String)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_ResolutionFormula()
	 * @model
	 * @generated
	 */
	String getResolutionFormula();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getResolutionFormula <em>Resolution Formula</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Formula</em>' attribute.
	 * @see #getResolutionFormula()
	 * @generated
	 */
	void setResolutionFormula(String value);

	/**
	 * Returns the value of the '<em><b>Ertms Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ertms Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ertms Type</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType
	 * @see #setErtmsType(EErtmsType)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_ErtmsType()
	 * @model
	 * @generated
	 */
	EErtmsType getErtmsType();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getErtmsType <em>Ertms Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ertms Type</em>' attribute.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType
	 * @see #getErtmsType()
	 * @generated
	 */
	void setErtmsType(EErtmsType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_Value()
	 * @model containment="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Reference Paragraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Paragraph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Paragraph</em>' reference.
	 * @see #setReferenceParagraph(Paragraph)
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_ReferenceParagraph()
	 * @model
	 * @generated
	 */
	Paragraph getReferenceParagraph();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getReferenceParagraph <em>Reference Paragraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Paragraph</em>' reference.
	 * @see #getReferenceParagraph()
	 * @generated
	 */
	void setReferenceParagraph(Paragraph value);

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
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getTypeSpec_Version()
	 * @model
	 * @generated
	 */
	BaseLine getVersion();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec#getVersion <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(BaseLine value);

} // TypeSpec
