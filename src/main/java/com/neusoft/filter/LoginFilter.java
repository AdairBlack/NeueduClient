package com.neusoft.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter("/loginFilter")
public class LoginFilter implements Filter {


	/**
	 * @see Filter#destroy()
	 */
    @Override
	public void destroy() {
		System.out.println("..LoginFilter..destroy()..");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
    @Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	System.out.println("..LoginFilter..doFilter()..");
    	
    	HttpSession session=((HttpServletRequest)request).getSession(false);
    	boolean isLoginOK=false;
    	if(session==null) {
    		isLoginOK=false;
    	}else if(session.getAttribute("isLoginOK")!=null) {
		    isLoginOK=Boolean.parseBoolean(session.getAttribute("isLoginOK")+"");
    	}
		if(isLoginOK){
			chain.doFilter(request, response);
		}else {
			((HttpServletRequest)request).getSession().setAttribute("msg","please log in Wechat");
			((HttpServletResponse)response).sendRedirect(((HttpServletRequest)request).getContextPath()+"/userlogin.html");
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("..LoginFilter..init()..");
	}

}
