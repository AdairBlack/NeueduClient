package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.bean.Address;
import com.neusoft.bean.Enterprise;
import com.neusoft.bean.Message;
import com.neusoft.bean.MessageImg;
import com.neusoft.bean.MessageLike;
import com.neusoft.bean.MessageReply;
import com.neusoft.bean.Swiper;
import com.neusoft.bean.Teacher;

public interface EnterpriseService {
	public Enterprise findEnterpriseById(int qid) throws Exception;
	public List<Address> findAddressById(int qid) throws Exception;
	public List<Message> findMessageById(int qid) throws Exception;
	public List<Teacher> findTeacherById(int qid) throws Exception;
	public List<MessageImg> findMessageImgByMid(int mid) throws Exception;
	public List<MessageLike> findMessageLikeByMid(int mid) throws Exception;
	public List<MessageReply> findMessageReplyByMid(int mid) throws Exception;
	public List<Swiper> findSwiperById(int qid) throws Exception;
	public Address findAddressByLid(int lid) throws Exception;
	public void addlike(MessageLike like) throws Exception;
	public void addcomment(MessageReply comment) throws Exception;
}
