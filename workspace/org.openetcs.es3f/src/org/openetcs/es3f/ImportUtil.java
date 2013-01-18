package org.openetcs.es3f;

import java.io.File;

import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelFactory;
import org.openetcs.model.ertmsformalspecs.Namespace;
import org.openetcs.es3f.importer.generated.*;

import com.raincode.xmlbooster.xmlb.xmlBException;
import com.raincode.xmlbooster.xmlb.xmlBFileContext;


/**
 * This is the Util class for importing a es3f file containing a model into an {@link ECPProject}.
 * 
 * @author Eugen Neufeld
 *
 */
public class ImportUtil {

	public static void importModel(File fileToImport, ECPProject importProject)
	{
		acceptor.setFactory ( new org.openetcs.es3f.importer.Factory() );
		xmlBFileContext ctxt = new xmlBFileContext();
		if ( ctxt.readFile(fileToImport.getAbsolutePath()) )
		{
			org.openetcs.es3f.importer.Dictionary dictionary;
			try 
			{
				dictionary = (org.openetcs.es3f.importer.Dictionary) acceptor.acceptDictionary(ctxt);
			
				if ( dictionary != null )
				{
					org.openetcs.model.ertmsformalspecs.Dictionary importedDictionary = dictionary.convert2EMF(importProject);
					importProject.getElements().add(importedDictionary);
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
