package com.neusoft.control;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.bean.Address;
import com.neusoft.bean.Enterprise;
import com.neusoft.bean.Message;
import com.neusoft.bean.MessageImg;
import com.neusoft.bean.MessageLike;
import com.neusoft.bean.MessageReply;
import com.neusoft.bean.Swiper;
import com.neusoft.bean.Teacher;
import com.neusoft.service.EnterpriseService;

@Controller
public class EnterpriseHandler {

	@Autowired
	private EnterpriseService enterpriseService;
	
	//enterprise
	@RequestMapping(value="/enterprise/EnterpriseHandler_findEnterpriseById")
	@ResponseBody
	public Enterprise findEnterpriseById(HttpServletRequest request){
		System.out.println("......EnterpriseHandler......findEnterpriseById()..........");
		Enterprise enterprise = null;
		
		try {
			String ID=request.getParameter("qid");
			//System.out.println(request.getParameter("qid"));
			System.out.println(ID);
			enterprise = enterpriseService.findEnterpriseById(Integer.parseInt(request.getParameter("qid")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return enterprise;
	}
	
	//position
	@RequestMapping(value="/enterprise/EnterpriseHandler_findAddressById")
	@ResponseBody
	public List<Address> findAddressById(HttpServletRequest request) {
		System.out.println("......EnterpriseHandler.....findAddressById()...");
		List<Address> address = null;
		 
		try {
			address= enterpriseService.findAddressById(Integer.parseInt(request.getParameter("qid")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return address;
	}
	
	//freelisten/ lesson
	@RequestMapping(value="/enterprise/EnterpriseHandler_findAddressByLid")
	@ResponseBody
	public Address findAddressByLid(HttpServletRequest request) {
		System.out.println("......EnterpriseHandler.....findAddressByLid()...");
		Address address = null;
		 
		try {
			address= enterpriseService.findAddressByLid(Integer.parseInt(request.getParameter("lid")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return address;
	}
	
	//teacher
	@RequestMapping(value="/enterprise/TeacherHandler_findTeacherById")
	@ResponseBody
	public List<Teacher> findTeacherById(HttpServletRequest request) {
		System.out.println("......EnterpriseHandler......findTeacherById()..........");
		List<Teacher> teacher = null;
		
		try {
			
			teacher = enterpriseService.findTeacherById(Integer.parseInt(request.getParameter("qid")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return teacher;
	}
	
	
	//discover
	@RequestMapping(value="/enterprise/EnterpriseHandler_findMessageById")
	@ResponseBody
	public List<Message> findMessageById(HttpServletRequest request){
		System.out.println("......EnterpriseHandler.....findMessageById()...");
		List<Message> message = null;
		
		try {
			message = enterpriseService.findMessageById(Integer.parseInt(request.getParameter("qid")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return message;
	}
	
	//discover
	@RequestMapping(value="/enterprise/EnterpriseHandler_findMessageImgByMid")
	@ResponseBody
	public List<MessageImg> findMessageImgByMid(HttpServletRequest request){
		System.out.println("......EnterpriseHandler.....findMessageImgByMid()...");
		List<MessageImg> img = null;
		
		try {
			img = enterpriseService.findMessageImgByMid(Integer.parseInt(request.getParameter("mid")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return img;
	}
	
	//discover
	@RequestMapping(value="/enterprise/EnterpriseHandler_findMessageLikeByMid")
	@ResponseBody
	public List<MessageLike> findMessageLikeByMid(HttpServletRequest request){
		System.out.println("......EnterpriseHandler.....findMessageLikeByMid...");
		List<MessageLike> like = null;
		
		try {
			like= enterpriseService.findMessageLikeByMid(Integer.parseInt(request.getParameter("mid")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return like;
	}
	
	//discover
	@RequestMapping(value="/enterprise/EnterpriseHandler_findMessageReplyByMid")
	@ResponseBody
	public List<MessageReply> findMessageReplyByMid(HttpServletRequest request){
		System.out.println("......EnterpriseHandler.....findMessageReplyByMid...");
		List<MessageReply> reply = null;
		
		try {
			reply= enterpriseService.findMessageReplyByMid(Integer.parseInt(request.getParameter("mid")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return reply;
	}
	
	@RequestMapping(value="/enterprise/EnterpriseHandler_findSwiperById")
	@ResponseBody
	public List<Swiper> findSwiperById(HttpServletRequest request){
		System.out.println("......EnterpriseHandler.....findSwiperById...");
		List<Swiper> swiper = null;
		
		try {
			swiper= enterpriseService.findSwiperById(Integer.parseInt(request.getParameter("qid")));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return swiper;
	}
	
	@RequestMapping(value="/enterprise/EnterpriseHandler_addlike")
	@ResponseBody
	public Integer addlike(HttpServletRequest request){
		System.out.println("......EnterpriseHandler.....addlike...");
		int id=0;
		
		try {
			int mid=Integer.parseInt(request.getParameter("mid"));
			String nickname=request.getParameter("nickname");
			Timestamp stime=Timestamp.valueOf(request.getParameter("stime"));
			
			MessageLike like=new MessageLike(mid,nickname,stime);
			
		    enterpriseService.addlike(like);
		    id=like.getId();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	@RequestMapping(value="/enterprise/EnterpriseHandler_addComment")
	@ResponseBody
	public Integer addComment(HttpServletRequest request){
		System.out.println("......EnterpriseHandler.....addComment...");
		int id=0;
		
		try {
			int mid=Integer.parseInt(request.getParameter("mid"));
			String content=request.getParameter("content");
			String nickname=request.getParameter("nickname");
			Timestamp stime=Timestamp.valueOf(request.getParameter("stime"));
			
			MessageReply comment=new MessageReply(mid,content,nickname,stime);
			
		    enterpriseService.addcomment(comment);
		    id=comment.getId();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
}
