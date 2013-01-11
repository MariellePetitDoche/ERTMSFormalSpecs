package org.openetcs.es3f;

import java.io.File;

import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelFactory;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Namespace;

/**
 * This is the Util class for importing a es3f file containing a model into an {@link ECPProject}.
 * 
 * @author Eugen Neufeld
 *
 */
public class ImportUtil {

	public static void importModel(File fileToImport, ECPProject importProject){
		Dictionary dictionary=ModelFactory.eINSTANCE.createDictionary();
		Namespace namespace=ModelFactory.eINSTANCE.createNamespace();
		dictionary.getNamespaces().add(namespace);
		
		importProject.getElements().add(dictionary);
	}
}
