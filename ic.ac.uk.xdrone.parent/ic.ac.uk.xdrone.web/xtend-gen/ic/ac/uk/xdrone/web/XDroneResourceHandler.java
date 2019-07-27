package ic.ac.uk.xdrone.web;

import com.google.inject.Inject;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.model.IWebDocumentProvider;
import org.eclipse.xtext.web.server.model.IWebResourceSetProvider;
import org.eclipse.xtext.web.server.model.IXtextWebDocument;
import org.eclipse.xtext.web.server.model.XtextWebDocument;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Resource handler that reads and writes files. The file paths are given by an implementation
 * of {@link IResourceBaseProvider}.
 */
@SuppressWarnings("all")
public class XDroneResourceHandler implements IServerResourceHandler {
  @Inject
  private IResourceBaseProvider resourceBaseProvider;
  
  @Inject
  private IWebResourceSetProvider resourceSetProvider;
  
  @Inject
  private IWebDocumentProvider documentProvider;
  
  @Inject
  private IEncodingProvider encodingProvider;
  
  @Override
  public XtextWebDocument get(final String resourceId, final IServiceContext serviceContext) throws IOException {
    try {
      try {
        final URI uri = this.resourceBaseProvider.getFileURI(resourceId);
        if ((uri == null)) {
          throw new IOException("The requested resource does not exist.");
        }
        final ResourceSet resourceSet = this.resourceSetProvider.get(resourceId, serviceContext);
        Resource _resource = resourceSet.getResource(uri, true);
        final XtextResource resource = ((XtextResource) _resource);
        XtextWebDocument _get = this.documentProvider.get(resourceId, serviceContext);
        final Procedure1<XtextWebDocument> _function = (XtextWebDocument it) -> {
          it.setInput(resource);
        };
        return ObjectExtensions.<XtextWebDocument>operator_doubleArrow(_get, _function);
      } catch (final Throwable _t) {
        if (_t instanceof WrappedException) {
          final WrappedException exception = (WrappedException)_t;
          throw exception.getCause();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void put(final IXtextWebDocument document, final IServiceContext serviceContext) throws IOException {
    try {
      try {
        final URI uri = this.resourceBaseProvider.getFileURI(document.getResourceId());
        final OutputStream outputStream = document.getResource().getResourceSet().getURIConverter().createOutputStream(uri);
        String _encoding = this.encodingProvider.getEncoding(uri);
        final OutputStreamWriter writer = new OutputStreamWriter(outputStream, _encoding);
        writer.write(document.getText());
        writer.close();
      } catch (final Throwable _t) {
        if (_t instanceof WrappedException) {
          final WrappedException exception = (WrappedException)_t;
          throw exception.getCause();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
