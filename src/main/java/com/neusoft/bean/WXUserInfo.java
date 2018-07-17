package com.neusoft.bean;

public class WXUserInfo {
	private String openid;
	private String nickname;
	private String sex;
	private String language;
	private String city;
	private String province;
	private String headimgurl;
	
	public WXUserInfo() {
		this.openid = null;
		this.nickname = null;
		this.sex = null;
		this.headimgurl = null;
	}
	public WXUserInfo(String openid, String nickname, String sex, String headimgurl) {
		this.openid = openid;
		this.nickname = nickname;
		this.sex = sex;
		this.headimgurl = headimgurl;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	
	

}
