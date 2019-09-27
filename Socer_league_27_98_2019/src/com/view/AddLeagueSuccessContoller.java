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
@WebServlet("/add_Controller.do")
public class AddLeagueSuccessContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String season,title,year;
	private int iYear;
    private List<String> errMsgs; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddLeagueSuccessContoller() {
        super();
        // TODO Auto-generated constructor stub
    }

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
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		errMsgs=new LinkedList<String>();
		season=request.getParameter("season");
		if(season.equals("Unknown"))
		{
			errMsgs.add("please select a valid season.");
		}
		
		year=request.getParameter("year");
		try {
			iYear=Integer.parseInt(year);
			
		} catch (Exception e) {
			// TODO: handle exception
			errMsgs.add("year must be numeric");
		}
		
		
		title=request.getParameter("title");
		if(title.toString().length()<5)
		{
			errMsgs.add("title is too short.");
		}
		
		if(errMsgs.isEmpty())
		{
			request.setAttribute("SUCCESS", null);
			
			RequestDispatcher  view=request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
		}
		else {
			request.setAttribute("ERROR", errMsgs);
			RequestDispatcher view=request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
		}
		
	}


}

