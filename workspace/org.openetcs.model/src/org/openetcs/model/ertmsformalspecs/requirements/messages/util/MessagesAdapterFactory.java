/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage
 * @generated
 */
public class MessagesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MessagesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MessagesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessagesSwitch<Adapter> modelSwitch =
		new MessagesSwitch<Adapter>() {
			@Override
			public Adapter caseTypeSpec(TypeSpec object) {
				return createTypeSpecAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseCharValue(CharValue object) {
				return createCharValueAdapter();
			}
			@Override
			public Adapter caseTypeValue(TypeValue object) {
				return createTypeValueAdapter();
			}
			@Override
			public Adapter caseResolutionFormula(ResolutionFormula object) {
				return createResolutionFormulaAdapter();
			}
			@Override
			public Adapter caseSpecialOrReservedValue(SpecialOrReservedValue object) {
				return createSpecialOrReservedValueAdapter();
			}
			@Override
			public Adapter caseSingleValue(SingleValue object) {
				return createSingleValueAdapter();
			}
			@Override
			public Adapter caseMask(Mask object) {
				return createMaskAdapter();
			}
			@Override
			public Adapter caseIMatch(IMatch object) {
				return createIMatchAdapter();
			}
			@Override
			public Adapter caseMatch(Match object) {
				return createMatchAdapter();
			}
			@Override
			public Adapter caseMatchRange(MatchRange object) {
				return createMatchRangeAdapter();
			}
			@Override
			public Adapter caseMeaning(Meaning object) {
				return createMeaningAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseMessageVariable(MessageVariable object) {
				return createMessageVariableAdapter();
			}
			@Override
			public Adapter caseBaseLinedElement(BaseLinedElement object) {
				return createBaseLinedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec <em>Type Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec
	 * @generated
	 */
	public Adapter createTypeSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue <em>Char Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue
	 * @generated
	 */
	public Adapter createCharValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue <em>Type Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue
	 * @generated
	 */
	public Adapter createTypeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula <em>Resolution Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula
	 * @generated
	 */
	public Adapter createResolutionFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue <em>Special Or Reserved Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue
	 * @generated
	 */
	public Adapter createSpecialOrReservedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue <em>Single Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue
	 * @generated
	 */
	public Adapter createSingleValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Mask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Mask
	 * @generated
	 */
	public Adapter createMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch <em>IMatch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.IMatch
	 * @generated
	 */
	public Adapter createIMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange <em>Match Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange
	 * @generated
	 */
	public Adapter createMatchRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning
	 * @generated
	 */
	public Adapter createMeaningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable <em>Message Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable
	 * @generated
	 */
	public Adapter createMessageVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement <em>Base Lined Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openetcs.model.ertmsformalspecs.requirements.BaseLinedElement
	 * @generated
	 */
	public Adapter createBaseLinedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MessagesAdapterFactory
