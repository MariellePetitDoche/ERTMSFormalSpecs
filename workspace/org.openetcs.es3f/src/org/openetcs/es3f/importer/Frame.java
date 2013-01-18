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

public class Frame
	extends org.openetcs.es3f.importer.generated.Frame
{
	private static final long serialVersionUID = 2829494552401902709L;

	public org.openetcs.model.ertmsformalspecs.test.Frame convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.test.Frame retVal = TestFactory.eINSTANCE.createFrame();;
		
		retVal.setName(getName());
		if ( allSubSequences() != null )
		{
			for ( Object obj: allSubSequences())
			{
				retVal.getSubSequences().add(((SubSequence) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}
