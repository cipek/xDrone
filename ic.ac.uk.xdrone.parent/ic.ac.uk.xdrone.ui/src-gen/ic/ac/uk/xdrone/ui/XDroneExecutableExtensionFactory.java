/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.ui;

import com.google.inject.Injector;
import ic.ac.uk.xdrone.ui.internal.XdroneActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class XDroneExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XdroneActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XdroneActivator activator = XdroneActivator.getInstance();
		return activator != null ? activator.getInjector(XdroneActivator.IC_AC_UK_XDRONE_XDRONE) : null;
	}

}
