package ssrv.copy;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.User;
import services.ServiceUser;

@Path("/user")
public class WebServUser {
	
	ServiceUser serviceUser = new ServiceUser();
	
	@GET
	@Path( "/get/{login}/{password}" )
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam( "login" ) String login,@PathParam( "password" ) String password) {
		return serviceUser.getUserByLoginPass(login, password);
	}
	
	@GET
	@Path( "/getall" )
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return serviceUser.getAllUsers();
	}

}
