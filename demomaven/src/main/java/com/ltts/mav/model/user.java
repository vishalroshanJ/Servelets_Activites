package com.ltts.mav.model;
//creating the user database object 
public class user {
	private int Id;
	private String firstame;
	private String secondname;
	private String username;
	private String password;
	public user() {
		super();
	}

	public user(int Id, String firstame, String secondname, String username, String password) {
		super();
		this.firstame = firstame;
		this.secondname = secondname;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getFirstame() {
		return firstame;
	}

	public void setFirstame(String firstame) {
		this.firstame = firstame;
	}

	@Override
	public String toString() {
		return "user [Id=" + Id + ", firstame=" + firstame + ", secondname=" + secondname + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}
