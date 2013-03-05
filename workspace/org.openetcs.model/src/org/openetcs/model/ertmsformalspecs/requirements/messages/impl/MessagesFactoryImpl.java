/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openetcs.model.ertmsformalspecs.requirements.messages.*;
import org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType;
import org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Mask;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Match;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Media;
import org.openetcs.model.ertmsformalspecs.requirements.messages.Message;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesFactory;
import org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit;
import org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec;
import org.openetcs.model.ertmsformalspecs.requirements.messages.TypeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MessagesFactoryImpl extends EFactoryImpl implements MessagesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MessagesFactory init() {
		try {
			MessagesFactory theMessagesFactory = (MessagesFactory)EPackage.Registry.INSTANCE.getEFactory("http://org/openetcs/model/requirements/messages"); 
			if (theMessagesFactory != null) {
				return theMessagesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MessagesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MessagesPackage.TYPE_SPEC: return createTypeSpec();
			case MessagesPackage.CHAR_VALUE: return createCharValue();
			case MessagesPackage.TYPE_VALUE: return createTypeValue();
			case MessagesPackage.RESOLUTION_FORMULA: return createResolutionFormula();
			case MessagesPackage.SPECIAL_OR_RESERVED_VALUE: return createSpecialOrReservedValue();
			case MessagesPackage.SINGLE_VALUE: return createSingleValue();
			case MessagesPackage.MASK: return createMask();
			case MessagesPackage.MATCH: return createMatch();
			case MessagesPackage.MATCH_RANGE: return createMatchRange();
			case MessagesPackage.MEANING: return createMeaning();
			case MessagesPackage.MESSAGE: return createMessage();
			case MessagesPackage.MEDIA: return createMedia();
			case MessagesPackage.MESSAGE_VARIABLE: return createMessageVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MessagesPackage.EERTMS_TYPE:
				return createEErtmsTypeFromString(eDataType, initialValue);
			case MessagesPackage.RESOLUTION_FORMULA_UNIT:
				return createResolutionFormulaUnitFromString(eDataType, initialValue);
			case MessagesPackage.RESOLUTION_FORMULA_VALUE:
				return createResolutionFormulaValueFromString(eDataType, initialValue);
			case MessagesPackage.EMEANING_TYPE:
				return createEMeaningTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MessagesPackage.EERTMS_TYPE:
				return convertEErtmsTypeToString(eDataType, instanceValue);
			case MessagesPackage.RESOLUTION_FORMULA_UNIT:
				return convertResolutionFormulaUnitToString(eDataType, instanceValue);
			case MessagesPackage.RESOLUTION_FORMULA_VALUE:
				return convertResolutionFormulaValueToString(eDataType, instanceValue);
			case MessagesPackage.EMEANING_TYPE:
				return convertEMeaningTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSpec createTypeSpec() {
		TypeSpecImpl typeSpec = new TypeSpecImpl();
		return typeSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharValue createCharValue() {
		CharValueImpl charValue = new CharValueImpl();
		return charValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeValue createTypeValue() {
		TypeValueImpl typeValue = new TypeValueImpl();
		return typeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionFormula createResolutionFormula() {
		ResolutionFormulaImpl resolutionFormula = new ResolutionFormulaImpl();
		return resolutionFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialOrReservedValue createSpecialOrReservedValue() {
		SpecialOrReservedValueImpl specialOrReservedValue = new SpecialOrReservedValueImpl();
		return specialOrReservedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleValue createSingleValue() {
		SingleValueImpl singleValue = new SingleValueImpl();
		return singleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mask createMask() {
		MaskImpl mask = new MaskImpl();
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchRange createMatchRange() {
		MatchRangeImpl matchRange = new MatchRangeImpl();
		return matchRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meaning createMeaning() {
		MeaningImpl meaning = new MeaningImpl();
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVariable createMessageVariable() {
		MessageVariableImpl messageVariable = new MessageVariableImpl();
		return messageVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EErtmsType createEErtmsTypeFromString(EDataType eDataType, String initialValue) {
		EErtmsType result = EErtmsType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEErtmsTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionFormulaUnit createResolutionFormulaUnitFromString(EDataType eDataType, String initialValue) {
		ResolutionFormulaUnit result = ResolutionFormulaUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionFormulaUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionFormulaValue createResolutionFormulaValueFromString(EDataType eDataType, String initialValue) {
		ResolutionFormulaValue result = ResolutionFormulaValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionFormulaValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMeaningType createEMeaningTypeFromString(EDataType eDataType, String initialValue) {
		EMeaningType result = EMeaningType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEMeaningTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagesPackage getMessagesPackage() {
		return (MessagesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MessagesPackage getPackage() {
		return MessagesPackage.eINSTANCE;
	}

} //MessagesFactoryImpl
