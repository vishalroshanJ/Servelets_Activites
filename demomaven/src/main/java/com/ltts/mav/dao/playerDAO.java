package com.ltts.mav.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.mav.model.Player;
import com.ltts.mav.configure.MyConnection;
public class playerDAO {
	public void insertPlayer(Player p) throws Exception {
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?,?);");
		  ps.setInt(1,p.getPlayerId());
		  ps.setString(2,p.getName());
		  ps.setString(3,p.getDateOfBirth());
		  ps.setString(4,p.getSkill());
		  ps.setInt(5,p.getNumberOfMatches());
		  ps.setInt(6,p.getRuns());
		  ps.setInt(7,p.getWickets());
		  ps.setString(8,p.getNationality());
		  ps.setDouble(9,p.getPowerRating());
		  ps.setInt(10,p.getTeamId());
		 System.out.println(p.getName());
		 ps.executeUpdate();	
		 System.out.println("Successfully Added");
	}
	
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getString(8),rs.getDouble(9),rs.getInt(10)));
			
		}
		return li;
	}
	
	public boolean updatePlayer(Player p) throws Exception {
		// TODO Auto-generated method stub
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE Player SET  name = ?,dateOfBirt = ?,skill = ?,number = ?,runs = ?,wickets = ?,nationality = ? ,powerRating = ? ,teamId = ? where Playerid=?");

		ps.setString(1,p.getName());
		ps.setString(2,p.getDateOfBirth());
		ps.setString(3,p.getSkill());
		ps.setInt(4,p.getNumberOfMatches());
		ps.setInt(5,p.getRuns());
		ps.setInt(6,p.getWickets());
		ps.setString(7,p.getNationality());
		ps.setDouble(8,p.getPowerRating());
		ps.setInt(9, p.getTeamId());
		ps.setInt(10,p.getPlayerId());
		System.out.println("welcome");
	return ps.execute();
	}
	
	public Player getPlayerById(int id) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getPlayerId() == id) {
				p.setPlayerId(id);
				p.setPlayerId(p1.getPlayerId());
				p.setName(p1.getName());
				p.setDateOfBirth(p1.getDateOfBirth());
				p.setSkill(p1.getSkill());
				p.setNumberOfMatches(p1.getNumberOfMatches());
				p.setRuns(p1.getRuns());
				p.setWickets(p1.getWickets());
				p.setNationality(p1.getNationality());
				p.setPowerRating(p1.getPowerRating());
				p.setTeamId(p1.getTeamId());
				
			}
		}
		
		return p;
	
}
	
	
	}














