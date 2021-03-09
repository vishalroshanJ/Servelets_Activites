package com.llts.serveletsdemo.model;

public class Auction {
private int auctionid;
private int teamid;
private int playerid;
private String year;


//CREATING THE AUCTION CLASS
public Auction() {
	super();
}
public Auction(int auctionid, int teamid, int playerid, String year) {
	super();
	this.auctionid = auctionid;
	this.teamid = teamid;
	this.playerid = playerid;
	this.year = year;
}

public int getAuctionid() {
	return auctionid;
}
public void setAuctionid(int auctionid) {
	this.auctionid = auctionid;
}
public int getTeamid() {
	return teamid;
}
public void setTeamid(int teamid) {
	this.teamid = teamid;
}
public int getPlayerid() {
	return playerid;
}
public void setPlayerid(int playerid) {
	this.playerid = playerid;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}

}
