<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register_input.jsp' starting page</title>
    
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
    	<h3>注册</h3>
    	<s:form namespace="/register" action="register" method="post">
    	<div>
    		<span>用户ID：</span>
    		<s:textfield name="user.userId" ></s:textfield>
    		<s:fielderror fieldName="user.userId"></s:fielderror>
    	</div>
    	<div>
    		<span>用户名：</span>
			<s:textfield name="user.userName"></s:textfield>
			<s:fielderror fieldName="user.userName"></s:fielderror>
		</div>
    	<div>
    		<span>密码：</span>
			<s:password name="user.userPass"></s:password>
			<s:fielderror fieldName="user.userPass"></s:fielderror>
		</div>
    	<div>
    		<span>再次输入密码：</span>
			<s:password name="rePass" ></s:password>
			<s:fielderror fieldName="rePass"></s:fielderror>
		</div>
    	<div>
    		<span>年龄</span>
			<s:textfield name="user.userAge" ></s:textfield>
			<s:fielderror fieldName="user.userAge"></s:fielderror>
		</div>
    	<div>
			<span>生日</span>
			<s:textfield name="user.userBirth"></s:textfield>
			<s:fielderror fieldName="user.userBirth"></s:fielderror>
		</div>
    	<div>
    		<span>身高</span>
			<s:textfield name="user.userHigh"></s:textfield>
			<s:fielderror fieldName="user.userHigh"></s:fielderror>
		</div>
    	<div>
    		<span>邮箱</span>
			<s:textfield name="user.userMail"></s:textfield>
			<s:fielderror fieldName="user.userMail"></s:fielderror>
		</div>
    	<div>
			<s:submit value="注册"></s:submit>
		</div>
    	</s:form>
    </div>
  </body>
</html>
