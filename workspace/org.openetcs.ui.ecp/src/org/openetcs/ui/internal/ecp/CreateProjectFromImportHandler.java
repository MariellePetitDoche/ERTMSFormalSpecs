package org.openetcs.ui.internal.ecp;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.ui.util.HandlerHelper;
import org.eclipse.emf.ecp.wizards.CreateProjectWizard;
import org.eclipse.emf.ecp.wizards.WizardUICallback;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openetcs.es3f.ImportUtil;

public class CreateProjectFromImportHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		FileDialog fd=new  FileDialog(HandlerUtil.getActiveShell(event), SWT.OPEN);
		fd.setFilterExtensions(new String[]{"*.efs"});
		String pathToImport=fd.open();
		if(pathToImport==null)
			return null;
		ECPProject project=HandlerHelper.createProject(new WizardUICallback(HandlerUtil.getActiveShell(event), new CreateProjectWizard()));
		ImportUtil.importModel(new File(pathToImport), project);
		return null;
	}

}
