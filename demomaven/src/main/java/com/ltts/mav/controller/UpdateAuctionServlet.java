package com.ltts.mav.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.mav.model.Auction;
import com.ltts.mav.dao.AuctionDAO;

@WebServlet("/UpdateAuctionServlet")
public class UpdateAuctionServlet  extends HttpServlet {
		private static final long serialVersionUID = 1L;

	    /**
	     * Default constructor. 
	     */
	    public UpdateAuctionServlet () {
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
			System.out.println("welcome to update");
			int Auctionid=Integer.parseInt(request.getParameter("Auctionid"));
			int Playerid=Integer.parseInt(request.getParameter("Playerid"));
			int Teamid=Integer.parseInt(request.getParameter("Teamid"));
			int year=Integer.parseInt(request.getParameter("year"));
			int ammount=Integer.parseInt(request.getParameter("ammount"));
			Auction a = new Auction(Auctionid,Playerid,Teamid,year,ammount);
			System.out.println("Inside Update Auction Servlet: "+a);
			AuctionDAO ad=new AuctionDAO();
			boolean b=false;
			RequestDispatcher rd=null;
			try {
				b=ad.updateAuction(a); // Control TRanfers to Dao file
				rd=request.getRequestDispatcher("success.html");
				rd.forward(request, response);
				//System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already Auction id Used: "+e);
				rd=request.getRequestDispatcher("AddAuction.html");
				rd.include(request, response);
				e.printStackTrace();
			}
		}
		}

	