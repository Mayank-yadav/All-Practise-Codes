<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

	<script>
	$(document).ready(function() {
		
	});
	function loadDoc() {
		  var xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    
		     document.getElementById("demo").innerHTML = xhttp.responseText;
		   
		  }
		  xhttp.open("GET", "DemoServlet", true);
		  xhttp.send();
		}
	</script>
<body>
	<button type="button" onClick="loadDoc()">Cilck</button>
	<p id="demo"></p>
	<%!int i=0; %>
	
	<%="JSP Counter Refreshed:"+i %>
	<% i++; %>
</body>
</html>