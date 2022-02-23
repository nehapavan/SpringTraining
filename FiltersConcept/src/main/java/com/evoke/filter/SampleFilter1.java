package com.evoke.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

// * Servlet Filter implementation class SampleFilter1
@WebFilter("/Servlet1")
public class SampleFilter1 extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

//	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		PrintWriter out = response.getWriter();

		out.println("<h2>filter class checked and sends the response</h2>");
		out.println("<h1>welcome");
		out.println("</h1>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equalsIgnoreCase("user1") && password.equalsIgnoreCase("pass")) {
			// pass the request along the filter chain
//			RequestDispatcher reqdispatcher = request.getRequestDispatcher("servlet2");
//			reqdispatcher.forward(request, response);
			chain.doFilter(request, response);
		} else {
			out.println("invalid username and password");
		}
	}
//		if (username.equals("") && password.equals("")) {
//			// pass the request along the filter chain
//			out.println("Error in inputs..! plz try again with valid inputs..");
//		} else {
//			chain.doFilter(request, response);
//		}
//	}

	@Override
	public boolean isLoggable(LogRecord record) {
		// TODO Auto-generated method stub
		return false;
	}

}
