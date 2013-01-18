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

public class DBMessage
	extends org.openetcs.es3f.importer.generated.DBMessage
{
	private static final long serialVersionUID = 2829494552401902715L;

	public org.openetcs.model.ertmsformalspecs.test.TestMessage convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.test.TestMessage retVal = TestFactory.eINSTANCE.createTestMessage();;
		
		retVal.setName(getName());
		retVal.setOrder(getMessageOrder());
		if ( allFields() != null )
		{
			for ( Object obj: allFields())
			{
				retVal.getFields().add(((DBField) obj).convert2EMF( project ));	
			}
		}
		if ( allPackets() != null )
		{
			for ( Object obj: allPackets())
			{
				retVal.getPackets().add(((DBPacket) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}
