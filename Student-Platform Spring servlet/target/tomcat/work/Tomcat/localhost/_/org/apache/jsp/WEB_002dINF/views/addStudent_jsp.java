/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-08-20 17:08:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Student Platform</title>\r\n");
      out.write("<link href= \"webjars/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"styleSheet\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<style>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tbody{\r\n");
      out.write("\t\t\t\t\t\t\tbackground: linear-gradient(cornflowerblue,deepskyblue,skyblue);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t.container{\r\n");
      out.write("\t\t\t\t\t\t\tmargin: 300px;\r\n");
      out.write("\t\t\t\t\t\t\tmargin-bottom: 50px;\r\n");
      out.write("\t\t\t\t\t\t\tmargin-top:10px;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tform{\r\n");
      out.write("\t\t\t\t\t\t\tmargin-left: 100px;\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t.input ,select , label{\r\n");
      out.write("\t\t\t\t\t\t\tmargin-bottom: 30px;\r\n");
      out.write("\t\t\t\t\t\t\twidth: 250px;\r\n");
      out.write("\t\t\t\t\t\t\theight: 35px;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t.add{\r\n");
      out.write("\t\t\t\t\t\t\t\tmargin-left:250px;\r\n");
      out.write("\t\t\t\t\t\t\t\tmargin-top: 20px;\r\n");
      out.write("\t\t\t\t\t\t\t\tpadding: 15px;\r\n");
      out.write("\t\t\t\t\t\t\t\tborder-radius: 20px;\r\n");
      out.write("\t\t\t\t\t\t\t\twidth: 250px;\r\n");
      out.write("\t\t\t\t\t\t\t\theight: 55px;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t.add:hover{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbackground-color:green;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tlabel{\r\n");
      out.write("\t\t\t\t\t\t\t\tfont-size: 25px;\r\n");
      out.write("\t\t\t\t\t\t\t\ttext-transform: ;\r\n");
      out.write("\t\t\t\t\t\t\t\tfont-family: time new roman;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\th1{\r\n");
      out.write("\t\t\t\t\t\t\tmargin-left: 250px;\r\n");
      out.write("\t\t\t\t\t\t\tmargin-bottom: 50px;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<h1>You can registe a student</h1>\r\n");
      out.write("\t\t\t<form action=\"/addstudent.do\" method=\"post\" >\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><label>firstName :</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"firstName\" placeholder=\"Enter your firstname\" class=\"input\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><label>lastName :</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"lastName\" placeholder=\"Enter your lastname\" class=\"input\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><label>dateOfBirth :</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"dateOfBirth\"  class=\"input\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><label>registrationDate :</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"registrationDate\"  class=\"input\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><label>trainingDuration :</label>\r\n");
      out.write("\t\t\t\t\t<select>\r\n");
      out.write("\t\t\t\t\t<option>--- chose training duration ---\r\n");
      out.write("\t\t\t\t\t<option> 6 months \r\n");
      out.write("\t\t\t\t\t<option> 12 months\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td><label>studentImage :</label> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"studentImage\" placeholder=\"added the student image\" class=\"input\" ></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t</table>\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"ADD THE STUDENT\" class=\"add\">\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\t\t<script src=\"webjars/jquery/1.9.1/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t\t\t<script src= \"webjars/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
