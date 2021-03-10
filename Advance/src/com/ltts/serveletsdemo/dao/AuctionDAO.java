package com.ltts.serveletsdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.llts.serveletsdemo.model.Auction;
import com.llts.serveletsdemo.model.Player;
import com.llts.serveletsdemo.model.Team;
import com.ltts.serveletsdemo.configure.MyConnection;

public class AuctionDAO {
	public void displayTeams(Auction A) throws Exception {
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into auction values(?,?,?,?,?);");
		  ps.setInt(1,A.getAuctionid());
		  ps.setString(2,A.getTeamname());
		  ps.setInt(3,A.getTeamid());
		  ps.setInt(4,A.getPlayerid());
		  ps.setInt(5,A.getYear() );
		 ps.executeUpdate();	
		 System.out.println("Successfully Added");
}


	}
	
	
	
	
	
	
