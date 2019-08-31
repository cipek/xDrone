package ic.ac.uk.xdrone.web

import com.google.inject.Inject
import java.io.File
import java.io.FileWriter
import org.eclipse.xtext.web.server.IServiceContext
import org.eclipse.xtext.web.server.InvalidRequestException
import org.eclipse.xtext.web.server.XtextServiceDispatcher
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider
import org.eclipse.xtext.web.server.model.DocumentStateResult
import org.eclipse.xtext.web.server.generator.GeneratorService
import java.io.BufferedReader
import java.io.InputStreamReader

class XDroneServiceDispatcher extends XtextServiceDispatcher {

    @Inject IResourceBaseProvider resourceBaseProvider
    
    @Inject
    GeneratorService generatorService;

    override protected createServiceDescriptor(String serviceType, IServiceContext context) {
        switch serviceType {
            case 'deploy':
                getDeployService(context)
            case 'compile':
            	getCompileService(context)
            default:
                super.createServiceDescriptor(serviceType, context)
        }
    }
	
 
	
	protected def getCompileService(IServiceContext context) throws InvalidRequestException {
		val resourceId = context.getParameter('resource')
		if (resourceId === null)
			throw new InvalidRequestException('The parameter \'resource\' is required.')
		
		val document = getDocumentAccess(context)
		println(document)
		new ServiceDescriptor => [
			service = [
				try {
					generatorService.getResult(document)
				} catch (Throwable throwable) {
					handleError(throwable)
				}
			]
		]
	}

	protected def getDeployService(IServiceContext context) throws InvalidRequestException {
		val resourceId = context.getParameter('resource')
		if (resourceId === null)
			throw new InvalidRequestException('The parameter \'resource\' is required.')
		new ServiceDescriptor => [
			service = [
				try {
					
					val uri = resourceBaseProvider.getFileURI(resourceId)
					val file = new File(uri.toFileString)
						var FileWriter writer
						try {
							//writer = new FileWriter(file)
							//val fullText = context.getParameter('fullText')
						//if (fullText !== null)
							//	writer.write(fullText)
		//println(file.getAbsolutePath()+"WebRoot/result.py")
						} finally {
							if (writer !== null)
								writer.close()
						}
						val document = getResourceDocument(resourceId, context)
						
						//println("preparing to run command: sudo /bin/bash -c /xdrone-deploy.sh "+file.getAbsolutePath()+" > /tmp/xdrone.log")
						
						val pb = new ProcessBuilder().inheritIO()
						.command("/bin/bash", "-c", "/xdrone/xdrone-deploy.sh").start();
						//.command("/usr/bin/python", System.getProperty("user.dir")+"/WebRoot/result.py").start();
						//.command("/usr/bin/python", "/home/osboxes/catkin_ws/src/cipek/src/ardrone_test_1.py").start();
						//.command("/bin/bash", "-c", "/home/osboxes/Documents/xdrone-deploy.sh").start();
						//.command("/opt/ros/indigo/bin/rosrun cipek talker").start();
						
						
						//val p = Runtime.getRuntime.exec("bash /xdrone-deploy.sh")
						
						
						//println(System.getProperty("user.dir") + "/xdrone-deploy.sh");
						//println("/usr/bin/python " + System.getProperty("user.dir")+"/WebRoot/result.py");
						
						pb.waitFor();
						
						if (!pb.alive){
							println("exit code: "+pb.exitValue)
						}
						
						
						return new DocumentStateResult(document.stateId)
						
				} catch (Throwable throwable) {
					handleError(throwable)
				}
			]
			hasSideEffects = true
		]

	}
	

}

