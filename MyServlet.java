package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strName = request.getParameter("txtName");	//request obj gets value from parameter "txtName" of the index.html
		String strEmail = request.getParameter("txtEmail");	//request obj gets value from parameter "txtEmail" of the index.html
		
		PrintWriter out = response.getWriter();	//getWriter method will create a obj of printwriter class
		out.println("Hello "+strName+" and email id is "+ strEmail);
	}

}
