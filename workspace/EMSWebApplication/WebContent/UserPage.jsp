<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<style>body{ 

background-image:url(http://blog.parhammajd.co.uk/wp-content/uploads/2013/05/Intro1.jpg) }</style>

<body>
	<div>
	<a href="index.jsp" style="float: right;">Logout</a>
	</div>
	<center>
		<h1>Welcome ${username} </h1>
		<h2>UserId: ${userId} </h2>
		
		<div class="container">
		<table border=1 class="table table-striped">
			<tr class="success">
				<th>EnquiryId</th>
				<th>Name</th>
				
				<th>Email</th>
				<th>Contact</th>
				<th>Courses</th>
				<th>Operations</th> 
			</tr>
			<c:forEach items="${lists}" var="list"> 
			<tr class="warning">
				
				<th>${list.enquiryId}</th>
				<th>${list.name}</th>
				<th>${list.email}</th>
				<th>${list.contact}</th>
				<th>${list.courses}</th>
				<td>
				
				
	<button type="button" class="btn btn-xs btn-info btn-lg" data-toggle="modal" data-target="#myModal">Edit Enquiry</button>
					
				
					
	<button type="button" class="btn btn-xs btn-info btn-lg" data-toggle="modal" data-target="#myModalDelete">Delete Enquiry</button>
					
					
				</td>
				<!-- <th>
				<div>
				<form method="get" action="">
					<button type="submit" class="btn  btn-xs btn-info  disabled" value="submit">Edit Enquiry</button>
					<button type="button" class="btn btn-xs btn-info btn-lg" data-toggle="modal" data-target="#myModal">Edit Enquiry</button>
					</form>
					<br/>
					
					<form method="get" action="">
					<button type="submit" class="btn btn-xs btn-info  disabled" value="submit">Delete Enquiry</button>
					<button type="button" class="btn btn-xs btn-info btn-lg" data-toggle="modal" data-target="#myModal">Delete Enquiry</button>
					</form>
					</div>
				</th> -->
				
			</tr>
			
				</c:forEach>
			<%-- <tr><c:forEach var="person" items="${persons}">
			${person.name }
		</c:forEach></tr>
			<tr><c:forEach var="enquiry" items="${enquiries}">
			${enquiry.contact }
		</c:forEach></tr> --%>
		
		
		
		
		</table>
		<form method="get" action="EnquiryForm.jsp">
			<button type="submit" class="btn btn-lg btn-primary " value="submit">New Enquiry</button>
		</form>
		</div>
	</center>
	
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <form  method="get" action="EnquiryActionServlet">
			<table border="1" cellpadding="5">
				
				<tr>
					<td>Edit Name:</td>
					<td><input type="text" name="name" ></td>
				</tr>
				<tr>
					<td>Edit email:</td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td>Edit Contact:</td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td>Edit Courses:</td>
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
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
	
	<!-- Modal for delete-->
  <div class="modal fade" id="myModalDelete" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <p>Do you want to delete this Enquiry</p>
           <button type="button" class="btn btn-success" data-dismiss="modal">Submit</button>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
	
	
	
</body>
</html>