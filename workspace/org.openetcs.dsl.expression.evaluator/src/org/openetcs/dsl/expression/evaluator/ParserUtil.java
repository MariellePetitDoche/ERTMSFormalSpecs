package org.openetcs.dsl.expression.evaluator;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.openetcs.dsl.expression.AndExpression;
import org.openetcs.dsl.expression.DashOperation;
import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.DoubleValue;
import org.openetcs.dsl.expression.EqualityExpression;
import org.openetcs.dsl.expression.Expression;
import org.openetcs.dsl.expression.IntegerValue;
import org.openetcs.dsl.expression.Model;
import org.openetcs.dsl.expression.OrExpression;
import org.openetcs.dsl.expression.PointOperation;
import org.openetcs.dsl.expression.PowOperation;
import org.openetcs.dsl.expression.StringValue;
import org.openetcs.dsl.expression.internal.evaluator.Activator;
import org.openetcs.dsl.ui.internal.ExpressionActivator;

import com.google.inject.Injector;

public class ParserUtil {

	public static Model text2Model(String text) {

		XtextResourceSet resourceSet = getInjector().getInstance(
				XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI
				.createURI("VIRTUAL_URI"));
		InputStream in = new ByteArrayInputStream(text.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			Activator.log(e);
		}
		Model model = (Model) resource.getContents().get(0);
		return model;
	}

	private static Injector getInjector() {
		return ExpressionActivator.getInstance().getInjector(
				ExpressionActivator.ORG_OPENETCS_DSL_EXPRESSION);
	}

	private static final double EPSILON= 0.000000001;
	
	public static EvaluationResult evaluate(Expression expression) throws EvaluationException {
		if (expression instanceof OrExpression) {
			return doEvaluate((OrExpression) expression);
		}
		if (expression instanceof AndExpression) {
			return doEvaluate((AndExpression) expression);
		}
		if (expression instanceof EqualityExpression) {
			return doEvaluate((EqualityExpression) expression);
		}
		if (expression instanceof DashOperation) {
			return doEvaluate((DashOperation) expression);
		}
		if (expression instanceof PointOperation) {
			return doEvaluate((PointOperation) expression);
		}
		if (expression instanceof PowOperation) {
			return doEvaluate((PowOperation) expression);
		}
		if (expression instanceof Designator) {
			return doEvaluate((Designator) expression);
		}
		if (expression instanceof StringValue) {
			return doEvaluate((StringValue) expression);
		}
		if (expression instanceof IntegerValue) {
			return doEvaluate((IntegerValue) expression);
		}
		if (expression instanceof DoubleValue) {
			return doEvaluate((DoubleValue) expression);
		}
		return null;
	}


