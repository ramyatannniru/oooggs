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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.myConnection.MyConnectionFactory;
import com.model.Employee;
/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee.do")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private String name,email,password,country;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
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
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		
		
		
		             name=request.getParameter("name");
		             email=request.getParameter("email");
		             password=request.getParameter("password");
		             country=request.getParameter("country");
			request.setAttribute("SUCCESS", new Employee(name, email, password,country));
			Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
			PreparedStatement pst=connection.prepareStatement("insert into EmployeeData(name,email,password,country,uid) values(?,?,?,?,?)");
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, password);
			pst.setString(4, country);
			pst.setInt(5,Employee.uid++);
			pst.executeUpdate();
			RequestDispatcher  view=request.getRequestDispatcher("data.view");
			view.forward(request, response);
			
		
	}
		
		
	
}
