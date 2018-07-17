package com.neusoft.service;

import java.sql.Timestamp;
import java.util.List;

import com.neusoft.bean.Deal;
import com.neusoft.bean.Freelisten;
import com.neusoft.bean.Freelistenbook;
import com.neusoft.bean.Lesson;
import com.neusoft.bean.LessonBranch;
import com.neusoft.bean.MessageLike;

public interface LessonService {
	public List<Lesson> findLessonById(int qid) throws Exception;
	public LessonBranch findLessonBranchById(int lid) throws Exception;
	public List<Freelisten> findFreelistenById(int qid) throws Exception;
	public Lesson findLessonByLid(int parseInt);
	public Freelisten findOneFreelistenById(int id) throws Exception;
	public List<Freelisten> findFewFreelistenById(int qid) throws Exception;
	public void freelistenbook(Freelistenbook freelistenbook) throws Exception;
	public void lessonbook(Deal deal);
}
