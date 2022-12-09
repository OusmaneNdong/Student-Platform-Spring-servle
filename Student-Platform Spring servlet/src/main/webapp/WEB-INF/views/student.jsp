<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Plaform</title>
<link href= "webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="styleSheet"> 


			<style type="text/css">
					
						.container{
							margin-top: 10px;
						}
						h1{
							margin-bottom: 50px;
							margin-left: 300px;
							text-decoration: underline;
							font-family: arial black; 
						}
						p{
							float : right;	
							margin-right: 120px;
							background-color: gainsboro;
							padding : 8px;
							border-radius : 20px;
							margin-top:15px;		
							border: 2px solid;					
						}
						p:hover{
							
							background-color: red;
							
						}
						
						.add{
							
							margin-left: 970px;
							margin-top: 15px;
							border-radius: 20px;
							padding : 8px;
						}
						
						button:hover{
									background-color: green;	
									color: white;							
						}
						
						
						#delete{
							background-color: gainsboro;
							border-radius: 20px;
							padding : 8px;
							color: black;
						}
						#delete:hover{
								background-color: red;
						}
						a:hover{
								color: white;
						}
						
						img{
								height: 40px;
								width: 50px;
								border-radius: 15px;
							}
						th, td{
								margin-top : 25px
						}						
			</style>
</head>
<body>


		<div class="button">
				<button type="submit" class="add"><a href="/addstudent.do">AddStudent</a></button> 
				<p><a href="/login.do">LogOut</a>
		</div>
						
								
		<div class="container">
		
					<h1>ALL STUDENTS REGISTE </h1>
		<form action="/cem.do" method="post">
			<table class="table table">
					<thead>
						<tr>
							<th>id</th>
							<th>StudentImage</th>
							<th>FirstName</th>
							<th>LastName</th>
							<th>DateOfBirth</th>
							<th>RegistrationDate</th>
							<th>TrainingDuration</th>
							<th>Delete</th>
						</tr>
					</thead>
			<c:forEach items="${ student }" var="school">
						<tr>
							<td>${ school.id }</td>
							<td><a href="/identify.do?id=${ school.id }"><img alt="" src="${ school.studentImage }"></a></td>
							<td>${ school.firstName }</td>
							<td>${ school.lastName }</td>
							<td>${ school.dateOfBirth }</td>
							<td>${ school.trainingDuration }</td>
							<td>${ school.registrationDate }</td>
							<td><a href="/delete.do?id=${ school.id }" id="delete">Delete</a></td>
						</tr>
			</c:forEach>		
			</table>
			</form>
			</div>
			
			
			
			<br> <br>
			
			
			
						
			<script src="webjars/jquery/1.9.1/jquery/jquery.min.js"></script>
		   <script src= "webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>	
	
</body>
</html>