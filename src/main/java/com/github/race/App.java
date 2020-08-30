package com.github.race;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.github.race.user.Base;
import com.github.race.user.User;


@ApplicationPath("v1")
public class App extends Application {

	private Set<Class<?>> appAppContent = new HashSet<Class<?>>();
	
	public App() {
		System.out.println("Starting");
		appAppContent.add(Base.class);
		appAppContent.add(User.class);
		System.out.println("done");
	}
	
	@Override
	public Set<Class<?>> getClasses(){
		return appAppContent;
	}
}
