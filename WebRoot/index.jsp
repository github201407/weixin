<%@ page import="com.yourcompany.struts.main.MenuManager"%>
<%@ page language="java" import="java.util.*,java.net.URL" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	MenuManager mMenuManager = new MenuManager();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Hello World</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css"> 
	-->
	<script>
		function displayDate(str) {
			document.getElementById("demo").innerHTML = str;
		}
	</script>
</head>
  
  <body>
    Hello World <br>
	<%
		out.println("Your IP address is " + request.getRemoteAddr());
	%>
	<p id="demo">点击按钮，添加菜单</p>
	<button type="button" onclick="displayDate('<%= mMenuManager.createMenu() %>')">Create Menu</button>
  </body>
</html>
