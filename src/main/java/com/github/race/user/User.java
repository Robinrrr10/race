package com.github.race.user;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.github.race.entities.Status;
import com.github.race.entities.StatusType;
import com.github.race.entities.UserEntry;
import com.github.race.entities.UserResponse;

@Path("/user")
public class User {

	@Path("/login")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public UserResponse doLogin(UserEntry userEntry) {
		UserResponse userResponse = new UserResponse();
		Status status = new Status();
		if(userEntry != null && userEntry.getEmail() != null && userEntry.getPassword() != null && !userEntry.getEmail().isEmpty() && !userEntry.getPassword().isEmpty()) {
			if(userEntry.getEmail().equals("abc@gmail.com") && userEntry.getPassword().equals("12345")) {
				status.setStatusCode(1001);
				status.setMessage("Login successfull");
				status.setStatusType(StatusType.SUCCESS);
				UserEntry userEntryResponse = new UserEntry();
				userEntryResponse.setId(10005L);
				userEntryResponse.setName("Kumar");
				userResponse.setUserEntry(userEntryResponse);
			}else {
				status.setStatusCode(2002);
				status.setMessage("Invalid credential. Please give valid email and password");
				status.setStatusType(StatusType.ERROR);
			}
		}else {
			status.setStatusCode(2001);
			status.setMessage("Detail missing. Please give email and password");
			status.setStatusType(StatusType.ERROR);
		}
		userResponse.setStatus(status);
		return userResponse;
	}
}
