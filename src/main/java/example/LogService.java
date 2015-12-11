package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

@Path("/log")
public class LogService {
	
	@GET
	public void get(@QueryParam("m") String message, @QueryParam("s") String stacktrace) {
		System.out.println("message: " + message + ", stacktrace: " + stacktrace);
	}
	
	public static void main(String[] args) throws Exception {
		Container container = new Container();

        	JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class, "log-service.war");
        	deployment.addClass(LogService.class);
        	deployment.addAllDependencies();
        	container.start().deploy(deployment);
	}
}
