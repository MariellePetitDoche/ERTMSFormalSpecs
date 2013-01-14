package org.openetcs.ui.internal.expression;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.editor.mecontrols.AbstractMEControl;
import org.eclipse.emf.ecp.editor.mecontrols.MEAttributeControl;
import org.eclipse.emf.ecp.editor.mecontrols.widgets.ECPAttributeWidget;
import org.eclipse.emf.ecp.spi.core.InternalProject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.openetcs.model.ertmsformalspecs.behaviour.BehaviourPackage;

public class ExpressionControl extends MEAttributeControl {

	
	@Override
	protected Class<?> getClassType() {
		return String.class;
	}

	@Override
	protected ECPAttributeWidget getAttributeWidget(DataBindingContext dbc) {
		
		return new ExpressionWidget(dbc,getContext().getEditingDomain(),(InternalProject) ECPProjectManager.INSTANCE.getProject(getModelElement()));
	}
	
	 @Override
	  public int canRender(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement)
	  {
	    Object feature = itemPropertyDescriptor.getFeature(modelElement);
	    //TODO add more places
	    if(BehaviourPackage.eINSTANCE.getAction_Expression().equals(feature))
	    	return 5;

	    return AbstractMEControl.DO_NOT_RENDER;
	  }
}
