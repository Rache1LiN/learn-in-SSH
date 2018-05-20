<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user_input.jsp' starting page</title>
    
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
    	<h3>添加用户</h3>
    	<div>
    		<div>
    			<span>姓名：</span>
    			<input type="text" name="userName"/>
    		</div>
    		<div>
    			<span>性别：</span>
    			<input type="text" name="userSex"/>
    		</div>
    		<div>
    			<span>电话：</span>
    			<input type="text" name="userPhone"/>
    		</div>
    		<div>
    			<input type="submit" value="提交"/>
    		</div>
    	</div>
    </div>
  </body>
</html>
