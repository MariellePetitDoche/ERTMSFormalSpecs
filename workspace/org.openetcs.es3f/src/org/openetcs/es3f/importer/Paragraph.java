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

public class Paragraph
	extends org.openetcs.es3f.importer.generated.Paragraph
{
	private static final long serialVersionUID = 2829494552401902727L;

	public org.openetcs.model.ertmsformalspecs.requirements.Paragraph convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.Paragraph retVal = RequirementsFactory.eINSTANCE.createParagraph();;
		
		retVal.setName(getName());
		retVal.setId(getId());
		retVal.setType(EParagraphType.getByName(getType_AsString()));
		retVal.setName(getName());
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());
		if ( getMessage() != null )
		{
			retVal.setMessage(((Message) getMessage()).convert2EMF( project ));	
		}
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
		retVal.setText(getText());

		// Handles the translation of Scope
		// Handles the translation of Bl
		// Handles the translation of Optional
		// Handles the translation of Version
		// Handles the translation of Reviewed
		// Handles the translation of ImplementationStatus
		// Handles the translation of Revision
		// Handles the translation of MoreInfoRequired
		// Handles the translation of SpecIssue
		// Handles the translation of FunctionalBlock
		// Handles the translation of FunctionalBlockName
		ManualTranslation.translateParagraph ( project, this, retVal );

		return retVal;
	}
}
