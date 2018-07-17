package com.neusoft.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DeleteUser {

	
	    @RequestMapping(value="/DeleteUser")
		@ResponseBody
		public String DeleteUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    	System.out.println("DeleteUser    ");
	    	
	    	HttpSession session=request.getSession();

	    	session.removeAttribute("isLoginOK");
	    	session.removeAttribute("msg");
	    	session.removeAttribute("User");
	    	
	    	session.invalidate();
	    
	    	return "success";
	    	
	    }
}
