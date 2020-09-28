package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.info;
import com.factory.serviceFactory;
import com.service.serviceLayerInterface;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		info user = new info ();
		
		user.setName ( request.getParameter ( "name" ) );
		user.setPassword ( request.getParameter ( "password" ) );
		
		user.setEmail ( request.getParameter ( "email" ) );
		user.setPhone ( request.getParameter ( "phone" ) );
		
		serviceLayerInterface service = serviceFactory.createObject ();	
		
		response.setContentType ( "text/html" );
		PrintWriter out = response.getWriter ();
		
		if ( service.createProfile ( user ) == 1 ) {
			
			out.println ( "<html><body>" );
				out.println ( "Name: " + user.getName () );
				out.println ( "<br>Password: " + user.getPassword () );
				out.println ( "<br>Email: " + user.getEmail () );
				out.println ( "<br>Phone: " + user.getPhone () );			
			out.println ( "</body></html>" );
			
			
		} else {
			
			out.println ( "<html><body>" );
				out.println ( "ERROR IN CREATING PROFILE " );			
			out.println ( "</body></html>" );			
		}
		
	}

}
