package com.neusoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.bean.WXOauth2Token;
import com.neusoft.bean.WXUserInfo;
import com.neusoft.tools.Oauth2Access;

/**
 * Servlet implementation class GetCodeServlet
 */
@WebServlet("/GetCodeServlet")
public class GetCodeServlet extends HttpServlet {
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("get  coed");
//		String code = request.getParameter("code");
//		response.setContentType("text/plain");
//		PrintWriter out = response.getWriter();
//		out.write("{\"code\":\""+code+"\"}");
//		out.flush();
//		out.close();
		
		//不允许浏览器端或缓存服务器缓存当前页面信息。
	    response.setHeader("Pragma", "No-cache");
	    //浏览器和缓存服务器都不应该缓存页面信息
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0);
		
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//不允许浏览器端或缓存服务器缓存当前页面信息。
	    response.setHeader("Pragma", "No-cache");
	    //浏览器和缓存服务器都不应该缓存页面信息
	    response.setHeader("Cache-Control", "no-cache");
	    response.setDateHeader("Expires", 0);
	    
		process(request,response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//System.out.println("get  coed");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String qid="1";
		
		//用户同意登陆
		String code = request.getParameter("code");
		WXUserInfo wxUserInfo=new WXUserInfo();
		
		HttpSession session=request.getSession(true);
		
//		response.setContentType("text/plain");
//		PrintWriter out = response.getWriter();
//		out.write("{\"code\":\""+code+"\"}");
//		out.flush();
//		out.close();
		
		//
		if(!"authdeny".equals(code)) {

			WXOauth2Token weixinOuath2Token= Oauth2Access.getOauth2AccessToken("wx32abea7cb943df3a", "f48b257fea57c89d1755fbd998650804", code);
			
			//获取凭证&用户标识
			String openId=weixinOuath2Token.getOpenId();
			String accessToken=weixinOuath2Token.getAccessToken();
			
			
			wxUserInfo = Oauth2Access.getWXUserInfo(accessToken, openId);
			
			session.setMaxInactiveInterval(30);
			
			Object user="user";
			
			session.setAttribute("wxUserInfo", wxUserInfo);
			
			session.setAttribute("isLoginOK", true);
			
			session.setAttribute("User", user);
			
		
			
		}else {
			session.setAttribute("isLoginOK", false);
		}
		response.sendRedirect(request.getContextPath()+"/index.html?qid="+qid);
	}
	


}
