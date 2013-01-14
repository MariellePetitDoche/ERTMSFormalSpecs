
package org.openetcs.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ExpressionStandaloneSetup extends ExpressionStandaloneSetupGenerated{

	public static void doSetup() {
		new ExpressionStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

