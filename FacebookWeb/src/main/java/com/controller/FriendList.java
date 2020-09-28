package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.info;
import com.factory.serviceFactory;
import com.service.*;

/**
 * Servlet implementation class FriendList
 */
public class FriendList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession ( true );
		
		info i = new info ();
		
		i.setName ( session.getAttribute ( "userID" ).toString () );
		i.setPassword ( session.getAttribute ( "Password" ).toString () );		
		
		serviceLayerInterface service = serviceFactory.createObject ();
		
		List < info > user_list = service.FriendList ( i );
		
		response.setContentType ( "text/html" );
		PrintWriter out = response.getWriter ();
		
		out.println ( "<html><body>" );
		
		if ( user_list.size () > 0 ) {
			
			out.println ( "<br><span style=\"font-size:large;color:green;\"> FRIENDS LIST </span><br>" );
			
			for ( info o : user_list ) {
				
				out.println ( "<br> <span style=\"colour:green;\"> " + o.getName () + " </span>" );
			}
			
			
		} else {
			
			out.println ( "<span style=\"color:red;\"> No Friend Founds </span>" );
		}
		
		out.println ( "</body></html>" );
	}

}
