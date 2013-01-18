package org.openetcs.dsl.expression.evaluator;

public class EvaluationResult {
	
	private final OBJECT_TYPE type;
	private final Object value;
	
	public EvaluationResult(OBJECT_TYPE type, Object value) {
		super();
		this.type = type;
		this.value = value;
	}
	public OBJECT_TYPE getType() {
		return type;
	}
	public Object getValue() {
		return value;
	}
	
}