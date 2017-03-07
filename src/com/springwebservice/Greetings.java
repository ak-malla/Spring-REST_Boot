package com.springwebservice;

public class Greetings {
	private long id;
	private String user;

	public Greetings(long l, String user) {
		this.id = l;
		this.user = user;
	}

	public long getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

}
