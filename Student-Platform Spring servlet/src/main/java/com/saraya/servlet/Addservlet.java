package com.saraya.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.service.StudentService;

@WebServlet(urlPatterns = "/addstudent.do")

	public class Addservlet extends HttpServlet{


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		request.getRequestDispatcher("WEB-INF/views/addStudent.jsp").forward(request, response);
}
	
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		StudentService service = new StudentService();
		
		String firstName = request.getParameter("firstName");
		
		String lastName = request.getParameter("lastName");
		
	//	LocalDate dateOfBirth = (LocalDate) request.getAttribute("dateOfBirth");
		
		LocalDate dateOfBirth = (LocalDate.parse(request.getParameter("dateOfBirth")));
		
		LocalDate registrationDate = (LocalDate.parse(request.getParameter("registrationDate")));
		
		String trainingDuration = request.getParameter("trainingDuration");
		
		//LocalDate registrationDate = (LocalDate) request.getAttribute("registrationDate");
		
		String studentImage = request.getParameter("studentImage");
		
		service.addStudents(firstName, lastName, dateOfBirth, trainingDuration, registrationDate, studentImage);
		
		response.sendRedirect("/cem.do");
		
		
		
	}


}
