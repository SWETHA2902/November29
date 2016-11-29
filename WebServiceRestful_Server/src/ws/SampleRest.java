package ws;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
@Path("demo")
public class SampleRest {
	
@GET
@Path("hello")
@Produces(MediaType.TEXT_PLAIN)
public String hello(){
	System.out.println("ruksana");
	return "Hello Swetha";
}
}
