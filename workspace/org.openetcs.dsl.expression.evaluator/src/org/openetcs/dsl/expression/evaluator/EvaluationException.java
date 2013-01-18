package org.openetcs.dsl.expression.evaluator;

import org.openetcs.dsl.expression.Expression;

public class EvaluationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Expression expression;

	public EvaluationException(String message,Expression expression) {
		super(message);
		this.expression=expression;
	}

	public Expression getExpression(){
		return expression;
	}
}
