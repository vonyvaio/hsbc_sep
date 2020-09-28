package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.info;
import com.factory.serviceFactory;
import com.service.serviceLayerInterface;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		info user = new info ();
		
		user.setName ( request.getParameter ( "name" ) );
		user.setPassword ( request.getParameter ( "password" ) );	
		
		serviceLayerInterface service = serviceFactory.createObject ();
		
		response.setContentType ( "text/html" );
		PrintWriter out = response.getWriter ();
		
		out.println ( "<html><body>" );
		
		if ( service.loginProfile ( user ) == 1 ) {
			
			HttpSession session = request.getSession ( true );
			
			session.setAttribute ( "userID", user.getName () );
			session.setAttribute ( "Password", user.getPassword () );
			
			out.println ( "Welcome " + user.getName () + "<a href = \"FriendList\"> Friend List </a>" );
			
		} else {
			
			out.println ( "<span style = \"color:red;\"> Invalid ID and Password </span> <br><br>" );
			
			RequestDispatcher rd = getServletContext ().getRequestDispatcher ( "/Login.html" );
			rd.include ( request, response );
			
		}
		
		out.println ( "</body></html>" );
	}

}
