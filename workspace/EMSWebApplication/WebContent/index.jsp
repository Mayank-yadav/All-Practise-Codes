<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS Login Form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<style>body{ background-image:url(http://blog.parhammajd.co.uk/wp-content/uploads/2013/05/Intro1.jpg) }



.wrapper {	
	margin-top: 80px;
  margin-bottom: 80px;
}

.form-signin {
  max-width: 380px;
  padding: 15px 35px 45px;
  margin: 0 auto;
  background-color: #fff;
  border: 1px solid rgba(0,0,0,0.1);  

  .form-signin-heading,
	.checkbox {
	  margin-bottom: 30px;
	}

	.checkbox {
	  font-weight: normal;
	}

	.form-control {
	  position: relative;
	  font-size: 16px;
	  height: auto;
	  padding: 10px;
		@include box-sizing(border-box);

		&:focus {
		  z-index: 2;
		}
	}

	input[type="text"] {
	  margin-bottom: -1px;
	  border-bottom-left-radius: 0;
	  border-bottom-right-radius: 0;
	}

	input[type="password"] {
	  margin-bottom: 20px;
	  border-top-left-radius: 0;
	  border-top-right-radius: 0;
	}
}



</style>
<body>
<!-- <div >

	<center>
		<h2>EMS LOGIN FORM</h2>
		<form method=" get" action="LoginActionServlet">
			<table border="1" cellpadding="5">
				<tr>
					<td>Username:</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					
					<td><input type="submit" value="login"></td>
					<td><a href="Registration.jsp"  value="register" >Register Here</td>
				</tr>
			</table>
		</form>
	</center>
</div> -->

<div class="wrapper" >
	<center>
    <form class="form-signin" method="get" action="LoginActionServlet">       
      <h2 class="form-signin-heading">EMS Login Form</h2>
     
      <input type="text" class="form-control" name="username" placeholder="UserName" required="" autofocus="" />
      <!--  <h4>Password</h4> -->
      <br/>
      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>      <br/>
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>  
      <label class="checkbox">
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      </label>
      <td><a href="Registration.jsp"  value="register" >Register Here</a></td> 
    </form>
    </center>
  </div>


</body>
</html>