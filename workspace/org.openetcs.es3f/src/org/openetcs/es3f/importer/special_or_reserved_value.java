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

public class special_or_reserved_value
	extends org.openetcs.es3f.generated.special_or_reserved_value
{
	private static final long serialVersionUID = 2829494552401902733L;

	public org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue retVal = MessagesFactory.eINSTANCE.createSpecialOrReservedValue();;
		
		if ( getMask() != null )
		{
			retVal.setMask(((mask) getMask()).convert2EMF( project ));	
		}
		if ( getMeaning() != null )
		{
			retVal.setMeaning(((meaning) getMeaning()).convert2EMF( project ));	
		}
		if ( getValue() != null )
		{
			retVal.setValue(((value) getValue()).convert2EMF( project ));	
		}

		// Handles the translation of Match
		// Handles the translation of Match-range
		ManualTranslation.importspecial_or_reserved_value ( project, this, retVal );

		return retVal;
	}
}
