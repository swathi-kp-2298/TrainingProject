package com.infinite.servletTest1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalsServlet
 */
public class CalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	int Fnum,Snum,result;
	Fnum=Integer.parseInt(request.getParameter("Fnum"));
	Snum=Integer.parseInt(request.getParameter("Snum"));
	result=Fnum+Snum;
	PrintWriter out=response.getWriter();
	out.println("sum is"+result+"<br/>");
	result=Fnum-Snum;
	out.println("sub is"+result+"<br/>");
	result=Fnum*Snum;
	out.println("multi is"+result+"<br/>");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
