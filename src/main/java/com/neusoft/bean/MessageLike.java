package com.neusoft.bean;

import java.sql.Timestamp;

public class MessageLike {
	private int id;
	private int mid;
	private String nickname;
	private Timestamp stime;
	
	public MessageLike() {
		
	}
	
	public MessageLike(int mid, String nickname, Timestamp stime) {
		this.mid = mid;
		this.nickname = nickname;
		this.stime = stime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
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
