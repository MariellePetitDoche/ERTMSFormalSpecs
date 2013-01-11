package org.openetcs.es3f;

import java.io.File;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.Dictionary;
import org.openetcs.model.ertmsformalspecs.ModelPackage;
import org.openetcs.model.ertmsformalspecs.Namespace;

/**
 * This is the Util class for exporting a {@link ECPProject} containing a model to a es3f file.
 * 
 * @author Eugen Neufeld
 *
 */
public class ExportUtil {

	public static void exportModel(ECPProject projectToExport, File fileToExport){
		List<Object> elements=projectToExport.getElements();
		for(Object object:elements){
			EObject eObject=(EObject)object;
			if(ModelPackage.eINSTANCE.getDictionary().equals(eObject.eClass())){
				Dictionary dictonary=(Dictionary)eObject;
				for(Namespace namespace:dictonary.getNamespaces()){
					
				}
			}
		}
	}
}
