/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ic.ac.uk.xdrone.XDroneRuntimeModule;
import ic.ac.uk.xdrone.XDroneStandaloneSetup;
import ic.ac.uk.xdrone.ide.XDroneIdeModule;
import ic.ac.uk.xdrone.web.XDroneWebModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class XDroneWebSetup extends XDroneStandaloneSetup {
  @Override
  public Injector createInjector() {
    XDroneRuntimeModule _xDroneRuntimeModule = new XDroneRuntimeModule();
    XDroneIdeModule _xDroneIdeModule = new XDroneIdeModule();
    XDroneWebModule _xDroneWebModule = new XDroneWebModule();
    return Guice.createInjector(Modules2.mixin(_xDroneRuntimeModule, _xDroneIdeModule, _xDroneWebModule));
  }
}
