package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.myConnection.MyConnectionFactory;
import com.model.Employee;

/**
 * Servlet implementation class EditEmployee
 */
@WebServlet(
		urlPatterns = {"/editemp.view" }, 
		initParams = { 
				@WebInitParam(name = "country-list", value = "india,usa,uk,other")
		})
public class EditEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
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
    	int id=Integer.parseInt(request.getParameter("id"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		out.println("<html><body>");

		Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
		PreparedStatement pst=connection.prepareStatement("select name,email,password,  country from EmployeeData where id=?");
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
		  

	
			out.println("<form action=\"edit.do?id="+id+"\" method='post'>");
		
		out.println("name<input type='text' name='name'value='"+rs.getString(1)+"'><br/>");
		out.println("email<input type='email' name='email'value='"+rs.getString(2)+"'><br/>");
		out.println("password<input type='password' name='password'value='"+rs.getString(3)+"'><br/>");
		
		String sList=getServletConfig().getInitParameter("country-list");
		String arrSList[]=sList.split(",");
		out.println("<select name='country'><option value='"+rs.getString("country")+"'>"+rs.getString("country")+"</option>");
		for(String str:arrSList)
		{
			out.println("<option value='"+str+"'"+">"+str+"</option>");
		}
		}
		
		out.println("</select><br/><input type='submit' value='add'></form></body></html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
