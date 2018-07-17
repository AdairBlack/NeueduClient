package com.neusoft.control;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
//import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.bean.Deal;
import com.neusoft.bean.Freelisten;
import com.neusoft.bean.Freelistenbook;
import com.neusoft.bean.Lesson;
import com.neusoft.bean.LessonBranch;
import com.neusoft.service.LessonService;

@Controller
public class LessonHandler {

	@Autowired
	private LessonService lessonService;
	
	
	@RequestMapping(value="/lesson/LessonHandler_findLessonById")
	@ResponseBody
	public List<Lesson> findLessonById(HttpServletRequest request) {
		System.out.println("......LessonHandler......findLessonById()..........");
		List<Lesson> lesson = null;
		
		try {
			
			lesson = lessonService.findLessonById(Integer.parseInt(request.getParameter("qid")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lesson;
	}
	
	@RequestMapping(value="/lesson/LessonHandler_findLessonByLid")
	@ResponseBody
	public Lesson findLessonByLid(HttpServletRequest request) {
		System.out.println("......LessonHandler......findLessonByLid()..........");
		Lesson lesson = null;
		
		try {
			
			lesson = lessonService.findLessonByLid(Integer.parseInt(request.getParameter("lid")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return lesson;
	}
	
	
	@RequestMapping(value="/lesson/LessonBranchHandler_findLessonBranchById")
	@ResponseBody
	public LessonBranch findLessonBranchById(HttpServletRequest request) {
		System.out.println("......LessonbranchHandler......findLessonBranchById()..........");
		LessonBranch branchid = null;
		
		try {
			
			branchid = lessonService.findLessonBranchById(Integer.parseInt(request.getParameter("lid")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return branchid;
	}
	
	
	@RequestMapping(value="/lesson/LessonHandler_findFreelistenById")
	@ResponseBody
	public List<Freelisten> findFreelistenById(HttpServletRequest request) {
		System.out.println("......LessonHandler......findFreelistenById()..........");
		List<Freelisten> freelisten = null;
		
		try {
			
			freelisten = lessonService.findFreelistenById(Integer.parseInt(request.getParameter("qid")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return freelisten;
	}
	
	@RequestMapping(value="/lesson/LessonHandler_findFewFreelistenById")
	@ResponseBody
	public List<Freelisten> findFewFreelistenById(HttpServletRequest request) {
		System.out.println("......LessonHandler......findFewFreelistenById()..........");
		List<Freelisten> freelisten = null;
		
		try {
			
			freelisten = lessonService.findFewFreelistenById(Integer.parseInt(request.getParameter("qid")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return freelisten;
	}
	
	@RequestMapping(value="/lesson/LessonHandler_findOneFreelistenById")
	@ResponseBody
	public Freelisten findOneFreelistenById(HttpServletRequest request) {
		System.out.println("......LessonHandler......findOneFreelistenById()..........");
		Freelisten freelisten = null;
		
		try {
			
			freelisten = lessonService.findOneFreelistenById(Integer.parseInt(request.getParameter("id")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return freelisten;
	}
	
	@RequestMapping(value="/lesson/LessonHandler_freelistenbook")
	@ResponseBody
	public int freelistenbook(HttpServletRequest request) {
		System.out.println("......LessonHandler......freelistenbook()..........");
		Freelisten freelisten = null;
		int index=0;
		
		try {
			int fid=Integer.parseInt(request.getParameter("fid"));
		    String username=request.getParameter("username");
		    String tel=request.getParameter("tel");
		    Timestamp booktime=Timestamp.valueOf(request.getParameter("booktime"));
		    String status=request.getParameter("status");
		    String comment=request.getParameter("comment");
		    String openid=request.getParameter("openid");
		    
		    Freelistenbook freelistenbook=new Freelistenbook(fid,username,tel,booktime,status,comment,openid);
		    
			lessonService.freelistenbook(freelistenbook);
			
			index=freelistenbook.getId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return index;
	}
	
	@RequestMapping(value="/lesson/LessonHandler_lessonbook")
	@ResponseBody
	public int lessonbook(HttpServletRequest request) {
		System.out.println("......LessonbranchHandler......lessonbook()..........");
		int index=0;
		try {
			int lid=Integer.parseInt(request.getParameter("lid"));
			System.out.println(lid);
			String openid=request.getParameter("openid");
			double total=Double.parseDouble(request.getParameter("total"));
			double actual=Double.parseDouble(request.getParameter("actual"));
			String status=request.getParameter("status");
			Timestamp ordertime=Timestamp.valueOf(request.getParameter("ordertime"));
			int qid=Integer.parseInt(request.getParameter("qid"));
			String transactionid=request.getParameter("transactionid");
			String nickname=request.getParameter("nickname");
			String tel=request.getParameter("tel");
			int branchid=Integer.parseInt(request.getParameter("branchid"));
			Deal deal=new Deal(lid,openid,total,actual,status,ordertime,qid,transactionid,nickname,tel,branchid);
			lessonService.lessonbook(deal);
			
		    index=deal.getOid();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return index;
	}
	

}
