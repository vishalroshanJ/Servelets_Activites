package com.ltts.serveletsdemo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.serveletsdemo.configure.MyConnection;


public class TeamDAO {
public void displayTeams() throws Exception {
	Connection mc=MyConnection.getConnection();
	
	try (Statement s = mc.createStatement()) {
	}
	
	PreparedStatement ps = mc.prepareStatement("select * from team");
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()){
		System.out.println(rs.getString(1)+" " + rs.getString(2)+" " + rs.getString(3)+" " + rs.getString(4));
	}
	mc.close();
}
}