<%@page import="org.apache.catalina.ant.ListTask"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@page import="com.yash.dao.ServiceDao"EL%>
	<%@page import="com.yash.domain.Customer"%>
	<%@page import="java.util.Iterator"%>
	<%@page import="java.util.ArrayList"%>
	<%-- <jsp:useBean id="obj" class="com.yash.domain.Customer" scope="response" /> --%>
	
	<div align="center" >
		<table border="1" cellpadding="5">
			<caption>
				<h1>Customer Table</h1>
			</caption>
			<tr>
				<th>Cnum</th>
				<th>Cname</th>
				<th>City</th>
				<th>Snum</th>
				<th>Rating</th>
			</tr>
			 <% 
	ArrayList<Customer> list=(ArrayList<Customer>)request.getAttribute("customer");
	
	 for(Customer c:list){
		out.print("<tr><th>"+c.getCnum()+"</th>");
		out.print("<th>"+c.getCname()+"</th>");
		out.print("<th>"+c.getCity()+"</th>");
		out.print("<th>"+c.getSnum()+"</th>");
		out.print("<th>"+c.getRating()+"</th></tr>");
	} 
	%> 
	<%-- <tr><th>${request.list[0]}</th>
		<th>${request.list[1]}</th>
		<th>${request.list[2]}</th>
		<th>${request.list[3]}</th>
		<th>${request.list[4]}</th></tr>
		</table>
	</div> --%>

</table>
</body>
</html>