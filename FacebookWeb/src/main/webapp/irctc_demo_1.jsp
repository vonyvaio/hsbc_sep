<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.DAO.*, java.util.List, java.util.ArrayList" %>

<!DOCTYPE html>

<html>

	<head>
	
		<meta charset="ISO-8859-1">
		<title>Station Demo 1</title>
		
		<script type = "text/javascript">

			var country="";

			function getStation () {

				var country = document.getElementById ( "country" ).value;

				var keyword = document.getElementById ( "stationName" ).value;

				if ( keyword.length > 1 ) {
	
						// get XHR
	
					var xhr = new XMLHttpRequest ();
	
						// open connection with server
	
					xhr.open ( "POST", "irctcGetRailwayStation?country=" + country + "&keyword=" + keyword, true );
	
						// send request
	
					xhr.send ();
	
						// check response
	
					xhr.onreadystatechange = function () {
	
						if ( xhr.readyState == 4 ) {
	
							message = xhr.responseText;
	
							document.getElementById ( "station" ).innerHTML = message;
						}
					}

				} else {

					var message = "No Cities Found";

					document.getElementById ( "station" ).innerHTML = message;
				}
			}

		</script>
	
	
	</head>

<body>

<form method = "POST">
	
	<table>
	
		<tr>		
			<td> Country </td> 
			<td> : </td>
			<td> 

<%
			irctcDAOInterface id = new irctcDAO ();

			List < String > country_list = id.returnCountry ();
%>
			<select id="country" name="country" onclick="">
<%		
			for ( String s : country_list ) {
%>			
				<option value="<%=s%> "> <%=s%> </option>
<%
			}
%>		
			</select>
<%			

%>
			</td>
			<td> </td>
					
		</tr>

		<tr>		
			<td> Enter Station </td> 
			<td> : </td>
			<td> <input type="text" name="stationName" id="stationName" onkeyup="getStation()"> </td>
			<td> <div id="station"> </div> </td>
					
		</tr>
	
	</table>

</form>


</body>

</html>





