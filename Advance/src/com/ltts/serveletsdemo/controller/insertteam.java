package com.ltts.serveletsdemo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.llts.serveletsdemo.model.Auction;
import com.llts.serveletsdemo.model.Team;
import com.ltts.serveletsdemo.dao.AuctionDAO;
import com.ltts.serveletsdemo.dao.TeamDAO;

@WebServlet("/InsertTeamServlet")
public class insertteam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertteam() {
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
		int Teamid=Integer.parseInt(request.getParameter("Teamid"));
		String Teamname=request.getParameter("Teamname");
		String Teamowner=request.getParameter("Teamowner");
		Team t = new Team(Teamid,Teamname,Teamowner);
		System.out.println("Inside team Servlet:"+t);
		TeamDAO td=new TeamDAO();
		boolean b=false;
		try {
			b=td.insertTeam(t); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
