package org.openetcs.es3f.exporter;

import org.eclipse.emf.ecore.EObject;
import org.openetcs.es3f.generated.acceptor;
import org.openetcs.es3f.utils.ManualTranslation;
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

public class Exporter
{
	public static int exportEParagraphType( org.openetcs.model.ertmsformalspecs.requirements.EParagraphType val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EParagraphType.TITLE )
		{
			retVal = acceptor.aTITLE;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EParagraphType.DEFINITION )
		{
			retVal = acceptor.aDEFINITION;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EParagraphType.NOTE )
		{
			retVal = acceptor.aNOTE;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EParagraphType.DELETED )
		{
			retVal = acceptor.aDELETED;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EParagraphType.REQUIREMENT )
		{
			retVal = acceptor.aREQUIREMENT;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EParagraphType.TABLE_HEADER )
		{
			retVal = acceptor.aTABLE_HEADER;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EParagraphType.PROBLEM )
		{
			retVal = acceptor.aPROBLEM;			
		}
		
		return retVal;
	}

	public static int exportEErtmsType( org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.DISTANCE )
		{
			retVal = acceptor.adistance;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.GRADIENT )
		{
			retVal = acceptor.agradient;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.LENGTH )
		{
			retVal = acceptor.alength;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.MISCELLANEOUS )
		{
			retVal = acceptor.amiscellaneous;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.CLASS_NUMBER )
		{
			retVal = acceptor.aclass_number;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.IDENTITY_NUMBER )
		{
			retVal = acceptor.aidentity_number;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.QUALIFIER )
		{
			retVal = acceptor.aqualifier;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.TIME_OR_DATE )
		{
			retVal = acceptor.atime_or_date;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.SPEED )
		{
			retVal = acceptor.aspeed;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EErtmsType.TEXT )
		{
			retVal = acceptor.atext;			
		}
		
		return retVal;
	}

	public static int exportEMeaningType( org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType.INVALID )
		{
			retVal = acceptor.ainvalid;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType.ENUM )
		{
			retVal = acceptor.aenum;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType.UNKNOWN )
		{
			retVal = acceptor.aunknown;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.EMeaningType.INFINITE )
		{
			retVal = acceptor.ainfinite;			
		}
		
		return retVal;
	}

	public static int exportResolutionFormulaUnit( org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.MS2 )
		{
			retVal = acceptor.m_s2;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.QSCALE )
		{
			retVal = acceptor.q_scale;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.PERCENT )
		{
			retVal = acceptor.percent;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.BYTE )
		{
			retVal = acceptor.abyte;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.BIT )
		{
			retVal = acceptor.abit;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.TEXT_STRING_ELEMENT )
		{
			retVal = acceptor.text_string_element;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.M )
		{
			retVal = acceptor.m;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.A )
		{
			retVal = acceptor.A;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.S )
		{
			retVal = acceptor.s;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.MS )
		{
			retVal = acceptor.ms;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaUnit.KM_H )
		{
			retVal = acceptor.km_h;			
		}
		
		return retVal;
	}

	public static int exportResolutionFormulaValue( org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.X0_05 )
		{
			retVal = acceptor.a0_05;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.X1 )
		{
			retVal = acceptor.a1;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.X10 )
		{
			retVal = acceptor.a10;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.X0_02 )
		{
			retVal = acceptor.a0_02;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.INTEGERS )
		{
			retVal = acceptor.aintegers;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.NUMBERS )
		{
			retVal = acceptor.aNumbers;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.BINARY_CODED_DECIMAL )
		{
			retVal = acceptor.aBinary_Coded_Decimal;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.NUMBER )
		{
			retVal = acceptor.aNumber;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.BIT_SET )
		{
			retVal = acceptor.aBitset;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormulaValue.X5 )
		{
			retVal = acceptor.a5;			
		}
		
		return retVal;
	}

	public static int exportVariableMode( org.openetcs.model.ertmsformalspecs.VariableMode val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.VariableMode.INCOMING )
		{
			retVal = acceptor.aIncoming;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.VariableMode.OUTGOING )
		{
			retVal = acceptor.aOutgoing;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.VariableMode.INTERNAL )
		{
			retVal = acceptor.aInternal;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.VariableMode.IN_OUT )
		{
			retVal = acceptor.aInOut;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.VariableMode.CONSTANT )
		{
			retVal = acceptor.aConstant;			
		}
		
		return retVal;
	}

	public static int exportEImplementationStatus( org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus.NA )
		{
			retVal = acceptor.Impl_NA;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus.IMPLEMENTED )
		{
			retVal = acceptor.Impl_Implemented;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus.NOT_IMPLEMENTABLE )
		{
			retVal = acceptor.Impl_NotImplementable;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.requirements.EImplementationStatus.NEW_REVISION_AVAILABLE )
		{
			retVal = acceptor.Impl_NewRevisionAvailable;			
		}
		
		return retVal;
	}

	public static int exportStepIO( org.openetcs.model.ertmsformalspecs.test.StepIO val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.test.StepIO.NA )
		{
			retVal = acceptor.StIO_NA;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepIO.IN )
		{
			retVal = acceptor.StIO_In;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepIO.OUT )
		{
			retVal = acceptor.StIO_Out;			
		}
		
		return retVal;
	}

	public static int exportStepInterface( org.openetcs.model.ertmsformalspecs.test.StepInterface val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.test.StepInterface.NA )
		{
			retVal = acceptor.StInterface_NA;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepInterface.DMI )
		{
			retVal = acceptor.StInterface_DMI;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepInterface.RTM )
		{
			retVal = acceptor.StInterface_RTM;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepInterface.JRU )
		{
			retVal = acceptor.StInterface_JRU;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepInterface.TIU )
		{
			retVal = acceptor.StInterface_TIU;			
		}
		
		return retVal;
	}

	public static int exportStepLevel( org.openetcs.model.ertmsformalspecs.test.StepLevel val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.test.StepLevel.NA )
		{
			retVal = acceptor.StLevel_NA;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepLevel.L0 )
		{
			retVal = acceptor.StLevel_L0;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepLevel.L1 )
		{
			retVal = acceptor.StLevel_L1;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepLevel.LSTM )
		{
			retVal = acceptor.StLevel_LSTM;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepLevel.L2 )
		{
			retVal = acceptor.StLevel_L2;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepLevel.L3 )
		{
			retVal = acceptor.StLevel_L3;			
		}
		
		return retVal;
	}

	public static int exportStepMode( org.openetcs.model.ertmsformalspecs.test.StepMode val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.NA )
		{
			retVal = acceptor.Mode_NA;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.IS )
		{
			retVal = acceptor.Mode_IS;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.NP )
		{
			retVal = acceptor.Mode_NP;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.SF )
		{
			retVal = acceptor.Mode_SF;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.SL )
		{
			retVal = acceptor.Mode_SL;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.SB )
		{
			retVal = acceptor.Mode_SB;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.SH )
		{
			retVal = acceptor.Mode_SH;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.FS )
		{
			retVal = acceptor.Mode_FS;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.UF )
		{
			retVal = acceptor.Mode_UF;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.SR )
		{
			retVal = acceptor.Mode_SR;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.OS )
		{
			retVal = acceptor.Mode_OS;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.TR )
		{
			retVal = acceptor.Mode_TR;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.PT )
		{
			retVal = acceptor.Mode_PT;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.NL )
		{
			retVal = acceptor.Mode_NL;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.SN )
		{
			retVal = acceptor.Mode_SN;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.RE )
		{
			retVal = acceptor.Mode_RE;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.LS )
		{
			retVal = acceptor.Mode_LS;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.test.StepMode.PSH )
		{
			retVal = acceptor.Mode_PSH;			
		}
		
		return retVal;
	}

	public static int exportPriority( org.openetcs.model.ertmsformalspecs.behaviour.Priority val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.behaviour.Priority.VERIFICATION )
		{
			retVal = acceptor.aVerification;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.behaviour.Priority.UPDATE_INTERNAL )
		{
			retVal = acceptor.aUpdateINTERNAL;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.behaviour.Priority.PROCESSING )
		{
			retVal = acceptor.aProcessing;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.behaviour.Priority.UPDATE_OUT )
		{
			retVal = acceptor.aUpdateOUT;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.behaviour.Priority.CLEAN_UP )
		{
			retVal = acceptor.aCleanUp;			
		}
		
		return retVal;
	}

	public static int exportPrecision( org.openetcs.model.ertmsformalspecs.types.Precision val )
	{
		int retVal = 0;
		
		if (val == org.openetcs.model.ertmsformalspecs.types.Precision.INTEGER_PRECISION )
		{
			retVal = acceptor.aIntegerPrecision;			
		}
		if (val == org.openetcs.model.ertmsformalspecs.types.Precision.DOUBLE_PRECISION )
		{
			retVal = acceptor.aDoublePrecision;			
		}
		
		return retVal;
	}

	public static org.openetcs.es3f.generated.Dictionary exportDictionary ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.Dictionary source )
	{
		org.openetcs.es3f.generated.Dictionary retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createDictionary();
			if ( source.getSpecification() != null )
			{
				retVal.setSpecification(exportSpecification(translation, source.getSpecification()));	
			}
			if ( source.getRuleDisablings() != null )
			{
				for ( EObject eObject: source.getRuleDisablings())
				{
					if (CustomizationPackage.eINSTANCE.getRuleDisabling().equals(eObject.eClass()))
					{
						retVal.appendRuleDisablings(exportRuleDisabling(translation, (RuleDisabling)eObject));
					}	
				}
			}
			if ( source.getNamespaces() != null )
			{
				for ( EObject eObject: source.getNamespaces())
				{
					if (ModelPackage.eINSTANCE.getNamespace().equals(eObject.eClass()))
					{
						retVal.appendNameSpaces(exportNameSpace(translation, (Namespace)eObject));
					}	
				}
			}
			if ( source.getTests() != null )
			{
				for ( EObject eObject: source.getTests())
				{
					if (TestPackage.eINSTANCE.getFrame().equals(eObject.eClass()))
					{
						retVal.appendTests(exportFrame(translation, (Frame)eObject));
					}	
				}
			}
			if ( source.getTranslations() != null )
			{
				retVal.setTranslationDictionary(exportTranslationDictionary(translation, source.getTranslations()));	
			}
			if ( source.getShortcuts() != null )
			{
				retVal.setShortcutDictionary(exportShortcutDictionary(translation, source.getShortcuts()));	
			}

			// Handles the translation of Xsi
			// Handles the translation of XsiLocation
			translation.exportDictionary ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.RuleDisabling exportRuleDisabling ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.customization.RuleDisabling source )
	{
		org.openetcs.es3f.generated.RuleDisabling retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createRuleDisabling();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());

			// Handles the translation of Rule
			translation.exportRuleDisabling ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.NameSpace exportNameSpace ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.Namespace source )
	{
		org.openetcs.es3f.generated.NameSpace retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createNameSpace();
			retVal.setName(source.getName());
			if ( source.getSubNamespaces() != null )
			{
				for ( EObject eObject: source.getSubNamespaces())
				{
					if (ModelPackage.eINSTANCE.getNamespace().equals(eObject.eClass()))
					{
						retVal.appendNameSpaces(exportNameSpace(translation, (Namespace)eObject));
					}	
				}
			}
			if ( source.getTypes() != null )
			{
				for ( EObject eObject: source.getTypes())
				{
					if (TypesPackage.eINSTANCE.getRange().equals(eObject.eClass()))
					{
						retVal.appendRanges(exportRange(translation, (Range)eObject));
					}	
				}
			}
			if ( source.getTypes() != null )
			{
				for ( EObject eObject: source.getTypes())
				{
					if (TypesPackage.eINSTANCE.getEnumeration().equals(eObject.eClass()))
					{
						retVal.appendEnumerations(exportEnum(translation, (Enumeration)eObject));
					}	
				}
			}
			if ( source.getTypes() != null )
			{
				for ( EObject eObject: source.getTypes())
				{
					if (TypesPackage.eINSTANCE.getStructure().equals(eObject.eClass()))
					{
						retVal.appendStructures(exportStructure(translation, (Structure)eObject));
					}	
				}
			}
			if ( source.getTypes() != null )
			{
				for ( EObject eObject: source.getTypes())
				{
					if (TypesPackage.eINSTANCE.getCollection().equals(eObject.eClass()))
					{
						retVal.appendCollections(exportCollection(translation, (Collection)eObject));
					}	
				}
			}
			if ( source.getTypes() != null )
			{
				for ( EObject eObject: source.getTypes())
				{
					if (TypesPackage.eINSTANCE.getFunction().equals(eObject.eClass()))
					{
						retVal.appendFunctions(exportFunction(translation, (Function)eObject));
					}	
				}
			}
			if ( source.getProcedures() != null )
			{
				for ( EObject eObject: source.getProcedures())
				{
					if (ModelPackage.eINSTANCE.getProcedure().equals(eObject.eClass()))
					{
						retVal.appendProcedures(exportProcedure(translation, (Procedure)eObject));
					}	
				}
			}
			if ( source.getVariables() != null )
			{
				for ( EObject eObject: source.getVariables())
				{
					if (ModelPackage.eINSTANCE.getVariable().equals(eObject.eClass()))
					{
						retVal.appendVariables(exportVariable(translation, (Variable)eObject));
					}	
				}
			}
			if ( source.getRules() != null )
			{
				for ( EObject eObject: source.getRules())
				{
					if (BehaviourPackage.eINSTANCE.getRule().equals(eObject.eClass()))
					{
						retVal.appendRules(exportRule(translation, (Rule)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.ReqRef exportReqRef ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.ReqRef source )
	{
		org.openetcs.es3f.generated.ReqRef retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createReqRef();
			retVal.setComment(source.getComment());

			// Handles the translation of Id
			translation.exportReqRef ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Enum exportEnum ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.Enumeration source )
	{
		org.openetcs.es3f.generated.Enum retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createEnum();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setDefault(source.getDefaultValue());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getValues() != null )
			{
				for ( EObject eObject: source.getValues())
				{
					if (TypesPackage.eINSTANCE.getEnumValue().equals(eObject.eClass()))
					{
						retVal.appendValues(exportEnumValue(translation, (EnumValue)eObject));
					}	
				}
			}
			if ( source.getSubEnumerations() != null )
			{
				for ( EObject eObject: source.getSubEnumerations())
				{
					if (TypesPackage.eINSTANCE.getEnumeration().equals(eObject.eClass()))
					{
						retVal.appendSubEnums(exportEnum(translation, (Enumeration)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.EnumValue exportEnumValue ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.EnumValue source )
	{
		org.openetcs.es3f.generated.EnumValue retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createEnumValue();
			retVal.setName(source.getName());
			retVal.setValue(source.getValue());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Range exportRange ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.Range source )
	{
		org.openetcs.es3f.generated.Range retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createRange();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setDefault(source.getDefaultValue());
			retVal.setMinValue(source.getMinimumValue());
			retVal.setMaxValue(source.getMaximumValue());
			retVal.setPrecision(exportPrecision (source.getPrecision()));
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getSpecialValues() != null )
			{
				for ( EObject eObject: source.getSpecialValues())
				{
					if (TypesPackage.eINSTANCE.getEnumValue().equals(eObject.eClass()))
					{
						retVal.appendSpecialValues(exportEnumValue(translation, (EnumValue)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Structure exportStructure ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.Structure source )
	{
		org.openetcs.es3f.generated.Structure retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createStructure();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setDefault(source.getDefaultValue());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getRules() != null )
			{
				for ( EObject eObject: source.getRules())
				{
					if (BehaviourPackage.eINSTANCE.getRule().equals(eObject.eClass()))
					{
						retVal.appendRules(exportRule(translation, (Rule)eObject));
					}	
				}
			}
			if ( source.getProcedures() != null )
			{
				for ( EObject eObject: source.getProcedures())
				{
					if (ModelPackage.eINSTANCE.getProcedure().equals(eObject.eClass()))
					{
						retVal.appendProcedures(exportStructureProcedure(translation, (Procedure)eObject));
					}	
				}
			}
			if ( source.getElements() != null )
			{
				for ( EObject eObject: source.getElements())
				{
					if (TypesPackage.eINSTANCE.getStructureElement().equals(eObject.eClass()))
					{
						retVal.appendElements(exportStructureElement(translation, (StructureElement)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.StructureElement exportStructureElement ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.StructureElement source )
	{
		org.openetcs.es3f.generated.StructureElement retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createStructureElement();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setTypeName(source.getTypeName());
			retVal.setDefault(source.getDefaultValue());
			retVal.setMode(exportVariableMode (source.getVariableMode()));
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.StructureProcedure exportStructureProcedure ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.Procedure source )
	{
		org.openetcs.es3f.generated.StructureProcedure retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createStructureProcedure();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getParameters() != null )
			{
				for ( EObject eObject: source.getParameters())
				{
					if (ModelPackage.eINSTANCE.getParameter().equals(eObject.eClass()))
					{
						retVal.appendParameters(exportParameter(translation, (Parameter)eObject));
					}	
				}
			}
			if ( source.getRules() != null )
			{
				for ( EObject eObject: source.getRules())
				{
					if (BehaviourPackage.eINSTANCE.getRule().equals(eObject.eClass()))
					{
						retVal.appendRules(exportRule(translation, (Rule)eObject));
					}	
				}
			}
			if ( source.getStateMachine() != null )
			{
				retVal.setStateMachine(exportStateMachine(translation, source.getStateMachine()));	
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Collection exportCollection ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.Collection source )
	{
		org.openetcs.es3f.generated.Collection retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createCollection();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setDefault(source.getDefaultValue());
			retVal.setTypeName(source.getTypeName());
			retVal.setMaxSize(source.getMaximumSize());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Function exportFunction ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.Function source )
	{
		org.openetcs.es3f.generated.Function retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createFunction();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setDefault(source.getDefaultValue());
			retVal.setTypeName(source.getTypeName());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getParameters() != null )
			{
				for ( EObject eObject: source.getParameters())
				{
					if (ModelPackage.eINSTANCE.getParameter().equals(eObject.eClass()))
					{
						retVal.appendParameters(exportParameter(translation, (Parameter)eObject));
					}	
				}
			}
			if ( source.getCases() != null )
			{
				for ( EObject eObject: source.getCases())
				{
					if (TypesPackage.eINSTANCE.getCase().equals(eObject.eClass()))
					{
						retVal.appendCases(exportCase(translation, (Case)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Parameter exportParameter ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.Parameter source )
	{
		org.openetcs.es3f.generated.Parameter retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createParameter();
			retVal.setName(source.getName());
			retVal.setTypeName(source.getTypeName());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Case exportCase ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.types.Case source )
	{
		org.openetcs.es3f.generated.Case retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createCase();
			retVal.setName(source.getName());
			if ( source.getPreConditions() != null )
			{
				for ( EObject eObject: source.getPreConditions())
				{
					if (BehaviourPackage.eINSTANCE.getPreCondition().equals(eObject.eClass()))
					{
						retVal.appendPreConditions(exportPreCondition(translation, (PreCondition)eObject));
					}	
				}
			}
			retVal.setExpression(source.getExpression());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Procedure exportProcedure ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.Procedure source )
	{
		org.openetcs.es3f.generated.Procedure retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createProcedure();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getParameters() != null )
			{
				for ( EObject eObject: source.getParameters())
				{
					if (ModelPackage.eINSTANCE.getParameter().equals(eObject.eClass()))
					{
						retVal.appendParameters(exportParameter(translation, (Parameter)eObject));
					}	
				}
			}
			if ( source.getRules() != null )
			{
				for ( EObject eObject: source.getRules())
				{
					if (BehaviourPackage.eINSTANCE.getRule().equals(eObject.eClass()))
					{
						retVal.appendRules(exportRule(translation, (Rule)eObject));
					}	
				}
			}
			if ( source.getStateMachine() != null )
			{
				retVal.setStateMachine(exportStateMachine(translation, source.getStateMachine()));	
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.StateMachine exportStateMachine ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.StateMachine source )
	{
		org.openetcs.es3f.generated.StateMachine retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createStateMachine();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setDefault(source.getDefaultValue());
			retVal.setInitialState(source.getInitialState());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getStates() != null )
			{
				for ( EObject eObject: source.getStates())
				{
					if (ModelPackage.eINSTANCE.getState().equals(eObject.eClass()))
					{
						retVal.appendStates(exportState(translation, (State)eObject));
					}	
				}
			}
			if ( source.getRules() != null )
			{
				for ( EObject eObject: source.getRules())
				{
					if (BehaviourPackage.eINSTANCE.getRule().equals(eObject.eClass()))
					{
						retVal.appendRules(exportRule(translation, (Rule)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.State exportState ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.State source )
	{
		org.openetcs.es3f.generated.State retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createState();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setX(source.getX());
			retVal.setY(source.getY());
			retVal.setWidth(source.getWidth());
			retVal.setHeight(source.getHeight());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getStateMachine() != null )
			{
				retVal.setStateMachine(exportStateMachine(translation, source.getStateMachine()));	
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Variable exportVariable ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.Variable source )
	{
		org.openetcs.es3f.generated.Variable retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createVariable();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setTypeName(source.getTypeName());
			retVal.setDefaultValue(source.getDefaultValue());
			retVal.setVariableMode(exportVariableMode (source.getVariableMode()));
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getSubVariables() != null )
			{
				for ( EObject eObject: source.getSubVariables())
				{
					if (ModelPackage.eINSTANCE.getVariable().equals(eObject.eClass()))
					{
						retVal.appendSubVariables(exportVariable(translation, (Variable)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Rule exportRule ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.behaviour.Rule source )
	{
		org.openetcs.es3f.generated.Rule retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createRule();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setPriority(exportPriority (source.getPriority()));
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getConditions() != null )
			{
				for ( EObject eObject: source.getConditions())
				{
					if (BehaviourPackage.eINSTANCE.getRuleCondition().equals(eObject.eClass()))
					{
						retVal.appendConditions(exportRuleCondition(translation, (RuleCondition)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.RuleCondition exportRuleCondition ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition source )
	{
		org.openetcs.es3f.generated.RuleCondition retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createRuleCondition();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getPreconditions() != null )
			{
				for ( EObject eObject: source.getPreconditions())
				{
					if (BehaviourPackage.eINSTANCE.getPreCondition().equals(eObject.eClass()))
					{
						retVal.appendPreConditions(exportPreCondition(translation, (PreCondition)eObject));
					}	
				}
			}
			if ( source.getActions() != null )
			{
				for ( EObject eObject: source.getActions())
				{
					if (BehaviourPackage.eINSTANCE.getAction().equals(eObject.eClass()))
					{
						retVal.appendActions(exportAction(translation, (Action)eObject));
					}	
				}
			}
			if ( source.getSubRules() != null )
			{
				for ( EObject eObject: source.getSubRules())
				{
					if (BehaviourPackage.eINSTANCE.getRule().equals(eObject.eClass()))
					{
						retVal.appendSubRules(exportRule(translation, (Rule)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.PreCondition exportPreCondition ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.behaviour.PreCondition source )
	{
		org.openetcs.es3f.generated.PreCondition retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createPreCondition();
			retVal.setCondition(source.getCondition());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Action exportAction ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.behaviour.Action source )
	{
		org.openetcs.es3f.generated.Action retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createAction();
			retVal.setExpression(source.getExpression());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Frame exportFrame ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.Frame source )
	{
		org.openetcs.es3f.generated.Frame retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createFrame();
			retVal.setName(source.getName());
			if ( source.getSubSequences() != null )
			{
				for ( EObject eObject: source.getSubSequences())
				{
					if (TestPackage.eINSTANCE.getSubSequence().equals(eObject.eClass()))
					{
						retVal.appendSubSequences(exportSubSequence(translation, (SubSequence)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.SubSequence exportSubSequence ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.SubSequence source )
	{
		org.openetcs.es3f.generated.SubSequence retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createSubSequence();
			retVal.setName(source.getName());
			retVal.setD_LRBG(source.getDLRBG());
			retVal.setLevel(source.getLevel());
			retVal.setMode(source.getMode());
			retVal.setNID_LRBG(source.getNidLRBG());
			retVal.setQ_DIRLRBG(source.getQDirLRBG());
			retVal.setQ_DIRTRAIN(source.getQDirTrain());
			retVal.setQ_DLRBG(source.getQDLRBG());
			retVal.setRBC_ID(source.getRbcId());
			retVal.setRBCPhone(source.getRbcPhone());
			if ( source.getTestCases() != null )
			{
				for ( EObject eObject: source.getTestCases())
				{
					if (TestPackage.eINSTANCE.getSingleTestCase().equals(eObject.eClass()))
					{
						retVal.appendTestCases(exportTestCase(translation, (SingleTestCase)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.TestCase exportTestCase ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.SingleTestCase source )
	{
		org.openetcs.es3f.generated.TestCase retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createTestCase();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			retVal.setVerified(source.isVerified());
			retVal.setNeedsRequirement(source.isNeedsRequirement());
			retVal.setFeature(source.getFeature());
			retVal.setCase(source.getCase());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getSteps() != null )
			{
				for ( EObject eObject: source.getSteps())
				{
					if (TestPackage.eINSTANCE.getStep().equals(eObject.eClass()))
					{
						retVal.appendSteps(exportStep(translation, (Step)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Step exportStep ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.Step source )
	{
		org.openetcs.es3f.generated.Step retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createStep();
			retVal.setName(source.getName());
			retVal.setTCS_Order(source.getTcsOrder());
			retVal.setDistance(source.getDistance());
			retVal.setIO(exportStepIO (source.getIo()));
			retVal.setLevelIN(exportStepLevel (source.getLevelIn()));
			retVal.setLevelOUT(exportStepLevel (source.getLevelOut()));
			retVal.setModeIN(exportStepMode (source.getModeIn()));
			retVal.setModeOUT(exportStepMode (source.getModeOut()));
			retVal.setTranslationRequired(source.isTranslationRequired());
			retVal.setTranslated(source.isTranslated());
			if ( source.getSubSteps() != null )
			{
				for ( EObject eObject: source.getSubSteps())
				{
					if (TestPackage.eINSTANCE.getSubStep().equals(eObject.eClass()))
					{
						retVal.appendSubSteps(exportSubStep(translation, (SubStep)eObject));
					}	
				}
			}
			if ( source.getMessages() != null )
			{
				for ( EObject eObject: source.getMessages())
				{
					if (TestPackage.eINSTANCE.getTestMessage().equals(eObject.eClass()))
					{
						retVal.appendMessages(exportDBMessage(translation, (TestMessage)eObject));
					}	
				}
			}
			retVal.setDescription(source.getDescription());
			retVal.setComment(source.getComment());
			retVal.setUserComment(source.getUserComment());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.SubStep exportSubStep ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.SubStep source )
	{
		org.openetcs.es3f.generated.SubStep retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createSubStep();
			retVal.setName(source.getName());
			retVal.setSkipEngine(source.isSkipEngine());
			if ( source.getActions() != null )
			{
				for ( EObject eObject: source.getActions())
				{
					if (BehaviourPackage.eINSTANCE.getAction().equals(eObject.eClass()))
					{
						retVal.appendActions(exportAction(translation, (Action)eObject));
					}	
				}
			}
			if ( source.getExpectations() != null )
			{
				for ( EObject eObject: source.getExpectations())
				{
					if (TestPackage.eINSTANCE.getExpectation().equals(eObject.eClass()))
					{
						retVal.appendExpectations(exportExpectation(translation, (Expectation)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Expectation exportExpectation ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.Expectation source )
	{
		org.openetcs.es3f.generated.Expectation retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createExpectation();
			retVal.setName(source.getName());
			retVal.setBlocking(source.isBlocking());
			retVal.setDeadLine(source.getDeadline());
			retVal.setValue(source.getExpression());

			// Handles the translation of Variable
			translation.exportExpectation ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.DBMessage exportDBMessage ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.TestMessage source )
	{
		org.openetcs.es3f.generated.DBMessage retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createDBMessage();
			retVal.setName(source.getName());
			retVal.setMessageOrder(source.getOrder());
			if ( source.getFields() != null )
			{
				for ( EObject eObject: source.getFields())
				{
					if (TestPackage.eINSTANCE.getTestField().equals(eObject.eClass()))
					{
						retVal.appendFields(exportDBField(translation, (TestField)eObject));
					}	
				}
			}
			if ( source.getPackets() != null )
			{
				for ( EObject eObject: source.getPackets())
				{
					if (TestPackage.eINSTANCE.getTestPacket().equals(eObject.eClass()))
					{
						retVal.appendPackets(exportDBPacket(translation, (TestPacket)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.DBPacket exportDBPacket ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.TestPacket source )
	{
		org.openetcs.es3f.generated.DBPacket retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createDBPacket();
			retVal.setName(source.getName());
			if ( source.getFields() != null )
			{
				for ( EObject eObject: source.getFields())
				{
					if (TestPackage.eINSTANCE.getTestField().equals(eObject.eClass()))
					{
						retVal.appendFields(exportDBField(translation, (TestField)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.DBField exportDBField ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.test.TestField source )
	{
		org.openetcs.es3f.generated.DBField retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createDBField();
			retVal.setName(source.getName());
			retVal.setValue(source.getValue());
			retVal.setVariable(source.getVariable());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.TranslationDictionary exportTranslationDictionary ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.translation.TranslationFolder source )
	{
		org.openetcs.es3f.generated.TranslationDictionary retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createTranslationDictionary();
			retVal.setName(source.getName());
			if ( source.getSubFolders() != null )
			{
				for ( EObject eObject: source.getSubFolders())
				{
					if (TranslationPackage.eINSTANCE.getTranslationFolder().equals(eObject.eClass()))
					{
						retVal.appendFolders(exportFolder(translation, (TranslationFolder)eObject));
					}	
				}
			}
			if ( source.getTranslations() != null )
			{
				for ( EObject eObject: source.getTranslations())
				{
					if (TranslationPackage.eINSTANCE.getTranslation().equals(eObject.eClass()))
					{
						retVal.appendTranslations(exportTranslation(translation, (Translation)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Folder exportFolder ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.translation.TranslationFolder source )
	{
		org.openetcs.es3f.generated.Folder retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createFolder();
			retVal.setName(source.getName());
			if ( source.getSubFolders() != null )
			{
				for ( EObject eObject: source.getSubFolders())
				{
					if (TranslationPackage.eINSTANCE.getTranslationFolder().equals(eObject.eClass()))
					{
						retVal.appendFolders(exportFolder(translation, (TranslationFolder)eObject));
					}	
				}
			}
			if ( source.getTranslations() != null )
			{
				for ( EObject eObject: source.getTranslations())
				{
					if (TranslationPackage.eINSTANCE.getTranslation().equals(eObject.eClass()))
					{
						retVal.appendTranslations(exportTranslation(translation, (Translation)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Translation exportTranslation ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.translation.Translation source )
	{
		org.openetcs.es3f.generated.Translation retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createTranslation();
			retVal.setName(source.getName());
			retVal.setImplemented(source.isImplemented());
			if ( source.getSources() != null )
			{
				for ( EObject eObject: source.getSources())
				{
					if (TranslationPackage.eINSTANCE.getSourceText().equals(eObject.eClass()))
					{
						retVal.appendSourceTexts(exportSourceText(translation, (SourceText)eObject));
					}	
				}
			}
			if ( source.getSubSteps() != null )
			{
				for ( EObject eObject: source.getSubSteps())
				{
					if (TestPackage.eINSTANCE.getSubStep().equals(eObject.eClass()))
					{
						retVal.appendSubSteps(exportSubStep(translation, (SubStep)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.SourceText exportSourceText ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.translation.SourceText source )
	{
		org.openetcs.es3f.generated.SourceText retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createSourceText();
			retVal.setName(source.getName());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.ShortcutDictionary exportShortcutDictionary ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder source )
	{
		org.openetcs.es3f.generated.ShortcutDictionary retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createShortcutDictionary();
			retVal.setName(source.getName());
			if ( source.getSubFolders() != null )
			{
				for ( EObject eObject: source.getSubFolders())
				{
					if (ShortcutPackage.eINSTANCE.getShortcutFolder().equals(eObject.eClass()))
					{
						retVal.appendFolders(exportShortcutFolder(translation, (ShortcutFolder)eObject));
					}	
				}
			}
			if ( source.getShortcuts() != null )
			{
				for ( EObject eObject: source.getShortcuts())
				{
					if (ShortcutPackage.eINSTANCE.getShortcut().equals(eObject.eClass()))
					{
						retVal.appendShortcuts(exportShortcut(translation, (Shortcut)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.ShortcutFolder exportShortcutFolder ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder source )
	{
		org.openetcs.es3f.generated.ShortcutFolder retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createShortcutFolder();
			retVal.setName(source.getName());
			if ( source.getSubFolders() != null )
			{
				for ( EObject eObject: source.getSubFolders())
				{
					if (ShortcutPackage.eINSTANCE.getShortcutFolder().equals(eObject.eClass()))
					{
						retVal.appendFolders(exportShortcutFolder(translation, (ShortcutFolder)eObject));
					}	
				}
			}
			if ( source.getShortcuts() != null )
			{
				for ( EObject eObject: source.getShortcuts())
				{
					if (ShortcutPackage.eINSTANCE.getShortcut().equals(eObject.eClass()))
					{
						retVal.appendShortcuts(exportShortcut(translation, (Shortcut)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Shortcut exportShortcut ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.shortcut.Shortcut source )
	{
		org.openetcs.es3f.generated.Shortcut retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createShortcut();
			retVal.setName(source.getName());

			// Handles the translation of ShortcutName
			translation.exportShortcut ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Specification exportSpecification ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.Specification source )
	{
		org.openetcs.es3f.generated.Specification retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createSpecification();
			retVal.setName(source.getName());
			if ( source.getParagraphs() != null )
			{
				for ( EObject eObject: source.getParagraphs())
				{
					if (RequirementsPackage.eINSTANCE.getParagraph().equals(eObject.eClass()))
					{
						retVal.appendChapters(exportChapter(translation, (Paragraph)eObject));
					}	
				}
			}

			// Handles the translation of Version
			translation.exportSpecification ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Chapter exportChapter ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.Paragraph source )
	{
		org.openetcs.es3f.generated.Chapter retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createChapter();
			retVal.setName(source.getName());
			retVal.setId(source.getId());
			if ( source.getSubParagraphs() != null )
			{
				for ( EObject eObject: source.getSubParagraphs())
				{
					if (RequirementsPackage.eINSTANCE.getParagraph().equals(eObject.eClass()))
					{
						retVal.appendParagraphs(exportParagraph(translation, (Paragraph)eObject));
					}	
				}
			}
			if ( source.getTypeSpecs() != null )
			{
				for ( EObject eObject: source.getTypeSpecs())
				{
					if (MessagesPackage.eINSTANCE.getTypeSpec().equals(eObject.eClass()))
					{
						retVal.appendTypeSpecs(exportTypeSpec(translation, (TypeSpec)eObject));
					}	
				}
			}
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Paragraph exportParagraph ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.Paragraph source )
	{
		org.openetcs.es3f.generated.Paragraph retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createParagraph();
			retVal.setName(source.getName());
			retVal.setId(source.getId());
			retVal.setType(exportEParagraphType (source.getType()));
			retVal.setName(source.getName());
			if ( source.getRequirements() != null )
			{
				for ( EObject eObject: source.getRequirements())
				{
					if (ModelPackage.eINSTANCE.getReqRef().equals(eObject.eClass()))
					{
						retVal.appendRequirements(exportReqRef(translation, (ReqRef)eObject));
					}	
				}
			}
			retVal.setComment(source.getComment());
			if ( source.getMessage() != null )
			{
				retVal.setMessage(exportMessage(translation, source.getMessage()));	
			}
			if ( source.getSubParagraphs() != null )
			{
				for ( EObject eObject: source.getSubParagraphs())
				{
					if (RequirementsPackage.eINSTANCE.getParagraph().equals(eObject.eClass()))
					{
						retVal.appendParagraphs(exportParagraph(translation, (Paragraph)eObject));
					}	
				}
			}
			if ( source.getTypeSpecs() != null )
			{
				for ( EObject eObject: source.getTypeSpecs())
				{
					if (MessagesPackage.eINSTANCE.getTypeSpec().equals(eObject.eClass()))
					{
						retVal.appendTypeSpecs(exportTypeSpec(translation, (TypeSpec)eObject));
					}	
				}
			}
			retVal.setText(source.getText());

			// Handles the translation of Scope
			// Handles the translation of Bl
			// Handles the translation of Optional
			// Handles the translation of Version
			// Handles the translation of Reviewed
			// Handles the translation of ImplementationStatus
			// Handles the translation of Revision
			// Handles the translation of MoreInfoRequired
			// Handles the translation of SpecIssue
			// Handles the translation of FunctionalBlock
			// Handles the translation of FunctionalBlockName
			translation.exportParagraph ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.Message exportMessage ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.Message source )
	{
		org.openetcs.es3f.generated.Message retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createMessage();
			retVal.setDescription(source.getDescription());
			if ( source.getVariables() != null )
			{
				for ( EObject eObject: source.getVariables())
				{
					if (MessagesPackage.eINSTANCE.getMessageVariable().equals(eObject.eClass()))
					{
						retVal.appendMsgVariables(exportMsgVariable(translation, (MessageVariable)eObject));
					}	
				}
			}

			// Handles the translation of Media
			// Handles the translation of Bl
			translation.exportMessage ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.MsgVariable exportMsgVariable ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable source )
	{
		org.openetcs.es3f.generated.MsgVariable retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createMsgVariable();
			retVal.setName(source.getName());
			retVal.setLength(source.getLength());
			retVal.setComment(source.getComment());
			if ( source.getSubVariables() != null )
			{
				for ( EObject eObject: source.getSubVariables())
				{
					if (MessagesPackage.eINSTANCE.getMessageVariable().equals(eObject.eClass()))
					{
						retVal.appendMsgVariables(exportMsgVariable(translation, (MessageVariable)eObject));
					}	
				}
			}

			// Handles the translation of Bl
			translation.exportMsgVariable ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.TypeSpec exportTypeSpec ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec source )
	{
		org.openetcs.es3f.generated.TypeSpec retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createTypeSpec();
			retVal.setLength(source.getLength());
			retVal.setMinimum_value(source.getMinimumValue());
			retVal.setMaximum_value(source.getMaximumValue());
			retVal.setResolution_formula(source.getResolutionFormula());
			retVal.setId(source.getId());
			retVal.setDescription(source.getDescription());

			// Handles the translation of Bl
			// Handles the translation of Values
			translation.exportTypeSpec ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.special_or_reserved_value exportspecial_or_reserved_value ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue source )
	{
		org.openetcs.es3f.generated.special_or_reserved_value retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createspecial_or_reserved_value();
			if ( source.getMask() != null )
			{
				retVal.setMask(exportmask(translation, source.getMask()));	
			}
			if ( source.getMeaning() != null )
			{
				retVal.setMeaning(exportmeaning(translation, source.getMeaning()));	
			}
			if ( source.getValue() != null )
			{
				retVal.setValue(exportvalue(translation, source.getValue()));	
			}

			// Handles the translation of Match
			// Handles the translation of Match-range
			translation.exportspecial_or_reserved_value ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.mask exportmask ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.Mask source )
	{
		org.openetcs.es3f.generated.mask retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createmask();
			retVal.setValue(source.getValue());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.match exportmatch ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.Match source )
	{
		org.openetcs.es3f.generated.match retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().creatematch();
			retVal.setValue(source.getValue());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.meaning exportmeaning ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning source )
	{
		org.openetcs.es3f.generated.meaning retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createmeaning();
			retVal.setType(exportEMeaningType (source.getType()));
			retVal.setValue(source.getValue());

			// Handles the translation of Bl
			translation.exportmeaning ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.match_range exportmatch_range ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange source )
	{
		org.openetcs.es3f.generated.match_range retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().creatematch_range();
			retVal.setMinimum(source.getMinimum());

			// Handles the translation of Maximum
			translation.exportmatch_range ( source, retVal );
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.resolution_formula exportresolution_formula ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula source )
	{
		org.openetcs.es3f.generated.resolution_formula retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createresolution_formula();
			retVal.setUnits(exportResolutionFormulaUnit (source.getUnit()));
			retVal.setValue(exportResolutionFormulaValue(source.getValue()));
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.value exportvalue ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue source )
	{
		org.openetcs.es3f.generated.value retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createvalue();
			retVal.setUnits(source.getUnits());
			retVal.setValue(source.getValue());
		}
		
		return retVal;
	}      

	public static org.openetcs.es3f.generated.char_value exportchar_value ( ManualTranslation translation, org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue source )
	{
		org.openetcs.es3f.generated.char_value retVal = null; 
		
		if ( source != null )
		{
			retVal = acceptor.getFactory().createchar_value();
			retVal.setEncoding(source.getEncoding());
		}
		
		return retVal;
	}      

}
