package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.bean.Deal;
import com.neusoft.bean.Freelisten;
import com.neusoft.bean.Freelistenbook;
import com.neusoft.bean.Lesson;
import com.neusoft.bean.LessonBranch;
import com.neusoft.mapper.LessonMapper;
import com.neusoft.service.LessonService;

@Service
public class LessonServiceImpl implements LessonService {
	
	@Autowired
	private LessonMapper lessonMapper;

	@Override
	public List<Lesson> findLessonById(int qid) throws Exception{
		System.out.println("......LessonServiceImpl......findLessonById......");
		List<Lesson> lesson = null;
		
		lesson = lessonMapper.findLessonById(qid);
		
		return lesson;
	}

	@Override
	public LessonBranch findLessonBranchById(int lid) throws Exception {
		System.out.println("......LessonServiceImpl......findLessonById......");
		LessonBranch branchid = null;
		
		branchid = lessonMapper.findLessonBranchById(lid);
		
		return branchid;
	}
	
	@Override
	public List<Freelisten> findFreelistenById(int qid) throws Exception {
		System.out.println("......LessonServiceImpl......findFreelistenById......");
		List<Freelisten> freelisten = null;
		
		freelisten = lessonMapper.findFreelistenById(qid);
		
		return freelisten;
	}
	
	@Override
	public Lesson findLessonByLid(int lid){
		System.out.println("......LessonServiceImpl......findLessonBylId......");
		Lesson lesson = null;
		
		lesson = lessonMapper.findLessonByLid(lid);
		
		return lesson;
	}
	
	@Override
	public Freelisten findOneFreelistenById(int id) throws Exception {
		System.out.println("......LessonServiceImpl......findOneFreelistenById......");
		Freelisten freelisten = null;
		
		freelisten = lessonMapper.findOneFreelistenById(id);
		
		return freelisten;
	}

	@Override
	public List<Freelisten> findFewFreelistenById(int qid) throws Exception {
		System.out.println("......LessonServiceImpl......findFewFreelistenById......");
		List<Freelisten> freelisten = null;
		
		freelisten = lessonMapper.findFewFreelistenById(qid);
		
		return freelisten;
	}

	@Override
	public void freelistenbook(Freelistenbook freelistenbook) throws Exception {
		System.out.println("......LessonServiceImpl......freelistenbook......");
		lessonMapper.freelistenbook(freelistenbook);
	}
	
	@Override
	public void lessonbook(Deal deal) {
		// TODO Auto-generated method stub
		System.out.println("......LessonServiceImpl......lessonbook......");
		
		lessonMapper.lessonbook(deal);
	}

}
