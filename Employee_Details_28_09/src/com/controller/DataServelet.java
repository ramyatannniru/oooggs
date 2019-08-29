package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employee;
import com.myConnection.MyConnectionFactory;

@WebServlet("/data.view")
public class DataServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

			Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
			PreparedStatement pst=connection.prepareStatement("select name,email,password,  country,uid ,id from EmployeeData");
			out.println("<table border=2><tr><td>name</td><td>email</td><td>password</td><td>country</td><td>uid</td><td>edit</td><td>delete</td></tr>");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
			     
				out.println("<tr><td>"+rs.getString(1)+" </td><td> "+ rs.getString(2)+"</td><td> " +rs.getString(3)+" </td><td>"+rs.getString(4)+"</td><td>"+
				rs.getInt(5)+"</td><td><a href=\"editemp.view?id="+rs.getInt(6)+"\">edit</a></td><td><a href=\"delete.view?id="+rs.getInt(6)+"\">delete</a></td></tr>");
			}
	
			out.println("  </table>");
	}

		
	}
