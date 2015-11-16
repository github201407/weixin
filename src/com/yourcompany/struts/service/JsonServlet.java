package com.yourcompany.struts.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsonServlet extends HttpServlet {
	
	private static final long serialVersionUID = 4440739483644821985L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String dataType = request.getParameter("dataType");
		PrintWriter out = response.getWriter();
		String json1 = "{'contacts':[{'number':'123','name':'xiaoxiao','email':'123@qq.com','type':1}," +
                "{'number':'123','name':'xiaoxiao','email':'123@qq.com','type':2}," +
                "{'number':'123','name':'xiaoxiao','email':'123@qq.com','type':3}]}";
//		if(action.equals("download") && dataType.equals("json"))
		out.print(json1 + "\r\n");
		out.flush();
		out.close();
		out = null;
	}
}
