
<%@ page isELIgnored="false" %>

<HTML>
<HEAD><TITLE>Welcome to EL</TITLE></HEAD>

<BODY bgcolor="lightgreen">


<h3>		

<h1>EL IMPLICIT OBJECTS</h1>
	<ol>
		<li>pageScope
		<li>requestScope
		<li>sessionScope
		<li>applicationScope<br><br>
		<li>param
		<li>paramValues
		<li>header
		<li>headerValues
		<li>cookie
		<li>initParam<br><br>
		<li>pageContext
	</ol>

<Center>	


<%
	pageContext.setAttribute("Bus","DTC");
	request.setAttribute("Car","Honda-City");	
	session.setAttribute("Phone","2345123");
	application.setAttribute("Scotter","Bajaj Chetak");
	
%>

FORM DATA !!
<hr color="red">

		Student Name: 	${param.name} 		<BR><BR>
		Address:        ${param.address}	<BR><BR>
		Course:         ${param.course}		<BR><BR>
		Gender: 		${param.gender}		<BR><BR>
		Age:			${param.age}		<BR><BR>
		Hobbies:		${paramValues.hobbies[0]},${paramValues.hobbies[1]},${paramValues.hobbies[2]}

		
<hr color="red">
HEADER INFO !!
<hr color="red">
		Host:	${header.host} <br><br>
		Request Method:			${pageContext.request.method}<br>
		
<hr color="red">
CONTEXT PARAM INFO !!
<hr color="red">
		Email ID:	${initParam.Email} <br><br>
		Mobile:		${initParam.Mobile} <br><br>


<hr color="red">
OTHER SCOPE INFO !!
<hr color="red">
		Page Scope - Bus:				${pageScope.Bus}<br>
		Request Scope - Car:			${requestScope.Car}<br>
		Session Scope - Phone:			${sessionScope.Phone}<br>
		Application Scope - Scotter:	${applicationScope.Scotter}<br>
		

</h3>
</CENTER>			
<br><br><br><br><br>
</BODY>
</HTML>
