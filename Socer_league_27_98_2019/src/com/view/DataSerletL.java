package com.view;
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


import com.myFactory.MyConnectionFactory;
import com.model.League;
@WebServlet("/DataSerletL.view")
public class DataSerletL extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String season,title,year;
	private int iYear;
    private List<String> errMsgs;   
    
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
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

			Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
			PreparedStatement pst=connection.prepareStatement("select title,season,year from league");
			out.println("<table border=2><tr><td>title</td><td>sesson</td><td>year</td></tr>");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
			     
				out.println("<tr><td>"+rs.getString(1)+" </td><td> "+ rs.getString(2)+"</td><td> " +rs.getInt(3));
				out.println(" </td></tr> </table>");
			}
			out.println("  </table>");
	}
		
		


}