package com.tony.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

//@WebFilter(servletNames={"servlet3"})
public class AroundFilter implements Filter {

	private ServletContext context ;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		context =filterConfig.getServletContext(); 
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		//PrintWriter writer = ((HttpServletResponse)response).getWriter();
		//writer.println("filter start filtering....");
		chain.doFilter(request, response);
		//writer.println("filter end filtering....");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
