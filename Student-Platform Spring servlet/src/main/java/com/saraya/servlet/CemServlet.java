package com.saraya.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.Student;
import com.saraya.service.StudentService;



@WebServlet(urlPatterns = "/cem.do")

public class CemServlet extends HttpServlet{

		StudentService service = new StudentService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.setAttribute("student", service.allStudent());
			request.getRequestDispatcher("WEB-INF/views/student.jsp").forward(request, response);
	}
	
	
	

}
