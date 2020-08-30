package com.github.race.entities;

public class UserResponse extends BaseResponse {

	private UserEntry userEntry;

	public UserEntry getUserEntry() {
		return userEntry;
	}

	public void setUserEntry(UserEntry userEntry) {
		this.userEntry = userEntry;
	}
	
}
