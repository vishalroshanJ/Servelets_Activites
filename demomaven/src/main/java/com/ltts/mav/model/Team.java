package com.ltts.mav.model;

//Creating The Team class
public class Team {
	
	private int teamId;
	private String teamName;
	private String coachname;
	
	public Team() {
		super();
	}

	public Team(int teamId, String teamName,String coachname) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachname=coachname;
	}
	
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCoachname() {
		return coachname;
	}

	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
}

