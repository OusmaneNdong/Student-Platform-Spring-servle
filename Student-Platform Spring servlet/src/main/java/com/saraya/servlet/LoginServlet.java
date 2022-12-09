package com.saraya.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.Student;
import com.saraya.service.StudentService;
import com.saraya.service.UserValidation;

@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {
	
	UserValidation valid = new UserValidation();
	StudentService std = new StudentService();
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
				
			String name = request.getParameter("user");
			String pass = request.getParameter("password");
			
			if(valid.isValid(name, pass)) {
				request.getSession().setAttribute("name", name);
				response.sendRedirect("/cem.do");
	//			response.sendRedirect("/identify.do");
			}else {
				request.setAttribute("error", "check-in your address or password");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
			}
	}
	

}
