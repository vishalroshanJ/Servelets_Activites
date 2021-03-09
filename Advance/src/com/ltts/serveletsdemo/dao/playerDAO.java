package com.ltts.serveletsdemo.dao;

public class playerDAO {
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

import com.llts.serveletsdemo.model.Player;
import com.ltts.serveletsdemo.configure.MyConnection;

		
		public boolean insertPlayer(Player p) throws Exception {
			//fill your code
			Connection mc=MyConnection.getConnection(); // TRanfers control to another 
			PreparedStatement ps=mc.prepareStatement("insert into web_player values(?,?,?)");
			ps.setInt(1, p.getPlayerId());
			ps.setString(2, p.getPlayerName());
			ps.setString(3, p.getCountry());

			return ps.execute();
			//return false;

			
		}

	}


