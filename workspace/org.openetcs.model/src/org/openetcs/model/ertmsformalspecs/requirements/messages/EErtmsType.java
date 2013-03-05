/**
 */
package org.openetcs.model.ertmsformalspecs.requirements.messages;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EErtms Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.requirements.messages.MessagesPackage#getEErtmsType()
 * @model
 * @generated
 */
public enum EErtmsType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"), /**
	 * The '<em><b>Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE(0, "distance", "Distance"),

	/**
	 * The '<em><b>Gradient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRADIENT_VALUE
	 * @generated
	 * @ordered
	 */
	GRADIENT(0, "Gradient", "Gradient"),

	/**
	 * The '<em><b>Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	LENGTH(0, "Length", "Length"),

	/**
	 * The '<em><b>Miscellaneous</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MISCELLANEOUS_VALUE
	 * @generated
	 * @ordered
	 */
	MISCELLANEOUS(0, "Miscellaneous", "Miscellaneous"), /**
	 * The '<em><b>Class Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_NUMBER(0, "ClassNumber", "ClassNumber"),

	/**
	 * The '<em><b>Identity Number</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITY_NUMBER(0, "IdentityNumber", "IdentityNumber"),

	/**
	 * The '<em><b>Qualifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUALIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	QUALIFIER(0, "Qualifier", "Qualifier"),

	/**
	 * The '<em><b>Time Or Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_OR_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_OR_DATE(0, "TimeOrDate", "TimeOrDate"),

	/**
	 * The '<em><b>Speed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	SPEED(0, "Speed", "Speed"),

	/**
	 * The '<em><b>Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(0, "Text", "Text");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTANCE
	 * @model name="distance" literal="Distance"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_VALUE = 0;

	/**
	 * The '<em><b>Gradient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gradient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRADIENT
	 * @model name="Gradient"
	 * @generated
	 * @ordered
	 */
	public static final int GRADIENT_VALUE = 0;

	/**
	 * The '<em><b>Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Length</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LENGTH
	 * @model name="Length"
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_VALUE = 0;

	/**
	 * The '<em><b>Miscellaneous</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Miscellaneous</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MISCELLANEOUS
	 * @model name="Miscellaneous"
	 * @generated
	 * @ordered
	 */
	public static final int MISCELLANEOUS_VALUE = 0;

	/**
	 * The '<em><b>Class Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Class Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_NUMBER
	 * @model name="ClassNumber"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_NUMBER_VALUE = 0;

	/**
	 * The '<em><b>Identity Number</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Identity Number</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_NUMBER
	 * @model name="IdentityNumber"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY_NUMBER_VALUE = 0;

	/**
	 * The '<em><b>Qualifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Qualifier</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUALIFIER
	 * @model name="Qualifier"
	 * @generated
	 * @ordered
	 */
	public static final int QUALIFIER_VALUE = 0;

	/**
	 * The '<em><b>Time Or Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time Or Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_OR_DATE
	 * @model name="TimeOrDate"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_OR_DATE_VALUE = 0;

	/**
	 * The '<em><b>Speed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Speed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEED
	 * @model name="Speed"
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_VALUE = 0;

	/**
	 * The '<em><b>Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model name="Text"
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 0;

	/**
	 * An array of all the '<em><b>EErtms Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EErtmsType[] VALUES_ARRAY =
		new EErtmsType[] {
			NONE,
			DISTANCE,
			GRADIENT,
			LENGTH,
			MISCELLANEOUS,
			CLASS_NUMBER,
			IDENTITY_NUMBER,
			QUALIFIER,
			TIME_OR_DATE,
			SPEED,
			TEXT,
		};

	/**
	 * A public read-only list of all the '<em><b>EErtms Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EErtmsType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EErtms Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EErtmsType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EErtmsType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EErtms Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EErtmsType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EErtmsType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EErtms Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EErtmsType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EErtmsType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EErtmsType
