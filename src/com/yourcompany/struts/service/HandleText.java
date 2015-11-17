package com.yourcompany.struts.service;

import com.yourcompany.struts.business.BaiduTranslateService;

public class HandleText {
	
	public static String handle(String content) {
		if(content.equals("红包"))
			return "程序猿正在开发中……，感谢关注！";
		else if(content.equals("#"))
			return getMenu();
		else if(content.equals("2"))
			return "格式：*+想翻译的内容";
		else if(content.startsWith("*"))
			return resolveTranceLate(content);
		return content;
	}
	
	public static String getMenu(){
		return "-- 指令列表 --\n"
				+ "# 获取菜单 \n"
				+ "1 说话就是第一生产力\n"
				+ "2 翻译 \n"
				+ "请输入对应的编号！";
	}
	
	public static String resolveTranceLate(String content){
		content = content.replace("*", "").trim();
		return BaiduTranslateService.translate(content);
	}
	
}
