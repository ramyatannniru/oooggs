package com.entity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;

import com.entity.*;

public class MyServlet extends HttpServlet {
private CdDetailsDaoimpl dao;
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		dao=new CdDetailsDaoimpl();
		
		
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doProcess(req, resp);
	
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("I am at controller.do");
		
		HttpSession session=req.getSession();
CdDetails tempInstructor=(CdDetails)session.getAttribute("I");
		
		dao.createcd(tempInstructor);
		RequestDispatcher view=req.getRequestDispatcher("success.jsp");
		view.include(req, resp);
		
		
	}

}
