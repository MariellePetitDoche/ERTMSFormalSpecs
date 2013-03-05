/**
 */
package org.openetcs.model.ertmsformalspecs.requirements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EParagraph Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.openetcs.model.ertmsformalspecs.requirements.RequirementsPackage#getEParagraphType()
 * @model
 * @generated
 */
public enum EParagraphType implements Enumerator {
	/**
	 * The '<em><b>Title</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(0, "Title", "Title"),

	/**
	 * The '<em><b>Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DEFINITION(0, "Definition", "Definition"),

	/**
	 * The '<em><b>Note</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTE_VALUE
	 * @generated
	 * @ordered
	 */
	NOTE(0, "Note", "Note"),

	/**
	 * The '<em><b>Deleted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETED_VALUE
	 * @generated
	 * @ordered
	 */
	DELETED(0, "Deleted", "Deleted"),

	/**
	 * The '<em><b>Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIREMENT(0, "Requirement", "Requirement"),

	/**
	 * The '<em><b>Table Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_HEADER(0, "TableHeader", "TableHeader"),

	/**
	 * The '<em><b>Problem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROBLEM_VALUE
	 * @generated
	 * @ordered
	 */
	PROBLEM(0, "Problem", "Problem");

	/**
	 * The '<em><b>Title</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Title</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TITLE
	 * @model name="Title"
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 0;

	/**
	 * The '<em><b>Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFINITION
	 * @model name="Definition"
	 * @generated
	 * @ordered
	 */
	public static final int DEFINITION_VALUE = 0;

	/**
	 * The '<em><b>Note</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Note</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTE
	 * @model name="Note"
	 * @generated
	 * @ordered
	 */
	public static final int NOTE_VALUE = 0;

	/**
	 * The '<em><b>Deleted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deleted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETED
	 * @model name="Deleted"
	 * @generated
	 * @ordered
	 */
	public static final int DELETED_VALUE = 0;

	/**
	 * The '<em><b>Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Requirement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUIREMENT
	 * @model name="Requirement"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIREMENT_VALUE = 0;

	/**
	 * The '<em><b>Table Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Table Header</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_HEADER
	 * @model name="TableHeader"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_HEADER_VALUE = 0;

	/**
	 * The '<em><b>Problem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Problem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROBLEM
	 * @model name="Problem"
	 * @generated
	 * @ordered
	 */
	public static final int PROBLEM_VALUE = 0;

	/**
	 * An array of all the '<em><b>EParagraph Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EParagraphType[] VALUES_ARRAY =
		new EParagraphType[] {
			TITLE,
			DEFINITION,
			NOTE,
			DELETED,
			REQUIREMENT,
			TABLE_HEADER,
			PROBLEM,
		};

	/**
	 * A public read-only list of all the '<em><b>EParagraph Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EParagraphType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EParagraph Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EParagraphType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EParagraphType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EParagraph Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EParagraphType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EParagraphType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EParagraph Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EParagraphType get(int value) {
		switch (value) {
			case TITLE_VALUE: return TITLE;
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
	private EParagraphType(int value, String name, String literal) {
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
	
} //EParagraphType
