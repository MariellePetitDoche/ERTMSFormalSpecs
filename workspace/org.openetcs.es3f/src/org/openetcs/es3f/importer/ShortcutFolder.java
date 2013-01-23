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

public class ShortcutFolder
	extends org.openetcs.es3f.generated.ShortcutFolder
{
	private static final long serialVersionUID = 2829494552401902723L;

	public org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder convert2EMF( ECPProject project )
	{
		org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder retVal = ShortcutFactory.eINSTANCE.createShortcutFolder();;
		
		retVal.setName(getName());
		if ( allFolders() != null )
		{
			for ( Object obj: allFolders())
			{
				retVal.getSubFolders().add(((ShortcutFolder) obj).convert2EMF( project ));	
			}
		}
		if ( allShortcuts() != null )
		{
			for ( Object obj: allShortcuts())
			{
				retVal.getShortcuts().add(((Shortcut) obj).convert2EMF( project ));	
			}
		}

		return retVal;
	}
}
