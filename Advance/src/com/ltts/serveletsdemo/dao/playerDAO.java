package com.ltts.serveletsdemo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.llts.serveletsdemo.model.Player;
import com.ltts.serveletsdemo.configure.MyConnection;
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
	}}


