package com.neusoft.bean;

import java.sql.Timestamp;

public class Freelistenbook {
	private int id;
	private int fid;
	private String username;
	private String tel;
	private Timestamp booktime;
	private String status;
	private String comment;
	private String openid;
	
	
	
	public Freelistenbook(int fid, String username, String tel, Timestamp booktime, String status, String comment,
			String openid) {
		this.fid = fid;
		this.username = username;
		this.tel = tel;
		this.booktime = booktime;
		this.status = status;
		this.comment = comment;
		this.openid = openid;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Timestamp getBooktime() {
		return booktime;
	}
	public void setBooktime(Timestamp booktime) {
		this.booktime = booktime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}

	
}
