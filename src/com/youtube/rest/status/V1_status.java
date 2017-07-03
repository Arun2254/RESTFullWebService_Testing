package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {
	
	private static final String version="10.00.01";
	private static final String name="RESTFullAPI";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Web Service-Arun</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>API Version is " + version +"</p>";
	}
	@Path("/nameoftheapi")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnNameoftheAPI(){
		return "<p>API Name is " + name +"</p>";
	}

}
