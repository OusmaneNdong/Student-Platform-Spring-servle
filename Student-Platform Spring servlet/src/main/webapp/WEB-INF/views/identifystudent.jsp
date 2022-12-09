<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href= "webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="styleSheet"> 

						<style>
						
						
							.container{
									
							}
							.card{
									margin : 300px;
									margin-top : 60px;
									border : 10px solid ;
									margin-left: 420px;
									background-color:;
									 background: radial-gradient(white,skyblue);
									
							}
							.card-body{
									margin-top:30px;
							}
							img{
								margin-left:50px;
								}
								
							span{
									font-family: arial black;
									font-size: 25px;
								}
								
							h1{
									font-family: arial black;
									font-size: 35px;
									margin-bottom: 35px;
									margin-left: 10px;
									color: blue; 
								}
						
						</style>
</head>
<body>
			
				<div class="container">
				
						<div class="card">
						
					<h1>ID CARTE STUDENT</h1>
							<div class="card-header">
								<img alt="" src="${ identifies.studentImage }">
							</div>
							
							<div class="card-body">
							<ul>
								<li>
								<h4> FullName : <span>${ identifies.firstName } ${ identifies.lastName }</span></h4>
								</li>
								<li>
								<h4> DateOfBirth : <span>${ identifies.dateOfBirth }</span></h4>
								</li>
								<li>
								<h4> RegistrationDate : <span>${ identifies.registrationDate }</span></h4>
								</li>
								<li>
								<h4>TrainingDuration : <span>${ identifies.trainingDuration }</span></h4>
								</li>
							</ul>
							</div>
						
						</div>
				
				</div>
			
s			<script src="webjars/jquery/1.9.1/jquery/jquery.min.js"></script>
			<script src= "webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>