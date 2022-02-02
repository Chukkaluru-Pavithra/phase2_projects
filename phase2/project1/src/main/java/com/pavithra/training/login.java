package com.pavithra.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("userName");
		String userpassword = request.getParameter("userPass");
		
		HttpSession theSession = request.getSession();
		
		if(username.trim().equals("pavithra") && (userpassword.trim().equals("9345"))) {
			theSession.setAttribute("userName", username );
			theSession.setAttribute("userPass", userpassword);
			
			response.sendRedirect("dashboard");
		}
		
		else {
			out.println("<font color = 'red'>Invalid User Name </font>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
		
		out.println("<a href = 'dashboard'>Next</a>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
