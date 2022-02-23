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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig config = null;

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	public LoginServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("login.html").include(request, response);

		String username = request.getParameter("username"); // Fetching the contents of the userName field from the form
		String password = request.getParameter("password");
		out.print("Welcome " + username); // Printing the username
		if (password.equals("neha1234")) {

			HttpSession session = request.getSession(); // Creating a new session

			session.setAttribute("username: ", username);
		}

		else {
			out.print("Invalid username or password!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
	@Override
	public void destroy() {
		System.out.println(" destroyed");
	}
}
