<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html>

<head>

	<meta charset="ISO-8859-1">

	<title>Country State City Demo</title>
	
	<script type="text/javascript" >
	
		function getCountry () {

			var keyword = document.getElementById ( "countryName" ).value;

			if ( keyword.length > 1 ) {				
			
				// get XHR
	
				var xhr = new XMLHttpRequest ();
	
					// open connection with server
	
				xhr.open ( "GET", "getCountry?keyword=" + keyword, true );
	
					// send request
	
				xhr.send ();
	
					// check response
	
				xhr.onreadystatechange = function () {
	
					if ( xhr.readyState == 4 ) {
	
						message = xhr.responseText;
	
						document.getElementById ( "country" ).innerHTML = message;
					}
				}		
			}
			
		} // end of getCountry () fucntion 


		function setCountryText () {

			document.getElementById ( "countryName" ).value = document.getElementById ( "country" ).value;

			document.getElementById ( "stateName" ).value = "";

			document.getElementById ( "cityName" ).value = "";			

		} // end of setCountryText () fucntion

		
		function getState () {

			var keyword = document.getElementById ( "stateName" ).value;
			var country = document.getElementById ( "countryName" ).value;

			if ( keyword.length > 1 ) {				
			
				// get XHR
	
				var xhr = new XMLHttpRequest ();
	
					// open connection with server
	
				var parameters = "keyword=" + keyword + "&country=" + country;
	
				xhr.open ( "GET", "getState?" + parameters , true );
	
					// send request
	
				xhr.send ();
	
					// check response
	
				xhr.onreadystatechange = function () {
	
					if ( xhr.readyState == 4 ) {
	
						message = xhr.responseText;
	
						document.getElementById ( "state" ).innerHTML = message;
					}
				}		
			}
			
		} // end of getCountry () fucntion 


		function setStateText () {

			document.getElementById ( "stateName" ).value = document.getElementById ( "state" ).value;

			document.getElementById ( "cityName" ).value = "";

		} // end of setCountryText () fucntion

		
		function getCity () {

			var keyword = document.getElementById ( "cityName" ).value;
			
			var state = document.getElementById ( "stateName" ).value;

			if ( keyword.length > 1 ) {				
			
				// get XHR
	
				var xhr = new XMLHttpRequest ();
	
					// open connection with server
	
				var parameters = "keyword=" + keyword + "&state=" + state;
	
				xhr.open ( "GET", "getCity?" + parameters , true );
	
					// send request
	
				xhr.send ();
	
					// check response
	
				xhr.onreadystatechange = function () {
	
					if ( xhr.readyState == 4 ) {
	
						message = xhr.responseText;
	
						document.getElementById ( "city" ).innerHTML = message;
					}
				}		
			}
			
		} // end of getCountry () fucntion 


		function setCityText () {

			document.getElementById ( "cityName" ).value = document.getElementById ( "city" ).value;

		} // end of setCountryText () fucntion
		
	</script>
	
</head>

<body>

<form method = "POST">
	
	<table>
	
		<tr>		
			<td> Country </td> 
			<td> : </td>
			<td> <input type="text" name="countryName" id="countryName" onchange="setCountryText()" onkeyup="getCountry()"> </td>
			<td> <select id='country' name='country' onchange="setCountryText()" onclick="setCountryText()"></select> </td>
			<td> </td>
					
		</tr>

		<tr>		
			<td> State </td> 
			<td> : </td>
			<td> <input type="text" name="stateName" id="stateName" onchange="setStateText()" onkeyup="getState()"> </td>
			<td> <select id='state' name='state' onchange="setStateText()" onclick="setStateText()"></select> </td>
			<td> </td>
					
		</tr>
		
		<tr>		
			<td> City </td> 
			<td> : </td>
			<td> <input type="text" name="cityName" id="cityName" onchange="setCityText()" onkeyup="getCity()"> </td>
			<td> <select id='city' name='city' onchange="setCityText()" onclick="setCityText()"></select> </td>
			<td> </td>
					
		</tr>
	
	</table>

</form>

</body>

</html>