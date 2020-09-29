package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.serviceFactory;
import com.service.*;

/**
 * Servlet implementation class checkForValidEmail
 */
public class checkForValidEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		serviceLayerInterface service = serviceFactory.createObject ();
		
		String email = request.getParameter ( "email" );
		
		response.setContentType ( "text/plain" );
		PrintWriter out = response.getWriter ();
		
		
		if ( service.checkForValidEmail ( email ) == 1 ) {
			
			out.println ( "<span style=\"color:red;\"> Email ID Exists please select other </span>" );
			
		} else {
			
			out.println ( "<span style=\"color:green;\"> Valid Email </span>" );
		}
	}

}
