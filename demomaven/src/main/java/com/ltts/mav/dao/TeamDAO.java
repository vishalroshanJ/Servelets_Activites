package com.ltts.mav.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.mav.model.Team;
import com.ltts.mav.configure.MyConnection;


public class TeamDAO {
	/*
	 * public void displayTeams() throws Exception {\ Connection
	 * mc=MyConnection.getConnection();
	 * 
	 * try (Statement s = mc.createStatement()) { }
	 * 
	 * PreparedStatement ps = mc.prepareStatement("select * from team"); ResultSet
	 * rs = ps.executeQuery();
	 * 
	 * while(rs.next()){ System.out.println(rs.getString(1)+" " +
	 * rs.getString(2)+" " + rs.getString(3)); } mc.close(); }
	 */
	
	public boolean insertTeam(Team t) throws Exception
	{
	
	Connection c=MyConnection.getConnection();
	PreparedStatement ps=c.prepareStatement("insert into Team values(?,?,?)");
	ps.setInt(1, t.getTeamId());
	ps.setString(2, t.getTeamName());	
	ps.setString(3,t.getCoachname());
	return ps.execute();
	}
	
	public List<Team> getAllTeams() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Connection c=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=c.createStatement();
		ResultSet rs=ps.executeQuery("select * from team");
		Team p=new Team();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3)));
			
		}
		return li;
	}
	
		public Team getTeamById(int tid) throws Exception {
			Team t=new Team();
			List<Team> li=getAllTeams();
			for(Team t1:li) {
				if(t1.getTeamId() == tid) {
					t.setTeamId(tid);
					t.setTeamId(t1.getTeamId());
					t.setTeamName(t1.getTeamName());
					t.setCoachname(t1.getCoachname());
				}
			}
			
			return t;
		
	}
	public boolean updateTeam(Team T) throws Exception {
		// TODO Auto-generated method stub
		
		Connection c=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("UPDATE Team SET teamname = ?,coachname = ? where idteam=?");
		ps.setString(1,T.getTeamName());
		ps.setString(2,T.getCoachname());
		ps.setInt(3,T.getTeamId());
		
	
	return ps.execute();
	}
	
}