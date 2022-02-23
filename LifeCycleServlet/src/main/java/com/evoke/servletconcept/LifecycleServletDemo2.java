package com.evoke.servletconcept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LifecycleServletDemo
 */
@WebServlet("/LifecycleServletDemo2")
public class LifecycleServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/* Declaration of the get method */
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		HttpSession session = request.getSession(false);
//		String n = (String) session.getAttribute("uname");
//		out.print("Hello " + n);
		out.close();
	}
}
