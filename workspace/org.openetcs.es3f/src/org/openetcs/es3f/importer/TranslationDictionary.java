package org.openetcs.es3f.importer;

import org.eclipse.emf.ecp.core.ECPProject;
import org.openetcs.model.ertmsformalspecs.*;
import org.openetcs.model.ertmsformalspecs.behaviour.*;
import org.openetcs.model.ertmsformalspecs.customization.*;
import org.openetcs.model.ertmsformalspecs.requirements.*;
import org.openetcs.model.ertmsformalspecs.requirements.messages.*;
import org.openetcs.model.ertmsformalspecs.shortcut.*;
import org.openetcs.model.ertmsformalspecs.test.*;
import org.openetcs.model.ertmsformalspecs.translation.*;
import org.openetcs.model.ertmsformalspecs.types.*;
import org.openetcs.model.ertmsformalspecs.util.*;
import org.openetcs.es3f.importer.utils.*;

public class TranslationDictionary
	extends org.openetcs.es3f.importer.generated.TranslationDictionary
{
	private static final long serialVersionUID = 2829494552401902718L;

	public org.openetcs.model.ertmsformalspecs.translation.TranslationFolder convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.translation.TranslationFolder retVal = TranslationFactory.eINSTANCE.createTranslationFolder();;
		
		retVal.setName(getName());
		if ( allFolders() != null )
		{
			for ( Object obj: allFolders())
			{
				retVal.getSubFolders().add(((Folder) obj).convert2EMF( project ));	
			}
		}
		if ( allTranslations() != null )
		{
			for ( Object obj: allTranslations())
			{
				retVal.getTranslations().add(((Translation) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}
