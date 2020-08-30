package com.github.race.user;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/base")
public class Base {

	@GET()
	@Path("/health")
	public String checkHealth() {
		return "Working";
	}
	
}
