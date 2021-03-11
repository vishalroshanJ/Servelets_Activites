package com.ltts.mav.controller;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.mav.dao.userdao;



//login servelet
@WebServlet("/loginuser")
public class loginserve extends HttpServlet{

  


		private static final long serialVersionUID = 1L;

	    /**
	     * Default constructor. 
	     */
	    public loginserve() {
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
		
		  
			 String userName = request.getParameter("userName");   
			 String password = request.getParameter("password");
		    System.out.println("Inside login Servlet: ");
		    userdao pd=new  userdao();
			try {
				pd.validdate(userName,password); // Control TRanfers to Dao file
				System.out.println("Successfully  gone to valid page..");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		    
		}

	}
	
	
	
	


