package com.ltts.mav.model;

public class Auction {
private int auctionid;
private int Ammount;
private int teamid;
private int playerid;
private int year;


//CREATING THE AUCTION CLASS
public Auction() {
	super();
}
public Auction(int auctionid, int teamid, int playerid, int year,int Ammount) {
	super();
	this.auctionid = auctionid;
	this.teamid = teamid;
	this.playerid = playerid;
	this.year = year;
	this.Ammount=Ammount;
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
public int getAmmount() {
	return Ammount;
}
public void setAmmount(int Ammount) {
	this.Ammount = Ammount;
}
@Override
public String toString() {
	return "Auction [auctionid=" + auctionid + ", teamname=" + Ammount + ", teamid=" + teamid + ", playerid="
			+ playerid + ", year=" + year + "]";
}

}
