/**
 */
package org.openetcs.model.ertmsformalspecs.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Precision</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.types.TypesPackage#getPrecision()
 * @model
 * @generated
 */
public enum Precision implements Enumerator {
	/**
	 * The '<em><b>Integer Precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER_PRECISION(0, "IntegerPrecision", "IntegerPrecision"), /**
	 * The '<em><b>Double Precision</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_PRECISION(0, "DoublePrecision", "DoublePrecision")
	;

	/**
	 * The '<em><b>Integer Precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer Precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_PRECISION
	 * @model name="IntegerPrecision"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_PRECISION_VALUE = 0;

/**
	 * The '<em><b>Double Precision</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double Precision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_PRECISION
	 * @model name="DoublePrecision"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_PRECISION_VALUE = 0;

	/**
	 * An array of all the '<em><b>Precision</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Precision[] VALUES_ARRAY =
		new Precision[] {
			INTEGER_PRECISION,
			DOUBLE_PRECISION,
		};

	/**
	 * A public read-only list of all the '<em><b>Precision</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Precision> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Precision</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Precision get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Precision result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Precision</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Precision getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Precision result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Precision</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Precision get(int value) {
		switch (value) {
			case INTEGER_PRECISION_VALUE: return INTEGER_PRECISION;
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
	private Precision(int value, String name, String literal) {
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
	
} //Precision
