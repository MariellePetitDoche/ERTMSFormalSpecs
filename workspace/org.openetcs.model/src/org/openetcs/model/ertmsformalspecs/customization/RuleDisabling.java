/**
 */
package org.openetcs.model.ertmsformalspecs.customization;

import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ReqRelated;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Disabling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getRule <em>Rule</em>}</li>
 *   <li>{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getParentDictionary <em>Parent Dictionary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage#getRuleDisabling()
 * @model
 * @generated
 */
public interface RuleDisabling extends ReqRelated {
	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference.
	 * @see #setRule(Rule)
	 * @see org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage#getRuleDisabling_Rule()
	 * @model required="true"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getRule <em>Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

	/**
	 * Returns the value of the '<em><b>Parent Dictionary</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openetcs.model.ertmsformalspecs.Dictionary#getRuleDisablings <em>Rule Disablings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Dictionary</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #setParentDictionary(Dictionary)
	 * @see org.openetcs.model.ertmsformalspecs.customization.CustomizationPackage#getRuleDisabling_ParentDictionary()
	 * @see org.openetcs.model.ertmsformalspecs.Dictionary#getRuleDisablings
	 * @model opposite="ruleDisablings" transient="false"
	 * @generated
	 */
	Dictionary getParentDictionary();

	/**
	 * Sets the value of the '{@link org.openetcs.model.ertmsformalspecs.customization.RuleDisabling#getParentDictionary <em>Parent Dictionary</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Dictionary</em>' container reference.
	 * @see #getParentDictionary()
	 * @generated
	 */
	void setParentDictionary(Dictionary value);

} // RuleDisabling
