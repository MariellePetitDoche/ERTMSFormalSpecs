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

public class Chapter
	extends org.openetcs.es3f.importer.generated.Chapter
{
	private static final long serialVersionUID = 2829494552401902726L;

	public org.openetcs.model.ertmsformalspecs.requirements.Paragraph convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.Paragraph retVal = RequirementsFactory.eINSTANCE.createParagraph();;
		
		retVal.setName(getName());
		retVal.setId(getId());
		if ( allParagraphs() != null )
		{
			for ( Object obj: allParagraphs())
			{
				retVal.getSubParagraphs().add(((Paragraph) obj).convert2EMF( project ));	
			}
		}
		if ( allTypeSpecs() != null )
		{
			for ( Object obj: allTypeSpecs())
			{
				retVal.getTypeSpecs().add(((TypeSpec) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}
