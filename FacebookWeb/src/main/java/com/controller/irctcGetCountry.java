package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.irctcDAO;
import com.DAO.irctcDAOInterface;

/**
 * Servlet implementation class irctcGetCountry
 */
public class irctcGetCountry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		irctcDAOInterface id = new irctcDAO ();
		
		List < String > country_list = id.returnCountry ();
		
		response.setContentType ( "text/palin" );
		PrintWriter out = response.getWriter ();
		
		out.println ( "<select id=\"country\" name=\"country\" class=\"country\">" );
		
		for ( String s : country_list ) {
			
			out.println ( "<option value=\"" + s + "\">"+ s +"</option>" );
		}
		
		out.println ( "</select>" );		
	}

}
