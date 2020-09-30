package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.irctcDAO;
import com.DAO.irctcDAOInterface;

/**
 * Servlet implementation class irctcGetRailwayStation
 */
public class irctcGetRailwayStation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String country = request.getParameter ( "country" );
		String keyword = request.getParameter ( "keyword" );
		
		
		irctcDAOInterface id = new irctcDAO ();
		
		List < String > station_list = id.returnTrainStation ( country, keyword );
		
		response.setContentType ( "text/palin" );
		PrintWriter out = response.getWriter ();
		
		String ss = "";
		
		for ( String s : station_list ) {
			
			ss = ss + "<option value='" + s + "'>" + s + "</option>";
		}
		
		out.println ( ss );
	}

}
