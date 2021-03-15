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
import com.ltts.mav.dao.playerDAO;
import com.ltts.mav.model.Player;
import com.ltts.mav.dao.TeamDAO;
import com.ltts.mav.model.Team;
@WebServlet("/UpdateTeamServlet")

public class UpdateTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateTeamServlet() {
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
		int teamId=Integer.parseInt(request.getParameter("teamId"));
		String TeamName=request.getParameter("TeamName");
		String Coachname=request.getParameter("Coachname");
		
		Team t = new Team(teamId,TeamName,Coachname);
		System.out.println("Inside Update Team Servlet: "+t);
		TeamDAO td=new TeamDAO();
		boolean b=false;
		RequestDispatcher rd=null;
		try {
			b=td.updateTeam(t); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("success.html");
			rd.forward(request, response);
			//System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Team id Used: "+e);
			rd=request.getRequestDispatcher("addteam.html");
			rd.include(request, response);
			e.printStackTrace();
		}
	}}

