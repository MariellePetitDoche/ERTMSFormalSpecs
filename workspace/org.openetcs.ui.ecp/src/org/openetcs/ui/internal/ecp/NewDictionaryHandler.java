package org.openetcs.ui.internal.ecp;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.ActionHelper;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelFactory;

public class NewDictionaryHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection=HandlerUtil.getCurrentSelection(event);
		if(selection instanceof IStructuredSelection){
			IStructuredSelection ssel=(IStructuredSelection)selection;
			if(ssel.getFirstElement() instanceof ECPProject){
				ECPProject project=(ECPProject) ssel.getFirstElement();
				
				Dictionary dictionary=ModelFactory.eINSTANCE.createDictionary();
				project.getElements().add(dictionary);
				ActionHelper.openModelElement(dictionary, NewDictionaryHandler.class.getName(), project);
			}
		}
		return null;
	}

}
