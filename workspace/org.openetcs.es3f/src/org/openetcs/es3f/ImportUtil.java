package org.openetcs.es3f;

import java.io.File;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.openetcs.es3f.generated.acceptor;
import org.openetcs.es3f.importer.Importer;

import com.raincode.xmlbooster.xmlb.xmlBException;
import com.raincode.xmlbooster.xmlb.xmlBFileContext;


/**
 * This is the Util class for importing a es3f file containing a model into an {@link ECPProject}.
 * 
 * @author Eugen Neufeld
 *
 */
public class ImportUtil {

	public static void importModel(File fileToImport, final ECPProject importProject)
	{
		xmlBFileContext ctxt = new xmlBFileContext();
		if ( ctxt.readFile(fileToImport.getAbsolutePath()) )
		{
			org.openetcs.es3f.generated.Dictionary dictionary;
			try 
			{
				dictionary = acceptor.acceptDictionary(ctxt);
			
				if ( dictionary != null )
				{
					final org.openetcs.model.ertmsformalspecs.Dictionary importedDictionary = Importer.importDictionary(importProject, dictionary);
					importProject.getEditingDomain().getCommandStack().execute(new ChangeCommand(importedDictionary) {
						@Override
						protected void doExecute() {
							importProject.getElements().add(importedDictionary);
						}
					});
				}
				else 
				{
					throw new RuntimeException("Cannot read file contents");
				}
			} 
			catch (xmlBException e)
			{
				throw new RuntimeException("Cannot read file contents", e);				
			}
		}
		else 
		{
			throw new RuntimeException("Cannot open file " + fileToImport.getAbsolutePath());
		}
	}
}
