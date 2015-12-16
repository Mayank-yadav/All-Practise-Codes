<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management System</title>

</head>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
 <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
<script>
function goToContoller(){
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    
	     document.getElementById("demo").innerHTML = xhttp.responseText;
	   
	  }
	  xhttp.open("GET", "ControllerServlet", true);
	  xhttp.send();
	
}

function Registration(){
	var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    
	     document.getElementById("demo").innerHTML = xhttp.responseText;
	   
	  }
	  xhttp.open("GET", "ControllerServlet", true);
	  xhttp.send();
	
}
</script>
<body>
<center>
	<form action="ControllerServlet" method="get">
	<table>
		<tr>
		<td>Enter Your Id</td>
		<td><input type="text"  name="userid" /></td>
		</tr>
		<tr>
		<td><input type="submit" name ="button1" value="submit" id="button"/></td>
		</tr>
		<tr>
		<td><input type="submit" name="button2"  value="GetAllEntries"></td>
		</tr>
		<tr>
		<td><input type="submit" name="button3"  value="Registration">
		</td>
		</tr>
	</table>
	</form>
	<p id="demo"></p>
</center>
</body>
</html>