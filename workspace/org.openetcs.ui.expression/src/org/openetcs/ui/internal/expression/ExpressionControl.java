package org.openetcs.ui.internal.expression;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.editor.controls.AbstractControl;
import org.eclipse.emf.ecp.editor.controls.AttributeControl;
import org.eclipse.emf.ecp.internal.editor.widgets.ECPAttributeWidget;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;

public class ExpressionControl extends AttributeControl {

	
	@Override
	protected Class<?> getSupportedClassType() {
		return String.class;
	}

	@Override
	protected ECPAttributeWidget getWidget() {
		
		return new ExpressionWidget(getContext().getDataBindingContext(),getContext().getEditingDomain(),(InternalProject) ECPProjectManager.INSTANCE.getProject(getContext().getModelElement()));
	}
	
	 @Override
	  public int canRender(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement)
	  {
	    Object feature = itemPropertyDescriptor.getFeature(modelElement);
	    //TODO add more places
	    if(BehaviourPackage.eINSTANCE.getAction_Expression().equals(feature))
	    	return 5;
	    else  if(BehaviourPackage.eINSTANCE.getPreCondition_Condition().equals(feature))
	    	return 5;

	    return AbstractControl.DO_NOT_RENDER;
	  }
}
