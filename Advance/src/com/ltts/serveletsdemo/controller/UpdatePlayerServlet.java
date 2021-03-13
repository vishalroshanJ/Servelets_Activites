	package com.ltts.serveletsdemo.controller;

	import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.llts.serveletsdemo.model.Auction;
import com.ltts.serveletsdemo.dao.playerDAO;
import com.llts.serveletsdemo.model.Player;
import com.ltts.serveletsdemo.dao.AuctionDAO;

@WebServlet("/UpdatePlayerServlet")
	
public class UpdatePlayerServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

	    /**
	     * Default constructor. 
	     */
	    public UpdatePlayerServlet() {
	    	super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//doGet(request, response);
		
			
			  PrintWriter out = response.getWriter();
			 // int playerId=Integer.parseInt(request.getParameter("Playerid"));
			 // String name=request.getParameter("Name");
			//  String dateOfBirth=request.getParameter("DateOfBirth");
	         // String skill=request.getParameter("skill");
			  //int numberOfMatches=Integer.parseInt(request.getParameter("numberOfMatches"));
			//  int runs=Integer.parseInt(request.getParameter("runs"));
			//  int wickets=Integer.parseInt(request.getParameter("Wickets")); 
			//  String nationality=request.getParameter("Nationality");
			 // double  powerRating=Double.parseDouble(request.getParameter("powerRating")); 
			 // int teamId=Integer.parseInt(request.getParameter("teamId"));
			 
				Player p=new Player(123,"fgdg","dateOfBirth","skill",90,45,9,"inf",3.0,9);
				System.out.println("Inside Update Player Servlet: ");
				playerDAO pd=new playerDAO();
				boolean b=false;
				RequestDispatcher rd=null;
				try {
					b=pd.updatePlayer(p); // Control TRanfers to Dao file
					rd=request.getRequestDispatcher("success.html");
					rd.forward(request, response);
					//System.out.println("Successfully Inserted...");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					out.write("Already Player id Used: "+e);
					rd=request.getRequestDispatcher("addplayer.html");
					rd.include(request, response);
					e.printStackTrace();
				}
		}}

	