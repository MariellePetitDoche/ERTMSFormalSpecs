/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement;
import org.openetcs.model.ertmsformalspecs.requirements.messages.*;
import org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Mask;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Match;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Media;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Message;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Value;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage
 * @generated
 */
public class MessagesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MessagesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesSwitch() {
		if (modelPackage == null) {
			modelPackage = MessagesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MessagesPackage.TYPE_SPEC: {
				TypeSpec typeSpec = (TypeSpec)theEObject;
				T result = caseTypeSpec(typeSpec);
				if (result == null) result = caseBaseLinedElement(typeSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.CHAR_VALUE: {
				CharValue charValue = (CharValue)theEObject;
				T result = caseCharValue(charValue);
				if (result == null) result = caseValue(charValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.TYPE_VALUE: {
				TypeValue typeValue = (TypeValue)theEObject;
				T result = caseTypeValue(typeValue);
				if (result == null) result = caseValue(typeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.RESOLUTION_FORMULA: {
				ResolutionFormula resolutionFormula = (ResolutionFormula)theEObject;
				T result = caseResolutionFormula(resolutionFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE: {
				SpecialOrReservedValue specialOrReservedValue = (SpecialOrReservedValue)theEObject;
				T result = caseSpecialOrReservedValue(specialOrReservedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.SINGLE_VALUE: {
				SingleValue singleValue = (SingleValue)theEObject;
				T result = caseSingleValue(singleValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.MASK: {
				Mask mask = (Mask)theEObject;
				T result = caseMask(mask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.IMATCH: {
				IMatch iMatch = (IMatch)theEObject;
				T result = caseIMatch(iMatch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.MATCH: {
				Match match = (Match)theEObject;
				T result = caseMatch(match);
				if (result == null) result = caseIMatch(match);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.MATCH_RANGE: {
				MatchRange matchRange = (MatchRange)theEObject;
				T result = caseMatchRange(matchRange);
				if (result == null) result = caseIMatch(matchRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.MEANING: {
				Meaning meaning = (Meaning)theEObject;
				T result = caseMeaning(meaning);
				if (result == null) result = caseBaseLinedElement(meaning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseBaseLinedElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MessagesPackage.MESSAGE_VARIABLE: {
				MessageVariable messageVariable = (MessageVariable)theEObject;
				T result = caseMessageVariable(messageVariable);
				if (result == null) result = caseBaseLinedElement(messageVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeSpec(TypeSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharValue(CharValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeValue(TypeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Formula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Formula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionFormula(ResolutionFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Or Reserved Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Or Reserved Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialOrReservedValue(SpecialOrReservedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleValue(SingleValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMask(Mask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMatch(IMatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatch(Match object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchRange(MatchRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meaning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeaning(Meaning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageVariable(MessageVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Lined Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Lined Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseLinedElement(BaseLinedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MessagesSwitch
