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

public class Message
	extends org.openetcs.es3f.importer.generated.Message
{
	private static final long serialVersionUID = 2829494552401902728L;

	public org.openetcs.model.ertmsformalspecs.requirements.messages.Message convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.Message retVal = MessagesFactory.eINSTANCE.createMessage();;
		
		retVal.setDescription(getDescription());
		if ( allMsgVariables() != null )
		{
			for ( Object obj: allMsgVariables())
			{
				retVal.getVariables().add(((MsgVariable) obj).convert2EMF( project ));	
			}
		}

		// Handles the translation of Media
		// Handles the translation of Bl
		ManualTranslation.translateMessage ( project, this, retVal );

		return retVal;
	}
}
