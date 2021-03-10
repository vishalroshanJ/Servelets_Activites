package com.llts.serveletsdemo.model;

//Creating The Team class
public class Team {
	
	private int teamId;
	private String teamName;
	private String coachname;
	private int playerid;
	public Team(int teamId, String teamName,String coachname,int playerid) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachname=coachname;
		this.setPlayerid(playerid);
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

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
}

