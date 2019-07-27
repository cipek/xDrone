package ic.ac.uk.xdrone.web

import com.google.inject.Inject
import java.io.IOException
import java.io.OutputStreamWriter
import org.eclipse.emf.common.util.WrappedException
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.web.server.IServiceContext
import org.eclipse.xtext.web.server.model.IWebDocumentProvider
import org.eclipse.xtext.web.server.model.IWebResourceSetProvider
import org.eclipse.xtext.web.server.model.IXtextWebDocument
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler; 
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;

/**
 * Resource handler that reads and writes files. The file paths are given by an implementation
 * of {@link IResourceBaseProvider}.
 */
class XDroneResourceHandler implements IServerResourceHandler {
	
	@Inject IResourceBaseProvider resourceBaseProvider
	
	@Inject IWebResourceSetProvider resourceSetProvider
	
	@Inject IWebDocumentProvider documentProvider
	
	@Inject IEncodingProvider encodingProvider
	
	override get(String resourceId, IServiceContext serviceContext) throws IOException {
		try {
			val uri = resourceBaseProvider.getFileURI(resourceId)
			if (uri === null)
				throw new IOException('The requested resource does not exist.')
			val resourceSet = resourceSetProvider.get(resourceId, serviceContext)
			val resource = resourceSet.getResource(uri, true) as XtextResource
			return documentProvider.get(resourceId, serviceContext) => [
				setInput(resource)
			]
		} catch (WrappedException exception) {
			throw exception.cause
		}
	}
	
	override put(IXtextWebDocument document, IServiceContext serviceContext) throws IOException {
		try {
			val uri = resourceBaseProvider.getFileURI(document.resourceId)
			val outputStream = document.resource.resourceSet.URIConverter.createOutputStream(uri)
			val writer = new OutputStreamWriter(outputStream, encodingProvider.getEncoding(uri))
			writer.write(document.text)
			writer.close
		} catch (WrappedException exception) {
			throw exception.cause
		}
	}
	
}