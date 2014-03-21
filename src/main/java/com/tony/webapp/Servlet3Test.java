package com.tony.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(name="servlet3", urlPatterns={"/HelloWorld"})
public class Servlet3Test extends HttpServlet {

	private static final long serialVersionUID = -3755529504568730481L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			/*PrintWriter writer = resp.getWriter();
			writer.println("redirect you to google.com");*/
			
			req.setAttribute("age", 19);
			RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/helloworld.jsp");
			dispatcher.forward(req, resp);
			
	    }
}
