package com.neusoft.bean;

public class WXOauth2Token {
	private String accessToken=null;
	private String openId=null;
	
	
	
	public WXOauth2Token(String accessToken, String openId) {
		this.accessToken = accessToken;
		this.openId = openId;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	

}
