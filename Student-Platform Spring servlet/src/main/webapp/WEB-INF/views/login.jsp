<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href= "webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="styleSheet"> 
	
		<style type="text/css">
		.container{
					color: black;
					margin-left: 300px;	
					margin-top : 35px;				
			}
			
			form{
				
				 background: linear-gradient(deepskyblue,skyblue,lightskyblue);
				margin-right:750px;
				padding:50px;
				margin-bottom:0px;
				
					
			}
			
		#input{
			margin-left: 100px;
			margin-top : 50px;
			
		}
		h1{
			margin-bottom: 80px;
			margin-left: 80px;
		}
		 p{
		 	color : green;
		 	margin-top:15px;
		 	margin-left: 80px;	
		 }
		 
		 
		
		
		
			
		</style>

</head>
<body>

		<div class="container">
		<div class="div1">
		
		</div>
		<form action="/login.do" method="post">
		
				<h1>Login...</h1>
		
			<p style ="color:red;">${ error }</p>
			
			<label><h5>USERNAME:</h5></label> &nbsp; &nbsp;
									<input type="text" name="user" id="input1" placeholder="Put your username">  <br> <br>
									
			<label><h5>PASSWORD:</h5></label> &nbsp; &nbsp;
									<input type="password" name="password" id="input2" placeholder="Put your password "> 	<br> <br>
										
			<p>Thank to full the field</p>	
			 
			<input type="submit" value="Login" id="input">
			
			</form>
			
		</div>
		
		
		<script src="webjars/jquery/1.9.1/jquery/jquery.min.js"></script>
	    <script src= "webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body> 
</html>