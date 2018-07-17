package com.neusoft.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.neusoft.bean.WXOauth2Token;
import com.neusoft.bean.WXUserInfo;

import net.sf.json.JSONObject;



public class Oauth2Access {

	public static WXOauth2Token getOauth2AccessToken(String appID,String appsecret,String code) {
		String urlStr="https://api.weixin.qq.com/sns/oauth2/access_token?appid="+appID+"&secret="+appsecret+"&code="+code+"&grant_type=authorization_code";
		URL url=null;
		
		//返回token对象
		WXOauth2Token wxOauth2Token=null;
		
		HttpURLConnection httpCon = null;
		
		//输入流
		BufferedReader in =null;
		
		//缓冲
		StringBuffer sb = new StringBuffer();
		
		try {
			url=new URL(urlStr);
			in= new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			
			String str = null;
			
			while((str = in.readLine())!=null) {
				sb.append(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null) {
					in.close();
				}
			}catch(IOException e) {
				
			}
		}
		String result = sb.toString();
		
		System.out.println(result);
		
		try {
			List<Object> tokenList=new ArrayList<Object>();
			
			JSONObject jsonObject = JSONObject.fromObject(result);
			Iterator it=jsonObject.keys();
			while(it.hasNext()) {

				tokenList.add(jsonObject.get(it.next()));
				//System.out.println((String)jsonObject.get(it.next()));

			}
		    wxOauth2Token=new WXOauth2Token(tokenList.get(0).toString(),tokenList.get(3).toString());
		}catch(Exception e) {
			
		}
		return wxOauth2Token;
	}
	
	public static WXUserInfo getWXUserInfo(String accessToken,String openId) {
		String urlStr="https://api.weixin.qq.com/sns/userinfo?access_token="+accessToken+"&openid="+openId+"&lang=zh_CN";
		URL url=null;
		
		//返回token对象
		WXUserInfo WXUserInfo=null;
		
		HttpURLConnection httpCon = null;
		
		//输入流
		BufferedReader in =null;
		
		//缓冲
		StringBuffer sb = new StringBuffer();
		
		try {
			url=new URL(urlStr);
			in= new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
			
			String str = null;
			
			while((str = in.readLine())!=null) {
				sb.append(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null) {
					in.close();
				}
			}catch(IOException e) {
				
			}
		}
		String result = sb.toString();
		
		try {
			List<Object> infoList=new ArrayList<Object>();
			JSONObject jsonObject = JSONObject.fromObject(result);
			Iterator it=jsonObject.keys();
			while(it.hasNext()) {
				infoList.add(jsonObject.get(it.next()));
			}
			WXUserInfo=new WXUserInfo(infoList.get(0).toString(),infoList.get(1).toString(),infoList.get(2).toString(),infoList.get(7).toString());
		}catch(Exception e) {
			
		}
		return WXUserInfo;
	}
	
	public static void main(String[] args) {
//		WXOauth2Token wx=getOauth2AccessToken("wx32abea7cb943df3a", "f48b257fea57c89d1755fbd998650804", "0814hl5u0kea4c1wTK3u0hus5u04hl5j");
//	    System.out.println(wx.getAccessToken());
//	    System.out.println(wx.getOpenId());
	    
//	    WXUserInfo ui=getWXUserInfo("11_wgP9cws18wt9nQ7QBeOijgMfEznriIqZmAxCvAaYuC3VI-cxszM9Cde5h1xVQXI8jEUbxeRKZ1yyH91Fzb86-Q","oi6pK1EiQOFpQqvHY_eqcJuj7UBg");
//	    System.out.println(ui.getHeadimgurl());
//	    System.out.println(ui.getOpenid());
	}
	
}