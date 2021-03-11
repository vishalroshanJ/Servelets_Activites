package com.ltts.mav.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ltts.mav.configure.MyConnection;
import com.ltts.mav.model.user;

public class userdao {
	//method for registering the user in database

	public void insertPlayer(user p) throws Exception {
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("insert into loginn values(?,?,?,?,?);");
		ps.setInt(1,p.getId());
		ps.setString(2,p.getFirstame());
		ps.setString(3,p.getSecondname());
		ps.setString(4,p.getUsername() );
		ps.setString(5,p.getPassword());
		 System.out.println(p.getUsername());
		 ps.executeUpdate();	
		 System.out.println("Successfully Added");		 
	}
	
	//validating the username and password in database
	public void validdate(String v,String p) throws Exception
	{   Connection mc=MyConnection.getConnection();
		Statement st = mc.createStatement();
	    ResultSet rs;
	    rs = st.executeQuery("select * from loginn where userName='" + v + "' and password='" +p + "'");
	    if (rs.next()) {
	       System.out.println("Success");
	    } else {
	        System.out.println("Invalid password try again");
	    }
	}
	


}

