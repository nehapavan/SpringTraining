package com.evoke.basicdemo;

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

@WebFilter("/welcomemessage")
public class SampleFilter implements Filter {


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// generating html content
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String str=req.getParameter("user");
		
		PrintWriter out = resp.getWriter();
		//generating html content
		out.println("Filters in sample filer concept");
		chain.doFilter(request, response);

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}
	public void destroy() {

	}
}
