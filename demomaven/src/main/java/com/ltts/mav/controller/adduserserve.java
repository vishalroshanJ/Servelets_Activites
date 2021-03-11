package com.ltts.mav.controller;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.mav.dao.userdao;
import com.ltts.mav.model.user;

@WebServlet("/Adduser")
public class adduserserve extends HttpServlet {


		private static final long serialVersionUID = 1L;
	    /**
	     * Default constructor. 
	     */
	    public adduserserve() {
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
		    String firstName= request.getParameter("firstName");
		    String lastName= request.getParameter("lastName");
		    String userName= request.getParameter("userName");
		    String password= request.getParameter("password");
		    user p=new  user(0,firstName,lastName,userName,password);
		    System.out.println("Inside Servlet: "+p);
		    userdao pd=new  userdao();
			try {
				pd.insertPlayer(p); // Control TRanfers to Dao file
				System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		    
		}

	}
	
	
	
	


