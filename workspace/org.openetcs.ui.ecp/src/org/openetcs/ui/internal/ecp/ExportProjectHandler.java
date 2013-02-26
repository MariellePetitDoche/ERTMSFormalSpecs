package org.openetcs.ui.internal.ecp;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.openetcs.es3f.ExportUtil;

public class ExportProjectHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		FileDialog fd=new  FileDialog(HandlerUtil.getActiveShell(event), SWT.SAVE);
		fd.setFilterExtensions(new String[]{"*.efs"});
		String pathToImport=fd.open();
		if(pathToImport==null)
			return null;
		ECPProject project=(ECPProject)((IStructuredSelection) HandlerUtil.getCurrentSelection(event)).getFirstElement();
		
		ExportUtil.exportModel(project, new File(pathToImport));
		return null;
	}

}
