package org.openetcs.dsl.expression.internal.evaluator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	public static final String PLUGIN_ID="org.openetcs.dsl.expression.evaluator";
	
	private static Activator instance;
	
	public static Activator getInstance(){
		return instance;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		instance=this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		instance=null;
		super.stop(bundleContext);
	}
	
	public static void log(Throwable t){
		getInstance().getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, t.getMessage(),t));
	}

}
