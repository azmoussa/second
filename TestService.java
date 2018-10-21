package webservices;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/TestService")
public class TestService {

	 @GET
	 @Path("/hallo")
	 @Produces(MediaType.TEXT_PLAIN)
	 public String sayHello(){
		 return "Hello world again";
	 }
	 @GET
	 @Path("/point")
	 @Produces(MediaType.APPLICATION_JSON)
	public Point test(){
			return new Point(5, 6);
		}
	 @GET
	 @Path("/hello2")
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @GET
	  @Path("/hello3")
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	  }
	 @GET
	 @Path("/message")
	 @Produces({MediaType.APPLICATION_JSON})  //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement)
	 public Response getMessages() throws Exception{
	        
	        List<String> messages = new ArrayList<String>();
	        
	        messages.add("one");
	        messages.add("twee");
	        messages.add("drie");
	        return Response.status(200).entity(messages).build();
	               
	       // System.out.println("getAllMessages(): found "+messages.size()+" message(s) on DB");
	        
	       // return messages; //do not use Response object because this causes issues when generating XML automatically
	    }
}
