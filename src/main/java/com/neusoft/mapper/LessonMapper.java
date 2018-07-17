package com.neusoft.mapper;

import java.util.List;

import com.neusoft.bean.Deal;
import com.neusoft.bean.Freelisten;
import com.neusoft.bean.Freelistenbook;
import com.neusoft.bean.Lesson;
import com.neusoft.bean.LessonBranch;

public interface LessonMapper {
	public List<Lesson> findLessonById(int qid);
	public LessonBranch findLessonBranchById(int lid) throws Exception;
	public List<Freelisten> findFreelistenById(int qid) throws Exception;
	public Lesson findLessonByLid(int lid);
	public Freelisten findOneFreelistenById(int id) throws Exception;
	public List<Freelisten> findFewFreelistenById(int qid) throws Exception;
	public void freelistenbook(Freelistenbook freelistenbook) throws Exception;
	public void lessonbook(Deal deal);
}
