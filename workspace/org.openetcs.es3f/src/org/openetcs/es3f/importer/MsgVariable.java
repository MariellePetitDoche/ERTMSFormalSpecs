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

public class MsgVariable
	extends org.openetcs.es3f.importer.generated.MsgVariable
{
	private static final long serialVersionUID = 2829494552401902729L;

	public org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable retVal = MessagesFactory.eINSTANCE.createMessageVariable();;
		
		retVal.setName(getName());
		retVal.setLength(getLength());
		retVal.setComment(getComment());
		if ( allMsgVariables() != null )
		{
			for ( Object obj: allMsgVariables())
			{
				retVal.getSubVariables().add(((MsgVariable) obj).convert2EMF( project ));	
			}
		}

		// Handles the translation of Bl
		ManualTranslation.translateMsgVariable ( project, this, retVal );

		return retVal;
	}
}
