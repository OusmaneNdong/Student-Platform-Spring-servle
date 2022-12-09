<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Platform</title>
<link href= "webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="styleSheet"> 


				<style>
				
						body{
							background: linear-gradient(cornflowerblue,deepskyblue,skyblue);
						}
				
						.container{
							margin: 300px;
							margin-bottom: 50px;
							margin-top:10px;
						}
						
						form{
							margin-left: 100px;
							
						}
						
						.input ,select , label{
							margin-bottom: 30px;
							width: 250px;
							height: 35px;
						}
						.add{
								margin-left:250px;
								margin-top: 20px;
								padding: 15px;
								border-radius: 20px;
								width: 250px;
								height: 55px;
						}
						.add:hover{
									background-color:green;
						}
						label{
								font-size: 25px;
								text-transform: ;
								font-family: time new roman;
						}
						h1{
							margin-left: 250px;
							margin-bottom: 50px;
						}
				
				</style>
</head>
<body>
		
		<div class="container">
		
		<h1>You can registe a student</h1>
			<form action="/addstudent.do" method="post" >
			<table>
			<tr>
				<td><label>firstName :</label>
				<input type="text" name="firstName" placeholder="Enter your firstname" class="input"></td>
			</tr>
			
			<tr>
				<td><label>lastName :</label>
					<input type="text" name="lastName" placeholder="Enter your lastname" class="input"></td>
			</tr>
			
			<tr>
				<td><label>dateOfBirth :</label>
					<input type="date" name="dateOfBirth"  class="input"></td>
			</tr>
			
			<tr>
				<td><label>registrationDate :</label>
					<input type="date" name="registrationDate"  class="input"></td>
			</tr>
			
			<tr>
				<td><label>trainingDuration :</label>
					<select>
					<option>--- chose training duration ---
					<option> 6 months 
					<option> 12 months
					</select></td>
			</tr>
			
			<tr>
				<td><label>studentImage :</label> 
					<input type="text" name="studentImage" placeholder="added the student image" class="input" ></td>
			</tr>
				 
			</table>			
					<input type="submit" value="ADD THE STUDENT" class="add">	
			</form>
		</div>	
			<script src="webjars/jquery/1.9.1/jquery/jquery.min.js"></script>
			<script src= "webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>