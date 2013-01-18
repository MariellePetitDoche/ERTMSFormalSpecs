/**
 */
package org.openetcs.dsl.expression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openetcs.dsl.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "expression";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.openetcs.org/dsl/Expression";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "expression";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExpressionPackage eINSTANCE = org.openetcs.dsl.expression.impl.ExpressionPackageImpl.init();

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ModelImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Phrase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PHRASE = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.PhraseImpl <em>Phrase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.PhraseImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPhrase()
   * @generated
   */
  int PHRASE = 1;

  /**
   * The number of structural features of the '<em>Phrase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.ExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PHRASE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.StatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = PHRASE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.SingleStatementImpl <em>Single Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.SingleStatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSingleStatement()
   * @generated
   */
  int SINGLE_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Desgnator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT__DESGNATOR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Single Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.SelfStatementImpl <em>Self Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.SelfStatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSelfStatement()
   * @generated
   */
  int SELF_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_STATEMENT__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Self Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.MultiStatementImpl <em>Multi Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.MultiStatementImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getMultiStatement()
   * @generated
   */
  int MULTI_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Desgnator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_STATEMENT__DESGNATOR = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_STATEMENT__EXPRESSIONS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.UnaryExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getUnaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 7;

  /**
   * The number of structural features of the '<em>Unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.TermImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getTerm()
   * @generated
   */
  int TERM = 8;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.DesignatorImpl <em>Designator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.DesignatorImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDesignator()
   * @generated
   */
  int DESIGNATOR = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Designator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESIGNATOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.OrExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 10;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.AndExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.EqualityExpressionImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getEqualityExpression()
   * @generated
   */
  int EQUALITY_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.DashOperationImpl <em>Dash Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.DashOperationImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDashOperation()
   * @generated
   */
  int DASH_OPERATION = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dash Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASH_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.PointOperationImpl <em>Point Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.PointOperationImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPointOperation()
   * @generated
   */
  int POINT_OPERATION = 14;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Point Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINT_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.PowOperationImpl <em>Pow Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.PowOperationImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPowOperation()
   * @generated
   */
  int POW_OPERATION = 15;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_OPERATION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_OPERATION__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_OPERATION__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Pow Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POW_OPERATION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.StringValueImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.IntegerValueImpl <em>Integer Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.IntegerValueImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getIntegerValue()
   * @generated
   */
  int INTEGER_VALUE = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.openetcs.dsl.expression.impl.DoubleValueImpl <em>Double Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openetcs.dsl.expression.impl.DoubleValueImpl
   * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDoubleValue()
   * @generated
   */
  int DOUBLE_VALUE = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE__VALUE = TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_VALUE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.openetcs.dsl.expression.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.Model#getPhrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phrase</em>'.
   * @see org.openetcs.dsl.expression.Model#getPhrase()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Phrase();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Phrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phrase</em>'.
   * @see org.openetcs.dsl.expression.Phrase
   * @generated
   */
  EClass getPhrase();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.openetcs.dsl.expression.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.openetcs.dsl.expression.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.SingleStatement <em>Single Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Statement</em>'.
   * @see org.openetcs.dsl.expression.SingleStatement
   * @generated
   */
  EClass getSingleStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.SingleStatement#getDesgnator <em>Desgnator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Desgnator</em>'.
   * @see org.openetcs.dsl.expression.SingleStatement#getDesgnator()
   * @see #getSingleStatement()
   * @generated
   */
  EReference getSingleStatement_Desgnator();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.SingleStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.openetcs.dsl.expression.SingleStatement#getExpression()
   * @see #getSingleStatement()
   * @generated
   */
  EReference getSingleStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.SelfStatement <em>Self Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self Statement</em>'.
   * @see org.openetcs.dsl.expression.SelfStatement
   * @generated
   */
  EClass getSelfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.SelfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.openetcs.dsl.expression.SelfStatement#getExpression()
   * @see #getSelfStatement()
   * @generated
   */
  EReference getSelfStatement_Expression();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.MultiStatement <em>Multi Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Statement</em>'.
   * @see org.openetcs.dsl.expression.MultiStatement
   * @generated
   */
  EClass getMultiStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.MultiStatement#getDesgnator <em>Desgnator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Desgnator</em>'.
   * @see org.openetcs.dsl.expression.MultiStatement#getDesgnator()
   * @see #getMultiStatement()
   * @generated
   */
  EReference getMultiStatement_Desgnator();

  /**
   * Returns the meta object for the containment reference list '{@link org.openetcs.dsl.expression.MultiStatement#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.openetcs.dsl.expression.MultiStatement#getExpressions()
   * @see #getMultiStatement()
   * @generated
   */
  EReference getMultiStatement_Expressions();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Expression</em>'.
   * @see org.openetcs.dsl.expression.UnaryExpression
   * @generated
   */
  EClass getUnaryExpression();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see org.openetcs.dsl.expression.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.Designator <em>Designator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Designator</em>'.
   * @see org.openetcs.dsl.expression.Designator
   * @generated
   */
  EClass getDesignator();

  /**
   * Returns the meta object for the reference '{@link org.openetcs.dsl.expression.Designator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.Designator#getValue()
   * @see #getDesignator()
   * @generated
   */
  EReference getDesignator_Value();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.openetcs.dsl.expression.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.OrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.OrExpression#getLeft()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.OrExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.OrExpression#getOp()
   * @see #getOrExpression()
   * @generated
   */
  EAttribute getOrExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.OrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.OrExpression#getRight()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.openetcs.dsl.expression.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.AndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.AndExpression#getLeft()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.AndExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.AndExpression#getOp()
   * @see #getAndExpression()
   * @generated
   */
  EAttribute getAndExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.AndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.AndExpression#getRight()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.EqualityExpression <em>Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality Expression</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression
   * @generated
   */
  EClass getEqualityExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.EqualityExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression#getLeft()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.EqualityExpression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression#getOp()
   * @see #getEqualityExpression()
   * @generated
   */
  EAttribute getEqualityExpression_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.EqualityExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.EqualityExpression#getRight()
   * @see #getEqualityExpression()
   * @generated
   */
  EReference getEqualityExpression_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.DashOperation <em>Dash Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dash Operation</em>'.
   * @see org.openetcs.dsl.expression.DashOperation
   * @generated
   */
  EClass getDashOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.DashOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.DashOperation#getLeft()
   * @see #getDashOperation()
   * @generated
   */
  EReference getDashOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.DashOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.DashOperation#getOp()
   * @see #getDashOperation()
   * @generated
   */
  EAttribute getDashOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.DashOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.DashOperation#getRight()
   * @see #getDashOperation()
   * @generated
   */
  EReference getDashOperation_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.PointOperation <em>Point Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Point Operation</em>'.
   * @see org.openetcs.dsl.expression.PointOperation
   * @generated
   */
  EClass getPointOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PointOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.PointOperation#getLeft()
   * @see #getPointOperation()
   * @generated
   */
  EReference getPointOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.PointOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.PointOperation#getOp()
   * @see #getPointOperation()
   * @generated
   */
  EAttribute getPointOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PointOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.PointOperation#getRight()
   * @see #getPointOperation()
   * @generated
   */
  EReference getPointOperation_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.PowOperation <em>Pow Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pow Operation</em>'.
   * @see org.openetcs.dsl.expression.PowOperation
   * @generated
   */
  EClass getPowOperation();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PowOperation#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.openetcs.dsl.expression.PowOperation#getLeft()
   * @see #getPowOperation()
   * @generated
   */
  EReference getPowOperation_Left();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.PowOperation#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.openetcs.dsl.expression.PowOperation#getOp()
   * @see #getPowOperation()
   * @generated
   */
  EAttribute getPowOperation_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.openetcs.dsl.expression.PowOperation#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.openetcs.dsl.expression.PowOperation#getRight()
   * @see #getPowOperation()
   * @generated
   */
  EReference getPowOperation_Right();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.openetcs.dsl.expression.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.IntegerValue <em>Integer Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value</em>'.
   * @see org.openetcs.dsl.expression.IntegerValue
   * @generated
   */
  EClass getIntegerValue();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.IntegerValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.IntegerValue#getValue()
   * @see #getIntegerValue()
   * @generated
   */
  EAttribute getIntegerValue_Value();

  /**
   * Returns the meta object for class '{@link org.openetcs.dsl.expression.DoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Value</em>'.
   * @see org.openetcs.dsl.expression.DoubleValue
   * @generated
   */
  EClass getDoubleValue();

  /**
   * Returns the meta object for the attribute '{@link org.openetcs.dsl.expression.DoubleValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.openetcs.dsl.expression.DoubleValue#getValue()
   * @see #getDoubleValue()
   * @generated
   */
  EAttribute getDoubleValue_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExpressionFactory getExpressionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ModelImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Phrase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PHRASE = eINSTANCE.getModel_Phrase();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.PhraseImpl <em>Phrase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.PhraseImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPhrase()
     * @generated
     */
    EClass PHRASE = eINSTANCE.getPhrase();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.ExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.StatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.SingleStatementImpl <em>Single Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.SingleStatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSingleStatement()
     * @generated
     */
    EClass SINGLE_STATEMENT = eINSTANCE.getSingleStatement();

    /**
     * The meta object literal for the '<em><b>Desgnator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATEMENT__DESGNATOR = eINSTANCE.getSingleStatement_Desgnator();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_STATEMENT__EXPRESSION = eINSTANCE.getSingleStatement_Expression();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.SelfStatementImpl <em>Self Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.SelfStatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getSelfStatement()
     * @generated
     */
    EClass SELF_STATEMENT = eINSTANCE.getSelfStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF_STATEMENT__EXPRESSION = eINSTANCE.getSelfStatement_Expression();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.MultiStatementImpl <em>Multi Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.MultiStatementImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getMultiStatement()
     * @generated
     */
    EClass MULTI_STATEMENT = eINSTANCE.getMultiStatement();

    /**
     * The meta object literal for the '<em><b>Desgnator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_STATEMENT__DESGNATOR = eINSTANCE.getMultiStatement_Desgnator();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_STATEMENT__EXPRESSIONS = eINSTANCE.getMultiStatement_Expressions();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.UnaryExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getUnaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.TermImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.DesignatorImpl <em>Designator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.DesignatorImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDesignator()
     * @generated
     */
    EClass DESIGNATOR = eINSTANCE.getDesignator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESIGNATOR__VALUE = eINSTANCE.getDesignator_Value();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.OrExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LEFT = eINSTANCE.getOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OR_EXPRESSION__OP = eINSTANCE.getOrExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RIGHT = eINSTANCE.getOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.AndExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LEFT = eINSTANCE.getAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND_EXPRESSION__OP = eINSTANCE.getAndExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RIGHT = eINSTANCE.getAndExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.EqualityExpressionImpl <em>Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.EqualityExpressionImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getEqualityExpression()
     * @generated
     */
    EClass EQUALITY_EXPRESSION = eINSTANCE.getEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__LEFT = eINSTANCE.getEqualityExpression_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY_EXPRESSION__OP = eINSTANCE.getEqualityExpression_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY_EXPRESSION__RIGHT = eINSTANCE.getEqualityExpression_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.DashOperationImpl <em>Dash Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.DashOperationImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDashOperation()
     * @generated
     */
    EClass DASH_OPERATION = eINSTANCE.getDashOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DASH_OPERATION__LEFT = eINSTANCE.getDashOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DASH_OPERATION__OP = eINSTANCE.getDashOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DASH_OPERATION__RIGHT = eINSTANCE.getDashOperation_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.PointOperationImpl <em>Point Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.PointOperationImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPointOperation()
     * @generated
     */
    EClass POINT_OPERATION = eINSTANCE.getPointOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_OPERATION__LEFT = eINSTANCE.getPointOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POINT_OPERATION__OP = eINSTANCE.getPointOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINT_OPERATION__RIGHT = eINSTANCE.getPointOperation_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.PowOperationImpl <em>Pow Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.PowOperationImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getPowOperation()
     * @generated
     */
    EClass POW_OPERATION = eINSTANCE.getPowOperation();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW_OPERATION__LEFT = eINSTANCE.getPowOperation_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POW_OPERATION__OP = eINSTANCE.getPowOperation_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POW_OPERATION__RIGHT = eINSTANCE.getPowOperation_Right();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.StringValueImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.IntegerValueImpl <em>Integer Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.IntegerValueImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getIntegerValue()
     * @generated
     */
    EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE__VALUE = eINSTANCE.getIntegerValue_Value();

    /**
     * The meta object literal for the '{@link org.openetcs.dsl.expression.impl.DoubleValueImpl <em>Double Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openetcs.dsl.expression.impl.DoubleValueImpl
     * @see org.openetcs.dsl.expression.impl.ExpressionPackageImpl#getDoubleValue()
     * @generated
     */
    EClass DOUBLE_VALUE = eINSTANCE.getDoubleValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_VALUE__VALUE = eINSTANCE.getDoubleValue_Value();

  }

} //ExpressionPackage
