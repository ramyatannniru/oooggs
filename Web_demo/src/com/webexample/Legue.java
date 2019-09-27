package com.webexample;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Legue
 */
@WebServlet("/Legue.view")
public class Legue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @param string2 
     * @param i 
     * @param string 
     * @see HttpServlet#HttpServlet()
     */
    public Legue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<ListLegue> list=new ArrayList<ListLegue>();
		list.add(new ListLegue("Soccer League",2009,"Summer"));
		list.add(new ListLegue("Swiming League",2019,"Summer"));
		list.add(new ListLegue("Basket Ball League",2009,"Autumn"));
		list.add(new ListLegue("Beach Volley",2015,"Winter"));
		out.println("<table><tr><td>Title</td><td>Year</td><td>Season</td></tr>");
		for(ListLegue l:list)
		{
			out.println("<tr><td>"+"</td><td>"+l.getLeagueSeason()+
					"</td><td>"+l.getLeagueSeason()+"</td></tr>");
		}
		out.println("</table>");
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request,response);
	}

}
