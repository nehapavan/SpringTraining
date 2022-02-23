package com.evoke.sessionconcept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config = null;

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	public LogoutServlet() {
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Declaration of the get method
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("logout.html").include(request, response);

		HttpSession session = request.getSession(false); // if we keep false it wont create a new session bcz session
		session.invalidate();
		out.print("You are successfully logged out!");
		// already exists
		out.close();

	}

	@Override
	public void destroy() {
		System.out.println(" destroyed");
	}
}
