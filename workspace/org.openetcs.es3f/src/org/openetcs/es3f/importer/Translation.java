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

public class Translation
	extends org.openetcs.es3f.importer.generated.Translation
{
	private static final long serialVersionUID = 2829494552401902720L;

	public org.openetcs.model.ertmsformalspecs.translation.Translation convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.translation.Translation retVal = TranslationFactory.eINSTANCE.createTranslation();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		if ( allSourceTexts() != null )
		{
			for ( Object obj: allSourceTexts())
			{
				retVal.getSources().add(((SourceText) obj).convert2EMF( project ));	
			}
		}
		if ( allSubSteps() != null )
		{
			for ( Object obj: allSubSteps())
			{
				retVal.getSubSteps().add(((SubStep) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());

		return retVal;
	}
}
