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

public class Importer
{
	public static org.openetcs.model.ertmsformalspecs.Dictionary importDictionary( ECPProject project, org.openetcs.es3f.generated.Dictionary source )
	{
		org.openetcs.model.ertmsformalspecs.Dictionary retVal = ModelFactory.eINSTANCE.createDictionary();;
		
		if ( source.getSpecification() != null )
		{
			retVal.setSpecification(importSpecification(project, (org.openetcs.es3f.generated.Specification) source.getSpecification()));	
		}
		if ( source.allRuleDisablings() != null )
		{
			for ( Object obj: source.allRuleDisablings())
			{
				retVal.getRuleDisablings().add(importRuleDisabling( project, (org.openetcs.es3f.generated.RuleDisabling) obj ));	
			}
		}
		if ( source.allNameSpaces() != null )
		{
			for ( Object obj: source.allNameSpaces())
			{
				retVal.getNamespaces().add(importNameSpace( project, (org.openetcs.es3f.generated.NameSpace) obj ));	
			}
		}
		if ( source.allTests() != null )
		{
			for ( Object obj: source.allTests())
			{
				retVal.getTests().add(importFrame( project, (org.openetcs.es3f.generated.Frame) obj ));	
			}
		}
		if ( source.getTranslationDictionary() != null )
		{
			retVal.setTranslations(importTranslationDictionary(project, (org.openetcs.es3f.generated.TranslationDictionary) source.getTranslationDictionary()));	
		}
		if ( source.getShortcutDictionary() != null )
		{
			retVal.setShortcuts(importShortcutDictionary(project, (org.openetcs.es3f.generated.ShortcutDictionary) source.getShortcutDictionary()));	
		}

		// Handles the translation of Xsi
		// Handles the translation of XsiLocation
		ManualTranslation.importDictionary ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.customization.RuleDisabling importRuleDisabling( ECPProject project, org.openetcs.es3f.generated.RuleDisabling source )
	{
		org.openetcs.model.ertmsformalspecs.customization.RuleDisabling retVal = CustomizationFactory.eINSTANCE.createRuleDisabling();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());

		// Handles the translation of Rule
		ManualTranslation.importRuleDisabling ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.Namespace importNameSpace( ECPProject project, org.openetcs.es3f.generated.NameSpace source )
	{
		org.openetcs.model.ertmsformalspecs.Namespace retVal = ModelFactory.eINSTANCE.createNamespace();;
		
		retVal.setName(source.getName());
		if ( source.allNameSpaces() != null )
		{
			for ( Object obj: source.allNameSpaces())
			{
				retVal.getSubNamespaces().add(importNameSpace( project, (org.openetcs.es3f.generated.NameSpace) obj ));	
			}
		}
		if ( source.allRanges() != null )
		{
			for ( Object obj: source.allRanges())
			{
				retVal.getTypes().add(importRange( project, (org.openetcs.es3f.generated.Range) obj ));	
			}
		}
		if ( source.allEnumerations() != null )
		{
			for ( Object obj: source.allEnumerations())
			{
				retVal.getTypes().add(importEnum( project, (org.openetcs.es3f.generated.Enum) obj ));	
			}
		}
		if ( source.allStructures() != null )
		{
			for ( Object obj: source.allStructures())
			{
				retVal.getTypes().add(importStructure( project, (org.openetcs.es3f.generated.Structure) obj ));	
			}
		}
		if ( source.allCollections() != null )
		{
			for ( Object obj: source.allCollections())
			{
				retVal.getTypes().add(importCollection( project, (org.openetcs.es3f.generated.Collection) obj ));	
			}
		}
		if ( source.allFunctions() != null )
		{
			for ( Object obj: source.allFunctions())
			{
				retVal.getTypes().add(importFunction( project, (org.openetcs.es3f.generated.Function) obj ));	
			}
		}
		if ( source.allProcedures() != null )
		{
			for ( Object obj: source.allProcedures())
			{
				retVal.getProcedures().add(importProcedure( project, (org.openetcs.es3f.generated.Procedure) obj ));	
			}
		}
		if ( source.allVariables() != null )
		{
			for ( Object obj: source.allVariables())
			{
				retVal.getVariables().add(importVariable( project, (org.openetcs.es3f.generated.Variable) obj ));	
			}
		}
		if ( source.allRules() != null )
		{
			for ( Object obj: source.allRules())
			{
				retVal.getRules().add(importRule( project, (org.openetcs.es3f.generated.Rule) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.ReqRef importReqRef( ECPProject project, org.openetcs.es3f.generated.ReqRef source )
	{
		org.openetcs.model.ertmsformalspecs.ReqRef retVal = ModelFactory.eINSTANCE.createReqRef();;
		
		retVal.setComment(source.getComment());

		// Handles the translation of Id
		ManualTranslation.importReqRef ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.Enumeration importEnum( ECPProject project, org.openetcs.es3f.generated.Enum source )
	{
		org.openetcs.model.ertmsformalspecs.types.Enumeration retVal = TypesFactory.eINSTANCE.createEnumeration();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setDefaultValue(source.getDefault());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allValues() != null )
		{
			for ( Object obj: source.allValues())
			{
				retVal.getValues().add(importEnumValue( project, (org.openetcs.es3f.generated.EnumValue) obj ));	
			}
		}
		if ( source.allSubEnums() != null )
		{
			for ( Object obj: source.allSubEnums())
			{
				retVal.getSubEnumerations().add(importEnum( project, (org.openetcs.es3f.generated.Enum) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.EnumValue importEnumValue( ECPProject project, org.openetcs.es3f.generated.EnumValue source )
	{
		org.openetcs.model.ertmsformalspecs.types.EnumValue retVal = TypesFactory.eINSTANCE.createEnumValue();;
		
		retVal.setName(source.getName());
		retVal.setValue(source.getValue());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.Range importRange( ECPProject project, org.openetcs.es3f.generated.Range source )
	{
		org.openetcs.model.ertmsformalspecs.types.Range retVal = TypesFactory.eINSTANCE.createRange();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setDefaultValue(source.getDefault());
		retVal.setMinimumValue(source.getMinValue());
		retVal.setMaximumValue(source.getMaxValue());
		retVal.setPrecision(Precision.getByName(source.getPrecision_AsString()));
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allSpecialValues() != null )
		{
			for ( Object obj: source.allSpecialValues())
			{
				retVal.getSpecialValues().add(importEnumValue( project, (org.openetcs.es3f.generated.EnumValue) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.Structure importStructure( ECPProject project, org.openetcs.es3f.generated.Structure source )
	{
		org.openetcs.model.ertmsformalspecs.types.Structure retVal = TypesFactory.eINSTANCE.createStructure();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setDefaultValue(source.getDefault());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allRules() != null )
		{
			for ( Object obj: source.allRules())
			{
				retVal.getRules().add(importRule( project, (org.openetcs.es3f.generated.Rule) obj ));	
			}
		}
		if ( source.allProcedures() != null )
		{
			for ( Object obj: source.allProcedures())
			{
				retVal.getProcedures().add(importStructureProcedure( project, (org.openetcs.es3f.generated.StructureProcedure) obj ));	
			}
		}
		if ( source.allElements() != null )
		{
			for ( Object obj: source.allElements())
			{
				retVal.getElements().add(importStructureElement( project, (org.openetcs.es3f.generated.StructureElement) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.StructureElement importStructureElement( ECPProject project, org.openetcs.es3f.generated.StructureElement source )
	{
		org.openetcs.model.ertmsformalspecs.types.StructureElement retVal = TypesFactory.eINSTANCE.createStructureElement();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setTypeName(source.getTypeName());
		retVal.setDefaultValue(source.getDefault());
		retVal.setVariableMode(VariableMode.getByName(source.getMode_AsString()));
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.Procedure importStructureProcedure( ECPProject project, org.openetcs.es3f.generated.StructureProcedure source )
	{
		org.openetcs.model.ertmsformalspecs.Procedure retVal = ModelFactory.eINSTANCE.createProcedure();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allParameters() != null )
		{
			for ( Object obj: source.allParameters())
			{
				retVal.getParameters().add(importParameter( project, (org.openetcs.es3f.generated.Parameter) obj ));	
			}
		}
		if ( source.allRules() != null )
		{
			for ( Object obj: source.allRules())
			{
				retVal.getRules().add(importRule( project, (org.openetcs.es3f.generated.Rule) obj ));	
			}
		}
		if ( source.getStateMachine() != null )
		{
			retVal.setStateMachine(importStateMachine(project, (org.openetcs.es3f.generated.StateMachine) source.getStateMachine()));	
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.Collection importCollection( ECPProject project, org.openetcs.es3f.generated.Collection source )
	{
		org.openetcs.model.ertmsformalspecs.types.Collection retVal = TypesFactory.eINSTANCE.createCollection();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setDefaultValue(source.getDefault());
		retVal.setTypeName(source.getTypeName());
		retVal.setMaximumSize(source.getMaxSize());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.Function importFunction( ECPProject project, org.openetcs.es3f.generated.Function source )
	{
		org.openetcs.model.ertmsformalspecs.types.Function retVal = TypesFactory.eINSTANCE.createFunction();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setDefaultValue(source.getDefault());
		retVal.setTypeName(source.getTypeName());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allParameters() != null )
		{
			for ( Object obj: source.allParameters())
			{
				retVal.getParameters().add(importParameter( project, (org.openetcs.es3f.generated.Parameter) obj ));	
			}
		}
		if ( source.allCases() != null )
		{
			for ( Object obj: source.allCases())
			{
				retVal.getCases().add(importCase( project, (org.openetcs.es3f.generated.Case) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.Parameter importParameter( ECPProject project, org.openetcs.es3f.generated.Parameter source )
	{
		org.openetcs.model.ertmsformalspecs.Parameter retVal = ModelFactory.eINSTANCE.createParameter();;
		
		retVal.setName(source.getName());
		retVal.setTypeName(source.getTypeName());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.types.Case importCase( ECPProject project, org.openetcs.es3f.generated.Case source )
	{
		org.openetcs.model.ertmsformalspecs.types.Case retVal = TypesFactory.eINSTANCE.createCase();;
		
		retVal.setName(source.getName());
		if ( source.allPreConditions() != null )
		{
			for ( Object obj: source.allPreConditions())
			{
				retVal.getPreConditions().add(importPreCondition( project, (org.openetcs.es3f.generated.PreCondition) obj ));	
			}
		}
		retVal.setExpression(source.getExpression());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.Procedure importProcedure( ECPProject project, org.openetcs.es3f.generated.Procedure source )
	{
		org.openetcs.model.ertmsformalspecs.Procedure retVal = ModelFactory.eINSTANCE.createProcedure();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allParameters() != null )
		{
			for ( Object obj: source.allParameters())
			{
				retVal.getParameters().add(importParameter( project, (org.openetcs.es3f.generated.Parameter) obj ));	
			}
		}
		if ( source.allRules() != null )
		{
			for ( Object obj: source.allRules())
			{
				retVal.getRules().add(importRule( project, (org.openetcs.es3f.generated.Rule) obj ));	
			}
		}
		if ( source.getStateMachine() != null )
		{
			retVal.setStateMachine(importStateMachine(project, (org.openetcs.es3f.generated.StateMachine) source.getStateMachine()));	
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.StateMachine importStateMachine( ECPProject project, org.openetcs.es3f.generated.StateMachine source )
	{
		org.openetcs.model.ertmsformalspecs.StateMachine retVal = ModelFactory.eINSTANCE.createStateMachine();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setDefaultValue(source.getDefault());
		retVal.setInitialState(source.getInitialState());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allStates() != null )
		{
			for ( Object obj: source.allStates())
			{
				retVal.getStates().add(importState( project, (org.openetcs.es3f.generated.State) obj ));	
			}
		}
		if ( source.allRules() != null )
		{
			for ( Object obj: source.allRules())
			{
				retVal.getRules().add(importRule( project, (org.openetcs.es3f.generated.Rule) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.State importState( ECPProject project, org.openetcs.es3f.generated.State source )
	{
		org.openetcs.model.ertmsformalspecs.State retVal = ModelFactory.eINSTANCE.createState();;
		
		retVal.setName(source.getName());
		retVal.setX(source.getX());
		retVal.setY(source.getY());
		retVal.setWidth(source.getWidth());
		retVal.setHeight(source.getHeight());
		if ( source.getStateMachine() != null )
		{
			retVal.setStateMachine(importStateMachine(project, (org.openetcs.es3f.generated.StateMachine) source.getStateMachine()));	
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.Variable importVariable( ECPProject project, org.openetcs.es3f.generated.Variable source )
	{
		org.openetcs.model.ertmsformalspecs.Variable retVal = ModelFactory.eINSTANCE.createVariable();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setTypeName(source.getTypeName());
		retVal.setDefaultValue(source.getDefaultValue());
		retVal.setVariableMode(VariableMode.getByName(source.getVariableMode_AsString()));
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allSubVariables() != null )
		{
			for ( Object obj: source.allSubVariables())
			{
				retVal.getSubVariables().add(importVariable( project, (org.openetcs.es3f.generated.Variable) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.behaviour.Rule importRule( ECPProject project, org.openetcs.es3f.generated.Rule source )
	{
		org.openetcs.model.ertmsformalspecs.behaviour.Rule retVal = BehaviourFactory.eINSTANCE.createRule();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setPriority(Priority.getByName(source.getPriority_AsString()));
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allConditions() != null )
		{
			for ( Object obj: source.allConditions())
			{
				retVal.getConditions().add(importRuleCondition( project, (org.openetcs.es3f.generated.RuleCondition) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition importRuleCondition( ECPProject project, org.openetcs.es3f.generated.RuleCondition source )
	{
		org.openetcs.model.ertmsformalspecs.behaviour.RuleCondition retVal = BehaviourFactory.eINSTANCE.createRuleCondition();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allPreConditions() != null )
		{
			for ( Object obj: source.allPreConditions())
			{
				retVal.getPreconditions().add(importPreCondition( project, (org.openetcs.es3f.generated.PreCondition) obj ));	
			}
		}
		if ( source.allActions() != null )
		{
			for ( Object obj: source.allActions())
			{
				retVal.getActions().add(importAction( project, (org.openetcs.es3f.generated.Action) obj ));	
			}
		}
		if ( source.allSubRules() != null )
		{
			for ( Object obj: source.allSubRules())
			{
				retVal.getSubRules().add(importRule( project, (org.openetcs.es3f.generated.Rule) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.behaviour.PreCondition importPreCondition( ECPProject project, org.openetcs.es3f.generated.PreCondition source )
	{
		org.openetcs.model.ertmsformalspecs.behaviour.PreCondition retVal = BehaviourFactory.eINSTANCE.createPreCondition();;
		
		retVal.setCondition(source.getCondition());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.behaviour.Action importAction( ECPProject project, org.openetcs.es3f.generated.Action source )
	{
		org.openetcs.model.ertmsformalspecs.behaviour.Action retVal = BehaviourFactory.eINSTANCE.createAction();;
		
		retVal.setExpression(source.getExpression());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.Frame importFrame( ECPProject project, org.openetcs.es3f.generated.Frame source )
	{
		org.openetcs.model.ertmsformalspecs.test.Frame retVal = TestFactory.eINSTANCE.createFrame();;
		
		retVal.setName(source.getName());
		if ( source.allSubSequences() != null )
		{
			for ( Object obj: source.allSubSequences())
			{
				retVal.getSubSequences().add(importSubSequence( project, (org.openetcs.es3f.generated.SubSequence) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.SubSequence importSubSequence( ECPProject project, org.openetcs.es3f.generated.SubSequence source )
	{
		org.openetcs.model.ertmsformalspecs.test.SubSequence retVal = TestFactory.eINSTANCE.createSubSequence();;
		
		retVal.setName(source.getName());
		retVal.setDLRBG(source.getD_LRBG());
		retVal.setLevel(source.getLevel());
		retVal.setMode(source.getMode());
		retVal.setNidLRBG(source.getNID_LRBG());
		retVal.setQDirLRBG(source.getQ_DIRLRBG());
		retVal.setQDirTrain(source.getQ_DIRTRAIN());
		retVal.setQDLRBG(source.getQ_DLRBG());
		retVal.setRbcId(source.getRBC_ID());
		retVal.setRbcPhone(source.getRBCPhone());
		if ( source.allTestCases() != null )
		{
			for ( Object obj: source.allTestCases())
			{
				retVal.getTestCases().add(importTestCase( project, (org.openetcs.es3f.generated.TestCase) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.SingleTestCase importTestCase( ECPProject project, org.openetcs.es3f.generated.TestCase source )
	{
		org.openetcs.model.ertmsformalspecs.test.SingleTestCase retVal = TestFactory.eINSTANCE.createSingleTestCase();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		retVal.setVerified(source.getVerified());
		retVal.setNeedsRequirement(source.getNeedsRequirement());
		retVal.setFeature(source.getFeature());
		retVal.setCase(source.getCase());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.allSteps() != null )
		{
			for ( Object obj: source.allSteps())
			{
				retVal.getSteps().add(importStep( project, (org.openetcs.es3f.generated.Step) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.Step importStep( ECPProject project, org.openetcs.es3f.generated.Step source )
	{
		org.openetcs.model.ertmsformalspecs.test.Step retVal = TestFactory.eINSTANCE.createStep();;
		
		retVal.setName(source.getName());
		retVal.setTcsOrder(source.getTCS_Order());
		retVal.setDistance(source.getDistance());
		retVal.setIo(StepIO.getByName(source.getIO_AsString()));
		retVal.setLevelIn(StepLevel.getByName(source.getLevelIN_AsString()));
		retVal.setLevelOut(StepLevel.getByName(source.getLevelOUT_AsString()));
		retVal.setModeIn(StepMode.getByName(source.getModeIN_AsString()));
		retVal.setModeOut(StepMode.getByName(source.getModeOUT_AsString()));
		retVal.setTranslationRequired(source.getTranslationRequired());
		retVal.setTranslated(source.getTranslated());
		if ( source.allSubSteps() != null )
		{
			for ( Object obj: source.allSubSteps())
			{
				retVal.getSubSteps().add(importSubStep( project, (org.openetcs.es3f.generated.SubStep) obj ));	
			}
		}
		if ( source.allMessages() != null )
		{
			for ( Object obj: source.allMessages())
			{
				retVal.getMessages().add(importDBMessage( project, (org.openetcs.es3f.generated.DBMessage) obj ));	
			}
		}
		retVal.setDescription(source.getDescription());
		retVal.setComment(source.getComment());
		retVal.setUserComment(source.getUserComment());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.SubStep importSubStep( ECPProject project, org.openetcs.es3f.generated.SubStep source )
	{
		org.openetcs.model.ertmsformalspecs.test.SubStep retVal = TestFactory.eINSTANCE.createSubStep();;
		
		retVal.setName(source.getName());
		retVal.setSkipEngine(source.getSkipEngine());
		if ( source.allActions() != null )
		{
			for ( Object obj: source.allActions())
			{
				retVal.getActions().add(importAction( project, (org.openetcs.es3f.generated.Action) obj ));	
			}
		}
		if ( source.allExpectations() != null )
		{
			for ( Object obj: source.allExpectations())
			{
				retVal.getExpectations().add(importExpectation( project, (org.openetcs.es3f.generated.Expectation) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.Expectation importExpectation( ECPProject project, org.openetcs.es3f.generated.Expectation source )
	{
		org.openetcs.model.ertmsformalspecs.test.Expectation retVal = TestFactory.eINSTANCE.createExpectation();;
		
		retVal.setName(source.getName());
		retVal.setVariable(source.getVariable());
		retVal.setBlocking(source.getBlocking());
		retVal.setDeadline(source.getDeadLine());
		retVal.setValue(source.getValue());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.TestMessage importDBMessage( ECPProject project, org.openetcs.es3f.generated.DBMessage source )
	{
		org.openetcs.model.ertmsformalspecs.test.TestMessage retVal = TestFactory.eINSTANCE.createTestMessage();;
		
		retVal.setName(source.getName());
		retVal.setOrder(source.getMessageOrder());
		if ( source.allFields() != null )
		{
			for ( Object obj: source.allFields())
			{
				retVal.getFields().add(importDBField( project, (org.openetcs.es3f.generated.DBField) obj ));	
			}
		}
		if ( source.allPackets() != null )
		{
			for ( Object obj: source.allPackets())
			{
				retVal.getPackets().add(importDBPacket( project, (org.openetcs.es3f.generated.DBPacket) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.TestPacket importDBPacket( ECPProject project, org.openetcs.es3f.generated.DBPacket source )
	{
		org.openetcs.model.ertmsformalspecs.test.TestPacket retVal = TestFactory.eINSTANCE.createTestPacket();;
		
		retVal.setName(source.getName());
		if ( source.allFields() != null )
		{
			for ( Object obj: source.allFields())
			{
				retVal.getFields().add(importDBField( project, (org.openetcs.es3f.generated.DBField) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.test.TestField importDBField( ECPProject project, org.openetcs.es3f.generated.DBField source )
	{
		org.openetcs.model.ertmsformalspecs.test.TestField retVal = TestFactory.eINSTANCE.createTestField();;
		
		retVal.setName(source.getName());
		retVal.setValue(source.getValue());
		retVal.setVariable(source.getVariable());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.translation.TranslationFolder importTranslationDictionary( ECPProject project, org.openetcs.es3f.generated.TranslationDictionary source )
	{
		org.openetcs.model.ertmsformalspecs.translation.TranslationFolder retVal = TranslationFactory.eINSTANCE.createTranslationFolder();;
		
		retVal.setName(source.getName());
		if ( source.allFolders() != null )
		{
			for ( Object obj: source.allFolders())
			{
				retVal.getSubFolders().add(importFolder( project, (org.openetcs.es3f.generated.Folder) obj ));	
			}
		}
		if ( source.allTranslations() != null )
		{
			for ( Object obj: source.allTranslations())
			{
				retVal.getTranslations().add(importTranslation( project, (org.openetcs.es3f.generated.Translation) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.translation.TranslationFolder importFolder( ECPProject project, org.openetcs.es3f.generated.Folder source )
	{
		org.openetcs.model.ertmsformalspecs.translation.TranslationFolder retVal = TranslationFactory.eINSTANCE.createTranslationFolder();;
		
		retVal.setName(source.getName());
		if ( source.allFolders() != null )
		{
			for ( Object obj: source.allFolders())
			{
				retVal.getSubFolders().add(importFolder( project, (org.openetcs.es3f.generated.Folder) obj ));	
			}
		}
		if ( source.allTranslations() != null )
		{
			for ( Object obj: source.allTranslations())
			{
				retVal.getTranslations().add(importTranslation( project, (org.openetcs.es3f.generated.Translation) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.translation.Translation importTranslation( ECPProject project, org.openetcs.es3f.generated.Translation source )
	{
		org.openetcs.model.ertmsformalspecs.translation.Translation retVal = TranslationFactory.eINSTANCE.createTranslation();;
		
		retVal.setName(source.getName());
		retVal.setImplemented(source.getImplemented());
		if ( source.allSourceTexts() != null )
		{
			for ( Object obj: source.allSourceTexts())
			{
				retVal.getSources().add(importSourceText( project, (org.openetcs.es3f.generated.SourceText) obj ));	
			}
		}
		if ( source.allSubSteps() != null )
		{
			for ( Object obj: source.allSubSteps())
			{
				retVal.getSubSteps().add(importSubStep( project, (org.openetcs.es3f.generated.SubStep) obj ));	
			}
		}
		retVal.setComment(source.getComment());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.translation.SourceText importSourceText( ECPProject project, org.openetcs.es3f.generated.SourceText source )
	{
		org.openetcs.model.ertmsformalspecs.translation.SourceText retVal = TranslationFactory.eINSTANCE.createSourceText();;
		
		retVal.setName(source.getName());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder importShortcutDictionary( ECPProject project, org.openetcs.es3f.generated.ShortcutDictionary source )
	{
		org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder retVal = ShortcutFactory.eINSTANCE.createShortcutFolder();;
		
		retVal.setName(source.getName());
		if ( source.allFolders() != null )
		{
			for ( Object obj: source.allFolders())
			{
				retVal.getSubFolders().add(importShortcutFolder( project, (org.openetcs.es3f.generated.ShortcutFolder) obj ));	
			}
		}
		if ( source.allShortcuts() != null )
		{
			for ( Object obj: source.allShortcuts())
			{
				retVal.getShortcuts().add(importShortcut( project, (org.openetcs.es3f.generated.Shortcut) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder importShortcutFolder( ECPProject project, org.openetcs.es3f.generated.ShortcutFolder source )
	{
		org.openetcs.model.ertmsformalspecs.shortcut.ShortcutFolder retVal = ShortcutFactory.eINSTANCE.createShortcutFolder();;
		
		retVal.setName(source.getName());
		if ( source.allFolders() != null )
		{
			for ( Object obj: source.allFolders())
			{
				retVal.getSubFolders().add(importShortcutFolder( project, (org.openetcs.es3f.generated.ShortcutFolder) obj ));	
			}
		}
		if ( source.allShortcuts() != null )
		{
			for ( Object obj: source.allShortcuts())
			{
				retVal.getShortcuts().add(importShortcut( project, (org.openetcs.es3f.generated.Shortcut) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.shortcut.Shortcut importShortcut( ECPProject project, org.openetcs.es3f.generated.Shortcut source )
	{
		org.openetcs.model.ertmsformalspecs.shortcut.Shortcut retVal = ShortcutFactory.eINSTANCE.createShortcut();;
		
		retVal.setName(source.getName());

		// Handles the translation of ShortcutName
		ManualTranslation.importShortcut ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.Specification importSpecification( ECPProject project, org.openetcs.es3f.generated.Specification source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.Specification retVal = RequirementsFactory.eINSTANCE.createSpecification();;
		
		retVal.setName(source.getName());
		if ( source.allChapters() != null )
		{
			for ( Object obj: source.allChapters())
			{
				retVal.getParagraphs().add(importChapter( project, (org.openetcs.es3f.generated.Chapter) obj ));	
			}
		}

		// Handles the translation of Version
		ManualTranslation.importSpecification ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.Paragraph importChapter( ECPProject project, org.openetcs.es3f.generated.Chapter source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.Paragraph retVal = RequirementsFactory.eINSTANCE.createParagraph();;
		
		retVal.setName(source.getName());
		retVal.setId(source.getId());
		if ( source.allParagraphs() != null )
		{
			for ( Object obj: source.allParagraphs())
			{
				retVal.getSubParagraphs().add(importParagraph( project, (org.openetcs.es3f.generated.Paragraph) obj ));	
			}
		}
		if ( source.allTypeSpecs() != null )
		{
			for ( Object obj: source.allTypeSpecs())
			{
				retVal.getTypeSpecs().add(importTypeSpec( project, (org.openetcs.es3f.generated.TypeSpec) obj ));	
			}
		}

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.Paragraph importParagraph( ECPProject project, org.openetcs.es3f.generated.Paragraph source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.Paragraph retVal = RequirementsFactory.eINSTANCE.createParagraph();;
		
		retVal.setName(source.getName());
		retVal.setId(source.getId());
		retVal.setType(EParagraphType.getByName(source.getType_AsString()));
		retVal.setName(source.getName());
		if ( source.allRequirements() != null )
		{
			for ( Object obj: source.allRequirements())
			{
				retVal.getRequirements().add(importReqRef( project, (org.openetcs.es3f.generated.ReqRef) obj ));	
			}
		}
		retVal.setComment(source.getComment());
		if ( source.getMessage() != null )
		{
			retVal.setMessage(importMessage(project, (org.openetcs.es3f.generated.Message) source.getMessage()));	
		}
		if ( source.allParagraphs() != null )
		{
			for ( Object obj: source.allParagraphs())
			{
				retVal.getSubParagraphs().add(importParagraph( project, (org.openetcs.es3f.generated.Paragraph) obj ));	
			}
		}
		if ( source.allTypeSpecs() != null )
		{
			for ( Object obj: source.allTypeSpecs())
			{
				retVal.getTypeSpecs().add(importTypeSpec( project, (org.openetcs.es3f.generated.TypeSpec) obj ));	
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
		ManualTranslation.importParagraph ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.Message importMessage( ECPProject project, org.openetcs.es3f.generated.Message source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.Message retVal = MessagesFactory.eINSTANCE.createMessage();;
		
		retVal.setDescription(source.getDescription());
		if ( source.allMsgVariables() != null )
		{
			for ( Object obj: source.allMsgVariables())
			{
				retVal.getVariables().add(importMsgVariable( project, (org.openetcs.es3f.generated.MsgVariable) obj ));	
			}
		}

		// Handles the translation of Media
		// Handles the translation of Bl
		ManualTranslation.importMessage ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable importMsgVariable( ECPProject project, org.openetcs.es3f.generated.MsgVariable source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.MessageVariable retVal = MessagesFactory.eINSTANCE.createMessageVariable();;
		
		retVal.setName(source.getName());
		retVal.setLength(source.getLength());
		retVal.setComment(source.getComment());
		if ( source.allMsgVariables() != null )
		{
			for ( Object obj: source.allMsgVariables())
			{
				retVal.getSubVariables().add(importMsgVariable( project, (org.openetcs.es3f.generated.MsgVariable) obj ));	
			}
		}

		// Handles the translation of Bl
		ManualTranslation.importMsgVariable ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec importTypeSpec( ECPProject project, org.openetcs.es3f.generated.TypeSpec source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.TypeSpec retVal = MessagesFactory.eINSTANCE.createTypeSpec();;
		
		retVal.setLength(source.getLength());
		retVal.setMinimumValue(source.getMinimum_value());
		retVal.setMaximumValue(source.getMaximum_value());
		retVal.setResolutionFormula(source.getResolution_formula());
		retVal.setId(source.getId());
		retVal.setDescription(source.getDescription());

		// Handles the translation of Bl
		// Handles the translation of Values
		ManualTranslation.importTypeSpec ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue importspecial_or_reserved_value( ECPProject project, org.openetcs.es3f.generated.special_or_reserved_value source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.SpecialOrReservedValue retVal = MessagesFactory.eINSTANCE.createSpecialOrReservedValue();;
		
		if ( source.getMask() != null )
		{
			retVal.setMask(importmask(project, (org.openetcs.es3f.generated.mask) source.getMask()));	
		}
		if ( source.getMeaning() != null )
		{
			retVal.setMeaning(importmeaning(project, (org.openetcs.es3f.generated.meaning) source.getMeaning()));	
		}
		if ( source.getValue() != null )
		{
			retVal.setValue(importvalue(project, (org.openetcs.es3f.generated.value) source.getValue()));	
		}

		// Handles the translation of Match
		// Handles the translation of Match-range
		ManualTranslation.importspecial_or_reserved_value ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.Mask importmask( ECPProject project, org.openetcs.es3f.generated.mask source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.Mask retVal = MessagesFactory.eINSTANCE.createMask();;
		
		retVal.setValue(source.getValue());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.Match importmatch( ECPProject project, org.openetcs.es3f.generated.match source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.Match retVal = MessagesFactory.eINSTANCE.createMatch();;
		
		retVal.setValue(source.getValue());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning importmeaning( ECPProject project, org.openetcs.es3f.generated.meaning source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.Meaning retVal = MessagesFactory.eINSTANCE.createMeaning();;
		
		retVal.setType(EMeaningType.getByName(source.getType_AsString()));
		retVal.setValue(source.getValue());

		// Handles the translation of Bl
		ManualTranslation.importmeaning ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange importmatch_range( ECPProject project, org.openetcs.es3f.generated.match_range source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.MatchRange retVal = MessagesFactory.eINSTANCE.createMatchRange();;
		
		retVal.setMinimum(source.getMinimum());

		// Handles the translation of Maximum
		ManualTranslation.importmatch_range ( project, source, retVal );

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula importresolution_formula( ECPProject project, org.openetcs.es3f.generated.resolution_formula source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.ResolutionFormula retVal = MessagesFactory.eINSTANCE.createResolutionFormula();;
		
		retVal.setUnit(ResolutionFormulaUnit.getByName(source.getUnits_AsString()));
		retVal.setValue(ResolutionFormulaValue.getByName(source.getValue_AsString()));

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue importvalue( ECPProject project, org.openetcs.es3f.generated.value source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.SingleValue retVal = MessagesFactory.eINSTANCE.createSingleValue();;
		
		retVal.setUnits(source.getUnits());
		retVal.setValue(source.getValue());

		return retVal;
	}
	public static org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue importchar_value( ECPProject project, org.openetcs.es3f.generated.char_value source )
	{
		org.openetcs.model.ertmsformalspecs.requirements.messages.CharValue retVal = MessagesFactory.eINSTANCE.createCharValue();;
		
		retVal.setEncoding(source.getEncoding());

		return retVal;
	}
}
