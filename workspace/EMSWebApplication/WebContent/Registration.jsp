<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>body{ background-image:url(http://blog.parhammajd.co.uk/wp-content/uploads/2013/05/Intro1.jpg) }</style>

<body>
<a href="index.jsp" style="float: right;">Back to login</a>
	<div >
	<center>
	<h1>Registration Form</h1>
		<form  method="get" action="RegistrationActionServlet">
			<table border="1" cellpadding="6">
			
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>UserName:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Set Password:</td>
					<td><input type="text" name="setpassword"></td>
				</tr>
				<tr>
					<td>Set Type:</td>
					<td><input type="text" name="settype"></td>
				</tr>
				<tr>
					<td>Set Status:</td>
					<td><input type="text" name="setstatus"></td>
				</tr>
				<tr>
					<td><button type="submit" value="submit">Submit</button></td>
				</tr>
				
			</table>
		</form>
	</center>
</div>

</body>
</html>