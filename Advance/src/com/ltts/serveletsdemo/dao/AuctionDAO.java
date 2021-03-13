package com.ltts.serveletsdemo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.llts.serveletsdemo.model.Auction;
import com.llts.serveletsdemo.model.Player;
import com.llts.serveletsdemo.model.Team;
import com.ltts.serveletsdemo.configure.MyConnection;

public class AuctionDAO {
	public boolean insertAuction(Auction a) throws Exception
	
	{
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("insert into Auction values(?,?,?,?,?)");
		ps.setInt(1, a.getAuctionid());
		ps.setInt(2, a.getPlayerid());
		ps.setInt(3, a.getTeamid());
		ps.setInt(4, a.getYear());
		ps.setInt(5, a.getAmmount());
		
		return ps.execute();
		
		
	}
	public List<Auction> getAllAuctions() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Connection c=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=c.createStatement();
		ResultSet rs=ps.executeQuery("select * from auction");
		Auction p=new Auction();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
		}
		return li;
	}
	
		public Auction getAuctionById(int aid) throws Exception {
			Auction t=new Auction();
			List<Auction> li=getAllAuctions();
			for(Auction t1:li) {
				if(t1.getAuctionid() == aid) {
					t.setAuctionid(aid);
					t.setAuctionid(t1.getAuctionid());
					t.setPlayerid(t1.getPlayerid());
					t.setTeamid(t1.getTeamid());
					t.setYear(t1.getYear());
					t.setAmmount(t1.getAmmount());
					
				}
			}
			
			return t;
		
	}
		
		
	public boolean updateAuction(Auction a) throws Exception {
		// TODO Auto-generated method stub
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE auction SET playerid =?,teamid=?,year=?,ammount=? where auctionid=?");
		ps.setInt(1,a.getPlayerid());
		ps.setInt(2,a.getTeamid());
		ps.setInt(3,a.getYear());
		ps.setInt(4,a.getAmmount());
		ps.setInt(5,a.getAuctionid());
	return ps.execute();
	
	
	
	}
	
	

	}
	
	
	
	
	
	
