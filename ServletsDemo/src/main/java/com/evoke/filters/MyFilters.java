package com.evoke.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//  Servlet Filter implementation class MyFilters

@WebFilter("/addFilters")
public class MyFilters implements Filter {

	private static final long serialVersionUID = 1L;
	String message = "Filters in sample filer concept";

//     * @see HttpFilter#HttpFilter()
	public MyFilters() {

	}

//	 * @see Filter#destroy()
	public void destroy() {

	}

//	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		PrintWriter out = response.getWriter();
		// generating html content
		out.println("<h1>" + message + "</h1>");
		chain.doFilter(request, response);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

//	 * @see Filter#init(FilterConfig)
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
