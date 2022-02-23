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
@WebServlet("/LifecycleServletDemo")
public class LifecycleServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config = null;

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	public LifecycleServletDemo() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.println("<h2>welcome to life cycle servlet concept :)</h2>");
//		HttpSession session = request.getSession(); // Creating a new session
//
//		session.setAttribute("uname", username);
//
//		out.print("<a href='servlet2'>visitwebsite</a>"); // Link to the second servlet

	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
	@Override
	public void destroy() {
		System.out.println("in destroy");
	}
}