	private static EvaluationResult doEvaluate(OrExpression orExpression) throws EvaluationException {
		EvaluationResult left = evaluate(orExpression.getLeft());
		EvaluationResult right = evaluate(orExpression.getRight());
		if(OBJECT_TYPE.BOOLEAN==left.getType()&&OBJECT_TYPE.BOOLEAN==right.getType()){
			Boolean leftValue=(Boolean)left.getValue();
			Boolean rightValue=(Boolean)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.BOOLEAN, new Boolean(leftValue||rightValue));
		}
		throw new EvaluationException("Wrong types", orExpression);
	}

	private static EvaluationResult doEvaluate(AndExpression andExpression) throws EvaluationException {
		EvaluationResult left = evaluate(andExpression.getLeft());
		EvaluationResult right = evaluate(andExpression.getRight());
		if(OBJECT_TYPE.BOOLEAN==left.getType()&&OBJECT_TYPE.BOOLEAN==right.getType()){
			Boolean leftValue=(Boolean)left.getValue();
			Boolean rightValue=(Boolean)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.BOOLEAN, new Boolean(leftValue&&rightValue));
		}
		throw new EvaluationException("Wrong types", andExpression);
	}

	private static EvaluationResult doEvaluate(
			EqualityExpression equalityExpression) throws EvaluationException {
		EvaluationResult left = evaluate(equalityExpression.getLeft());
		EvaluationResult right = evaluate(equalityExpression.getRight());
		String operation = equalityExpression.getOp();
		if ("==".equals(operation)) {
			return doEvaluateEquals(left,right);
		} else if ("!=".equals(operation)) {
			return doEvaluateNotEquals(left,right);
		} else if ("<=".equals(operation)) {
			return doEvaluateLessEquals(left,right);
		} else if (">=".equals(operation)) {
			return doEvaluateGreaterEquals(left,right);
		} else if ("in".equals(operation)) {
			return doEvaluateIn(left,right);
		} else if ("not in".equals(operation)) {
			return doEvaluateNotIn(left,right);
		}
		throw new EvaluationException("Unknown operation", equalityExpression);
	}
	private static EvaluationResult doEvaluateNotIn(EvaluationResult left,
			EvaluationResult right) {
		throw new UnsupportedOperationException();
	}

	private static EvaluationResult doEvaluateIn(EvaluationResult left,
			EvaluationResult right) {
		throw new UnsupportedOperationException();
	}

	private static EvaluationResult doEvaluateGreaterEquals(
			EvaluationResult left, EvaluationResult right) {
		// FIXME NOT DEFINED!!!
		return null;
	}

	private static EvaluationResult doEvaluateLessEquals(EvaluationResult left,
			EvaluationResult right) {
		// FIXME NOT DEFINED!!!
		return null;
	}

	private static EvaluationResult doEvaluateNotEquals(EvaluationResult left,
			EvaluationResult right) throws EvaluationException {
		EvaluationResult result=doEvaluateEquals(left, right);
		Boolean value=(Boolean) result.getValue();
		return new EvaluationResult(OBJECT_TYPE.BOOLEAN, new Boolean(!value));
	}

	private static EvaluationResult doEvaluateEquals(EvaluationResult left,
			EvaluationResult right) throws EvaluationException {
		//FIXME ask Laureint what about if integer+ float how to diff float from in if 1.1==1 ?
		if(OBJECT_TYPE.INTEGER==left.getType()&&OBJECT_TYPE.INTEGER==right.getType()){
			boolean result=((Integer)left.getValue()).intValue()==((Integer)right.getValue()).intValue();
			return new EvaluationResult(OBJECT_TYPE.BOOLEAN, new Boolean(result));
		}
		else if(OBJECT_TYPE.DOUBLE==left.getType()&&OBJECT_TYPE.DOUBLE==right.getType()){
			boolean result=Math.abs((Double)left.getValue()-(Double)right.getValue())<EPSILON;
			return new EvaluationResult(OBJECT_TYPE.BOOLEAN, new Boolean(result));
		}
		throw new EvaluationException("Wrong Types", null);
	}

	private static EvaluationResult doEvaluate(DashOperation dashExpression) throws EvaluationException {
		EvaluationResult left = evaluate(dashExpression.getLeft());
		EvaluationResult right = evaluate(dashExpression.getRight());
		String operation = dashExpression.getOp();
		if ("+".equals(operation)) {
			return doEvaluateAdd(left,right);
		} else if ("-".equals(operation)) {
			return doEvaluateMinus(left,right);
		}
		throw new EvaluationException("Unknown operation", dashExpression);
	}
	private static EvaluationResult doEvaluateMinus(EvaluationResult left,
			EvaluationResult right) throws EvaluationException {
		if(OBJECT_TYPE.INTEGER==left.getType()&&OBJECT_TYPE.INTEGER==right.getType()){
			int result=(Integer)left.getValue()-(Integer)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.INTEGER, new Integer(result));
		}
		else if(OBJECT_TYPE.DOUBLE==left.getType()&&OBJECT_TYPE.DOUBLE==right.getType()){
			double result=(Double)left.getValue()-(Double)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.DOUBLE, new Double(result));
		}
		throw new EvaluationException("Wrong Types", null);
	}

	private static EvaluationResult doEvaluateAdd(EvaluationResult left,
			EvaluationResult right) throws EvaluationException {
		if(OBJECT_TYPE.INTEGER==left.getType()&&OBJECT_TYPE.INTEGER==right.getType()){
			int result=(Integer)left.getValue()+(Integer)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.INTEGER, new Integer(result));
		}
		else if(OBJECT_TYPE.DOUBLE==left.getType()&&OBJECT_TYPE.DOUBLE==right.getType()){
			double result=(Double)left.getValue()+(Double)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.DOUBLE, new Double(result));
		}
		throw new EvaluationException("Wrong Types", null);
	}

	private static EvaluationResult doEvaluate(PointOperation pointExpression) throws EvaluationException {
		EvaluationResult left = evaluate(pointExpression.getLeft());
		EvaluationResult right = evaluate(pointExpression.getRight());
		String operation = pointExpression.getOp();
		if ("*".equals(operation)) {
			return doEvaluateMultiplication(left,right);
		} else if ("/".equals(operation)) {
			return doEvaluateDivision(left,right);
		}
		throw new EvaluationException("Unknown operation", pointExpression);
	}
	private static EvaluationResult doEvaluateDivision(EvaluationResult left,
			EvaluationResult right) throws EvaluationException {
		if(OBJECT_TYPE.INTEGER==left.getType()&&OBJECT_TYPE.INTEGER==right.getType()&&((Integer)right.getValue()!=0)){
			int result=(Integer)left.getValue()/(Integer)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.INTEGER, new Integer(result));
		}
		else if(OBJECT_TYPE.DOUBLE==left.getType()&&OBJECT_TYPE.DOUBLE==right.getType()&&((Double)right.getValue()!=0)){
			double result=(Double)left.getValue()/(Double)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.DOUBLE, new Double(result));
		}
		throw new EvaluationException("Wrong Types", null);
	}

	private static EvaluationResult doEvaluateMultiplication(
			EvaluationResult left, EvaluationResult right) throws EvaluationException {
		if(OBJECT_TYPE.INTEGER==left.getType()&&OBJECT_TYPE.INTEGER==right.getType()){
			int result=(Integer)left.getValue()*(Integer)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.INTEGER, new Integer(result));
		}
		else if(OBJECT_TYPE.DOUBLE==left.getType()&&OBJECT_TYPE.DOUBLE==right.getType()){
			double result=(Double)left.getValue()*(Double)right.getValue();
			return new EvaluationResult(OBJECT_TYPE.DOUBLE, new Double(result));
		}
		throw new EvaluationException("Wrong Types", null);
	}

	private static EvaluationResult doEvaluate(PowOperation powExpression) throws EvaluationException {
		EvaluationResult left = evaluate(powExpression.getLeft());
		EvaluationResult right = evaluate(powExpression.getRight());
		if(OBJECT_TYPE.INTEGER==left.getType()&&OBJECT_TYPE.INTEGER==right.getType()){
			double result=Math.pow(((Integer)left.getValue()).doubleValue(),((Integer)right.getValue()).doubleValue());
			return new EvaluationResult(OBJECT_TYPE.DOUBLE, new Double(result));
		}
		else if(OBJECT_TYPE.DOUBLE==left.getType()&&OBJECT_TYPE.DOUBLE==right.getType()){
			double result=Math.pow((Double)left.getValue(),(Double)right.getValue());
			return new EvaluationResult(OBJECT_TYPE.DOUBLE, new Double(result));
		}
		throw new EvaluationException("Wrong Types", null);
	}
	private static EvaluationResult doEvaluate(Designator expression) {
		return new EvaluationResult(OBJECT_TYPE.EOBJECT,expression.getValue());
	}
	private static EvaluationResult doEvaluate(StringValue expression) {
		return new EvaluationResult(OBJECT_TYPE.STRING,expression.getValue());
	}
	private static EvaluationResult doEvaluate(DoubleValue expression) {
		return new EvaluationResult(OBJECT_TYPE.DOUBLE,expression.getValue());
	}
	private static EvaluationResult doEvaluate(IntegerValue expression) {
		return new EvaluationResult(OBJECT_TYPE.INTEGER,expression.getValue());
	}
}
