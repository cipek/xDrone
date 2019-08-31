package ic.ac.uk.xdrone.web;

import com.google.inject.Inject;
import java.io.File;
import java.io.FileWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.ServiceConflictResult;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.generator.GeneratorService;
import org.eclipse.xtext.web.server.model.DocumentStateResult;
import org.eclipse.xtext.web.server.model.XtextWebDocument;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class XDroneServiceDispatcher extends XtextServiceDispatcher {
  @Inject
  private IResourceBaseProvider resourceBaseProvider;
  
  @Inject
  private GeneratorService generatorService;
  
  @Override
  protected XtextServiceDispatcher.ServiceDescriptor createServiceDescriptor(final String serviceType, final IServiceContext context) {
    XtextServiceDispatcher.ServiceDescriptor _switchResult = null;
    if (serviceType != null) {
      switch (serviceType) {
        case "deploy":
          _switchResult = this.getDeployService(context);
          break;
        case "compile":
          _switchResult = this.getCompileService(context);
          break;
        default:
          _switchResult = super.createServiceDescriptor(serviceType, context);
          break;
      }
    } else {
      _switchResult = super.createServiceDescriptor(serviceType, context);
    }
    return _switchResult;
  }
  
  protected XtextServiceDispatcher.ServiceDescriptor getCompileService(final IServiceContext context) throws InvalidRequestException {
    XtextServiceDispatcher.ServiceDescriptor _xblockexpression = null;
    {
      final String resourceId = context.getParameter("resource");
      if ((resourceId == null)) {
        throw new InvalidRequestException("The parameter \'resource\' is required.");
      }
      final XtextWebDocumentAccess document = this.getDocumentAccess(context);
      InputOutput.<XtextWebDocumentAccess>println(document);
      XtextServiceDispatcher.ServiceDescriptor _serviceDescriptor = new XtextServiceDispatcher.ServiceDescriptor();
      final Procedure1<XtextServiceDispatcher.ServiceDescriptor> _function = (XtextServiceDispatcher.ServiceDescriptor it) -> {
        final Function0<IServiceResult> _function_1 = () -> {
          IServiceResult _xtrycatchfinallyexpression = null;
          try {
            _xtrycatchfinallyexpression = this.generatorService.getResult(document);
          } catch (final Throwable _t) {
            if (_t instanceof Throwable) {
              final Throwable throwable = (Throwable)_t;
              _xtrycatchfinallyexpression = this.handleError(it, throwable);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          return _xtrycatchfinallyexpression;
        };
        it.setService(_function_1);
      };
      _xblockexpression = ObjectExtensions.<XtextServiceDispatcher.ServiceDescriptor>operator_doubleArrow(_serviceDescriptor, _function);
    }
    return _xblockexpression;
  }
  
  protected XtextServiceDispatcher.ServiceDescriptor getDeployService(final IServiceContext context) throws InvalidRequestException {
    XtextServiceDispatcher.ServiceDescriptor _xblockexpression = null;
    {
      final String resourceId = context.getParameter("resource");
      if ((resourceId == null)) {
        throw new InvalidRequestException("The parameter \'resource\' is required.");
      }
      XtextServiceDispatcher.ServiceDescriptor _serviceDescriptor = new XtextServiceDispatcher.ServiceDescriptor();
      final Procedure1<XtextServiceDispatcher.ServiceDescriptor> _function = (XtextServiceDispatcher.ServiceDescriptor it) -> {
        final Function0<IServiceResult> _function_1 = () -> {
          ServiceConflictResult _xtrycatchfinallyexpression = null;
          try {
            final URI uri = this.resourceBaseProvider.getFileURI(resourceId);
            String _fileString = uri.toFileString();
            final File file = new File(_fileString);
            FileWriter writer = null;
            try {
            } finally {
              if ((writer != null)) {
                writer.close();
              }
            }
            final XtextWebDocument document = this.getResourceDocument(resourceId, context);
            final Process pb = new ProcessBuilder().inheritIO().command("/bin/bash", "-c", "/xdrone/xdrone-deploy.sh").start();
            pb.waitFor();
            boolean _isAlive = pb.isAlive();
            boolean _not = (!_isAlive);
            if (_not) {
              int _exitValue = pb.exitValue();
              String _plus = ("exit code: " + Integer.valueOf(_exitValue));
              InputOutput.<String>println(_plus);
            }
            String _stateId = document.getStateId();
            return new DocumentStateResult(_stateId);
          } catch (final Throwable _t) {
            if (_t instanceof Throwable) {
              final Throwable throwable = (Throwable)_t;
              _xtrycatchfinallyexpression = this.handleError(it, throwable);
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          return _xtrycatchfinallyexpression;
        };
        it.setService(_function_1);
        it.setHasSideEffects(true);
      };
      _xblockexpression = ObjectExtensions.<XtextServiceDispatcher.ServiceDescriptor>operator_doubleArrow(_serviceDescriptor, _function);
    }
    return _xblockexpression;
  }
}
