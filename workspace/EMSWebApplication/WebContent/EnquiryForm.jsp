<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enquiry Form</title>
</head>
<style>body{ background-image:url(http://blog.parhammajd.co.uk/wp-content/uploads/2013/05/Intro1.jpg) }</style>

<body>
	<a href="index.jsp" style="float: right;">Logout</a>
	<center>
	<h1>Enquiry Form</h1>
	<form  method="get" action="EnquiryActionServlet">
			<table border="1" cellpadding="5">
				
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Contact:</td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td>Courses:</td>
					<td><input type="Checkbox" name="courses" value="java" >Java
						<input type="Checkbox" name="courses1" value="java">C
						<input type="Checkbox" name="courses2" value="java">C++
				</td>
				</tr>
				
				<tr>
					<td><button type="submit" value="submit">Submit</button></td>
				</tr>
				
			</table>
		</form>
	</center>
</body>
</html>