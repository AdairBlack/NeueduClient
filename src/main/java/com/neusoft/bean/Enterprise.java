package com.neusoft.bean;

/**
 * 参数映射时,不是必须按属性，int -> Integer, long -> Long
 * @author gagai
 *
 */

public class Enterprise {
	private Integer qid;
	private String name;
	private String videopath;
	private String introduction;
	private String jczs;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVideopath() {
		return videopath;
	}
	public void setVideopath(String videopath) {
		this.videopath = videopath;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getJczs() {
		return jczs;
	}
	public void setJczs(String jczs) {
		this.jczs = jczs;
	}
	
	
}
