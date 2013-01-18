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

public class SubStep
	extends org.openetcs.es3f.importer.generated.SubStep
{
	private static final long serialVersionUID = 2829494552401902713L;

	public org.openetcs.model.ertmsformalspecs.test.SubStep convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.test.SubStep retVal = TestFactory.eINSTANCE.createSubStep();;
		
		retVal.setName(getName());
		retVal.setSkipEngine(getSkipEngine());
		if ( allActions() != null )
		{
			for ( Object obj: allActions())
			{
				retVal.getActions().add(((Action) obj).convert2EMF( project ));	
			}
		}
		if ( allExpectations() != null )
		{
			for ( Object obj: allExpectations())
			{
				retVal.getExpectations().add(((Expectation) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}
