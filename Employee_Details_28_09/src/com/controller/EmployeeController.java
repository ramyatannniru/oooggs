package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myConnection.MyConnectionFactory;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet(
		urlPatterns = { "/EmployeeController.view" }, 
		initParams = { 
				@WebInitParam(name = "country-list", value = "india,us,uk,other")
		})
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	  @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	  * */
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,SQLException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html><body>");
		
		@SuppressWarnings("unchecked")
		List<String> err=(List<String>) request.getAttribute("ERROR");
		
		out.println("<h>Employee details</h1>");
		out.println("<form action='AddEmployee.do' method='post'>");
		
		out.println("name<input type='text' name='name'><br/>");
		out.println("email<input type='email' name='email'><br/>");
		out.println("password<input type='password' name='password'><br/>");
		String sList=getServletConfig().getInitParameter("country-list");
		String arrSList[]=sList.split(",");
		out.println("<select name='country'><option value='select'>select</option>");
		for(String str:arrSList)
		{
			out.println("<option value='"+str+"'"+">"+str+"</option>");
		}
		
		out.println("</select><br/><input type='submit' value='enter'></form></body></html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
