package com.ltts.mav.configure;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MyConnection {
	public static Connection getConnection() throws Exception {
	//FileReader fr=new FileReader("src/db.properties");
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties"); 
		Properties p=new Properties();
		p.load(inputStream);
		
		String url=(String) p.getProperty("connection");
		String username=(String)p.getProperty("user");
		String password=(String)p.getProperty("password");
		System.out.println("Inside MyConnection.." +url+" "+username);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Inside MyConnection..");
		return con;
	}}



