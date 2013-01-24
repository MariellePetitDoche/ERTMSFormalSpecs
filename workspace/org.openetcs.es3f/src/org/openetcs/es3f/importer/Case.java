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

public class Case
	extends org.openetcs.es3f.generated.Case
{
	private static final long serialVersionUID = 2829494552401902700L;

	public org.openetcs.model.ertmsformalspecs.types.Case convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.types.Case retVal = TypesFactory.eINSTANCE.createCase();;
		
		retVal.setName(getName());
		if ( allPreConditions() != null )
		{
			for ( Object obj: allPreConditions())
			{
				retVal.getPreConditions().add(((PreCondition) obj).convert2EMF( project ));	
			}
		}
		retVal.setExpression(getExpression());

		return retVal;
	}
}
