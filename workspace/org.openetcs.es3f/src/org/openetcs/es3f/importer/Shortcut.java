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

public class Shortcut
	extends org.openetcs.es3f.generated.Shortcut
{
	private static final long serialVersionUID = 2829494552401902724L;

	public org.openetcs.model.ertmsformalspecs.shortcut.Shortcut convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.shortcut.Shortcut retVal = ShortcutFactory.eINSTANCE.createShortcut();;
		
		retVal.setName(getName());

		// Handles the translation of ShortcutName
		ManualTranslation.importShortcut ( project, this, retVal );

		return retVal;
	}
}
