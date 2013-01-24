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

public class char_value
	extends org.openetcs.es3f.generated.char_value
{
	private static final long serialVersionUID = 2829494552401902740L;

	public org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue retVal = MessagesFactory.eINSTANCE.createCharValue();;
		
		retVal.setEncoding(getEncoding());

		return retVal;
	}
}
