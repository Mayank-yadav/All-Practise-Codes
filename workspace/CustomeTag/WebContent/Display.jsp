<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 <style>body{ background-image:url(http://blog.parhammajd.co.uk/wp-content/uploads/2013/05/Intro1.jpg) }</style>
<table border="1" cellpadding="3" >
<tr>
				<th>name</th>
				<th>id</th>
				<th>address</th>
				
			</tr>
<tr>
		<td>${customer.name}</td>
		<td>${customer.id}</td>
		<td>${customer.address}</td>
		
		</tr>
</table>
</center>
</body>
</html>