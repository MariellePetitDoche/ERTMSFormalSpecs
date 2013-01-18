/**
 */
package org.openetcs.dsl.expression.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openetcs.dsl.expression.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExpressionFactory init()
  {
    try
    {
      ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openetcs.org/dsl/Expression"); 
      if (theExpressionFactory != null)
      {
        return theExpressionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExpressionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExpressionPackage.MODEL: return createModel();
      case ExpressionPackage.PHRASE: return createPhrase();
      case ExpressionPackage.EXPRESSION: return createExpression();
      case ExpressionPackage.STATEMENT: return createStatement();
      case ExpressionPackage.SINGLE_STATEMENT: return createSingleStatement();
      case ExpressionPackage.SELF_STATEMENT: return createSelfStatement();
      case ExpressionPackage.MULTI_STATEMENT: return createMultiStatement();
      case ExpressionPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case ExpressionPackage.TERM: return createTerm();
      case ExpressionPackage.DESIGNATOR: return createDesignator();
      case ExpressionPackage.OR_EXPRESSION: return createOrExpression();
      case ExpressionPackage.AND_EXPRESSION: return createAndExpression();
      case ExpressionPackage.EQUALITY_EXPRESSION: return createEqualityExpression();
      case ExpressionPackage.DASH_OPERATION: return createDashOperation();
      case ExpressionPackage.POINT_OPERATION: return createPointOperation();
      case ExpressionPackage.POW_OPERATION: return createPowOperation();
      case ExpressionPackage.STRING_VALUE: return createStringValue();
      case ExpressionPackage.INTEGER_VALUE: return createIntegerValue();
      case ExpressionPackage.DOUBLE_VALUE: return createDoubleValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phrase createPhrase()
  {
    PhraseImpl phrase = new PhraseImpl();
    return phrase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleStatement createSingleStatement()
  {
    SingleStatementImpl singleStatement = new SingleStatementImpl();
    return singleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelfStatement createSelfStatement()
  {
    SelfStatementImpl selfStatement = new SelfStatementImpl();
    return selfStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiStatement createMultiStatement()
  {
    MultiStatementImpl multiStatement = new MultiStatementImpl();
    return multiStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Designator createDesignator()
  {
    DesignatorImpl designator = new DesignatorImpl();
    return designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EqualityExpression createEqualityExpression()
  {
    EqualityExpressionImpl equalityExpression = new EqualityExpressionImpl();
    return equalityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DashOperation createDashOperation()
  {
    DashOperationImpl dashOperation = new DashOperationImpl();
    return dashOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointOperation createPointOperation()
  {
    PointOperationImpl pointOperation = new PointOperationImpl();
    return pointOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PowOperation createPowOperation()
  {
    PowOperationImpl powOperation = new PowOperationImpl();
    return powOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerValue createIntegerValue()
  {
    IntegerValueImpl integerValue = new IntegerValueImpl();
    return integerValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleValue createDoubleValue()
  {
    DoubleValueImpl doubleValue = new DoubleValueImpl();
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionPackage getExpressionPackage()
  {
    return (ExpressionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExpressionPackage getPackage()
  {
    return ExpressionPackage.eINSTANCE;
  }

} //ExpressionFactoryImpl
