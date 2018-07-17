package com.neusoft.control;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.bean.Enterprise;
import com.neusoft.bean.WXUserInfo;

/**
 * Servlet implementation class GetUserInfo
 */
@Controller
public class GetUserInfo  {
       

    @RequestMapping(value="/GetUserInfo")
	@ResponseBody
	public WXUserInfo GetUserInfo(HttpServletRequest request) {
    	System.out.println("GetUserInfo    ");
    	WXUserInfo wxUserInfo=(WXUserInfo) request.getSession().getAttribute("wxUserInfo");
    	
    	return wxUserInfo;
    }
    
    @RequestMapping(value="/GetUserMsg")
	@ResponseBody
	public String GetUserMsg(HttpServletRequest request) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");

    	String msg=null;
    	if((String)request.getSession().getAttribute("msg")!=null) {
    		 msg=(String)request.getSession().getAttribute("msg");
    		 request.getSession().removeAttribute("msg");
    	}else {
    		msg="null";
    	}
    	
    	return msg;
    }

}
