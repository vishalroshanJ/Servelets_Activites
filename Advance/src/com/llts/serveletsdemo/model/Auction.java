package com.llts.serveletsdemo.model;

public class Auction {
private int auctionid;
private String teamname;
private int teamid;
private int playerid;
private int year;


//CREATING THE AUCTION CLASS
public Auction() {
	super();
}
public Auction(int auctionid,String teamname, int teamid, int playerid, int year) {
	super();
	this.auctionid = auctionid;
	this.teamname=teamname;
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
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
@Override
public String toString() {
	return "Auction [auctionid=" + auctionid + ", teamname=" + teamname + ", teamid=" + teamid + ", playerid="
			+ playerid + ", year=" + year + "]";
}

}
