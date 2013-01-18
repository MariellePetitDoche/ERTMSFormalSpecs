package org.openetcs.ui.internal.statechart.pattern;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.openetcs.dsl.expression.Designator;
import org.openetcs.dsl.expression.Expression;
import org.openetcs.dsl.expression.Model;
import org.openetcs.dsl.expression.Phrase;
import org.openetcs.dsl.expression.SelfStatement;
import org.openetcs.dsl.expression.SingleStatement;
import org.openetcs.dsl.expression.evaluator.EvaluationException;
import org.openetcs.dsl.expression.evaluator.EvaluationResult;
import org.openetcs.dsl.expression.evaluator.OBJECT_TYPE;
import org.openetcs.dsl.expression.evaluator.ParserUtil;
import org.openetcs.model.ertmsformalspecs.State;
import org.openetcs.model.ertmsformalspecs.StateMachine;
import org.openetcs.model.ertmsformalspecs.behaviour.Action;
import org.openetcs.model.ertmsformalspecs.behaviour.PreCondition;
import org.openetcs.model.ertmsformalspecs.behaviour.Rule;
import org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition;

public class AddOldElementsFeature extends AbstractAddFeature {
	
	public AddOldElementsFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Diagram createDiagram = (Diagram) context.getTargetContainer();
		Object object=getBusinessObjectForPictogramElement(createDiagram);
		StateMachine stateMachine=(StateMachine) object;
		for(State state:stateMachine.getStates()){
			AddContext addContext = new AddContext();
			addContext.setNewObject(state);
			addContext.setTargetContainer(createDiagram);
			addContext.setHeight(state.getHeight());
			addContext.setWidth(state.getWidth());
			addContext.setX(state.getX());
			addContext.setY(state.getY());
			
			getFeatureProvider().addIfPossible(addContext);
			
		}
		for(State state:stateMachine.getStates()){
			StateMachine stateStateMachine= state.getStateMachine();
			if(stateStateMachine==null)
				continue;
			for(Rule rule:stateStateMachine.getRules()){
				for(RuleCondition condition:rule.getConditions()){
					boolean preConditionAsserted=true;
					for(PreCondition preCondition:condition.getPreconditions()){
						Model model=ParserUtil.text2Model(preCondition.getCondition());
						Phrase expression=model.getPhrase();
						if(Expression.class.isInstance(expression)){
							try {
								EvaluationResult result=ParserUtil.evaluate((Expression) expression);
								if(OBJECT_TYPE.BOOLEAN==result.getType()){
									preConditionAsserted&=(Boolean)result.getValue();
								}
							} catch (EvaluationException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
					if(preConditionAsserted)
					for(Action action: condition.getActions()){
						Model model=ParserUtil.text2Model(action.getExpression());
						Phrase expression=model.getPhrase();
						State stateFrom=null;
						State stateTo=null;
						if(expression instanceof SingleStatement){
							SingleStatement statement= (SingleStatement) expression;
							stateFrom= (State)statement.getDesgnator().getValue();
							stateTo= (State)((Designator)statement.getExpression()).getValue();
						}
						if(expression instanceof SelfStatement){
							SelfStatement statement= (SelfStatement) expression;
							stateFrom= state;
							stateTo= (State)((Designator)statement.getExpression()).getValue();
						}
						
						
						
						ContainerShape shapeFrom=(ContainerShape) getFeatureProvider().getPictogramElementForBusinessObject(stateFrom);
						ContainerShape shapeTo=(ContainerShape) getFeatureProvider().getPictogramElementForBusinessObject(stateTo);
						AddConnectionContext connectionContext=new AddConnectionContext(shapeFrom.getAnchors().get(0), shapeTo.getAnchors().get(0));
						getFeatureProvider().addIfPossible(connectionContext);
					}
				}
			}
		}
		
        
 
        return null;
    }
	
	@Override
    public boolean canAdd(IAddContext context) {
			return true;
    }
	
	
}
