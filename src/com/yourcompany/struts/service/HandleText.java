package com.yourcompany.struts.service;

public class HandleText {
	
	public static String handle(String content) {
		if(content.equals("红包"))
			return "程序猿正在开发中……，感谢关注！";
		return content;
	}
	
}
