package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.countryStateCityInterface;
import com.DAO.countryStateCityInterfaceLayer;

/**
 * Servlet implementation class getState
 */
public class getState extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		countryStateCityInterfaceLayer id = new countryStateCityInterface ();
		
		String keyword = request.getParameter ( "keyword" );
		String country = request.getParameter ( "country" );
		
		List < String > state_list = id.getState ( keyword, country );
		
		response.setContentType ( "text/palin" );
		PrintWriter out = response.getWriter ();
		
		String ss = "";
		
		for ( String s : state_list ) {
			
			ss = ss + "<option value='" + s + "'>"+ s +"</option>";
		}
		
		out.println ( ss );
	}

}
