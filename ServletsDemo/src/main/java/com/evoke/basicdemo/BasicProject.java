package com.evoke.basicdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@SuppressWarnings("serial")
@WebServlet("/welcomemessage")
public class BasicProject extends HttpServlet {

//	private static final long serialVersionUID = -4943466003380227328L;

	private static final long serialVersionUID = 1L;
	private String message;
//	private String hint;

	public void init() throws ServletException {
		// required initialization
//		message = "Welcome to basic servlet concepts";
		
//		hint = "This is basic program of servlet";
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// set server response content type
		// resp.setContentType(getServletInfo());
		String str=req.getParameter("user");
		resp.setContentType("html");
		// logic goes here
		PrintWriter out = resp.getWriter();
		//generating html content
		out.println("<h1>"+message+"</h1>");
//		out.println("<h4>"+hint+"</h4>");
		out.println("<hr>");
		out.print(str);
		
		out.println("Time on the server is :" + new java.util.Date());
	}

	public void distroy() {
		// do nothing
	}
}
