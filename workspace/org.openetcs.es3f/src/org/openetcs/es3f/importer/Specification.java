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
import org.openetcs.es3f.utils.*;

public class Specification
	extends org.openetcs.es3f.generated.Specification
{
	private static final long serialVersionUID = 2829494552401902725L;

	public org.openetcs.model.ertmsformalspecs.requirements.Specification convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.Specification retVal = RequirementsFactory.eINSTANCE.createSpecification();;
		
		retVal.setName(getName());
		if ( allChapters() != null )
		{
			for ( Object obj: allChapters())
			{
				retVal.getParagraphs().add(((Chapter) obj).convert2EMF( project ));	
			}
		}

		// Handles the translation of Version
		ManualTranslation.importSpecification ( project, this, retVal );

		return retVal;
	}
}
