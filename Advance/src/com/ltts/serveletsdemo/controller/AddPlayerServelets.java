package com.ltts.serveletsdemo.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.llts.serveletsdemo.model.Player;
import com.ltts.serveletsdemo.dao.playerDAO;



/**
 * Servlet implementation class InsertPlayerServlet
 */
@WebServlet("/AddPlayerServelets")
public class AddPlayerServelets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPlayerServelets() {
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
		int playerId=Integer.parseInt(request.getParameter("PlayerId"));
		String name=request.getParameter("name");
		String dateOfBirth=request.getParameter("dateOfBirth");
		String skill=request.getParameter("skill");
		int numberOfMatches=Integer.parseInt(request.getParameter("numberOfMatches"));
		int runs=Integer.parseInt(request.getParameter("runs"));
		int wickets=Integer.parseInt(request.getParameter("wickets"));
		String nationality=request.getParameter("nationality");
		double powerRating=Double.parseDouble(request.getParameter("powerRating"));
		int teamId=Integer.parseInt(request.getParameter("teamId"));
		Player p=new Player(playerId,name,dateOfBirth,skill,numberOfMatches,runs,wickets,nationality,powerRating,teamId);
		System.out.println("Inside Servlet: "+p);
		playerDAO pd=new playerDAO();
		try {
			pd.insertPlayer(p);// Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}