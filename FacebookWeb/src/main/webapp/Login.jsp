<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import = "com.service.*,com.entity.*, com.factory.*" %>
    
<!DOCTYPE html>

<html>

<head>

	<meta charset="ISO-8859-1">

	<title>Login</title>

</head>

<body>

<%

	info user = new info ();

	user.setName ( request.getParameter ( "name" ) );
	user.setPassword ( request.getParameter ( "password" ) );
	
	user.setEmail ( "email@email.com" );
	user.setPhone ( "1546235648" );
	
	serviceLayerInterface service = serviceFactory.createObject ();
	
	if ( service.createProfile ( user ) == 1 ) {
		
%>

	<h3> Registration Successful </h3>
	
	<span> <a href = "Login.html"> Login Page </a> </span>

	<table>
	
		<tr>
			<td> Name </td>
			<td> : </td>
			<td> <%= user.getName () %> </td>			
						
		</tr>
		
		<tr>
			
			<td> Password </td>
			<td> : </td>
			<td> <%= user.getPassword () %> </td>	
		
		</tr>
		
		<tr>
			
			<td> Email </td>
			<td> : </td>
			<td> <%= user.getEmail () %> </td>	
		
		</tr>
		
		<tr>
			
			<td> Phone </td>
			<td> : </td>
			<td> <%= user.getPhone () %> </td>	
		
		</tr>
	
	</table>	

<%		
	} else {
%>

	<h4 style = "color:red;"> Error Creating Profile..... </h4>

<%
	}
%>


</body>
</html>