package com.neusoft.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.bean.Address;
import com.neusoft.bean.Enterprise;
import com.neusoft.bean.Message;
import com.neusoft.bean.MessageImg;
import com.neusoft.bean.MessageLike;
import com.neusoft.bean.MessageReply;
import com.neusoft.bean.Swiper;
import com.neusoft.bean.Teacher;
import com.neusoft.mapper.EnterpriseMapper;
import com.neusoft.mybatis.SqlSessionUtil;
import com.neusoft.service.EnterpriseService;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

	@Autowired
	private EnterpriseMapper enterpriseMapper;

	@Override
	public Enterprise findEnterpriseById(int qid) throws Exception {
		System.out.println("......EnterpriseServiceImpl......findEnterpriseById......");
		Enterprise enterprise = null;
		
		enterprise = enterpriseMapper.findEnterpriseById(qid);
		
		return enterprise;
	}

	@Override
	public List<Address> findAddressById(int qid) throws Exception {
		System.out.println("......EnterpriseServiceImplement......findAddressById......");
		List<Address> address = null;
		
		address = enterpriseMapper.findAddressById(qid);
		return address;
	}
	
	@Override
	public List<Teacher> findTeacherById(int qid) throws Exception{
		System.out.println("......TeacherServiceImpl......findTeacherById......");
		List<Teacher> teacher = null;
		
		teacher = enterpriseMapper.findTeacherById(qid);
		
		return teacher;
	}

	@Override
	public List<Message> findMessageById(int qid) throws Exception {
		System.out.println("......EnterpriseServiceImplement......findMessageById......");
		List<Message> message = null;
		
		message = enterpriseMapper.findMessageById(qid);
		return message;
	}

	@Override
	public List<MessageImg> findMessageImgByMid(int mid) throws Exception {
		System.out.println("......EnterpriseServiceImplement......findMessageImgByMid......");
		List<MessageImg> img = null;
		
		img = enterpriseMapper.findMessageImgByMid(mid);
		return img;
	}

	@Override
	public List<MessageLike> findMessageLikeByMid(int mid) throws Exception {
		System.out.println("......EnterpriseServiceImplement......findMessageLikeByMid......");
		List<MessageLike> like = null;
		
		like = enterpriseMapper.findMessageLikeByMid(mid);
		return like;
	}

	@Override
	public List<MessageReply> findMessageReplyByMid(int mid) throws Exception {
		System.out.println("......EnterpriseServiceImplement......findMessageReplyByMid......");
		List<MessageReply> reply = null;
		
		reply = enterpriseMapper.findMessageReplyByMid(mid);
		return reply;
	}

	@Override
	public List<Swiper> findSwiperById(int qid) throws Exception {
		System.out.println("......EnterpriseServiceImplement......findSwiperById......");
		List<Swiper> swiper = null;
		
		swiper = enterpriseMapper.findSwiperById(qid);
		return swiper;
	}

	@Override
	public Address findAddressByLid(int lid) throws Exception {
		System.out.println("......EnterpriseServiceImplement......findAddressByLid......");
		Address address = null;
		
		address = enterpriseMapper.findAddressByLid(lid);
		return address;
	}

	@Override
	public void addlike(MessageLike like) throws Exception {
		System.out.println("......EnterpriseServiceImplement......like......");
		
		enterpriseMapper.addlike(like);

	}

	@Override
	public void addcomment(MessageReply comment) throws Exception {
        System.out.println("......EnterpriseServiceImplement......addcomment......");
		
		enterpriseMapper.addcomment(comment);
		
	}
	

}
