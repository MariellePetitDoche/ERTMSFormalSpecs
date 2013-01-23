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

public class Enum
	extends org.openetcs.es3f.generated.Enum
{
	private static final long serialVersionUID = 2829494552401902691L;

	public org.openetcs.model.ertmsformalspecs.types.Enumeration convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.types.Enumeration retVal = TypesFactory.eINSTANCE.createEnumeration();;
		
		retVal.setName(getName());
		retVal.setImplemented(getImplemented());
		retVal.setVerified(getVerified());
		retVal.setNeedsRequirement(getNeedsRequirement());
		retVal.setDefaultValue(getDefault());
		if ( allRequirements() != null )
		{
			for ( Object obj: allRequirements())
			{
				retVal.getRequirements().add(((ReqRef) obj).convert2EMF( project ));	
			}
		}
		retVal.setComment(getComment());
		if ( allValues() != null )
		{
			for ( Object obj: allValues())
			{
				retVal.getValues().add(((EnumValue) obj).convert2EMF( project ));	
			}
		}
		if ( allSubEnums() != null )
		{
			for ( Object obj: allSubEnums())
			{
				retVal.getSubEnumerations().add(((Enum) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}
