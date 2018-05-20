<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login_input.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div>
    	<h3>登陆</h3>
    	<div>
    	<form action="Login.action" method="post">
    		<div>
    			<span>用户名：</span>
    			<input type="text" value="${member.userName }" name="userName"/>
    		</div>
    		<div>
    			<span>密码：</span>
    			<input type="text" value="${member.userPass }" name="userPass"/>
    		</div>
    		<div>
    			<input type="submit" value="提交"/>
    		</div>
    	</form>
    	</div>
    </div>
  </body>
</html>
