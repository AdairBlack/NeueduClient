package com.neusoft.bean;

import java.sql.Timestamp;

public class MessageReply {
	private Integer id;
	private Integer mid;
	private String content;
	private String nickname;
	private Timestamp stime;
	
	public MessageReply() {
		
	}
	
	public MessageReply(Integer mid, String content, String nickname, Timestamp stime) {
		super();
		this.mid = mid;
		this.content = content;
		this.nickname = nickname;
		this.stime = stime;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Timestamp getStime() {
		return stime;
	}
	public void setStime(Timestamp stime) {
		this.stime = stime;
	}
	

}
