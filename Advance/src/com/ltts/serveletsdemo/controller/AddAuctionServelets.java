package com.ltts.serveletsdemo.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.llts.serveletsdemo.model.Auction;
import com.ltts.serveletsdemo.dao.AuctionDAO;

/**
 * Servlet implementation class PlayerServlet
 */
@WebServlet("/AddAuctionServelets")
public class AddAuctionServelets extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddAuctionServelets() {
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
	
	    int auctionid=Integer.parseInt(request.getParameter("auctionid"));
	    String teamname= request.getParameter("teamname");
	    int teamid=Integer.parseInt(request.getParameter("teamid"));
	    int playerid=Integer.parseInt(request.getParameter("playerid"));
	    int year=Integer.parseInt(request.getParameter("year"));
	     Auction p=new  Auction(auctionid,teamname,teamid,playerid,year);
	    System.out.println("Inside Servlet: "+p);
	    AuctionDAO pd=new  AuctionDAO();
		try {
			pd.displayTeams(p); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	    
	}

}