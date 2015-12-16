<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<style>body{ background-image:url(http://7-themes.com/data_images/out/57/6967702-android-desktop-background.jpg) }</style>
</head>
<body>
<center>
<h1>Registration</h1>	
	<br /> 
		<form action="EmployeeServlet" method="get">
				Enter Employee Name:<input type="text" name="name"/>
				<br/>
				Enter Employee Salary:<input type="text" name="salary">
				<br/>
				<input type="submit" value="registration" name="action">
		</form>
</center>
</body>
</html>