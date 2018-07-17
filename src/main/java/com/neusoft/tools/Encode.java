package com.neusoft.tools;

import java.io.UnsupportedEncodingException;

public class Encode {

	public static void main(String[] args) {
		try {
			System.out.println(java.net.URLEncoder.encode("http://www.tainai.ltd/neueduClient/GetCodeServlet","utf-8"));
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
